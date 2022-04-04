package _Jersey;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

/**
 * 
 * @author jelorza
 */
@XmlRootElement(name = "Cabecera")
public class Cabecera  implements Serializable{
	
	
	private static final long serialVersionUID = 1725559117845439370L;
	private String contents = new String();
	
	@XmlValue
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}

}
