package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class NullsFirstOrdering<T> extends Ordering<T> implements Serializable {
    public final Ordering d;

    public NullsFirstOrdering(Ordering ordering) {
        this.d = ordering;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        return this.d.compare(obj, obj2);
    }

    @Override // com.google.common.collect.Ordering
    public final Ordering d() {
        return this;
    }

    @Override // com.google.common.collect.Ordering
    public final Ordering e() {
        return this.d.e();
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NullsFirstOrdering) {
            return this.d.equals(((NullsFirstOrdering) obj).d);
        }
        return false;
    }

    @Override // com.google.common.collect.Ordering
    public final Ordering g() {
        return this.d.g().e();
    }

    public final int hashCode() {
        return this.d.hashCode() ^ 957692532;
    }

    public final String toString() {
        return this.d + ".nullsFirst()";
    }
}
