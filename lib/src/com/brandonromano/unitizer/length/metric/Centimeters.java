package com.brandonromano.unitizer.length.metric;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.brandonromano.unitizer.length.Length;

public class Centimeters extends Length{

	/* ========== Constructors ========== */
	public Centimeters(BigDecimal numUnits) { super(numUnits); }
	public Centimeters(BigInteger numUnits) { super(numUnits); }
	public Centimeters(String numUnits) { super(numUnits); }
	public Centimeters(double numUnits) { super(numUnits); }
	public Centimeters(int numUnits) { super(numUnits); }
	public Centimeters(long numUnits) { super(numUnits); }
	public Centimeters(Length length){ super(length); }
	
	/* ========== Overridden ========== */
	public static final double RELATIVE_TO_METER = .01;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_METER);
	}

}