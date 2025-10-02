package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.IntRect;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@StabilityInferred
@UiToolingDataApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/tooling/data/CallGroup;", "Landroidx/compose/ui/tooling/data/Group;", "ui-tooling-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CallGroup extends Group {
    public final Object h;

    public CallGroup(Object obj, String str, IntRect intRect, SourceLocation sourceLocation, Object obj2, List list, ArrayList arrayList, ArrayList arrayList2) {
        super(obj, str, sourceLocation, obj2, intRect, arrayList, arrayList2);
        this.h = list;
    }
}
