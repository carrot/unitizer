package com.carrotcreative.unitizer;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

public abstract class Unit {
	
	/* ========== Rounding Specifics ========== */
	
	private static final int PRECISION = 6;
	private static final RoundingMode ROUNDING_MODE = RoundingMode.HALF_UP;
	
	private MathContext getMathContext()
	{
		return new MathContext(PRECISION, ROUNDING_MODE);
	}
	
	/* ========== Fields ========== */
	
	private BigDecimal mNumUnits;
	
	/* ========== Constructors ========== */
	
	public Unit(BigDecimal numUnits)
	{
		mNumUnits = numUnits;
	}
	
	public Unit(BigInteger numUnits)
	{
		mNumUnits = new BigDecimal(numUnits);
	}
	
	public Unit(String numUnits)
	{
		mNumUnits = new BigDecimal(numUnits);
	}
	
	public Unit(double numUnits)
	{
		mNumUnits = new BigDecimal(numUnits);
	}
	
	public Unit(int numUnits)
	{
		mNumUnits = new BigDecimal(numUnits);
	}
	
	public Unit(long numUnits)
	{
		mNumUnits = new BigDecimal(numUnits);
	}
	
	/**
	 * Private to be called only by Unit Type
	 * to restrict to compatible units
	 */
	protected Unit(Unit oldUnit)
	{
		BigDecimal oldRelativeToStandard = oldUnit.relativeToStandard();
		BigDecimal thisRelativeToStandard = relativeToStandard();
		BigDecimal diff = oldRelativeToStandard.divide(thisRelativeToStandard, PRECISION * 2, ROUNDING_MODE);
		mNumUnits = oldUnit.mNumUnits.multiply(diff, getMathContext());
	}
	
	/* ========== Public Methods ========== */
	
	@Override
	public String toString()
	{
		return mNumUnits.toPlainString();
	}
	
	public String toRoundedString()
	{
		return mNumUnits.toBigInteger().toString();
	}
	
	public long toRoundedLong()
	{
		return mNumUnits.toBigInteger().longValue();
	}
	
	public BigDecimal toBigDecimal()
	{
		return mNumUnits;
	}
	
	public BigInteger toBigInteger()
	{
		return mNumUnits.toBigInteger();
	}
	
	/* ========== Abstract ========== */
	
	/**
	 * This is to return the number of minimum divisible
	 * units that are required to create this unit.
	 */
	protected abstract BigDecimal relativeToStandard();
	
}