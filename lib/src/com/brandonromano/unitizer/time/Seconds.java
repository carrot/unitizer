package com.brandonromano.unitizer.time;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Seconds extends Time{
	
	/* ========== Constructors ========== */
	public Seconds(BigDecimal numUnits) { super(numUnits); }
	public Seconds(BigInteger numUnits) { super(numUnits); }
	public Seconds(String numUnits) { super(numUnits); }
	public Seconds(double numUnits) { super(numUnits); }
	public Seconds(int numUnits) { super(numUnits); }
	public Seconds(long numUnits) { super(numUnits); }
	public Seconds(Time time){ super(time); }
	
	/* ========== Overridden ========== */
	public static final int RELATIVE_TO_SECOND = 1;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_SECOND);
	}

}