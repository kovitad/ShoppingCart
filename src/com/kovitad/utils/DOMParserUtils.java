package com.kovitad.utils;

import java.io.IOException;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import com.kovitad.domain.Product;
import com.kovitad.model.Customer;

public class DOMParserUtils {
	public static void main(String argv[]) throws JAXBException {
//		if (argv.length != 1) {
//			System.err.println("Usage: java DOMEcho filename");
//			System.exit(1);
//		}

		// Get the factory
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		// optional steps to force DTD checking and namespace support
		// factory.setValidating(true);
		// factory.setNamespaceAware(true);

		try {
			// Create a DOM-building parser
			DocumentBuilder builder = factory.newDocumentBuilder();

			// Parse and return the content of the XML file into a Document
			// instance.
			
			Document document = builder.parse(new URL("http://localhost:8080/shoppingcart/services/productListing").openStream());

			// Echo nodes starting from the root element
			echoNode(document.getDocumentElement());

		} catch (SAXException se) {
			// Error generated during parsing
			se.printStackTrace();
		} catch (ParserConfigurationException pce) {
			// Parser with specified options can't be built
			pce.printStackTrace();
		} catch (IOException ioe) {
			// I/O error
			ioe.printStackTrace();
		}
		testParseXMLStream("");
	}

	/** Recursive implementation of traversing the DOM tree and printing nodes. */
	public static void echoNode(Node aNode) {
		short nodeType = aNode.getNodeType();

		if (nodeType == Node.ELEMENT_NODE) {
			// Element node: safe downcast and process
			Element element = (Element) aNode;

			// Always print <element
			// closing depends on children presence
			print("<" + element.getNodeName() + " ");

			// Print attributes if any
			NamedNodeMap attributeMap = element.getAttributes();
			for (int i = 0; i < attributeMap.getLength(); i++) {
				Attr attr = (Attr) attributeMap.item(i);

				// Print name="value" string
				print(attr.getName() + "=\"" + attr.getValue() + "\" ");
			}

			if (element.hasChildNodes()) {
				// Children: open element
				println(">");

				// Process children recursively
				for (int i = 0; i < element.getChildNodes().getLength(); i++) {
					echoNode(element.getChildNodes().item(i));
				}

				// Children: closing tag
				println("</" + element.getNodeName() + ">");
			} else {
				// No children: close element
				println("/>");
			}

		} else if (nodeType == Node.TEXT_NODE) {
			// Text node: just echo
			println(aNode.getNodeValue());
		} else {
			// ignore others like comments for now
		}

	}

	/** Basic print method to save typing. */
	public static void println(String s) {
		System.out.println(s);
	}

	/** Basic print method to save typing. */
	public static void print(String s) {
		System.out.print(s);
	}
	
	public static void testParseXMLStream(final String xmlStr) throws JAXBException {
		Customer test = new Customer();
		JAXBContext jc = JAXBContext.newInstance(Customer.class);
		Marshaller  mar = jc.createMarshaller();
		mar.marshal(test, System.out);
		
	}
	
}
