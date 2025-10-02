package au.com.woolworths.feature.rewards.offers;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.extensions.ViewExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.utils.AutoClearedValue;
import au.com.woolworths.android.onesite.utils.Extensions;
import au.com.woolworths.feature.rewards.offers.RewardsOffersContractLegacy;
import au.com.woolworths.feature.rewards.offers.analytics.RewardsOfferScreen;
import au.com.woolworths.feature.rewards.offers.databinding.FragmentRewardsOffersBinding;
import au.com.woolworths.foundation.rewards.offers.model.analytics.RewardsOffersSwrveEvent;
import au.com.woolworths.rewards.base.DeepLinkHandler;
import au.com.woolworths.rewards.base.DeferredIntentHelper;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.airbnb.epoxy.EpoxyVisibilityTracker;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/RewardsOffersFragmentLegacy;", "Landroidx/fragment/app/Fragment;", "Lau/com/woolworths/rewards/base/DeepLinkHandler;", "<init>", "()V", "Companion", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@Deprecated
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsOffersFragmentLegacy extends Hilt_RewardsOffersFragmentLegacy implements DeepLinkHandler {
    public static final /* synthetic */ KProperty[] p = {Reflection.f24268a.e(new MutablePropertyReference1Impl(RewardsOffersFragmentLegacy.class, "fragmentBinding", "getFragmentBinding()Lau/com/woolworths/feature/rewards/offers/databinding/FragmentRewardsOffersBinding;", 0))};
    public AnalyticsManager i;
    public FeatureToggleManager j;
    public RewardsAccountInteractor k;
    public final ViewModelLazy l;
    public RewardsOffersEpoxyController m;
    public final AutoClearedValue n;
    public boolean o;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/RewardsOffersFragmentLegacy$Companion;", "", "", "EXTRA_INITIAL_OFFERS_FILTER", "Ljava/lang/String;", "", "CONFETTI_SPEED", "F", "", "CONFETTI_DIRECTION", "D", "", "CONFETTI_DURATION", "J", "", "CONFETTI_SIZE", "I", "CONFETTI_POSITION_OFFSET", "CONFETTI_PARTICLES_PER_SECOND", "CONFETTI_MAX_PARTICLES", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6253a;

        static {
            int[] iArr = new int[Region.values().length];
            try {
                Region.Companion companion = Region.h;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Region.Companion companion2 = Region.h;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f6253a = iArr;
        }
    }

    public RewardsOffersFragmentLegacy() {
        final RewardsOffersFragmentLegacy$special$$inlined$viewModels$default$1 rewardsOffersFragmentLegacy$special$$inlined$viewModels$default$1 = new RewardsOffersFragmentLegacy$special$$inlined$viewModels$default$1(this);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.e, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.feature.rewards.offers.RewardsOffersFragmentLegacy$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) rewardsOffersFragmentLegacy$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.l = new ViewModelLazy(Reflection.f24268a.b(RewardsOffersViewModelLegacy.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.rewards.offers.RewardsOffersFragmentLegacy$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.rewards.offers.RewardsOffersFragmentLegacy$special$$inlined$viewModels$default$5
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
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.rewards.offers.RewardsOffersFragmentLegacy$special$$inlined$viewModels$default$4
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
        this.n = new AutoClearedValue(this);
    }

    public final FragmentRewardsOffersBinding I1() {
        return (FragmentRewardsOffersBinding) this.n.getValue(this, p[0]);
    }

    public final RewardsOffersViewModelLegacy Q1() {
        return (RewardsOffersViewModelLegacy) this.l.getD();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        Context contextRequireContext = requireContext();
        Intrinsics.g(contextRequireContext, "requireContext(...)");
        this.m = new RewardsOffersEpoxyController(contextRequireContext, Q1());
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("initial_offers_filter")) == null) {
            return;
        }
        Q1().v6(string);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        int i = FragmentRewardsOffersBinding.E;
        androidx.databinding.DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        FragmentRewardsOffersBinding fragmentRewardsOffersBinding = (FragmentRewardsOffersBinding) ViewDataBinding.q(inflater, com.woolworths.R.layout.fragment_rewards_offers, viewGroup, false, null);
        Intrinsics.g(fragmentRewardsOffersBinding, "inflate(...)");
        this.n.b(this, p[0], fragmentRewardsOffersBinding);
        FragmentRewardsOffersBinding fragmentRewardsOffersBindingI1 = I1();
        fragmentRewardsOffersBindingI1.D(getViewLifecycleOwner());
        fragmentRewardsOffersBindingI1.L(Q1());
        SwipeRefreshLayout swipeRefreshLayout = fragmentRewardsOffersBindingI1.C;
        Context contextRequireContext = requireContext();
        Intrinsics.g(contextRequireContext, "requireContext(...)");
        swipeRefreshLayout.setColorSchemeColors(Extensions.a(com.woolworths.R.attr.colorPrimary, contextRequireContext));
        EpoxyRecyclerView epoxyRecyclerView = I1().z;
        RewardsOffersEpoxyController rewardsOffersEpoxyController = this.m;
        if (rewardsOffersEpoxyController == null) {
            Intrinsics.p("epoxyController");
            throw null;
        }
        epoxyRecyclerView.setController(rewardsOffersEpoxyController);
        epoxyRecyclerView.setLayoutManager(new LinearLayoutManager(epoxyRecyclerView.getContext()));
        ViewExtKt.a(epoxyRecyclerView);
        EpoxyVisibilityTracker epoxyVisibilityTracker = new EpoxyVisibilityTracker();
        EpoxyRecyclerView contentList = I1().z;
        Intrinsics.g(contentList, "contentList");
        epoxyVisibilityTracker.a(contentList);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt.c(LifecycleOwnerKt.a(viewLifecycleOwner), null, null, new RewardsOffersFragmentLegacy$collectActions$1(this, null), 3);
        this.o = requireParentFragment().isHidden();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.g(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.a(viewLifecycleOwner2).d(new RewardsOffersFragmentLegacy$collectParentFragmentHiddenState$1(this, null));
        Q1().t.f(getViewLifecycleOwner(), new RewardsOffersFragmentLegacy$sam$androidx_lifecycle_Observer$0(new i(this, 1)));
        View view = I1().h;
        Intrinsics.g(view, "getRoot(...)");
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        Intent intent;
        super.onResume();
        RewardsOffersViewModelLegacy rewardsOffersViewModelLegacyQ1 = Q1();
        rewardsOffersViewModelLegacyQ1.h.a(RewardsOfferScreen.f);
        rewardsOffersViewModelLegacyQ1.j.b(RewardsOffersSwrveEvent.d);
        FragmentActivity activity = getActivity();
        if (activity != null && (intent = activity.getIntent()) != null) {
            Intent intentA = DeferredIntentHelper.a(intent);
            if (intentA != null) {
                intent = DeepLinkHandler.Q(intentA);
            }
            String stringExtra = intent.getStringExtra("au.com.woolworths.rewards.base.RewardsDeepLink.Extras.offersFilter");
            if (stringExtra != null) {
                Q1().v6(stringExtra);
                intent.removeExtra("au.com.woolworths.rewards.base.RewardsDeepLink.Extras.offersFilter");
            }
            String stringExtra2 = intent.getStringExtra("au.com.woolworths.rewards.base.RewardsDeepLink.Extras.sectionId");
            if (stringExtra2 != null) {
                RewardsOffersViewModelLegacy rewardsOffersViewModelLegacyQ12 = Q1();
                RewardsOffersContractLegacy.ViewState viewState = (RewardsOffersContractLegacy.ViewState) rewardsOffersViewModelLegacyQ12.t.e();
                if ((viewState != null ? viewState.c : null) == null) {
                    rewardsOffersViewModelLegacyQ12.v = stringExtra2;
                } else {
                    rewardsOffersViewModelLegacyQ12.p6(stringExtra2);
                }
                intent.removeExtra("au.com.woolworths.rewards.base.RewardsDeepLink.Extras.sectionId");
            }
        }
        Q1().u = true;
        if (this.o) {
            return;
        }
        RewardsOffersViewModelLegacy rewardsOffersViewModelLegacyQ13 = Q1();
        if (rewardsOffersViewModelLegacyQ13.u) {
            rewardsOffersViewModelLegacyQ13.t6();
        }
    }
}
