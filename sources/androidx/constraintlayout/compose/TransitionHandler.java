package androidx.constraintlayout.compose;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@ExperimentalMotionApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/constraintlayout/compose/TransitionHandler;", "", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TransitionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final MotionMeasurer f2254a;
    public final MutableFloatState b;

    public TransitionHandler(MotionMeasurer motionMeasurer, MutableFloatState mutableFloatState) {
        this.f2254a = motionMeasurer;
        this.b = mutableFloatState;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.constraintlayout.compose.TransitionHandler$updateProgressWhileTouchUp$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.constraintlayout.compose.TransitionHandler$updateProgressWhileTouchUp$1 r0 = (androidx.constraintlayout.compose.TransitionHandler$updateProgressWhileTouchUp$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            androidx.constraintlayout.compose.TransitionHandler$updateProgressWhileTouchUp$1 r0 = new androidx.constraintlayout.compose.TransitionHandler$updateProgressWhileTouchUp$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            androidx.constraintlayout.compose.TransitionHandler r0 = r0.p
            kotlin.ResultKt.b(r5)
            goto L4d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.ResultKt.b(r5)
            androidx.constraintlayout.compose.TransitionHandler$updateProgressWhileTouchUp$newProgress$1 r5 = new androidx.constraintlayout.compose.TransitionHandler$updateProgressWhileTouchUp$newProgress$1
            r5.<init>()
            r0.p = r4
            r0.s = r3
            kotlin.coroutines.CoroutineContext r2 = r0.getD()
            androidx.compose.runtime.MonotonicFrameClock r2 = androidx.compose.runtime.MonotonicFrameClockKt.a(r2)
            java.lang.Object r5 = r2.e(r5, r0)
            if (r5 != r1) goto L4c
            return r1
        L4c:
            r0 = r4
        L4d:
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            androidx.compose.runtime.MutableFloatState r0 = r0.b
            r0.p(r5)
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.TransitionHandler.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
