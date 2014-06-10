package com.carrotcreative.unitizer.length.metric;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.carrotcreative.unitizer.length.LengthUnit;

public class Millimeters extends LengthUnit {

	/* ========== Constructors ========== */
	public Millimeters(BigDecimal numUnits) { super(numUnits); }
	public Millimeters(BigInteger numUnits) { super(numUnits); }
	public Millimeters(String numUnits) { super(numUnits); }
	public Millimeters(double numUnits) { super(numUnits); }
	public Millimeters(int numUnits) { super(numUnits); }
	public Millimeters(long numUnits) { super(numUnits); }
	public Millimeters(LengthUnit length){ super(length); }
	
	/* ========== Overridden ========== */
	public static final double RELATIVE_TO_METER = .001;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_METER);
	}

}