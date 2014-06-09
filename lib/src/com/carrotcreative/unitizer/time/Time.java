package com.carrotcreative.unitizer.time;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.carrotcreative.unitizer.Unit;

/**
 * Units found from:
 * http://en.wikipedia.org/wiki/Unit_of_time
 */
public abstract class Time extends Unit{

	/* ========== Constructors ========== */
	public Time(BigDecimal numUnits) { super(numUnits); }
	public Time(BigInteger numUnits) { super(numUnits); }
	public Time(String numUnits) { super(numUnits); }
	public Time(double numUnits) { super(numUnits); }
	public Time(int numUnits) { super(numUnits); }
	public Time(long numUnits) { super(numUnits); }
	public Time(Time time){ super(time); }
	
}