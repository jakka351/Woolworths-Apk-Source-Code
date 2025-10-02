package kotlin.jvm.internal;

import kotlin.Metadata;
import kotlin.collections.DoubleIterator;
import kotlin.collections.FloatIterator;
import kotlin.collections.IntIterator;
import kotlin.collections.LongIterator;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ArrayIteratorsKt {
    public static final DoubleIterator a(double[] array) {
        Intrinsics.h(array, "array");
        return new ArrayDoubleIterator(array);
    }

    public static final FloatIterator b(float[] array) {
        Intrinsics.h(array, "array");
        return new ArrayFloatIterator(array);
    }

    public static final IntIterator c(int[] array) {
        Intrinsics.h(array, "array");
        return new ArrayIntIterator(array);
    }

    public static final LongIterator d(long[] array) {
        Intrinsics.h(array, "array");
        return new ArrayLongIterator(array);
    }

    public static final void e() {
        Intrinsics.h(null, "array");
        Intrinsics.h(null, "array");
    }

    public static final void f() {
        Intrinsics.h(null, "array");
        Intrinsics.h(null, "array");
    }

    public static final void g() {
        Intrinsics.h(null, "array");
        Intrinsics.h(null, "array");
    }

    public static final void h() {
        Intrinsics.h(null, "array");
        Intrinsics.h(null, "array");
    }
}
