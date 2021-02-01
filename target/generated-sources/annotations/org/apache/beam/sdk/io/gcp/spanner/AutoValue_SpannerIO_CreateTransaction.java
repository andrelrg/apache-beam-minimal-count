package org.apache.beam.sdk.io.gcp.spanner;

import com.google.cloud.spanner.TimestampBound;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_SpannerIO_CreateTransaction extends SpannerIO.CreateTransaction {

  private final SpannerConfig spannerConfig;

  private final TimestampBound timestampBound;

  private AutoValue_SpannerIO_CreateTransaction(
      SpannerConfig spannerConfig,
      TimestampBound timestampBound) {
    this.spannerConfig = spannerConfig;
    this.timestampBound = timestampBound;
  }

  @Override
  SpannerConfig getSpannerConfig() {
    return spannerConfig;
  }

  @Override
  TimestampBound getTimestampBound() {
    return timestampBound;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SpannerIO.CreateTransaction) {
      SpannerIO.CreateTransaction that = (SpannerIO.CreateTransaction) o;
      return this.spannerConfig.equals(that.getSpannerConfig())
          && this.timestampBound.equals(that.getTimestampBound());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= spannerConfig.hashCode();
    h$ *= 1000003;
    h$ ^= timestampBound.hashCode();
    return h$;
  }

  @Override
  SpannerIO.CreateTransaction.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends SpannerIO.CreateTransaction.Builder {
    private SpannerConfig spannerConfig;
    private TimestampBound timestampBound;
    Builder() {
    }
    private Builder(SpannerIO.CreateTransaction source) {
      this.spannerConfig = source.getSpannerConfig();
      this.timestampBound = source.getTimestampBound();
    }
    @Override
    public SpannerIO.CreateTransaction.Builder setSpannerConfig(SpannerConfig spannerConfig) {
      if (spannerConfig == null) {
        throw new NullPointerException("Null spannerConfig");
      }
      this.spannerConfig = spannerConfig;
      return this;
    }
    @Override
    public SpannerIO.CreateTransaction.Builder setTimestampBound(TimestampBound timestampBound) {
      if (timestampBound == null) {
        throw new NullPointerException("Null timestampBound");
      }
      this.timestampBound = timestampBound;
      return this;
    }
    @Override
    public SpannerIO.CreateTransaction build() {
      String missing = "";
      if (this.spannerConfig == null) {
        missing += " spannerConfig";
      }
      if (this.timestampBound == null) {
        missing += " timestampBound";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_SpannerIO_CreateTransaction(
          this.spannerConfig,
          this.timestampBound);
    }
  }

}
