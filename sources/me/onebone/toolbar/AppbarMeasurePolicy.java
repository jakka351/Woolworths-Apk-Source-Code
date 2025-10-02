package me.onebone.toolbar;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lme/onebone/toolbar/AppbarMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "lib_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes7.dex */
final class AppbarMeasurePolicy implements MeasurePolicy {
    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult c(MeasureScope measure, List measurables, long j) {
        boolean z;
        Intrinsics.h(measure, "$this$measure");
        Intrinsics.h(measurables, "measurables");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ArrayList arrayList = new ArrayList();
        int iMax = 0;
        int iMax2 = 0;
        for (Object obj : measurables) {
            Measurable measurable = (Measurable) obj;
            if (Intrinsics.c(measurable.getA(), AppBarBodyMarker.f24909a)) {
                z = true;
            } else {
                if (objectRef.d != null) {
                    throw new IllegalStateException("There cannot exist multiple toolbars under single parent");
                }
                Placeable placeableC0 = measurable.c0(Constraints.a(j, 0, 0, 0, 0, 10));
                iMax = Math.max(iMax, placeableC0.d);
                iMax2 = Math.max(iMax2, placeableC0.e);
                objectRef.d = placeableC0;
                z = false;
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        final ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw null;
        }
        Placeable placeable = (Placeable) objectRef.d;
        return measure.L0(RangesKt.c(iMax, Constraints.j(j), Constraints.h(j)), RangesKt.c(iMax2 + (placeable != null ? placeable.e : 0), Constraints.i(j), Constraints.g(j)), EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>(this, arrayList2) { // from class: me.onebone.toolbar.AppbarMeasurePolicy$measure$1
            public final /* synthetic */ ArrayList i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.i = arrayList2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Placeable.PlacementScope layout = (Placeable.PlacementScope) obj2;
                Intrinsics.h(layout, "$this$layout");
                if (((Placeable) this.h.d) != null) {
                    throw null;
                }
                Iterator it2 = this.i.iterator();
                if (!it2.hasNext()) {
                    return Unit.f24250a;
                }
                throw null;
            }
        });
    }
}
