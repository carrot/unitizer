package com.carrotcreative.unitizer.length.metric;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.carrotcreative.unitizer.length.LengthUnit;

public class Meters extends LengthUnit{

	/* ========== Constructors ========== */
	public Meters(BigDecimal numUnits) { super(numUnits); }
	public Meters(BigInteger numUnits) { super(numUnits); }
	public Meters(String numUnits) { super(numUnits); }
	public Meters(double numUnits) { super(numUnits); }
	public Meters(int numUnits) { super(numUnits); }
	public Meters(long numUnits) { super(numUnits); }
	public Meters(LengthUnit length){ super(length); }
	
	/* ========== Overridden ========== */
	public static final double RELATIVE_TO_METER = 1;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_METER);
	}
	
}