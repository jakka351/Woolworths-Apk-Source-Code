package au.com.woolworths.foundation.shop.editorder.ui;

import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.foundation.shop.editorder.EditOrderInteractor;
import au.com.woolworths.foundation.shop.editorder.data.EditOrderDetails;
import au.com.woolworths.foundation.shop.editorder.data.EditOrderMode;
import au.com.woolworths.foundation.shop.editorder.data.EditOrderReason;
import au.com.woolworths.foundation.shop.editorder.data.SetEditOrderStatusResponse;
import au.com.woolworths.foundation.shop.editorder.ui.EditOrderBannerContract;
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
import kotlinx.coroutines.channels.BufferedChannel;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.shop.editorder.ui.EditOrderBannerViewModel$cancelEditOrderMode$1", f = "EditOrderBannerViewModel.kt", l = {78}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class EditOrderBannerViewModel$cancelEditOrderMode$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ EditOrderBannerViewModel q;
    public final /* synthetic */ EditOrderDetails r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditOrderBannerViewModel$cancelEditOrderMode$1(EditOrderBannerViewModel editOrderBannerViewModel, EditOrderDetails editOrderDetails, Continuation continuation) {
        super(2, continuation);
        this.q = editOrderBannerViewModel;
        this.r = editOrderDetails;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EditOrderBannerViewModel$cancelEditOrderMode$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((EditOrderBannerViewModel$cancelEditOrderMode$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        EditOrderBannerViewModel editOrderBannerViewModel = this.q;
        BufferedChannel bufferedChannel = editOrderBannerViewModel.h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        boolean z = true;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                EditOrderInteractor editOrderInteractor = editOrderBannerViewModel.e;
                String orderId = this.r.getOrderId();
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
                bufferedChannel.k(new EditOrderBannerContract.Action.CancellationSuccess(message != null ? new PlainText(message) : new ResText(R.string.cmo_cancellation_success)));
            } else {
                String message2 = setEditOrderStatusResponse.getMessage();
                bufferedChannel.k(new EditOrderBannerContract.Action.CancellationFailure(message2 != null ? new PlainText(message2) : new ResText(R.string.cmo_server_error_message)));
            }
        } catch (NoConnectivityException unused) {
            bufferedChannel.k(new EditOrderBannerContract.Action.CancellationFailure(new ResText(R.string.cmo_cancellation_no_network_error_message)));
        } catch (ServerErrorException unused2) {
            bufferedChannel.k(new EditOrderBannerContract.Action.CancellationFailure(new ResText(R.string.cmo_server_error_message)));
        }
        return Unit.f24250a;
    }
}
