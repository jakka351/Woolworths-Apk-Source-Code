package au.com.woolworths.shop.digipay.creditcard;

import au.com.woolworths.pay.sdk.models.CardCaptureInfo;
import au.com.woolworths.shop.digipay.DigipayInteractor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.digipay.creditcard.CreditCardViewModel$onAddNewCreditCardClick$1", f = "CreditCardViewModel.kt", l = {123}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class CreditCardViewModel$onAddNewCreditCardClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ CreditCardViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditCardViewModel$onAddNewCreditCardClick$1(CreditCardViewModel creditCardViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = creditCardViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CreditCardViewModel$onAddNewCreditCardClick$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CreditCardViewModel$onAddNewCreditCardClick$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        CreditCardViewModel creditCardViewModel = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            DigipayInteractor digipayInteractor = creditCardViewModel.e;
            this.p = 1;
            obj = digipayInteractor.c(false, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                ResultKt.b(obj);
            } catch (Throwable unused) {
            }
        }
        creditCardViewModel.p6((CardCaptureInfo) obj);
        return Unit.f24250a;
    }
}
