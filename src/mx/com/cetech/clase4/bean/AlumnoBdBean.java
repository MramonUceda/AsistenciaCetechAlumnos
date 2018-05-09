package mx.com.cetech.clase4.bean;

import java.io.Serializable;


public class AlumnoBdBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8319680409207991981L;
	
	private int idUsuario;
	
	public AlumnoBdBean() {
		super();
	}

	public AlumnoBdBean(int idUsuario) {
		super();
		this.idUsuario = idUsuario;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	
	
	
	
	
	
	


}
