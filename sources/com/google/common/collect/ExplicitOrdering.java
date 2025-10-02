package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class ExplicitOrdering<T> extends Ordering<T> implements Serializable {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        throw null;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj instanceof ExplicitOrdering) {
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
