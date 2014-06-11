package com.carrotcreative.unitizer.weight.metric;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.carrotcreative.unitizer.weight.WeightUnit;

public class Centigram extends WeightUnit{
	
	/* ========== Constructors ========== */
	public Centigram(BigDecimal numUnits) { super(numUnits); }
	public Centigram(BigInteger numUnits) { super(numUnits); }
	public Centigram(String numUnits) { super(numUnits); }
	public Centigram(double numUnits) { super(numUnits); }
	public Centigram(int numUnits) { super(numUnits); }
	public Centigram(long numUnits) { super(numUnits); }
	public Centigram(WeightUnit weight){ super(weight); }
	
	/* ========== Overridden ========== */
	public static final double RELATIVE_TO_GRAM = 0.01;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_GRAM);
	}

}
