package com.brandonromano.unitizer.length.metric;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.brandonromano.unitizer.length.Length;

public class Decimeters extends Length {

	/* ========== Constructors ========== */
	public Decimeters(BigDecimal numUnits) { super(numUnits); }
	public Decimeters(BigInteger numUnits) { super(numUnits); }
	public Decimeters(String numUnits) { super(numUnits); }
	public Decimeters(double numUnits) { super(numUnits); }
	public Decimeters(int numUnits) { super(numUnits); }
	public Decimeters(long numUnits) { super(numUnits); }
	public Decimeters(Length length){ super(length); }
	
	/* ========== Overridden ========== */
	public static final double RELATIVE_TO_METER = .1;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_METER);
	}
	
}