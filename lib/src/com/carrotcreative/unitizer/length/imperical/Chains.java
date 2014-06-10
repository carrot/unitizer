package com.carrotcreative.unitizer.length.imperical;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.carrotcreative.unitizer.length.LengthUnit;

public class Chains extends LengthUnit{
	
	/* ========== Constructors ========== */
	public Chains(BigDecimal numUnits) { super(numUnits); }
	public Chains(BigInteger numUnits) { super(numUnits); }
	public Chains(String numUnits) { super(numUnits); }
	public Chains(double numUnits) { super(numUnits); }
	public Chains(int numUnits) { super(numUnits); }
	public Chains(long numUnits) { super(numUnits); }
	public Chains(LengthUnit length){ super(length); }
	
	/* ========== Overridden ========== */
	public static final double RELATIVE_TO_METER = 20.1168;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_METER);
	}

}