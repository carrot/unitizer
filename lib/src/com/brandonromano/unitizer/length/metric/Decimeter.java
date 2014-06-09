package com.brandonromano.unitizer.length.metric;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.brandonromano.unitizer.length.Length;

public class Decimeter extends Length {

	/* ========== Constructors ========== */
	public Decimeter(BigDecimal numUnits) { super(numUnits); }
	public Decimeter(BigInteger numUnits) { super(numUnits); }
	public Decimeter(String numUnits) { super(numUnits); }
	public Decimeter(double numUnits) { super(numUnits); }
	public Decimeter(int numUnits) { super(numUnits); }
	public Decimeter(long numUnits) { super(numUnits); }
	public Decimeter(Length length){ super(length); }
	
	/* ========== Overridden ========== */
	public static final double RELATIVE_TO_METER = .1;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_METER);
	}
	
}