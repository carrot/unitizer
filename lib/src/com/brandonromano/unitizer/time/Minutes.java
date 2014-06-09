package com.brandonromano.unitizer.time;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Minutes extends Time{
	
	/* ========== Constructors ========== */
	public Minutes(BigDecimal numUnits) { super(numUnits); }
	public Minutes(BigInteger numUnits) { super(numUnits); }
	public Minutes(String numUnits) { super(numUnits); }
	public Minutes(double numUnits) { super(numUnits); }
	public Minutes(int numUnits) { super(numUnits); }
	public Minutes(long numUnits) { super(numUnits); }
	public Minutes(Time time){ super(time); }
	
	/* ========== Overridden ========== */
	public static final int RELATIVE_TO_SECOND = 60;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_SECOND);
	}

}