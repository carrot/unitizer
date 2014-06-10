package com.carrotcreative.unitizer.time;

import java.math.BigDecimal;
import java.math.BigInteger;

public class GregorianYear extends TimeUnit {
	
	/* ========== Constructors ========== */
	public GregorianYear(BigDecimal numUnits) { super(numUnits); }
	public GregorianYear(BigInteger numUnits) { super(numUnits); }
	public GregorianYear(String numUnits) { super(numUnits); }
	public GregorianYear(double numUnits) { super(numUnits); }
	public GregorianYear(int numUnits) { super(numUnits); }
	public GregorianYear(long numUnits) { super(numUnits); }
	public GregorianYear(TimeUnit time){ super(time); }
	
	/* ========== Overridden ========== */
	public static final int RELATIVE_TO_SECOND = 31556952;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_SECOND);
	}
	
}