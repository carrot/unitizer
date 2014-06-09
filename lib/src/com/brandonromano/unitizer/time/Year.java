package com.brandonromano.unitizer.time;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Just an alias for GregorianYear
 */
public class Year extends GregorianYear{
	
	/* ========== Constructors ========== */
	public Year(BigDecimal numUnits) { super(numUnits); }
	public Year(BigInteger numUnits) { super(numUnits); }
	public Year(String numUnits) { super(numUnits); }
	public Year(double numUnits) { super(numUnits); }
	public Year(int numUnits) { super(numUnits); }
	public Year(long numUnits) { super(numUnits); }
	public Year(Time time){ super(time); }

}