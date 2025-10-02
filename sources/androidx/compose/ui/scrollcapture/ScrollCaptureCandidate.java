package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.unit.IntRect;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/scrollcapture/ScrollCaptureCandidate;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ScrollCaptureCandidate {

    /* renamed from: a, reason: collision with root package name */
    public final SemanticsNode f2008a;
    public final int b;
    public final IntRect c;
    public final NodeCoordinator d;

    public ScrollCaptureCandidate(SemanticsNode semanticsNode, int i, IntRect intRect, NodeCoordinator nodeCoordinator) {
        this.f2008a = semanticsNode;
        this.b = i;
        this.c = intRect;
        this.d = nodeCoordinator;
    }

    public final LayoutCoordinates a() {
        return this.d;
    }

    /* renamed from: b, reason: from getter */
    public final SemanticsNode getF2008a() {
        return this.f2008a;
    }

    /* renamed from: c, reason: from getter */
    public final IntRect getC() {
        return this.c;
    }

    public final String toString() {
        return "ScrollCaptureCandidate(node=" + this.f2008a + ", depth=" + this.b + ", viewportBoundsInWindow=" + this.c + ", coordinates=" + this.d + ')';
    }
}
