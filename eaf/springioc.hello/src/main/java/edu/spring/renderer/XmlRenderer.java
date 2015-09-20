package edu.spring.renderer;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import edu.spring.messageProvider.MessageProvider;

public class XmlRenderer implements Renderer {

	private MessageProvider p;

	// http://www.mkyong.com/java/how-to-create-xml-file-in-java-dom/
	public void render() {
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.newDocument();
			
			
			Element rootElement = doc.createElement("Message");
			rootElement.appendChild(doc.createTextNode(p.getMessage()));
			doc.appendChild(rootElement);
			
			
			TransformerFactory transformerFactoy = TransformerFactory.newInstance();
			Transformer transformer = transformerFactoy.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("C:\\temp\\renderer.xml"));
			
			transformer.transform(source, result);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	public void setMessageProvider(MessageProvider p) {
		this.p = p;
	}

}
