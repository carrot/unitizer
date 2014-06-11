package com.carrotcreative.unitizer.weight.metric;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.carrotcreative.unitizer.weight.WeightUnit;

public class Milligram extends WeightUnit{
	
	/* ========== Constructors ========== */
	public Milligram(BigDecimal numUnits) { super(numUnits); }
	public Milligram(BigInteger numUnits) { super(numUnits); }
	public Milligram(String numUnits) { super(numUnits); }
	public Milligram(double numUnits) { super(numUnits); }
	public Milligram(int numUnits) { super(numUnits); }
	public Milligram(long numUnits) { super(numUnits); }
	public Milligram(WeightUnit weight){ super(weight); }
	
	/* ========== Overridden ========== */
	public static final double RELATIVE_TO_GRAM = 0.001;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_GRAM);
	}
	
}