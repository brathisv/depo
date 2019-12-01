package com.brathisv.learning;

import java.util.HashMap;
import java.util.Map;

public class HashmapTest {

	public static void main(String[] args) {
		Map<Hash, String> map = new HashMap<>();
		map.put(new Hash("one"), "one");
		map.put(new Hash("two"), "one");
		map.put(new Hash("three"), "one");
		map.put(new Hash("four"), "one");
		map.put(new Hash("abc"), "one");
		map.put(new Hash("cba"), "one");
		map.put(new Hash("seven"), "one");
		map.put(new Hash("eight"), "one");
		map.put(new Hash("nine"), "one");
		map.put(new Hash("ten"), "one");
		map.put(new Hash("eleven"), "one");
		map.put(new Hash("twelve"), "one");
		map.put(new Hash("thirteen"), "one");
		
		System.out.println(map);
	}

}
