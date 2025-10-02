package au.com.woolworths.feature.shop.marketplace.ui.categories;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.shop.marketplace.MarketplaceFeature;
import au.com.woolworths.feature.shop.marketplace.databinding.FragmentMarketplaceContentBinding;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/categories/MarketplaceCategoriesFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Companion", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MarketplaceCategoriesFragment extends Hilt_MarketplaceCategoriesFragment {
    public FeatureToggleManager i;
    public final Lazy j;
    public final ViewModelLazy k;
    public FragmentMarketplaceContentBinding l;
    public final Lazy m;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/categories/MarketplaceCategoriesFragment$Companion;", "", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public MarketplaceCategoriesFragment() {
        final int i = 0;
        this.j = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.feature.shop.marketplace.ui.categories.b
            public final /* synthetic */ MarketplaceCategoriesFragment e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        FeatureToggleManager featureToggleManager = this.e.i;
                        if (featureToggleManager != null) {
                            return Boolean.valueOf(featureToggleManager.c(MarketplaceFeature.e));
                        }
                        Intrinsics.p("featureManager");
                        throw null;
                    default:
                        return new MarketplaceCategoriesEpoxyController(this.e.I1());
                }
            }
        });
        final MarketplaceCategoriesFragment$special$$inlined$viewModels$default$1 marketplaceCategoriesFragment$special$$inlined$viewModels$default$1 = new MarketplaceCategoriesFragment$special$$inlined$viewModels$default$1(this);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.e, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.feature.shop.marketplace.ui.categories.MarketplaceCategoriesFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) marketplaceCategoriesFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.k = new ViewModelLazy(Reflection.f24268a.b(MarketplaceCategoriesViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.marketplace.ui.categories.MarketplaceCategoriesFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.marketplace.ui.categories.MarketplaceCategoriesFragment$special$$inlined$viewModels$default$5
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
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.marketplace.ui.categories.MarketplaceCategoriesFragment$special$$inlined$viewModels$default$4
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
        final int i2 = 1;
        this.m = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.feature.shop.marketplace.ui.categories.b
            public final /* synthetic */ MarketplaceCategoriesFragment e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        FeatureToggleManager featureToggleManager = this.e.i;
                        if (featureToggleManager != null) {
                            return Boolean.valueOf(featureToggleManager.c(MarketplaceFeature.e));
                        }
                        Intrinsics.p("featureManager");
                        throw null;
                    default:
                        return new MarketplaceCategoriesEpoxyController(this.e.I1());
                }
            }
        });
    }

    public final MarketplaceCategoriesViewModel I1() {
        return (MarketplaceCategoriesViewModel) this.k.getD();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        if (((Boolean) this.j.getD()).booleanValue()) {
            Context contextRequireContext = requireContext();
            Intrinsics.g(contextRequireContext, "requireContext(...)");
            ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
            composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.marketplace.ui.categories.MarketplaceCategoriesFragment$onCreateView$1$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                        composer.j();
                    } else {
                        final MarketplaceCategoriesFragment marketplaceCategoriesFragment = this.d;
                        ThemeKt.b(6, composer, ComposableLambdaKt.c(2046040345, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.marketplace.ui.categories.MarketplaceCategoriesFragment$onCreateView$1$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer2 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    MarketplaceCategoriesScreenKt.a(marketplaceCategoriesFragment.I1(), composer2, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, composer));
                    }
                    return Unit.f24250a;
                }
            }, true, 1343047377));
            return composeView;
        }
        int i = FragmentMarketplaceContentBinding.B;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        FragmentMarketplaceContentBinding fragmentMarketplaceContentBinding = (FragmentMarketplaceContentBinding) ViewDataBinding.q(inflater, R.layout.fragment_marketplace_content, viewGroup, false, null);
        this.l = fragmentMarketplaceContentBinding;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt.c(LifecycleOwnerKt.a(viewLifecycleOwner), null, null, new MarketplaceCategoriesFragment$onCreateView$2$1(this, null), 3);
        View view = fragmentMarketplaceContentBinding.h;
        Intrinsics.g(view, "getRoot(...)");
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.l = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.h(view, "view");
        super.onViewCreated(view, bundle);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt.c(LifecycleOwnerKt.a(viewLifecycleOwner), null, null, new MarketplaceCategoriesFragment$observeActions$1(this, null), 3);
        I1().r6();
        if (((Boolean) this.j.getD()).booleanValue()) {
            return;
        }
        FragmentMarketplaceContentBinding fragmentMarketplaceContentBinding = this.l;
        Intrinsics.e(fragmentMarketplaceContentBinding);
        fragmentMarketplaceContentBinding.L(true);
        FragmentMarketplaceContentBinding fragmentMarketplaceContentBinding2 = this.l;
        Intrinsics.e(fragmentMarketplaceContentBinding2);
        fragmentMarketplaceContentBinding2.y.setController((MarketplaceCategoriesEpoxyController) this.m.getD());
        FragmentMarketplaceContentBinding fragmentMarketplaceContentBinding3 = this.l;
        Intrinsics.e(fragmentMarketplaceContentBinding3);
        fragmentMarketplaceContentBinding3.y.setLayoutManager(new GridLayoutManager(getContext(), 2));
    }
}
