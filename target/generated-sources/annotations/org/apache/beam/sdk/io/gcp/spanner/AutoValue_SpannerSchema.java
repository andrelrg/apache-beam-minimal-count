package org.apache.beam.sdk.io.gcp.spanner;

import javax.annotation.Generated;
import org.apache.beam.vendor.guava.v26_0_jre.com.google.common.collect.ImmutableList;
import org.apache.beam.vendor.guava.v26_0_jre.com.google.common.collect.ImmutableListMultimap;
import org.apache.beam.vendor.guava.v26_0_jre.com.google.common.collect.ImmutableMap;
import org.apache.beam.vendor.guava.v26_0_jre.com.google.common.collect.ImmutableTable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_SpannerSchema extends SpannerSchema {

  private final ImmutableList<String> tables;

  private final ImmutableListMultimap<String, SpannerSchema.Column> columns;

  private final ImmutableListMultimap<String, SpannerSchema.KeyPart> keyParts;

  private final ImmutableTable<String, String, Long> cellsMutatedPerColumn;

  private final ImmutableMap<String, Long> cellsMutatedPerRow;

  private AutoValue_SpannerSchema(
      ImmutableList<String> tables,
      ImmutableListMultimap<String, SpannerSchema.Column> columns,
      ImmutableListMultimap<String, SpannerSchema.KeyPart> keyParts,
      ImmutableTable<String, String, Long> cellsMutatedPerColumn,
      ImmutableMap<String, Long> cellsMutatedPerRow) {
    this.tables = tables;
    this.columns = columns;
    this.keyParts = keyParts;
    this.cellsMutatedPerColumn = cellsMutatedPerColumn;
    this.cellsMutatedPerRow = cellsMutatedPerRow;
  }

  @Override
  ImmutableList<String> tables() {
    return tables;
  }

  @Override
  ImmutableListMultimap<String, SpannerSchema.Column> columns() {
    return columns;
  }

  @Override
  ImmutableListMultimap<String, SpannerSchema.KeyPart> keyParts() {
    return keyParts;
  }

  @Override
  ImmutableTable<String, String, Long> cellsMutatedPerColumn() {
    return cellsMutatedPerColumn;
  }

  @Override
  ImmutableMap<String, Long> cellsMutatedPerRow() {
    return cellsMutatedPerRow;
  }

  @Override
  public String toString() {
    return "SpannerSchema{"
        + "tables=" + tables + ", "
        + "columns=" + columns + ", "
        + "keyParts=" + keyParts + ", "
        + "cellsMutatedPerColumn=" + cellsMutatedPerColumn + ", "
        + "cellsMutatedPerRow=" + cellsMutatedPerRow
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SpannerSchema) {
      SpannerSchema that = (SpannerSchema) o;
      return this.tables.equals(that.tables())
          && this.columns.equals(that.columns())
          && this.keyParts.equals(that.keyParts())
          && this.cellsMutatedPerColumn.equals(that.cellsMutatedPerColumn())
          && this.cellsMutatedPerRow.equals(that.cellsMutatedPerRow());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= tables.hashCode();
    h$ *= 1000003;
    h$ ^= columns.hashCode();
    h$ *= 1000003;
    h$ ^= keyParts.hashCode();
    h$ *= 1000003;
    h$ ^= cellsMutatedPerColumn.hashCode();
    h$ *= 1000003;
    h$ ^= cellsMutatedPerRow.hashCode();
    return h$;
  }

  static final class Builder extends SpannerSchema.Builder {
    private ImmutableList<String> tables;
    private ImmutableListMultimap.Builder<String, SpannerSchema.Column> columnsBuilder$;
    private ImmutableListMultimap<String, SpannerSchema.Column> columns;
    private ImmutableListMultimap.Builder<String, SpannerSchema.KeyPart> keyPartsBuilder$;
    private ImmutableListMultimap<String, SpannerSchema.KeyPart> keyParts;
    private ImmutableTable.Builder<String, String, Long> cellsMutatedPerColumnBuilder$;
    private ImmutableTable<String, String, Long> cellsMutatedPerColumn;
    private ImmutableMap.Builder<String, Long> cellsMutatedPerRowBuilder$;
    private ImmutableMap<String, Long> cellsMutatedPerRow;
    Builder() {
    }
    @Override
    SpannerSchema.Builder setTables(ImmutableList<String> tables) {
      if (tables == null) {
        throw new NullPointerException("Null tables");
      }
      this.tables = tables;
      return this;
    }
    @Override
    ImmutableListMultimap.Builder<String, SpannerSchema.Column> columnsBuilder() {
      if (columnsBuilder$ == null) {
        columnsBuilder$ = ImmutableListMultimap.builder();
      }
      return columnsBuilder$;
    }
    @Override
    ImmutableListMultimap<String, SpannerSchema.Column> columns() {
      if (columnsBuilder$ != null) {
        return columnsBuilder$.build();
      }
      if (columns == null) {
        columns = ImmutableListMultimap.of();
      }
      return columns;
    }
    @Override
    ImmutableListMultimap.Builder<String, SpannerSchema.KeyPart> keyPartsBuilder() {
      if (keyPartsBuilder$ == null) {
        keyPartsBuilder$ = ImmutableListMultimap.builder();
      }
      return keyPartsBuilder$;
    }
    @Override
    ImmutableTable.Builder<String, String, Long> cellsMutatedPerColumnBuilder() {
      if (cellsMutatedPerColumnBuilder$ == null) {
        cellsMutatedPerColumnBuilder$ = ImmutableTable.builder();
      }
      return cellsMutatedPerColumnBuilder$;
    }
    @Override
    ImmutableTable<String, String, Long> cellsMutatedPerColumn() {
      if (cellsMutatedPerColumnBuilder$ != null) {
        return cellsMutatedPerColumnBuilder$.build();
      }
      if (cellsMutatedPerColumn == null) {
        cellsMutatedPerColumn = ImmutableTable.of();
      }
      return cellsMutatedPerColumn;
    }
    @Override
    ImmutableMap.Builder<String, Long> cellsMutatedPerRowBuilder() {
      if (cellsMutatedPerRowBuilder$ == null) {
        cellsMutatedPerRowBuilder$ = ImmutableMap.builder();
      }
      return cellsMutatedPerRowBuilder$;
    }
    @Override
    SpannerSchema autoBuild() {
      if (columnsBuilder$ != null) {
        this.columns = columnsBuilder$.build();
      } else if (this.columns == null) {
        this.columns = ImmutableListMultimap.of();
      }
      if (keyPartsBuilder$ != null) {
        this.keyParts = keyPartsBuilder$.build();
      } else if (this.keyParts == null) {
        this.keyParts = ImmutableListMultimap.of();
      }
      if (cellsMutatedPerColumnBuilder$ != null) {
        this.cellsMutatedPerColumn = cellsMutatedPerColumnBuilder$.build();
      } else if (this.cellsMutatedPerColumn == null) {
        this.cellsMutatedPerColumn = ImmutableTable.of();
      }
      if (cellsMutatedPerRowBuilder$ != null) {
        this.cellsMutatedPerRow = cellsMutatedPerRowBuilder$.build();
      } else if (this.cellsMutatedPerRow == null) {
        this.cellsMutatedPerRow = ImmutableMap.of();
      }
      String missing = "";
      if (this.tables == null) {
        missing += " tables";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_SpannerSchema(
          this.tables,
          this.columns,
          this.keyParts,
          this.cellsMutatedPerColumn,
          this.cellsMutatedPerRow);
    }
  }

}
