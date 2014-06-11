package com.carrotcreative.unitizer.weight.metric;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.carrotcreative.unitizer.weight.WeightUnit;

public class Decagram extends WeightUnit{
	
	/* ========== Constructors ========== */
	public Decagram(BigDecimal numUnits) { super(numUnits); }
	public Decagram(BigInteger numUnits) { super(numUnits); }
	public Decagram(String numUnits) { super(numUnits); }
	public Decagram(double numUnits) { super(numUnits); }
	public Decagram(int numUnits) { super(numUnits); }
	public Decagram(long numUnits) { super(numUnits); }
	public Decagram(WeightUnit weight){ super(weight); }
	
	/* ========== Overridden ========== */
	public static final double RELATIVE_TO_GRAM = 10;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_GRAM);
	}

}