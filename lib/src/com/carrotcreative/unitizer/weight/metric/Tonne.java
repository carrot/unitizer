package com.carrotcreative.unitizer.weight.metric;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.carrotcreative.unitizer.weight.WeightUnit;

public class Tonne extends WeightUnit{
	
	/* ========== Constructors ========== */
	public Tonne(BigDecimal numUnits) { super(numUnits); }
	public Tonne(BigInteger numUnits) { super(numUnits); }
	public Tonne(String numUnits) { super(numUnits); }
	public Tonne(double numUnits) { super(numUnits); }
	public Tonne(int numUnits) { super(numUnits); }
	public Tonne(long numUnits) { super(numUnits); }
	public Tonne(WeightUnit weight){ super(weight); }
	
	/* ========== Overridden ========== */
	public static final double RELATIVE_TO_GRAM = 1000000;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_GRAM);
	}

}