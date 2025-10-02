package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SnapFlingBehaviorKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f915a = 400;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(final androidx.compose.foundation.gestures.ScrollScope r5, final float r6, androidx.compose.animation.core.AnimationState r7, androidx.compose.animation.core.DecayAnimationSpec r8, final kotlin.jvm.functions.Function1 r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.s
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            float r6 = r0.p
            kotlin.jvm.internal.Ref$FloatRef r5 = r0.r
            androidx.compose.animation.core.AnimationState r7 = r0.q
            kotlin.ResultKt.b(r10)
            goto L65
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.b(r10)
            kotlin.jvm.internal.Ref$FloatRef r10 = new kotlin.jvm.internal.Ref$FloatRef
            r10.<init>()
            java.lang.Object r2 = r7.b()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L4e
            r2 = r3
            goto L4f
        L4e:
            r2 = 0
        L4f:
            r2 = r2 ^ r3
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$2 r4 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$2
            r4.<init>()
            r0.q = r7
            r0.r = r10
            r0.p = r6
            r0.t = r3
            java.lang.Object r5 = androidx.compose.animation.core.SuspendAnimationKt.e(r7, r8, r2, r4, r0)
            if (r5 != r1) goto L64
            return r1
        L64:
            r5 = r10
        L65:
            androidx.compose.foundation.gestures.snapping.AnimationResult r8 = new androidx.compose.foundation.gestures.snapping.AnimationResult
            float r5 = r5.d
            float r6 = r6 - r5
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r6)
            r8.<init>(r5, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.a(androidx.compose.foundation.gestures.ScrollScope, float, androidx.compose.animation.core.AnimationState, androidx.compose.animation.core.DecayAnimationSpec, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final void b(AnimationScope animationScope, ScrollScope scrollScope, Function1 function1, float f) {
        float f2;
        try {
            f2 = scrollScope.f(f);
        } catch (CancellationException unused) {
            animationScope.a();
            f2 = BitmapDescriptorFactory.HUE_RED;
        }
        function1.invoke(Float.valueOf(f2));
        if (Math.abs(f - f2) > 0.5f) {
            animationScope.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(final androidx.compose.foundation.gestures.ScrollScope r9, float r10, final float r11, androidx.compose.animation.core.AnimationState r12, androidx.compose.animation.core.AnimationSpec r13, final kotlin.jvm.functions.Function1 r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            boolean r0 = r15 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1
            if (r0 == 0) goto L14
            r0 = r15
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.u = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1
            r0.<init>(r15)
            goto L12
        L1a:
            java.lang.Object r15 = r6.t
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r6.u
            r7 = 0
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L32
            float r9 = r6.q
            float r10 = r6.p
            kotlin.jvm.internal.Ref$FloatRef r11 = r6.s
            androidx.compose.animation.core.AnimationState r12 = r6.r
            kotlin.ResultKt.b(r15)
            goto L80
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            kotlin.ResultKt.b(r15)
            kotlin.jvm.internal.Ref$FloatRef r15 = new kotlin.jvm.internal.Ref$FloatRef
            r15.<init>()
            java.lang.Object r1 = r12.b()
            java.lang.Number r1 = (java.lang.Number) r1
            float r8 = r1.floatValue()
            r1 = r2
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r10)
            java.lang.Object r3 = r12.b()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 != 0) goto L62
            r3 = r1
            goto L63
        L62:
            r3 = 0
        L63:
            r4 = r3 ^ 1
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$2 r5 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$2
            r5.<init>()
            r6.r = r12
            r6.s = r15
            r6.p = r10
            r6.q = r8
            r6.u = r1
            r1 = r12
            r3 = r13
            java.lang.Object r9 = androidx.compose.animation.core.SuspendAnimationKt.f(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L7d
            return r0
        L7d:
            r11 = r15
            r12 = r1
            r9 = r8
        L80:
            java.lang.Object r13 = r12.b()
            java.lang.Number r13 = (java.lang.Number) r13
            float r13 = r13.floatValue()
            float r9 = d(r13, r9)
            androidx.compose.foundation.gestures.snapping.AnimationResult r13 = new androidx.compose.foundation.gestures.snapping.AnimationResult
            float r11 = r11.d
            float r10 = r10 - r11
            java.lang.Float r11 = new java.lang.Float
            r11.<init>(r10)
            r10 = 29
            androidx.compose.animation.core.AnimationState r9 = androidx.compose.animation.core.AnimationStateKt.b(r12, r7, r9, r10)
            r13.<init>(r11, r9)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.c(androidx.compose.foundation.gestures.ScrollScope, float, float, androidx.compose.animation.core.AnimationState, androidx.compose.animation.core.AnimationSpec, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final float d(float f, float f2) {
        return f2 == BitmapDescriptorFactory.HUE_RED ? BitmapDescriptorFactory.HUE_RED : (f2 <= BitmapDescriptorFactory.HUE_RED ? f >= f2 : f <= f2) ? f : f2;
    }

    public static final TargetedFlingBehavior e(SnapLayoutInfoProvider snapLayoutInfoProvider, Composer composer, int i) {
        Object obj = (Density) composer.x(CompositionLocalsKt.h);
        DecayAnimationSpec decayAnimationSpecA = SplineBasedFloatDecayAnimationSpec_androidKt.a(composer);
        boolean zN = ((((i & 14) ^ 6) > 4 && composer.n(snapLayoutInfoProvider)) || (i & 6) == 4) | composer.n(decayAnimationSpecA) | composer.n(obj);
        Object objG = composer.G();
        if (zN || objG == Composer.Companion.f1624a) {
            objG = new SnapFlingBehavior(snapLayoutInfoProvider, decayAnimationSpecA, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, null, 5));
            composer.A(objG);
        }
        return (TargetedFlingBehavior) objG;
    }
}
