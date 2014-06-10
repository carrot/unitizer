package com.carrotcreative.unitizer.time;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.carrotcreative.unitizer.Unit;

/**
 * Units found from:
 * http://en.wikipedia.org/wiki/Unit_of_time
 */
public abstract class TimeUnit extends Unit{

	/* ========== Constructors ========== */
	public TimeUnit(BigDecimal numUnits) { super(numUnits); }
	public TimeUnit(BigInteger numUnits) { super(numUnits); }
	public TimeUnit(String numUnits) { super(numUnits); }
	public TimeUnit(double numUnits) { super(numUnits); }
	public TimeUnit(int numUnits) { super(numUnits); }
	public TimeUnit(long numUnits) { super(numUnits); }
	public TimeUnit(TimeUnit time){ super(time); }
	
}