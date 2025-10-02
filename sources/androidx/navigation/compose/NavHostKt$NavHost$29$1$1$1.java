package androidx.navigation.compose;

import androidx.compose.animation.core.SeekableTransitionState;
import androidx.navigation.NavBackStackEntry;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.navigation.compose.NavHostKt$NavHost$29$1$1$1", f = "NavHost.kt", l = {642, 646}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class NavHostKt$NavHost$29$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ float q;
    public final /* synthetic */ SeekableTransitionState r;
    public final /* synthetic */ NavBackStackEntry s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$29$1$1$1(float f, SeekableTransitionState seekableTransitionState, NavBackStackEntry navBackStackEntry, Continuation continuation) {
        super(2, continuation);
        this.q = f;
        this.r = seekableTransitionState;
        this.s = navBackStackEntry;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NavHostKt$NavHost$29$1$1$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((NavHostKt$NavHost$29$1$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        if (r2.q(r7.s, r7) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r7.p
            androidx.compose.animation.core.SeekableTransitionState r2 = r7.r
            r3 = 0
            float r4 = r7.q
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L21
            if (r1 == r6) goto L1d
            if (r1 != r5) goto L15
            kotlin.ResultKt.b(r8)
            goto L48
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            kotlin.ResultKt.b(r8)
            goto L39
        L21:
            kotlin.ResultKt.b(r8)
            int r8 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r8 <= 0) goto L39
            r7.p = r6
            androidx.compose.runtime.MutableState r8 = r2.b
            androidx.compose.runtime.SnapshotMutableStateImpl r8 = (androidx.compose.runtime.SnapshotMutableStateImpl) r8
            java.lang.Object r8 = r8.getD()
            java.lang.Object r8 = r2.n(r4, r8, r7)
            if (r8 != r0) goto L39
            goto L47
        L39:
            int r8 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r8 != 0) goto L48
            r7.p = r5
            androidx.navigation.NavBackStackEntry r8 = r7.s
            java.lang.Object r8 = r2.q(r8, r7)
            if (r8 != r0) goto L48
        L47:
            return r0
        L48:
            kotlin.Unit r8 = kotlin.Unit.f24250a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt$NavHost$29$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
