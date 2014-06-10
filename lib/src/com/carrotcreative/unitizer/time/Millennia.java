package com.carrotcreative.unitizer.time;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Millennia extends TimeUnit{
	
	/* ========== Constructors ========== */
	public Millennia(BigDecimal numUnits) { super(numUnits); }
	public Millennia(BigInteger numUnits) { super(numUnits); }
	public Millennia(String numUnits) { super(numUnits); }
	public Millennia(double numUnits) { super(numUnits); }
	public Millennia(int numUnits) { super(numUnits); }
	public Millennia(long numUnits) { super(numUnits); }
	public Millennia(TimeUnit time){ super(time); }
	
	/* ========== Overridden ========== */
	public static final long RELATIVE_TO_SECOND = 31556952000l;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_SECOND);
	}

}