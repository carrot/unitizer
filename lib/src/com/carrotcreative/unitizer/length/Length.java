package com.carrotcreative.unitizer.length;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.carrotcreative.unitizer.Unit;

/**
 * Units found from:
 * http://en.wikipedia.org/wiki/Imperial_unit
 * http://en.wikipedia.org/wiki/Unit_of_length
 */
public abstract class Length extends Unit{
	
	/* ========== Constructors ========== */
	public Length(BigDecimal numUnits) { super(numUnits); }
	public Length(BigInteger numUnits) { super(numUnits); }
	public Length(String numUnits) { super(numUnits); }
	public Length(double numUnits) { super(numUnits); }
	public Length(int numUnits) { super(numUnits); }
	public Length(long numUnits) { super(numUnits); }
	public Length(Length length){ super(length); }
	
}