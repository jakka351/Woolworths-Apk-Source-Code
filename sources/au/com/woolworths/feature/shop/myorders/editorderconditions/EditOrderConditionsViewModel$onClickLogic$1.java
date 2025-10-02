package au.com.woolworths.feature.shop.myorders.editorderconditions;

import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.shop.myorders.editorderconditions.EditOrderConditionsContract;
import au.com.woolworths.feature.shop.myorders.editorderconditions.analytics.EditOrderConditionsActions;
import au.com.woolworths.foundation.shop.editorder.EditOrderFeature;
import au.com.woolworths.foundation.shop.editorder.EditOrderInteractor;
import au.com.woolworths.foundation.shop.editorder.data.EditOrderMode;
import au.com.woolworths.foundation.shop.editorder.data.EditOrderReason;
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
import kotlinx.coroutines.flow.SharedFlowImpl;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.editorderconditions.EditOrderConditionsViewModel$onClickLogic$1", f = "EditOrderConditionsViewModel.kt", l = {71}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class EditOrderConditionsViewModel$onClickLogic$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ EditOrderConditionsViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditOrderConditionsViewModel$onClickLogic$1(EditOrderConditionsViewModel editOrderConditionsViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = editOrderConditionsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EditOrderConditionsViewModel$onClickLogic$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((EditOrderConditionsViewModel$onClickLogic$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        EditOrderConditionsViewModel editOrderConditionsViewModel = this.q;
        SharedFlowImpl sharedFlowImpl = editOrderConditionsViewModel.j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                EditOrderInteractor editOrderInteractor = editOrderConditionsViewModel.e;
                String str = editOrderConditionsViewModel.m;
                Intrinsics.e(str);
                EditOrderMode editOrderMode = EditOrderMode.EDITING;
                this.p = 1;
                obj = editOrderInteractor.I(str, editOrderMode, this);
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
            if (setEditOrderStatusResponse.getSuccess()) {
                editOrderConditionsViewModel.f.f = 0L;
                if (editOrderConditionsViewModel.h.c(EditOrderFeature.d)) {
                    sharedFlowImpl.f(EditOrderConditionsContract.Actions.NavigateToCmoReview.f7840a);
                } else {
                    sharedFlowImpl.f(EditOrderConditionsContract.Actions.NavigateToHome.f7841a);
                }
            } else if (setEditOrderStatusResponse.getReason() == EditOrderReason.WINDOW_CLOSED) {
                String message = setEditOrderStatusResponse.getMessage();
                if (message == null) {
                    throw new IllegalArgumentException("Set Edit Order Status API failed with no error message provided");
                }
                sharedFlowImpl.f(new EditOrderConditionsContract.Actions.NavigateBackWithMessage(message));
            } else {
                String message2 = setEditOrderStatusResponse.getMessage();
                EditOrderConditionsViewModel.p6(editOrderConditionsViewModel, message2 != null ? new PlainText(message2) : new ResText(R.string.cmo_server_error_message));
            }
        } catch (NoConnectivityException unused) {
            editOrderConditionsViewModel.g.c(EditOrderConditionsActions.g);
            editOrderConditionsViewModel.i.m(new EditOrderConditionsContract.ViewState(false, StatefulButtonState.d));
            sharedFlowImpl.f(new EditOrderConditionsContract.Actions.ShowSnackbarMessage(new ResText(R.string.cmo_no_network_error_message)));
        } catch (ServerErrorException unused2) {
            EditOrderConditionsViewModel.p6(editOrderConditionsViewModel, new ResText(R.string.cmo_server_error_message));
        }
        return Unit.f24250a;
    }
}
