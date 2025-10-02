package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class NullsLastOrdering<T> extends Ordering<T> implements Serializable {
    public final Ordering d;

    public NullsLastOrdering(Ordering ordering) {
        this.d = ordering;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return 1;
        }
        if (obj2 == null) {
            return -1;
        }
        return this.d.compare(obj, obj2);
    }

    @Override // com.google.common.collect.Ordering
    public final Ordering d() {
        return this.d.d();
    }

    @Override // com.google.common.collect.Ordering
    public final Ordering e() {
        return this;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NullsLastOrdering) {
            return this.d.equals(((NullsLastOrdering) obj).d);
        }
        return false;
    }

    @Override // com.google.common.collect.Ordering
    public final Ordering g() {
        return this.d.g().d();
    }

    public final int hashCode() {
        return this.d.hashCode() ^ (-921210296);
    }

    public final String toString() {
        return this.d + ".nullsLast()";
    }
}
