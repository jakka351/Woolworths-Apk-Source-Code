package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.GraphicsContext;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LazyStaggeredGridMeasureContext {

    /* renamed from: a, reason: collision with root package name */
    public final LazyStaggeredGridState f1070a;
    public final Object b;
    public final LazyStaggeredGridItemProvider c;
    public final LazyStaggeredGridSlots d;
    public final long e;
    public final boolean f;
    public final LazyLayoutMeasureScope g;
    public final int h;
    public final long i;
    public final int j;
    public final int k;
    public final boolean l;
    public final int m;
    public final CoroutineScope n;
    public final boolean o;
    public final LazyStaggeredGridLayoutInfo p;
    public final GraphicsContext q;
    public final LazyStaggeredGridMeasureContext$measuredItemProvider$1 r;
    public final LazyStaggeredGridLaneInfo s;
    public final int t;

    /* JADX WARN: Type inference failed for: r9v1, types: [androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext$measuredItemProvider$1] */
    public LazyStaggeredGridMeasureContext(LazyStaggeredGridState lazyStaggeredGridState, List list, final LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, final LazyStaggeredGridSlots lazyStaggeredGridSlots, long j, final boolean z, final LazyLayoutMeasureScope lazyLayoutMeasureScope, int i, long j2, int i2, int i3, boolean z2, int i4, CoroutineScope coroutineScope, boolean z3, LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, GraphicsContext graphicsContext) {
        this.f1070a = lazyStaggeredGridState;
        this.b = list;
        this.c = lazyStaggeredGridItemProvider;
        this.d = lazyStaggeredGridSlots;
        this.e = j;
        this.f = z;
        this.g = lazyLayoutMeasureScope;
        this.h = i;
        this.i = j2;
        this.j = i2;
        this.k = i3;
        this.l = z2;
        this.m = i4;
        this.n = coroutineScope;
        this.o = z3;
        this.p = lazyStaggeredGridLayoutInfo;
        this.q = graphicsContext;
        this.r = new LazyStaggeredGridMeasureProvider(z, lazyStaggeredGridItemProvider, lazyLayoutMeasureScope, lazyStaggeredGridSlots) { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext$measuredItemProvider$1
            @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider
            public final LazyStaggeredGridMeasuredItem b(int i5, int i6, int i7, Object obj, Object obj2, List list2, long j3) {
                LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext = this.e;
                return new LazyStaggeredGridMeasuredItem(i5, obj, list2, lazyStaggeredGridMeasureContext.f, lazyStaggeredGridMeasureContext.m, i6, i7, lazyStaggeredGridMeasureContext.j, lazyStaggeredGridMeasureContext.k, obj2, lazyStaggeredGridMeasureContext.f1070a.s, j3);
            }
        };
        this.s = lazyStaggeredGridState.e;
        this.t = lazyStaggeredGridSlots.b.length;
    }

    public static long b(LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, int i, int i2) {
        lazyStaggeredGridItemProvider.g().a(i);
        return (i2 << 32) | ((i2 + 1) & 4294967295L);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final List a() {
        return this.b;
    }
}
