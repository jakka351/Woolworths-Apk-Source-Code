package au.com.woolworths.shop.checkout.domain.interactor;

import au.com.woolworths.foundation.shop.model.checkout.DigitalPayPaymentData;
import au.com.woolworths.shop.checkout.data.source.CheckoutPaymentDataRepository;
import com.google.gson.JsonObject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/google/gson/JsonObject;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.domain.interactor.MakePayment$invoke$1", f = "MakePayment.kt", l = {16}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class MakePayment$invoke$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super JsonObject>, Object> {
    public int p;
    public final /* synthetic */ MakePayment q;
    public final /* synthetic */ DigitalPayPaymentData r;
    public final /* synthetic */ String s;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MakePayment$invoke$1(MakePayment makePayment, DigitalPayPaymentData digitalPayPaymentData, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.q = makePayment;
        this.r = digitalPayPaymentData;
        this.s = str;
        this.t = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MakePayment$invoke$1(this.q, this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MakePayment$invoke$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        CheckoutPaymentDataRepository checkoutPaymentDataRepository = this.q.f10549a;
        this.p = 1;
        Object objA = checkoutPaymentDataRepository.a(this.r, this.s, this.t, this);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
