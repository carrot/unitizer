package com.brandonromano.unitizer.length.metric;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.brandonromano.unitizer.length.Length;

public class Decameter extends Length {
	
	/* ========== Constructors ========== */
	public Decameter(BigDecimal numUnits) { super(numUnits); }
	public Decameter(BigInteger numUnits) { super(numUnits); }
	public Decameter(String numUnits) { super(numUnits); }
	public Decameter(double numUnits) { super(numUnits); }
	public Decameter(int numUnits) { super(numUnits); }
	public Decameter(long numUnits) { super(numUnits); }
	public Decameter(Length length){ super(length); }
	
	/* ========== Overridden ========== */
	public static final double RELATIVE_TO_METER = 10;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_METER);
	}

}