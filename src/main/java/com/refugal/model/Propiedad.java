package com.refugal.model;

public class Propiedad {
	private String propietario;
	private String lugar;
	private Integer superficie;
	private String descripcion;

	public Propiedad() {
	}

	public Propiedad(String propietario, String lugar, Integer superficie, String descripcion) {
		this.propietario = propietario;
		this.lugar = lugar;
		this.superficie = superficie;
		this.descripcion = descripcion;
	}

	public Integer getSuperficie() {
		return superficie;
	}

	public void setSuperficie(Integer superficie) {
		this.superficie = superficie;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
}
