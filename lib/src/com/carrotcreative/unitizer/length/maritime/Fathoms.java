package com.carrotcreative.unitizer.length.maritime;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.carrotcreative.unitizer.length.LengthUnit;

public class Fathoms extends LengthUnit{
	
	/* ========== Constructors ========== */
	public Fathoms(BigDecimal numUnits) { super(numUnits); }
	public Fathoms(BigInteger numUnits) { super(numUnits); }
	public Fathoms(String numUnits) { super(numUnits); }
	public Fathoms(double numUnits) { super(numUnits); }
	public Fathoms(int numUnits) { super(numUnits); }
	public Fathoms(long numUnits) { super(numUnits); }
	public Fathoms(LengthUnit length){ super(length); }
	
	/* ========== Overridden ========== */
	public static final double RELATIVE_TO_METER = 1.853184;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_METER);
	}

}