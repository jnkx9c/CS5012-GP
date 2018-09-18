package edu.umsl.cs5012.groupproject;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class GroupprojectApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	
	@Test
	public void testMyRepository() {
		String name="Jeff";
		Assert.assertEquals("Jeff", name);
		
		Assert.assertNull(name);
		
	}
	

}
