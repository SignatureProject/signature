package pe.com.vical.examplevaadin.ui.presenter;

import org.apache.commons.lang3.StringUtils;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Upload;
import com.vaadin.ui.Upload.SucceededEvent;
import com.vaadin.ui.Upload.SucceededListener;

import pe.com.vical.examplevaadin.ui.desing.SubirArchivoDesign;
import pe.com.vical.examplevaadin.util.AdjuntarReceiver;

public class SubirArchivoPresenter extends SubirArchivoDesign implements SucceededListener {
	
	private static final long serialVersionUID = -4716560651335968596L;

	private AdjuntarReceiver receiver;
	private Label lblFileName;
	
	public SubirArchivoPresenter() {
		super();
		cargarFormulario();
	}

	private void cargarFormulario() {
		receiver = new AdjuntarReceiver();
		lytContenido.addComponent(construirUpload());
	}
	
	private HorizontalLayout construirUpload() {
		final HorizontalLayout horizontalLayout = new HorizontalLayout();
		horizontalLayout.setImmediate(false);
		horizontalLayout.setWidth("-1px");
		horizontalLayout.setHeight("-1px");
		horizontalLayout.setMargin(false);
		horizontalLayout.setSpacing(true);

		lblFileName = new Label();
		lblFileName.setImmediate(false);
		lblFileName.setWidth("100%");
		lblFileName.setHeight("-1px");
		lblFileName.setValue("Sin archivo");

		final Upload upArchivo = new Upload(null, receiver);
		upArchivo.setImmediate(true);
		upArchivo.setButtonCaption("Seleccionar archivo");
		upArchivo.addSucceededListener(this);
		
		horizontalLayout.addComponent(upArchivo);
		horizontalLayout.addComponent(lblFileName);
		horizontalLayout.setComponentAlignment(lblFileName, new Alignment(10));
		return horizontalLayout;
	}

	@Override
	public void uploadSucceeded(SucceededEvent event) {
		procesarCarga(event);
	}

	private void procesarCarga(SucceededEvent event) {
		if(StringUtils.isNotBlank(receiver.getFileName())) {
			lblFileName.setValue(receiver.getFileName());
		}
	}

}
