package me.onebone.toolbar;

import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes7.dex */
final class ToolbarWithFabScaffoldKt$ToolbarWithFabScaffold$1$1 extends Lambda implements Function2<SubcomposeMeasureScope, Constraints, MeasureResult> {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: me.onebone.toolbar.ToolbarWithFabScaffoldKt$ToolbarWithFabScaffold$1$1$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Placeable.PlacementScope layout = (Placeable.PlacementScope) obj;
            Intrinsics.h(layout, "$this$layout");
            throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SubcomposeMeasureScope SubcomposeLayout = (SubcomposeMeasureScope) obj;
        long j = ((Constraints) obj2).f2197a;
        Intrinsics.h(SubcomposeLayout, "$this$SubcomposeLayout");
        Constraints.a(j, 0, 0, 0, Constraints.g(j), 2);
        throw null;
    }
}
