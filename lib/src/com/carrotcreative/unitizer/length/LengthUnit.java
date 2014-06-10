package com.carrotcreative.unitizer.length;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.carrotcreative.unitizer.Unit;

/**
 * Units found from:
 * http://en.wikipedia.org/wiki/Imperial_unit
 * http://en.wikipedia.org/wiki/Unit_of_length
 */
public abstract class LengthUnit extends Unit{
	
	/* ========== Constructors ========== */
	public LengthUnit(BigDecimal numUnits) { super(numUnits); }
	public LengthUnit(BigInteger numUnits) { super(numUnits); }
	public LengthUnit(String numUnits) { super(numUnits); }
	public LengthUnit(double numUnits) { super(numUnits); }
	public LengthUnit(int numUnits) { super(numUnits); }
	public LengthUnit(long numUnits) { super(numUnits); }
	public LengthUnit(LengthUnit length){ super(length); }
	
}