package com.carrotcreative.unitizer.length.maritime;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.carrotcreative.unitizer.length.LengthUnit;

public class Cables extends LengthUnit{

	/* ========== Constructors ========== */
	public Cables(BigDecimal numUnits) { super(numUnits); }
	public Cables(BigInteger numUnits) { super(numUnits); }
	public Cables(String numUnits) { super(numUnits); }
	public Cables(double numUnits) { super(numUnits); }
	public Cables(int numUnits) { super(numUnits); }
	public Cables(long numUnits) { super(numUnits); }
	public Cables(LengthUnit length){ super(length); }
	
	/* ========== Overridden ========== */
	public static final double RELATIVE_TO_METER = 185.3184;

	@Override
	protected BigDecimal relativeToStandard() {
		return new BigDecimal(RELATIVE_TO_METER);
	}
	
}