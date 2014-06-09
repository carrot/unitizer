package com.brandonromano.unitizer;

import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class Unit {
	
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
		BigDecimal diff = oldRelativeToStandard.divide(thisRelativeToStandard);
		mNumUnits = oldUnit.mNumUnits.multiply(diff);
	}
	
	/* ========== Public Methods ========== */
	
	@Override
	public String toString()
	{
		return mNumUnits.toPlainString();
	}
	
	public BigDecimal toBigDecimal()
	{
		return mNumUnits;
	}
	
	/* ========== Abstract ========== */
	
	/**
	 * This is to return the number of minimum divisible
	 * units that are required to create this unit.
	 */
	protected abstract BigDecimal relativeToStandard();
	
}
