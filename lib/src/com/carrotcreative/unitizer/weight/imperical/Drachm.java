package com.carrotcreative.unitizer.weight.imperical;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.carrotcreative.unitizer.weight.WeightUnit;

public class Drachm extends WeightUnit{

	/* ========== Constructors ========== */
	public Drachm(BigDecimal numUnits) { super(numUnits); }
	public Drachm(BigInteger numUnits) { super(numUnits); }
	public Drachm(String numUnits) { super(numUnits); }
	public Drachm(double numUnits) { super(numUnits); }
	public Drachm(int numUnits) { super(numUnits); }
	public Drachm(long numUnits) { super(numUnits); }
	public Drachm(WeightUnit weight){ super(weight); }
	
	/* ========== Overridden ========== */
	public static final double RELATIVE_TO_GRAM = 1.7718451953125;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_GRAM);
	}
	
}