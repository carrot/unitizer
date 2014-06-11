package com.carrotcreative.unitizer.weight.imperical;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.carrotcreative.unitizer.weight.WeightUnit;

public class Grain extends WeightUnit{
	
	/* ========== Constructors ========== */
	public Grain(BigDecimal numUnits) { super(numUnits); }
	public Grain(BigInteger numUnits) { super(numUnits); }
	public Grain(String numUnits) { super(numUnits); }
	public Grain(double numUnits) { super(numUnits); }
	public Grain(int numUnits) { super(numUnits); }
	public Grain(long numUnits) { super(numUnits); }
	public Grain(WeightUnit weight){ super(weight); }
	
	/* ========== Overridden ========== */
	public static final double RELATIVE_TO_GRAM = 0.06479891;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_GRAM);
	}

}