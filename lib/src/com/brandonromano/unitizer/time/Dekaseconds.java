package com.brandonromano.unitizer.time;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Dekaseconds extends Time{
	
	/* ========== Constructors ========== */
	public Dekaseconds(BigDecimal numUnits) { super(numUnits); }
	public Dekaseconds(BigInteger numUnits) { super(numUnits); }
	public Dekaseconds(String numUnits) { super(numUnits); }
	public Dekaseconds(double numUnits) { super(numUnits); }
	public Dekaseconds(int numUnits) { super(numUnits); }
	public Dekaseconds(long numUnits) { super(numUnits); }
	public Dekaseconds(Time time){ super(time); }
	
	/* ========== Overridden ========== */
	public static final double RELATIVE_TO_SECOND = 10;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_SECOND);
	}

}