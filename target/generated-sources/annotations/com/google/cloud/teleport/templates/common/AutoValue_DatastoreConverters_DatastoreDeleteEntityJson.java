package com.google.cloud.teleport.templates.common;

import javax.annotation.Generated;
import org.apache.beam.sdk.options.ValueProvider;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_DatastoreConverters_DatastoreDeleteEntityJson extends DatastoreConverters.DatastoreDeleteEntityJson {

  private final ValueProvider<String> projectId;

  private AutoValue_DatastoreConverters_DatastoreDeleteEntityJson(
      ValueProvider<String> projectId) {
    this.projectId = projectId;
  }

  @Override
  public ValueProvider<String> projectId() {
    return projectId;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DatastoreConverters.DatastoreDeleteEntityJson) {
      DatastoreConverters.DatastoreDeleteEntityJson that = (DatastoreConverters.DatastoreDeleteEntityJson) o;
      return this.projectId.equals(that.projectId());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= projectId.hashCode();
    return h$;
  }

  static final class Builder extends DatastoreConverters.DatastoreDeleteEntityJson.Builder {
    private ValueProvider<String> projectId;
    Builder() {
    }
    @Override
    public DatastoreConverters.DatastoreDeleteEntityJson.Builder setProjectId(ValueProvider<String> projectId) {
      if (projectId == null) {
        throw new NullPointerException("Null projectId");
      }
      this.projectId = projectId;
      return this;
    }
    @Override
    public DatastoreConverters.DatastoreDeleteEntityJson build() {
      String missing = "";
      if (this.projectId == null) {
        missing += " projectId";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_DatastoreConverters_DatastoreDeleteEntityJson(
          this.projectId);
    }
  }

}
