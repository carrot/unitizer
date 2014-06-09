Unitizer
========

Effortless unit conversion

Unitizer allows you to convert units effortlessly.  Unitizer uses a BigDecimal object to calculate everything, so you won't have to worry about overflowing.

Usage
-----

Most calls to this library only require one line of code.  Here's a quick example of what I'm talking about:

```java
Milliseconds milliseconds = new Milliseconds(new Minutes(1));
```

And then there's a few ways to retrieve the data

```java
milliseconds.toString(); // Decimal toString representation
milliseconds.toRoundedString(); // Integer toString representation
milliseconds.toRoundedLong(); // Rounded long returned
milliseconds.toBigDecimal(); // BigDecimal returned
milliseconds.toBigInteger(); // Rounded BigInteger returned
```

Custom Unit?
------------

This is no problem with Unitizer!  Feel free to add your own units, and they will automatically work with other.

Here's how you can make your own Time unit:

```java
public class HotMinute extends Time{
    
    /* ========== Constructors ========== */
    public HotMinute(BigDecimal numUnits) { super(numUnits); }
    public HotMinute(BigInteger numUnits) { super(numUnits); }
    public HotMinute(String numUnits) { super(numUnits); }
    public HotMinute(double numUnits) { super(numUnits); }
    public HotMinute(int numUnits) { super(numUnits); }
    public HotMinute(long numUnits) { super(numUnits); }
    public HotMinute(Time time){ super(time); }
    
    /* ========== Overridden ========== */
    public static final int RELATIVE_TO_SECOND = 12050;

    @Override
    protected BigDecimal relativeToStandard() {
        return new BigDecimal(RELATIVE_TO_SECOND);
    }

}
```

Now you can start to use this with other times.


```java
//Converting into a HotMinute
HotMinute hotMinute = new HotMinute(new Second(100));

//Converting into other units
Hour hour = new Hour(new HotMinute(1));
```
