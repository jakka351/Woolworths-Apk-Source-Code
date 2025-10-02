package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class NaturalOrdering extends Ordering<Comparable<?>> implements Serializable {
    public static final NaturalOrdering f = new NaturalOrdering();
    public transient Ordering d;
    public transient Ordering e;

    private Object readResolve() {
        return f;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    @Override // com.google.common.collect.Ordering
    public final Ordering d() {
        Ordering ordering = this.d;
        if (ordering != null) {
            return ordering;
        }
        NullsFirstOrdering nullsFirstOrdering = new NullsFirstOrdering(this);
        this.d = nullsFirstOrdering;
        return nullsFirstOrdering;
    }

    @Override // com.google.common.collect.Ordering
    public final Ordering e() {
        Ordering ordering = this.e;
        if (ordering != null) {
            return ordering;
        }
        NullsLastOrdering nullsLastOrdering = new NullsLastOrdering(this);
        this.e = nullsLastOrdering;
        return nullsLastOrdering;
    }

    @Override // com.google.common.collect.Ordering
    public final Ordering g() {
        return ReverseNaturalOrdering.d;
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
