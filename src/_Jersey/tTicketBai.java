
package _Jersey;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
/**
 * 
 * @author jelorza
 */
@XmlRootElement(name = "TicketBai")
public class tTicketBai {
	
	private Cabecera cabecera = new Cabecera();

	@XmlElement(name = "Cabecera", namespace = "", required = false)
	public Cabecera getCabecera() {
		return cabecera;
	}

	public void setCabecera(Cabecera cabecera) {
		this.cabecera = cabecera;
	}
	
	

}
