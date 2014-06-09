package com.brandonromano.unitizer.length.metric;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.brandonromano.unitizer.length.Length;

public class Kilometer extends Length{
	
	/* ========== Constructors ========== */
	public Kilometer(BigDecimal numUnits) { super(numUnits); }
	public Kilometer(BigInteger numUnits) { super(numUnits); }
	public Kilometer(String numUnits) { super(numUnits); }
	public Kilometer(double numUnits) { super(numUnits); }
	public Kilometer(int numUnits) { super(numUnits); }
	public Kilometer(long numUnits) { super(numUnits); }
	public Kilometer(Length length){ super(length); }
	
	/* ========== Overridden ========== */
	public static final double RELATIVE_TO_METER = 1000;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_METER);
	}

}