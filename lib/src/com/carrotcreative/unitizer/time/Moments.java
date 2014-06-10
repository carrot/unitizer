package com.carrotcreative.unitizer.time;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Moments extends TimeUnit{
	
	/* ========== Constructors ========== */
	public Moments(BigDecimal numUnits) { super(numUnits); }
	public Moments(BigInteger numUnits) { super(numUnits); }
	public Moments(String numUnits) { super(numUnits); }
	public Moments(double numUnits) { super(numUnits); }
	public Moments(int numUnits) { super(numUnits); }
	public Moments(long numUnits) { super(numUnits); }
	public Moments(TimeUnit time){ super(time); }
	
	/* ========== Overridden ========== */
	public static final int RELATIVE_TO_SECOND = 90;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_SECOND);
	}

}