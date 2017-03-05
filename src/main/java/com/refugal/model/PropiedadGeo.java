package com.refugal.model;

public class PropiedadGeo {
	private String propietario;
	private String lugar;
	private Integer superficie;
	private String descripcion;
	private Double latitude;
	private Double longitude;
	private String imageUrl;

	public static PropiedadGeo create(Propiedad propiedad, Double latitude, Double longitude, String imageUrl) {
		PropiedadGeo propiedadGeo = new PropiedadGeo();
		propiedadGeo.setPropietario(propiedad.getPropietario());
		propiedadGeo.setLugar(propiedad.getLugar());
		propiedadGeo.setSuperficie(propiedad.getSuperficie());
		propiedadGeo.setDescripcion(propiedad.getDescripcion());
		propiedadGeo.setLatitude(latitude);
		propiedadGeo.setLongitude(longitude);
		propiedadGeo.setImageUrl(imageUrl);

		return propiedadGeo;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
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
