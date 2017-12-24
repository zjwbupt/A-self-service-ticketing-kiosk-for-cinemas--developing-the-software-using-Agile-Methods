import static org.junit.Assert.*;

import org.junit.Test;


/*************************************************************************
> File Name: The JUnit function for test.
> Author: group 18
> Mail: 
> Created Time: 2017.03.27 Mon
> Description: 
************************************************************************/


public class TestFilm  {

	public static Film film = new Film("film name","time","screen");
	
	@Test
	public void testGetName() {
		assertEquals("film name",film.getName());
	}
	@Test
	public void testGetTime() {
		assertEquals("time",film.getTime());
	}
	@Test
	public void testScreenGet() {
		assertEquals("screen",film.getScreen());
	}
	
	
	@Test
	public void testSetName() {
		film.setName("BEAUTY AND THE BEAST");
		assertEquals("BEAUTY AND THE BEAST",film.getName());
	}
	@Test
	public void testSetTime() {
		film.setTime("12:30");
		assertEquals("12:30",film.getTime());
	}
	@Test
	public void testScreenSet() {
		film.setScreen("screen1");
		assertEquals("screen1",film.getScreen());
	}
}
