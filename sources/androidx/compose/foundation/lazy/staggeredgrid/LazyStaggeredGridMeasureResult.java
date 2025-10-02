package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Density;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "Landroidx/compose/ui/layout/MeasureResult;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LazyStaggeredGridMeasureResult implements LazyStaggeredGridLayoutInfo, MeasureResult {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f1072a;
    public final int[] b;
    public final float c;
    public final MeasureResult d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final LazyStaggeredGridSlots i;
    public final LazyStaggeredGridSpanProvider j;
    public final Density k;
    public final int l;
    public final Object m;
    public final long n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final CoroutineScope t;
    public final Orientation u;

    public LazyStaggeredGridMeasureResult(int[] iArr, int[] iArr2, float f, MeasureResult measureResult, float f2, boolean z, boolean z2, boolean z3, LazyStaggeredGridSlots lazyStaggeredGridSlots, LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider, Density density, int i, List list, long j, int i2, int i3, int i4, int i5, int i6, CoroutineScope coroutineScope) {
        this.f1072a = iArr;
        this.b = iArr2;
        this.c = f;
        this.d = measureResult;
        this.e = f2;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = lazyStaggeredGridSlots;
        this.j = lazyStaggeredGridSpanProvider;
        this.k = density;
        this.l = i;
        this.m = list;
        this.n = j;
        this.o = i2;
        this.p = i3;
        this.q = i4;
        this.r = i5;
        this.s = i6;
        this.t = coroutineScope;
        this.u = z2 ? Orientation.d : Orientation.e;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    /* renamed from: a, reason: from getter */
    public final long getN() {
        return this.n;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    /* renamed from: b, reason: from getter */
    public final int getR() {
        return this.r;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    /* renamed from: c, reason: from getter */
    public final int getQ() {
        return this.q;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    /* renamed from: d, reason: from getter */
    public final int getL() {
        return this.l;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    /* renamed from: e, reason: from getter */
    public final int getS() {
        return this.s;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public final List f() {
        return this.m;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final LazyStaggeredGridMeasureResult g(int i, boolean z) {
        LazyLayoutItemAnimation lazyLayoutItemAnimation;
        int i2;
        if (this.h) {
            return null;
        }
        ?? r2 = this.m;
        if (r2.isEmpty()) {
            return null;
        }
        int[] iArr = this.f1072a;
        if (iArr.length == 0) {
            return null;
        }
        int[] iArr2 = this.b;
        if (iArr2.length == 0) {
            return null;
        }
        int i3 = this.r;
        int i4 = this.p;
        int i5 = i4 - i3;
        Collection collection = (Collection) r2;
        int size = collection.size();
        for (int i6 = 0; i6 < size; i6++) {
            LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem = (LazyStaggeredGridMeasuredItem) r2.get(i6);
            boolean z2 = lazyStaggeredGridMeasuredItem.r;
            int i7 = lazyStaggeredGridMeasuredItem.n;
            if (z2) {
                return null;
            }
            if ((lazyStaggeredGridMeasuredItem.o() <= 0) != (lazyStaggeredGridMeasuredItem.o() + i <= 0)) {
                return null;
            }
            int iO = lazyStaggeredGridMeasuredItem.o();
            int i8 = this.o;
            if (iO <= i8) {
                if (i < 0) {
                    if ((lazyStaggeredGridMeasuredItem.o() + i7) - i8 <= (-i)) {
                        return null;
                    }
                } else if (i8 - lazyStaggeredGridMeasuredItem.o() <= i) {
                    return null;
                }
            }
            if (lazyStaggeredGridMeasuredItem.o() + i7 >= i5) {
                if (i < 0) {
                    if ((lazyStaggeredGridMeasuredItem.o() + i7) - i4 <= (-i)) {
                        return null;
                    }
                } else if (i4 - lazyStaggeredGridMeasuredItem.o() <= i) {
                    return null;
                }
            }
        }
        int size2 = collection.size();
        for (int i9 = 0; i9 < size2; i9++) {
            LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem2 = (LazyStaggeredGridMeasuredItem) r2.get(i9);
            boolean z3 = lazyStaggeredGridMeasuredItem2.d;
            if (!lazyStaggeredGridMeasuredItem2.r) {
                long j = lazyStaggeredGridMeasuredItem2.t;
                lazyStaggeredGridMeasuredItem2.t = ((z3 ? ((int) (j & 4294967295L)) + i : (int) (j & 4294967295L)) & 4294967295L) | ((z3 ? (int) (j >> 32) : ((int) (j >> 32)) + i) << 32);
                if (z) {
                    int size3 = lazyStaggeredGridMeasuredItem2.c.size();
                    for (int i10 = 0; i10 < size3; i10++) {
                        LazyLayoutItemAnimation lazyLayoutItemAnimationA = lazyStaggeredGridMeasuredItem2.j.a(i10, lazyStaggeredGridMeasuredItem2.b);
                        if (lazyLayoutItemAnimationA != null) {
                            long j2 = lazyLayoutItemAnimationA.l;
                            if (z3) {
                                lazyLayoutItemAnimation = lazyLayoutItemAnimationA;
                                i2 = (int) (j2 >> 32);
                            } else {
                                lazyLayoutItemAnimation = lazyLayoutItemAnimationA;
                                i2 = ((int) (j2 >> 32)) + i;
                            }
                            lazyLayoutItemAnimation.l = ((z3 ? ((int) (j2 & 4294967295L)) + i : (int) (j2 & 4294967295L)) & 4294967295L) | (i2 << 32);
                        }
                    }
                }
            }
        }
        int length = iArr2.length;
        int[] iArr3 = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr3[i11] = iArr2[i11] - i;
        }
        return new LazyStaggeredGridMeasureResult(iArr, iArr3, i, this.d, this.e, this.f || i > 0, this.g, this.h, this.i, this.j, this.k, this.l, r2, this.n, this.o, this.p, this.q, this.r, this.s, this.t);
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    /* renamed from: getHeight */
    public final int getB() {
        return this.d.getB();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    /* renamed from: getOrientation, reason: from getter */
    public final Orientation getU() {
        return this.u;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    /* renamed from: getWidth */
    public final int getF1922a() {
        return this.d.getF1922a();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    /* renamed from: o */
    public final Map getC() {
        return this.d.getC();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final Function1 p() {
        return this.d.p();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final void q() {
        this.d.q();
    }
}
