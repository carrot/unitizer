package com.carrotcreative.unitizer.weight.metric;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.carrotcreative.unitizer.weight.WeightUnit;

public class Gram extends WeightUnit{
	
	/* ========== Constructors ========== */
	public Gram(BigDecimal numUnits) { super(numUnits); }
	public Gram(BigInteger numUnits) { super(numUnits); }
	public Gram(String numUnits) { super(numUnits); }
	public Gram(double numUnits) { super(numUnits); }
	public Gram(int numUnits) { super(numUnits); }
	public Gram(long numUnits) { super(numUnits); }
	public Gram(WeightUnit weight){ super(weight); }
	
	/* ========== Overridden ========== */
	public static final double RELATIVE_TO_GRAM = 1;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_GRAM);
	}

}