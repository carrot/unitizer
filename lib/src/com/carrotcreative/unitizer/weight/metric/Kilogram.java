package com.carrotcreative.unitizer.weight.metric;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.carrotcreative.unitizer.weight.WeightUnit;

public class Kilogram extends WeightUnit{
	
	/* ========== Constructors ========== */
	public Kilogram(BigDecimal numUnits) { super(numUnits); }
	public Kilogram(BigInteger numUnits) { super(numUnits); }
	public Kilogram(String numUnits) { super(numUnits); }
	public Kilogram(double numUnits) { super(numUnits); }
	public Kilogram(int numUnits) { super(numUnits); }
	public Kilogram(long numUnits) { super(numUnits); }
	public Kilogram(WeightUnit weight){ super(weight); }
	
	/* ========== Overridden ========== */
	public static final double RELATIVE_TO_GRAM = 1000;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_GRAM);
	}

}