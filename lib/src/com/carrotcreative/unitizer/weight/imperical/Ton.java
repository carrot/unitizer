package com.carrotcreative.unitizer.weight.imperical;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.carrotcreative.unitizer.weight.WeightUnit;

/**
 * Also known as the Long Ton
 */
public class Ton extends WeightUnit{
	
	/* ========== Constructors ========== */
	public Ton(BigDecimal numUnits) { super(numUnits); }
	public Ton(BigInteger numUnits) { super(numUnits); }
	public Ton(String numUnits) { super(numUnits); }
	public Ton(double numUnits) { super(numUnits); }
	public Ton(int numUnits) { super(numUnits); }
	public Ton(long numUnits) { super(numUnits); }
	public Ton(WeightUnit weight){ super(weight); }
	
	/* ========== Overridden ========== */
	public static final double RELATIVE_TO_GRAM = 1016046.9088;
	
	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_GRAM);
	}

}