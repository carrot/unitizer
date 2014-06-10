package com.carrotcreative.unitizer.time;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Hours extends TimeUnit{

	/* ========== Constructors ========== */
	public Hours(BigDecimal numUnits) { super(numUnits); }
	public Hours(BigInteger numUnits) { super(numUnits); }
	public Hours(String numUnits) { super(numUnits); }
	public Hours(double numUnits) { super(numUnits); }
	public Hours(int numUnits) { super(numUnits); }
	public Hours(long numUnits) { super(numUnits); }
	public Hours(TimeUnit time){ super(time); }
	
	/* ========== Overridden ========== */
	public static final int RELATIVE_TO_SECOND = 3600;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_SECOND);
	}
	
}