/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.google.cloud.teleport.bigtable;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class BigtableRow extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -6606001785591080853L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"BigtableRow\",\"namespace\":\"com.google.cloud.teleport.bigtable\",\"fields\":[{\"name\":\"key\",\"type\":\"bytes\"},{\"name\":\"cells\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"BigtableCell\",\"fields\":[{\"name\":\"family\",\"type\":\"string\"},{\"name\":\"qualifier\",\"type\":\"bytes\"},{\"name\":\"timestamp\",\"type\":\"long\",\"logicalType\":\"timestamp-micros\"},{\"name\":\"value\",\"type\":\"bytes\"}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<BigtableRow> ENCODER =
      new BinaryMessageEncoder<BigtableRow>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<BigtableRow> DECODER =
      new BinaryMessageDecoder<BigtableRow>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<BigtableRow> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<BigtableRow> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<BigtableRow>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this BigtableRow to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a BigtableRow from a ByteBuffer. */
  public static BigtableRow fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.nio.ByteBuffer key;
  @Deprecated public java.util.List<com.google.cloud.teleport.bigtable.BigtableCell> cells;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public BigtableRow() {}

  /**
   * All-args constructor.
   * @param key The new value for key
   * @param cells The new value for cells
   */
  public BigtableRow(java.nio.ByteBuffer key, java.util.List<com.google.cloud.teleport.bigtable.BigtableCell> cells) {
    this.key = key;
    this.cells = cells;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return key;
    case 1: return cells;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: key = (java.nio.ByteBuffer)value$; break;
    case 1: cells = (java.util.List<com.google.cloud.teleport.bigtable.BigtableCell>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'key' field.
   * @return The value of the 'key' field.
   */
  public java.nio.ByteBuffer getKey() {
    return key;
  }

  /**
   * Sets the value of the 'key' field.
   * @param value the value to set.
   */
  public void setKey(java.nio.ByteBuffer value) {
    this.key = value;
  }

  /**
   * Gets the value of the 'cells' field.
   * @return The value of the 'cells' field.
   */
  public java.util.List<com.google.cloud.teleport.bigtable.BigtableCell> getCells() {
    return cells;
  }

  /**
   * Sets the value of the 'cells' field.
   * @param value the value to set.
   */
  public void setCells(java.util.List<com.google.cloud.teleport.bigtable.BigtableCell> value) {
    this.cells = value;
  }

  /**
   * Creates a new BigtableRow RecordBuilder.
   * @return A new BigtableRow RecordBuilder
   */
  public static com.google.cloud.teleport.bigtable.BigtableRow.Builder newBuilder() {
    return new com.google.cloud.teleport.bigtable.BigtableRow.Builder();
  }

  /**
   * Creates a new BigtableRow RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new BigtableRow RecordBuilder
   */
  public static com.google.cloud.teleport.bigtable.BigtableRow.Builder newBuilder(com.google.cloud.teleport.bigtable.BigtableRow.Builder other) {
    return new com.google.cloud.teleport.bigtable.BigtableRow.Builder(other);
  }

  /**
   * Creates a new BigtableRow RecordBuilder by copying an existing BigtableRow instance.
   * @param other The existing instance to copy.
   * @return A new BigtableRow RecordBuilder
   */
  public static com.google.cloud.teleport.bigtable.BigtableRow.Builder newBuilder(com.google.cloud.teleport.bigtable.BigtableRow other) {
    return new com.google.cloud.teleport.bigtable.BigtableRow.Builder(other);
  }

  /**
   * RecordBuilder for BigtableRow instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<BigtableRow>
    implements org.apache.avro.data.RecordBuilder<BigtableRow> {

    private java.nio.ByteBuffer key;
    private java.util.List<com.google.cloud.teleport.bigtable.BigtableCell> cells;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.google.cloud.teleport.bigtable.BigtableRow.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.key)) {
        this.key = data().deepCopy(fields()[0].schema(), other.key);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.cells)) {
        this.cells = data().deepCopy(fields()[1].schema(), other.cells);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing BigtableRow instance
     * @param other The existing instance to copy.
     */
    private Builder(com.google.cloud.teleport.bigtable.BigtableRow other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.key)) {
        this.key = data().deepCopy(fields()[0].schema(), other.key);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.cells)) {
        this.cells = data().deepCopy(fields()[1].schema(), other.cells);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'key' field.
      * @return The value.
      */
    public java.nio.ByteBuffer getKey() {
      return key;
    }

    /**
      * Sets the value of the 'key' field.
      * @param value The value of 'key'.
      * @return This builder.
      */
    public com.google.cloud.teleport.bigtable.BigtableRow.Builder setKey(java.nio.ByteBuffer value) {
      validate(fields()[0], value);
      this.key = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'key' field has been set.
      * @return True if the 'key' field has been set, false otherwise.
      */
    public boolean hasKey() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'key' field.
      * @return This builder.
      */
    public com.google.cloud.teleport.bigtable.BigtableRow.Builder clearKey() {
      key = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'cells' field.
      * @return The value.
      */
    public java.util.List<com.google.cloud.teleport.bigtable.BigtableCell> getCells() {
      return cells;
    }

    /**
      * Sets the value of the 'cells' field.
      * @param value The value of 'cells'.
      * @return This builder.
      */
    public com.google.cloud.teleport.bigtable.BigtableRow.Builder setCells(java.util.List<com.google.cloud.teleport.bigtable.BigtableCell> value) {
      validate(fields()[1], value);
      this.cells = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'cells' field has been set.
      * @return True if the 'cells' field has been set, false otherwise.
      */
    public boolean hasCells() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'cells' field.
      * @return This builder.
      */
    public com.google.cloud.teleport.bigtable.BigtableRow.Builder clearCells() {
      cells = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public BigtableRow build() {
      try {
        BigtableRow record = new BigtableRow();
        record.key = fieldSetFlags()[0] ? this.key : (java.nio.ByteBuffer) defaultValue(fields()[0]);
        record.cells = fieldSetFlags()[1] ? this.cells : (java.util.List<com.google.cloud.teleport.bigtable.BigtableCell>) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<BigtableRow>
    WRITER$ = (org.apache.avro.io.DatumWriter<BigtableRow>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<BigtableRow>
    READER$ = (org.apache.avro.io.DatumReader<BigtableRow>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
