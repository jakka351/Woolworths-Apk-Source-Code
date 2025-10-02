package androidx.compose.ui.tooling.data;

import androidx.compose.ui.unit.IntRect;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@UiToolingDataApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/tooling/data/EmptyGroup;", "Landroidx/compose/ui/tooling/data/Group;", "ui-tooling-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class EmptyGroup extends Group {
    public static final EmptyGroup h;

    static {
        IntRect intRect = SlotTreeKt.f2191a;
        EmptyList emptyList = EmptyList.d;
        h = new EmptyGroup(null, null, null, null, intRect, emptyList, emptyList);
    }
}
