package au.com.woolworths.shop.digipay;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.digipay.DigipayInteractor$refresh$1", f = "DigipayInteractor.kt", l = {83, 84}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DigipayInteractor$refresh$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public DigipayInteractor p;
    public int q;
    public final /* synthetic */ DigipayInteractor r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DigipayInteractor$refresh$1(DigipayInteractor digipayInteractor, Continuation continuation) {
        super(2, continuation);
        this.r = digipayInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DigipayInteractor$refresh$1(this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DigipayInteractor$refresh$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (au.com.woolworths.shop.digipay.DigipayInteractor.a(r2, true, r5) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r5.q
            au.com.woolworths.shop.digipay.DigipayInteractor r2 = r5.r
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L20
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            kotlin.ResultKt.b(r6)
            goto L3f
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            au.com.woolworths.shop.digipay.DigipayInteractor r1 = r5.p
            kotlin.ResultKt.b(r6)
            goto L2f
        L20:
            kotlin.ResultKt.b(r6)
            r5.p = r2
            r5.q = r4
            java.lang.Object r6 = r2.c(r4, r5)
            if (r6 != r0) goto L2e
            goto L3e
        L2e:
            r1 = r2
        L2f:
            au.com.woolworths.pay.sdk.models.CardCaptureInfo r6 = (au.com.woolworths.pay.sdk.models.CardCaptureInfo) r6
            r1.f = r6
            r6 = 0
            r5.p = r6
            r5.q = r3
            java.lang.Object r6 = au.com.woolworths.shop.digipay.DigipayInteractor.a(r2, r4, r5)
            if (r6 != r0) goto L3f
        L3e:
            return r0
        L3f:
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.digipay.DigipayInteractor$refresh$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
