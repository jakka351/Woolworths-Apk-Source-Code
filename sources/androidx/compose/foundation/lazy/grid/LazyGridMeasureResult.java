package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt;
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
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "Landroidx/compose/ui/layout/MeasureResult;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LazyGridMeasureResult implements LazyGridLayoutInfo, MeasureResult {

    /* renamed from: a, reason: collision with root package name */
    public final LazyGridMeasuredLine f1014a;
    public final int b;
    public final boolean c;
    public final float d;
    public final MeasureResult e;
    public final float f;
    public final boolean g;
    public final CoroutineScope h;
    public final Density i;
    public final int j;
    public final Lambda k;
    public final Object l;
    public final int m;
    public final int n;
    public final int o;
    public final boolean p;
    public final Orientation q;
    public final int r;
    public final int s;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridMeasureResult(LazyGridMeasuredLine lazyGridMeasuredLine, int i, boolean z, float f, MeasureResult measureResult, float f2, boolean z2, CoroutineScope coroutineScope, Density density, int i2, Function1 function1, List list, int i3, int i4, int i5, boolean z3, Orientation orientation, int i6, int i7) {
        this.f1014a = lazyGridMeasuredLine;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = measureResult;
        this.f = f2;
        this.g = z2;
        this.h = coroutineScope;
        this.i = density;
        this.j = i2;
        this.k = (Lambda) function1;
        this.l = list;
        this.m = i3;
        this.n = i4;
        this.o = i5;
        this.p = z3;
        this.q = orientation;
        this.r = i6;
        this.s = i7;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public final long a() {
        MeasureResult measureResult = this.e;
        return (measureResult.getF1887a() << 32) | (measureResult.getB() & 4294967295L);
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    /* renamed from: b, reason: from getter */
    public final int getR() {
        return this.r;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public final int c() {
        return -this.m;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    /* renamed from: d, reason: from getter */
    public final int getO() {
        return this.o;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    /* renamed from: e, reason: from getter */
    public final int getS() {
        return this.s;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public final List f() {
        return this.l;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    /* renamed from: g, reason: from getter */
    public final int getM() {
        return this.m;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    /* renamed from: getHeight */
    public final int getB() {
        return this.e.getB();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    /* renamed from: getOrientation, reason: from getter */
    public final Orientation getQ() {
        return this.q;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    /* renamed from: getWidth */
    public final int getF1887a() {
        return this.e.getF1887a();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    /* renamed from: h, reason: from getter */
    public final int getN() {
        return this.n;
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.List] */
    public final LazyGridMeasureResult i(int i, boolean z) {
        LazyGridMeasuredLine lazyGridMeasuredLine;
        int i2;
        long j;
        List list;
        char c;
        int i3;
        if (this.g) {
            return null;
        }
        ?? r15 = this.l;
        if (r15.isEmpty() || (lazyGridMeasuredLine = this.f1014a) == null) {
            return null;
        }
        int i4 = lazyGridMeasuredLine.h;
        int i5 = this.b - i;
        if (i5 < 0 || i5 >= i4) {
            return null;
        }
        LazyGridMeasuredItem lazyGridMeasuredItem = (LazyGridMeasuredItem) CollectionsKt.D(r15);
        LazyGridMeasuredItem lazyGridMeasuredItem2 = (LazyGridMeasuredItem) CollectionsKt.O(r15);
        if (lazyGridMeasuredItem.y || lazyGridMeasuredItem2.y) {
            return null;
        }
        int i6 = this.n;
        int i7 = this.m;
        Orientation orientation = this.q;
        if (i < 0) {
            if (Math.min((LazyGridSnapLayoutInfoProviderKt.a(lazyGridMeasuredItem, orientation) + lazyGridMeasuredItem.q) - i7, (LazyGridSnapLayoutInfoProviderKt.a(lazyGridMeasuredItem2, orientation) + lazyGridMeasuredItem2.q) - i6) <= (-i)) {
                return null;
            }
        } else if (Math.min(i7 - LazyGridSnapLayoutInfoProviderKt.a(lazyGridMeasuredItem, orientation), i6 - LazyGridSnapLayoutInfoProviderKt.a(lazyGridMeasuredItem2, orientation)) <= i) {
            return null;
        }
        int size = ((Collection) r15).size();
        int i8 = 0;
        List list2 = r15;
        while (i8 < size) {
            LazyGridMeasuredItem lazyGridMeasuredItem3 = (LazyGridMeasuredItem) list2.get(i8);
            boolean z2 = lazyGridMeasuredItem3.c;
            if (lazyGridMeasuredItem3.y) {
                i2 = i8;
            } else {
                long j2 = lazyGridMeasuredItem3.v;
                long j3 = 4294967295L;
                i2 = i8;
                char c2 = ' ';
                lazyGridMeasuredItem3.v = ((z2 ? (int) (j2 >> 32) : ((int) (j2 >> 32)) + i) << 32) | ((z2 ? ((int) (j2 & 4294967295L)) + i : (int) (j2 & 4294967295L)) & 4294967295L);
                if (z) {
                    int size2 = lazyGridMeasuredItem3.i.size();
                    int i9 = 0;
                    list2 = list2;
                    while (i9 < size2) {
                        LazyLayoutItemAnimation lazyLayoutItemAnimationA = lazyGridMeasuredItem3.l.a(i9, lazyGridMeasuredItem3.b);
                        if (lazyLayoutItemAnimationA != null) {
                            long j4 = lazyLayoutItemAnimationA.l;
                            if (z2) {
                                j = j3;
                                c = c2;
                                i3 = (int) (j4 >> c);
                            } else {
                                j = j3;
                                c = c2;
                                i3 = ((int) (j4 >> c)) + i;
                            }
                            list = list2;
                            lazyLayoutItemAnimationA.l = (i3 << c) | ((z2 ? ((int) (j4 & j)) + i : (int) (j4 & j)) & j);
                        } else {
                            j = j3;
                            list = list2;
                        }
                        i9++;
                        list2 = list;
                        j3 = j;
                        c2 = ' ';
                    }
                }
            }
            i8 = i2 + 1;
            list2 = list2;
        }
        return new LazyGridMeasureResult(this.f1014a, i5, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, this.k, list2, this.m, this.n, this.o, this.p, orientation, this.r, this.s);
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
