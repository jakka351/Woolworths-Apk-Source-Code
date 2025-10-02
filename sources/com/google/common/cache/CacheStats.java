package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.MoreObjects;
import java.util.Arrays;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes6.dex */
public final class CacheStats {
    public final boolean equals(Object obj) {
        return obj instanceof CacheStats;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{0L, 0L, 0L, 0L, 0L, 0L});
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.b(0L, "hitCount");
        toStringHelperB.b(0L, "missCount");
        toStringHelperB.b(0L, "loadSuccessCount");
        toStringHelperB.b(0L, "loadExceptionCount");
        toStringHelperB.b(0L, "totalLoadTime");
        toStringHelperB.b(0L, "evictionCount");
        return toStringHelperB.toString();
    }
}
