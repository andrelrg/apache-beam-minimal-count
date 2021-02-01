package com.google.cloud.teleport.templates.common;

import javax.annotation.Generated;
import org.apache.beam.sdk.options.ValueProvider;
import org.apache.beam.sdk.values.TupleTag;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_DatastoreConverters_WriteEntities extends DatastoreConverters.WriteEntities {

  private final ValueProvider<String> projectId;

  private final TupleTag<String> errorTag;

  private AutoValue_DatastoreConverters_WriteEntities(
      ValueProvider<String> projectId,
      TupleTag<String> errorTag) {
    this.projectId = projectId;
    this.errorTag = errorTag;
  }

  @Override
  public ValueProvider<String> projectId() {
    return projectId;
  }

  @Override
  public TupleTag<String> errorTag() {
    return errorTag;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DatastoreConverters.WriteEntities) {
      DatastoreConverters.WriteEntities that = (DatastoreConverters.WriteEntities) o;
      return this.projectId.equals(that.projectId())
          && this.errorTag.equals(that.errorTag());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= projectId.hashCode();
    h$ *= 1000003;
    h$ ^= errorTag.hashCode();
    return h$;
  }

  static final class Builder extends DatastoreConverters.WriteEntities.Builder {
    private ValueProvider<String> projectId;
    private TupleTag<String> errorTag;
    Builder() {
    }
    @Override
    public DatastoreConverters.WriteEntities.Builder setProjectId(ValueProvider<String> projectId) {
      if (projectId == null) {
        throw new NullPointerException("Null projectId");
      }
      this.projectId = projectId;
      return this;
    }
    @Override
    public DatastoreConverters.WriteEntities.Builder setErrorTag(TupleTag<String> errorTag) {
      if (errorTag == null) {
        throw new NullPointerException("Null errorTag");
      }
      this.errorTag = errorTag;
      return this;
    }
    @Override
    public DatastoreConverters.WriteEntities build() {
      String missing = "";
      if (this.projectId == null) {
        missing += " projectId";
      }
      if (this.errorTag == null) {
        missing += " errorTag";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_DatastoreConverters_WriteEntities(
          this.projectId,
          this.errorTag);
    }
  }

}
