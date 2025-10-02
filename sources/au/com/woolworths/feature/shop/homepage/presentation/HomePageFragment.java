package au.com.woolworths.feature.shop.homepage.presentation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.material.pullrefresh.PullRefreshStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.core.content.ContextCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.FirebasePerfMonitor;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.home.models.RegistrationTileData;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.base.shopapp.epoxy.HorizontalListActionState;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.compose.utils.modifier.WaveBackgroundModifierKt;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.shop.contentpage.ContentPageContract;
import au.com.woolworths.feature.shop.contentpage.ContentPageContractKt;
import au.com.woolworths.feature.shop.contentpage.ContentPageViewModel;
import au.com.woolworths.feature.shop.contentpage.data.HorizontalListData;
import au.com.woolworths.feature.shop.contentpage.data.HorizontalListTrailingLinkData;
import au.com.woolworths.feature.shop.contentpage.ui.ContentPageScreenKt;
import au.com.woolworths.feature.shop.homepage.HomeFeature;
import au.com.woolworths.feature.shop.homepage.data.BoosterHorizontalListData;
import au.com.woolworths.feature.shop.homepage.data.ChatEntryCardV2;
import au.com.woolworths.feature.shop.homepage.data.FulfilmentStatusBannerData;
import au.com.woolworths.feature.shop.homepage.data.MyShoppingListsData;
import au.com.woolworths.feature.shop.homepage.data.OrderCardData;
import au.com.woolworths.feature.shop.homepage.data.RewardsBalanceCardData;
import au.com.woolworths.feature.shop.homepage.databinding.FragmentHomePageBinding;
import au.com.woolworths.feature.shop.homepage.domain.HeroBannerInteractor;
import au.com.woolworths.feature.shop.homepage.presentation.HomePageContract;
import au.com.woolworths.feature.shop.homepage.presentation.carousel.ProductCarouselUiKt;
import au.com.woolworths.feature.shop.homepage.presentation.chatentrycard.ChatEntryCardV2Kt;
import au.com.woolworths.feature.shop.homepage.presentation.lists.MyListsKt;
import au.com.woolworths.feature.shop.homepage.presentation.rewards.RegistrationCardUIKt;
import au.com.woolworths.feature.shop.homepage.presentation.rewards.RewardsBalanceCardUiKt;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.editorder.EditOrderInteractor;
import au.com.woolworths.foundation.shop.editorder.ui.EditOrderBannerView;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdPlayerState;
import au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment;
import au.com.woolworths.product.infoview.ProductInfoViewFactory;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.sdui.legacy.scrollablelist.ScrollableListActionState;
import au.com.woolworths.sdui.legacy.scrollablelist.ScrollableListUiKt;
import au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment;
import au.com.woolworths.shop.addtolist.models.AddToListProductParameters;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageFragment;", "Landroidx/fragment/app/Fragment;", "Lau/com/woolworths/feature/shop/homepage/presentation/NavigationAction;", "Lau/com/woolworths/feature/shop/homepage/presentation/OnboardingCoachMarksHandler;", "<init>", "()V", "HomeCoachMarkHost", "Companion", "Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$ViewState;", "viewState", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class HomePageFragment extends Hilt_HomePageFragment implements NavigationAction, OnboardingCoachMarksHandler {
    public final ViewModelLazy i;
    public final ViewModelLazy j;
    public FragmentHomePageBinding k;
    public HomeController l;
    public AnalyticsManager m;
    public FeatureToggleManager n;
    public CollectionModeInteractor o;
    public ShopAppNavigator p;
    public FirebasePerfMonitor q;
    public EditOrderInteractor r;
    public HeroBannerInteractor s;
    public boolean t;
    public Function0 u;
    public final HomePageFragment$bottomsheetLifecycleCallbacks$1 v;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageFragment$Companion;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageFragment$HomeCoachMarkHost;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface HomeCoachMarkHost {
        MenuItem m4();
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[HomePageContract.CoachMarkAnchor.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                HomePageContract.CoachMarkAnchor coachMarkAnchor = HomePageContract.CoachMarkAnchor.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [au.com.woolworths.feature.shop.homepage.presentation.HomePageFragment$bottomsheetLifecycleCallbacks$1] */
    public HomePageFragment() {
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.i = new ViewModelLazy(reflectionFactory.b(HomePageViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.HomePageFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getD();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.HomePageFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.HomePageFragment$special$$inlined$activityViewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getDefaultViewModelCreationExtras();
            }
        });
        final HomePageFragment$special$$inlined$viewModels$default$1 homePageFragment$special$$inlined$viewModels$default$1 = new HomePageFragment$special$$inlined$viewModels$default$1(this);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.e, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.HomePageFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) homePageFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.j = new ViewModelLazy(reflectionFactory.b(ContentPageViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.HomePageFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getD();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.HomePageFragment$special$$inlined$viewModels$default$5
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
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.HomePageFragment$special$$inlined$viewModels$default$4
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
        this.v = new FragmentManager.FragmentLifecycleCallbacks() { // from class: au.com.woolworths.feature.shop.homepage.presentation.HomePageFragment$bottomsheetLifecycleCallbacks$1
            @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
            public final void a(FragmentManager fragmentManager, Fragment f, FragmentActivity context) {
                Intrinsics.h(f, "f");
                Intrinsics.h(context, "context");
                this.f7240a.n2(true);
            }

            @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
            public final void b(FragmentManager fragmentManager, Fragment f) {
                Intrinsics.h(f, "f");
                this.f7240a.n2(false);
            }
        };
    }

    @Override // au.com.woolworths.feature.shop.homepage.presentation.OnboardingCoachMarksHandler
    public final void D0() {
        h2().z = true;
    }

    public final void I1(ChatEntryCardV2 chatEntryCardV2, Function1 function1, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(945274236);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(chatEntryCardV2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function1) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = AnimatableKt.a(0.3f);
                composerImplV.A(objG);
            }
            Animatable animatable = (Animatable) objG;
            Object objD = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
            if (objD == composer$Companion$Empty$1) {
                objD = AnimatableKt.a(BitmapDescriptorFactory.HUE_RED);
                composerImplV.A(objD);
            }
            Animatable animatable2 = (Animatable) objD;
            Object objD2 = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
            if (objD2 == composer$Companion$Empty$1) {
                objD2 = SnapshotStateKt.f(Boolean.TRUE);
                composerImplV.A(objD2);
            }
            composerImplV.V(false);
            float f = 16;
            Modifier modifierE = SizeKt.e(PaddingKt.g(Modifier.Companion.d, f, f), 1.0f);
            WaveBackgroundModifierKt.b((MutableState) objD2, animatable, animatable2, f, modifierE, ChatEntryCardV2Kt.c(chatEntryCardV2, function1, modifierE, composerImplV), composerImplV, 28230);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.c(this, chatEntryCardV2, function1, i, 13);
        }
    }

    public final void Q1(int i, Composer composer, final Object obj) {
        Object next;
        HorizontalListActionState horizontalListActionState;
        ComposerImpl composerImplV = composer.v(-440594849);
        int i2 = (i & 6) == 0 ? (composerImplV.I(obj) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(this) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            MutableState mutableStateA = androidx.lifecycle.compose.FlowExtKt.a(h2().I, composerImplV);
            boolean z = obj instanceof RewardsBalanceCardData;
            Modifier.Companion companion = Modifier.Companion.d;
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (z) {
                composerImplV.o(-340850940);
                Modifier modifierH = PaddingKt.h(PaddingKt.h(companion, 16, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, 12, 1);
                RewardsBalanceCardData rewardsBalanceCardData = (RewardsBalanceCardData) obj;
                composerImplV.o(5004770);
                boolean zI = composerImplV.I(this);
                Object objG = composerImplV.G();
                if (zI || objG == composer$Companion$Empty$1) {
                    objG = new g(this, 2);
                    composerImplV.A(objG);
                }
                Function0 function0 = (Function0) objG;
                composerImplV.V(false);
                composerImplV.o(-1633490746);
                boolean zI2 = composerImplV.I(this) | composerImplV.I(obj);
                Object objG2 = composerImplV.G();
                if (zI2 || objG2 == composer$Companion$Empty$1) {
                    objG2 = new h(this, obj, 0);
                    composerImplV.A(objG2);
                }
                Function0 function02 = (Function0) objG2;
                composerImplV.V(false);
                composerImplV.o(5004770);
                boolean zI3 = composerImplV.I(this);
                Object objG3 = composerImplV.G();
                if (zI3 || objG3 == composer$Companion$Empty$1) {
                    objG3 = new g(this, 3);
                    composerImplV.A(objG3);
                }
                Function0 function03 = (Function0) objG3;
                composerImplV.V(false);
                composerImplV.o(5004770);
                boolean zI4 = composerImplV.I(this);
                Object objG4 = composerImplV.G();
                if (zI4 || objG4 == composer$Companion$Empty$1) {
                    objG4 = new g(this, 4);
                    composerImplV.A(objG4);
                }
                composerImplV.V(false);
                RewardsBalanceCardUiKt.c(rewardsBalanceCardData, function0, function02, function03, (Function0) objG4, modifierH, composerImplV, 196608, 0);
                composerImplV.V(false);
            } else if (obj instanceof RegistrationTileData) {
                composerImplV.o(-340218757);
                HomePageViewModel homePageViewModelH2 = h2();
                composerImplV.o(5004770);
                boolean zI5 = composerImplV.I(homePageViewModelH2);
                Object objG5 = composerImplV.G();
                if (zI5 || objG5 == composer$Companion$Empty$1) {
                    objG5 = new HomePageFragment$ProcessHomeContentPageFeed$5$1(0, homePageViewModelH2, HomePageViewModel.class, "onLogInClicked", "onLogInClicked()V", 0);
                    composerImplV.A(objG5);
                }
                KFunction kFunction = (KFunction) objG5;
                composerImplV.V(false);
                HomePageViewModel homePageViewModelH22 = h2();
                composerImplV.o(5004770);
                boolean zI6 = composerImplV.I(homePageViewModelH22);
                Object objG6 = composerImplV.G();
                if (zI6 || objG6 == composer$Companion$Empty$1) {
                    objG6 = new HomePageFragment$ProcessHomeContentPageFeed$6$1(0, homePageViewModelH22, HomePageViewModel.class, "onSignUpClicked", "onSignUpClicked()V", 0);
                    composerImplV.A(objG6);
                }
                composerImplV.V(false);
                RegistrationCardUIKt.a((Function0) kFunction, (Function0) ((KFunction) objG6), companion, composerImplV, KyberEngine.KyberPolyBytes, 0);
                composerImplV.V(false);
            } else if (obj instanceof ChatEntryCardV2) {
                composerImplV.o(-339924226);
                ChatEntryCardV2 chatEntryCardV2 = (ChatEntryCardV2) obj;
                HomePageViewModel homePageViewModelH23 = h2();
                composerImplV.o(5004770);
                boolean zI7 = composerImplV.I(homePageViewModelH23);
                Object objG7 = composerImplV.G();
                if (zI7 || objG7 == composer$Companion$Empty$1) {
                    objG7 = new HomePageFragment$ProcessHomeContentPageFeed$7$1(1, homePageViewModelH23, HomePageViewModel.class, "onCtaClick", "onCtaClick(Lau/com/woolworths/feature/shop/homepage/data/ChatEntryCardCta;)V", 0);
                    composerImplV.A(objG7);
                }
                composerImplV.V(false);
                I1(chatEntryCardV2, (Function1) ((KFunction) objG7), composerImplV, (i2 << 3) & 896);
                composerImplV.V(false);
            } else if (obj instanceof MyShoppingListsData) {
                composerImplV.o(1790156872);
                MyShoppingListsData myShoppingListsData = (MyShoppingListsData) obj;
                HomePageViewModel homePageViewModelH24 = h2();
                composerImplV.o(5004770);
                boolean zI8 = composerImplV.I(homePageViewModelH24);
                Object objG8 = composerImplV.G();
                if (zI8 || objG8 == composer$Companion$Empty$1) {
                    objG8 = new HomePageFragment$ProcessHomeContentPageFeed$8$1(1, homePageViewModelH24, HomePageViewModel.class, "onMyShoppingListsActionClicked", "onMyShoppingListsActionClicked(Lau/com/woolworths/feature/shop/homepage/data/MyShoppingListsData;)V", 0);
                    composerImplV.A(objG8);
                }
                composerImplV.V(false);
                Function1 function1 = (Function1) ((KFunction) objG8);
                HomePageViewModel homePageViewModelH25 = h2();
                composerImplV.o(5004770);
                boolean zI9 = composerImplV.I(homePageViewModelH25);
                Object objG9 = composerImplV.G();
                if (zI9 || objG9 == composer$Companion$Empty$1) {
                    objG9 = new HomePageFragment$ProcessHomeContentPageFeed$9$1(1, homePageViewModelH25, HomePageViewModel.class, "onMyShoppingListItemClicked", "onMyShoppingListItemClicked(Lau/com/woolworths/feature/shop/homepage/data/MyShoppingListItemData;)V", 0);
                    composerImplV.A(objG9);
                }
                composerImplV.V(false);
                Function1 function12 = (Function1) ((KFunction) objG9);
                HomePageViewModel homePageViewModelH26 = h2();
                composerImplV.o(5004770);
                boolean zI10 = composerImplV.I(homePageViewModelH26);
                Object objG10 = composerImplV.G();
                if (zI10 || objG10 == composer$Companion$Empty$1) {
                    objG10 = new HomePageFragment$ProcessHomeContentPageFeed$10$1(0, homePageViewModelH26, HomePageViewModel.class, "onBuyAgainListItemClicked", "onBuyAgainListItemClicked()V", 0);
                    composerImplV.A(objG10);
                }
                composerImplV.V(false);
                MyListsKt.a(myShoppingListsData, function1, function12, (Function0) ((KFunction) objG10), PaddingKt.h(PaddingKt.h(companion, 8, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, 16, 1), composerImplV, 24576);
                composerImplV.V(false);
            } else if (obj instanceof BoosterHorizontalListData) {
                composerImplV.o(-339205863);
                Modifier modifierH2 = PaddingKt.h(companion, BitmapDescriptorFactory.HUE_RED, 16, 1);
                BoosterHorizontalListData boosterHorizontalListData = (BoosterHorizontalListData) obj;
                HomePageContract.ViewState viewState = (HomePageContract.ViewState) mutableStateA.getD();
                if (viewState == null || (horizontalListActionState = viewState.e) == null) {
                    horizontalListActionState = HorizontalListActionState.d;
                }
                HomePageViewModel homePageViewModelH27 = h2();
                LazyListState lazyListStateA = LazyListStateKt.a(0, 0, 3, composerImplV);
                HomePageViewModel homePageViewModelH28 = h2();
                CollectionModeInteractor collectionModeInteractor = this.o;
                if (collectionModeInteractor == null) {
                    Intrinsics.p("collectionModeInteractor");
                    throw null;
                }
                ProductCardConfig productCardConfig = new ProductCardConfig(collectionModeInteractor.b(), true, false, h2().u.c(HomeFeature.i), false, false, null, 116, null);
                HomePageContract.ViewState viewState2 = (HomePageContract.ViewState) mutableStateA.getD();
                List list = viewState2 != null ? viewState2.h : null;
                if (list == null) {
                    list = EmptyList.d;
                }
                ProductCarouselUiKt.a(boosterHorizontalListData, lazyListStateA, horizontalListActionState, homePageViewModelH27, homePageViewModelH28, productCardConfig, true, list, modifierH2, composerImplV, (ProductCardConfig.$stable << 15) | 102236160);
                composerImplV.V(false);
            } else if (obj instanceof HorizontalListData) {
                composerImplV.o(-338419145);
                composerImplV.o(1849434622);
                Object objG11 = composerImplV.G();
                if (objG11 == composer$Companion$Empty$1) {
                    List h = ((HorizontalListData) obj).getH();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : h) {
                        if (obj2 instanceof OrderCardData) {
                            arrayList.add(obj2);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (((OrderCardData) next).j != null) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    OrderCardData orderCardData = (OrderCardData) next;
                    objG11 = orderCardData != null ? orderCardData.j : null;
                    composerImplV.A(objG11);
                }
                final FulfilmentStatusBannerData fulfilmentStatusBannerData = (FulfilmentStatusBannerData) objG11;
                composerImplV.V(false);
                ThemeKt.b(6, composerImplV, ComposableLambdaKt.c(-343082214, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.HomePageFragment$ProcessHomeContentPageFeed$11
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        Composer composer2 = (Composer) obj3;
                        if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            Modifier modifierH3 = PaddingKt.h(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, 12, 1);
                            final Object obj5 = obj;
                            HorizontalListData horizontalListData = (HorizontalListData) obj5;
                            String d = horizontalListData.getD();
                            String e = horizontalListData.getE();
                            HorizontalListTrailingLinkData horizontalListTrailingLink = horizontalListData.getHorizontalListTrailingLink();
                            String str = horizontalListTrailingLink != null ? horizontalListTrailingLink.c.f10170a : null;
                            HorizontalListTrailingLinkData horizontalListTrailingLink2 = horizontalListData.getHorizontalListTrailingLink();
                            String action = horizontalListTrailingLink2 != null ? horizontalListTrailingLink2.b.getAction() : null;
                            ScrollableListActionState scrollableListActionState = (action == null || action.length() == 0) ? ScrollableListActionState.f : ScrollableListActionState.d;
                            composer2.o(-1633490746);
                            final HomePageFragment homePageFragment = this;
                            boolean zI11 = composer2.I(homePageFragment) | composer2.I(obj5);
                            Object objG12 = composer2.G();
                            if (zI11 || objG12 == Composer.Companion.f1624a) {
                                objG12 = new h(homePageFragment, obj5, 1);
                                composer2.A(objG12);
                            }
                            composer2.l();
                            final FulfilmentStatusBannerData fulfilmentStatusBannerData2 = fulfilmentStatusBannerData;
                            ScrollableListUiKt.c(d, e, str, (Function0) objG12, scrollableListActionState, modifierH3, false, ComposableLambdaKt.c(-1156641913, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.HomePageFragment$ProcessHomeContentPageFeed$11.2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj6, Object obj7) {
                                    Composer composer3 = (Composer) obj6;
                                    if ((((Number) obj7).intValue() & 3) == 2 && composer3.c()) {
                                        composer3.j();
                                    } else {
                                        LazyListState lazyListStateA2 = LazyListStateKt.a(0, 0, 3, composer3);
                                        Modifier modifierJ = PaddingKt.j(SizeKt.e(Modifier.Companion.d, 1.0f), BitmapDescriptorFactory.HUE_RED, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
                                        PaddingValuesImpl paddingValuesImplA = PaddingKt.a(10, BitmapDescriptorFactory.HUE_RED, 2);
                                        composer3.o(-1746271574);
                                        Object obj8 = obj5;
                                        boolean zI12 = composer3.I(obj8);
                                        HomePageFragment homePageFragment2 = homePageFragment;
                                        boolean zI13 = zI12 | composer3.I(homePageFragment2);
                                        Object objG13 = composer3.G();
                                        if (zI13 || objG13 == Composer.Companion.f1624a) {
                                            objG13 = new c(1, obj8, homePageFragment2, fulfilmentStatusBannerData2);
                                            composer3.A(objG13);
                                        }
                                        composer3.l();
                                        LazyDslKt.d(modifierJ, lazyListStateA2, paddingValuesImplA, false, null, null, null, false, null, (Function1) objG13, composer3, 390, 504);
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer2), composer2, 12779520, 64);
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV));
                composerImplV.V(false);
            } else {
                composerImplV.o(-335537757);
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.healthylifefoodtracker.ui.h(this, i, 1, obj);
        }
    }

    public final ContentPageViewModel R1() {
        return (ContentPageViewModel) this.j.getD();
    }

    public final FeatureToggleManager b2() {
        FeatureToggleManager featureToggleManager = this.n;
        if (featureToggleManager != null) {
            return featureToggleManager;
        }
        Intrinsics.p("featureToggleManager");
        throw null;
    }

    public final HomePageViewModel h2() {
        return (HomePageViewModel) this.i.getD();
    }

    public final void i2(Screen screen, ProductCard productCard) {
        if (screen != null) {
            AddToListBottomSheetFragment.Companion.a(getParentFragmentManager(), null, screen, CollectionsKt.Q(new AddToListProductParameters(productCard, (String) null, (Float) null, productCard.getProductVarieties() != null, 14)), null, new ProductInfoViewFactory(productCard), true, null, null, 914);
        }
    }

    public final void m2(Screen screen, ProductCard productCard) {
        if (screen != null) {
            AddToCartBottomSheetFragment.Companion.a(getParentFragmentManager(), new AddToCartBottomSheetFragment.Extras(productCard, false, screen));
        }
    }

    public final void n2(boolean z) {
        if (b2().c(HomeFeature.h)) {
            R1().F6(VideoAdPlayerState.a(((ContentPageContract.ViewState) R1().s.getValue()).k, false, false, 0L, z, false, BitmapDescriptorFactory.HUE_RED, 55));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        HomePageViewModel homePageViewModelH2 = h2();
        FeatureToggleManager featureToggleManagerB2 = b2();
        CollectionModeInteractor collectionModeInteractor = this.o;
        if (collectionModeInteractor == null) {
            Intrinsics.p("collectionModeInteractor");
            throw null;
        }
        HeroBannerInteractor heroBannerInteractor = this.s;
        if (heroBannerInteractor == null) {
            Intrinsics.p("heroBannerInteractor");
            throw null;
        }
        this.l = new HomeController(homePageViewModelH2, featureToggleManagerB2, collectionModeInteractor, heroBannerInteractor);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new HomePageFragment$observeActions$1(this, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        int i = FragmentHomePageBinding.H;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        FragmentHomePageBinding fragmentHomePageBinding = (FragmentHomePageBinding) ViewDataBinding.q(inflater, R.layout.fragment_home_page, viewGroup, false, null);
        this.k = fragmentHomePageBinding;
        if (fragmentHomePageBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentHomePageBinding.D(getViewLifecycleOwner());
        EpoxyRecyclerView epoxyRecyclerView = fragmentHomePageBinding.E;
        HomeController homeController = this.l;
        if (homeController == null) {
            Intrinsics.p("homeController");
            throw null;
        }
        epoxyRecyclerView.setController(homeController);
        fragmentHomePageBinding.L(h2());
        fragmentHomePageBinding.F.setColorSchemeColors(requireContext().getColor(R.color.color_accent));
        EditOrderBannerView editOrderBannerView = fragmentHomePageBinding.B;
        KeyEventDispatcher.Component activity = getActivity();
        Intrinsics.f(activity, "null cannot be cast to non-null type au.com.woolworths.feature.shop.homepage.presentation.HomePageContract.MainAndHomeBridging");
        editOrderBannerView.setEvenHandler(((HomePageContract.MainAndHomeBridging) activity).o2());
        ComposeView composeView = fragmentHomePageBinding.z;
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.f1986a);
        composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.HomePageFragment$onCreateView$1$1$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final HomePageFragment homePageFragment = this.d;
                    boolean zB = ContentPageContractKt.b((ContentPageContract.ViewState) SnapshotStateKt.a(homePageFragment.R1().s, composer).getD());
                    HomePageViewModel homePageViewModelH2 = homePageFragment.h2();
                    composer.o(5004770);
                    boolean zI = composer.I(homePageViewModelH2);
                    Object objG = composer.G();
                    if (zI || objG == Composer.Companion.f1624a) {
                        HomePageFragment$onCreateView$1$1$1$pullRefreshState$1$1 homePageFragment$onCreateView$1$1$1$pullRefreshState$1$1 = new HomePageFragment$onCreateView$1$1$1$pullRefreshState$1$1(0, homePageViewModelH2, HomePageViewModel.class, "fetchHomePage", "fetchHomePage()V", 0);
                        composer.A(homePageFragment$onCreateView$1$1$1$pullRefreshState$1$1);
                        objG = homePageFragment$onCreateView$1$1$1$pullRefreshState$1$1;
                    }
                    composer.l();
                    final PullRefreshState pullRefreshStateA = PullRefreshStateKt.a(zB, (Function0) ((KFunction) objG), composer, 0);
                    final LazyListState lazyListStateA = LazyListStateKt.a(0, 0, 3, composer);
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(-1118383063, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.HomePageFragment$onCreateView$1$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            float f;
                            Flow flow;
                            int i2;
                            MutableState mutableState;
                            Composer$Companion$Empty$1 composer$Companion$Empty$1;
                            au.com.woolworths.feature.shop.contentpage.c cVar;
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                final HomePageFragment homePageFragment2 = homePageFragment;
                                MutableState mutableStateA = SnapshotStateKt.a(homePageFragment2.R1().s, composer2);
                                Flow flow2 = homePageFragment2.R1().r;
                                ContentPageViewModel contentPageViewModelR1 = homePageFragment2.R1();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(contentPageViewModelR1);
                                Object objG2 = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
                                if (zI2 || objG2 == composer$Companion$Empty$12) {
                                    HomePageFragment$onCreateView$1$1$1$1$1$1 homePageFragment$onCreateView$1$1$1$1$1$1 = new HomePageFragment$onCreateView$1$1$1$1$1$1(2, contentPageViewModelR1, ContentPageViewModel.class, "onVerticalListItemClick", "onVerticalListItemClick(Lau/com/woolworths/shop/aem/components/model/verticallist/VerticalListData;Lau/com/woolworths/shop/aem/components/model/verticallist/VerticalListItem;)V", 0);
                                    composer2.A(homePageFragment$onCreateView$1$1$1$1$1$1);
                                    objG2 = homePageFragment$onCreateView$1$1$1$1$1$1;
                                }
                                KFunction kFunction = (KFunction) objG2;
                                composer2.l();
                                ContentPageViewModel contentPageViewModelR12 = homePageFragment2.R1();
                                composer2.o(5004770);
                                boolean zI3 = composer2.I(contentPageViewModelR12);
                                Object objG3 = composer2.G();
                                if (zI3 || objG3 == composer$Companion$Empty$12) {
                                    HomePageFragment$onCreateView$1$1$1$1$2$1 homePageFragment$onCreateView$1$1$1$1$2$1 = new HomePageFragment$onCreateView$1$1$1$1$2$1(1, contentPageViewModelR12, ContentPageViewModel.class, "onHorizontalListVisibilityUpdate", "onHorizontalListVisibilityUpdate(Ljava/util/Set;)V", 0);
                                    composer2.A(homePageFragment$onCreateView$1$1$1$1$2$1);
                                    objG3 = homePageFragment$onCreateView$1$1$1$1$2$1;
                                }
                                KFunction kFunction2 = (KFunction) objG3;
                                composer2.l();
                                ContentPageViewModel contentPageViewModelR13 = homePageFragment2.R1();
                                composer2.o(5004770);
                                boolean zI4 = composer2.I(contentPageViewModelR13);
                                Object objG4 = composer2.G();
                                if (zI4 || objG4 == composer$Companion$Empty$12) {
                                    HomePageFragment$onCreateView$1$1$1$1$3$1 homePageFragment$onCreateView$1$1$1$1$3$1 = new HomePageFragment$onCreateView$1$1$1$1$3$1(2, contentPageViewModelR13, ContentPageViewModel.class, "onHorizontalListItemVisibilityImpression", "onHorizontalListItemVisibilityImpression(Lau/com/woolworths/feature/shop/contentpage/data/HorizontalListData;I)V", 0);
                                    composer2.A(homePageFragment$onCreateView$1$1$1$1$3$1);
                                    objG4 = homePageFragment$onCreateView$1$1$1$1$3$1;
                                }
                                KFunction kFunction3 = (KFunction) objG4;
                                composer2.l();
                                ContentPageViewModel contentPageViewModelR14 = homePageFragment2.R1();
                                composer2.o(5004770);
                                boolean zI5 = composer2.I(contentPageViewModelR14);
                                Object objG5 = composer2.G();
                                if (zI5 || objG5 == composer$Companion$Empty$12) {
                                    HomePageFragment$onCreateView$1$1$1$1$4$1 homePageFragment$onCreateView$1$1$1$1$4$1 = new HomePageFragment$onCreateView$1$1$1$1$4$1(1, contentPageViewModelR14, ContentPageViewModel.class, "onDynamicSizeCardImpression", "onDynamicSizeCardImpression(Lau/com/woolworths/sdui/shop/dynamicsizecard/DynamicSizeCardData;)V", 0);
                                    composer2.A(homePageFragment$onCreateView$1$1$1$1$4$1);
                                    objG5 = homePageFragment$onCreateView$1$1$1$1$4$1;
                                }
                                KFunction kFunction4 = (KFunction) objG5;
                                composer2.l();
                                ContentPageViewModel contentPageViewModelR15 = homePageFragment2.R1();
                                float f2 = 0;
                                ContentPageViewModel contentPageViewModelR16 = homePageFragment2.R1();
                                composer2.o(5004770);
                                boolean zI6 = composer2.I(contentPageViewModelR16);
                                Object objG6 = composer2.G();
                                if (zI6 || objG6 == composer$Companion$Empty$12) {
                                    objG6 = new HomePageFragment$onCreateView$1$1$1$1$5$1(1, contentPageViewModelR16, ContentPageViewModel.class, "processActivityResult", "processActivityResult(Landroidx/activity/result/ActivityResult;)V", 0);
                                    composer2.A(objG6);
                                }
                                KFunction kFunction5 = (KFunction) objG6;
                                composer2.l();
                                ContentPageViewModel contentPageViewModelR17 = homePageFragment2.R1();
                                composer2.o(5004770);
                                boolean zI7 = composer2.I(contentPageViewModelR17);
                                Object objG7 = composer2.G();
                                if (zI7 || objG7 == composer$Companion$Empty$12) {
                                    objG7 = new HomePageFragment$onCreateView$1$1$1$1$6$1(1, contentPageViewModelR17, ContentPageViewModel.class, "onEditorialBannerClick", "onEditorialBannerClick(Lau/com/woolworths/shop/aem/components/model/editorialbanner/EditorialBannerData;)V", 0);
                                    composer2.A(objG7);
                                }
                                KFunction kFunction6 = (KFunction) objG7;
                                composer2.l();
                                ContentPageViewModel contentPageViewModelR18 = homePageFragment2.R1();
                                composer2.o(5004770);
                                boolean zI8 = composer2.I(contentPageViewModelR18);
                                Object objG8 = composer2.G();
                                if (zI8 || objG8 == composer$Companion$Empty$12) {
                                    objG8 = new HomePageFragment$onCreateView$1$1$1$1$7$1(1, contentPageViewModelR18, ContentPageViewModel.class, "onHeroBannerClick", "onHeroBannerClick(Lau/com/woolworths/shop/aem/components/model/herobanner/HeroBanner;)V", 0);
                                    composer2.A(objG8);
                                }
                                KFunction kFunction7 = (KFunction) objG8;
                                composer2.l();
                                ContentPageViewModel contentPageViewModelR19 = homePageFragment2.R1();
                                composer2.o(5004770);
                                boolean zI9 = composer2.I(contentPageViewModelR19);
                                Object objG9 = composer2.G();
                                if (zI9 || objG9 == composer$Companion$Empty$12) {
                                    objG9 = new HomePageFragment$onCreateView$1$1$1$1$8$1(1, contentPageViewModelR19, ContentPageViewModel.class, "onHeroBannerTermsAndConditionClick", "onHeroBannerTermsAndConditionClick(Lau/com/woolworths/shop/aem/components/model/herobanner/HeroBanner;)V", 0);
                                    composer2.A(objG9);
                                }
                                KFunction kFunction8 = (KFunction) objG9;
                                composer2.l();
                                ContentPageViewModel contentPageViewModelR110 = homePageFragment2.R1();
                                composer2.o(5004770);
                                boolean zI10 = composer2.I(contentPageViewModelR110);
                                Object objG10 = composer2.G();
                                if (zI10 || objG10 == composer$Companion$Empty$12) {
                                    objG10 = new HomePageFragment$onCreateView$1$1$1$1$9$1(1, contentPageViewModelR110, ContentPageViewModel.class, "onBroadcastBannerClicked", "onBroadcastBannerClicked(Lau/com/woolworths/foundation/shop/banners/broadcastbanner/data/BroadcastBannerData;)V", 0);
                                    composer2.A(objG10);
                                }
                                KFunction kFunction9 = (KFunction) objG10;
                                composer2.l();
                                HomePageViewModel homePageViewModelH22 = homePageFragment2.h2();
                                composer2.o(5004770);
                                boolean zI11 = composer2.I(homePageViewModelH22);
                                Object objG11 = composer2.G();
                                if (zI11 || objG11 == composer$Companion$Empty$12) {
                                    objG11 = new HomePageFragment$onCreateView$1$1$1$1$10$1(1, homePageViewModelH22, HomePageViewModel.class, "onBannerDismissClicked", "onBannerDismissClicked(Lau/com/woolworths/foundation/shop/banners/broadcastbanner/data/BroadcastBannerData;)V", 0);
                                    composer2.A(objG11);
                                }
                                KFunction kFunction10 = (KFunction) objG11;
                                composer2.l();
                                ContentPageViewModel contentPageViewModelR111 = homePageFragment2.R1();
                                composer2.o(5004770);
                                boolean zI12 = composer2.I(contentPageViewModelR111);
                                Object objG12 = composer2.G();
                                if (zI12 || objG12 == composer$Companion$Empty$12) {
                                    objG12 = new HomePageFragment$onCreateView$1$1$1$1$11$1(1, contentPageViewModelR111, ContentPageViewModel.class, "onVideoAdPlayerStateChanged", "onVideoAdPlayerStateChanged(Lau/com/woolworths/foundation/shop/video/advertising/data/VideoAdPlayerState;)V", 0);
                                    composer2.A(objG12);
                                }
                                KFunction kFunction11 = (KFunction) objG12;
                                composer2.l();
                                ContentPageViewModel contentPageViewModelR112 = homePageFragment2.R1();
                                composer2.o(5004770);
                                boolean zI13 = composer2.I(contentPageViewModelR112);
                                Object objG13 = composer2.G();
                                if (zI13 || objG13 == composer$Companion$Empty$12) {
                                    objG13 = new HomePageFragment$onCreateView$1$1$1$1$12$1(1, contentPageViewModelR112, ContentPageViewModel.class, "onVideoAdAnalyticsEvent", "onVideoAdAnalyticsEvent(Lau/com/woolworths/analytics/model/AnalyticsData;)V", 0);
                                    composer2.A(objG13);
                                }
                                KFunction kFunction12 = (KFunction) objG13;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI14 = composer2.I(homePageFragment2);
                                Object objG14 = composer2.G();
                                if (zI14 || objG14 == composer$Companion$Empty$12) {
                                    f = f2;
                                    flow = flow2;
                                    i2 = 5004770;
                                    mutableState = mutableStateA;
                                    composer$Companion$Empty$1 = composer$Companion$Empty$12;
                                    HomePageFragment$onCreateView$1$1$1$1$13$1 homePageFragment$onCreateView$1$1$1$1$13$1 = new HomePageFragment$onCreateView$1$1$1$1$13$1(1, homePageFragment2, HomePageFragment.class, "launchProductDetails", "launchProductDetails(Ljava/lang/String;)V", 0);
                                    composer2.A(homePageFragment$onCreateView$1$1$1$1$13$1);
                                    objG14 = homePageFragment$onCreateView$1$1$1$1$13$1;
                                } else {
                                    mutableState = mutableStateA;
                                    f = f2;
                                    composer$Companion$Empty$1 = composer$Companion$Empty$12;
                                    flow = flow2;
                                    i2 = 5004770;
                                }
                                KFunction kFunction13 = (KFunction) objG14;
                                composer2.l();
                                composer2.o(i2);
                                boolean zI15 = composer2.I(homePageFragment2);
                                Object objG15 = composer2.G();
                                if (zI15 || objG15 == composer$Companion$Empty$1) {
                                    HomePageFragment$onCreateView$1$1$1$1$14$1 homePageFragment$onCreateView$1$1$1$1$14$1 = new HomePageFragment$onCreateView$1$1$1$1$14$1(2, homePageFragment2, HomePageFragment.class, "launchListBottomSheet", "launchListBottomSheet(Lau/com/woolworths/android/onesite/analytics/Screen;Lau/com/woolworths/product/models/ProductCard;)V", 0);
                                    composer2.A(homePageFragment$onCreateView$1$1$1$1$14$1);
                                    objG15 = homePageFragment$onCreateView$1$1$1$1$14$1;
                                }
                                KFunction kFunction14 = (KFunction) objG15;
                                composer2.l();
                                composer2.o(i2);
                                boolean zI16 = composer2.I(homePageFragment2);
                                Object objG16 = composer2.G();
                                if (zI16 || objG16 == composer$Companion$Empty$1) {
                                    HomePageFragment$onCreateView$1$1$1$1$15$1 homePageFragment$onCreateView$1$1$1$1$15$1 = new HomePageFragment$onCreateView$1$1$1$1$15$1(2, homePageFragment2, HomePageFragment.class, "launchProductBottomSheet", "launchProductBottomSheet(Lau/com/woolworths/android/onesite/analytics/Screen;Lau/com/woolworths/product/models/ProductCard;)V", 0);
                                    composer2.A(homePageFragment$onCreateView$1$1$1$1$15$1);
                                    objG16 = homePageFragment$onCreateView$1$1$1$1$15$1;
                                }
                                KFunction kFunction15 = (KFunction) objG16;
                                composer2.l();
                                composer2.o(i2);
                                boolean zI17 = composer2.I(homePageFragment2);
                                Object objG17 = composer2.G();
                                if (zI17 || objG17 == composer$Companion$Empty$1) {
                                    HomePageFragment$onCreateView$1$1$1$1$16$1 homePageFragment$onCreateView$1$1$1$1$16$1 = new HomePageFragment$onCreateView$1$1$1$1$16$1(1, homePageFragment2, HomePageFragment.class, "launchVideoAdBottomSheet", "launchVideoAdBottomSheet(Lau/com/woolworths/foundation/shop/video/advertising/data/VideoAdBottomSheet;)V", 0);
                                    composer2.A(homePageFragment$onCreateView$1$1$1$1$16$1);
                                    objG17 = homePageFragment$onCreateView$1$1$1$1$16$1;
                                }
                                KFunction kFunction16 = (KFunction) objG17;
                                composer2.l();
                                au.com.woolworths.feature.shop.contentpage.c cVar2 = homePageFragment2.R1().u;
                                boolean zC = homePageFragment2.b2().c(BaseShopAppFeature.w);
                                composer2.o(i2);
                                boolean zI18 = composer2.I(homePageFragment2);
                                Object objG18 = composer2.G();
                                if (zI18 || objG18 == composer$Companion$Empty$1) {
                                    cVar = cVar2;
                                    HomePageFragment$onCreateView$1$1$1$1$17$1 homePageFragment$onCreateView$1$1$1$1$17$1 = new HomePageFragment$onCreateView$1$1$1$1$17$1(1, homePageFragment2, HomePageFragment.class, "launchInStoreMap", "launchInStoreMap(Lau/com/woolworths/product/models/ProductCard;)V", 0);
                                    composer2.A(homePageFragment$onCreateView$1$1$1$1$17$1);
                                    objG18 = homePageFragment$onCreateView$1$1$1$1$17$1;
                                } else {
                                    cVar = cVar2;
                                }
                                KFunction kFunction17 = (KFunction) objG18;
                                composer2.l();
                                ContentPageViewModel contentPageViewModelR113 = homePageFragment2.R1();
                                composer2.o(i2);
                                boolean zI19 = composer2.I(homePageFragment2);
                                Object objG19 = composer2.G();
                                if (zI19 || objG19 == composer$Companion$Empty$1) {
                                    objG19 = new g(homePageFragment2, 6);
                                    composer2.A(objG19);
                                }
                                composer2.l();
                                ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(-1981818638, new Function3<Object, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.HomePageFragment.onCreateView.1.1.1.1.19
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object it, Object obj5, Object obj6) {
                                        int iIntValue = ((Number) obj6).intValue();
                                        Intrinsics.h(it, "it");
                                        HomePageFragment homePageFragment3 = homePageFragment2;
                                        homePageFragment3.Q1(iIntValue & 14, (Composer) obj5, it);
                                        return Unit.f24250a;
                                    }
                                }, composer2);
                                MutableState mutableState2 = mutableState;
                                ContentPageScreenKt.a(mutableState2, flow, (Function0) objG19, (Function2) kFunction, (Function1) kFunction2, (Function2) kFunction3, (Function1) kFunction4, contentPageViewModelR15, lazyListStateA, pullRefreshStateA, f, (Function1) kFunction5, (Function1) kFunction13, cVar, (Function1) kFunction17, null, zC, (Function1) kFunction6, (Function2) kFunction15, (Function2) kFunction14, (Function1) kFunction7, (Function1) kFunction8, (Function1) kFunction9, (Function1) kFunction10, (Function1) kFunction11, (Function1) kFunction12, (Function1) kFunction16, contentPageViewModelR113, composableLambdaImplC, composer2, 1090519040, 6, 117440512, 32768);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -2108049551));
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new HomePageFragment$initialiseViewState$1(this, null), 3);
        FragmentHomePageBinding fragmentHomePageBinding2 = this.k;
        if (fragmentHomePageBinding2 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        View view = fragmentHomePageBinding2.h;
        Intrinsics.g(view, "getRoot(...)");
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        getParentFragmentManager().u0(this.v);
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        n2(true);
        super.onPause();
        FirebasePerfMonitor firebasePerfMonitor = this.q;
        if (firebasePerfMonitor == null) {
            Intrinsics.p("firebasePerfMonitor");
            throw null;
        }
        firebasePerfMonitor.f4059a.remove("app_cold_start_interactive_state");
        FirebasePerfMonitor firebasePerfMonitor2 = this.q;
        if (firebasePerfMonitor2 != null) {
            firebasePerfMonitor2.f4059a.remove("app_start_interactive_state");
        } else {
            Intrinsics.p("firebasePerfMonitor");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        h2().B = ContextCompat.a(requireActivity(), "android.permission.ACCESS_FINE_LOCATION") == 0;
        h2().A = ContextCompat.a(requireActivity(), "android.permission.ACCESS_COARSE_LOCATION") == 0;
        h2().y6();
        requireActivity().getIntent().removeExtra("is_deep_link_flag");
        requireActivity().getIntent().removeExtra("deep_link_uri");
        n2(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.h(view, "view");
        super.onViewCreated(view, bundle);
        getParentFragmentManager().e0(this.v, false);
    }

    @Override // au.com.woolworths.feature.shop.homepage.presentation.NavigationAction
    public final void s() {
        h2().y6();
    }
}
