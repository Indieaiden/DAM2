import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

public class ficheroXML {

	private int partidasGanadas=0, partidasPerdidas=0;
	
	public void ahorcado(String fuente) {
		
		Document document;
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
		  	document = builder.parse(new File("D:\\Repo2DAM\\DAM2\\Diana\\AccesoADatos\\AhorcadoDiana\\palabras.xml"));   //cargar el xml
		  	
		  	NodeList lista = document.getChildNodes();
		  	Node raiz = lista.item(0);  			//elemento raiz 'palabras'
		  	NodeList hijos = raiz.getChildNodes(); //nodos 'palabra'
		  	
		  	recursivo(fuente, hijos);
		
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void recursivo(String fuente, NodeList hijos) {
		
		for(int i=0;i<hijos.getLength();i++) {
	  		Node hijo = hijos.item(i);
	  		if(hijo.getNodeType() == Node.ELEMENT_NODE) {   //coger los hijos que sean elementos
	  			Element palabra = (Element)hijo;
	  			
	  			String palabrita = palabra.getTextContent();
	  			
	  			Juego juego = new Juego();
				juego.juego(fuente, palabrita, partidasGanadas, partidasPerdidas);
				
			  	
	  		}
	  	}

		System.out.println("Se han terminado las palabras. A partir de aquí se vuelve a empezar desde la primera.");
		recursivo(fuente, hijos); //volvemos a llamar al metodo 
	}
}
