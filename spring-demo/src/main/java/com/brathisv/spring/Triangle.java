package com.brathisv.spring;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Triangle {

	private String type;
	
	private Point point1;
	private Point point2;
	private Point point3;
	private List<String> lists;
	private Set<String> sets;
	private Map<String, Integer> maps;
	
	public List<String> getLists() {
		return lists;
	}

	public void setLists(List<String> lists) {
		this.lists = lists;
	}

	public Set<String> getSets() {
		return sets;
	}

	public void setSets(Set<String> sets) {
		this.sets = sets;
	}

	public Map<String, Integer> getMaps() {
		return maps;
	}

	public void setMaps(Map<String, Integer> maps) {
		this.maps = maps;
	}

	public void init() {
		System.out.println("initialize");
	}
	
	public void destroy() {
		System.out.println("Destroy");
	}
	
	public String getType() {
		return type;
	}

	public Point getPoint1() {
		return point1;
	}

	public void setPoint1(Point point1) {
		this.point1 = point1;
	}

	public Point getPoint2() {
		return point2;
	}

	public void setPoint2(Point point2) {
		this.point2 = point2;
	}

	public Point getPoint3() {
		return point3;
	}

	public void setPoint3(Point point3) {
		this.point3 = point3;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void draw() {
		lists.forEach(s -> System.out.println(s));
		System.out.println("Set");
		sets.forEach(s -> System.out.println(s));
		System.out.println("Map");
		maps.forEach((key, value) -> {
			System.out.println(key + ", "+ value);
		}); 
		System.out.println(getType() + " triangle is drawn with :: "+ point1 + point2 + point3);
	}
}
