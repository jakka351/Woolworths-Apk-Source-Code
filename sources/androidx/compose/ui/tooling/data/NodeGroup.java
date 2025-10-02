package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.IntRect;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@StabilityInferred
@UiToolingDataApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/tooling/data/NodeGroup;", "Landroidx/compose/ui/tooling/data/Group;", "ui-tooling-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NodeGroup extends Group {
    public final Object h;
    public final List i;

    public NodeGroup(Object obj, Object obj2, IntRect intRect, ArrayList arrayList, List list, ArrayList arrayList2) {
        super(obj, null, null, null, intRect, arrayList, arrayList2);
        this.h = obj2;
        this.i = list;
    }

    @Override // androidx.compose.ui.tooling.data.Group
    /* renamed from: a, reason: from getter */
    public final List getI() {
        return this.i;
    }
}
