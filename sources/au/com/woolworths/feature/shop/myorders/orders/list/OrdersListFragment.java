package au.com.woolworths.feature.shop.myorders.orders.list;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.compose.a;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.android.onesite.utils.AutoClearedValue;
import au.com.woolworths.android.onesite.utils.Extensions;
import au.com.woolworths.feature.shop.myorders.databinding.FragmentOrdersListBinding;
import au.com.woolworths.feature.shop.myorders.orders.OrdersViewModel;
import au.com.woolworths.feature.shop.myorders.orders.list.OrderListContract;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.airbnb.epoxy.EpoxyVisibilityTracker;
import com.google.android.material.snackbar.Snackbar;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import timber.log.Timber;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/list/OrdersListFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Extras", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OrdersListFragment extends Hilt_OrdersListFragment {
    public AnalyticsManager i;
    public final ViewModelLazy j;
    public final ViewModelLazy k;
    public final EpoxyVisibilityTracker l;
    public OrdersController m;
    public final AutoClearedValue n;
    public final ActivityResultLauncher o;
    public static final /* synthetic */ KProperty[] q = {Reflection.f24268a.e(new MutablePropertyReference1Impl(OrdersListFragment.class, "binding", "getBinding()Lau/com/woolworths/feature/shop/myorders/databinding/FragmentOrdersListBinding;", 0))};
    public static final Companion p = new Companion();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/list/OrdersListFragment$Companion;", "", "", "ARGS_EXTRA", "Ljava/lang/String;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    @StabilityInferred
    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/list/OrdersListFragment$Extras;", "Landroid/os/Parcelable;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Extras implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Extras> CREATOR = new Creator();
        public final OrdersTab d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Extras> {
            @Override // android.os.Parcelable.Creator
            public final Extras createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new Extras(OrdersTab.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Extras[] newArray(int i) {
                return new Extras[i];
            }
        }

        public Extras(OrdersTab tab) {
            Intrinsics.h(tab, "tab");
            this.d = tab;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Extras) && this.d == ((Extras) obj).d;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return "Extras(tab=" + this.d + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.d.name());
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.orders.list.OrdersListFragment$onViewCreated$3", f = "OrdersListFragment.kt", l = {116}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.myorders.orders.list.OrdersListFragment$onViewCreated$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/feature/shop/myorders/orders/list/OrderListContract$Action;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.orders.list.OrdersListFragment$onViewCreated$3$1", f = "OrdersListFragment.kt", l = {}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.feature.shop.myorders.orders.list.OrdersListFragment$onViewCreated$3$1, reason: invalid class name */
        final class AnonymousClass1 extends SuspendLambda implements Function2<OrderListContract.Action, Continuation<? super Unit>, Object> {
            public /* synthetic */ Object p;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, continuation);
                anonymousClass1.p = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((OrderListContract.Action) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                anonymousClass1.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                OrderListContract.Action action = (OrderListContract.Action) this.p;
                Timber.f27013a.b("Handling Action: " + action, new Object[0]);
                return Unit.f24250a;
            }
        }

        public AnonymousClass3(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return OrdersListFragment.this.new AnonymousClass3(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                Companion companion = OrdersListFragment.p;
                final OrdersListFragment ordersListFragment = OrdersListFragment.this;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, null), FlowExtKt.a(ordersListFragment.Q1().k, ordersListFragment.getViewLifecycleOwner().getD(), Lifecycle.State.h));
                FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.shop.myorders.orders.list.OrdersListFragment.onViewCreated.3.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) throws NumberFormatException {
                        OrderListContract.Action action = (OrderListContract.Action) obj2;
                        Companion companion2 = OrdersListFragment.p;
                        boolean z = action instanceof OrderListContract.Action.ShowErrorMessage;
                        OrdersListFragment ordersListFragment2 = ordersListFragment;
                        if (z) {
                            View view = ordersListFragment2.I1().h;
                            ResText resText = ((OrderListContract.Action.ShowErrorMessage) action).f7872a;
                            FragmentActivity fragmentActivityRequireActivity = ordersListFragment2.requireActivity();
                            Intrinsics.g(fragmentActivityRequireActivity, "requireActivity(...)");
                            Snackbar.j(null, view, resText.getText(fragmentActivityRequireActivity), 0).l();
                        } else if (action instanceof OrderListContract.Action.LaunchSeeAllWebOrders) {
                            ordersListFragment2.startActivity(Activities.WebLinkActivity.f4553a.b("wow_myorders"));
                        } else {
                            if (!(action instanceof OrderListContract.Action.LaunchOrderDetails)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            String str = ((OrderListContract.Action.LaunchOrderDetails) action).f7870a;
                            ActivityResultLauncher activityResultLauncher = ordersListFragment2.o;
                            Intent intentA = ActivityNavigatorKt.a(Activities.OrderDetails.f4496a, ApplicationType.e);
                            int i2 = Integer.parseInt(str);
                            Bundle arguments = ordersListFragment2.getArguments();
                            Extras extras = arguments != null ? (Extras) arguments.getParcelable(".extra") : null;
                            if (extras == null) {
                                throw new IllegalArgumentException("Extras not provided");
                            }
                            activityResultLauncher.a(intentA.putExtra("EXTRA_DATA", new Activities.OrderDetails.Extras(i2, extras.d == OrdersTab.g)), null);
                        }
                        return Unit.f24250a;
                    }
                };
                this.p = 1;
                if (flowKt__TransformKt$onEach$$inlined$unsafeTransform$1.collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f24250a;
        }
    }

    public OrdersListFragment() {
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.j = new ViewModelLazy(reflectionFactory.b(OrdersViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.myorders.orders.list.OrdersListFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.myorders.orders.list.OrdersListFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.myorders.orders.list.OrdersListFragment$special$$inlined$activityViewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getDefaultViewModelCreationExtras();
            }
        });
        final OrdersListFragment$special$$inlined$viewModels$default$1 ordersListFragment$special$$inlined$viewModels$default$1 = new OrdersListFragment$special$$inlined$viewModels$default$1(this);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.e, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.feature.shop.myorders.orders.list.OrdersListFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) ordersListFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.k = new ViewModelLazy(reflectionFactory.b(OrdersListViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.myorders.orders.list.OrdersListFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.myorders.orders.list.OrdersListFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) lazyA.getD();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.h.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.myorders.orders.list.OrdersListFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) lazyA.getD();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.b;
            }
        });
        this.l = new EpoxyVisibilityTracker();
        this.n = new AutoClearedValue(this);
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new a(this, 10));
        Intrinsics.g(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.o = activityResultLauncherRegisterForActivityResult;
    }

    public final FragmentOrdersListBinding I1() {
        return (FragmentOrdersListBinding) this.n.getValue(this, q[0]);
    }

    public final OrdersListViewModel Q1() {
        return (OrdersListViewModel) this.k.getD();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        OrdersListViewModel ordersListViewModelQ1 = Q1();
        Bundle arguments = getArguments();
        Extras extras = arguments != null ? (Extras) arguments.getParcelable(".extra") : null;
        if (extras == null) {
            throw new IllegalArgumentException("Extras not provided");
        }
        OrdersTab tab = extras.d;
        Intrinsics.h(tab, "tab");
        ordersListViewModelQ1.g = tab;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        int i = FragmentOrdersListBinding.F;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        FragmentOrdersListBinding fragmentOrdersListBinding = (FragmentOrdersListBinding) ViewDataBinding.q(inflater, R.layout.fragment_orders_list, viewGroup, false, null);
        Intrinsics.g(fragmentOrdersListBinding, "inflate(...)");
        this.n.b(this, q[0], fragmentOrdersListBinding);
        View view = I1().h;
        Intrinsics.g(view, "getRoot(...)");
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Q1().r6();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.h(view, "view");
        super.onViewCreated(view, bundle);
        OrdersListViewModel ordersListViewModelQ1 = Q1();
        OrdersViewModel ordersViewModel = (OrdersViewModel) this.j.getD();
        AnalyticsManager analyticsManager = this.i;
        if (analyticsManager == null) {
            Intrinsics.p("analyticsManager");
            throw null;
        }
        this.m = new OrdersController(ordersListViewModelQ1, ordersViewModel, analyticsManager);
        I1().D(getViewLifecycleOwner());
        I1().L(Q1().l);
        I1().N(new au.com.woolworths.feature.shop.myorders.details.infomodal.a(this, 7));
        I1().M(Q1());
        EpoxyRecyclerView epoxyRecyclerView = I1().A;
        OrdersController ordersController = this.m;
        if (ordersController == null) {
            Intrinsics.p("epoxyController");
            throw null;
        }
        epoxyRecyclerView.setController(ordersController);
        EpoxyRecyclerView orderList = I1().A;
        Intrinsics.g(orderList, "orderList");
        this.l.a(orderList);
        SwipeRefreshLayout swipeRefreshLayout = I1().B;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.g(fragmentActivityRequireActivity, "requireActivity(...)");
        swipeRefreshLayout.setColorSchemeColors(Extensions.a(R.attr.colorPrimary, fragmentActivityRequireActivity));
        Q1().i.f(getViewLifecycleOwner(), new OrdersListFragment$sam$androidx_lifecycle_Observer$0(new au.com.woolworths.feature.shop.instore.navigation.map.utils.a(this, 5)));
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass3(null), 3);
    }
}
