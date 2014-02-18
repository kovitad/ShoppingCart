package com.xmlreader;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import com.kovitad.model.Product;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/*Read an xml file by calling parsexml*/
public class XMLReader {


	private List<Product> list; // The list with the products
	private int numOfProducts;
	private File xmlfile; // The xml file we give as input (products.xml)
	
	public int getNumOfProducts() {
		return numOfProducts;
	}
	public void setNumOfProducts(int numOfProducts) {
		this.numOfProducts = numOfProducts;
	}
	public XMLReader(File xmlfile) {
		this.setXmlfile(xmlfile);
		list = new ArrayList<Product>();
		this.setNumOfProducts(0);
	}
	public List<Product> getList() {
		return list;
	}

	public void setList(List<Product> list) {
		this.list = list;
	}
	public File getXmlfile() {
		return xmlfile;
	}
	public void setXmlfile(File xmlfile) {
		this.xmlfile = xmlfile;
	}
	public List<Product> parsexml() {
		try {

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(getXmlfile());
			doc.getDocumentElement().normalize();

			// System.out.println("Root element :" +
			// doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("product");
			// System.out.println("-----------------------");
			this.setNumOfProducts(nList.getLength());	//numOfProducts becomes the number of products in the xml file
			for (int temp = 0; temp < nList.getLength(); temp++) {

				Node nNode = nList.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					
					Product prod = new Product();
					prod.setId(Integer.valueOf(getTagValue("id", eElement)));
					prod.setImg(getTagValue("photo", eElement));
					prod.setDescription(getTagValue("description", eElement));
					prod.setPrice(Double.parseDouble(getTagValue("price", eElement)));
					list.add(prod);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	private static String getTagValue(String sTag, Element eElement) {
		NodeList nlList = eElement.getElementsByTagName(sTag).item(0)
				.getChildNodes();

		Node nValue = (Node) nlList.item(0);

		return nValue.getNodeValue();
	}

}