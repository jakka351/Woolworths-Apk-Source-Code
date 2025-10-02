package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.OwnerScope;
import androidx.compose.ui.semantics.ScrollAxisRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/ScrollObservationScope;", "Landroidx/compose/ui/node/OwnerScope;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ScrollObservationScope implements OwnerScope {
    public final int d;
    public final List e;
    public Float f = null;
    public Float g = null;
    public ScrollAxisRange h = null;
    public ScrollAxisRange i = null;

    public ScrollObservationScope(int i, ArrayList arrayList) {
        this.d = i;
        this.e = arrayList;
    }

    /* renamed from: a, reason: from getter */
    public final int getD() {
        return this.d;
    }

    public final void b(ScrollAxisRange scrollAxisRange) {
        this.h = scrollAxisRange;
    }

    public final void c(ScrollAxisRange scrollAxisRange) {
        this.i = scrollAxisRange;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public final boolean y0() {
        return this.e.contains(this);
    }
}
