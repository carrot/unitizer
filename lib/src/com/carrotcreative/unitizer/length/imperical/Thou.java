package com.carrotcreative.unitizer.length.imperical;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.carrotcreative.unitizer.length.Length;

/**
 * 1/1000 of an inch
 */
public class Thou extends Length{

	/* ========== Constructors ========== */
	public Thou(BigDecimal numUnits) { super(numUnits); }
	public Thou(BigInteger numUnits) { super(numUnits); }
	public Thou(String numUnits) { super(numUnits); }
	public Thou(double numUnits) { super(numUnits); }
	public Thou(int numUnits) { super(numUnits); }
	public Thou(long numUnits) { super(numUnits); }
	public Thou(Length length){ super(length); }
	
	/* ========== Overridden ========== */
	public static final double RELATIVE_TO_METER = 0.0000254;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_METER);
	}
	
}