package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.AbstractApplier;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorApplier;", "Landroidx/compose/runtime/AbstractApplier;", "Landroidx/compose/ui/graphics/vector/VNode;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class VectorApplier extends AbstractApplier<VNode> {
    public VectorApplier(VNode vNode) {
        super(vNode);
    }

    public static GroupComponent m(VNode vNode) {
        if (vNode instanceof GroupComponent) {
            return (GroupComponent) vNode;
        }
        throw new IllegalStateException("Cannot only insert VNode into Group");
    }

    @Override // androidx.compose.runtime.Applier
    public final void b(int i, int i2) {
        m((VNode) this.c).h(i, i2);
    }

    @Override // androidx.compose.runtime.Applier
    public final void e(int i, int i2, int i3) {
        GroupComponent groupComponentM = m((VNode) this.c);
        ArrayList arrayList = groupComponentM.c;
        int i4 = 0;
        if (i > i2) {
            while (i4 < i3) {
                VNode vNode = (VNode) arrayList.get(i);
                arrayList.remove(i);
                arrayList.add(i2, vNode);
                i2++;
                i4++;
            }
        } else {
            while (i4 < i3) {
                VNode vNode2 = (VNode) arrayList.get(i);
                arrayList.remove(i);
                arrayList.add(i2 - 1, vNode2);
                i4++;
            }
        }
        groupComponentM.c();
    }

    @Override // androidx.compose.runtime.Applier
    public final /* bridge */ /* synthetic */ void f(int i, Object obj) {
    }

    @Override // androidx.compose.runtime.Applier
    public final void h(int i, Object obj) {
        m((VNode) this.c).e(i, (VNode) obj);
    }

    @Override // androidx.compose.runtime.AbstractApplier
    public final void l() {
        GroupComponent groupComponentM = m((VNode) this.f1617a);
        groupComponentM.h(0, groupComponentM.c.size());
    }
}
