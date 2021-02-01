package org.apache.beam.sdk.io.gcp.spanner;

import com.google.cloud.spanner.TimestampBound;
import javax.annotation.Generated;
import org.apache.beam.sdk.values.PCollectionView;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_NaiveSpannerRead extends NaiveSpannerRead {

  private final SpannerConfig spannerConfig;

  private final PCollectionView<Transaction> txView;

  private final TimestampBound timestampBound;

  AutoValue_NaiveSpannerRead(
      SpannerConfig spannerConfig,
      PCollectionView<Transaction> txView,
      TimestampBound timestampBound) {
    if (spannerConfig == null) {
      throw new NullPointerException("Null spannerConfig");
    }
    this.spannerConfig = spannerConfig;
    if (txView == null) {
      throw new NullPointerException("Null txView");
    }
    this.txView = txView;
    if (timestampBound == null) {
      throw new NullPointerException("Null timestampBound");
    }
    this.timestampBound = timestampBound;
  }

  @Override
  SpannerConfig getSpannerConfig() {
    return spannerConfig;
  }

  @Override
  PCollectionView<Transaction> getTxView() {
    return txView;
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
    if (o instanceof NaiveSpannerRead) {
      NaiveSpannerRead that = (NaiveSpannerRead) o;
      return this.spannerConfig.equals(that.getSpannerConfig())
          && this.txView.equals(that.getTxView())
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
    h$ ^= txView.hashCode();
    h$ *= 1000003;
    h$ ^= timestampBound.hashCode();
    return h$;
  }

}
