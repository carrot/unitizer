package com.carrotcreative.unitizer.time;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Simply 30 days
 */
public class Months extends TimeUnit{
	
	/* ========== Constructors ========== */
	public Months(BigDecimal numUnits) { super(numUnits); }
	public Months(BigInteger numUnits) { super(numUnits); }
	public Months(String numUnits) { super(numUnits); }
	public Months(double numUnits) { super(numUnits); }
	public Months(int numUnits) { super(numUnits); }
	public Months(long numUnits) { super(numUnits); }
	public Months(TimeUnit time){ super(time); }
	
	/* ========== Overridden ========== */
	public static final int RELATIVE_TO_SECOND = 2592000;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_SECOND);
	}
	
}