package au.com.woolworths.feature.shop.myorders.details;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.details.OrderDetailsActivity$playPerfectOrderFulfilmentAnimationWithSound$1", f = "OrderDetailsActivity.kt", l = {565, 567, 571}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class OrderDetailsActivity$playPerfectOrderFulfilmentAnimationWithSound$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ OrderDetailsActivity q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderDetailsActivity$playPerfectOrderFulfilmentAnimationWithSound$1(OrderDetailsActivity orderDetailsActivity, Continuation continuation) {
        super(2, continuation);
        this.q = orderDetailsActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderDetailsActivity$playPerfectOrderFulfilmentAnimationWithSound$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderDetailsActivity$playPerfectOrderFulfilmentAnimationWithSound$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
    
        if (kotlinx.coroutines.DelayKt.b(250, r8) == r0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.IllegalStateException {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r8.p
            r2 = 3
            r3 = 2
            r4 = 1
            au.com.woolworths.feature.shop.myorders.details.OrderDetailsActivity r5 = r8.q
            if (r1 == 0) goto L26
            if (r1 == r4) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            kotlin.ResultKt.b(r9)
            goto L8d
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            kotlin.ResultKt.b(r9)
            goto L6e
        L22:
            kotlin.ResultKt.b(r9)
            goto L34
        L26:
            kotlin.ResultKt.b(r9)
            r8.p = r4
            r6 = 1500(0x5dc, double:7.41E-321)
            java.lang.Object r9 = kotlinx.coroutines.DelayKt.b(r6, r8)
            if (r9 != r0) goto L34
            goto L8c
        L34:
            int r9 = au.com.woolworths.feature.shop.myorders.details.OrderDetailsActivity.N
            r9 = 2131951654(0x7f130026, float:1.9539729E38)
            android.media.MediaPlayer r1 = android.media.MediaPlayer.create(r5, r9)
            r5.D = r1
            if (r1 == 0) goto L63
            boolean r4 = r1.isPlaying()     // Catch: java.lang.Exception -> L54
            if (r4 == 0) goto L56
            r1.stop()     // Catch: java.lang.Exception -> L54
            r1.release()     // Catch: java.lang.Exception -> L54
            android.media.MediaPlayer r9 = android.media.MediaPlayer.create(r5, r9)     // Catch: java.lang.Exception -> L54
            r5.D = r9     // Catch: java.lang.Exception -> L54
            goto L56
        L54:
            r9 = move-exception
            goto L5e
        L56:
            android.media.MediaPlayer r9 = r5.D     // Catch: java.lang.Exception -> L54
            if (r9 == 0) goto L63
            r9.start()     // Catch: java.lang.Exception -> L54
            goto L63
        L5e:
            timber.log.Timber$Forest r1 = timber.log.Timber.f27013a
            r1.f(r9)
        L63:
            r8.p = r3
            r3 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r9 = kotlinx.coroutines.DelayKt.b(r3, r8)
            if (r9 != r0) goto L6e
            goto L8c
        L6e:
            au.com.woolworths.feature.shop.myorders.databinding.ActivityOrderDetailsBinding r9 = r5.E
            if (r9 == 0) goto L93
            au.com.woolworths.feature.shop.myorders.databinding.IncludeOrderDeliveredAnimationViewBinding r9 = r9.E
            com.airbnb.lottie.LottieAnimationView r9 = r9.y
            r9.g()
            au.com.woolworths.android.onesite.analytics.AnalyticsManager r9 = r5.P4()
            au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions r1 = au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.K
            r9.c(r1)
            r8.p = r2
            r1 = 250(0xfa, double:1.235E-321)
            java.lang.Object r9 = kotlinx.coroutines.DelayKt.b(r1, r8)
            if (r9 != r0) goto L8d
        L8c:
            return r0
        L8d:
            au.com.woolworths.android.onesite.haptic.HapticExtKt.c(r5)
            kotlin.Unit r9 = kotlin.Unit.f24250a
            return r9
        L93:
            java.lang.String r9 = "binding"
            kotlin.jvm.internal.Intrinsics.p(r9)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.myorders.details.OrderDetailsActivity$playPerfectOrderFulfilmentAnimationWithSound$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
