package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.FiniteAnimationSpec;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1", f = "LazyLayoutItemAnimation.kt", l = {141, 148}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class LazyLayoutItemAnimation$animatePlacementDelta$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public FiniteAnimationSpec p;
    public int q;
    public final /* synthetic */ LazyLayoutItemAnimation r;
    public final /* synthetic */ FiniteAnimationSpec s;
    public final /* synthetic */ long t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemAnimation$animatePlacementDelta$1(LazyLayoutItemAnimation lazyLayoutItemAnimation, FiniteAnimationSpec finiteAnimationSpec, long j, Continuation continuation) {
        super(2, continuation);
        this.r = lazyLayoutItemAnimation;
        this.s = finiteAnimationSpec;
        this.t = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LazyLayoutItemAnimation$animatePlacementDelta$1(this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LazyLayoutItemAnimation$animatePlacementDelta$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
    
        if (androidx.compose.animation.core.Animatable.d(r7, r8, r9, null, r11, r14, 4) != r2) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r0 = r14.r
            androidx.compose.animation.core.Animatable r1 = r0.o
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r14.q
            long r4 = r14.t
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L24
            if (r3 == r7) goto L1e
            if (r3 != r6) goto L16
            kotlin.ResultKt.b(r15)     // Catch: java.util.concurrent.CancellationException -> L85
            goto L7d
        L16:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L1e:
            androidx.compose.animation.core.FiniteAnimationSpec r3 = r14.p
            kotlin.ResultKt.b(r15)     // Catch: java.util.concurrent.CancellationException -> L85
            goto L4e
        L24:
            kotlin.ResultKt.b(r15)
            boolean r15 = r1.g()     // Catch: java.util.concurrent.CancellationException -> L85
            androidx.compose.animation.core.FiniteAnimationSpec r3 = r14.s
            if (r15 == 0) goto L38
            boolean r15 = r3 instanceof androidx.compose.animation.core.SpringSpec     // Catch: java.util.concurrent.CancellationException -> L85
            if (r15 == 0) goto L36
            androidx.compose.animation.core.SpringSpec r3 = (androidx.compose.animation.core.SpringSpec) r3     // Catch: java.util.concurrent.CancellationException -> L85
            goto L38
        L36:
            androidx.compose.animation.core.SpringSpec r3 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimationKt.f1038a     // Catch: java.util.concurrent.CancellationException -> L85
        L38:
            boolean r15 = r1.g()     // Catch: java.util.concurrent.CancellationException -> L85
            if (r15 != 0) goto L55
            androidx.compose.ui.unit.IntOffset r15 = new androidx.compose.ui.unit.IntOffset     // Catch: java.util.concurrent.CancellationException -> L85
            r15.<init>(r4)     // Catch: java.util.concurrent.CancellationException -> L85
            r14.p = r3     // Catch: java.util.concurrent.CancellationException -> L85
            r14.q = r7     // Catch: java.util.concurrent.CancellationException -> L85
            java.lang.Object r15 = r1.h(r15, r14)     // Catch: java.util.concurrent.CancellationException -> L85
            if (r15 != r2) goto L4e
            goto L7c
        L4e:
            kotlin.jvm.functions.Function0 r15 = r0.c     // Catch: java.util.concurrent.CancellationException -> L85
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$ItemInfo$updateAnimation$1$animation$1 r15 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$ItemInfo$updateAnimation$1$animation$1) r15     // Catch: java.util.concurrent.CancellationException -> L85
            r15.invoke()     // Catch: java.util.concurrent.CancellationException -> L85
        L55:
            r9 = r3
            java.lang.Object r15 = r1.f()     // Catch: java.util.concurrent.CancellationException -> L85
            androidx.compose.ui.unit.IntOffset r15 = (androidx.compose.ui.unit.IntOffset) r15     // Catch: java.util.concurrent.CancellationException -> L85
            long r7 = r15.f2200a     // Catch: java.util.concurrent.CancellationException -> L85
            long r3 = androidx.compose.ui.unit.IntOffset.c(r7, r4)     // Catch: java.util.concurrent.CancellationException -> L85
            androidx.compose.animation.core.Animatable r7 = r0.o     // Catch: java.util.concurrent.CancellationException -> L85
            androidx.compose.ui.unit.IntOffset r8 = new androidx.compose.ui.unit.IntOffset     // Catch: java.util.concurrent.CancellationException -> L85
            r8.<init>(r3)     // Catch: java.util.concurrent.CancellationException -> L85
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1$1 r11 = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1$1     // Catch: java.util.concurrent.CancellationException -> L85
            r11.<init>()     // Catch: java.util.concurrent.CancellationException -> L85
            r15 = 0
            r14.p = r15     // Catch: java.util.concurrent.CancellationException -> L85
            r14.q = r6     // Catch: java.util.concurrent.CancellationException -> L85
            r10 = 0
            r13 = 4
            r12 = r14
            java.lang.Object r15 = androidx.compose.animation.core.Animatable.d(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.util.concurrent.CancellationException -> L85
            if (r15 != r2) goto L7d
        L7c:
            return r2
        L7d:
            int r15 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.t     // Catch: java.util.concurrent.CancellationException -> L85
            r15 = 0
            r0.g(r15)     // Catch: java.util.concurrent.CancellationException -> L85
            r0.g = r15     // Catch: java.util.concurrent.CancellationException -> L85
        L85:
            kotlin.Unit r15 = kotlin.Unit.f24250a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
