package com.carrotcreative.unitizer.time;

import java.math.BigDecimal;
import java.math.BigInteger;

public class LeapYear extends TimeUnit {

	/* ========== Constructors ========== */
	public LeapYear(BigDecimal numUnits) { super(numUnits); }
	public LeapYear(BigInteger numUnits) { super(numUnits); }
	public LeapYear(String numUnits) { super(numUnits); }
	public LeapYear(double numUnits) { super(numUnits); }
	public LeapYear(int numUnits) { super(numUnits); }
	public LeapYear(long numUnits) { super(numUnits); }
	public LeapYear(TimeUnit time){ super(time); }
	
	/* ========== Overridden ========== */
	public static final int RELATIVE_TO_SECOND = 31622400;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_SECOND);
	}
	
}