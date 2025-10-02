package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.IntervalTree;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/compose/ui/graphics/IntervalTree$iterator$1", "", "Landroidx/compose/ui/graphics/Interval;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IntervalTree$iterator$1 implements Iterator<Interval<Object>>, KMappedMarker {
    public IntervalTree.Node d;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        throw null;
    }

    @Override // java.util.Iterator
    public final Interval<Object> next() {
        IntervalTree.Node node;
        IntervalTree.Node node2 = this.d;
        IntervalTree.Node node3 = node2.b;
        IntervalTree intervalTree = IntervalTree.this;
        if (node3 != intervalTree.f1771a) {
            node3.getClass();
            node = node3;
            while (true) {
                IntervalTree.Node node4 = node.f1772a;
                if (node4 == IntervalTree.this.f1771a) {
                    break;
                }
                node = node4;
            }
        } else {
            IntervalTree.Node node5 = node2.c;
            IntervalTree.Node node6 = node2;
            while (node5 != intervalTree.f1771a && node6 == node5.b) {
                node6 = node5;
                node5 = node5.c;
            }
            node = node5;
        }
        this.d = node;
        return node2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
