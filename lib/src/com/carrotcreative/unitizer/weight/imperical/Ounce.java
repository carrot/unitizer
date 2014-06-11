package com.carrotcreative.unitizer.weight.imperical;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.carrotcreative.unitizer.weight.WeightUnit;

public class Ounce extends WeightUnit{
	
	/* ========== Constructors ========== */
	public Ounce(BigDecimal numUnits) { super(numUnits); }
	public Ounce(BigInteger numUnits) { super(numUnits); }
	public Ounce(String numUnits) { super(numUnits); }
	public Ounce(double numUnits) { super(numUnits); }
	public Ounce(int numUnits) { super(numUnits); }
	public Ounce(long numUnits) { super(numUnits); }
	public Ounce(WeightUnit weight){ super(weight); }
	
	/* ========== Overridden ========== */
	public static final double RELATIVE_TO_GRAM = 28.349523125;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_GRAM);
	}

}