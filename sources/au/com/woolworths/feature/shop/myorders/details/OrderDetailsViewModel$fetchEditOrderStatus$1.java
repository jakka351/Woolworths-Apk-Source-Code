package au.com.woolworths.feature.shop.myorders.details;

import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsContract;
import au.com.woolworths.feature.shop.myorders.details.models.OrderSummaryData;
import au.com.woolworths.foundation.shop.editorder.EditOrderInteractor;
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
import kotlinx.coroutines.flow.SharedFlowImpl;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.details.OrderDetailsViewModel$fetchEditOrderStatus$1", f = "OrderDetailsViewModel.kt", l = {929}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class OrderDetailsViewModel$fetchEditOrderStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ OrderDetailsViewModel q;
    public final /* synthetic */ OrderSummaryData r;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7676a;

        static {
            int[] iArr = new int[EditOrderMode.values().length];
            try {
                iArr[EditOrderMode.EDITING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EditOrderMode.NOT_EDITING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f7676a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderDetailsViewModel$fetchEditOrderStatus$1(OrderDetailsViewModel orderDetailsViewModel, OrderSummaryData orderSummaryData, Continuation continuation) {
        super(2, continuation);
        this.q = orderDetailsViewModel;
        this.r = orderSummaryData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderDetailsViewModel$fetchEditOrderStatus$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderDetailsViewModel$fetchEditOrderStatus$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OrderDetailsViewModel orderDetailsViewModel = this.q;
        SharedFlowImpl sharedFlowImpl = orderDetailsViewModel.u;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            sharedFlowImpl.f(new OrderDetailsContract.Actions.ShowLoadingDialog(new PlainText("")));
            EditOrderInteractor editOrderInteractor = orderDetailsViewModel.q;
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
        sharedFlowImpl.f(OrderDetailsContract.Actions.HideLoadingDialog.f7640a);
        EditOrderMode mode = editOrderStatus != null ? editOrderStatus.getMode() : null;
        int i2 = mode == null ? -1 : WhenMappings.f7676a[mode.ordinal()];
        if (i2 == 1) {
            sharedFlowImpl.f(OrderDetailsContract.Actions.GoToHomeActivity.f7638a);
        } else if (i2 != 2) {
            sharedFlowImpl.f(new OrderDetailsContract.Actions.ShowErrorMessage(new ResText(R.string.cancel_order_edit_mode_error)));
        } else {
            sharedFlowImpl.f(new OrderDetailsContract.Actions.ShowCancelWarningScreen(this.r));
        }
        return Unit.f24250a;
    }
}
