package au.com.woolworths.shop.checkout.ui.summary;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.fragment.FragmentKt;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.foundation.shop.bottomsheet.CheckoutRefundInfo;
import au.com.woolworths.shop.checkout.databinding.FragmentCheckoutContentBinding;
import au.com.woolworths.shop.checkout.ui.bridge.CheckoutBridgeContract;
import au.com.woolworths.shop.checkout.ui.bridge.CheckoutBridgeViewModel;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentContract;
import au.com.woolworths.shop.checkout.ui.epoxy.controller.CheckoutSummaryEpoxyController;
import au.com.woolworths.shop.checkout.ui.summary.CheckoutSummaryFragmentDirections;
import com.airbnb.epoxy.TypedEpoxyController;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/summary/CheckoutSummaryFragment;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentFragment;", "<init>", "()V", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CheckoutSummaryFragment extends Hilt_CheckoutSummaryFragment {
    public FeatureToggleManager r;
    public final ViewModelLazy s;
    public final Lazy t;

    public CheckoutSummaryFragment() {
        final CheckoutSummaryFragment$special$$inlined$viewModels$default$1 checkoutSummaryFragment$special$$inlined$viewModels$default$1 = new CheckoutSummaryFragment$special$$inlined$viewModels$default$1(this);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.e, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.shop.checkout.ui.summary.CheckoutSummaryFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) checkoutSummaryFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.s = new ViewModelLazy(Reflection.f24268a.b(CheckoutSummaryViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.checkout.ui.summary.CheckoutSummaryFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.checkout.ui.summary.CheckoutSummaryFragment$special$$inlined$viewModels$default$5
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
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.checkout.ui.summary.CheckoutSummaryFragment$special$$inlined$viewModels$default$4
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
        this.t = LazyKt.b(new b(this, 3));
    }

    @Override // au.com.woolworths.shop.checkout.ui.content.CheckoutContentFragment
    public final TypedEpoxyController Q1() {
        return (CheckoutSummaryEpoxyController) this.t.getD();
    }

    @Override // au.com.woolworths.shop.checkout.ui.content.CheckoutContentFragment
    public final void R1(CheckoutContentContract.Actions action) {
        Intrinsics.h(action, "action");
        if (action.equals(CheckoutContentContract.Actions.AddBillingAddress.f10729a)) {
            startActivity(Activities.DeliveryAddressSearchActivity.f4466a.b(new Activities.DeliveryAddressSearchActivity.Extras(true, false, false, false)));
            return;
        }
        if (action.equals(CheckoutContentContract.Actions.RewardsAuthentication.f10753a)) {
            startActivity(ActivityNavigatorKt.a(Activities.Authentication.f4448a, ApplicationType.e));
            return;
        }
        if (action.equals(CheckoutContentContract.Actions.LaunchDetailsScreen.f10737a)) {
            FragmentKt.a(this).c(R.id.action_to_restart_checkout, null);
            return;
        }
        boolean z = action instanceof CheckoutContentContract.Actions.LaunchPaymentScreen;
        ViewModelLazy viewModelLazy = this.e;
        if (z) {
            boolean z2 = ((CheckoutContentContract.Actions.LaunchPaymentScreen) action).f10740a;
            CheckoutBridgeViewModel checkoutBridgeViewModel = (CheckoutBridgeViewModel) viewModelLazy.getD();
            checkoutBridgeViewModel.h.f(new CheckoutBridgeContract.Action.LaunchPaymentScreen(z2));
            return;
        }
        if (action.equals(CheckoutContentContract.Actions.LaunchZeroPayment.f10751a)) {
            CheckoutBridgeViewModel checkoutBridgeViewModel2 = (CheckoutBridgeViewModel) viewModelLazy.getD();
            checkoutBridgeViewModel2.h.f(CheckoutBridgeContract.Action.LaunchZeroPayment.f10675a);
        } else {
            if (action instanceof CheckoutContentContract.Actions.LaunchRefundBottomSheet) {
                CheckoutRefundInfo info = ((CheckoutContentContract.Actions.LaunchRefundBottomSheet) action).f10743a;
                NavController navControllerA = FragmentKt.a(this);
                Intrinsics.h(info, "info");
                navControllerA.d(new CheckoutSummaryFragmentDirections.ActionSummaryToRefundBottomSheet(info));
                return;
            }
            if (!(action instanceof CheckoutContentContract.Actions.LaunchRewardsSetup)) {
                super.R1(action);
                return;
            }
            FeatureToggleManager featureToggleManager = this.r;
            if (featureToggleManager != null) {
                startActivity(Activities.RewardsSetupMoreActivity.f4522a.b(null, featureToggleManager.c(BaseShopAppFeature.R)));
            } else {
                Intrinsics.p("featureToggleManager");
                throw null;
            }
        }
    }

    public final CheckoutSummaryViewModel o2() {
        return (CheckoutSummaryViewModel) this.s.getD();
    }

    @Override // au.com.woolworths.shop.checkout.ui.content.CheckoutContentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        View viewOnCreateView = super.onCreateView(inflater, viewGroup, bundle);
        FragmentCheckoutContentBinding fragmentCheckoutContentBinding = this.f;
        Intrinsics.e(fragmentCheckoutContentBinding);
        fragmentCheckoutContentBinding.Q(o2());
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt.c(LifecycleOwnerKt.a(viewLifecycleOwner), null, null, new CheckoutSummaryFragment$observeActions$1(this, null), 3);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.g(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        BuildersKt.c(LifecycleOwnerKt.a(viewLifecycleOwner2), null, null, new CheckoutSummaryFragment$observeData$1(this, null), 3);
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.g(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        BuildersKt.c(LifecycleOwnerKt.a(viewLifecycleOwner3), null, null, new CheckoutSummaryFragment$observeData$2(this, null), 3);
        return viewOnCreateView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        CheckoutSummaryViewModel checkoutSummaryViewModelO2 = o2();
        checkoutSummaryViewModelO2.p.a(Screens.j);
        checkoutSummaryViewModelO2.r6(new h(20));
    }

    @Override // au.com.woolworths.shop.checkout.ui.content.CheckoutContentFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.h(view, "view");
        super.onViewCreated(view, bundle);
        NavBackStackEntry navBackStackEntryE = FragmentKt.a(this).b.e(R.id.checkout_summary_fragment);
        androidx.core.view.c cVar = new androidx.core.view.c(6, navBackStackEntryE, this);
        navBackStackEntryE.k.k.a(cVar);
        getViewLifecycleOwner().getD().a(new androidx.core.view.c(7, navBackStackEntryE, cVar));
    }
}
