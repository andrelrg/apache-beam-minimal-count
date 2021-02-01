package org.apache.beam.sdk.io.gcp.spanner;

import com.google.cloud.spanner.BatchTransactionId;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Transaction extends Transaction {

  private final BatchTransactionId transactionId;

  AutoValue_Transaction(
      BatchTransactionId transactionId) {
    if (transactionId == null) {
      throw new NullPointerException("Null transactionId");
    }
    this.transactionId = transactionId;
  }

  @Override
  public BatchTransactionId transactionId() {
    return transactionId;
  }

  @Override
  public String toString() {
    return "Transaction{"
        + "transactionId=" + transactionId
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Transaction) {
      Transaction that = (Transaction) o;
      return this.transactionId.equals(that.transactionId());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= transactionId.hashCode();
    return h$;
  }

}
