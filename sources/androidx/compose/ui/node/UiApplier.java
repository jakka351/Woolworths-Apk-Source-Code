package androidx.compose.ui.node;

import androidx.compose.runtime.AbstractApplier;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/node/UiApplier;", "Landroidx/compose/runtime/AbstractApplier;", "Landroidx/compose/ui/node/LayoutNode;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UiApplier extends AbstractApplier<LayoutNode> {
    @Override // androidx.compose.runtime.Applier
    public final void b(int i, int i2) {
        ((LayoutNode) this.c).h0(i, i2);
    }

    @Override // androidx.compose.runtime.Applier
    public final void c() {
        Owner owner = ((LayoutNode) this.f1617a).s;
        if (owner != null) {
            owner.k();
        }
    }

    @Override // androidx.compose.runtime.Applier
    public final void d() {
        ((LayoutNode) this.c).k();
    }

    @Override // androidx.compose.runtime.Applier
    public final void e(int i, int i2, int i3) {
        ((LayoutNode) this.c).b0(i, i2, i3);
    }

    @Override // androidx.compose.runtime.Applier
    public final /* bridge */ /* synthetic */ void f(int i, Object obj) {
    }

    @Override // androidx.compose.runtime.Applier
    public final void h(int i, Object obj) {
        ((LayoutNode) this.c).P(i, (LayoutNode) obj);
    }

    @Override // androidx.compose.runtime.AbstractApplier
    public final void l() {
        ((LayoutNode) this.f1617a).g0();
    }
}
