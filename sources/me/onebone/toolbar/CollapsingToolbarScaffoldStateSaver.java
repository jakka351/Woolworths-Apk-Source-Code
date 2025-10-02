package me.onebone.toolbar;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001¨\u0006\u0005"}, d2 = {"Lme/onebone/toolbar/CollapsingToolbarScaffoldStateSaver;", "Landroidx/compose/runtime/saveable/Saver;", "Lme/onebone/toolbar/CollapsingToolbarScaffoldState;", "", "", "lib_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes7.dex */
final class CollapsingToolbarScaffoldStateSaver implements Saver<CollapsingToolbarScaffoldState, List<? extends Object>> {
    @Override // androidx.compose.runtime.saveable.Saver
    public final Object a(SaverScope saverScope, Object obj) {
        CollapsingToolbarScaffoldState value = (CollapsingToolbarScaffoldState) obj;
        Intrinsics.h(saverScope, "<this>");
        Intrinsics.h(value, "value");
        return CollectionsKt.R(Integer.valueOf(value.f24914a.g()), Integer.valueOf(((Number) ((SnapshotMutableStateImpl) value.b).getD()).intValue()));
    }

    @Override // androidx.compose.runtime.saveable.Saver
    public final Object b(Object obj) {
        List value = (List) obj;
        Intrinsics.h(value, "value");
        Object obj2 = value.get(0);
        Intrinsics.f(obj2, "null cannot be cast to non-null type kotlin.Int");
        CollapsingToolbarState collapsingToolbarState = new CollapsingToolbarState(((Integer) obj2).intValue());
        Object obj3 = value.get(1);
        Intrinsics.f(obj3, "null cannot be cast to non-null type kotlin.Int");
        return new CollapsingToolbarScaffoldState(collapsingToolbarState, ((Integer) obj3).intValue());
    }
}
