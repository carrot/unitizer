package com.carrotcreative.unitizer.length.imperical;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.carrotcreative.unitizer.length.LengthUnit;

public class Inches extends LengthUnit{
	
	/* ========== Constructors ========== */
	public Inches(BigDecimal numUnits) { super(numUnits); }
	public Inches(BigInteger numUnits) { super(numUnits); }
	public Inches(String numUnits) { super(numUnits); }
	public Inches(double numUnits) { super(numUnits); }
	public Inches(int numUnits) { super(numUnits); }
	public Inches(long numUnits) { super(numUnits); }
	public Inches(LengthUnit length){ super(length); }
	
	/* ========== Overridden ========== */
	public static final double RELATIVE_TO_METER = 0.0254;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_METER);
	}
	
}