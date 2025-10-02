package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class Count implements Serializable {
    public final boolean equals(Object obj) {
        return obj instanceof Count;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return Integer.toString(0);
    }
}
