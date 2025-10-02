package androidx.compose.ui.graphics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ReusableGraphicsLayerScope implements GraphicsLayerScope {
    public int d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public long k;
    public long l;
    public float m;
    public float n;
    public float o;
    public float p;
    public long q;
    public Shape r;
    public boolean s;
    public long t;
    public Density u;
    public LayoutDirection v;
    public RenderEffect w;
    public Outline x;

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void A(float f) {
        if (this.j == f) {
            return;
        }
        this.d |= 32;
        this.j = f;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void H0(Shape shape) {
        if (Intrinsics.c(this.r, shape)) {
            return;
        }
        this.d |= 8192;
        this.r = shape;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void K(long j) {
        if (Color.c(this.k, j)) {
            return;
        }
        this.d |= 64;
        this.k = j;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void L(long j) {
        if (Color.c(this.l, j)) {
            return;
        }
        this.d |= 128;
        this.l = j;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: Q1 */
    public final float getE() {
        return this.u.getE();
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void b(float f) {
        if (this.g == f) {
            return;
        }
        this.d |= 4;
        this.g = f;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void c(float f) {
        if (this.i == f) {
            return;
        }
        this.d |= 16;
        this.i = f;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void d(float f) {
        if (this.p == f) {
            return;
        }
        this.d |= 2048;
        this.p = f;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void e(float f) {
        if (this.m == f) {
            return;
        }
        this.d |= 256;
        this.m = f;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void f(float f) {
        if (this.n == f) {
            return;
        }
        this.d |= 512;
        this.n = f;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void g(float f) {
        if (this.o == f) {
            return;
        }
        this.d |= 1024;
        this.o = f;
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: getDensity */
    public final float getD() {
        return this.u.getD();
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: h, reason: from getter */
    public final long getT() {
        return this.t;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void j(float f) {
        if (this.e == f) {
            return;
        }
        this.d |= 1;
        this.e = f;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void k(RenderEffect renderEffect) {
        if (Intrinsics.c(this.w, renderEffect)) {
            return;
        }
        this.d |= 131072;
        this.w = renderEffect;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void l(float f) {
        if (this.f == f) {
            return;
        }
        this.d |= 2;
        this.f = f;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void m(float f) {
        if (this.h == f) {
            return;
        }
        this.d |= 8;
        this.h = f;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void p0(long j) {
        if (TransformOrigin.a(this.q, j)) {
            return;
        }
        this.d |= 4096;
        this.q = j;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void x() {
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void z(boolean z) {
        if (this.s != z) {
            this.d |= 16384;
            this.s = z;
        }
    }
}
