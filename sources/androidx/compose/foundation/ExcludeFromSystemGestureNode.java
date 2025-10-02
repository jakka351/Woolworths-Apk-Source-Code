package androidx.compose.foundation;

import android.graphics.Rect;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@RequiresApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/ExcludeFromSystemGestureNode;", "Landroidx/compose/foundation/RectListNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class ExcludeFromSystemGestureNode extends RectListNode {
    @Override // androidx.compose.foundation.RectListNode
    public final MutableVector s2() {
        MutableVector mutableVector = new MutableVector(new Rect[16], 0);
        mutableVector.e(mutableVector.f, DelegatableNode_androidKt.a(this).getSystemGestureExclusionRects());
        return mutableVector;
    }

    @Override // androidx.compose.foundation.RectListNode
    public final void t2(MutableVector mutableVector) {
        DelegatableNode_androidKt.a(this).setSystemGestureExclusionRects(mutableVector.g());
    }
}
