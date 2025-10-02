package androidx.navigation.compose;

import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.navigation.NavBackStackEntry;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.navigation.compose.NavHostKt$NavHost$29$1", f = "NavHost.kt", l = {627, 634}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class NavHostKt$NavHost$29$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ SeekableTransitionState r;
    public final /* synthetic */ NavBackStackEntry s;
    public final /* synthetic */ Transition t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$29$1(SeekableTransitionState seekableTransitionState, NavBackStackEntry navBackStackEntry, Transition transition, Continuation continuation) {
        super(2, continuation);
        this.r = seekableTransitionState;
        this.s = navBackStackEntry;
        this.t = transition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NavHostKt$NavHost$29$1 navHostKt$NavHost$29$1 = new NavHostKt$NavHost$29$1(this.r, this.s, this.t, continuation);
        navHostKt$NavHost$29$1.q = obj;
        return navHostKt$NavHost$29$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((NavHostKt$NavHost$29$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        if (androidx.compose.animation.core.SeekableTransitionState.l(r1, r6, r14) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        if (androidx.compose.animation.core.SuspendAnimationKt.c(r8, com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED, r10, r11, r14, 4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r14.p
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L15:
            kotlin.ResultKt.b(r15)
            goto L70
        L19:
            kotlin.ResultKt.b(r15)
            java.lang.Object r15 = r14.q
            kotlinx.coroutines.CoroutineScope r15 = (kotlinx.coroutines.CoroutineScope) r15
            androidx.compose.animation.core.SeekableTransitionState r1 = r14.r
            androidx.compose.runtime.MutableState r4 = r1.c
            androidx.compose.runtime.MutableFloatState r5 = r1.h
            androidx.compose.runtime.SnapshotMutableStateImpl r4 = (androidx.compose.runtime.SnapshotMutableStateImpl) r4
            java.lang.Object r4 = r4.getD()
            androidx.navigation.NavBackStackEntry r6 = r14.s
            boolean r4 = kotlin.jvm.internal.Intrinsics.c(r4, r6)
            if (r4 != 0) goto L3d
            r14.p = r3
            java.lang.Object r15 = androidx.compose.animation.core.SeekableTransitionState.l(r1, r6, r14)
            if (r15 != r0) goto L70
            goto L6f
        L3d:
            androidx.compose.animation.core.Transition r3 = r14.t
            long r3 = r3.h()
            r7 = 1000000(0xf4240, float:1.401298E-39)
            long r7 = (long) r7
            long r3 = r3 / r7
            r7 = r5
            androidx.compose.runtime.SnapshotMutableFloatStateImpl r7 = (androidx.compose.runtime.SnapshotMutableFloatStateImpl) r7
            float r8 = r7.a()
            androidx.compose.runtime.SnapshotMutableFloatStateImpl r5 = (androidx.compose.runtime.SnapshotMutableFloatStateImpl) r5
            float r5 = r5.a()
            float r3 = (float) r3
            float r5 = r5 * r3
            int r3 = (int) r5
            r4 = 0
            r5 = 6
            r7 = 0
            androidx.compose.animation.core.TweenSpec r10 = androidx.compose.animation.core.AnimationSpecKt.e(r3, r4, r7, r5)
            androidx.navigation.compose.n r11 = new androidx.navigation.compose.n
            r11.<init>(r15, r1, r6)
            r14.p = r2
            r9 = 0
            r13 = 4
            r12 = r14
            java.lang.Object r15 = androidx.compose.animation.core.SuspendAnimationKt.c(r8, r9, r10, r11, r12, r13)
            if (r15 != r0) goto L70
        L6f:
            return r0
        L70:
            kotlin.Unit r15 = kotlin.Unit.f24250a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt$NavHost$29$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
