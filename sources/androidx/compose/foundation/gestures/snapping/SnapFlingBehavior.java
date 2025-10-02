package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.ScrollableKt$DefaultScrollMotionDurationScale$1;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SnapFlingBehavior implements TargetedFlingBehavior {

    /* renamed from: a, reason: collision with root package name */
    public final SnapLayoutInfoProvider f914a;
    public final DecayAnimationSpec b;
    public final AnimationSpec c;
    public final ScrollableKt$DefaultScrollMotionDurationScale$1 d = ScrollableKt.c;

    public SnapFlingBehavior(SnapLayoutInfoProvider snapLayoutInfoProvider, DecayAnimationSpec decayAnimationSpec, AnimationSpec animationSpec) {
        this.f914a = snapLayoutInfoProvider;
        this.b = decayAnimationSpec;
        this.c = animationSpec;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r4, androidx.compose.foundation.gestures.ScrollScope r5, float r6, float r7, kotlin.jvm.functions.Function1 r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1
            if (r0 == 0) goto L14
            r0 = r9
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.r = r1
        L12:
            r9 = r0
            goto L1a
        L14:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1
            r0.<init>(r4, r9)
            goto L12
        L1a:
            java.lang.Object r0 = r9.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r9.r
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r0)
            goto L84
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.ResultKt.b(r0)
            float r0 = java.lang.Math.abs(r6)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L3e
            goto L46
        L3e:
            float r0 = java.lang.Math.abs(r7)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L4d
        L46:
            r4 = 28
            androidx.compose.animation.core.AnimationState r4 = androidx.compose.animation.core.AnimationStateKt.a(r6, r7, r4)
            return r4
        L4d:
            r9.r = r3
            androidx.compose.animation.core.DecayAnimationSpec r0 = r4.b
            float r2 = androidx.compose.animation.core.DecayAnimationSpecKt.a(r0, r2, r7)
            float r2 = java.lang.Math.abs(r2)
            float r3 = java.lang.Math.abs(r6)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L67
            androidx.compose.foundation.gestures.snapping.DecayApproachAnimation r4 = new androidx.compose.foundation.gestures.snapping.DecayApproachAnimation
            r4.<init>(r0)
            goto L6f
        L67:
            androidx.compose.foundation.gestures.snapping.TargetApproachAnimation r0 = new androidx.compose.foundation.gestures.snapping.TargetApproachAnimation
            androidx.compose.animation.core.AnimationSpec r4 = r4.c
            r0.<init>(r4)
            r4 = r0
        L6f:
            float r0 = androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.f915a
            r0 = r6
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r0)
            r0 = r7
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r0)
            java.lang.Object r0 = r4.a(r5, r6, r7, r8, r9)
            if (r0 != r1) goto L84
            return r1
        L84:
            androidx.compose.foundation.gestures.snapping.AnimationResult r0 = (androidx.compose.foundation.gestures.snapping.AnimationResult) r0
            androidx.compose.animation.core.AnimationState r4 = r0.b
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.c(androidx.compose.foundation.gestures.snapping.SnapFlingBehavior, androidx.compose.foundation.gestures.ScrollScope, float, float, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.TargetedFlingBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(androidx.compose.foundation.gestures.ScrollScope r5, float r6, kotlin.jvm.functions.Function1 r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$1 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$1 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$1
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r8)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.b(r8)
            r0.r = r3
            java.lang.Object r8 = r4.d(r5, r6, r7, r0)
            if (r8 != r1) goto L3b
            return r1
        L3b:
            androidx.compose.foundation.gestures.snapping.AnimationResult r8 = (androidx.compose.foundation.gestures.snapping.AnimationResult) r8
            java.lang.Float r5 = r8.f910a
            float r5 = r5.floatValue()
            androidx.compose.animation.core.AnimationState r6 = r8.b
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L4b
            goto L55
        L4b:
            java.lang.Object r5 = r6.b()
            java.lang.Number r5 = (java.lang.Number) r5
            float r7 = r5.floatValue()
        L55:
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.b(androidx.compose.foundation.gestures.ScrollScope, float, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(androidx.compose.foundation.gestures.ScrollScope r11, float r12, kotlin.jvm.functions.Function1 r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1
            if (r0 == 0) goto L13
            r0 = r14
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlin.jvm.functions.Function1 r11 = r0.p
            r13 = r11
            kotlin.jvm.functions.Function1 r13 = (kotlin.jvm.functions.Function1) r13
            kotlin.ResultKt.b(r14)
            r5 = r10
            goto L53
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            kotlin.ResultKt.b(r14)
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1 r4 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1
            r9 = 0
            r5 = r10
            r8 = r11
            r6 = r12
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r13 = r7
            kotlin.jvm.functions.Function1 r13 = (kotlin.jvm.functions.Function1) r13
            r0.p = r13
            r0.s = r3
            androidx.compose.foundation.gestures.ScrollableKt$DefaultScrollMotionDurationScale$1 r11 = r5.d
            java.lang.Object r14 = kotlinx.coroutines.BuildersKt.f(r11, r4, r0)
            if (r14 != r1) goto L52
            return r1
        L52:
            r13 = r7
        L53:
            androidx.compose.foundation.gestures.snapping.AnimationResult r14 = (androidx.compose.foundation.gestures.snapping.AnimationResult) r14
            java.lang.Float r11 = new java.lang.Float
            r12 = 0
            r11.<init>(r12)
            r13.invoke(r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.d(androidx.compose.foundation.gestures.ScrollScope, float, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SnapFlingBehavior) {
            SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) obj;
            if (Intrinsics.c(snapFlingBehavior.c, this.c) && Intrinsics.c(snapFlingBehavior.b, this.b) && Intrinsics.c(snapFlingBehavior.f914a, this.f914a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f914a.hashCode() + ((this.b.hashCode() + (this.c.hashCode() * 31)) * 31);
    }
}
