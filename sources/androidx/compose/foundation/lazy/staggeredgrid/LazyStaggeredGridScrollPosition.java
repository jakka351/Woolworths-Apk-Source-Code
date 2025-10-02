package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LazyStaggeredGridScrollPosition {

    /* renamed from: a, reason: collision with root package name */
    public final Function2 f1076a;
    public int[] b;
    public final MutableIntState c;
    public int[] d;
    public final MutableIntState e;
    public boolean f;
    public Object g;
    public final LazyLayoutNearestRangeState h;

    public LazyStaggeredGridScrollPosition(int[] iArr, int[] iArr2, Function2 function2) {
        this.f1076a = function2;
        this.b = iArr;
        this.c = SnapshotIntStateKt.a(a(iArr));
        this.d = iArr2;
        this.e = SnapshotIntStateKt.a(b(iArr, iArr2));
        Integer numY = ArraysKt.Y(iArr);
        this.h = new LazyLayoutNearestRangeState(numY != null ? numY.intValue() : 0, 90, 200);
    }

    public static int a(int[] iArr) {
        int length = iArr.length;
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                if (i == Integer.MAX_VALUE) {
                    break;
                }
                return i;
            }
            int i3 = iArr[i2];
            if (i3 <= 0) {
                break;
            }
            if (i > i3) {
                i = i3;
            }
            i2++;
        }
        return 0;
    }

    public static int b(int[] iArr, int[] iArr2) {
        int iA = a(iArr);
        int length = iArr2.length;
        int iMin = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            if (iArr[i] == iA) {
                iMin = Math.min(iMin, iArr2[i]);
            }
        }
        if (iMin == Integer.MAX_VALUE) {
            return 0;
        }
        return iMin;
    }
}
