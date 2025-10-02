package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2", f = "LazyLayoutItemAnimation.kt", l = {183, 185}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class LazyLayoutItemAnimation$animateAppearance$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ LazyLayoutItemAnimation r;
    public final /* synthetic */ FiniteAnimationSpec s;
    public final /* synthetic */ GraphicsLayer t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemAnimation$animateAppearance$2(boolean z, LazyLayoutItemAnimation lazyLayoutItemAnimation, FiniteAnimationSpec finiteAnimationSpec, GraphicsLayer graphicsLayer, Continuation continuation) {
        super(2, continuation);
        this.q = z;
        this.r = lazyLayoutItemAnimation;
        this.s = finiteAnimationSpec;
        this.t = graphicsLayer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LazyLayoutItemAnimation$animateAppearance$2(this.q, this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LazyLayoutItemAnimation$animateAppearance$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (androidx.compose.animation.core.Animatable.d(r6, r7, r8, null, r10, r13, 4) == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r13.p
            r2 = 0
            r3 = 2
            r4 = 1
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r5 = r13.r
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L16
            kotlin.ResultKt.b(r14)     // Catch: java.lang.Throwable -> L13
            goto L58
        L13:
            r0 = move-exception
            r14 = r0
            goto L60
        L16:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1e:
            kotlin.ResultKt.b(r14)     // Catch: java.lang.Throwable -> L13
            goto L3a
        L22:
            kotlin.ResultKt.b(r14)
            boolean r14 = r13.q     // Catch: java.lang.Throwable -> L13
            if (r14 == 0) goto L3a
            androidx.compose.animation.core.Animatable r14 = r5.p     // Catch: java.lang.Throwable -> L13
            java.lang.Float r1 = new java.lang.Float     // Catch: java.lang.Throwable -> L13
            r6 = 0
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L13
            r13.p = r4     // Catch: java.lang.Throwable -> L13
            java.lang.Object r14 = r14.h(r1, r13)     // Catch: java.lang.Throwable -> L13
            if (r14 != r0) goto L3a
            goto L57
        L3a:
            androidx.compose.animation.core.Animatable r6 = r5.p     // Catch: java.lang.Throwable -> L13
            java.lang.Float r7 = new java.lang.Float     // Catch: java.lang.Throwable -> L13
            r14 = 1065353216(0x3f800000, float:1.0)
            r7.<init>(r14)     // Catch: java.lang.Throwable -> L13
            androidx.compose.animation.core.FiniteAnimationSpec r8 = r13.s     // Catch: java.lang.Throwable -> L13
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2$1 r10 = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2$1     // Catch: java.lang.Throwable -> L13
            androidx.compose.ui.graphics.layer.GraphicsLayer r14 = r13.t     // Catch: java.lang.Throwable -> L13
            r10.<init>()     // Catch: java.lang.Throwable -> L13
            r13.p = r3     // Catch: java.lang.Throwable -> L13
            r9 = 0
            r12 = 4
            r11 = r13
            java.lang.Object r14 = androidx.compose.animation.core.Animatable.d(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L13
            if (r14 != r0) goto L58
        L57:
            return r0
        L58:
            int r14 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.t
            r5.e(r2)
            kotlin.Unit r14 = kotlin.Unit.f24250a
            return r14
        L60:
            int r0 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.t
            r5.e(r2)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
