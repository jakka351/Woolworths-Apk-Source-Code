package androidx.compose.foundation.text;

import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/LinksTextMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class LinksTextMeasurePolicy implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f1123a;

    public LinksTextMeasurePolicy(Function0 function0) {
        this.f1123a = function0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult c(MeasureScope measureScope, final List list, long j) {
        return measureScope.L0(Constraints.h(j), Constraints.g(j), EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.LinksTextMeasurePolicy$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                ArrayList arrayListF = BasicTextKt.f(list, this.f1123a);
                if (arrayListF != null) {
                    int size = arrayListF.size();
                    for (int i = 0; i < size; i++) {
                        Pair pair = (Pair) arrayListF.get(i);
                        Placeable placeable = (Placeable) pair.d;
                        Function0 function0 = (Function0) pair.e;
                        Placeable.PlacementScope.g(placementScope, placeable, function0 != null ? ((IntOffset) function0.invoke()).f2200a : 0L);
                    }
                }
                return Unit.f24250a;
            }
        });
    }
}
