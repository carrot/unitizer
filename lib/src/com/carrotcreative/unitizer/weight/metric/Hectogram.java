package com.carrotcreative.unitizer.weight.metric;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.carrotcreative.unitizer.weight.WeightUnit;

public class Hectogram extends WeightUnit{
	
	/* ========== Constructors ========== */
	public Hectogram(BigDecimal numUnits) { super(numUnits); }
	public Hectogram(BigInteger numUnits) { super(numUnits); }
	public Hectogram(String numUnits) { super(numUnits); }
	public Hectogram(double numUnits) { super(numUnits); }
	public Hectogram(int numUnits) { super(numUnits); }
	public Hectogram(long numUnits) { super(numUnits); }
	public Hectogram(WeightUnit weight){ super(weight); }
	
	/* ========== Overridden ========== */
	public static final double RELATIVE_TO_GRAM = 100;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_GRAM);
	}

}