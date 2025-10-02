package au.com.woolworths.shop.checkout.ui.details;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.fragment.FragmentKt;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.deeplink.ShopAppDeepLink;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.shop.checkout.databinding.FragmentCheckoutContentBinding;
import au.com.woolworths.shop.checkout.domain.model.Checkout;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindows;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsOption;
import au.com.woolworths.shop.checkout.domain.model.LegacyNotifications;
import au.com.woolworths.shop.checkout.ui.analytics.CheckoutDetailsActions;
import au.com.woolworths.shop.checkout.ui.contactdetails.ContactDetailsExtras;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentContract;
import au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsFragmentDirections;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowSource;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsViewModel;
import au.com.woolworths.shop.checkout.ui.idverification.IdVerificationCompleteResponse;
import au.com.woolworths.shop.checkout.ui.listener.FulfilmentWindowsListener;
import au.com.woolworths.shop.checkout.ui.listener.FulfilmentWindowsSelectedListener;
import com.airbnb.epoxy.TypedEpoxyController;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/details/CheckoutDetailsFragment;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentFragment;", "Lau/com/woolworths/shop/checkout/ui/listener/FulfilmentWindowsListener;", "Lau/com/woolworths/shop/checkout/ui/listener/FulfilmentWindowsSelectedListener;", "<init>", "()V", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$ViewState;", "viewState", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CheckoutDetailsFragment extends Hilt_CheckoutDetailsFragment implements FulfilmentWindowsListener, FulfilmentWindowsSelectedListener {
    public FeatureToggleManager r;
    public final boolean s = true;
    public final ViewModelLazy t;
    public final ViewModelLazy u;
    public final ActivityResultLauncher v;

    public CheckoutDetailsFragment() {
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.t = new ViewModelLazy(reflectionFactory.b(FulfilmentWindowsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsFragment$special$$inlined$activityViewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getDefaultViewModelCreationExtras();
            }
        });
        this.u = new ViewModelLazy(reflectionFactory.b(CheckoutDetailsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsFragment$special$$inlined$activityViewModels$default$4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsFragment$special$$inlined$activityViewModels$default$6
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsFragment$special$$inlined$activityViewModels$default$5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getDefaultViewModelCreationExtras();
            }
        });
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new androidx.activity.compose.a(this, 17));
        Intrinsics.g(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.v = activityResultLauncherRegisterForActivityResult;
    }

    @Override // au.com.woolworths.shop.checkout.ui.content.CheckoutContentFragment
    public final void E1(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1829036251);
        int i2 = (composerImplV.I(this) ? 4 : 2) | i;
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            MutableState mutableStateA = FlowExtKt.a(o2().m, composerImplV);
            Checkout checkout = ((CheckoutContentContract.ViewState) mutableStateA.getD()).d;
            List list = checkout != null ? checkout.b : null;
            if (list == null) {
                list = EmptyList.d;
            }
            LegacyNotifications legacyNotifications = ((CheckoutContentContract.ViewState) mutableStateA.getD()).e;
            CheckoutDetailsContentKt.a(list, legacyNotifications != null ? legacyNotifications.f10618a : null, o2(), this, this, o2(), ((CheckoutContentContract.ViewState) mutableStateA.getD()).f, composerImplV, ((i2 << 9) & 7168) | ((i2 << 12) & 57344), 0);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.homepage.presentation.marketplace.a(i, 26, this);
        }
    }

    @Override // au.com.woolworths.shop.checkout.ui.listener.FulfilmentWindowsListener
    public final void J(String title, FulfilmentWindows fulfilmentWindows, FulfilmentWindowsOption fulfilmentWindowsOption) {
        Intrinsics.h(title, "title");
        Intrinsics.h(fulfilmentWindows, "fulfilmentWindows");
        Intrinsics.h(fulfilmentWindowsOption, "fulfilmentWindowsOption");
        AnalyticsManager analyticsManagerI1 = I1();
        CheckoutDetailsActions.CustomButtonClick customButtonClick = new CheckoutDetailsActions.CustomButtonClick(title);
        TrackableValue trackableValue = TrackableValue.o0;
        FulfilmentWindowSource fulfilmentWindowSource = FulfilmentWindowSource.e;
        analyticsManagerI1.j(customButtonClick, TrackingMetadata.Companion.a(trackableValue, "Checkout"));
        FeatureToggleManager featureToggleManager = this.r;
        if (featureToggleManager == null) {
            Intrinsics.p("featureToggleManager");
            throw null;
        }
        if (!featureToggleManager.c(BaseShopAppFeature.j)) {
            ((FulfilmentWindowsViewModel) this.t.getD()).z6(fulfilmentWindows, fulfilmentWindowsOption);
            FragmentKt.a(this).c(R.id.checkout_fulfilment_windows_fragment, null);
            return;
        }
        Integer numValueOf = Integer.valueOf(fulfilmentWindows.e.indexOf(fulfilmentWindowsOption));
        Intent intentA = ActivityNavigatorKt.a(Activities.TimeSelectorActivity.f4550a, ApplicationType.e);
        intentA.putExtra("EXTRA_DATA", new Activities.TimeSelectorActivity.Extras(numValueOf));
        startActivity(intentA);
    }

    @Override // au.com.woolworths.shop.checkout.ui.content.CheckoutContentFragment
    public final TypedEpoxyController Q1() {
        return null;
    }

    @Override // au.com.woolworths.shop.checkout.ui.content.CheckoutContentFragment
    public final void R1(CheckoutContentContract.Actions action) {
        Intrinsics.h(action, "action");
        if (action instanceof CheckoutContentContract.Actions.LaunchAddressPicker) {
            CheckoutContentContract.Actions.LaunchAddressPicker launchAddressPicker = (CheckoutContentContract.Actions.LaunchAddressPicker) action;
            boolean z = launchAddressPicker.b;
            if (!launchAddressPicker.f10733a) {
                startActivity(Activities.DeliveryAddressSearchActivity.f4466a.b(new Activities.DeliveryAddressSearchActivity.Extras(false, true, z, false)));
                return;
            } else {
                Activities.ManageFullDeliveryAddressesActivity.Extras extras = new Activities.ManageFullDeliveryAddressesActivity.Extras(0, false, z);
                Intent intentA = ActivityNavigatorKt.a(Activities.ManageFullDeliveryAddressesActivity.f4488a, ApplicationType.e);
                intentA.putExtra("EXTRA_DATA", extras);
                startActivity(intentA);
                return;
            }
        }
        if (action.equals(CheckoutContentContract.Actions.LaunchPickUpStoreLocator.f10741a)) {
            FeatureToggleManager featureToggleManager = this.r;
            if (featureToggleManager == null) {
                Intrinsics.p("featureToggleManager");
                throw null;
            }
            if (featureToggleManager.c(BaseShopAppFeature.b0)) {
                startActivity(ActivityNavigatorKt.a(Activities.StoreLocator.f4547a, ApplicationType.e));
                return;
            } else {
                startActivity(ActivityNavigatorKt.a(Activities.PickUpLocatorActivity.f4500a, ApplicationType.e));
                return;
            }
        }
        if (action.equals(CheckoutContentContract.Actions.LaunchReviewScreen.f10745a)) {
            Activities.ProductsReviewActivity.Extras extras2 = new Activities.ProductsReviewActivity.Extras(Activities.ProductsReviewActivity.Source.f);
            Intent intentA2 = ActivityNavigatorKt.a(Activities.ProductsReviewActivity.f4508a, ApplicationType.e);
            intentA2.putExtra("extraData", extras2);
            this.v.a(intentA2, null);
            return;
        }
        if (action.equals(CheckoutContentContract.Actions.LaunchProductScreen.f10742a)) {
            FragmentKt.a(this).c(R.id.checkout_product_fragment, null);
            return;
        }
        if (action instanceof CheckoutContentContract.Actions.LaunchLink) {
            startActivity(ShopAppDeepLink.a(Screens.g, ((CheckoutContentContract.Actions.LaunchLink) action).f10739a));
        } else if (!(action instanceof CheckoutContentContract.Actions.LaunchContactDetails)) {
            super.R1(action);
        } else {
            CheckoutContentContract.Actions.LaunchContactDetails launchContactDetails = (CheckoutContentContract.Actions.LaunchContactDetails) action;
            FragmentKt.a(this).d(new CheckoutDetailsFragmentDirections.ActionCheckoutDetailsFragmentToCheckoutContactDetailsFragment(new ContactDetailsExtras(launchContactDetails.f10736a, launchContactDetails.b)));
        }
    }

    @Override // au.com.woolworths.shop.checkout.ui.content.CheckoutContentFragment
    /* renamed from: b2, reason: from getter */
    public final boolean getS() {
        return this.s;
    }

    @Override // au.com.woolworths.shop.checkout.ui.listener.FulfilmentWindowsSelectedListener
    public final void f(String str, String str2, FulfilmentWindows fulfilmentWindows) {
        Object next;
        AnalyticsManager analyticsManagerI1 = I1();
        CheckoutDetailsActions.CustomButtonClick customButtonClick = new CheckoutDetailsActions.CustomButtonClick(androidx.camera.core.impl.b.o(str, " ", str2));
        TrackableValue trackableValue = TrackableValue.o0;
        FulfilmentWindowSource fulfilmentWindowSource = FulfilmentWindowSource.e;
        analyticsManagerI1.j(customButtonClick, TrackingMetadata.Companion.a(trackableValue, "Checkout"));
        FeatureToggleManager featureToggleManager = this.r;
        if (featureToggleManager == null) {
            Intrinsics.p("featureToggleManager");
            throw null;
        }
        if (featureToggleManager.c(BaseShopAppFeature.j)) {
            startActivity(Activities.TimeSelectorActivity.b());
            return;
        }
        FulfilmentWindowsViewModel fulfilmentWindowsViewModel = (FulfilmentWindowsViewModel) this.t.getD();
        Iterator it = fulfilmentWindows.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((FulfilmentWindowsOption) next).d) {
                    break;
                }
            }
        }
        fulfilmentWindowsViewModel.z6(fulfilmentWindows, (FulfilmentWindowsOption) next);
        FragmentKt.a(this).c(R.id.checkout_fulfilment_windows_fragment, null);
    }

    @Override // au.com.woolworths.shop.checkout.ui.content.CheckoutContentFragment
    public final void h2(IdVerificationCompleteResponse idVerificationCompleteResponse) {
        CheckoutDetailsViewModel checkoutDetailsViewModelO2 = o2();
        checkoutDetailsViewModelO2.r = false;
        checkoutDetailsViewModelO2.r6(new h(20));
        BuildersKt.c(ViewModelKt.a(checkoutDetailsViewModelO2), null, null, new CheckoutDetailsViewModel$onIdVerificationCompleteResult$2(checkoutDetailsViewModelO2, idVerificationCompleteResponse, null), 3);
    }

    public final CheckoutDetailsViewModel o2() {
        return (CheckoutDetailsViewModel) this.u.getD();
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
        BuildersKt.c(LifecycleOwnerKt.a(viewLifecycleOwner), null, null, new CheckoutDetailsFragment$observeActions$1(this, null), 3);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.g(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        BuildersKt.c(LifecycleOwnerKt.a(viewLifecycleOwner2), null, null, new CheckoutDetailsFragment$observeData$1(this, null), 3);
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.g(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        BuildersKt.c(LifecycleOwnerKt.a(viewLifecycleOwner3), null, null, new CheckoutDetailsFragment$observeData$2(this, null), 3);
        return viewOnCreateView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        CheckoutDetailsViewModel checkoutDetailsViewModelO2 = o2();
        if (checkoutDetailsViewModelO2.r) {
            checkoutDetailsViewModelO2.r6(new h(20));
        } else {
            checkoutDetailsViewModelO2.r = true;
        }
        checkoutDetailsViewModelO2.f.a(Screens.g);
    }
}
