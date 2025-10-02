package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class UsingToStringOrdering extends Ordering<Object> implements Serializable {
    public static final UsingToStringOrdering d = new UsingToStringOrdering();

    private Object readResolve() {
        return d;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return obj.toString().compareTo(obj2.toString());
    }

    public final String toString() {
        return "Ordering.usingToString()";
    }
}
