package com.carrotcreative.unitizer.time;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Centuries extends Time{
	
	/* ========== Constructors ========== */
	public Centuries(BigDecimal numUnits) { super(numUnits); }
	public Centuries(BigInteger numUnits) { super(numUnits); }
	public Centuries(String numUnits) { super(numUnits); }
	public Centuries(double numUnits) { super(numUnits); }
	public Centuries(int numUnits) { super(numUnits); }
	public Centuries(long numUnits) { super(numUnits); }
	public Centuries(Time time){ super(time); }
	
	/* ========== Overridden ========== */
	public static final long RELATIVE_TO_SECOND = 3155695200l;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_SECOND);
	}

}