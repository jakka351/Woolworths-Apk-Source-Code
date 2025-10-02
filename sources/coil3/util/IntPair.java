package coil3.util;

import coil3.annotation.ExperimentalCoilApi;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcoil3/util/IntPair;", "", "value", "", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
@ExperimentalCoilApi
/* loaded from: classes.dex */
public final class IntPair {
    public static long a(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public final boolean equals(Object obj) {
        return obj instanceof IntPair;
    }

    public final int hashCode() {
        return Long.hashCode(0L);
    }

    public final String toString() {
        return "IntPair(value=0)";
    }
}
