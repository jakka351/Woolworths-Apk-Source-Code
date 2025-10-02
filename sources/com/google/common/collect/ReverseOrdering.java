package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class ReverseOrdering<T> extends Ordering<T> implements Serializable {
    public final Ordering d;

    public ReverseOrdering(Ordering ordering) {
        this.d = ordering;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.d.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReverseOrdering) {
            return this.d.equals(((ReverseOrdering) obj).d);
        }
        return false;
    }

    @Override // com.google.common.collect.Ordering
    public final Ordering g() {
        return this.d;
    }

    public final int hashCode() {
        return -this.d.hashCode();
    }

    public final String toString() {
        return this.d + ".reverse()";
    }
}
