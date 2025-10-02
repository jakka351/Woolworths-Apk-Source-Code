package au.com.woolworths.feature.shop.wpay.ui.addcreditcard;

import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.feature.shop.wpay.domain.interactor.LinkCreditCardInteractor;
import au.com.woolworths.feature.shop.wpay.domain.model.PageResult;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.LinkCreditCardResponse;
import au.com.woolworths.feature.shop.wpay.ui.addcreditcard.AddCreditCardContract;
import au.com.woolworths.feature.shop.wpay.ui.addcreditcard.AddCreditCardResult;
import au.com.woolworths.feature.shop.wpay.ui.common.model.LoadingState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
@DebugMetadata(c = "au.com.woolworths.feature.shop.wpay.ui.addcreditcard.AddCreditCardViewModel$linkCreditCardToAccount$1", f = "AddCreditCardViewModel.kt", l = {154}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class AddCreditCardViewModel$linkCreditCardToAccount$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ AddCreditCardViewModel q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddCreditCardViewModel$linkCreditCardToAccount$1(AddCreditCardViewModel addCreditCardViewModel, String str, Continuation continuation) {
        super(2, continuation);
        this.q = addCreditCardViewModel;
        this.r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddCreditCardViewModel$linkCreditCardToAccount$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AddCreditCardViewModel$linkCreditCardToAccount$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        AddCreditCardViewModel addCreditCardViewModel = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            LinkCreditCardInteractor linkCreditCardInteractor = addCreditCardViewModel.g;
            this.p = 1;
            obj = linkCreditCardInteractor.a(this.r, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        PageResult pageResult = (PageResult) obj;
        boolean z = pageResult instanceof PageResult.Success;
        AddCreditCardContract.Action.SnackBarServerError snackBarServerError = AddCreditCardContract.Action.SnackBarServerError.f8325a;
        if (z) {
            LinkCreditCardResponse linkCreditCardResponse = (LinkCreditCardResponse) ((PageResult.Success) pageResult).f8285a;
            if (linkCreditCardResponse.f8298a) {
                addCreditCardViewModel.m.k(new AddCreditCardContract.Action.Success(new AddCreditCardResult.LinkedCard(linkCreditCardResponse.b)));
            } else {
                MutableStateFlow mutableStateFlow = addCreditCardViewModel.l;
                do {
                    value3 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.d(value3, AddCreditCardContract.ViewState.a((AddCreditCardContract.ViewState) value3, LoadingState.d, null, null, false, 14)));
                addCreditCardViewModel.m.k(snackBarServerError);
                addCreditCardViewModel.i.b(addCreditCardViewModel.e);
            }
        } else if (pageResult instanceof PageResult.Fail) {
            if (((PageResult.Fail) pageResult).f8284a instanceof NoConnectivityException) {
                MutableStateFlow mutableStateFlow2 = addCreditCardViewModel.l;
                do {
                    value2 = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.d(value2, AddCreditCardContract.ViewState.a((AddCreditCardContract.ViewState) value2, LoadingState.d, null, null, false, 14)));
                addCreditCardViewModel.m.k(AddCreditCardContract.Action.SnackBarConnectionError.f8324a);
                addCreditCardViewModel.i.c(addCreditCardViewModel.e);
            } else {
                MutableStateFlow mutableStateFlow3 = addCreditCardViewModel.l;
                do {
                    value = mutableStateFlow3.getValue();
                } while (!mutableStateFlow3.d(value, AddCreditCardContract.ViewState.a((AddCreditCardContract.ViewState) value, LoadingState.d, null, null, false, 14)));
                addCreditCardViewModel.m.k(snackBarServerError);
                addCreditCardViewModel.i.b(addCreditCardViewModel.e);
            }
        } else if (!Intrinsics.c(pageResult, PageResult.Uninitialized.f8286a)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f24250a;
    }
}
