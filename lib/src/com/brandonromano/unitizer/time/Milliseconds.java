package com.brandonromano.unitizer.time;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Milliseconds extends Time {
	
	/* ========== Constructors ========== */
	public Milliseconds(BigDecimal numUnits) { super(numUnits); }
	public Milliseconds(BigInteger numUnits) { super(numUnits); }
	public Milliseconds(String numUnits) { super(numUnits); }
	public Milliseconds(double numUnits) { super(numUnits); }
	public Milliseconds(int numUnits) { super(numUnits); }
	public Milliseconds(long numUnits) { super(numUnits); }
	public Milliseconds(Time time){ super(time); }
	
	/* ========== Overridden ========== */
	public static final double RELATIVE_TO_SECOND = .001;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_SECOND);
	}

}