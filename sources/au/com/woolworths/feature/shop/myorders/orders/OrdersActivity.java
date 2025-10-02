package au.com.woolworths.feature.shop.myorders.orders;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.camera.camera2.interop.e;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.widget.ViewPager2;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.android.onesite.utils.AndroidIntents;
import au.com.woolworths.feature.shop.instore.navigation.map.utils.a;
import au.com.woolworths.feature.shop.myorders.databinding.ActivityOrdersBinding;
import au.com.woolworths.feature.shop.myorders.details.analytics.MyOrdersScreens;
import au.com.woolworths.feature.shop.myorders.details.cancel.OrderCancellationPromptActivity;
import au.com.woolworths.feature.shop.myorders.orders.OrdersContract;
import au.com.woolworths.feature.shop.myorders.orders.analytics.OrdersActions;
import au.com.woolworths.feature.shop.myorders.orders.list.OrdersListFragmentAdapter;
import au.com.woolworths.feature.shop.myorders.orders.list.OrdersTab;
import com.dynatrace.android.callback.Callback;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayoutMediator;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/OrdersActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OrdersActivity extends Hilt_OrdersActivity {
    public static final /* synthetic */ int C = 0;
    public FeatureToggleManager A;
    public ActivityOrdersBinding x;
    public AnalyticsManager z;
    public final ViewModelLazy y = new ViewModelLazy(Reflection.f24268a.b(OrdersViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.myorders.orders.OrdersActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.myorders.orders.OrdersActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.myorders.orders.OrdersActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final OrdersListFragmentAdapter B = new OrdersListFragmentAdapter(this);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/OrdersActivity$Companion;", "", "", "MY_ORDERS_MAGIC_LINK_ID", "Ljava/lang/String;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.orders.OrdersActivity$onCreate$3", f = "OrdersActivity.kt", l = {94}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.myorders.orders.OrdersActivity$onCreate$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.feature.shop.myorders.orders.OrdersActivity$onCreate$3$1, reason: invalid class name */
        final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<OrdersContract.Actions, Continuation<? super Unit>, Object>, SuspendFunction {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                OrdersContract.Actions actions = (OrdersContract.Actions) obj;
                OrdersActivity ordersActivity = (OrdersActivity) this.d;
                int i = OrdersActivity.C;
                ordersActivity.getClass();
                if (actions instanceof OrdersContract.Actions.OpenStoreInMaps) {
                    AndroidIntents.b(ordersActivity, ((OrdersContract.Actions.OpenStoreInMaps) actions).f7859a);
                } else if (actions instanceof OrdersContract.Actions.ShowErrorMessage) {
                    ActivityOrdersBinding activityOrdersBinding = ordersActivity.x;
                    if (activityOrdersBinding == null) {
                        Intrinsics.p("activityBinding");
                        throw null;
                    }
                    Snackbar.i(activityOrdersBinding.h, 0, 0).l();
                } else {
                    if (actions instanceof OrdersContract.Actions.ShowAttendantAppOffMessage) {
                        AnalyticsManager analyticsManager = ordersActivity.z;
                        if (analyticsManager == null) {
                            Intrinsics.p("analyticsManager");
                            throw null;
                        }
                        analyticsManager.c(OrdersActions.i);
                        if (ordersActivity.x != null) {
                            throw null;
                        }
                        Intrinsics.p("activityBinding");
                        throw null;
                    }
                    if (Intrinsics.c(actions, OrdersContract.Actions.LaunchLogin.f7855a)) {
                        Activities.LogIn.c(ordersActivity);
                    } else if (Intrinsics.c(actions, OrdersContract.Actions.LaunchProducts.f7857a)) {
                        Activities.MainActivity.f4487a.d(ordersActivity, Activities.MainActivity.Tab.f);
                    } else if (Intrinsics.c(actions, OrdersContract.Actions.LaunchSeeAllWebOrders.f7858a)) {
                        ordersActivity.startActivity(Activities.WebLinkActivity.f4553a.b("wow_myorders"));
                    } else if (actions instanceof OrdersContract.Actions.LaunchPickUpOrderDetails) {
                        ordersActivity.P4(Integer.parseInt(((OrdersContract.Actions.LaunchPickUpOrderDetails) actions).f7856a.d));
                    } else {
                        if (!(actions instanceof OrdersContract.Actions.LaunchDeliveryOrderDetails)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ordersActivity.P4(Integer.parseInt(((OrdersContract.Actions.LaunchDeliveryOrderDetails) actions).f7854a.d));
                    }
                }
                return Unit.f24250a;
            }
        }

        public AnonymousClass3(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return OrdersActivity.this.new AnonymousClass3(continuation);
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
                int i2 = OrdersActivity.C;
                OrdersActivity ordersActivity = OrdersActivity.this;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, ordersActivity, OrdersActivity.class, "handleActions", "handleActions(Lau/com/woolworths/feature/shop/myorders/orders/OrdersContract$Actions;)V", 4), FlowExtKt.a(ordersActivity.O4().h, ordersActivity.getD(), Lifecycle.State.g));
                this.p = 1;
                if (FlowKt.g(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, this) == coroutineSingletons) {
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

    public final OrdersViewModel O4() {
        return (OrdersViewModel) this.y.getD();
    }

    public final void P4(int i) {
        Intent intentPutExtra = ActivityNavigatorKt.a(Activities.OrderDetails.f4496a, ApplicationType.e).putExtra("EXTRA_DATA", new Activities.OrderDetails.Extras(i, false));
        Intrinsics.g(intentPutExtra, "putExtra(...)");
        startActivityForResult(intentPutExtra, 2020);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        Bundle extras;
        OrderCancellationPromptActivity.Result result;
        if (i != 2020) {
            if (i != 8888) {
                super.onActivityResult(i, i2, intent);
                return;
            } else {
                if (i2 == -1) {
                    O4().p6();
                    return;
                }
                return;
            }
        }
        if (i2 == -1) {
            if (intent == null || (extras = intent.getExtras()) == null || (result = (OrderCancellationPromptActivity.Result) extras.getParcelable("ORDER_CANCEL_WARNING_RESULT")) == null) {
                throw new IllegalStateException("Result is expected from OrderCancellationPromptActivity");
            }
            int i3 = result.d;
            ActivityOrdersBinding activityOrdersBinding = this.x;
            if (activityOrdersBinding != null) {
                Snackbar.i(activityOrdersBinding.h, i3, 0).l();
            } else {
                Intrinsics.p("activityBinding");
                throw null;
            }
        }
    }

    @Override // au.com.woolworths.feature.shop.myorders.orders.Hilt_OrdersActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityOrdersBinding activityOrdersBinding = (ActivityOrdersBinding) DataBindingUtil.d(this, R.layout.activity_orders);
        this.x = activityOrdersBinding;
        if (activityOrdersBinding == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        ViewPager2 viewPager2 = activityOrdersBinding.y;
        activityOrdersBinding.D(this);
        activityOrdersBinding.L(O4());
        viewPager2.setAdapter(this.B);
        viewPager2.c(new ViewPager2.OnPageChangeCallback() { // from class: au.com.woolworths.feature.shop.myorders.orders.OrdersActivity$onCreate$1$1
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public final void c(int i) {
                int i2 = OrdersActivity.C;
                OrdersViewModel ordersViewModelO4 = this.f7853a.O4();
                List list = (List) ordersViewModelO4.k.e();
                if (list == null) {
                    list = EmptyList.d;
                }
                OrdersTab ordersTab = (OrdersTab) CollectionsKt.J(i, list);
                OrdersActions j = ordersTab != null ? ordersTab.getJ() : null;
                if (list.size() < 2 || j == null) {
                    return;
                }
                ordersViewModelO4.f.c(j);
            }
        });
        setSupportActionBar(activityOrdersBinding.A);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.s(true);
        }
        new TabLayoutMediator(activityOrdersBinding.z, viewPager2, new e(24, this, this)).a();
        O4().k.f(this, new OrdersActivity$sam$androidx_lifecycle_Observer$0(new a(this, 4)));
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass3(null), 3);
        O4().p6();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        boolean zOnOptionsItemSelected;
        Callback.p(item);
        try {
            Intrinsics.h(item, "item");
            if (item.getItemId() == 16908332) {
                onBackPressed();
                zOnOptionsItemSelected = true;
            } else {
                zOnOptionsItemSelected = super.onOptionsItemSelected(item);
            }
            Callback.q();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            Callback.q();
            throw th;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        AnalyticsManager analyticsManager = this.z;
        if (analyticsManager != null) {
            analyticsManager.a(MyOrdersScreens.f);
        } else {
            Intrinsics.p("analyticsManager");
            throw null;
        }
    }
}
