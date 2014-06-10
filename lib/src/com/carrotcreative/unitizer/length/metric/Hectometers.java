package com.carrotcreative.unitizer.length.metric;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.carrotcreative.unitizer.length.LengthUnit;

public class Hectometers extends LengthUnit{

	/* ========== Constructors ========== */
	public Hectometers(BigDecimal numUnits) { super(numUnits); }
	public Hectometers(BigInteger numUnits) { super(numUnits); }
	public Hectometers(String numUnits) { super(numUnits); }
	public Hectometers(double numUnits) { super(numUnits); }
	public Hectometers(int numUnits) { super(numUnits); }
	public Hectometers(long numUnits) { super(numUnits); }
	public Hectometers(LengthUnit length){ super(length); }
	
	/* ========== Overridden ========== */
	public static final double RELATIVE_TO_METER = 100;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_METER);
	}
	
}