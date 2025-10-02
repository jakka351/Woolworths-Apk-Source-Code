package au.com.woolworths.feature.shop.editorder.review;

import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.shop.editorder.review.CmoReviewContract;
import au.com.woolworths.foundation.shop.editorder.EditOrderInteractor;
import au.com.woolworths.foundation.shop.editorder.data.EditOrderDetails;
import au.com.woolworths.foundation.shop.editorder.data.EditOrderMode;
import au.com.woolworths.foundation.shop.editorder.data.EditOrderReason;
import au.com.woolworths.foundation.shop.editorder.data.EditOrderStatus;
import au.com.woolworths.foundation.shop.editorder.data.SetEditOrderStatusResponse;
import com.woolworths.R;
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
import kotlinx.coroutines.flow.SharedFlowImpl;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.editorder.review.CmoReviewViewModel$onDialogConfirm$1", f = "CmoReviewViewModel.kt", l = {135}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class CmoReviewViewModel$onDialogConfirm$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ CmoReviewViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CmoReviewViewModel$onDialogConfirm$1(CmoReviewViewModel cmoReviewViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = cmoReviewViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CmoReviewViewModel$onDialogConfirm$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CmoReviewViewModel$onDialogConfirm$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objA;
        Object value2;
        Object objA2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        boolean z = true;
        CmoReviewViewModel cmoReviewViewModel = this.q;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                cmoReviewViewModel.p6();
                EditOrderInteractor editOrderInteractor = cmoReviewViewModel.f;
                EditOrderStatus editOrderStatus = (EditOrderStatus) editOrderInteractor.m().e();
                EditOrderDetails details = editOrderStatus != null ? editOrderStatus.getDetails() : null;
                if (details == null) {
                    throw new IllegalArgumentException("Trying to cancel edit mode but we are not in edit mode");
                }
                MutableStateFlow mutableStateFlow = cmoReviewViewModel.g;
                do {
                    value2 = mutableStateFlow.getValue();
                    objA2 = (CmoReviewContract.ViewState) value2;
                    if (objA2 instanceof CmoReviewContract.ViewState.Content) {
                        objA2 = CmoReviewContract.ViewState.Content.a((CmoReviewContract.ViewState.Content) objA2, null, true, 3);
                    }
                } while (!mutableStateFlow.d(value2, objA2));
                String orderId = details.getOrderId();
                EditOrderMode editOrderMode = EditOrderMode.NOT_EDITING;
                this.p = 1;
                obj = editOrderInteractor.I(orderId, editOrderMode, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            SetEditOrderStatusResponse setEditOrderStatusResponse = (SetEditOrderStatusResponse) obj;
            Intrinsics.h(setEditOrderStatusResponse, "<this>");
            if (!setEditOrderStatusResponse.getSuccess() && setEditOrderStatusResponse.getReason() != EditOrderReason.WINDOW_CLOSED) {
                z = false;
            }
            if (z) {
                String message = setEditOrderStatusResponse.getMessage();
                cmoReviewViewModel.q6(new CmoReviewContract.NavigationType.OrderDetailScreen(message != null ? new PlainText(message) : new ResText(R.string.cmo_cancellation_success)));
            } else {
                SharedFlowImpl sharedFlowImpl = cmoReviewViewModel.i;
                String message2 = setEditOrderStatusResponse.getMessage();
                sharedFlowImpl.f(new CmoReviewContract.UiAction.ShowSnackbarMessage(message2 != null ? new PlainText(message2) : new ResText(R.string.cmo_server_error_message)));
            }
        } catch (NoConnectivityException unused) {
            cmoReviewViewModel.i.f(new CmoReviewContract.UiAction.ShowSnackbarMessage(new ResText(R.string.cmo_cancellation_no_network_error_message)));
        } catch (ServerErrorException unused2) {
            cmoReviewViewModel.i.f(new CmoReviewContract.UiAction.ShowSnackbarMessage(new ResText(R.string.cmo_server_error_message)));
        }
        MutableStateFlow mutableStateFlow2 = cmoReviewViewModel.g;
        do {
            value = mutableStateFlow2.getValue();
            objA = (CmoReviewContract.ViewState) value;
            if (objA instanceof CmoReviewContract.ViewState.Content) {
                objA = CmoReviewContract.ViewState.Content.a((CmoReviewContract.ViewState.Content) objA, null, false, 3);
            }
        } while (!mutableStateFlow2.d(value, objA));
        return Unit.f24250a;
    }
}
