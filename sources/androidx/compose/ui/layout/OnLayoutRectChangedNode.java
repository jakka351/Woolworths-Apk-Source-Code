package androidx.compose.ui.layout;

import androidx.collection.MutableIntObjectMap;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeKt;
import androidx.compose.ui.spatial.ThrottledCallbacks;
import androidx.compose.ui.spatial.ThrottledCallbacks.Entry;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/OnLayoutRectChangedNode;", "Landroidx/compose/ui/Modifier$Node;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class OnLayoutRectChangedNode extends Modifier.Node {
    public long r;
    public Function1 s;
    public ThrottledCallbacks.Entry t;

    @Override // androidx.compose.ui.Modifier.Node
    public final void k2() {
        s2();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void l2() {
        ThrottledCallbacks.Entry entry = this.t;
        if (entry != null) {
            entry.a();
        }
    }

    public final void s2() {
        ThrottledCallbacks.Entry entry = this.t;
        if (entry != null) {
            entry.a();
        }
        long j = this.r;
        Function1 function1 = this.s;
        LayoutNode layoutNodeG = DelegatableNodeKt.g(this);
        int i = layoutNodeG.e;
        ThrottledCallbacks throttledCallbacks = LayoutNodeKt.a(layoutNodeG).getRectManager().b;
        throttledCallbacks.getClass();
        long j2 = j != 0 ? j : 0L;
        MutableIntObjectMap mutableIntObjectMap = throttledCallbacks.f2028a;
        ThrottledCallbacks.Entry entry2 = throttledCallbacks.new Entry(i, j2, this, function1);
        Object objB = mutableIntObjectMap.b(i);
        if (objB == null) {
            mutableIntObjectMap.h(i, entry2);
            objB = entry2;
        }
        ThrottledCallbacks.Entry entry3 = (ThrottledCallbacks.Entry) objB;
        if (entry3 != entry2) {
            while (true) {
                ThrottledCallbacks.Entry entry4 = entry3.e;
                if (entry4 == null) {
                    break;
                } else {
                    entry3 = entry4;
                }
            }
            entry3.e = entry2;
        }
        this.t = entry2;
    }
}
