package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LazyGridMeasuredItem implements LazyGridItemInfo, LazyLayoutMeasuredItem {

    /* renamed from: a, reason: collision with root package name */
    public final int f1015a;
    public final Object b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final LayoutDirection f;
    public final int g;
    public final int h;
    public final List i;
    public final long j;
    public final Object k;
    public final LazyLayoutItemAnimator l;
    public final long m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public int r = Integer.MIN_VALUE;
    public int s;
    public int t;
    public final long u;
    public long v;
    public int w;
    public int x;
    public boolean y;

    public LazyGridMeasuredItem(int i, Object obj, boolean z, int i2, int i3, boolean z2, LayoutDirection layoutDirection, int i4, int i5, List list, long j, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j2, int i6, int i7) {
        this.f1015a = i;
        this.b = obj;
        this.c = z;
        this.d = i2;
        this.e = z2;
        this.f = layoutDirection;
        this.g = i4;
        this.h = i5;
        this.i = list;
        this.j = j;
        this.k = obj2;
        this.l = lazyLayoutItemAnimator;
        this.m = j2;
        this.n = i6;
        this.o = i7;
        int size = list.size();
        int iMax = 0;
        for (int i8 = 0; i8 < size; i8++) {
            Placeable placeable = (Placeable) list.get(i8);
            iMax = Math.max(iMax, this.c ? placeable.e : placeable.d);
        }
        this.p = iMax;
        int i9 = i3 + iMax;
        this.q = i9 >= 0 ? i9 : 0;
        this.u = this.c ? (iMax & 4294967295L) | (this.d << 32) : (this.d & 4294967295L) | (iMax << 32);
        this.v = 0L;
        this.w = -1;
        this.x = -1;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* renamed from: a, reason: from getter */
    public final long getU() {
        return this.u;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int b() {
        return this.i.size();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* renamed from: c, reason: from getter */
    public final long getV() {
        return this.v;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: d, reason: from getter */
    public final int getN() {
        return this.n;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: e, reason: from getter */
    public final long getM() {
        return this.m;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: f, reason: from getter */
    public final boolean getY() {
        return this.y;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: g, reason: from getter */
    public final boolean getC() {
        return this.c;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: getIndex, reason: from getter */
    public final int getF1015a() {
        return this.f1015a;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: getKey, reason: from getter */
    public final Object getB() {
        return this.b;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* renamed from: getRow, reason: from getter */
    public final int getW() {
        return this.w;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* renamed from: h, reason: from getter */
    public final int getX() {
        return this.x;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final void i(int i, int i2, int i3, int i4) {
        q(i, i2, i3, i4, -1, -1);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final void j() {
        this.y = true;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: k, reason: from getter */
    public final int getO() {
        return this.o;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: l, reason: from getter */
    public final int getQ() {
        return this.q;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final Object m(int i) {
        return ((Placeable) this.i.get(i)).i();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final long n(int i) {
        return this.v;
    }

    public final int o(long j) {
        return (int) (this.c ? j & 4294967295L : j >> 32);
    }

    public final void p(Placeable.PlacementScope placementScope, boolean z) {
        GraphicsLayer graphicsLayer;
        if (this.r == Integer.MIN_VALUE) {
            InlineClassHelperKt.a("position() should be called first");
        }
        List list = this.i;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Placeable placeable = (Placeable) list.get(i);
            int i2 = this.s;
            boolean z2 = this.c;
            int i3 = i2 - (z2 ? placeable.e : placeable.d);
            int i4 = this.t;
            long j = this.v;
            LazyLayoutItemAnimation lazyLayoutItemAnimationA = this.l.a(i, this.b);
            if (lazyLayoutItemAnimationA != null) {
                if (z) {
                    lazyLayoutItemAnimationA.r = j;
                } else {
                    long jD = IntOffset.d(!IntOffset.b(lazyLayoutItemAnimationA.r, LazyLayoutItemAnimation.s) ? lazyLayoutItemAnimationA.r : j, ((IntOffset) ((SnapshotMutableStateImpl) lazyLayoutItemAnimationA.q).getD()).f2200a);
                    if ((o(j) <= i3 && o(jD) <= i3) || (o(j) >= i4 && o(jD) >= i4)) {
                        lazyLayoutItemAnimationA.b();
                    }
                    j = jD;
                }
                graphicsLayer = lazyLayoutItemAnimationA.n;
            } else {
                graphicsLayer = null;
            }
            if (this.e) {
                j = ((z2 ? (int) (j >> 32) : (this.r - ((int) (j >> 32))) - (z2 ? placeable.e : placeable.d)) << 32) | ((z2 ? (this.r - ((int) (j & 4294967295L))) - (z2 ? placeable.e : placeable.d) : (int) (j & 4294967295L)) & 4294967295L);
            }
            long jD2 = IntOffset.d(j, this.j);
            if (!z && lazyLayoutItemAnimationA != null) {
                lazyLayoutItemAnimationA.m = jD2;
            }
            if (z2) {
                if (graphicsLayer != null) {
                    placementScope.getClass();
                    Placeable.PlacementScope.a(placementScope, placeable);
                    placeable.n0(IntOffset.d(jD2, placeable.h), BitmapDescriptorFactory.HUE_RED, graphicsLayer);
                } else {
                    Placeable.PlacementScope.n(placementScope, placeable, jD2);
                }
            } else if (graphicsLayer != null) {
                Placeable.PlacementScope.k(placementScope, placeable, jD2, graphicsLayer);
            } else {
                Placeable.PlacementScope.j(placementScope, placeable, jD2);
            }
        }
    }

    public final void q(int i, int i2, int i3, int i4, int i5, int i6) {
        long j;
        long j2;
        boolean z = this.c;
        int i7 = z ? i4 : i3;
        this.r = i7;
        if (!z) {
            i3 = i4;
        }
        if (z && this.f == LayoutDirection.e) {
            i2 = (i3 - i2) - this.d;
        }
        if (z) {
            j = i2 << 32;
            j2 = i;
        } else {
            j = i << 32;
            j2 = i2;
        }
        this.v = (j2 & 4294967295L) | j;
        this.w = i5;
        this.x = i6;
        this.s = -this.g;
        this.t = i7 + this.h;
    }
}
