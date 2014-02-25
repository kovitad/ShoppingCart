package com.kovitad.services;

import java.io.ByteArrayInputStream;
import java.util.List;

import javax.annotation.Resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.impl.builder.StAXBuilder;
import org.apache.axiom.om.impl.builder.StAXOMBuilder;
import org.apache.axiom.om.xpath.AXIOMXPath;
import org.apache.log4j.Logger;
import org.jaxen.JaxenException;
import org.springframework.stereotype.Component;

import com.kovitad.dao.ProductDao;
import com.kovitad.domain.Product;

@Path("/productListing")
@Component(value = "productClass")
public class ProductServiceImpl implements ProductService {
	Logger logger = Logger.getLogger(ProductServiceImpl.class);
	@Resource
	private ProductDao productDao;

	@Override
	public List<Product> listAll() {
		if (productDao != null) {
			logger.info("Query product");
			return productDao.queryAllProduct();
		} else {
			return null;
		}
	}

	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> test() {
		List<Product> test = productDao.queryAllProduct();
		return test;
	}

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Product> test2() {
		List<Product> test = productDao.queryAllProduct();
		return test;
	}

	@PUT
	@Consumes
	public Product getProduct(@QueryParam("productId") int minyear) {
		return null;
	}

	public OMElement getAXIOMObject(OMElement e) throws XMLStreamException, JaxenException {
		String xmlString = "<book>" + "<name>Qucik-start Axis</name>"
				+ "<isbn>978-1-84719-286-8</isbn>" + "</book>";
		ByteArrayInputStream xmlStream = new ByteArrayInputStream(
				xmlString.getBytes());
		// create a builder. Since you want the XML as a plain XML, you can
		// just use
		// the plain OMBuilder
		StAXBuilder builder = new StAXOMBuilder(xmlStream);
		// return the root element.
		OMElement root = builder.getDocumentElement();
		
		//use xpath to find out some element
		AXIOMXPath xpath = new AXIOMXPath("/book/isbn[1]");
		OMElement selectedNode = (OMElement) xpath.selectSingleNode(root);
		return selectedNode;
	}
	


}
