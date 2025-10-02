package androidx.compose.foundation.lazy;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "Landroidx/compose/foundation/lazy/LazyListItemInfo;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class LazyListMeasuredItem implements LazyListItemInfo, LazyLayoutMeasuredItem {

    /* renamed from: a, reason: collision with root package name */
    public final int f996a;
    public final List b;
    public final boolean c;
    public final Alignment.Horizontal d;
    public final Alignment.Vertical e;
    public final LayoutDirection f;
    public final boolean g;
    public final int h;
    public final int i;
    public final int j;
    public final long k;
    public final Object l;
    public final Object m;
    public final LazyLayoutItemAnimator n;
    public final long o;
    public int p;
    public final int q;
    public final int r;
    public final int s;
    public boolean t;
    public int u = Integer.MIN_VALUE;
    public int v;
    public int w;
    public final int[] x;

    public LazyListMeasuredItem(int i, List list, boolean z, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z2, int i2, int i3, int i4, long j, Object obj, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j2) {
        this.f996a = i;
        this.b = list;
        this.c = z;
        this.d = horizontal;
        this.e = vertical;
        this.f = layoutDirection;
        this.g = z2;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = j;
        this.l = obj;
        this.m = obj2;
        this.n = lazyLayoutItemAnimator;
        this.o = j2;
        int size = list.size();
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < size; i6++) {
            Placeable placeable = (Placeable) list.get(i6);
            boolean z3 = this.c;
            i5 += z3 ? placeable.e : placeable.d;
            iMax = Math.max(iMax, !z3 ? placeable.e : placeable.d);
        }
        this.q = i5;
        int i7 = i5 + this.j;
        this.r = i7 >= 0 ? i7 : 0;
        this.s = iMax;
        this.x = new int[this.b.size() * 2];
    }

    public final int a(long j) {
        return (int) (this.c ? j & 4294967295L : j >> 32);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int b() {
        return this.b.size();
    }

    public final void c(Placeable.PlacementScope placementScope, boolean z) {
        GraphicsLayer graphicsLayer;
        if (this.u == Integer.MIN_VALUE) {
            InlineClassHelperKt.a("position() should be called first");
        }
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Placeable placeable = (Placeable) list.get(i);
            int i2 = this.v;
            boolean z2 = this.c;
            int i3 = i2 - (z2 ? placeable.e : placeable.d);
            int i4 = this.w;
            long jN = n(i);
            LazyLayoutItemAnimation lazyLayoutItemAnimationA = this.n.a(i, this.l);
            if (lazyLayoutItemAnimationA != null) {
                if (z) {
                    lazyLayoutItemAnimationA.r = jN;
                } else {
                    long j = lazyLayoutItemAnimationA.r;
                    int i5 = LazyLayoutItemAnimation.t;
                    LazyLayoutItemAnimation.Companion.a();
                    if (!IntOffset.b(j, LazyLayoutItemAnimation.s)) {
                        jN = lazyLayoutItemAnimationA.r;
                    }
                    long jD = IntOffset.d(jN, ((IntOffset) ((SnapshotMutableStateImpl) lazyLayoutItemAnimationA.q).getD()).f2200a);
                    if ((a(jN) <= i3 && a(jD) <= i3) || (a(jN) >= i4 && a(jD) >= i4)) {
                        lazyLayoutItemAnimationA.b();
                    }
                    jN = jD;
                }
                graphicsLayer = lazyLayoutItemAnimationA.n;
            } else {
                graphicsLayer = null;
            }
            if (this.g) {
                jN = z2 ? (((int) (jN >> 32)) << 32) | (4294967295L & ((this.u - ((int) (jN & 4294967295L))) - (z2 ? placeable.e : placeable.d))) : (((int) (jN & 4294967295L)) & 4294967295L) | (((this.u - ((int) (jN >> 32))) - (z2 ? placeable.e : placeable.d)) << 32);
            }
            long jD2 = IntOffset.d(jN, this.k);
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

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: d */
    public final int getN() {
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: e, reason: from getter */
    public final long getM() {
        return this.o;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: f, reason: from getter */
    public final boolean getY() {
        return this.t;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: g, reason: from getter */
    public final boolean getC() {
        return this.c;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    /* renamed from: getContentType, reason: from getter */
    public final Object getM() {
        return this.m;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: getIndex, reason: from getter */
    public final int getF1015a() {
        return this.f996a;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: getKey, reason: from getter */
    public final Object getB() {
        return this.l;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    /* renamed from: getOffset, reason: from getter */
    public final int getP() {
        return this.p;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    /* renamed from: getSize, reason: from getter */
    public final int getQ() {
        return this.q;
    }

    public final void h(int i, int i2, int i3) {
        int i4;
        this.p = i;
        boolean z = this.c;
        this.u = z ? i3 : i2;
        List list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            Placeable placeable = (Placeable) list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.x;
            if (z) {
                Alignment.Horizontal horizontal = this.d;
                if (horizontal == null) {
                    InlineClassHelperKt.b("null horizontalAlignment when isVertical == true");
                    throw new KotlinNothingValueException();
                }
                iArr[i6] = horizontal.a(placeable.d, i2, this.f);
                iArr[i6 + 1] = i;
                i4 = placeable.e;
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                Alignment.Vertical vertical = this.e;
                if (vertical == null) {
                    InlineClassHelperKt.b("null verticalAlignment when isVertical == false");
                    throw new KotlinNothingValueException();
                }
                iArr[i7] = vertical.a(placeable.e, i3);
                i4 = placeable.d;
            }
            i += i4;
        }
        this.v = -this.h;
        this.w = this.u + this.i;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final void i(int i, int i2, int i3, int i4) {
        h(i, i3, i4);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final void j() {
        this.t = true;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: k */
    public final int getO() {
        return 1;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: l, reason: from getter */
    public final int getQ() {
        return this.r;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final Object m(int i) {
        return ((Placeable) this.b.get(i)).getA();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final long n(int i) {
        int i2 = i * 2;
        int[] iArr = this.x;
        return (iArr[i2] << 32) | (iArr[i2 + 1] & 4294967295L);
    }
}
