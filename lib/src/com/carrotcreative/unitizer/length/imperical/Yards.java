package com.carrotcreative.unitizer.length.imperical;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.carrotcreative.unitizer.length.LengthUnit;

public class Yards extends LengthUnit{

	/* ========== Constructors ========== */
	public Yards(BigDecimal numUnits) { super(numUnits); }
	public Yards(BigInteger numUnits) { super(numUnits); }
	public Yards(String numUnits) { super(numUnits); }
	public Yards(double numUnits) { super(numUnits); }
	public Yards(int numUnits) { super(numUnits); }
	public Yards(long numUnits) { super(numUnits); }
	public Yards(LengthUnit length){ super(length); }
	
	/* ========== Overridden ========== */
	public static final double RELATIVE_TO_METER = 0.9144;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_METER);
	}
	
}