package com.carrotcreative.unitizer.length.imperical;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.carrotcreative.unitizer.length.LengthUnit;

public class Leagues extends LengthUnit{

	/* ========== Constructors ========== */
	public Leagues(BigDecimal numUnits) { super(numUnits); }
	public Leagues(BigInteger numUnits) { super(numUnits); }
	public Leagues(String numUnits) { super(numUnits); }
	public Leagues(double numUnits) { super(numUnits); }
	public Leagues(int numUnits) { super(numUnits); }
	public Leagues(long numUnits) { super(numUnits); }
	public Leagues(LengthUnit length){ super(length); }
	
	/* ========== Overridden ========== */
	public static final double RELATIVE_TO_METER = 4828.032;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_METER);
	}
	
}