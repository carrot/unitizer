package com.carrotcreative.unitizer.test;

import junit.framework.TestCase;

import org.junit.Test;

import com.carrotcreative.unitizer.length.imperical.Chains;
import com.carrotcreative.unitizer.length.imperical.Feet;
import com.carrotcreative.unitizer.length.imperical.Furlongs;
import com.carrotcreative.unitizer.length.imperical.Inches;
import com.carrotcreative.unitizer.length.imperical.Leagues;
import com.carrotcreative.unitizer.length.imperical.Miles;
import com.carrotcreative.unitizer.length.imperical.Thou;
import com.carrotcreative.unitizer.length.imperical.Yards;
import com.carrotcreative.unitizer.length.maritime.NauticalMiles;
import com.carrotcreative.unitizer.length.metric.Meters;
import com.carrotcreative.unitizer.time.Milliseconds;
import com.carrotcreative.unitizer.time.Minutes;
import com.carrotcreative.unitizer.time.Seconds;
import com.carrotcreative.unitizer.time.Weeks;
import com.carrotcreative.unitizer.time.Year;

public class UnitizerTest extends TestCase{

	@Test
	public void testLength() 
	{	
		//Inches
		Inches inches = new Inches(new Feet("100"));
		assertEquals("1200", inches.toRoundedString());
		
		//Feet
		Feet feet = new Feet(new Chains(2));
		assertEquals("132", feet.toRoundedString());
		
		//Chains
		Chains chains = new Chains(new Feet(1810));
		assertEquals("27", chains.toRoundedString());
		
		//Furlongs
		Furlongs furlongs = new Furlongs(new Feet(182018));
		assertTrue(furlongs.toString().startsWith("275.78"));
		
		//Leagues
		Leagues leagues = new Leagues(new Yards(1290000));
		assertTrue(leagues.toString().startsWith("244.318"));
		
		//Meters
		Meters meters = new Meters(new Meters(4828));
		assertEquals("4828", meters.toRoundedString());
		
		//Thou
		Thou thou = new Thou(new Meters(2));
		assertEquals("78740", thou.toRoundedString());

		//NauticalMiles
		NauticalMiles nauticalMiles = new NauticalMiles(new Miles(12));
		assertTrue(nauticalMiles.toString().startsWith("10.42"));
	}
	
	@Test
	public void testTime()
	{
		// Millis
		Milliseconds milliseconds = new Milliseconds(new Minutes(1));
		assertEquals(60000, milliseconds.toRoundedLong());
		
		//Weeks
		Weeks weeks = new Weeks(new Year(1));
		assertEquals("52", weeks.toRoundedString());
		
		Seconds second = new Seconds(new Seconds(1));
		assertEquals("1", second.toRoundedString());
		
	}

}