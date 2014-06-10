package com.carrotcreative.unitizer.length.imperical;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.carrotcreative.unitizer.length.LengthUnit;

public class Miles extends LengthUnit{
	
	/* ========== Constructors ========== */
	public Miles(BigDecimal numUnits) { super(numUnits); }
	public Miles(BigInteger numUnits) { super(numUnits); }
	public Miles(String numUnits) { super(numUnits); }
	public Miles(double numUnits) { super(numUnits); }
	public Miles(int numUnits) { super(numUnits); }
	public Miles(long numUnits) { super(numUnits); }
	public Miles(LengthUnit length){ super(length); }
	
	/* ========== Overridden ========== */
	public static final double RELATIVE_TO_METER = 1609.344;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_METER);
	}

}