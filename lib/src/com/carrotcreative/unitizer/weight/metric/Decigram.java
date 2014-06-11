package com.carrotcreative.unitizer.weight.metric;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.carrotcreative.unitizer.weight.WeightUnit;

public class Decigram extends WeightUnit{
	
	/* ========== Constructors ========== */
	public Decigram(BigDecimal numUnits) { super(numUnits); }
	public Decigram(BigInteger numUnits) { super(numUnits); }
	public Decigram(String numUnits) { super(numUnits); }
	public Decigram(double numUnits) { super(numUnits); }
	public Decigram(int numUnits) { super(numUnits); }
	public Decigram(long numUnits) { super(numUnits); }
	public Decigram(WeightUnit weight){ super(weight); }
	
	/* ========== Overridden ========== */
	public static final double RELATIVE_TO_GRAM = 0.1;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_GRAM);
	}

}