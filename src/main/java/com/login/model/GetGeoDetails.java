package com.login.model;

public class GetGeoDetails {

	private int id;
	private String lat;
	private String lng;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GetGeoDetails(int id, String lat, String lng, String name) {
		super();
		this.id = id;
		this.lat = lat;
		this.lng = lng;
		this.name = name;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

}
