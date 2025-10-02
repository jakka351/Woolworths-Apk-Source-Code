package androidx.compose.ui.node;

import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class MeasureScopeWithLayoutNodeKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.d;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.d;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                LayoutNode.LayoutState layoutState3 = LayoutNode.LayoutState.d;
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                LayoutNode.LayoutState layoutState4 = LayoutNode.LayoutState.d;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final ArrayList a(IntrinsicMeasureScope intrinsicMeasureScope) {
        Intrinsics.f(intrinsicMeasureScope, "null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode");
        LayoutNode p = ((MeasureScopeWithLayoutNode) intrinsicMeasureScope).getP();
        boolean zB = b(p);
        List listE = p.E();
        ArrayList arrayList = new ArrayList(listE.size());
        int size = listE.size();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode = (LayoutNode) listE.get(i);
            arrayList.add(zB ? layoutNode.B() : layoutNode.C());
        }
        return arrayList;
    }

    public static final boolean b(LayoutNode layoutNode) {
        int iOrdinal = layoutNode.L.d.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return false;
            }
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                LayoutNode layoutNodeK = layoutNode.K();
                if (layoutNodeK != null) {
                    return b(layoutNodeK);
                }
                throw new IllegalArgumentException("no parent for idle node");
            }
        }
        return true;
    }
}
