package pe.com.vical.examplevaadin.util;

import com.vaadin.ui.Upload.Receiver;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

public class AdjuntarReceiver implements Receiver {
	private static final long serialVersionUID = -7440281447520552760L;

	private String fileName;
	private String mtype;
	private ByteArrayOutputStream outputStream;
	public String nombreNuevo;

	@Override
	public OutputStream receiveUpload(String filename, String mimeType) {
		fileName = filename;
		mtype = mimeType;
		outputStream = new ByteArrayOutputStream();
		return outputStream;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getMtype() {
		return mtype;
	}

	public void setMtype(String mtype) {
		this.mtype = mtype;
	}

	public ByteArrayOutputStream getOutputStream() {
		return outputStream;
	}

	public void setOutputStream(ByteArrayOutputStream outputStream) {
		this.outputStream = outputStream;
	}
	public String getNombreNuevo() {
		return nombreNuevo;
	}
	public void setNombreNuevo(String nombreNuevo) {
		this.nombreNuevo = nombreNuevo;
	}
}
