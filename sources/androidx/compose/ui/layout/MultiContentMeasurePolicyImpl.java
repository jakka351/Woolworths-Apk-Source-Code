package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.MeasureScopeWithLayoutNodeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/MultiContentMeasurePolicyImpl;", "Landroidx/compose/ui/layout/MeasurePolicy;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class MultiContentMeasurePolicyImpl implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public final MultiContentMeasurePolicy f1889a;

    public MultiContentMeasurePolicyImpl(MultiContentMeasurePolicy multiContentMeasurePolicy) {
        this.f1889a = multiContentMeasurePolicy;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult c(MeasureScope measureScope, List list, long j) {
        return this.f1889a.c(measureScope, MeasureScopeWithLayoutNodeKt.a(measureScope), j);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int d(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return this.f1889a.d(intrinsicMeasureScope, MeasureScopeWithLayoutNodeKt.a(intrinsicMeasureScope), i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int e(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return this.f1889a.e(intrinsicMeasureScope, MeasureScopeWithLayoutNodeKt.a(intrinsicMeasureScope), i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MultiContentMeasurePolicyImpl) && Intrinsics.c(this.f1889a, ((MultiContentMeasurePolicyImpl) obj).f1889a);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int f(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return this.f1889a.f(intrinsicMeasureScope, MeasureScopeWithLayoutNodeKt.a(intrinsicMeasureScope), i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int h(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return this.f1889a.h(intrinsicMeasureScope, MeasureScopeWithLayoutNodeKt.a(intrinsicMeasureScope), i);
    }

    public final int hashCode() {
        return this.f1889a.hashCode();
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.f1889a + ')';
    }
}
