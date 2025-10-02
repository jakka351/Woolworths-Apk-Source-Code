package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/pager/PagerWrapperFlingBehavior;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class PagerWrapperFlingBehavior implements FlingBehavior {

    /* renamed from: a, reason: collision with root package name */
    public final TargetedFlingBehavior f1095a;
    public final PagerState b;

    public PagerWrapperFlingBehavior(TargetedFlingBehavior targetedFlingBehavior, PagerState pagerState) {
        this.f1095a = targetedFlingBehavior;
        this.b = pagerState;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.FlingBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(final androidx.compose.foundation.gestures.ScrollScope r6, float r7, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1 r0 = (androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L1a
        L13:
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1 r0 = new androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1
            kotlin.coroutines.jvm.internal.ContinuationImpl r8 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r8
            r0.<init>(r5, r8)
        L1a:
            java.lang.Object r8 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.p
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior r6 = (androidx.compose.foundation.pager.PagerWrapperFlingBehavior) r6
            kotlin.ResultKt.b(r8)
            goto L4b
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.ResultKt.b(r8)
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$resultVelocity$1$1 r8 = new androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$resultVelocity$1$1
            r8.<init>()
            r0.p = r5
            r0.s = r3
            androidx.compose.foundation.gestures.TargetedFlingBehavior r2 = r5.f1095a
            java.lang.Object r8 = r2.b(r6, r7, r8, r0)
            if (r8 != r1) goto L4a
            return r1
        L4a:
            r6 = r5
        L4b:
            java.lang.Number r8 = (java.lang.Number) r8
            float r7 = r8.floatValue()
            androidx.compose.foundation.pager.PagerState r6 = r6.b
            float r8 = r6.k()
            r0 = 0
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 != 0) goto L5d
            goto L96
        L5d:
            float r8 = r6.k()
            float r8 = java.lang.Math.abs(r8)
            double r1 = (double) r8
            r3 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 >= 0) goto L96
            int r8 = r6.j()
            androidx.compose.foundation.gestures.ScrollableState r1 = r6.k
            boolean r1 = r1.a()
            if (r1 == 0) goto L91
            androidx.compose.runtime.MutableState r1 = r6.p
            androidx.compose.runtime.SnapshotMutableStateImpl r1 = (androidx.compose.runtime.SnapshotMutableStateImpl) r1
            java.lang.Object r1 = r1.getD()
            androidx.compose.foundation.pager.PagerMeasureResult r1 = (androidx.compose.foundation.pager.PagerMeasureResult) r1
            kotlinx.coroutines.CoroutineScope r1 = r1.s
            androidx.compose.foundation.pager.PagerState$requestScrollToPage$1 r2 = new androidx.compose.foundation.pager.PagerState$requestScrollToPage$1
            r3 = 0
            r2.<init>(r6, r3)
            r4 = 3
            kotlinx.coroutines.BuildersKt.c(r1, r3, r3, r2, r4)
        L91:
            r1 = 0
            r6.u(r1, r0, r8)
            goto L99
        L96:
            r6.k()
        L99:
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerWrapperFlingBehavior.a(androidx.compose.foundation.gestures.ScrollScope, float, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
