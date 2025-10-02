package au.com.woolworths.shop.digipay;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.digipay.DigipayInteractor$initDigipaySdkIfNeeded$1", f = "DigipayInteractor.kt", l = {76, 77}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DigipayInteractor$initDigipaySdkIfNeeded$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public DigipayInteractor p;
    public int q;
    public final /* synthetic */ DigipayInteractor r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DigipayInteractor$initDigipaySdkIfNeeded$1(DigipayInteractor digipayInteractor, Continuation continuation) {
        super(2, continuation);
        this.r = digipayInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DigipayInteractor$initDigipaySdkIfNeeded$1(this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DigipayInteractor$initDigipaySdkIfNeeded$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if (au.com.woolworths.shop.digipay.DigipayInteractor.a(r4, true, r6) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r6.q
            r2 = 1
            r3 = 2
            au.com.woolworths.shop.digipay.DigipayInteractor r4 = r6.r
            if (r1 == 0) goto L20
            if (r1 == r2) goto L1a
            if (r1 != r3) goto L12
            kotlin.ResultKt.b(r7)
            goto L52
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            au.com.woolworths.shop.digipay.DigipayInteractor r1 = r6.p
            kotlin.ResultKt.b(r7)
            goto L42
        L20:
            kotlin.ResultKt.b(r7)
            au.com.woolworths.pay.sdk.PayClient r7 = r4.f10909a
            au.com.woolworths.shop.auth.ShopAccountInteractor r1 = r4.b
            java.lang.String r1 = r1.E()
            au.com.woolworths.pay.internal.AccessTokenManager r5 = r7.e
            r5.f9177a = r1
            au.com.woolworths.pay.internal.services.merchantprofile.MerchantProfileManager r1 = r7.f9189a
            r1.b()
            r7.f = r2
            r6.p = r4
            r6.q = r2
            java.lang.Object r7 = r4.c(r2, r6)
            if (r7 != r0) goto L41
            goto L51
        L41:
            r1 = r4
        L42:
            au.com.woolworths.pay.sdk.models.CardCaptureInfo r7 = (au.com.woolworths.pay.sdk.models.CardCaptureInfo) r7
            r1.f = r7
            r7 = 0
            r6.p = r7
            r6.q = r3
            java.lang.Object r7 = au.com.woolworths.shop.digipay.DigipayInteractor.a(r4, r2, r6)
            if (r7 != r0) goto L52
        L51:
            return r0
        L52:
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.digipay.DigipayInteractor$initDigipaySdkIfNeeded$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
