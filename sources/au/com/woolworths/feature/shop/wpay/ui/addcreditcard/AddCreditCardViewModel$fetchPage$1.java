package au.com.woolworths.feature.shop.wpay.ui.addcreditcard;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.feature.shop.wpay.domain.interactor.GetAddCreditCardInteractor;
import au.com.woolworths.feature.shop.wpay.domain.model.PageResult;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentFlowTypeData;
import au.com.woolworths.feature.shop.wpay.ui.addcreditcard.AddCreditCardContract;
import au.com.woolworths.feature.shop.wpay.ui.addcreditcard.AddCreditCardViewModel;
import au.com.woolworths.feature.shop.wpay.ui.common.model.LoadingState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.wpay.ui.addcreditcard.AddCreditCardViewModel$fetchPage$1", f = "AddCreditCardViewModel.kt", l = {68}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class AddCreditCardViewModel$fetchPage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ AddCreditCardViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddCreditCardViewModel$fetchPage$1(AddCreditCardViewModel addCreditCardViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = addCreditCardViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddCreditCardViewModel$fetchPage$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AddCreditCardViewModel$fetchPage$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        LoadingState loadingState;
        Object value2;
        AddCreditCardContract.ViewState viewState;
        AddCreditCardViewModel addCreditCardViewModel = this.q;
        PaymentFlowTypeData flowType = addCreditCardViewModel.e;
        MutableStateFlow mutableStateFlow = addCreditCardViewModel.l;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            addCreditCardViewModel.k = AddCreditCardViewModel.WebOperation.d;
            do {
                value = mutableStateFlow.getValue();
                loadingState = LoadingState.e;
                ((AddCreditCardContract.ViewState) value).getClass();
            } while (!mutableStateFlow.d(value, new AddCreditCardContract.ViewState(loadingState, PageResult.Uninitialized.f8286a, null, false)));
            GetAddCreditCardInteractor getAddCreditCardInteractor = addCreditCardViewModel.f;
            this.p = 1;
            obj = getAddCreditCardInteractor.a(flowType, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        PageResult result = (PageResult) obj;
        AddCreditCardAnalyticsTracker addCreditCardAnalyticsTracker = addCreditCardViewModel.i;
        addCreditCardAnalyticsTracker.getClass();
        Intrinsics.h(result, "result");
        Intrinsics.h(flowType, "flowType");
        PageResult.Fail fail = result instanceof PageResult.Fail ? (PageResult.Fail) result : null;
        if (fail != null) {
            if (fail.f8284a instanceof NoConnectivityException) {
                addCreditCardAnalyticsTracker.c(flowType);
            } else {
                addCreditCardAnalyticsTracker.f8322a.g((Event) AddCreditCardAnalyticsTracker.a(flowType).h.c.getD());
            }
        }
        do {
            value2 = mutableStateFlow.getValue();
            viewState = (AddCreditCardContract.ViewState) value2;
        } while (!mutableStateFlow.d(value2, AddCreditCardContract.ViewState.a(viewState, result instanceof PageResult.Success ? viewState.f8328a : LoadingState.d, result, null, false, 12)));
        return Unit.f24250a;
    }
}
