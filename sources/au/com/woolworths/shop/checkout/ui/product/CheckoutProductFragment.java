package au.com.woolworths.shop.checkout.ui.product;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavController;
import androidx.navigation.fragment.FragmentKt;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.shop.banners.broadcastbanner.BannerDismissInteractor;
import au.com.woolworths.shop.checkout.databinding.FragmentCheckoutContentBinding;
import au.com.woolworths.shop.checkout.domain.model.CheckoutProduct;
import au.com.woolworths.shop.checkout.domain.model.CheckoutProductInstruction;
import au.com.woolworths.shop.checkout.domain.model.InputTextLimit;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentContract;
import au.com.woolworths.shop.checkout.ui.epoxy.controller.CheckoutProductEpoxyController;
import au.com.woolworths.shop.checkout.ui.product.CheckoutProductFragmentDirections;
import au.com.woolworths.shop.checkout.ui.shopperNote.ShopperNoteExtras;
import au.com.woolworths.shop.checkout.ui.substitution.SubstitutionActivity;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/product/CheckoutProductFragment;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentFragment;", "<init>", "()V", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CheckoutProductFragment extends Hilt_CheckoutProductFragment {
    public FeatureToggleManager r;
    public BannerDismissInteractor s;
    public final ViewModelLazy t;
    public final Lazy u;

    public CheckoutProductFragment() {
        final CheckoutProductFragment$special$$inlined$viewModels$default$1 checkoutProductFragment$special$$inlined$viewModels$default$1 = new CheckoutProductFragment$special$$inlined$viewModels$default$1(this);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.e, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.shop.checkout.ui.product.CheckoutProductFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) checkoutProductFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.t = new ViewModelLazy(Reflection.f24268a.b(CheckoutProductViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.checkout.ui.product.CheckoutProductFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.checkout.ui.product.CheckoutProductFragment$special$$inlined$viewModels$default$5
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
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.checkout.ui.product.CheckoutProductFragment$special$$inlined$viewModels$default$4
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
        this.u = LazyKt.b(new au.com.woolworths.shop.cart.ui.c(this, 9));
    }

    @Override // au.com.woolworths.shop.checkout.ui.content.CheckoutContentFragment
    public final TypedEpoxyController Q1() {
        return (CheckoutProductEpoxyController) this.u.getD();
    }

    @Override // au.com.woolworths.shop.checkout.ui.content.CheckoutContentFragment
    public final void R1(CheckoutContentContract.Actions action) {
        Intrinsics.h(action, "action");
        if (action.equals(CheckoutContentContract.Actions.LaunchDetailsScreen.f10737a)) {
            FragmentKt.a(this).c(R.id.action_to_restart_checkout, null);
            return;
        }
        if (action.equals(CheckoutContentContract.Actions.LaunchSummaryScreen.f10750a)) {
            FragmentKt.a(this).c(R.id.checkout_summary_fragment, null);
            return;
        }
        if (action.equals(CheckoutContentContract.Actions.ExitAndLaunchProducts.f10732a)) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                Activities.MainActivity.f4487a.d(activity, Activities.MainActivity.Tab.f);
                activity.finish();
                return;
            }
            return;
        }
        if (action instanceof CheckoutContentContract.Actions.LaunchSubstitutionScreen) {
            CheckoutContentContract.Actions.LaunchSubstitutionScreen launchSubstitutionScreen = (CheckoutContentContract.Actions.LaunchSubstitutionScreen) action;
            String str = launchSubstitutionScreen.f10749a;
            double d = launchSubstitutionScreen.b;
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                int i = SubstitutionActivity.x;
                activity2.startActivity(SubstitutionActivity.Companion.a(activity2, str, d));
                return;
            }
            return;
        }
        if (!(action instanceof CheckoutContentContract.Actions.LaunchShopperNoteScreen)) {
            super.R1(action);
            return;
        }
        CheckoutProduct checkoutProduct = ((CheckoutContentContract.Actions.LaunchShopperNoteScreen) action).f10747a;
        NavController navControllerA = FragmentKt.a(this);
        CheckoutProductInstruction checkoutProductInstruction = checkoutProduct.h;
        String str2 = checkoutProductInstruction.b;
        String str3 = checkoutProductInstruction.f;
        String str4 = checkoutProductInstruction.f10569a;
        InputTextLimit inputTextLimit = checkoutProductInstruction.e;
        navControllerA.d(new CheckoutProductFragmentDirections.ActionCheckoutProductFragmentToShopperNoteFragment(new ShopperNoteExtras(str2, str3, str4, inputTextLimit != null ? Integer.valueOf(inputTextLimit.d) : null, checkoutProduct.b, checkoutProduct.c)));
    }

    public final CheckoutProductViewModel o2() {
        return (CheckoutProductViewModel) this.t.getD();
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
        BuildersKt.c(LifecycleOwnerKt.a(viewLifecycleOwner), null, null, new CheckoutProductFragment$observeActions$1(this, null), 3);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.g(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        BuildersKt.c(LifecycleOwnerKt.a(viewLifecycleOwner2), null, null, new CheckoutProductFragment$observeData$1(this, null), 3);
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.g(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        BuildersKt.c(LifecycleOwnerKt.a(viewLifecycleOwner3), null, null, new CheckoutProductFragment$observeData$2(this, null), 3);
        return viewOnCreateView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        CheckoutProductViewModel checkoutProductViewModelO2 = o2();
        checkoutProductViewModelO2.f.a(Screens.i);
        checkoutProductViewModelO2.r6(new h(20));
    }
}
