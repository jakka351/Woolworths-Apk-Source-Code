package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public abstract class LazyStaggeredGridMeasureProvider implements LazyLayoutMeasuredItemProvider<LazyStaggeredGridMeasuredItem> {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1071a;
    public final LazyStaggeredGridItemProvider b;
    public final LazyLayoutMeasureScope c;
    public final LazyStaggeredGridSlots d;

    public LazyStaggeredGridMeasureProvider(boolean z, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope, LazyStaggeredGridSlots lazyStaggeredGridSlots) {
        this.f1071a = z;
        this.b = lazyStaggeredGridItemProvider;
        this.c = lazyLayoutMeasureScope;
        this.d = lazyStaggeredGridSlots;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider
    public final LazyLayoutMeasuredItem a(int i, int i2, int i3, long j) {
        LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider = this.b;
        return b(i, i2, i3, lazyStaggeredGridItemProvider.f(i), lazyStaggeredGridItemProvider.e(i), this.c.e0(i, j), j);
    }

    public abstract LazyStaggeredGridMeasuredItem b(int i, int i2, int i3, Object obj, Object obj2, List list, long j);

    public final LazyStaggeredGridMeasuredItem c(int i, long j) {
        int i2;
        LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider = this.b;
        Object objF = lazyStaggeredGridItemProvider.f(i);
        Object objE = lazyStaggeredGridItemProvider.e(i);
        LazyStaggeredGridSlots lazyStaggeredGridSlots = this.d;
        int[] iArr = lazyStaggeredGridSlots.b;
        int length = iArr.length;
        int i3 = (int) (j >> 32);
        int i4 = length - 1;
        if (i3 <= i4) {
            i4 = i3;
        }
        int i5 = ((int) (j & 4294967295L)) - i3;
        int i6 = length - i4;
        if (i5 > i6) {
            i5 = i6;
        }
        if (i5 == 1) {
            i2 = iArr[i4];
        } else {
            int[] iArr2 = lazyStaggeredGridSlots.f1078a;
            int i7 = (i4 + i5) - 1;
            i2 = (iArr2[i7] + iArr[i7]) - iArr2[i4];
        }
        long jE = this.f1071a ? Constraints.Companion.e(i2) : Constraints.Companion.d(i2);
        return b(i, i4, i5, objF, objE, this.c.e0(i, jE), jE);
    }
}
