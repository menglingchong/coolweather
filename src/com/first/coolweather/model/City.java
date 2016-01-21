package com.first.coolweather.model;

public class City {
	private int id;
	private String cityName;
	private String cityNode;
	private int provinceId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCityNode() {
		return cityNode;
	}

	public void setCityNode(String cityNode) {
		this.cityNode = cityNode;
	}

	public int getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(int provinceId) {
		this.provinceId = provinceId;
	}

}
