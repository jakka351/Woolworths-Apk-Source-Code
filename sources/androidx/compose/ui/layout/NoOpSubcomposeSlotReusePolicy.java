package androidx.compose.ui.layout;

import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/NoOpSubcomposeSlotReusePolicy;", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class NoOpSubcomposeSlotReusePolicy implements SubcomposeSlotReusePolicy {

    /* renamed from: a, reason: collision with root package name */
    public static final NoOpSubcomposeSlotReusePolicy f1890a = new NoOpSubcomposeSlotReusePolicy();

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public final void a(SubcomposeSlotReusePolicy.SlotIdsSet slotIdsSet) {
        slotIdsSet.clear();
    }

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public final boolean b(Object obj, Object obj2) {
        return false;
    }
}
