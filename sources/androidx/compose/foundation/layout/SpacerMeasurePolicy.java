package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/SpacerMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class SpacerMeasurePolicy implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public static final SpacerMeasurePolicy f978a = new SpacerMeasurePolicy();

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult c(MeasureScope measureScope, List list, long j) {
        return measureScope.L0(Constraints.f(j) ? Constraints.h(j) : 0, Constraints.e(j) ? Constraints.g(j) : 0, EmptyMap.d, SpacerMeasurePolicy$measure$1$1.h);
    }
}
