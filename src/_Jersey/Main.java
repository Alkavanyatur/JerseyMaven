package _Jersey;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 * check https://stackoverflow.com/questions/17222902/remove-namespace-prefix-while-jaxb-marshalling
 * @author jelorza
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("INICIA");
		try {
			InputStream inStream = new FileInputStream("sampleXML.xml");
					
			JAXBContext jaxbContext;
			jaxbContext = JAXBContext.newInstance(tTicketBai.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			tTicketBai ticketBai = (tTicketBai) jaxbUnmarshaller.unmarshal(inStream);
			
			
			System.out.println("UnMarshaller "+ticketBai.getCabecera().getContents());
			
			JAXBContext jaxbCtx = JAXBContext.newInstance(ticketBai.getClass());
	        Marshaller marshaller = jaxbCtx.createMarshaller();
	        marshaller.setProperty("com.sun.xml.internal.bind.namespacePrefixMapper", new MyNamespaceMapper());
			File file = new File("outXML.xml");
			marshaller.marshal(ticketBai, file);
			System.out.println("Marshaller");
			
			
		} catch (JAXBException e) {
			System.out.println("JAXBException "+e);
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException "+e);
			e.printStackTrace();
		}
		
		System.out.println("FIN");
	}

}
