package com.carrotcreative.unitizer.time;

import java.math.BigDecimal;
import java.math.BigInteger;

public class CommonYear extends TimeUnit{

	/* ========== Constructors ========== */
	public CommonYear(BigDecimal numUnits) { super(numUnits); }
	public CommonYear(BigInteger numUnits) { super(numUnits); }
	public CommonYear(String numUnits) { super(numUnits); }
	public CommonYear(double numUnits) { super(numUnits); }
	public CommonYear(int numUnits) { super(numUnits); }
	public CommonYear(long numUnits) { super(numUnits); }
	public CommonYear(TimeUnit time){ super(time); }
	
	/* ========== Overridden ========== */
	public static final int RELATIVE_TO_SECOND = 31536000;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_SECOND);
	}
	
}