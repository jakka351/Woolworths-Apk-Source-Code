package androidx.collection;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LongFloatMapKt {
    static {
        long[] jArr = ScatterMapKt.f699a;
        long[] jArr2 = LongSetKt.f688a;
        float[] fArr = FloatSetKt.f673a;
        int iE = ScatterMapKt.e(0);
        int iMax = iE > 0 ? Math.max(7, ScatterMapKt.d(iE)) : 0;
        if (iMax != 0) {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ArraysKt.D(jArr, -9187201950435737472L);
        }
        int i = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i] = (jArr[i] & (~j)) | j;
        long[] jArr3 = new long[iMax];
        float[] fArr2 = new float[iMax];
    }
}
