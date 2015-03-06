/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.example.mrtest;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Stocks extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Stocks\",\"namespace\":\"com.example.mrtest\",\"fields\":[{\"name\":\"Symbol\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"Date\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"Open\",\"type\":[\"null\",\"double\"]},{\"name\":\"High\",\"type\":[\"null\",\"double\"]},{\"name\":\"Low\",\"type\":[\"null\",\"double\"]},{\"name\":\"Close\",\"type\":[\"null\",\"double\"]},{\"name\":\"Volume\",\"type\":[\"null\",\"long\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.lang.String Symbol;
   private java.lang.String Date;
   private java.lang.Double Open;
   private java.lang.Double High;
   private java.lang.Double Low;
   private java.lang.Double Close;
   private java.lang.Long Volume;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public Stocks() {}

  /**
   * All-args constructor.
   */
  public Stocks(java.lang.String Symbol, java.lang.String Date, java.lang.Double Open, java.lang.Double High, java.lang.Double Low, java.lang.Double Close, java.lang.Long Volume) {
    this.Symbol = Symbol;
    this.Date = Date;
    this.Open = Open;
    this.High = High;
    this.Low = Low;
    this.Close = Close;
    this.Volume = Volume;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return Symbol;
    case 1: return Date;
    case 2: return Open;
    case 3: return High;
    case 4: return Low;
    case 5: return Close;
    case 6: return Volume;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: Symbol = (java.lang.String)value$; break;
    case 1: Date = (java.lang.String)value$; break;
    case 2: Open = (java.lang.Double)value$; break;
    case 3: High = (java.lang.Double)value$; break;
    case 4: Low = (java.lang.Double)value$; break;
    case 5: Close = (java.lang.Double)value$; break;
    case 6: Volume = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'Symbol' field.
   */
  public java.lang.String getSymbol() {
    return Symbol;
  }

  /**
   * Sets the value of the 'Symbol' field.
   * @param value the value to set.
   */
  public void setSymbol(java.lang.String value) {
    this.Symbol = value;
  }

  /**
   * Gets the value of the 'Date' field.
   */
  public java.lang.String getDate() {
    return Date;
  }

  /**
   * Sets the value of the 'Date' field.
   * @param value the value to set.
   */
  public void setDate(java.lang.String value) {
    this.Date = value;
  }

  /**
   * Gets the value of the 'Open' field.
   */
  public java.lang.Double getOpen() {
    return Open;
  }

  /**
   * Sets the value of the 'Open' field.
   * @param value the value to set.
   */
  public void setOpen(java.lang.Double value) {
    this.Open = value;
  }

  /**
   * Gets the value of the 'High' field.
   */
  public java.lang.Double getHigh() {
    return High;
  }

  /**
   * Sets the value of the 'High' field.
   * @param value the value to set.
   */
  public void setHigh(java.lang.Double value) {
    this.High = value;
  }

  /**
   * Gets the value of the 'Low' field.
   */
  public java.lang.Double getLow() {
    return Low;
  }

  /**
   * Sets the value of the 'Low' field.
   * @param value the value to set.
   */
  public void setLow(java.lang.Double value) {
    this.Low = value;
  }

  /**
   * Gets the value of the 'Close' field.
   */
  public java.lang.Double getClose() {
    return Close;
  }

  /**
   * Sets the value of the 'Close' field.
   * @param value the value to set.
   */
  public void setClose(java.lang.Double value) {
    this.Close = value;
  }

  /**
   * Gets the value of the 'Volume' field.
   */
  public java.lang.Long getVolume() {
    return Volume;
  }

  /**
   * Sets the value of the 'Volume' field.
   * @param value the value to set.
   */
  public void setVolume(java.lang.Long value) {
    this.Volume = value;
  }

  /** Creates a new Stocks RecordBuilder */
  public static com.example.mrtest.Stocks.Builder newBuilder() {
    return new com.example.mrtest.Stocks.Builder();
  }
  
  /** Creates a new Stocks RecordBuilder by copying an existing Builder */
  public static com.example.mrtest.Stocks.Builder newBuilder(com.example.mrtest.Stocks.Builder other) {
    return new com.example.mrtest.Stocks.Builder(other);
  }
  
  /** Creates a new Stocks RecordBuilder by copying an existing Stocks instance */
  public static com.example.mrtest.Stocks.Builder newBuilder(com.example.mrtest.Stocks other) {
    return new com.example.mrtest.Stocks.Builder(other);
  }
  
  /**
   * RecordBuilder for Stocks instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Stocks>
    implements org.apache.avro.data.RecordBuilder<Stocks> {

    private java.lang.String Symbol;
    private java.lang.String Date;
    private java.lang.Double Open;
    private java.lang.Double High;
    private java.lang.Double Low;
    private java.lang.Double Close;
    private java.lang.Long Volume;

    /** Creates a new Builder */
    private Builder() {
      super(com.example.mrtest.Stocks.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.example.mrtest.Stocks.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.Symbol)) {
        this.Symbol = data().deepCopy(fields()[0].schema(), other.Symbol);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.Date)) {
        this.Date = data().deepCopy(fields()[1].schema(), other.Date);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.Open)) {
        this.Open = data().deepCopy(fields()[2].schema(), other.Open);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.High)) {
        this.High = data().deepCopy(fields()[3].schema(), other.High);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.Low)) {
        this.Low = data().deepCopy(fields()[4].schema(), other.Low);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.Close)) {
        this.Close = data().deepCopy(fields()[5].schema(), other.Close);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.Volume)) {
        this.Volume = data().deepCopy(fields()[6].schema(), other.Volume);
        fieldSetFlags()[6] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Stocks instance */
    private Builder(com.example.mrtest.Stocks other) {
            super(com.example.mrtest.Stocks.SCHEMA$);
      if (isValidValue(fields()[0], other.Symbol)) {
        this.Symbol = data().deepCopy(fields()[0].schema(), other.Symbol);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.Date)) {
        this.Date = data().deepCopy(fields()[1].schema(), other.Date);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.Open)) {
        this.Open = data().deepCopy(fields()[2].schema(), other.Open);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.High)) {
        this.High = data().deepCopy(fields()[3].schema(), other.High);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.Low)) {
        this.Low = data().deepCopy(fields()[4].schema(), other.Low);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.Close)) {
        this.Close = data().deepCopy(fields()[5].schema(), other.Close);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.Volume)) {
        this.Volume = data().deepCopy(fields()[6].schema(), other.Volume);
        fieldSetFlags()[6] = true;
      }
    }

    /** Gets the value of the 'Symbol' field */
    public java.lang.String getSymbol() {
      return Symbol;
    }
    
    /** Sets the value of the 'Symbol' field */
    public com.example.mrtest.Stocks.Builder setSymbol(java.lang.String value) {
      validate(fields()[0], value);
      this.Symbol = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'Symbol' field has been set */
    public boolean hasSymbol() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'Symbol' field */
    public com.example.mrtest.Stocks.Builder clearSymbol() {
      Symbol = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'Date' field */
    public java.lang.String getDate() {
      return Date;
    }
    
    /** Sets the value of the 'Date' field */
    public com.example.mrtest.Stocks.Builder setDate(java.lang.String value) {
      validate(fields()[1], value);
      this.Date = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'Date' field has been set */
    public boolean hasDate() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'Date' field */
    public com.example.mrtest.Stocks.Builder clearDate() {
      Date = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'Open' field */
    public java.lang.Double getOpen() {
      return Open;
    }
    
    /** Sets the value of the 'Open' field */
    public com.example.mrtest.Stocks.Builder setOpen(java.lang.Double value) {
      validate(fields()[2], value);
      this.Open = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'Open' field has been set */
    public boolean hasOpen() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'Open' field */
    public com.example.mrtest.Stocks.Builder clearOpen() {
      Open = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'High' field */
    public java.lang.Double getHigh() {
      return High;
    }
    
    /** Sets the value of the 'High' field */
    public com.example.mrtest.Stocks.Builder setHigh(java.lang.Double value) {
      validate(fields()[3], value);
      this.High = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'High' field has been set */
    public boolean hasHigh() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'High' field */
    public com.example.mrtest.Stocks.Builder clearHigh() {
      High = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'Low' field */
    public java.lang.Double getLow() {
      return Low;
    }
    
    /** Sets the value of the 'Low' field */
    public com.example.mrtest.Stocks.Builder setLow(java.lang.Double value) {
      validate(fields()[4], value);
      this.Low = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'Low' field has been set */
    public boolean hasLow() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'Low' field */
    public com.example.mrtest.Stocks.Builder clearLow() {
      Low = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'Close' field */
    public java.lang.Double getClose() {
      return Close;
    }
    
    /** Sets the value of the 'Close' field */
    public com.example.mrtest.Stocks.Builder setClose(java.lang.Double value) {
      validate(fields()[5], value);
      this.Close = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'Close' field has been set */
    public boolean hasClose() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'Close' field */
    public com.example.mrtest.Stocks.Builder clearClose() {
      Close = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'Volume' field */
    public java.lang.Long getVolume() {
      return Volume;
    }
    
    /** Sets the value of the 'Volume' field */
    public com.example.mrtest.Stocks.Builder setVolume(java.lang.Long value) {
      validate(fields()[6], value);
      this.Volume = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'Volume' field has been set */
    public boolean hasVolume() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'Volume' field */
    public com.example.mrtest.Stocks.Builder clearVolume() {
      Volume = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    public Stocks build() {
      try {
        Stocks record = new Stocks();
        record.Symbol = fieldSetFlags()[0] ? this.Symbol : (java.lang.String) defaultValue(fields()[0]);
        record.Date = fieldSetFlags()[1] ? this.Date : (java.lang.String) defaultValue(fields()[1]);
        record.Open = fieldSetFlags()[2] ? this.Open : (java.lang.Double) defaultValue(fields()[2]);
        record.High = fieldSetFlags()[3] ? this.High : (java.lang.Double) defaultValue(fields()[3]);
        record.Low = fieldSetFlags()[4] ? this.Low : (java.lang.Double) defaultValue(fields()[4]);
        record.Close = fieldSetFlags()[5] ? this.Close : (java.lang.Double) defaultValue(fields()[5]);
        record.Volume = fieldSetFlags()[6] ? this.Volume : (java.lang.Long) defaultValue(fields()[6]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
