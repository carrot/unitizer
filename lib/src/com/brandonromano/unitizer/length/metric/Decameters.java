package com.brandonromano.unitizer.length.metric;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.brandonromano.unitizer.length.Length;

public class Decameters extends Length {
	
	/* ========== Constructors ========== */
	public Decameters(BigDecimal numUnits) { super(numUnits); }
	public Decameters(BigInteger numUnits) { super(numUnits); }
	public Decameters(String numUnits) { super(numUnits); }
	public Decameters(double numUnits) { super(numUnits); }
	public Decameters(int numUnits) { super(numUnits); }
	public Decameters(long numUnits) { super(numUnits); }
	public Decameters(Length length){ super(length); }
	
	/* ========== Overridden ========== */
	public static final double RELATIVE_TO_METER = 10;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_METER);
	}

}