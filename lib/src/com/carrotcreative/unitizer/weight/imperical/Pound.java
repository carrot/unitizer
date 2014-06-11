package com.carrotcreative.unitizer.weight.imperical;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.carrotcreative.unitizer.weight.WeightUnit;

public class Pound extends WeightUnit {

	/* ========== Constructors ========== */
	public Pound(BigDecimal numUnits) { super(numUnits); }
	public Pound(BigInteger numUnits) { super(numUnits); }
	public Pound(String numUnits) { super(numUnits); }
	public Pound(double numUnits) { super(numUnits); }
	public Pound(int numUnits) { super(numUnits); }
	public Pound(long numUnits) { super(numUnits); }
	public Pound(WeightUnit weight){ super(weight); }
	
	/* ========== Overridden ========== */
	public static final double RELATIVE_TO_GRAM = 453.59237;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_GRAM);
	}
	
}