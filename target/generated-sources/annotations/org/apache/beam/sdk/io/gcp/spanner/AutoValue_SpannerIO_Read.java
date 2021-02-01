package org.apache.beam.sdk.io.gcp.spanner;

import com.google.cloud.spanner.PartitionOptions;
import com.google.cloud.spanner.TimestampBound;
import javax.annotation.Generated;
import org.apache.beam.sdk.values.PCollectionView;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_SpannerIO_Read extends SpannerIO.Read {

  private final SpannerConfig spannerConfig;

  private final ReadOperation readOperation;

  private final TimestampBound timestampBound;

  private final PCollectionView<Transaction> transaction;

  private final PartitionOptions partitionOptions;

  private final Boolean batching;

  private AutoValue_SpannerIO_Read(
      SpannerConfig spannerConfig,
      ReadOperation readOperation,
      TimestampBound timestampBound,
      PCollectionView<Transaction> transaction,
      PartitionOptions partitionOptions,
      Boolean batching) {
    this.spannerConfig = spannerConfig;
    this.readOperation = readOperation;
    this.timestampBound = timestampBound;
    this.transaction = transaction;
    this.partitionOptions = partitionOptions;
    this.batching = batching;
  }

  @Override
  SpannerConfig getSpannerConfig() {
    return spannerConfig;
  }

  @Override
  ReadOperation getReadOperation() {
    return readOperation;
  }

  @Override
  TimestampBound getTimestampBound() {
    return timestampBound;
  }

  @Override
  PCollectionView<Transaction> getTransaction() {
    return transaction;
  }

  @Override
  PartitionOptions getPartitionOptions() {
    return partitionOptions;
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
    if (o instanceof SpannerIO.Read) {
      SpannerIO.Read that = (SpannerIO.Read) o;
      return this.spannerConfig.equals(that.getSpannerConfig())
          && this.readOperation.equals(that.getReadOperation())
          && this.timestampBound.equals(that.getTimestampBound())
          && this.transaction.equals(that.getTransaction())
          && this.partitionOptions.equals(that.getPartitionOptions())
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
    h$ ^= readOperation.hashCode();
    h$ *= 1000003;
    h$ ^= timestampBound.hashCode();
    h$ *= 1000003;
    h$ ^= transaction.hashCode();
    h$ *= 1000003;
    h$ ^= partitionOptions.hashCode();
    h$ *= 1000003;
    h$ ^= batching.hashCode();
    return h$;
  }

  @Override
  SpannerIO.Read.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends SpannerIO.Read.Builder {
    private SpannerConfig spannerConfig;
    private ReadOperation readOperation;
    private TimestampBound timestampBound;
    private PCollectionView<Transaction> transaction;
    private PartitionOptions partitionOptions;
    private Boolean batching;
    Builder() {
    }
    private Builder(SpannerIO.Read source) {
      this.spannerConfig = source.getSpannerConfig();
      this.readOperation = source.getReadOperation();
      this.timestampBound = source.getTimestampBound();
      this.transaction = source.getTransaction();
      this.partitionOptions = source.getPartitionOptions();
      this.batching = source.getBatching();
    }
    @Override
    SpannerIO.Read.Builder setSpannerConfig(SpannerConfig spannerConfig) {
      if (spannerConfig == null) {
        throw new NullPointerException("Null spannerConfig");
      }
      this.spannerConfig = spannerConfig;
      return this;
    }
    @Override
    SpannerIO.Read.Builder setReadOperation(ReadOperation readOperation) {
      if (readOperation == null) {
        throw new NullPointerException("Null readOperation");
      }
      this.readOperation = readOperation;
      return this;
    }
    @Override
    SpannerIO.Read.Builder setTimestampBound(TimestampBound timestampBound) {
      if (timestampBound == null) {
        throw new NullPointerException("Null timestampBound");
      }
      this.timestampBound = timestampBound;
      return this;
    }
    @Override
    SpannerIO.Read.Builder setTransaction(PCollectionView<Transaction> transaction) {
      if (transaction == null) {
        throw new NullPointerException("Null transaction");
      }
      this.transaction = transaction;
      return this;
    }
    @Override
    SpannerIO.Read.Builder setPartitionOptions(PartitionOptions partitionOptions) {
      if (partitionOptions == null) {
        throw new NullPointerException("Null partitionOptions");
      }
      this.partitionOptions = partitionOptions;
      return this;
    }
    @Override
    SpannerIO.Read.Builder setBatching(Boolean batching) {
      if (batching == null) {
        throw new NullPointerException("Null batching");
      }
      this.batching = batching;
      return this;
    }
    @Override
    SpannerIO.Read build() {
      String missing = "";
      if (this.spannerConfig == null) {
        missing += " spannerConfig";
      }
      if (this.readOperation == null) {
        missing += " readOperation";
      }
      if (this.timestampBound == null) {
        missing += " timestampBound";
      }
      if (this.transaction == null) {
        missing += " transaction";
      }
      if (this.partitionOptions == null) {
        missing += " partitionOptions";
      }
      if (this.batching == null) {
        missing += " batching";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_SpannerIO_Read(
          this.spannerConfig,
          this.readOperation,
          this.timestampBound,
          this.transaction,
          this.partitionOptions,
          this.batching);
    }
  }

}
