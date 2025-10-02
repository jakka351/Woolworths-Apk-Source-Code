package androidx.compose.foundation.text;

import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/EmptyMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class EmptyMeasurePolicy implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public static final EmptyMeasurePolicy f1112a = new EmptyMeasurePolicy();
    public static final Function1 b = null;

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult c(MeasureScope measureScope, List list, long j) {
        return measureScope.L0(Constraints.h(j), Constraints.g(j), EmptyMap.d, EmptyMeasurePolicy$placementBlock$1.h);
    }
}
