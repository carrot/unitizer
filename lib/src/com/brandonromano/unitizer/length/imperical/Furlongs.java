package com.brandonromano.unitizer.length.imperical;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.brandonromano.unitizer.length.Length;

public class Furlongs extends Length{
	
	/* ========== Constructors ========== */
	public Furlongs(BigDecimal numUnits) { super(numUnits); }
	public Furlongs(BigInteger numUnits) { super(numUnits); }
	public Furlongs(String numUnits) { super(numUnits); }
	public Furlongs(double numUnits) { super(numUnits); }
	public Furlongs(int numUnits) { super(numUnits); }
	public Furlongs(long numUnits) { super(numUnits); }
	public Furlongs(Length length){ super(length); }
	
	/* ========== Overridden ========== */
	public static final double RELATIVE_TO_METER = 201.168;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_METER);
	}

}