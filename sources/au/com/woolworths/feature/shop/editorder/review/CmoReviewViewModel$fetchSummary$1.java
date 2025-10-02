package au.com.woolworths.feature.shop.editorder.review;

import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.shop.editorder.review.CmoReviewContract;
import au.com.woolworths.feature.shop.editorder.review.data.ChangeMyOrderSummary;
import au.com.woolworths.feature.shop.editorder.review.domain.ChangeMyOrderInteractor;
import au.com.woolworths.foundation.shop.editorder.data.EditOrderConfirmation;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.editorder.review.CmoReviewViewModel$fetchSummary$1", f = "CmoReviewViewModel.kt", l = {51}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class CmoReviewViewModel$fetchSummary$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ CmoReviewViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CmoReviewViewModel$fetchSummary$1(CmoReviewViewModel cmoReviewViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = cmoReviewViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CmoReviewViewModel$fetchSummary$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CmoReviewViewModel$fetchSummary$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        CmoReviewViewModel cmoReviewViewModel = this.q;
        MutableStateFlow mutableStateFlow = cmoReviewViewModel.g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                do {
                    value3 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.d(value3, CmoReviewContract.ViewState.Loading.f7097a));
                ChangeMyOrderInteractor changeMyOrderInteractor = cmoReviewViewModel.e;
                this.p = 1;
                obj = changeMyOrderInteractor.f7128a.a(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            ChangeMyOrderSummary changeMyOrderSummary = (ChangeMyOrderSummary) obj;
            do {
                value4 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value4, new CmoReviewContract.ViewState.Content(changeMyOrderSummary, (EditOrderConfirmation) null, 6)));
        } catch (NoConnectivityException unused) {
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value2, new CmoReviewContract.ViewState.Error(FullPageMessage.Error.ConnectionError.f8915a)));
        } catch (ServerErrorException unused2) {
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value, new CmoReviewContract.ViewState.Error(FullPageMessage.Error.ServerError.f8916a)));
        }
        return Unit.f24250a;
    }
}
