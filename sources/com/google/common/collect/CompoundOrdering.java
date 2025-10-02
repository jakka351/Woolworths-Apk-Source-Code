package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class CompoundOrdering<T> extends Ordering<T> implements Serializable {
    public final Comparator[] d;

    public CompoundOrdering(Ordering ordering, Comparator comparator) {
        this.d = new Comparator[]{ordering, comparator};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.d;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CompoundOrdering) {
            return Arrays.equals(this.d, ((CompoundOrdering) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.d);
    }

    public final String toString() {
        return YU.a.o(new StringBuilder("Ordering.compound("), Arrays.toString(this.d), ")");
    }
}
