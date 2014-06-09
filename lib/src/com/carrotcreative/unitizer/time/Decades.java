package com.carrotcreative.unitizer.time;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Decades extends Time{
	
	/* ========== Constructors ========== */
	public Decades(BigDecimal numUnits) { super(numUnits); }
	public Decades(BigInteger numUnits) { super(numUnits); }
	public Decades(String numUnits) { super(numUnits); }
	public Decades(double numUnits) { super(numUnits); }
	public Decades(int numUnits) { super(numUnits); }
	public Decades(long numUnits) { super(numUnits); }
	public Decades(Time time){ super(time); }
	
	/* ========== Overridden ========== */
	public static final int RELATIVE_TO_SECOND = 315569520;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_SECOND);
	}

}