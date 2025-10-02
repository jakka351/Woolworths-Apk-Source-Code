package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class ReverseNaturalOrdering extends Ordering<Comparable<?>> implements Serializable {
    public static final ReverseNaturalOrdering d = new ReverseNaturalOrdering();

    private Object readResolve() {
        return d;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    @Override // com.google.common.collect.Ordering
    public final Ordering g() {
        return NaturalOrdering.f;
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
