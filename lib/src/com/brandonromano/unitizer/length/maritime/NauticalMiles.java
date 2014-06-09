package com.brandonromano.unitizer.length.maritime;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.brandonromano.unitizer.length.Length;

public class NauticalMiles extends Length{
	
	/* ========== Constructors ========== */
	public NauticalMiles(BigDecimal numUnits) { super(numUnits); }
	public NauticalMiles(BigInteger numUnits) { super(numUnits); }
	public NauticalMiles(String numUnits) { super(numUnits); }
	public NauticalMiles(double numUnits) { super(numUnits); }
	public NauticalMiles(int numUnits) { super(numUnits); }
	public NauticalMiles(long numUnits) { super(numUnits); }
	public NauticalMiles(Length length){ super(length); }
	
	/* ========== Overridden ========== */
	public static final double RELATIVE_TO_METER = 1853.184;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_METER);
	}

}