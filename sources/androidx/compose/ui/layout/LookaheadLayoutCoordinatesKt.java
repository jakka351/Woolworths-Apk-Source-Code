package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LookaheadDelegate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LookaheadLayoutCoordinatesKt {
    public static final LookaheadDelegate a(LookaheadDelegate lookaheadDelegate) {
        LayoutNode layoutNodeK = lookaheadDelegate.p.p;
        while (true) {
            LayoutNode layoutNodeK2 = layoutNodeK.K();
            if ((layoutNodeK2 != null ? layoutNodeK2.m : null) == null) {
                LookaheadDelegate v = layoutNodeK.K.c.getV();
                Intrinsics.e(v);
                return v;
            }
            LayoutNode layoutNodeK3 = layoutNodeK.K();
            LayoutNode layoutNode = layoutNodeK3 != null ? layoutNodeK3.m : null;
            Intrinsics.e(layoutNode);
            if (layoutNode.l) {
                layoutNodeK = layoutNodeK.K();
                Intrinsics.e(layoutNodeK);
            } else {
                LayoutNode layoutNodeK4 = layoutNodeK.K();
                Intrinsics.e(layoutNodeK4);
                layoutNodeK = layoutNodeK4.m;
                Intrinsics.e(layoutNodeK);
            }
        }
    }
}
