package com.carrotcreative.unitizer.weight.imperical;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.carrotcreative.unitizer.weight.WeightUnit;

public class HundredWeight extends WeightUnit{
	
	/* ========== Constructors ========== */
	public HundredWeight(BigDecimal numUnits) { super(numUnits); }
	public HundredWeight(BigInteger numUnits) { super(numUnits); }
	public HundredWeight(String numUnits) { super(numUnits); }
	public HundredWeight(double numUnits) { super(numUnits); }
	public HundredWeight(int numUnits) { super(numUnits); }
	public HundredWeight(long numUnits) { super(numUnits); }
	public HundredWeight(WeightUnit weight){ super(weight); }
	
	/* ========== Overridden ========== */
	public static final double RELATIVE_TO_GRAM = 50802.3;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_GRAM);
	}

}