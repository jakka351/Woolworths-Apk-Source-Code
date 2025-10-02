package au.com.woolworths.shop.checkout.ui.fulfilmentwindows;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavArgsLazy;
import androidx.viewpager2.widget.ViewPager2;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.shop.cart.ui.c;
import au.com.woolworths.shop.checkout.databinding.FragmentFulfilmentWindowsBinding;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindows;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsGroup;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsOption;
import au.com.woolworths.shop.checkout.ui.analytics.CheckoutScreens;
import au.com.woolworths.shop.checkout.ui.analytics.FulfilmentWindowsActions;
import au.com.woolworths.shop.checkout.ui.bridge.CheckoutBridgeViewModel;
import au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsViewModel;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsContract;
import au.com.woolworths.shop.checkout.ui.listener.FulfilmentWindowsListener;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/fulfilmentwindows/FulfilmentWindowsFragment;", "Landroidx/fragment/app/Fragment;", "Lau/com/woolworths/shop/checkout/ui/listener/FulfilmentWindowsListener;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "<init>", "()V", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class FulfilmentWindowsFragment extends Hilt_FulfilmentWindowsFragment implements FulfilmentWindowsListener, FullPageErrorStateClickHandler {
    public AnalyticsManager i;
    public FeatureToggleManager j;
    public final ViewModelLazy k;
    public final ViewModelLazy l;
    public final ViewModelLazy m;
    public FragmentFulfilmentWindowsBinding n;
    public final Lazy o;
    public final NavArgsLazy p;

    public FulfilmentWindowsFragment() {
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.k = new ViewModelLazy(reflectionFactory.b(CheckoutDetailsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsFragment$special$$inlined$activityViewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getDefaultViewModelCreationExtras();
            }
        });
        this.l = new ViewModelLazy(reflectionFactory.b(FulfilmentWindowsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsFragment$special$$inlined$activityViewModels$default$4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsFragment$special$$inlined$activityViewModels$default$6
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsFragment$special$$inlined$activityViewModels$default$5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getDefaultViewModelCreationExtras();
            }
        });
        this.m = new ViewModelLazy(reflectionFactory.b(CheckoutBridgeViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsFragment$special$$inlined$activityViewModels$default$7
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsFragment$special$$inlined$activityViewModels$default$9
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsFragment$special$$inlined$activityViewModels$default$8
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getDefaultViewModelCreationExtras();
            }
        });
        this.o = LazyKt.b(new c(this, 6));
        this.p = new NavArgsLazy(reflectionFactory.b(FulfilmentWindowsFragmentArgs.class), new Function0<Bundle>() { // from class: au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsFragment$special$$inlined$navArgs$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FulfilmentWindowsFragment fulfilmentWindowsFragment = this.d;
                Bundle arguments = fulfilmentWindowsFragment.getArguments();
                if (arguments != null) {
                    return arguments;
                }
                throw new IllegalStateException("Fragment " + fulfilmentWindowsFragment + " has null arguments");
            }
        });
    }

    public final FulfilmentWindowsViewModel I1() {
        return (FulfilmentWindowsViewModel) this.l.getD();
    }

    @Override // au.com.woolworths.shop.checkout.ui.listener.FulfilmentWindowsListener
    public final void J(String title, FulfilmentWindows fulfilmentWindows, FulfilmentWindowsOption fulfilmentWindowsOption) {
        Intrinsics.h(title, "title");
        Intrinsics.h(fulfilmentWindows, "fulfilmentWindows");
        Intrinsics.h(fulfilmentWindowsOption, "fulfilmentWindowsOption");
        FulfilmentWindowsViewModel fulfilmentWindowsViewModelI1 = I1();
        fulfilmentWindowsViewModelI1.f.j(FulfilmentWindowsActions.DateSelection.e, fulfilmentWindowsViewModelI1.t6());
        fulfilmentWindowsViewModelI1.z6(fulfilmentWindows, fulfilmentWindowsOption);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((CheckoutBridgeViewModel) this.m.getD()).p6(EmptyList.d);
        I1().j = ((FulfilmentWindowsFragmentArgs) this.p.getD()).f10790a;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        int i = FragmentFulfilmentWindowsBinding.Q;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        FragmentFulfilmentWindowsBinding fragmentFulfilmentWindowsBinding = (FragmentFulfilmentWindowsBinding) ViewDataBinding.q(inflater, R.layout.fragment_fulfilment_windows, viewGroup, false, null);
        this.n = fragmentFulfilmentWindowsBinding;
        Intrinsics.e(fragmentFulfilmentWindowsBinding);
        fragmentFulfilmentWindowsBinding.D(getViewLifecycleOwner());
        fragmentFulfilmentWindowsBinding.B.setAdapter((FulfilmentWindowsAdapter) this.o.getD());
        fragmentFulfilmentWindowsBinding.R(I1());
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt.c(LifecycleOwnerKt.a(viewLifecycleOwner), null, null, new FulfilmentWindowsFragment$observeActions$1(this, null), 3);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.g(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        BuildersKt.c(LifecycleOwnerKt.a(viewLifecycleOwner2), null, null, new FulfilmentWindowsFragment$observeData$1(this, null), 3);
        FragmentFulfilmentWindowsBinding fragmentFulfilmentWindowsBinding2 = this.n;
        Intrinsics.e(fragmentFulfilmentWindowsBinding2);
        View view = fragmentFulfilmentWindowsBinding2.h;
        Intrinsics.g(view, "getRoot(...)");
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.n = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        FulfilmentWindowsViewModel fulfilmentWindowsViewModelI1 = I1();
        fulfilmentWindowsViewModelI1.f.e(CheckoutScreens.e, fulfilmentWindowsViewModelI1.t6());
        FragmentFulfilmentWindowsBinding fragmentFulfilmentWindowsBinding = this.n;
        Intrinsics.e(fragmentFulfilmentWindowsBinding);
        if (fragmentFulfilmentWindowsBinding.K != null) {
            AnalyticsManager analyticsManager = this.i;
            if (analyticsManager != null) {
                analyticsManager.c(FulfilmentWindowsActions.DeliveryNowImpression.e);
            } else {
                Intrinsics.p("analyticsManager");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.h(view, "view");
        super.onViewCreated(view, bundle);
        FragmentFulfilmentWindowsBinding fragmentFulfilmentWindowsBinding = this.n;
        Intrinsics.e(fragmentFulfilmentWindowsBinding);
        TabLayout tabLayout = fragmentFulfilmentWindowsBinding.C;
        FragmentFulfilmentWindowsBinding fragmentFulfilmentWindowsBinding2 = this.n;
        Intrinsics.e(fragmentFulfilmentWindowsBinding2);
        new TabLayoutMediator(tabLayout, fragmentFulfilmentWindowsBinding2.B, new au.com.woolworths.product.details.epoxy.a(this, 6)).a();
        FragmentFulfilmentWindowsBinding fragmentFulfilmentWindowsBinding3 = this.n;
        Intrinsics.e(fragmentFulfilmentWindowsBinding3);
        fragmentFulfilmentWindowsBinding3.P(I1());
        FragmentFulfilmentWindowsBinding fragmentFulfilmentWindowsBinding4 = this.n;
        Intrinsics.e(fragmentFulfilmentWindowsBinding4);
        fragmentFulfilmentWindowsBinding4.B.c(new ViewPager2.OnPageChangeCallback() { // from class: au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsFragment$initialiseView$2
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public final void c(int i) {
                FulfilmentWindowsFragment fulfilmentWindowsFragment = this.f10789a;
                FulfilmentWindowsGroup group = (FulfilmentWindowsGroup) ((FulfilmentWindowsAdapter) fulfilmentWindowsFragment.o.getD()).p.get(i);
                FulfilmentWindowsViewModel fulfilmentWindowsViewModelI1 = fulfilmentWindowsFragment.I1();
                Intrinsics.h(group, "group");
                String str = group.f10613a;
                MutableStateFlow mutableStateFlow = fulfilmentWindowsViewModelI1.k;
                FulfilmentWindowsContract.ViewState viewState = (FulfilmentWindowsContract.ViewState) mutableStateFlow.getValue();
                if (!str.equals(viewState != null ? viewState.e : null)) {
                    FulfilmentWindowsViewModel.y6(fulfilmentWindowsViewModelI1, mutableStateFlow, null, null, null, str, null, 51);
                }
                FulfilmentWindowsViewModel fulfilmentWindowsViewModelI12 = fulfilmentWindowsFragment.I1();
                fulfilmentWindowsViewModelI12.f.j(new FulfilmentWindowsActions.DayPeriodSelection(str), fulfilmentWindowsViewModelI12.t6());
            }
        });
    }
}
