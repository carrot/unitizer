package com.carrotcreative.unitizer.length.metric;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.carrotcreative.unitizer.length.LengthUnit;

public class Decameters extends LengthUnit {
	
	/* ========== Constructors ========== */
	public Decameters(BigDecimal numUnits) { super(numUnits); }
	public Decameters(BigInteger numUnits) { super(numUnits); }
	public Decameters(String numUnits) { super(numUnits); }
	public Decameters(double numUnits) { super(numUnits); }
	public Decameters(int numUnits) { super(numUnits); }
	public Decameters(long numUnits) { super(numUnits); }
	public Decameters(LengthUnit length){ super(length); }
	
	/* ========== Overridden ========== */
	public static final double RELATIVE_TO_METER = 10;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_METER);
	}

}