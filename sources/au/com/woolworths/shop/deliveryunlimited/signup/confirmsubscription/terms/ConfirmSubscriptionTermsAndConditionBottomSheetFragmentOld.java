package au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.terms;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.product.details.d;
import au.com.woolworths.shop.cart.ui.c;
import au.com.woolworths.shop.deliveryunlimited.signup.analytics.ConfirmSubscriptionActions;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.ConfirmSubscriptionViewModel;
import au.com.woolworths.shop.deliveryunlimited.signup.databinding.FragmentAcceptTermsAndConditionBottomSheetOldBinding;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/confirmsubscription/terms/ConfirmSubscriptionTermsAndConditionBottomSheetFragmentOld;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "Companion", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ConfirmSubscriptionTermsAndConditionBottomSheetFragmentOld extends Hilt_ConfirmSubscriptionTermsAndConditionBottomSheetFragmentOld {
    public AnalyticsManager i;
    public FragmentAcceptTermsAndConditionBottomSheetOldBinding k;
    public final ViewModelLazy j = new ViewModelLazy(Reflection.f24268a.b(ConfirmSubscriptionViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.terms.ConfirmSubscriptionTermsAndConditionBottomSheetFragmentOld$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.terms.ConfirmSubscriptionTermsAndConditionBottomSheetFragmentOld$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.terms.ConfirmSubscriptionTermsAndConditionBottomSheetFragmentOld$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getDefaultViewModelCreationExtras();
        }
    });
    public final Lazy l = LazyKt.b(new c(this, 12));

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/confirmsubscription/terms/ConfirmSubscriptionTermsAndConditionBottomSheetFragmentOld$Companion;", "", "", "TAG", "Ljava/lang/String;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        FragmentAcceptTermsAndConditionBottomSheetOldBinding fragmentAcceptTermsAndConditionBottomSheetOldBinding = (FragmentAcceptTermsAndConditionBottomSheetOldBinding) DataBindingUtil.c(inflater, R.layout.fragment_accept_terms_and_condition_bottom_sheet_old, viewGroup, false, null);
        fragmentAcceptTermsAndConditionBottomSheetOldBinding.D(getViewLifecycleOwner());
        fragmentAcceptTermsAndConditionBottomSheetOldBinding.y.setController((ConfirmSubscriptionTermsAndConditionEpoxyControllerOld) this.l.getD());
        this.k = fragmentAcceptTermsAndConditionBottomSheetOldBinding;
        AnalyticsManager analyticsManager = this.i;
        if (analyticsManager == null) {
            Intrinsics.p("analyticsManager");
            throw null;
        }
        analyticsManager.c(ConfirmSubscriptionActions.f);
        FragmentAcceptTermsAndConditionBottomSheetOldBinding fragmentAcceptTermsAndConditionBottomSheetOldBinding2 = this.k;
        if (fragmentAcceptTermsAndConditionBottomSheetOldBinding2 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        View view = fragmentAcceptTermsAndConditionBottomSheetOldBinding2.h;
        Intrinsics.g(view, "getRoot(...)");
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.h(view, "view");
        super.onViewCreated(view, bundle);
        ViewModelLazy viewModelLazy = this.j;
        ((ConfirmSubscriptionViewModel) viewModelLazy.getD()).k.f(getViewLifecycleOwner(), new ConfirmSubscriptionTermsAndConditionBottomSheetFragmentOld$sam$androidx_lifecycle_Observer$0(new d(this, 25)));
        if (this.k != null) {
        } else {
            Intrinsics.p("binding");
            throw null;
        }
    }
}
