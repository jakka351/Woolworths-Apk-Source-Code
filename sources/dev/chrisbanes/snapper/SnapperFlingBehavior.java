package dev.chrisbanes.snapper;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@ExperimentalSnapperApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldev/chrisbanes/snapper/SnapperFlingBehavior;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "lib_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SnapperFlingBehavior implements FlingBehavior {

    /* renamed from: a, reason: collision with root package name */
    public final LazyListSnapperLayoutInfo f23783a;
    public final DecayAnimationSpec b;
    public final AnimationSpec c;
    public final Function3 d;
    public final Function1 e;
    public final MutableState f;

    public SnapperFlingBehavior(LazyListSnapperLayoutInfo lazyListSnapperLayoutInfo, DecayAnimationSpec decayAnimationSpec, AnimationSpec springAnimationSpec, Function3 function3) {
        Intrinsics.h(decayAnimationSpec, "decayAnimationSpec");
        Intrinsics.h(springAnimationSpec, "springAnimationSpec");
        Function1 function1 = SnapperFlingBehaviorDefaults.b;
        this.f23783a = lazyListSnapperLayoutInfo;
        this.b = decayAnimationSpec;
        this.c = springAnimationSpec;
        this.d = function3;
        this.e = function1;
        this.f = SnapshotStateKt.f(null);
    }

    public static final boolean c(SnapperFlingBehavior snapperFlingBehavior, AnimationScope animationScope, SnapperLayoutItemInfo snapperLayoutItemInfo, int i, Function1 function1) {
        float fFloatValue = ((Number) animationScope.f()).floatValue();
        LazyListSnapperLayoutInfo lazyListSnapperLayoutInfo = snapperFlingBehavior.f23783a;
        int iD = (fFloatValue <= BitmapDescriptorFactory.HUE_RED || snapperLayoutItemInfo.a() < i) ? (fFloatValue >= BitmapDescriptorFactory.HUE_RED || snapperLayoutItemInfo.a() > i - 1) ? 0 : lazyListSnapperLayoutInfo.d(snapperLayoutItemInfo.a() + 1) : lazyListSnapperLayoutInfo.d(snapperLayoutItemInfo.a());
        if (iD == 0) {
            return false;
        }
        function1.invoke(Float.valueOf(iD));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    @Override // androidx.compose.foundation.gestures.FlingBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(androidx.compose.foundation.gestures.ScrollScope r17, float r18, kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.chrisbanes.snapper.SnapperFlingBehavior.a(androidx.compose.foundation.gestures.ScrollScope, float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final float d(float f) {
        LazyListSnapperLayoutInfo lazyListSnapperLayoutInfo = this.f23783a;
        return ((f >= BitmapDescriptorFactory.HUE_RED || lazyListSnapperLayoutInfo.c()) && (f <= BitmapDescriptorFactory.HUE_RED || lazyListSnapperLayoutInfo.b())) ? BitmapDescriptorFactory.HUE_RED : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(androidx.compose.foundation.gestures.ScrollScope r10, int r11, float r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.chrisbanes.snapper.SnapperFlingBehavior.e(androidx.compose.foundation.gestures.ScrollScope, int, float, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(final androidx.compose.foundation.gestures.ScrollScope r15, dev.chrisbanes.snapper.SnapperLayoutItemInfo r16, final int r17, float r18, boolean r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) throws java.lang.Throwable {
        /*
            r14 = this;
            r6 = r17
            r0 = r18
            r1 = r20
            boolean r2 = r1 instanceof dev.chrisbanes.snapper.SnapperFlingBehavior$performDecayFling$1
            if (r2 == 0) goto L1a
            r2 = r1
            dev.chrisbanes.snapper.SnapperFlingBehavior$performDecayFling$1 r2 = (dev.chrisbanes.snapper.SnapperFlingBehavior$performDecayFling$1) r2
            int r3 = r2.t
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1a
            int r3 = r3 - r4
            r2.t = r3
        L18:
            r7 = r2
            goto L20
        L1a:
            dev.chrisbanes.snapper.SnapperFlingBehavior$performDecayFling$1 r2 = new dev.chrisbanes.snapper.SnapperFlingBehavior$performDecayFling$1
            r2.<init>(r14, r1)
            goto L18
        L20:
            java.lang.Object r1 = r7.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r8 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r7.t
            r9 = 0
            r10 = 1
            if (r2 == 0) goto L41
            if (r2 != r10) goto L39
            kotlin.jvm.internal.Ref$FloatRef r15 = r7.q
            dev.chrisbanes.snapper.SnapperFlingBehavior r2 = r7.p
            kotlin.ResultKt.b(r1)     // Catch: java.lang.Throwable -> L35
            goto La6
        L35:
            r0 = move-exception
            r15 = r0
            goto Lb4
        L39:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L41:
            kotlin.ResultKt.b(r1)
            int r1 = r16.a()
            if (r1 != r6) goto L60
            dev.chrisbanes.snapper.LazyListSnapperLayoutInfo r1 = r14.f23783a
            int r2 = r16.a()
            int r1 = r1.d(r2)
            if (r1 != 0) goto L60
            float r15 = r14.d(r0)
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r15)
            return r0
        L60:
            kotlin.jvm.internal.Ref$FloatRef r3 = new kotlin.jvm.internal.Ref$FloatRef
            r3.<init>()
            r3.d = r0
            kotlin.jvm.internal.Ref$FloatRef r1 = new kotlin.jvm.internal.Ref$FloatRef
            r1.<init>()
            r11 = 0
            if (r19 == 0) goto L7e
            int r2 = r16.a()
            int r2 = r6 - r2
            int r2 = java.lang.Math.abs(r2)
            r4 = 2
            if (r2 < r4) goto L7e
            r5 = r10
            goto L7f
        L7e:
            r5 = r11
        L7f:
            java.lang.Integer r2 = new java.lang.Integer     // Catch: java.lang.Throwable -> Lb1
            r2.<init>(r6)     // Catch: java.lang.Throwable -> Lb1
            r14.h(r2)     // Catch: java.lang.Throwable -> Lb1
            r2 = 0
            r4 = 28
            androidx.compose.animation.core.AnimationState r12 = androidx.compose.animation.core.AnimationStateKt.a(r2, r0, r4)     // Catch: java.lang.Throwable -> Lb1
            androidx.compose.animation.core.DecayAnimationSpec r13 = r14.b     // Catch: java.lang.Throwable -> Lb1
            dev.chrisbanes.snapper.SnapperFlingBehavior$performDecayFling$4 r0 = new dev.chrisbanes.snapper.SnapperFlingBehavior$performDecayFling$4     // Catch: java.lang.Throwable -> Lb1
            r4 = r14
            r2 = r15
            r0.<init>()     // Catch: java.lang.Throwable -> Lb1
            r7.p = r14     // Catch: java.lang.Throwable -> Lb1
            r7.q = r3     // Catch: java.lang.Throwable -> Lb1
            r7.t = r10     // Catch: java.lang.Throwable -> Lb1
            java.lang.Object r15 = androidx.compose.animation.core.SuspendAnimationKt.e(r12, r13, r11, r0, r7)     // Catch: java.lang.Throwable -> Lb1
            if (r15 != r8) goto La4
            return r8
        La4:
            r2 = r14
            r15 = r3
        La6:
            r2.h(r9)
            float r15 = r15.d
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r15)
            return r0
        Lb1:
            r0 = move-exception
            r15 = r0
            r2 = r14
        Lb4:
            r2.h(r9)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.chrisbanes.snapper.SnapperFlingBehavior.f(androidx.compose.foundation.gestures.ScrollScope, dev.chrisbanes.snapper.SnapperLayoutItemInfo, int, float, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(final androidx.compose.foundation.gestures.ScrollScope r13, dev.chrisbanes.snapper.SnapperLayoutItemInfo r14, final int r15, float r16, kotlin.coroutines.jvm.internal.ContinuationImpl r17) throws java.lang.Throwable {
        /*
            r12 = this;
            r0 = r17
            boolean r1 = r0 instanceof dev.chrisbanes.snapper.SnapperFlingBehavior$performSpringFling$1
            if (r1 == 0) goto L16
            r1 = r0
            dev.chrisbanes.snapper.SnapperFlingBehavior$performSpringFling$1 r1 = (dev.chrisbanes.snapper.SnapperFlingBehavior$performSpringFling$1) r1
            int r2 = r1.t
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.t = r2
        L14:
            r7 = r1
            goto L1c
        L16:
            dev.chrisbanes.snapper.SnapperFlingBehavior$performSpringFling$1 r1 = new dev.chrisbanes.snapper.SnapperFlingBehavior$performSpringFling$1
            r1.<init>(r12, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r9 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r7.t
            r10 = 0
            r6 = 1
            if (r1 == 0) goto L3d
            if (r1 != r6) goto L35
            kotlin.jvm.internal.Ref$FloatRef r13 = r7.q
            dev.chrisbanes.snapper.SnapperFlingBehavior r14 = r7.p
            kotlin.ResultKt.b(r0)     // Catch: java.lang.Throwable -> L31
            goto La1
        L31:
            r0 = move-exception
            r13 = r0
            goto Laf
        L35:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3d:
            kotlin.ResultKt.b(r0)
            kotlin.jvm.internal.Ref$FloatRef r3 = new kotlin.jvm.internal.Ref$FloatRef
            r3.<init>()
            int r0 = r14.a()
            r1 = 0
            if (r15 <= r0) goto L51
            int r0 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r0 <= 0) goto L51
            goto L5b
        L51:
            int r14 = r14.a()
            if (r15 > r14) goto L5d
            int r14 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r14 >= 0) goto L5d
        L5b:
            r1 = r16
        L5d:
            r3.d = r1
            kotlin.jvm.internal.Ref$FloatRef r1 = new kotlin.jvm.internal.Ref$FloatRef
            r1.<init>()
            java.lang.Integer r14 = new java.lang.Integer     // Catch: java.lang.Throwable -> Lac
            r14.<init>(r15)     // Catch: java.lang.Throwable -> Lac
            r12.h(r14)     // Catch: java.lang.Throwable -> Lac
            float r14 = r1.d     // Catch: java.lang.Throwable -> Lac
            float r0 = r3.d     // Catch: java.lang.Throwable -> Lac
            r2 = 28
            androidx.compose.animation.core.AnimationState r14 = androidx.compose.animation.core.AnimationStateKt.a(r14, r0, r2)     // Catch: java.lang.Throwable -> Lac
            dev.chrisbanes.snapper.LazyListSnapperLayoutInfo r0 = r12.f23783a     // Catch: java.lang.Throwable -> Lac
            int r0 = r0.d(r15)     // Catch: java.lang.Throwable -> Lac
            float r0 = (float) r0     // Catch: java.lang.Throwable -> Lac
            java.lang.Float r8 = new java.lang.Float     // Catch: java.lang.Throwable -> Lac
            r8.<init>(r0)     // Catch: java.lang.Throwable -> Lac
            androidx.compose.animation.core.AnimationSpec r11 = r12.c     // Catch: java.lang.Throwable -> Lac
            dev.chrisbanes.snapper.SnapperFlingBehavior$performSpringFling$3 r0 = new dev.chrisbanes.snapper.SnapperFlingBehavior$performSpringFling$3     // Catch: java.lang.Throwable -> Lac
            r4 = r12
            r2 = r13
            r5 = r15
            r0.<init>()     // Catch: java.lang.Throwable -> Lac
            r13 = r3
            r7.p = r12     // Catch: java.lang.Throwable -> Lac
            r7.q = r13     // Catch: java.lang.Throwable -> Lac
            r7.t = r6     // Catch: java.lang.Throwable -> Lac
            r5 = 0
            r3 = r8
            r8 = 4
            r2 = r14
            r6 = r0
            r4 = r11
            java.lang.Object r14 = androidx.compose.animation.core.SuspendAnimationKt.g(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lac
            if (r14 != r9) goto La0
            return r9
        La0:
            r14 = r12
        La1:
            r14.h(r10)
            float r13 = r13.d
            java.lang.Float r14 = new java.lang.Float
            r14.<init>(r13)
            return r14
        Lac:
            r0 = move-exception
            r13 = r0
            r14 = r12
        Laf:
            r14.h(r10)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.chrisbanes.snapper.SnapperFlingBehavior.g(androidx.compose.foundation.gestures.ScrollScope, dev.chrisbanes.snapper.SnapperLayoutItemInfo, int, float, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void h(Integer num) {
        ((SnapshotMutableStateImpl) this.f).setValue(num);
    }
}
