package au.com.woolworths.android.onesite.modules.checkout.ui;

import android.app.ComponentCaller;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$SpaceBetween$1;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavHostController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.internal.NavDestinationImpl;
import androidx.navigation.ui.ActionBarOnDestinationChangedListener;
import androidx.navigation.ui.AppBarConfiguration;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.databinding.ActivityCheckoutBinding;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.design.core.ui.component.stable.SurfaceKt;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayNavigation;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import au.com.woolworths.shop.checkout.domain.model.ProgressId;
import au.com.woolworths.shop.checkout.ui.analytics.CheckoutDetailsActions;
import au.com.woolworths.shop.checkout.ui.analytics.CheckoutProductsActions;
import au.com.woolworths.shop.checkout.ui.analytics.CheckoutSummaryActions;
import au.com.woolworths.shop.checkout.ui.bridge.CheckoutBridgeViewModel;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/ui/CheckoutActivity;", "Lau/com/woolworths/android/onesite/modules/BaseShopAppActivity;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayNavigation;", "<init>", "()V", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CheckoutActivity extends Hilt_CheckoutActivity implements WPayNavigation {
    public static final /* synthetic */ int I = 0;
    public final int B = R.layout.activity_checkout;
    public ShopAccountInteractor C;
    public FeatureToggleManager D;
    public final ViewModelLazy E;
    public final ViewModelLazy F;
    public ActivityCheckoutBinding G;
    public NavHostController H;

    public CheckoutActivity() {
        Function0<ViewModelProvider.Factory> function0 = new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelProviderFactory();
            }
        };
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.E = new ViewModelLazy(reflectionFactory.b(CheckoutViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getViewModelStore();
            }
        }, function0, new Function0<CreationExtras>() { // from class: au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutActivity$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelCreationExtras();
            }
        });
        this.F = new ViewModelLazy(reflectionFactory.b(CheckoutBridgeViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutActivity$special$$inlined$viewModels$default$5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutActivity$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutActivity$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelCreationExtras();
            }
        });
        this.u = true;
    }

    public static final void T4(NavDestination navDestination, CheckoutActivity checkoutActivity) {
        if (ArraysKt.r0(new Integer[]{Integer.valueOf(R.id.checkout_details_fragment), Integer.valueOf(R.id.checkout_product_fragment), Integer.valueOf(R.id.checkout_summary_fragment)}).contains(Integer.valueOf(navDestination.e.e))) {
            CheckoutBridgeViewModel checkoutBridgeViewModelR4 = checkoutActivity.R4();
            AnalyticsManager analyticsManager = checkoutBridgeViewModelR4.e;
            ProgressId progressId = checkoutBridgeViewModelR4.j;
            switch (progressId == null ? -1 : CheckoutBridgeViewModel.WhenMappings.f10677a[progressId.ordinal()]) {
                case -1:
                case 4:
                case 5:
                case 6:
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                    analyticsManager.c(CheckoutDetailsActions.ExitCheckout.e);
                    break;
                case 2:
                    analyticsManager.c(CheckoutProductsActions.ExitCheckout.e);
                    break;
                case 3:
                    analyticsManager.c(CheckoutSummaryActions.ExitCheckout.e);
                    break;
            }
        }
        checkoutActivity.finish();
    }

    @Override // au.com.woolworths.android.onesite.modules.BaseShopAppActivity
    /* renamed from: P4, reason: from getter */
    public final int getB() {
        return this.B;
    }

    public final CheckoutBridgeViewModel R4() {
        return (CheckoutBridgeViewModel) this.F.getD();
    }

    public final CheckoutViewModel S4() {
        return (CheckoutViewModel) this.E.getD();
    }

    @Override // au.com.woolworths.feature.shop.wpay.ui.wpay.WPayNavigation
    public final void n2() {
        NavHostController navHostController = this.H;
        if (navHostController != null) {
            navHostController.c(R.id.action_to_restart_checkout, null);
        } else {
            Intrinsics.p("navController");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.ui.Hilt_CheckoutActivity, au.com.woolworths.android.onesite.modules.BaseShopAppActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws NoSuchMethodException, SecurityException {
        super.onCreate(bundle);
        this.G = (ActivityCheckoutBinding) DataBindingUtil.d(this, this.B);
        Fragment fragmentF = getSupportFragmentManager().F(R.id.nav_host_fragment);
        Intrinsics.f(fragmentF, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        this.H = ((NavHostFragment) fragmentF).E1();
        ActivityCheckoutBinding activityCheckoutBinding = this.G;
        if (activityCheckoutBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        final Toolbar toolbar = activityCheckoutBinding.y.A;
        setSupportActionBar(toolbar);
        NavHostController navHostController = this.H;
        if (navHostController == null) {
            Intrinsics.p("navController");
            throw null;
        }
        AppBarConfiguration.Builder builder = new AppBarConfiguration.Builder();
        CheckoutActivity$inlined$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0 checkoutActivity$inlined$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0 = new CheckoutActivity$inlined$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0();
        builder.b = checkoutActivity$inlined$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0;
        navHostController.a(new ActionBarOnDestinationChangedListener(this, new AppBarConfiguration(builder.f3520a, checkoutActivity$inlined$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0)));
        NavHostController navHostController2 = this.H;
        if (navHostController2 == null) {
            Intrinsics.p("navController");
            throw null;
        }
        navHostController2.a(new NavController.OnDestinationChangedListener() { // from class: au.com.woolworths.android.onesite.modules.checkout.ui.a
            @Override // androidx.navigation.NavController.OnDestinationChangedListener
            public final void a(NavController navController, NavDestination destination, Bundle bundle2) {
                int i = CheckoutActivity.I;
                Intrinsics.h(destination, "destination");
                NavDestinationImpl navDestinationImpl = destination.e;
                int i2 = navDestinationImpl.e;
                Toolbar toolbar2 = toolbar;
                final CheckoutActivity checkoutActivity = this;
                if (i2 == R.id.checkout_fulfilment_windows_fragment) {
                    toolbar2.setNavigationOnClickListener(new View.OnClickListener() { // from class: au.com.woolworths.android.onesite.modules.checkout.ui.c
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            CheckoutActivity checkoutActivity2 = checkoutActivity;
                            int i3 = CheckoutActivity.I;
                            Callback.g(view);
                            try {
                                checkoutActivity2.onSupportNavigateUp();
                            } finally {
                                Callback.h();
                            }
                        }
                    });
                } else {
                    toolbar2.setNavigationIcon(R.drawable.ic_toolbar_close);
                    toolbar2.setNavigationOnClickListener(new androidx.navigation.ui.a(4, destination, checkoutActivity));
                }
                if (navDestinationImpl.e == R.id.checkout_summary_fragment) {
                    CheckoutBridgeViewModel checkoutBridgeViewModelR4 = checkoutActivity.R4();
                    ProgressId progressId = ProgressId.f;
                    Context context = toolbar2.getContext();
                    Intrinsics.g(context, "getContext(...)");
                    checkoutBridgeViewModelR4.p6(ProgressIdExtKt.a(progressId, context));
                    checkoutActivity.S4().k = CheckoutStep.d;
                }
            }
        });
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new CheckoutActivity$observeData$1(this, null), 3);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new CheckoutActivity$observeData$2(this, null), 3);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new CheckoutActivity$observeData$3(this, null), 3);
        ActivityCheckoutBinding activityCheckoutBinding2 = this.G;
        if (activityCheckoutBinding2 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        ComposeView composeView = activityCheckoutBinding2.y.z;
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.f1986a);
        composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutActivity$onCreate$1$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    int i = CheckoutActivity.I;
                    final MutableState mutableStateA = FlowExtKt.a(this.d.R4().g, composer);
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(257437513, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutActivity$onCreate$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                final State state = mutableStateA;
                                SurfaceKt.b(null, null, 0L, 0L, null, null, ComposableLambdaKt.c(-1803875699, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutActivity.onCreate.1.1.1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj5, Object obj6) {
                                        Composer composer3 = (Composer) obj5;
                                        if ((((Number) obj6).intValue() & 3) == 2 && composer3.c()) {
                                            composer3.j();
                                        } else {
                                            Modifier modifierH = PaddingKt.h(Modifier.Companion.d, 16, BitmapDescriptorFactory.HUE_RED, 2);
                                            Arrangement$SpaceBetween$1 arrangement$SpaceBetween$1 = Arrangement.g;
                                            composer3.o(5004770);
                                            State state2 = state;
                                            boolean zN = composer3.n(state2);
                                            Object objG = composer3.G();
                                            if (zN || objG == Composer.Companion.f1624a) {
                                                objG = new d(state2, 0);
                                                composer3.A(objG);
                                            }
                                            composer3.l();
                                            LazyDslKt.d(modifierH, null, null, false, arrangement$SpaceBetween$1, null, null, false, null, (Function1) objG, composer3, 24582, 494);
                                        }
                                        return Unit.f24250a;
                                    }
                                }, composer2), composer2, 63);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 2129308197));
    }

    public final void onNewIntent(Intent intent, ComponentCaller caller) {
        Intrinsics.h(intent, "intent");
        Intrinsics.h(caller, "caller");
        super.onNewIntent(intent, caller);
        setIntent(intent);
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public final boolean onSupportNavigateUp() {
        NavHostController navHostController = this.H;
        if (navHostController != null) {
            return navHostController.f() || super.onSupportNavigateUp();
        }
        Intrinsics.p("navController");
        throw null;
    }
}
