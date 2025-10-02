package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TrieNodeKt {
    public static final Object[] a(Object obj, Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length + 1];
        ArraysKt.x(objArr, 0, objArr2, i, 6);
        ArraysKt.t(objArr, i + 1, objArr2, i, objArr.length);
        objArr2[i] = obj;
        return objArr2;
    }

    public static final Object[] b(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        ArraysKt.x(objArr, 0, objArr2, i, 6);
        ArraysKt.t(objArr, i, objArr2, i + 1, objArr.length);
        return objArr2;
    }

    public static final int c(int i, int i2) {
        return (i >> i2) & 31;
    }
}
