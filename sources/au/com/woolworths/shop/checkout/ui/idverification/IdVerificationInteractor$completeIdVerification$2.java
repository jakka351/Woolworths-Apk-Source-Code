package au.com.woolworths.shop.checkout.ui.idverification;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationCompleteResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.idverification.IdVerificationInteractor$completeIdVerification$2", f = "IdVerificationInteractor.kt", l = {21}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class IdVerificationInteractor$completeIdVerification$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super IdVerificationCompleteResponse>, Object> {
    public int p;
    public final /* synthetic */ IdVerificationInteractor q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdVerificationInteractor$completeIdVerification$2(IdVerificationInteractor idVerificationInteractor, String str, Continuation continuation) {
        super(2, continuation);
        this.q = idVerificationInteractor;
        this.r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new IdVerificationInteractor$completeIdVerification$2(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((IdVerificationInteractor$completeIdVerification$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
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
        IdVerificationRepository idVerificationRepository = this.q.f10798a;
        this.p = 1;
        Object objA = idVerificationRepository.a(this.r, this);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
