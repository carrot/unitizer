package com.carrotcreative.unitizer.weight;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.carrotcreative.unitizer.Unit;

/**
 * http://en.wikipedia.org/wiki/Imperial_units
 */
public abstract class WeightUnit extends Unit{
	
	/* ========== Constructors ========== */
	public WeightUnit(BigDecimal numUnits) { super(numUnits); }
	public WeightUnit(BigInteger numUnits) { super(numUnits); }
	public WeightUnit(String numUnits) { super(numUnits); }
	public WeightUnit(double numUnits) { super(numUnits); }
	public WeightUnit(int numUnits) { super(numUnits); }
	public WeightUnit(long numUnits) { super(numUnits); }
	public WeightUnit(WeightUnit weight){ super(weight); }

}