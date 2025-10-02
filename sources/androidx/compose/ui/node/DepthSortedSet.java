package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/DepthSortedSet;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class DepthSortedSet {

    /* renamed from: a, reason: collision with root package name */
    public final TreeSet f1906a = new TreeSet(DepthSortedSetKt.f1907a);

    public final void a(LayoutNode layoutNode) {
        if (!layoutNode.q()) {
            InlineClassHelperKt.b("DepthSortedSet.add called on an unattached node");
        }
        this.f1906a.add(layoutNode);
    }

    public final boolean b(LayoutNode layoutNode) {
        if (!layoutNode.q()) {
            InlineClassHelperKt.b("DepthSortedSet.remove called on an unattached node");
        }
        return this.f1906a.remove(layoutNode);
    }

    public final String toString() {
        return this.f1906a.toString();
    }
}
