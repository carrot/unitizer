package com.brandonromano.unitizer.length.metric;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.brandonromano.unitizer.length.Length;

public class Kilometers extends Length{
	
	/* ========== Constructors ========== */
	public Kilometers(BigDecimal numUnits) { super(numUnits); }
	public Kilometers(BigInteger numUnits) { super(numUnits); }
	public Kilometers(String numUnits) { super(numUnits); }
	public Kilometers(double numUnits) { super(numUnits); }
	public Kilometers(int numUnits) { super(numUnits); }
	public Kilometers(long numUnits) { super(numUnits); }
	public Kilometers(Length length){ super(length); }
	
	/* ========== Overridden ========== */
	public static final double RELATIVE_TO_METER = 1000;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_METER);
	}

}