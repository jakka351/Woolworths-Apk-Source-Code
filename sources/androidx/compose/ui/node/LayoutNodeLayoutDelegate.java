package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class LayoutNodeLayoutDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final LayoutNode f1921a;
    public boolean b;
    public boolean c;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public LookaheadPassDelegate q;
    public LayoutNode.LayoutState d = LayoutNode.LayoutState.h;
    public final MeasurePassDelegate p = new MeasurePassDelegate(this);

    public LayoutNodeLayoutDelegate(LayoutNode layoutNode) {
        this.f1921a = layoutNode;
    }

    public final NodeCoordinator a() {
        return this.f1921a.K.c;
    }

    public final void b() {
        LayoutNode.LayoutState layoutState = this.f1921a.L.d;
        if (layoutState == LayoutNode.LayoutState.f || layoutState == LayoutNode.LayoutState.g) {
            if (this.p.E) {
                f(true);
            } else {
                e(true);
            }
        }
        if (layoutState == LayoutNode.LayoutState.g) {
            LookaheadPassDelegate lookaheadPassDelegate = this.q;
            if (lookaheadPassDelegate == null || !lookaheadPassDelegate.getY()) {
                g(true);
            } else {
                h(true);
            }
        }
    }

    public final void c(int i) {
        int i2 = this.l;
        this.l = i;
        if ((i2 == 0) != (i == 0)) {
            LayoutNode layoutNodeK = this.f1921a.K();
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNodeK != null ? layoutNodeK.L : null;
            if (layoutNodeLayoutDelegate != null) {
                if (i == 0) {
                    layoutNodeLayoutDelegate.c(layoutNodeLayoutDelegate.l - 1);
                } else {
                    layoutNodeLayoutDelegate.c(layoutNodeLayoutDelegate.l + 1);
                }
            }
        }
    }

    public final void d(int i) {
        int i2 = this.o;
        this.o = i;
        if ((i2 == 0) != (i == 0)) {
            LayoutNode layoutNodeK = this.f1921a.K();
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNodeK != null ? layoutNodeK.L : null;
            if (layoutNodeLayoutDelegate != null) {
                if (i == 0) {
                    layoutNodeLayoutDelegate.d(layoutNodeLayoutDelegate.o - 1);
                } else {
                    layoutNodeLayoutDelegate.d(layoutNodeLayoutDelegate.o + 1);
                }
            }
        }
    }

    public final void e(boolean z) {
        if (this.k != z) {
            this.k = z;
            if (z && !this.j) {
                c(this.l + 1);
            } else {
                if (z || this.j) {
                    return;
                }
                c(this.l - 1);
            }
        }
    }

    public final void f(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (z && !this.k) {
                c(this.l + 1);
            } else {
                if (z || this.k) {
                    return;
                }
                c(this.l - 1);
            }
        }
    }

    public final void g(boolean z) {
        if (this.n != z) {
            this.n = z;
            if (z && !this.m) {
                d(this.o + 1);
            } else {
                if (z || this.m) {
                    return;
                }
                d(this.o - 1);
            }
        }
    }

    public final void h(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z && !this.n) {
                d(this.o + 1);
            } else {
                if (z || this.n) {
                    return;
                }
                d(this.o - 1);
            }
        }
    }

    public final void i() {
        MeasurePassDelegate measurePassDelegate = this.p;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = measurePassDelegate.i;
        Object obj = measurePassDelegate.v;
        LayoutNode layoutNode = this.f1921a;
        if ((obj != null || layoutNodeLayoutDelegate.a().getA() != null) && measurePassDelegate.u) {
            measurePassDelegate.u = false;
            measurePassDelegate.v = layoutNodeLayoutDelegate.a().getA();
            LayoutNode layoutNodeK = layoutNode.K();
            if (layoutNodeK != null) {
                LayoutNode.m0(layoutNodeK, false, 7);
            }
        }
        LookaheadPassDelegate lookaheadPassDelegate = this.q;
        if (lookaheadPassDelegate == null || !lookaheadPassDelegate.i1()) {
            return;
        }
        if (LayoutNodeLayoutDelegateKt.a(layoutNode)) {
            LayoutNode layoutNodeK2 = layoutNode.K();
            if (layoutNodeK2 != null) {
                LayoutNode.m0(layoutNodeK2, false, 7);
                return;
            }
            return;
        }
        LayoutNode layoutNodeK3 = layoutNode.K();
        if (layoutNodeK3 != null) {
            LayoutNode.k0(layoutNodeK3, false, 7);
        }
    }
}
