package au.com.woolworths.feature.shop.editorder.review;

import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.feature.shop.editorder.review.CmoReviewContract;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.foundation.shop.editorder.EditOrderInteractor;
import au.com.woolworths.foundation.shop.editorder.data.EditOrderBanner;
import au.com.woolworths.foundation.shop.editorder.data.EditOrderConfirmation;
import au.com.woolworths.foundation.shop.editorder.data.EditOrderDetails;
import au.com.woolworths.foundation.shop.editorder.data.EditOrderMode;
import au.com.woolworths.foundation.shop.editorder.data.EditOrderStatus;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.editorder.review.CmoReviewViewModel$cancelCmo$1", f = "CmoReviewViewModel.kt", l = {81}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CmoReviewViewModel$cancelCmo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ CmoReviewViewModel r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CmoReviewViewModel$cancelCmo$1(CmoReviewViewModel cmoReviewViewModel, Continuation continuation) {
        super(2, continuation);
        this.r = cmoReviewViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CmoReviewViewModel$cancelCmo$1 cmoReviewViewModel$cancelCmo$1 = new CmoReviewViewModel$cancelCmo$1(this.r, continuation);
        cmoReviewViewModel$cancelCmo$1.q = obj;
        return cmoReviewViewModel$cancelCmo$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CmoReviewViewModel$cancelCmo$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objA;
        Object value2;
        Object objA2;
        EditOrderBanner banner;
        EditOrderConfirmation confirmation;
        Object value3;
        Object objA3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        CmoReviewViewModel cmoReviewViewModel = this.r;
        if (i == 0) {
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.q;
            MutableStateFlow mutableStateFlow = cmoReviewViewModel.g;
            do {
                value = mutableStateFlow.getValue();
                objA = (CmoReviewContract.ViewState) value;
                if (objA instanceof CmoReviewContract.ViewState.Content) {
                    objA = CmoReviewContract.ViewState.Content.a((CmoReviewContract.ViewState.Content) objA, null, true, 3);
                }
            } while (!mutableStateFlow.d(value, objA));
            EditOrderInteractor editOrderInteractor = cmoReviewViewModel.f;
            this.q = coroutineScope;
            this.p = 1;
            obj = editOrderInteractor.t(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        EditOrderStatus editOrderStatus = (EditOrderStatus) obj;
        MutableStateFlow mutableStateFlow2 = cmoReviewViewModel.g;
        do {
            value2 = mutableStateFlow2.getValue();
            objA2 = (CmoReviewContract.ViewState) value2;
            if (objA2 instanceof CmoReviewContract.ViewState.Content) {
                objA2 = CmoReviewContract.ViewState.Content.a((CmoReviewContract.ViewState.Content) objA2, null, false, 3);
            }
        } while (!mutableStateFlow2.d(value2, objA2));
        Unit unit = Unit.f24250a;
        if (editOrderStatus == null || editOrderStatus.getMode() == EditOrderMode.NOT_EDITING) {
            cmoReviewViewModel.i.f(new CmoReviewContract.UiAction.ShowSnackbarMessage(new ResText(R.string.cmo_server_error_message)));
            return unit;
        }
        EditOrderDetails details = editOrderStatus.getDetails();
        if (details == null || (banner = details.getBanner()) == null || (confirmation = banner.getConfirmation()) == null) {
            Bark.Companion companion = Bark.f8483a;
            Bark.Barker.i(new ReportOwner(ReportOwner.Squad.s), "Try to cancel edit mode but we are not in edit mode", null, 12);
            return unit;
        }
        MutableStateFlow mutableStateFlow3 = cmoReviewViewModel.g;
        do {
            value3 = mutableStateFlow3.getValue();
            objA3 = (CmoReviewContract.ViewState) value3;
            if (objA3 instanceof CmoReviewContract.ViewState.Content) {
                objA3 = CmoReviewContract.ViewState.Content.a((CmoReviewContract.ViewState.Content) objA3, confirmation, false, 5);
            }
        } while (!mutableStateFlow3.d(value3, objA3));
        return unit;
    }
}
