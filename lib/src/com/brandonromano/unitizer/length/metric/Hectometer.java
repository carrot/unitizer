package com.brandonromano.unitizer.length.metric;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.brandonromano.unitizer.length.Length;

public class Hectometer extends Length{

	/* ========== Constructors ========== */
	public Hectometer(BigDecimal numUnits) { super(numUnits); }
	public Hectometer(BigInteger numUnits) { super(numUnits); }
	public Hectometer(String numUnits) { super(numUnits); }
	public Hectometer(double numUnits) { super(numUnits); }
	public Hectometer(int numUnits) { super(numUnits); }
	public Hectometer(long numUnits) { super(numUnits); }
	public Hectometer(Length length){ super(length); }
	
	/* ========== Overridden ========== */
	public static final double RELATIVE_TO_METER = 100;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_METER);
	}
	
}