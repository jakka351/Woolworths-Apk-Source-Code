package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Density;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "Landroidx/compose/ui/layout/MeasureResult;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class LazyListMeasureResult implements LazyListLayoutInfo, MeasureResult {

    /* renamed from: a, reason: collision with root package name */
    public final LazyListMeasuredItem f995a;
    public final int b;
    public final boolean c;
    public final float d;
    public final MeasureResult e;
    public final float f;
    public final boolean g;
    public final CoroutineScope h;
    public final Density i;
    public final long j;
    public final Object k;
    public final int l;
    public final int m;
    public final int n;
    public final boolean o;
    public final Orientation p;
    public final int q;
    public final int r;

    public LazyListMeasureResult(LazyListMeasuredItem lazyListMeasuredItem, int i, boolean z, float f, MeasureResult measureResult, float f2, boolean z2, CoroutineScope coroutineScope, Density density, long j, List list, int i2, int i3, int i4, boolean z3, Orientation orientation, int i5, int i6) {
        this.f995a = lazyListMeasuredItem;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = measureResult;
        this.f = f2;
        this.g = z2;
        this.h = coroutineScope;
        this.i = density;
        this.j = j;
        this.k = list;
        this.l = i2;
        this.m = i3;
        this.n = i4;
        this.o = z3;
        this.p = orientation;
        this.q = i5;
        this.r = i6;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public final long a() {
        MeasureResult measureResult = this.e;
        return (measureResult.getF1887a() << 32) | (measureResult.getB() & 4294967295L);
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    /* renamed from: b, reason: from getter */
    public final int getQ() {
        return this.q;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public final int c() {
        return -this.l;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    /* renamed from: d, reason: from getter */
    public final int getN() {
        return this.n;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    /* renamed from: e, reason: from getter */
    public final int getR() {
        return this.r;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public final List f() {
        return this.k;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    /* renamed from: g, reason: from getter */
    public final int getL() {
        return this.l;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    /* renamed from: getHeight */
    public final int getB() {
        return this.e.getB();
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    /* renamed from: getOrientation, reason: from getter */
    public final Orientation getP() {
        return this.p;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    /* renamed from: getWidth */
    public final int getF1887a() {
        return this.e.getF1887a();
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    /* renamed from: h, reason: from getter */
    public final int getM() {
        return this.m;
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.List] */
    public final LazyListMeasureResult i(int i, boolean z) {
        LazyListMeasuredItem lazyListMeasuredItem;
        int i2;
        int i3;
        int i4;
        if (this.g) {
            return null;
        }
        ?? r15 = this.k;
        if (r15.isEmpty() || (lazyListMeasuredItem = this.f995a) == null) {
            return null;
        }
        int i5 = lazyListMeasuredItem.r;
        int i6 = this.b - i;
        if (i6 < 0 || i6 >= i5) {
            return null;
        }
        LazyListMeasuredItem lazyListMeasuredItem2 = (LazyListMeasuredItem) CollectionsKt.D(r15);
        LazyListMeasuredItem lazyListMeasuredItem3 = (LazyListMeasuredItem) CollectionsKt.O(r15);
        if (lazyListMeasuredItem2.t || lazyListMeasuredItem3.t) {
            return null;
        }
        int i7 = this.m;
        int i8 = this.l;
        if (i < 0) {
            if (Math.min((lazyListMeasuredItem2.p + lazyListMeasuredItem2.r) - i8, (lazyListMeasuredItem3.p + lazyListMeasuredItem3.r) - i7) <= (-i)) {
                return null;
            }
        } else if (Math.min(i8 - lazyListMeasuredItem2.p, i7 - lazyListMeasuredItem3.p) <= i) {
            return null;
        }
        int size = ((Collection) r15).size();
        int i9 = 0;
        while (i9 < size) {
            LazyListMeasuredItem lazyListMeasuredItem4 = (LazyListMeasuredItem) r15.get(i9);
            boolean z2 = lazyListMeasuredItem4.c;
            int[] iArr = lazyListMeasuredItem4.x;
            if (!lazyListMeasuredItem4.t) {
                lazyListMeasuredItem4.p += i;
                int length = iArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = i10 & 1;
                    if ((z2 && i11 != 0) || (!z2 && i11 == 0)) {
                        iArr[i10] = iArr[i10] + i;
                    }
                }
                if (z) {
                    int size2 = lazyListMeasuredItem4.b.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        LazyLayoutItemAnimation lazyLayoutItemAnimationA = lazyListMeasuredItem4.n.a(i12, lazyListMeasuredItem4.l);
                        if (lazyLayoutItemAnimationA != null) {
                            long j = lazyLayoutItemAnimationA.l;
                            if (z2) {
                                i2 = i9;
                                i3 = (int) (j >> 32);
                                i4 = ((int) (j & 4294967295L)) + i;
                            } else {
                                i2 = i9;
                                i3 = ((int) (j >> 32)) + i;
                                i4 = (int) (j & 4294967295L);
                            }
                            lazyLayoutItemAnimationA.l = (i4 & 4294967295L) | (i3 << 32);
                        } else {
                            i2 = i9;
                        }
                        i12++;
                        i9 = i2;
                    }
                }
            }
            i9++;
        }
        return new LazyListMeasureResult(this.f995a, i6, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, r15, this.l, this.m, this.n, this.o, this.p, this.q, this.r);
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    /* renamed from: o */
    public final Map getC() {
        return this.e.getC();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final Function1 p() {
        return this.e.p();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final void q() {
        this.e.q();
    }
}
