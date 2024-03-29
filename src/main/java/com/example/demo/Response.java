package com.example.demo;
import java.util.*;
import lombok.Data;
import lombok.NoArgsConstructor;

 

@Data
@NoArgsConstructor
public class Response {
	
	private Map<String, String> coord;
    private List<Map<String, String>> weather;
    private String base;
    private Map<String, String> main;
    private Map<String, String> wind;
    private Map<String, String> clouds;
    private String dt;
    private Map<String, String> sys;
    private String id;
    private String name;
    private String cod;
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}
	
	public String getName(){
		return name;
	}

	public Map<String, String> getCoord() {
		return coord;
	}

	public void setCoord(Map<String, String> coord) {
		this.coord = coord;
	}

	public List<Map<String, String>> getWeather() {
		return weather;
	}

	public void setWeather(List<Map<String, String>> weather) {
		this.weather = weather;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public Map<String, String> getMain() {
		return main;
	}

	public void setMain(Map<String, String> main) {
		this.main = main;
	}

	public Map<String, String> getWind() {
		return wind;
	}

	public void setWind(Map<String, String> wind) {
		this.wind = wind;
	}

	public Map<String, String> getClouds() {
		return clouds;
	}

	public void setClouds(Map<String, String> clouds) {
		this.clouds = clouds;
	}

	public String getDt() {
		return dt;
	}

	public void setDt(String dt) {
		this.dt = dt;
	}

	public Map<String, String> getSys() {
		return sys;
	}

	public void setSys(Map<String, String> sys) {
		this.sys = sys;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}
}