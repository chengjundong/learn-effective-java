package jd.cheng;

import java.util.HashMap;

import org.junit.Test;

public class FunctionReferenceTest {

	@Test
	public void test() {
		HashMap<String,Integer> map = new HashMap<>();
		
		map.put("hello", 1);
		
		map.merge("hello", 1, Integer::sum);
		map.merge("world", 1, Integer::sum);
		
		System.out.println(map.get("hello"));
		System.out.println(map.get("world"));
	}
}
