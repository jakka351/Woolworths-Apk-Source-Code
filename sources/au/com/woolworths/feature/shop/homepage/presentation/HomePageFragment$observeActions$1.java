package au.com.woolworths.feature.shop.homepage.presentation;

import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.deeplink.ShopAppDeepLink;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.feature.shop.homepage.analytics.HomePageActions;
import au.com.woolworths.feature.shop.homepage.databinding.FragmentHomePageBinding;
import au.com.woolworths.feature.shop.homepage.presentation.HomePageContract;
import au.com.woolworths.foundation.shop.instore.presence.presentation.InstorePresencePromptBottomSheetKt;
import com.google.android.material.snackbar.Snackbar;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.homepage.presentation.HomePageFragment$observeActions$1", f = "HomePageFragment.kt", l = {232}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class HomePageFragment$observeActions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ HomePageFragment q;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.homepage.presentation.HomePageFragment$observeActions$1$1", f = "HomePageFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.homepage.presentation.HomePageFragment$observeActions$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<HomePageContract.Actions, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;
        public final /* synthetic */ HomePageFragment q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HomePageFragment homePageFragment, Continuation continuation) {
            super(2, continuation);
            this.q = homePageFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, continuation);
            anonymousClass1.p = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) throws Resources.NotFoundException, NumberFormatException {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((HomePageContract.Actions) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Resources.NotFoundException, NumberFormatException {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            HomePageContract.Actions actions = (HomePageContract.Actions) this.p;
            boolean z = actions instanceof HomePageContract.Actions.LaunchCatalogue;
            HomePageFragment homePageFragment = this.q;
            if (z) {
                homePageFragment.startActivity(ActivityNavigatorKt.a(Activities.CatalogueHome.f4455a, ApplicationType.e));
            } else if (actions instanceof HomePageContract.Actions.LaunchDisplayBarcode) {
                homePageFragment.startActivity(ActivityNavigatorKt.a(Activities.RewardsCardOverlay.f4517a, ApplicationType.e));
            } else if (actions instanceof HomePageContract.Actions.LaunchRewardsDetails) {
                if (homePageFragment.b2().c(BaseShopAppFeature.Q)) {
                    Intent intentA = ActivityNavigatorKt.a(Activities.ShopRewardsActivity.f4534a, ApplicationType.e);
                    intentA.putExtra("EXTRA_OFFER_INFO", new Activities.ShopRewardsActivity.Extras(null));
                    homePageFragment.startActivity(intentA);
                } else {
                    homePageFragment.startActivity(ActivityNavigatorKt.a(Activities.RewardsActivityLegacy.f4514a, ApplicationType.e));
                }
            } else if (actions instanceof HomePageContract.Actions.LaunchAddRewards) {
                homePageFragment.startActivity(Activities.RewardsSetupMoreActivity.f4522a.b(null, homePageFragment.b2().c(BaseShopAppFeature.R)));
            } else if (actions instanceof HomePageContract.Actions.LaunchProductDetails) {
                String productId = ((HomePageContract.Actions.LaunchProductDetails) actions).f7222a.getProductId();
                ShopAppNavigator shopAppNavigator = homePageFragment.p;
                if (shopAppNavigator == null) {
                    Intrinsics.p("shopAppNavigator");
                    throw null;
                }
                shopAppNavigator.d(productId);
            } else if (actions instanceof HomePageContract.Actions.LaunchProductAdd) {
                homePageFragment.m2(Screens.l, ((HomePageContract.Actions.LaunchProductAdd) actions).f7221a);
            } else if (actions instanceof HomePageContract.Actions.LaunchProductUpdate) {
                homePageFragment.m2(Screens.l, ((HomePageContract.Actions.LaunchProductUpdate) actions).f7224a);
            } else if (actions instanceof HomePageContract.Actions.LaunchAddToList) {
                homePageFragment.i2(Screens.l, ((HomePageContract.Actions.LaunchAddToList) actions).f7213a);
            } else {
                boolean z2 = actions instanceof HomePageContract.Actions.LaunchProductGroup;
                Activities.ProductList productList = Activities.ProductList.f4505a;
                if (z2) {
                    Intent intentA2 = ActivityNavigatorKt.a(productList, ApplicationType.e);
                    intentA2.putExtra("EXTRA_PRODUCT_LIST_INFO", ((HomePageContract.Actions.LaunchProductGroup) actions).f7223a);
                    homePageFragment.startActivity(intentA2);
                } else if (actions instanceof HomePageContract.Actions.LaunchSignUp) {
                    ShopAppNavigator shopAppNavigator2 = homePageFragment.p;
                    if (shopAppNavigator2 == null) {
                        Intrinsics.p("shopAppNavigator");
                        throw null;
                    }
                    shopAppNavigator2.b.startActivityForResult(ActivityNavigatorKt.a(Activities.SignUp.f4536a, ApplicationType.e), 7777);
                } else if (actions instanceof HomePageContract.Actions.LaunchLogIn) {
                    FragmentActivity fragmentActivityRequireActivity = homePageFragment.requireActivity();
                    Intrinsics.g(fragmentActivityRequireActivity, "requireActivity(...)");
                    Activities.LogIn.c(fragmentActivityRequireActivity);
                } else if (actions instanceof HomePageContract.Actions.LaunchOrder) {
                    homePageFragment.startActivity(ActivityNavigatorKt.a(Activities.OrderDetails.f4496a, ApplicationType.e).putExtra("EXTRA_DATA", new Activities.OrderDetails.Extras(((HomePageContract.Actions.LaunchOrder) actions).f7220a.d, false)));
                } else if (actions instanceof HomePageContract.Actions.LaunchRecipeDetails) {
                    homePageFragment.startActivity(Activities.RecipeDetails.b(((HomePageContract.Actions.LaunchRecipeDetails) actions).f7226a));
                } else if (actions instanceof HomePageContract.Actions.LaunchMarketplace) {
                    homePageFragment.startActivity(ActivityNavigatorKt.a(Activities.MarketplaceActivity.f4489a, ApplicationType.e));
                } else if (actions instanceof HomePageContract.Actions.ShowCoachMarkContent) {
                    HomePageContract.Actions.ShowCoachMarkContent showCoachMarkContent = (HomePageContract.Actions.ShowCoachMarkContent) actions;
                    FragmentHomePageBinding fragmentHomePageBinding = homePageFragment.k;
                    if (fragmentHomePageBinding == null) {
                        Intrinsics.p("fragmentBinding");
                        throw null;
                    }
                    fragmentHomePageBinding.h.post(new androidx.camera.core.impl.utils.futures.e(23, homePageFragment, showCoachMarkContent));
                } else if (actions instanceof HomePageContract.Actions.LaunchDeepLink) {
                    Intent intentA3 = ShopAppDeepLink.a(Screens.l, ((HomePageContract.Actions.LaunchDeepLink) actions).f7216a);
                    Activities.MainActivity.Tab tab = Activities.MainActivity.Tab.d;
                    intentA3.putExtra("EXTRA_RETURN_TAB", new Activities.MainActivity.ExtraTargetTabWithMessage());
                    homePageFragment.startActivity(intentA3);
                } else if (actions instanceof HomePageContract.Actions.LaunchShoppingListDetails) {
                    homePageFragment.startActivity(Activities.ShoppingListDetails.f4535a.b(((HomePageContract.Actions.LaunchShoppingListDetails) actions).f7227a, false));
                } else if (actions instanceof HomePageContract.Actions.LaunchProductVarieties) {
                    String str = ((HomePageContract.Actions.LaunchProductVarieties) actions).f7225a;
                    String string = homePageFragment.getString(R.string.title_product_varieties);
                    Intrinsics.g(string, "getString(...)");
                    homePageFragment.startActivity(productList.b(new Activities.ProductList.Extras(new Activities.ProductList.ExtrasPageData(string, null), new Activities.ProductList.ExtrasByPriceFamily(str), (Activities.ProductList.ExtrasConfig) null, 12), false));
                } else if (actions instanceof HomePageContract.Actions.LaunchYourGroceries) {
                    homePageFragment.startActivity(Activities.OrderDetailsYourGroceries.f4497a.b(((HomePageContract.Actions.LaunchYourGroceries) actions).f7231a));
                } else if (actions instanceof HomePageContract.Actions.BoostAllSuccess) {
                    TrackingMetadata trackingMetadata = ((HomePageContract.Actions.BoostAllSuccess) actions).f7211a;
                    AnalyticsManager analyticsManager = homePageFragment.m;
                    if (analyticsManager == null) {
                        Intrinsics.p("analyticsManager");
                        throw null;
                    }
                    analyticsManager.j(HomePageActions.BoostAllSuccessSnackbarImpression.e, trackingMetadata);
                    View view = homePageFragment.getView();
                    if (view != null) {
                        Snackbar.i(view, R.string.boost_all_success, 0).l();
                    }
                } else if (actions instanceof HomePageContract.Actions.BoostAllFail) {
                    HomePageContract.Actions.BoostAllFail boostAllFail = (HomePageContract.Actions.BoostAllFail) actions;
                    Integer num = boostAllFail.f7210a;
                    TrackingMetadata trackingMetadata2 = boostAllFail.b;
                    if (num == null) {
                        AnalyticsManager analyticsManager2 = homePageFragment.m;
                        if (analyticsManager2 == null) {
                            Intrinsics.p("analyticsManager");
                            throw null;
                        }
                        analyticsManager2.j(HomePageActions.BoostAllFailSnackbarImpression.e, trackingMetadata2);
                        View view2 = homePageFragment.getView();
                        if (view2 != null) {
                            Snackbar.j(null, view2, homePageFragment.getResources().getString(R.string.boost_all_fail), 0).l();
                        }
                    } else {
                        String quantityString = homePageFragment.getResources().getQuantityString(R.plurals.boost_all_fail_partial, num.intValue(), num);
                        Intrinsics.g(quantityString, "getQuantityString(...)");
                        AnalyticsManager analyticsManager3 = homePageFragment.m;
                        if (analyticsManager3 == null) {
                            Intrinsics.p("analyticsManager");
                            throw null;
                        }
                        analyticsManager3.j(HomePageActions.BoostAllFailSnackbarImpression.e, trackingMetadata2);
                        View view3 = homePageFragment.getView();
                        if (view3 != null) {
                            Snackbar.j(null, view3, quantityString, 0).l();
                        }
                    }
                } else if (actions instanceof HomePageContract.Actions.LaunchBuyAgain) {
                    homePageFragment.startActivity(ActivityNavigatorKt.a(Activities.BuyAgainActivity.f4453a, ApplicationType.e));
                } else if (actions instanceof HomePageContract.Actions.ShowInstorePrompt) {
                    Function0 function0 = homePageFragment.u;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    FragmentActivity fragmentActivityRequireActivity2 = homePageFragment.requireActivity();
                    Intrinsics.g(fragmentActivityRequireActivity2, "requireActivity(...)");
                    homePageFragment.u = InstorePresencePromptBottomSheetKt.f(fragmentActivityRequireActivity2, ((HomePageContract.Actions.ShowInstorePrompt) actions).f7234a, homePageFragment.h2());
                } else if (actions instanceof HomePageContract.Actions.LaunchWebView) {
                    HomePageContract.Actions.LaunchWebView launchWebView = (HomePageContract.Actions.LaunchWebView) actions;
                    String str2 = launchWebView.b;
                    String str3 = launchWebView.f7230a;
                    Screens screens = Screens.d;
                    homePageFragment.startActivity(Activities.WebViewActivity.f4554a.b(new Activities.WebViewActivity.Extras(52, str2, str3, null)));
                } else if (actions instanceof HomePageContract.Actions.LaunchWatchlistGuestOnboardingScreen) {
                    homePageFragment.startActivity(Activities.ShopListGuestOnboardingActivity.f4532a.b(Activities.ShopListGuestOnboardingActivity.ListFeature.d));
                } else if (actions instanceof HomePageContract.Actions.ViewWatchlist) {
                    homePageFragment.startActivity(Activities.ShoppingListDetails.f4535a.b(((HomePageContract.Actions.ViewWatchlist) actions).f7235a, false));
                } else {
                    if (!(actions instanceof HomePageContract.Actions.OpenOliveChat)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    homePageFragment.startActivity(Activities.AskOliveActivity.b(5, null, ((HomePageContract.Actions.OpenOliveChat) actions).f7232a, null));
                }
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomePageFragment$observeActions$1(HomePageFragment homePageFragment, Continuation continuation) {
        super(2, continuation);
        this.q = homePageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomePageFragment$observeActions$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((HomePageFragment$observeActions$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            HomePageFragment homePageFragment = this.q;
            ChannelLimitedFlowMerge channelLimitedFlowMerge = homePageFragment.h2().N;
            Lifecycle d = homePageFragment.getD();
            Intrinsics.g(d, "<get-lifecycle>(...)");
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(homePageFragment, null), androidx.lifecycle.FlowExtKt.a(channelLimitedFlowMerge, d, Lifecycle.State.h));
            this.p = 1;
            if (FlowKt.g(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
