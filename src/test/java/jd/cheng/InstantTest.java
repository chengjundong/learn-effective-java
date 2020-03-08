package jd.cheng;

import java.time.Instant;

import org.junit.Test;

/**
 * 
 * @impleSpec aa
 */
public class InstantTest {
	
	@Test
	public void test() {
		Instant now = Instant.now();
		
		System.out.println(now);
	}
}
