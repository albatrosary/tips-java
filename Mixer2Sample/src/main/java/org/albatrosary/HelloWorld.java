package org.albatrosary;

import java.io.File;

import org.mixer2.Mixer2Engine;
import org.mixer2.jaxb.xhtml.Div;
import org.mixer2.jaxb.xhtml.Html;

public class HelloWorld {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
        Mixer2Engine m2e = new Mixer2Engine();
        File file = null;
        Html html = m2e.loadHtmlTemplate(file);
        
        html.getById("hellomsg",Div.class).getContent().clear();
        html.getById("hellomsg",Div.class).getContent().add("Hello World !");
        System.out.println(m2e.saveToString(html));
	}

}
