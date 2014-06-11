package com.carrotcreative.unitizer.weight.imperical;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.carrotcreative.unitizer.weight.WeightUnit;

public class Stone extends WeightUnit{
	
	/* ========== Constructors ========== */
	public Stone(BigDecimal numUnits) { super(numUnits); }
	public Stone(BigInteger numUnits) { super(numUnits); }
	public Stone(String numUnits) { super(numUnits); }
	public Stone(double numUnits) { super(numUnits); }
	public Stone(int numUnits) { super(numUnits); }
	public Stone(long numUnits) { super(numUnits); }
	public Stone(WeightUnit weight){ super(weight); }
	
	/* ========== Overridden ========== */
	public static final double RELATIVE_TO_GRAM = 6350.29318;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_GRAM);
	}

}