package com.google.firebase.firestore;

import java.util.Objects;

/* loaded from: classes6.dex */
public abstract class AggregateField {

    public static class AverageAggregateField extends AggregateField {
    }

    public static class CountAggregateField extends AggregateField {
    }

    public static class SumAggregateField extends AggregateField {
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof AggregateField);
    }

    public final int hashCode() {
        return Objects.hash(null, "");
    }
}
