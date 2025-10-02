package au.com.woolworths.feature.shop.myorders.orders.list;

import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.feature.shop.myorders.orders.list.OrderListContract;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.orders.list.OrdersListViewModel$fetchPage$1", f = "OrdersListViewModel.kt", l = {97}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class OrdersListViewModel$fetchPage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ OrdersListViewModel q;
    public final /* synthetic */ Integer r;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7876a;

        static {
            int[] iArr = new int[OrdersTab.values().length];
            try {
                iArr[OrdersTab.g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f7876a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrdersListViewModel$fetchPage$1(OrdersListViewModel ordersListViewModel, Integer num, Continuation continuation) {
        super(2, continuation);
        this.q = ordersListViewModel;
        this.r = num;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrdersListViewModel$fetchPage$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((OrdersListViewModel$fetchPage$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OrdersListViewModel ordersListViewModel = this.q;
        MutableLiveData mutableLiveData = ordersListViewModel.h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        Unit unit = Unit.f24250a;
        if (i == 0) {
            ResultKt.b(obj);
            OrderListContract.ViewState viewState = (OrderListContract.ViewState) mutableLiveData.e();
            if (viewState != null && viewState.f7873a) {
                Timber.Forest forest = Timber.f27013a;
                forest.s("OrdersListViewModel");
                forest.m("Another job is in progress", new Object[0]);
                return unit;
            }
            Timber.Forest forest2 = Timber.f27013a;
            forest2.s("OrdersListViewModel");
            OrdersTab ordersTab = ordersListViewModel.g;
            if (ordersTab == null) {
                Intrinsics.p("ordersTab");
                throw null;
            }
            forest2.m("More: " + ordersTab, new Object[0]);
            OrderListContract.ViewState viewState2 = (OrderListContract.ViewState) mutableLiveData.e();
            mutableLiveData.m(viewState2 != null ? OrderListContract.ViewState.a(viewState2, true, null, false, 62) : null);
            OrdersTab ordersTab2 = ordersListViewModel.g;
            if (ordersTab2 == null) {
                Intrinsics.p("ordersTab");
                throw null;
            }
            if (WhenMappings.f7876a[ordersTab2.ordinal()] != 1) {
                forest2.s("OrdersListViewModel");
                OrdersTab ordersTab3 = ordersListViewModel.g;
                if (ordersTab3 == null) {
                    Intrinsics.p("ordersTab");
                    throw null;
                }
                forest2.m("More is called from invalid tabs " + ordersTab3, new Object[0]);
                return unit;
            }
            int iIntValue = this.r.intValue();
            this.p = 1;
            obj = ordersListViewModel.t6(iIntValue, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        mutableLiveData.m((OrderListContract.ViewState) obj);
        Timber.Forest forest3 = Timber.f27013a;
        forest3.s("OrdersListViewModel");
        OrdersTab ordersTab4 = ordersListViewModel.g;
        if (ordersTab4 == null) {
            Intrinsics.p("ordersTab");
            throw null;
        }
        forest3.m("Fetch More Completed: " + ordersTab4 + " " + mutableLiveData.e(), new Object[0]);
        return unit;
    }
}
