package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LazyStaggeredGridMeasuredItem implements LazyStaggeredGridItemInfo, LazyLayoutMeasuredItem {

    /* renamed from: a, reason: collision with root package name */
    public final int f1075a;
    public final Object b;
    public final List c;
    public final boolean d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final Object i;
    public final LazyLayoutItemAnimator j;
    public final long k;
    public boolean l = true;
    public final int m;
    public final int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public final long s;
    public long t;

    public LazyStaggeredGridMeasuredItem(int i, Object obj, List list, boolean z, int i2, int i3, int i4, int i5, int i6, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j) {
        int i7;
        long j2;
        long j3;
        this.f1075a = i;
        this.b = obj;
        this.c = list;
        this.d = z;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = obj2;
        this.j = lazyLayoutItemAnimator;
        this.k = j;
        int i8 = 1;
        int i9 = 0;
        if (list.isEmpty()) {
            i7 = 0;
        } else {
            Placeable placeable = (Placeable) list.get(0);
            i7 = z ? placeable.e : placeable.d;
            int I = CollectionsKt.I(list);
            if (1 <= I) {
                int i10 = 1;
                while (true) {
                    Placeable placeable2 = (Placeable) list.get(i10);
                    int i11 = this.d ? placeable2.e : placeable2.d;
                    i7 = i11 > i7 ? i11 : i7;
                    if (i10 == I) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
        this.m = i7;
        int i12 = i7 + i2;
        this.n = i12 < 0 ? 0 : i12;
        List list2 = this.c;
        if (!list2.isEmpty()) {
            Placeable placeable3 = (Placeable) list2.get(0);
            int i13 = this.d ? placeable3.d : placeable3.e;
            int I2 = CollectionsKt.I(list2);
            if (1 <= I2) {
                while (true) {
                    Placeable placeable4 = (Placeable) list2.get(i8);
                    int i14 = this.d ? placeable4.d : placeable4.e;
                    i13 = i14 > i13 ? i14 : i13;
                    if (i8 == I2) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            i9 = i13;
        }
        this.o = -1;
        if (this.d) {
            j2 = i9 << 32;
            j3 = this.m;
        } else {
            j2 = this.m << 32;
            j3 = i9;
        }
        this.s = (j3 & 4294967295L) | j2;
        this.t = 0L;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    /* renamed from: a, reason: from getter */
    public final long getS() {
        return this.s;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int b() {
        return this.c.size();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    /* renamed from: c, reason: from getter */
    public final long getT() {
        return this.t;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: d, reason: from getter */
    public final int getE() {
        return this.e;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: e, reason: from getter */
    public final long getK() {
        return this.k;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: f, reason: from getter */
    public final boolean getR() {
        return this.r;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: g, reason: from getter */
    public final boolean getD() {
        return this.d;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: getIndex, reason: from getter */
    public final int getF1075a() {
        return this.f1075a;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: getKey, reason: from getter */
    public final Object getB() {
        return this.b;
    }

    public final int h(long j) {
        return (int) (this.d ? j & 4294967295L : j >> 32);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final void i(int i, int i2, int i3, int i4) {
        if (this.d) {
            i3 = i4;
        }
        p(i, i2, i3);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final void j() {
        this.r = true;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: k, reason: from getter */
    public final int getF() {
        return this.f;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: l, reason: from getter */
    public final int getN() {
        return this.n;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final Object m(int i) {
        return ((Placeable) this.c.get(i)).i();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final long n(int i) {
        return this.t;
    }

    public final int o() {
        return (int) (!this.d ? this.t >> 32 : this.t & 4294967295L);
    }

    public final void p(int i, int i2, int i3) {
        long j;
        this.o = i3;
        this.p = -this.g;
        this.q = i3 + this.h;
        if (this.d) {
            j = (i2 << 32) | (4294967295L & i);
        } else {
            j = (i2 & 4294967295L) | (i << 32);
        }
        this.t = j;
    }
}
