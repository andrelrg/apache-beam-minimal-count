package com.google.cloud.teleport.templates.common;

import javax.annotation.Generated;
import org.apache.beam.sdk.io.gcp.spanner.SpannerConfig;
import org.apache.beam.sdk.options.ValueProvider;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_SpannerConverters_ExportTransform extends SpannerConverters.ExportTransform {

  private final ValueProvider<String> table;

  private final SpannerConfig spannerConfig;

  private final ValueProvider<String> textWritePrefix;

  private AutoValue_SpannerConverters_ExportTransform(
      ValueProvider<String> table,
      SpannerConfig spannerConfig,
      ValueProvider<String> textWritePrefix) {
    this.table = table;
    this.spannerConfig = spannerConfig;
    this.textWritePrefix = textWritePrefix;
  }

  @Override
  ValueProvider<String> table() {
    return table;
  }

  @Override
  SpannerConfig spannerConfig() {
    return spannerConfig;
  }

  @Override
  ValueProvider<String> textWritePrefix() {
    return textWritePrefix;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SpannerConverters.ExportTransform) {
      SpannerConverters.ExportTransform that = (SpannerConverters.ExportTransform) o;
      return this.table.equals(that.table())
          && this.spannerConfig.equals(that.spannerConfig())
          && this.textWritePrefix.equals(that.textWritePrefix());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= table.hashCode();
    h$ *= 1000003;
    h$ ^= spannerConfig.hashCode();
    h$ *= 1000003;
    h$ ^= textWritePrefix.hashCode();
    return h$;
  }

  static final class Builder extends SpannerConverters.ExportTransform.Builder {
    private ValueProvider<String> table;
    private SpannerConfig spannerConfig;
    private ValueProvider<String> textWritePrefix;
    Builder() {
    }
    @Override
    public SpannerConverters.ExportTransform.Builder table(ValueProvider<String> table) {
      if (table == null) {
        throw new NullPointerException("Null table");
      }
      this.table = table;
      return this;
    }
    @Override
    public SpannerConverters.ExportTransform.Builder spannerConfig(SpannerConfig spannerConfig) {
      if (spannerConfig == null) {
        throw new NullPointerException("Null spannerConfig");
      }
      this.spannerConfig = spannerConfig;
      return this;
    }
    @Override
    public SpannerConverters.ExportTransform.Builder textWritePrefix(ValueProvider<String> textWritePrefix) {
      if (textWritePrefix == null) {
        throw new NullPointerException("Null textWritePrefix");
      }
      this.textWritePrefix = textWritePrefix;
      return this;
    }
    @Override
    public SpannerConverters.ExportTransform build() {
      String missing = "";
      if (this.table == null) {
        missing += " table";
      }
      if (this.spannerConfig == null) {
        missing += " spannerConfig";
      }
      if (this.textWritePrefix == null) {
        missing += " textWritePrefix";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_SpannerConverters_ExportTransform(
          this.table,
          this.spannerConfig,
          this.textWritePrefix);
    }
  }

}
