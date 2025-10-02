package au.com.woolworths.feature.shop.editorder.review;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.feature.shop.editorder.review.CmoReviewContract;
import au.com.woolworths.feature.shop.editorder.review.domain.ChangeMyOrderInteractor;
import au.com.woolworths.foundation.shop.editorder.EditOrderInteractor;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/CmoReviewViewModel;", "Landroidx/lifecycle/ViewModel;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CmoReviewViewModel extends ViewModel {
    public final ChangeMyOrderInteractor e;
    public final EditOrderInteractor f;
    public final MutableStateFlow g;
    public final StateFlow h;
    public final SharedFlowImpl i;
    public final SharedFlowImpl j;

    public CmoReviewViewModel(ChangeMyOrderInteractor changeMyOrderInteractor, EditOrderInteractor editOrderInteractor) {
        Intrinsics.h(editOrderInteractor, "editOrderInteractor");
        this.e = changeMyOrderInteractor;
        this.f = editOrderInteractor;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(CmoReviewContract.ViewState.Loading.f7097a);
        this.g = mutableStateFlowA;
        this.h = mutableStateFlowA;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.i = sharedFlowImplB;
        this.j = sharedFlowImplB;
    }

    public final void p6() {
        MutableStateFlow mutableStateFlow;
        Object value;
        Object objA;
        do {
            mutableStateFlow = this.g;
            value = mutableStateFlow.getValue();
            objA = (CmoReviewContract.ViewState) value;
            if (objA instanceof CmoReviewContract.ViewState.Content) {
                objA = CmoReviewContract.ViewState.Content.a((CmoReviewContract.ViewState.Content) objA, null, false, 5);
            }
        } while (!mutableStateFlow.d(value, objA));
    }

    public final void q6(CmoReviewContract.NavigationType navigationType) {
        this.i.f(new CmoReviewContract.UiAction.NavigateTo(navigationType));
    }

    public final void r6(CmoReviewContract.UserEvent event) {
        Intrinsics.h(event, "event");
        if (event.equals(CmoReviewContract.UserEvent.CancelCmo.f7088a)) {
            BuildersKt.c(ViewModelKt.a(this), null, null, new CmoReviewViewModel$cancelCmo$1(this, null), 3);
            return;
        }
        if (event.equals(CmoReviewContract.UserEvent.NavigateBack.f7091a)) {
            q6(CmoReviewContract.NavigationType.ScreenBeforeOrderDetail.f7083a);
            return;
        }
        if (event.equals(CmoReviewContract.UserEvent.Retry.f7094a)) {
            BuildersKt.c(ViewModelKt.a(this), null, null, new CmoReviewViewModel$fetchSummary$1(this, null), 3);
            return;
        }
        if (event.equals(CmoReviewContract.UserEvent.ConfirmDialog.f7089a)) {
            BuildersKt.c(ViewModelKt.a(this), null, null, new CmoReviewViewModel$onDialogConfirm$1(this, null), 3);
            return;
        }
        if (event.equals(CmoReviewContract.UserEvent.DismissDialog.f7090a)) {
            p6();
            return;
        }
        if (event.equals(CmoReviewContract.UserEvent.NavigateToCheckout.f7093a)) {
            q6(CmoReviewContract.NavigationType.CheckoutScreen.f7079a);
            return;
        }
        if (event.equals(CmoReviewContract.UserEvent.NavigateToCart.f7092a)) {
            q6(CmoReviewContract.NavigationType.CartScreen.f7078a);
            return;
        }
        if (!(event instanceof CmoReviewContract.UserEvent.ActionTileClick)) {
            throw new NoWhenBranchMatchedException();
        }
        String str = ((CmoReviewContract.UserEvent.ActionTileClick) event).f7087a;
        switch (str.hashCode()) {
            case -2132879654:
                if (str.equals("specials")) {
                    q6(CmoReviewContract.NavigationType.SpecialsScreen.f7084a);
                    return;
                }
                return;
            case -1891677863:
                if (str.equals("buy-again")) {
                    q6(CmoReviewContract.NavigationType.BuyAgainScreen.f7077a);
                    return;
                }
                return;
            case 3529462:
                if (str.equals("shop")) {
                    q6(CmoReviewContract.NavigationType.ProductScreen.f7082a);
                    return;
                }
                return;
            case 64562882:
                if (str.equals("past-shops")) {
                    q6(CmoReviewContract.NavigationType.PastShopsScreen.f7081a);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
