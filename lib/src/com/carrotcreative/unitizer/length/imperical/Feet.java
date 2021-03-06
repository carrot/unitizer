package com.carrotcreative.unitizer.length.imperical;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.carrotcreative.unitizer.length.LengthUnit;

public class Feet extends LengthUnit {
	
	/* ========== Constructors ========== */
	public Feet(BigDecimal numUnits) { super(numUnits); }
	public Feet(BigInteger numUnits) { super(numUnits); }
	public Feet(String numUnits) { super(numUnits); }
	public Feet(double numUnits) { super(numUnits); }
	public Feet(int numUnits) { super(numUnits); }
	public Feet(long numUnits) { super(numUnits); }
	public Feet(LengthUnit length){ super(length); }
	
	/* ========== Overridden ========== */
	public static final double RELATIVE_TO_METER = 0.3048;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_METER);
	}

}