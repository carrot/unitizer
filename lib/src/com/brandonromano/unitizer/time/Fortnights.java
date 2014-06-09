package com.brandonromano.unitizer.time;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Fortnights extends Time{
	
	/* ========== Constructors ========== */
	public Fortnights(BigDecimal numUnits) { super(numUnits); }
	public Fortnights(BigInteger numUnits) { super(numUnits); }
	public Fortnights(String numUnits) { super(numUnits); }
	public Fortnights(double numUnits) { super(numUnits); }
	public Fortnights(int numUnits) { super(numUnits); }
	public Fortnights(long numUnits) { super(numUnits); }
	public Fortnights(Time time){ super(time); }
	
	/* ========== Overridden ========== */
	public static final int RELATIVE_TO_SECOND = 1209600;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_SECOND);
	}

}