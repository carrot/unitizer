package com.brandonromano.unitizer.length;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.brandonromano.unitizer.Unit;

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