package com.brandonromano.unitizer.length.metric;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.brandonromano.unitizer.length.Length;

public class Meter extends Length{

	/* ========== Constructors ========== */
	public Meter(BigDecimal numUnits) { super(numUnits); }
	public Meter(BigInteger numUnits) { super(numUnits); }
	public Meter(String numUnits) { super(numUnits); }
	public Meter(double numUnits) { super(numUnits); }
	public Meter(int numUnits) { super(numUnits); }
	public Meter(long numUnits) { super(numUnits); }
	public Meter(Length length){ super(length); }
	
	/* ========== Overridden ========== */
	public static final double RELATIVE_TO_METER = 1;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_METER);
	}
	
}