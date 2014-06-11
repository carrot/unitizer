package com.carrotcreative.unitizer.weight.imperical;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.carrotcreative.unitizer.weight.WeightUnit;

public class Quarter extends WeightUnit {
	
	/* ========== Constructors ========== */
	public Quarter(BigDecimal numUnits) { super(numUnits); }
	public Quarter(BigInteger numUnits) { super(numUnits); }
	public Quarter(String numUnits) { super(numUnits); }
	public Quarter(double numUnits) { super(numUnits); }
	public Quarter(int numUnits) { super(numUnits); }
	public Quarter(long numUnits) { super(numUnits); }
	public Quarter(WeightUnit weight){ super(weight); }
	
	/* ========== Overridden ========== */
	public static final double RELATIVE_TO_GRAM = 12700.6;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_GRAM);
	}
	
}