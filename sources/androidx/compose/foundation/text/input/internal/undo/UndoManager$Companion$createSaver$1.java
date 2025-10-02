package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\n\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"androidx/compose/foundation/text/input/internal/undo/UndoManager$Companion$createSaver$1", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text/input/internal/undo/UndoManager;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 176)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class UndoManager$Companion$createSaver$1 implements Saver<UndoManager<Object>, Object> {
    @Override // androidx.compose.runtime.saveable.Saver
    public final Object a(SaverScope saverScope, Object obj) {
        UndoManager undoManager = (UndoManager) obj;
        ListBuilder listBuilderV = CollectionsKt.v();
        listBuilderV.add(Integer.valueOf(undoManager.f1186a));
        SnapshotStateList snapshotStateList = undoManager.b;
        listBuilderV.add(Integer.valueOf(snapshotStateList.size()));
        SnapshotStateList snapshotStateList2 = undoManager.c;
        listBuilderV.add(Integer.valueOf(snapshotStateList2.size()));
        if (snapshotStateList.size() > 0) {
            snapshotStateList.get(0);
            throw null;
        }
        if (snapshotStateList2.size() <= 0) {
            return CollectionsKt.q(listBuilderV);
        }
        snapshotStateList2.get(0);
        throw null;
    }

    @Override // androidx.compose.runtime.saveable.Saver
    public final Object b(Object obj) {
        Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        int iIntValue = ((Number) list.get(0)).intValue();
        int iIntValue2 = ((Number) list.get(1)).intValue();
        int iIntValue3 = ((Number) list.get(2)).intValue();
        ListBuilder listBuilderV = CollectionsKt.v();
        if (3 < iIntValue2 + 3) {
            list.get(3);
            throw null;
        }
        ListBuilder listBuilderQ = CollectionsKt.q(listBuilderV);
        ListBuilder listBuilderV2 = CollectionsKt.v();
        if (3 >= iIntValue2 + iIntValue3 + 3) {
            return new UndoManager(listBuilderQ, CollectionsKt.q(listBuilderV2), iIntValue);
        }
        list.get(3);
        throw null;
    }
}
