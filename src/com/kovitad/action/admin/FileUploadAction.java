package com.kovitad.action.admin;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLConnection;
import java.util.List;

import javax.activation.MimetypesFileTypeMap;
import javax.annotation.Resource;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.kovitad.action.BaseApplicationAction;
import com.kovitad.dao.ProductDao;
import com.kovitad.domain.Product;
import com.kovitad.utils.Base64Coder;

@Component
public class FileUploadAction extends BaseApplicationAction {

	public static final  Logger logger = Logger.getLogger(FileUploadAction.class);
	
	@Resource
	private ProductDao productDao;
	
	private static final long serialVersionUID = -4362076532842793565L;

	private String userImageFileName;
	
	private String userImageContentType;

	private List<Product> products;
	
	
	private File userImage;

	public File getUserImage() {
		return userImage;
	}
	public void setUserImage(File userImage) {
		this.userImage = userImage;
	}
	@Override
	public void prepare() throws Exception {

	}
	public String execute() throws IOException {

		logger.info("file name:"+this.userImageFileName);
		logger.info("file type:"+this.userImageContentType);
		byte[] fileContent = FileUtils.readFileToByteArray(userImage);
		String base64Content = encodeArray(fileContent);
		logger.info("String encoder:"+base64Content);
		Product product = new Product();
		product.setImage(base64Content.getBytes());
		product.setName(this.userImageFileName);
		product.setImageType(this.userImageContentType);
		productDao.save(product);
		
		return "success";
	}

	public String listProducts() throws Exception {
		this.products = productDao.queryAllProduct();
		return "success";
	}
	
	
	public static String getContentType(String filename) {
		String g = URLConnection.guessContentTypeFromName(filename);
		if (g == null) {
			g = MimetypesFileTypeMap.getDefaultFileTypeMap().getContentType(
					filename);
		}
		return g;
	}
	
	public String getUserImageFileName() {
		return userImageFileName;
	}
	public void setUserImageFileName(String userImageFileName) {
		this.userImageFileName = userImageFileName;
	}
	public String getUserImageContentType() {
		return userImageContentType;
	}
	public void setUserImageContentType(String userImageContentType) {
		this.userImageContentType = userImageContentType;
	}
	
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	private static void encodeFile(File inputFile, File outputFile)
			throws IOException {
		BufferedInputStream in = null;
		BufferedWriter out = null;
		try {
			in = new BufferedInputStream(new FileInputStream(inputFile));
			out = new BufferedWriter(new FileWriter(outputFile));
			encodeStream(in, out);
			out.flush();
		} finally {
			if (in != null)
				in.close();
			if (out != null)
				out.close();
		}
	}

	private static void encodeStream(InputStream in, BufferedWriter out) throws IOException {
		  int lineLength = 72;
		  byte[] buf = new byte[lineLength / 4 * 3];
		  while (true) {
		   int len = in.read(buf);
		   if (len <= 0)
		    break;
		   out.write(Base64Coder.encode(buf, 0, len));
		   out.newLine();
		  }
		 }

	static String encodeArray(byte[] in) throws IOException {
		StringBuffer out = new StringBuffer();
		out.append(Base64Coder.encode(in, 0, in.length));
		return out.toString();
	}

	static byte[] decodeArray(String in) throws IOException {
		byte[] buf = Base64Coder.decodeLines(in);
		return buf;
	}

	private static void decodeFile(File inputFile, File outputFile)
			throws IOException {
		BufferedReader in = null;
		BufferedOutputStream out = null;
		try {
			in = new BufferedReader(new FileReader(inputFile));
			out = new BufferedOutputStream(new FileOutputStream(outputFile));
			decodeStream(in, out);
			out.flush();
		} finally {
			if (in != null)
				in.close();
			if (out != null)
				out.close();
		}
	}

	private static void decodeStream(BufferedReader in, OutputStream out)
			throws IOException {
		while (true) {
			String s = in.readLine();
			if (s == null)
				break;
			byte[] buf = Base64Coder.decodeLines(s);
			out.write(buf);
		}
	}

}
