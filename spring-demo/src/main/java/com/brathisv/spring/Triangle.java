package com.brathisv.spring;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean {

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

	// bean init will be called after initializingBean is called : step 5
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
			System.out.println(key + ", " + value);
		});
		System.out.println(getType() + " triangle is drawn with :: " + point1 + point2 + point3);
	}

	// Constructor will be called after normal initialization :: Step 3
	public Triangle() {
		System.out.println("This is constructor");
	}

	// called at very first :: step 1
	static {
		System.out.println("This is static block");
	}

	// All normal block will execute after static block :: step 2
	{
		System.out.println("This is normal block");
	}

	{
		System.out.println("This is normal block 2");
	}

	/**
	 * This is the first method to call when initialized after constructor :: Step 4
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing Bean is called");
	}

	public void initialize() {
		System.out.println("global init");
	}
}
