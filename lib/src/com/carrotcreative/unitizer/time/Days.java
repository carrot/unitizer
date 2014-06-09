package com.carrotcreative.unitizer.time;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Days extends Time{
	
	/* ========== Constructors ========== */
	public Days(BigDecimal numUnits) { super(numUnits); }
	public Days(BigInteger numUnits) { super(numUnits); }
	public Days(String numUnits) { super(numUnits); }
	public Days(double numUnits) { super(numUnits); }
	public Days(int numUnits) { super(numUnits); }
	public Days(long numUnits) { super(numUnits); }
	public Days(Time time){ super(time); }
	
	/* ========== Overridden ========== */
	public static final int RELATIVE_TO_SECOND = 86400;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_SECOND);
	}

}