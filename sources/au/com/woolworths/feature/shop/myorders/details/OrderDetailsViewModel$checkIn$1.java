package au.com.woolworths.feature.shop.myorders.details;

import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsContract;
import au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions;
import au.com.woolworths.feature.shop.myorders.orders.OrderCheckInInteractor;
import au.com.woolworths.feature.shop.myorders.orders.PickUpCheckInType;
import au.com.woolworths.feature.shop.myorders.pickup.manager.PickUpRepository;
import au.com.woolworths.shop.graphql.type.CheckInType;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlowImpl;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.details.OrderDetailsViewModel$checkIn$1", f = "OrderDetailsViewModel.kt", l = {769}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class OrderDetailsViewModel$checkIn$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ PickUpCheckInType q;
    public final /* synthetic */ OrderDetailsViewModel r;
    public final /* synthetic */ String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderDetailsViewModel$checkIn$1(PickUpCheckInType pickUpCheckInType, OrderDetailsViewModel orderDetailsViewModel, String str, Continuation continuation) {
        super(2, continuation);
        this.q = pickUpCheckInType;
        this.r = orderDetailsViewModel;
        this.s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderDetailsViewModel$checkIn$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderDetailsViewModel$checkIn$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CheckInType checkInType;
        OrderDetailsViewModel orderDetailsViewModel = this.r;
        SharedFlowImpl sharedFlowImpl = orderDetailsViewModel.u;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        Unit unit = Unit.f24250a;
        PickUpCheckInType pickUpCheckInType = this.q;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                Timber.f27013a.h("On button click " + pickUpCheckInType, new Object[0]);
                OrderCheckInInteractor orderCheckInInteractor = orderDetailsViewModel.h;
                int i2 = orderDetailsViewModel.A;
                String str = this.s;
                this.p = 1;
                PickUpRepository pickUpRepository = orderCheckInInteractor.f7852a;
                String strValueOf = String.valueOf(i2);
                int iOrdinal = pickUpCheckInType.ordinal();
                if (iOrdinal == 0) {
                    checkInType = CheckInType.f;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    checkInType = CheckInType.g;
                }
                Object objB = pickUpRepository.b(strValueOf, checkInType, str, this);
                if (objB != coroutineSingletons) {
                    objB = unit;
                }
                if (objB != coroutineSingletons) {
                    objB = unit;
                }
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            if (pickUpCheckInType == PickUpCheckInType.e) {
                Integer num = orderDetailsViewModel.C;
                int i3 = orderDetailsViewModel.A;
                if (num != null && num.intValue() == i3) {
                    orderDetailsViewModel.C = null;
                    sharedFlowImpl.f(new OrderDetailsContract.Actions.StopLocationTracking());
                }
            }
            orderDetailsViewModel.t6(orderDetailsViewModel.A, null);
            return unit;
        } catch (Exception unused) {
            orderDetailsViewModel.i.c(OrderDetailsActions.m);
            sharedFlowImpl.f(new OrderDetailsContract.Actions.ShowErrorMessage(new ResText(R.string.orders_failed_to_notify_message)));
            return unit;
        }
    }
}
