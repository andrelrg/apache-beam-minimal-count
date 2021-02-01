package org.apache.beam.sdk.io.gcp.spanner;

import com.google.cloud.spanner.TimestampBound;
import javax.annotation.Generated;
import org.apache.beam.sdk.values.PCollectionView;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_SpannerIO_ReadAll extends SpannerIO.ReadAll {

  private final SpannerConfig spannerConfig;

  private final PCollectionView<Transaction> transaction;

  private final TimestampBound timestampBound;

  private final Boolean batching;

  private AutoValue_SpannerIO_ReadAll(
      SpannerConfig spannerConfig,
      PCollectionView<Transaction> transaction,
      TimestampBound timestampBound,
      Boolean batching) {
    this.spannerConfig = spannerConfig;
    this.transaction = transaction;
    this.timestampBound = timestampBound;
    this.batching = batching;
  }

  @Override
  SpannerConfig getSpannerConfig() {
    return spannerConfig;
  }

  @Override
  PCollectionView<Transaction> getTransaction() {
    return transaction;
  }

  @Override
  TimestampBound getTimestampBound() {
    return timestampBound;
  }

  @Override
  Boolean getBatching() {
    return batching;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SpannerIO.ReadAll) {
      SpannerIO.ReadAll that = (SpannerIO.ReadAll) o;
      return this.spannerConfig.equals(that.getSpannerConfig())
          && this.transaction.equals(that.getTransaction())
          && this.timestampBound.equals(that.getTimestampBound())
          && this.batching.equals(that.getBatching());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= spannerConfig.hashCode();
    h$ *= 1000003;
    h$ ^= transaction.hashCode();
    h$ *= 1000003;
    h$ ^= timestampBound.hashCode();
    h$ *= 1000003;
    h$ ^= batching.hashCode();
    return h$;
  }

  @Override
  SpannerIO.ReadAll.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends SpannerIO.ReadAll.Builder {
    private SpannerConfig spannerConfig;
    private PCollectionView<Transaction> transaction;
    private TimestampBound timestampBound;
    private Boolean batching;
    Builder() {
    }
    private Builder(SpannerIO.ReadAll source) {
      this.spannerConfig = source.getSpannerConfig();
      this.transaction = source.getTransaction();
      this.timestampBound = source.getTimestampBound();
      this.batching = source.getBatching();
    }
    @Override
    SpannerIO.ReadAll.Builder setSpannerConfig(SpannerConfig spannerConfig) {
      if (spannerConfig == null) {
        throw new NullPointerException("Null spannerConfig");
      }
      this.spannerConfig = spannerConfig;
      return this;
    }
    @Override
    SpannerIO.ReadAll.Builder setTransaction(PCollectionView<Transaction> transaction) {
      if (transaction == null) {
        throw new NullPointerException("Null transaction");
      }
      this.transaction = transaction;
      return this;
    }
    @Override
    SpannerIO.ReadAll.Builder setTimestampBound(TimestampBound timestampBound) {
      if (timestampBound == null) {
        throw new NullPointerException("Null timestampBound");
      }
      this.timestampBound = timestampBound;
      return this;
    }
    @Override
    SpannerIO.ReadAll.Builder setBatching(Boolean batching) {
      if (batching == null) {
        throw new NullPointerException("Null batching");
      }
      this.batching = batching;
      return this;
    }
    @Override
    SpannerIO.ReadAll build() {
      String missing = "";
      if (this.spannerConfig == null) {
        missing += " spannerConfig";
      }
      if (this.transaction == null) {
        missing += " transaction";
      }
      if (this.timestampBound == null) {
        missing += " timestampBound";
      }
      if (this.batching == null) {
        missing += " batching";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_SpannerIO_ReadAll(
          this.spannerConfig,
          this.transaction,
          this.timestampBound,
          this.batching);
    }
  }

}
