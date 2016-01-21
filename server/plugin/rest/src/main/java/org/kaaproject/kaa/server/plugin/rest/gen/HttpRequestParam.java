/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.server.plugin.rest.gen;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class HttpRequestParam extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"HttpRequestParam\",\"namespace\":\"org.kaaproject.kaa.server.plugin.rest.gen\",\"fields\":[{\"name\":\"paramName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"inputMessageField\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.lang.String paramName;
   private java.lang.String inputMessageField;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public HttpRequestParam() {}

  /**
   * All-args constructor.
   */
  public HttpRequestParam(java.lang.String paramName, java.lang.String inputMessageField) {
    this.paramName = paramName;
    this.inputMessageField = inputMessageField;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return paramName;
    case 1: return inputMessageField;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: paramName = (java.lang.String)value$; break;
    case 1: inputMessageField = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'paramName' field.
   */
  public java.lang.String getParamName() {
    return paramName;
  }

  /**
   * Sets the value of the 'paramName' field.
   * @param value the value to set.
   */
  public void setParamName(java.lang.String value) {
    this.paramName = value;
  }

  /**
   * Gets the value of the 'inputMessageField' field.
   */
  public java.lang.String getInputMessageField() {
    return inputMessageField;
  }

  /**
   * Sets the value of the 'inputMessageField' field.
   * @param value the value to set.
   */
  public void setInputMessageField(java.lang.String value) {
    this.inputMessageField = value;
  }

  /** Creates a new HttpRequestParam RecordBuilder */
  public static org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestParam.Builder newBuilder() {
    return new org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestParam.Builder();
  }
  
  /** Creates a new HttpRequestParam RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestParam.Builder newBuilder(org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestParam.Builder other) {
    return new org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestParam.Builder(other);
  }
  
  /** Creates a new HttpRequestParam RecordBuilder by copying an existing HttpRequestParam instance */
  public static org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestParam.Builder newBuilder(org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestParam other) {
    return new org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestParam.Builder(other);
  }
  
  /**
   * RecordBuilder for HttpRequestParam instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<HttpRequestParam>
    implements org.apache.avro.data.RecordBuilder<HttpRequestParam> {

    private java.lang.String paramName;
    private java.lang.String inputMessageField;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestParam.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestParam.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.paramName)) {
        this.paramName = data().deepCopy(fields()[0].schema(), other.paramName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.inputMessageField)) {
        this.inputMessageField = data().deepCopy(fields()[1].schema(), other.inputMessageField);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing HttpRequestParam instance */
    private Builder(org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestParam other) {
            super(org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestParam.SCHEMA$);
      if (isValidValue(fields()[0], other.paramName)) {
        this.paramName = data().deepCopy(fields()[0].schema(), other.paramName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.inputMessageField)) {
        this.inputMessageField = data().deepCopy(fields()[1].schema(), other.inputMessageField);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'paramName' field */
    public java.lang.String getParamName() {
      return paramName;
    }
    
    /** Sets the value of the 'paramName' field */
    public org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestParam.Builder setParamName(java.lang.String value) {
      validate(fields()[0], value);
      this.paramName = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'paramName' field has been set */
    public boolean hasParamName() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'paramName' field */
    public org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestParam.Builder clearParamName() {
      paramName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'inputMessageField' field */
    public java.lang.String getInputMessageField() {
      return inputMessageField;
    }
    
    /** Sets the value of the 'inputMessageField' field */
    public org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestParam.Builder setInputMessageField(java.lang.String value) {
      validate(fields()[1], value);
      this.inputMessageField = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'inputMessageField' field has been set */
    public boolean hasInputMessageField() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'inputMessageField' field */
    public org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestParam.Builder clearInputMessageField() {
      inputMessageField = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public HttpRequestParam build() {
      try {
        HttpRequestParam record = new HttpRequestParam();
        record.paramName = fieldSetFlags()[0] ? this.paramName : (java.lang.String) defaultValue(fields()[0]);
        record.inputMessageField = fieldSetFlags()[1] ? this.inputMessageField : (java.lang.String) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
