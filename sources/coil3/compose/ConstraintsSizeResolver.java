package coil3.compose;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import coil3.size.SizeResolver;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@Stable
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcoil3/compose/ConstraintsSizeResolver;", "Lcoil3/size/SizeResolver;", "Landroidx/compose/ui/layout/LayoutModifier;", "coil-compose-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ConstraintsSizeResolver implements SizeResolver, LayoutModifier {
    public static final /* synthetic */ int e = 0;
    public final SharedFlowImpl d = SharedFlowKt.b(1, 0, BufferOverflow.e, 2);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // coil3.size.SizeResolver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof coil3.compose.ConstraintsSizeResolver$size$1
            if (r0 == 0) goto L13
            r0 = r7
            coil3.compose.ConstraintsSizeResolver$size$1 r0 = (coil3.compose.ConstraintsSizeResolver$size$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L1a
        L13:
            coil3.compose.ConstraintsSizeResolver$size$1 r0 = new coil3.compose.ConstraintsSizeResolver$size$1
            kotlin.coroutines.jvm.internal.ContinuationImpl r7 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r7
            r0.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r7)
            goto L46
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            kotlin.ResultKt.b(r7)
            coil3.compose.ConstraintsSizeResolver$size$2 r7 = new coil3.compose.ConstraintsSizeResolver$size$2
            r2 = 0
            r4 = 2
            r7.<init>(r4, r2)
            r0.r = r3
            kotlinx.coroutines.flow.SharedFlowImpl r2 = r6.d
            java.lang.Object r7 = kotlinx.coroutines.flow.FlowKt.x(r2, r7, r0)
            if (r7 != r1) goto L46
            return r1
        L46:
            androidx.compose.ui.unit.Constraints r7 = (androidx.compose.ui.unit.Constraints) r7
            long r0 = r7.f2197a
            kotlinx.coroutines.CoroutineDispatcher r7 = coil3.compose.internal.UtilsKt.f13070a
            coil3.size.Size r7 = new coil3.size.Size
            int r2 = androidx.compose.ui.unit.Constraints.h(r0)
            coil3.size.Dimension$Undefined r3 = coil3.size.Dimension.Undefined.f13148a
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r4) goto L62
            coil3.size.DimensionKt.a(r2)
            coil3.size.Dimension$Pixels r5 = new coil3.size.Dimension$Pixels
            r5.<init>(r2)
            goto L63
        L62:
            r5 = r3
        L63:
            int r0 = androidx.compose.ui.unit.Constraints.g(r0)
            if (r0 == r4) goto L71
            coil3.size.DimensionKt.a(r0)
            coil3.size.Dimension$Pixels r3 = new coil3.size.Dimension$Pixels
            r3.<init>(r0)
        L71:
            r7.<init>(r5, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.compose.ConstraintsSizeResolver.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final MeasureResult n(MeasureScope measureScope, Measurable measurable, long j) {
        this.d.f(new Constraints(j));
        Placeable placeableC0 = measurable.c0(j);
        return measureScope.L0(placeableC0.d, placeableC0.e, EmptyMap.d, new c(placeableC0, 0));
    }
}
