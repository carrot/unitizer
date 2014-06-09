package com.brandonromano.unitizer.time;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.brandonromano.unitizer.Unit;

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