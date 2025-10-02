package com.airbnb.lottie.compose;

import androidx.compose.runtime.MutableState;
import com.airbnb.lottie.LottieComposition;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3", f = "animateLottieCompositionAsState.kt", l = {73, 78}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ LottieAnimatable s;
    public final /* synthetic */ LottieComposition t;
    public final /* synthetic */ int u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ float w;
    public final /* synthetic */ LottieClipSpec x;
    public final /* synthetic */ MutableState y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3(boolean z, boolean z2, LottieAnimatable lottieAnimatable, LottieComposition lottieComposition, int i, boolean z3, float f, LottieClipSpec lottieClipSpec, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        LottieCancellationBehavior lottieCancellationBehavior = LottieCancellationBehavior.d;
        this.q = z;
        this.r = z2;
        this.s = lottieAnimatable;
        this.t = lottieComposition;
        this.u = i;
        this.v = z3;
        this.w = f;
        this.x = lottieClipSpec;
        this.y = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LottieCancellationBehavior lottieCancellationBehavior = LottieCancellationBehavior.d;
        return new AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3(this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r12.p
            com.airbnb.lottie.compose.LottieAnimatable r2 = r12.s
            androidx.compose.runtime.MutableState r3 = r12.y
            r4 = 2
            kotlin.Unit r11 = kotlin.Unit.f24250a
            boolean r5 = r12.q
            r6 = 1
            if (r1 == 0) goto L24
            if (r1 == r6) goto L20
            if (r1 != r4) goto L18
            kotlin.ResultKt.b(r13)
            return r11
        L18:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L20:
            kotlin.ResultKt.b(r13)
            goto L7f
        L24:
            kotlin.ResultKt.b(r13)
            if (r5 == 0) goto L7f
            java.lang.Object r13 = r3.getD()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L7f
            boolean r13 = r12.r
            if (r13 == 0) goto L7f
            r12.p = r6
            com.airbnb.lottie.LottieComposition r13 = r2.r()
            com.airbnb.lottie.compose.LottieClipSpec r1 = r2.y()
            float r7 = r2.n()
            r8 = 0
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L4f
            if (r13 != 0) goto L4f
            goto L5b
        L4f:
            if (r13 != 0) goto L52
            goto L64
        L52:
            if (r7 >= 0) goto L5e
            if (r1 == 0) goto L5b
            float r8 = r1.a(r13)
            goto L64
        L5b:
            r8 = 1065353216(0x3f800000, float:1.0)
            goto L64
        L5e:
            if (r1 == 0) goto L64
            float r8 = r1.b(r13)
        L64:
            com.airbnb.lottie.LottieComposition r13 = r2.r()
            float r1 = r2.q()
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 != 0) goto L72
            r1 = r6
            goto L73
        L72:
            r1 = 0
        L73:
            r1 = r1 ^ r6
            java.lang.Object r13 = r2.h(r13, r8, r1, r12)
            if (r13 != r0) goto L7b
            goto L7c
        L7b:
            r13 = r11
        L7c:
            if (r13 != r0) goto L7f
            goto La4
        L7f:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r5)
            r3.setValue(r13)
            if (r5 != 0) goto L89
            goto La5
        L89:
            float r8 = r2.q()
            com.airbnb.lottie.compose.LottieCancellationBehavior r13 = com.airbnb.lottie.compose.LottieCancellationBehavior.d
            r12.p = r4
            com.airbnb.lottie.LottieComposition r3 = r12.t
            int r4 = r12.u
            boolean r5 = r12.v
            float r6 = r12.w
            com.airbnb.lottie.compose.LottieClipSpec r7 = r12.x
            r10 = 514(0x202, float:7.2E-43)
            r9 = r12
            java.lang.Object r13 = com.airbnb.lottie.compose.LottieAnimatable.DefaultImpls.a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r13 != r0) goto La5
        La4:
            return r0
        La5:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
