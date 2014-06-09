package com.brandonromano.unitizer.time;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Weeks extends Time{
	
	/* ========== Constructors ========== */
	public Weeks(BigDecimal numUnits) { super(numUnits); }
	public Weeks(BigInteger numUnits) { super(numUnits); }
	public Weeks(String numUnits) { super(numUnits); }
	public Weeks(double numUnits) { super(numUnits); }
	public Weeks(int numUnits) { super(numUnits); }
	public Weeks(long numUnits) { super(numUnits); }
	public Weeks(Time time){ super(time); }
	
	/* ========== Overridden ========== */
	public static final int RELATIVE_TO_SECOND = 604800;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_SECOND);
	}

}