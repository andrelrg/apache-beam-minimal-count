package org.apache.beam.sdk.io.gcp.spanner;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_SpannerSchema_KeyPart extends SpannerSchema.KeyPart {

  private final String field;

  private final boolean desc;

  AutoValue_SpannerSchema_KeyPart(
      String field,
      boolean desc) {
    if (field == null) {
      throw new NullPointerException("Null field");
    }
    this.field = field;
    this.desc = desc;
  }

  @Override
  String getField() {
    return field;
  }

  @Override
  boolean isDesc() {
    return desc;
  }

  @Override
  public String toString() {
    return "KeyPart{"
        + "field=" + field + ", "
        + "desc=" + desc
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SpannerSchema.KeyPart) {
      SpannerSchema.KeyPart that = (SpannerSchema.KeyPart) o;
      return this.field.equals(that.getField())
          && this.desc == that.isDesc();
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= field.hashCode();
    h$ *= 1000003;
    h$ ^= desc ? 1231 : 1237;
    return h$;
  }

}
