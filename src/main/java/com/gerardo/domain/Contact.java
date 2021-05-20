package com.gerardo.domain;

public class Contact {
	
  private String nombre;
	private String apellido;
	private String edad;
	private String direccion;
	private String sexo;
	
	 public Contact(String nombre, String apellido, String edad, String direccion, String sexo) {
	    super();
	    this.nombre = nombre;
	    this.apellido = apellido;
	    this.edad = edad;
	    this.direccion = direccion;
	    this.sexo = sexo;
	  }

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
