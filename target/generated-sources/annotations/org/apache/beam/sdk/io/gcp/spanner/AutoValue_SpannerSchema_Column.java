package org.apache.beam.sdk.io.gcp.spanner;

import com.google.cloud.spanner.Type;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_SpannerSchema_Column extends SpannerSchema.Column {

  private final String name;

  private final Type type;

  AutoValue_SpannerSchema_Column(
      String name,
      Type type) {
    if (name == null) {
      throw new NullPointerException("Null name");
    }
    this.name = name;
    if (type == null) {
      throw new NullPointerException("Null type");
    }
    this.type = type;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public Type getType() {
    return type;
  }

  @Override
  public String toString() {
    return "Column{"
        + "name=" + name + ", "
        + "type=" + type
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SpannerSchema.Column) {
      SpannerSchema.Column that = (SpannerSchema.Column) o;
      return this.name.equals(that.getName())
          && this.type.equals(that.getType());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= name.hashCode();
    h$ *= 1000003;
    h$ ^= type.hashCode();
    return h$;
  }

}
