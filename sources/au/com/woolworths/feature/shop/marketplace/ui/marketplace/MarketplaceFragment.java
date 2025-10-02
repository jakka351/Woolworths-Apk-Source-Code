package au.com.woolworths.feature.shop.marketplace.ui.marketplace;

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
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.widget.ViewPager2;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.feature.rewards.offers.detail.composable.f;
import au.com.woolworths.feature.shop.delivery.address.a;
import au.com.woolworths.feature.shop.marketplace.databinding.FragmentMarketplaceBinding;
import au.com.woolworths.feature.shop.marketplace.ui.main.MarketplaceActions;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceContract;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/marketplace/MarketplaceFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Companion", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MarketplaceFragment extends Hilt_MarketplaceFragment {
    public FeatureToggleManager i;
    public FragmentMarketplaceBinding k;
    public final ViewModelLazy j = new ViewModelLazy(Reflection.f24268a.b(MarketplaceViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getDefaultViewModelCreationExtras();
        }
    });
    public final Lazy l = LazyKt.b(new f(this, 23));

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/marketplace/MarketplaceFragment$Companion;", "", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public final MarketplaceViewModel I1() {
        return (MarketplaceViewModel) this.j.getD();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        int i = FragmentMarketplaceBinding.E;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        FragmentMarketplaceBinding fragmentMarketplaceBinding = (FragmentMarketplaceBinding) ViewDataBinding.q(inflater, R.layout.fragment_marketplace, null, false, null);
        this.k = fragmentMarketplaceBinding;
        Intrinsics.e(fragmentMarketplaceBinding);
        ViewPager2 viewPager2 = fragmentMarketplaceBinding.A;
        viewPager2.setAdapter((MarketplacePagerAdapter) this.l.getD());
        viewPager2.c(new ViewPager2.OnPageChangeCallback() { // from class: au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceFragment$onCreateView$1$1
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public final void c(int i2) {
                MarketplaceContract.Tab tab;
                MarketplaceViewModel marketplaceViewModelI1 = this.f7494a.I1();
                List list = ((MarketplaceContract.ViewState) marketplaceViewModelI1.g.getValue()).b;
                String str = (list == null || (tab = (MarketplaceContract.Tab) list.get(i2)) == null) ? null : tab.f7492a;
                AnalyticsManager analyticsManager = marketplaceViewModelI1.e;
                if (str != null) {
                    analyticsManager.c(new MarketplaceActions.ButtonClick(str));
                }
            }
        });
        viewPager2.setUserInputEnabled(false);
        fragmentMarketplaceBinding.L(I1());
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt.c(LifecycleOwnerKt.a(viewLifecycleOwner), null, null, new MarketplaceFragment$observeData$1(this, null), 3);
        FragmentMarketplaceBinding fragmentMarketplaceBinding2 = this.k;
        Intrinsics.e(fragmentMarketplaceBinding2);
        View view = fragmentMarketplaceBinding2.h;
        Intrinsics.g(view, "getRoot(...)");
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.k = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        I1().e.a(Screens.m);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.h(view, "view");
        super.onViewCreated(view, bundle);
        FragmentMarketplaceBinding fragmentMarketplaceBinding = this.k;
        Intrinsics.e(fragmentMarketplaceBinding);
        TabLayout tabLayout = fragmentMarketplaceBinding.z;
        FragmentMarketplaceBinding fragmentMarketplaceBinding2 = this.k;
        Intrinsics.e(fragmentMarketplaceBinding2);
        new TabLayoutMediator(tabLayout, fragmentMarketplaceBinding2.A, new a(this, 13)).a();
        MarketplaceViewModel marketplaceViewModelI1 = I1();
        MarketplaceViewModel.q6(marketplaceViewModelI1.g, true, null);
        BuildersKt.c(ViewModelKt.a(marketplaceViewModelI1), null, null, new MarketplaceViewModel$fetchMarketplaceData$1(marketplaceViewModelI1, null), 3);
    }
}
