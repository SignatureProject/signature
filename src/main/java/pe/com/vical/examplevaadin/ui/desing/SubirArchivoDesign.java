package pe.com.vical.examplevaadin.ui.desing;

import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

@DesignRoot
@SuppressWarnings("serial")
public class SubirArchivoDesign extends CssLayout {
	
	protected VerticalLayout lytContenido;
	
	public SubirArchivoDesign() {
		Design.read(this);
	}

}