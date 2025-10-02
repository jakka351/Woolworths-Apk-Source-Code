package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import java.io.Serializable;
import java.util.Arrays;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class ByFunctionOrdering<F, T> extends Ordering<F> implements Serializable {
    public final Function d;
    public final Ordering e;

    public ByFunctionOrdering(Function function, Ordering ordering) {
        this.d = function;
        this.e = ordering;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Function function = this.d;
        return this.e.compare(function.apply(obj), function.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByFunctionOrdering) {
            ByFunctionOrdering byFunctionOrdering = (ByFunctionOrdering) obj;
            if (this.d.equals(byFunctionOrdering.d) && this.e.equals(byFunctionOrdering.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.e});
    }

    public final String toString() {
        return this.e + ".onResultOf(" + this.d + ")";
    }
}
