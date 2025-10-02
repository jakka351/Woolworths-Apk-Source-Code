package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class IntervalListKt {
    public static final int a(int i, MutableVector mutableVector) {
        int i2 = mutableVector.f - 1;
        int i3 = 0;
        while (i3 < i2) {
            int iD = YU.a.D(i2, i3, 2, i3);
            Object[] objArr = mutableVector.d;
            int i4 = ((IntervalList.Interval) objArr[iD]).f1033a;
            if (i4 != i) {
                if (i4 < i) {
                    i3 = iD + 1;
                    if (i < ((IntervalList.Interval) objArr[i3]).f1033a) {
                    }
                } else {
                    i2 = iD - 1;
                }
            }
            return iD;
        }
        return i3;
    }
}
