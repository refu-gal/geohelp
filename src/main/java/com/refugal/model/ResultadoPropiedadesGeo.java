package com.refugal.model;

import java.util.List;

public class ResultadoPropiedadesGeo {
	private String error;
	private List<PropiedadGeo> propiedades;

	public ResultadoPropiedadesGeo(String error, List<PropiedadGeo> propiedades) {
		this.error = error;
		this.propiedades = propiedades;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public List<PropiedadGeo> getPropiedades() {
		return propiedades;
	}

	public void setPropiedades(List<PropiedadGeo> propiedades) {
		this.propiedades = propiedades;
	}
}
