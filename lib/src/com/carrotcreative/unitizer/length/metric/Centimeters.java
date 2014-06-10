package com.carrotcreative.unitizer.length.metric;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.carrotcreative.unitizer.length.LengthUnit;

public class Centimeters extends LengthUnit{

	/* ========== Constructors ========== */
	public Centimeters(BigDecimal numUnits) { super(numUnits); }
	public Centimeters(BigInteger numUnits) { super(numUnits); }
	public Centimeters(String numUnits) { super(numUnits); }
	public Centimeters(double numUnits) { super(numUnits); }
	public Centimeters(int numUnits) { super(numUnits); }
	public Centimeters(long numUnits) { super(numUnits); }
	public Centimeters(LengthUnit length){ super(length); }
	
	/* ========== Overridden ========== */
	public static final double RELATIVE_TO_METER = .01;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_METER);
	}

}