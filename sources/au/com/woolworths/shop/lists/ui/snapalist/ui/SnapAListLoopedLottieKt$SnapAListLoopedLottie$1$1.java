package au.com.woolworths.shop.lists.ui.snapalist.ui;

import androidx.compose.runtime.MutableState;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimatable;
import com.airbnb.lottie.compose.LottieCompositionResultImpl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.snapalist.ui.SnapAListLoopedLottieKt$SnapAListLoopedLottie$1$1", f = "SnapAListLoopedLottie.kt", l = {53, 57, 63}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SnapAListLoopedLottieKt$SnapAListLoopedLottie$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public LottieAnimatable p;
    public LottieComposition q;
    public int r;
    public final /* synthetic */ MutableState s;
    public final /* synthetic */ LottieCompositionResultImpl t;
    public final /* synthetic */ LottieAnimatable u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapAListLoopedLottieKt$SnapAListLoopedLottie$1$1(MutableState mutableState, LottieCompositionResultImpl lottieCompositionResultImpl, LottieAnimatable lottieAnimatable, Continuation continuation) {
        super(2, continuation);
        this.s = mutableState;
        this.t = lottieCompositionResultImpl;
        this.u = lottieAnimatable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SnapAListLoopedLottieKt$SnapAListLoopedLottie$1$1(this.s, this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SnapAListLoopedLottieKt$SnapAListLoopedLottie$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0088, code lost:
    
        if (com.airbnb.lottie.compose.LottieAnimatable.DefaultImpls.a(r0, r1, Integer.MAX_VALUE, false, com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED, r5, com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED, r12, 2010) != r9) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r9 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r0 = r12.r
            r10 = 3
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L2b
            if (r0 == r2) goto L27
            if (r0 == r1) goto L1c
            if (r0 != r10) goto L14
            kotlin.ResultKt.b(r13)
            goto L8b
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L1c:
            com.airbnb.lottie.LottieComposition r0 = r12.q
            com.airbnb.lottie.compose.LottieAnimatable r1 = r12.p
            kotlin.ResultKt.b(r13)
            r11 = r1
            r1 = r0
            r0 = r11
            goto L61
        L27:
            kotlin.ResultKt.b(r13)
            goto L39
        L2b:
            kotlin.ResultKt.b(r13)
            r12.r = r2
            r2 = 800(0x320, double:3.953E-321)
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.b(r2, r12)
            if (r0 != r9) goto L39
            goto L8a
        L39:
            androidx.compose.runtime.MutableState r0 = r12.s
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.setValue(r2)
            com.airbnb.lottie.compose.LottieCompositionResultImpl r0 = r12.t
            com.airbnb.lottie.LottieComposition r0 = r0.getD()
            if (r0 == 0) goto L8b
            com.airbnb.lottie.compose.LottieAnimatable r2 = r12.u
            r12.p = r2
            r12.q = r0
            r12.r = r1
            r1 = r0
            r0 = r2
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 2010(0x7da, float:2.817E-42)
            r7 = r12
            java.lang.Object r2 = com.airbnb.lottie.compose.LottieAnimatable.DefaultImpls.a(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r2 != r9) goto L61
            goto L8a
        L61:
            com.airbnb.lottie.compose.LottieClipSpec$Frame r5 = new com.airbnb.lottie.compose.LottieClipSpec$Frame
            java.lang.Integer r2 = new java.lang.Integer
            r3 = 181(0xb5, float:2.54E-43)
            r2.<init>(r3)
            java.lang.Integer r3 = new java.lang.Integer
            r4 = 239(0xef, float:3.35E-43)
            r3.<init>(r4)
            r5.<init>(r2, r3)
            r2 = 0
            r12.p = r2
            r12.q = r2
            r12.r = r10
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            r4 = 0
            r6 = 0
            r8 = 2010(0x7da, float:2.817E-42)
            r7 = r12
            java.lang.Object r0 = com.airbnb.lottie.compose.LottieAnimatable.DefaultImpls.a(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 != r9) goto L8b
        L8a:
            return r9
        L8b:
            kotlin.Unit r0 = kotlin.Unit.f24250a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.ui.snapalist.ui.SnapAListLoopedLottieKt$SnapAListLoopedLottie$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
