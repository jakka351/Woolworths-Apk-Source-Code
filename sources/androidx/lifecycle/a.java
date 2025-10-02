package androidx.lifecycle;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.state.a;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavHostController;
import androidx.navigation.NavInflater;
import androidx.navigation.NavigatorProvider;
import androidx.navigation.fragment.DialogFragmentNavigator;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.internal.NavControllerImpl;
import androidx.os.SavedStateRegistry;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.rewards.activity.RewardsActivityAnalytics;
import au.com.woolworths.analytics.supers.lists.AddToListAnalytics;
import au.com.woolworths.analytics.supers.ratingsandreviews.ReviewsDetailsAnalytics;
import au.com.woolworths.analytics.supers.ratingsandreviews.SubmitReviewAnalytics;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.database.RecentSearchDao_Impl;
import au.com.woolworths.android.onesite.database.WoolworthsSupermarketDatabase_Impl;
import au.com.woolworths.android.onesite.deeplink.DeepLinkConfig;
import au.com.woolworths.android.onesite.modules.checkout.paypal.BraintreeResultActivity;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.base.shopapp.data.models.InfoSectionAnalytics;
import au.com.woolworths.base.shopapp.ui.infosection.InfoSectionFragment;
import au.com.woolworths.base.wallet.digipay.framesview.CardCaptureResponse;
import au.com.woolworths.base.wallet.digipay.framesview.CompleteResponse;
import au.com.woolworths.base.wallet.digipay.framesview.Error;
import au.com.woolworths.base.wallet.digipay.framesview.FatalError;
import au.com.woolworths.base.wallet.digipay.framesview.FramesWebView;
import au.com.woolworths.base.wallet.digipay.framesview.NetworkError;
import au.com.woolworths.base.wallet.digipay.framesview.PaymentInstrument;
import au.com.woolworths.base.wallet.digipay.framesview.ThreeDSError;
import au.com.woolworths.base.wallet.ocr.RewardsWalletOcrActivity;
import au.com.woolworths.base.wallet.ocr.RewardsWalletOcrOverlayFragment;
import au.com.woolworths.design.core.ui.component.stable.alert.AlertSpec;
import au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerKt;
import au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerSpec;
import au.com.woolworths.design.wx.component.topbar.TopBarConstants;
import au.com.woolworths.dynamic.page.ui.DynamicPageActivity;
import au.com.woolworths.feature.product.list.ComposeProductListCallbacks;
import au.com.woolworths.feature.product.list.compose.AlternativeProductsFragment;
import au.com.woolworths.feature.product.list.v2.ProductListActivity;
import au.com.woolworths.feature.product.list.v2.ProductListPaginationAdapter;
import au.com.woolworths.feature.product.list.v2.ProductListPagingSource;
import au.com.woolworths.feature.product.list.v2.ProductListViewModel;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsViewModel;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsViewModelLegacy;
import au.com.woolworths.feature.rewards.card.overlay.RewardsCardOverlayActivity;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.EverydayExtraFinalGlanceBottomSheetViewModel;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.ui.FinalGlanceModalBottomSheetKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.EverydayExtraLandingFragment;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.EverydayExtraOnboardingFragment;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryViewModel;
import au.com.woolworths.feature.rewards.everydayextras.signup.summary.wpay.WPayLoadingState;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import com.woolworths.R;
import dagger.hilt.android.lifecycle.HiltViewModelExtensions;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float f;
        int i = this.d;
        final int i2 = 1;
        Unit unit = Unit.f24250a;
        Object obj = this.e;
        switch (i) {
            case 0:
                ((CoroutineLiveData) obj).m = null;
                return unit;
            case 1:
                final NavHostFragment navHostFragment = (NavHostFragment) obj;
                Context context = navHostFragment.getContext();
                if (context == null) {
                    throw new IllegalStateException("NavController cannot be created before the fragment is attached");
                }
                final NavHostController navHostController = new NavHostController(context);
                navHostController.j(navHostFragment);
                ViewModelStore viewModelStore = navHostFragment.getD();
                Intrinsics.g(viewModelStore, "<get-viewModelStore>(...)");
                navHostController.k(viewModelStore);
                NavControllerImpl navControllerImpl = navHostController.b;
                NavigatorProvider navigatorProvider = navControllerImpl.t;
                Context contextRequireContext = navHostFragment.requireContext();
                Intrinsics.g(contextRequireContext, "requireContext(...)");
                FragmentManager childFragmentManager = navHostFragment.getChildFragmentManager();
                Intrinsics.g(childFragmentManager, "getChildFragmentManager(...)");
                navigatorProvider.a(new DialogFragmentNavigator(contextRequireContext, childFragmentManager));
                NavigatorProvider navigatorProvider2 = navControllerImpl.t;
                Context contextRequireContext2 = navHostFragment.requireContext();
                Intrinsics.g(contextRequireContext2, "requireContext(...)");
                FragmentManager childFragmentManager2 = navHostFragment.getChildFragmentManager();
                Intrinsics.g(childFragmentManager2, "getChildFragmentManager(...)");
                int id = navHostFragment.getId();
                if (id == 0 || id == -1) {
                    id = R.id.nav_host_fragment_container;
                }
                navigatorProvider2.a(new FragmentNavigator(contextRequireContext2, childFragmentManager2, id));
                Bundle bundleA = navHostFragment.getSavedStateRegistry().a("android-support-nav:fragment:navControllerState");
                if (bundleA != null) {
                    navHostController.h(bundleA);
                }
                navHostFragment.getSavedStateRegistry().c("android-support-nav:fragment:navControllerState", new SavedStateRegistry.SavedStateProvider() { // from class: androidx.navigation.fragment.g
                    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
                    public final Bundle a() {
                        switch (i) {
                            case 0:
                                Bundle bundleI = ((NavHostController) navHostController).i();
                                if (bundleI != null) {
                                    return bundleI;
                                }
                                Bundle EMPTY = Bundle.EMPTY;
                                Intrinsics.g(EMPTY, "EMPTY");
                                return EMPTY;
                            default:
                                int i3 = ((NavHostFragment) navHostController).f;
                                if (i3 != 0) {
                                    return BundleKt.a(new Pair("android-support-nav:fragment:graphId", Integer.valueOf(i3)));
                                }
                                Bundle bundle = Bundle.EMPTY;
                                Intrinsics.e(bundle);
                                return bundle;
                        }
                    }
                });
                Bundle bundleA2 = navHostFragment.getSavedStateRegistry().a("android-support-nav:fragment:graphId");
                if (bundleA2 != null) {
                    navHostFragment.f = bundleA2.getInt("android-support-nav:fragment:graphId");
                }
                navHostFragment.getSavedStateRegistry().c("android-support-nav:fragment:graphId", new SavedStateRegistry.SavedStateProvider() { // from class: androidx.navigation.fragment.g
                    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
                    public final Bundle a() {
                        switch (i2) {
                            case 0:
                                Bundle bundleI = ((NavHostController) navHostFragment).i();
                                if (bundleI != null) {
                                    return bundleI;
                                }
                                Bundle EMPTY = Bundle.EMPTY;
                                Intrinsics.g(EMPTY, "EMPTY");
                                return EMPTY;
                            default:
                                int i3 = ((NavHostFragment) navHostFragment).f;
                                if (i3 != 0) {
                                    return BundleKt.a(new Pair("android-support-nav:fragment:graphId", Integer.valueOf(i3)));
                                }
                                Bundle bundle = Bundle.EMPTY;
                                Intrinsics.e(bundle);
                                return bundle;
                        }
                    }
                });
                int i3 = navHostFragment.f;
                Lazy lazy = navHostController.h;
                if (i3 != 0) {
                    navControllerImpl.q(((NavInflater) lazy.getD()).b(i3), null);
                } else {
                    Bundle arguments = navHostFragment.getArguments();
                    i = arguments != null ? arguments.getInt("android-support-nav:fragment:graphId") : 0;
                    Bundle bundle = arguments != null ? arguments.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
                    if (i != 0) {
                        navControllerImpl.q(((NavInflater) lazy.getD()).b(i), bundle);
                    }
                }
                return navHostController;
            case 2:
                final AddToListAnalytics.AddToList.Action action = (AddToListAnalytics.AddToList.Action) obj;
                return new Event(action) { // from class: au.com.woolworths.analytics.supers.lists.AddToListAnalytics$AddToList$Action$updateList$2$1
                    public final Object d;

                    {
                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                        spreadBuilder.b(action.f4038a.g);
                        spreadBuilder.a(new Pair("event.Action", "button_click"));
                        spreadBuilder.a(new Pair("event.Category", "list"));
                        a.z("event.Label", "update list", spreadBuilder, "event.Description", "quantity bottomsheet");
                        ArrayList arrayList = spreadBuilder.f24269a;
                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                    }

                    @Override // au.com.woolworths.analytics.Event
                    /* renamed from: d */
                    public final String getD() {
                        return "list_update";
                    }

                    public final boolean equals(Object obj2) {
                        if (!(obj2 instanceof Event)) {
                            return false;
                        }
                        Event event = (Event) obj2;
                        return "list_update".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                    @Override // au.com.woolworths.analytics.Event
                    public final Map getData() {
                        return this.d;
                    }
                };
            case 3:
                final ReviewsDetailsAnalytics.ReviewsDetails.Action action2 = (ReviewsDetailsAnalytics.ReviewsDetails.Action) obj;
                return new Event(action2) { // from class: au.com.woolworths.analytics.supers.ratingsandreviews.ReviewsDetailsAnalytics$ReviewsDetails$Action$sortButtonClicked$2$1
                    public final Object d;

                    {
                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                        spreadBuilder.b(action2.f4049a.e);
                        spreadBuilder.a(new Pair("event.Category", "Product Ratings and Reviews"));
                        spreadBuilder.a(new Pair("event.Action", "button_click"));
                        a.y("event.Label", "Sort by", spreadBuilder);
                        ArrayList arrayList = spreadBuilder.f24269a;
                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                    }

                    @Override // au.com.woolworths.analytics.Event
                    /* renamed from: d */
                    public final String getD() {
                        return "sort_buttonclick";
                    }

                    public final boolean equals(Object obj2) {
                        if (!(obj2 instanceof Event)) {
                            return false;
                        }
                        Event event = (Event) obj2;
                        return "sort_buttonclick".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                    @Override // au.com.woolworths.analytics.Event
                    public final Map getData() {
                        return this.d;
                    }
                };
            case 4:
                final SubmitReviewAnalytics.SubmitReview.Action action3 = (SubmitReviewAnalytics.SubmitReview.Action) obj;
                return new Event(action3) { // from class: au.com.woolworths.analytics.supers.ratingsandreviews.SubmitReviewAnalytics$SubmitReview$Action$duplicateError$2$1
                    public final Object d;

                    {
                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                        spreadBuilder.b(action3.f4050a.e);
                        spreadBuilder.a(new Pair("event.Category", "Product Ratings and Reviews"));
                        spreadBuilder.a(new Pair("event.Action", "impression"));
                        a.y("event.Label", "review submission already done", spreadBuilder);
                        ArrayList arrayList = spreadBuilder.f24269a;
                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                    }

                    @Override // au.com.woolworths.analytics.Event
                    /* renamed from: d */
                    public final String getD() {
                        return "productratings&reviews_alreadydone";
                    }

                    public final boolean equals(Object obj2) {
                        if (!(obj2 instanceof Event)) {
                            return false;
                        }
                        Event event = (Event) obj2;
                        return "productratings&reviews_alreadydone".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                    @Override // au.com.woolworths.analytics.Event
                    public final Map getData() {
                        return this.d;
                    }
                };
            case 5:
                return new RecentSearchDao_Impl((WoolworthsSupermarketDatabase_Impl) obj);
            case 6:
                DeepLinkConfig deepLinkConfig = (DeepLinkConfig) obj;
                if (deepLinkConfig == null || !deepLinkConfig.l) {
                    return ActivityNavigatorKt.a(Activities.RewardsActivityLegacy.f4514a, ApplicationType.e);
                }
                Intent intentA = ActivityNavigatorKt.a(Activities.ShopRewardsActivity.f4534a, ApplicationType.e);
                intentA.putExtra("EXTRA_OFFER_INFO", new Activities.ShopRewardsActivity.Extras(null));
                return intentA;
            case 7:
                return (Intent) obj;
            case 8:
                int i4 = BraintreeResultActivity.x;
                return ((BraintreeResultActivity) obj).getIntent().getStringExtra("auth");
            case 9:
                return (InfoSectionAnalytics) ((InfoSectionFragment) obj).requireArguments().getParcelable("arg_info_section_analytics");
            case 10:
                RewardsWalletOcrActivity rewardsWalletOcrActivity = (RewardsWalletOcrActivity) obj;
                int i5 = RewardsWalletOcrActivity.E;
                Activities.RewardsWalletOcr.ExtrasRewardsWalletOcrConfig extrasRewardsWalletOcrConfig = Build.VERSION.SDK_INT >= 33 ? (Activities.RewardsWalletOcr.ExtrasRewardsWalletOcrConfig) rewardsWalletOcrActivity.getIntent().getParcelableExtra("extras_rewards_ocr_origin", Activities.RewardsWalletOcr.ExtrasRewardsWalletOcrConfig.class) : (Activities.RewardsWalletOcr.ExtrasRewardsWalletOcrConfig) rewardsWalletOcrActivity.getIntent().getParcelableExtra("extras_rewards_ocr_origin");
                if (extrasRewardsWalletOcrConfig != null) {
                    return extrasRewardsWalletOcrConfig.d;
                }
                return null;
            case 11:
                RewardsWalletOcrOverlayFragment rewardsWalletOcrOverlayFragment = (RewardsWalletOcrOverlayFragment) obj;
                int i6 = RewardsWalletOcrOverlayFragment.e;
                if (Build.VERSION.SDK_INT >= 33) {
                    Intent intent = rewardsWalletOcrOverlayFragment.getActivity().getIntent();
                    if (intent != null) {
                        return (Activities.RewardsWalletOcr.Origin) intent.getSerializableExtra("EXTRA_ORIGIN", Activities.RewardsWalletOcr.Origin.class);
                    }
                    return null;
                }
                Intent intent2 = rewardsWalletOcrOverlayFragment.getActivity().getIntent();
                Serializable serializableExtra = intent2 != null ? intent2.getSerializableExtra("EXTRA_ORIGIN") : null;
                if (serializableExtra instanceof Activities.RewardsWalletOcr.Origin) {
                    return (Activities.RewardsWalletOcr.Origin) serializableExtra;
                }
                return null;
            case 12:
                ((AlertSpec.Action) obj).c.invoke();
                return unit;
            case 13:
                float f2 = BroadcastBannerKt.f4745a;
                ((BroadcastBannerSpec.Action) obj).c.invoke();
                return unit;
            case 14:
                if (((LazyGridState) obj).g() == 0) {
                    Dp dp = new Dp(r9.h());
                    Dp dp2 = new Dp(TopBarConstants.b);
                    if (dp.compareTo(dp2) > 0) {
                        dp = dp2;
                    }
                    f = dp.d;
                } else {
                    f = TopBarConstants.b;
                }
                return new Dp(f);
            case 15:
                ((DynamicPageActivity) obj).finish();
                return unit;
            case 16:
                ((AlternativeProductsFragment) obj).requireActivity().getSupportFragmentManager().Z(null);
                return unit;
            case 17:
                ((ComposeProductListCallbacks) obj).h();
                return unit;
            case 18:
                ((au.com.woolworths.feature.product.list.legacy.compose.AlternativeProductsFragment) obj).requireActivity().getSupportFragmentManager().Z(null);
                return unit;
            case 19:
                ((au.com.woolworths.feature.product.list.legacy.ComposeProductListCallbacks) obj).h();
                return unit;
            case 20:
                ProductListActivity productListActivity = (ProductListActivity) obj;
                int i7 = ProductListActivity.z;
                return HiltViewModelExtensions.a(productListActivity.getDefaultViewModelCreationExtras(), new androidx.navigation.fragment.e(productListActivity, 18));
            case 21:
                ProductListViewModel productListViewModel = (ProductListViewModel) obj;
                Activities.ProductList.Extras extras = productListViewModel.e;
                List listB = productListViewModel.j.f5401a.b();
                ProductListPaginationAdapter productListPaginationAdapter = productListViewModel.k;
                productListPaginationAdapter.c = null;
                productListPaginationAdapter.d.clear();
                ProductListPagingSource productListPagingSource = new ProductListPagingSource(extras, productListPaginationAdapter, listB, new au.com.woolworths.feature.product.list.v2.a(productListViewModel, i2));
                productListViewModel.n = productListPagingSource;
                return productListPagingSource;
            case 22:
                RewardsPreferenceDetailsViewModel rewardsPreferenceDetailsViewModel = (RewardsPreferenceDetailsViewModel) obj;
                String strQ6 = rewardsPreferenceDetailsViewModel.q6();
                if (!strQ6.equals("receipts")) {
                    return strQ6.equals("pushNotifications") ? Screens.F : Screens.I;
                }
                String str = rewardsPreferenceDetailsViewModel.m;
                Object obj2 = RewardsActivityAnalytics.ActivityFeed.d;
                return Intrinsics.c(str, "Activity screen") ? Screens.H : Screens.G;
            case 23:
                RewardsPreferenceDetailsViewModelLegacy rewardsPreferenceDetailsViewModelLegacy = (RewardsPreferenceDetailsViewModelLegacy) obj;
                String str2 = rewardsPreferenceDetailsViewModelLegacy.h;
                if (str2 == null) {
                    Intrinsics.p("preferencesKey");
                    throw null;
                }
                if (!str2.equals("receipts")) {
                    return str2.equals("pushNotifications") ? Screens.F : Screens.I;
                }
                String str3 = rewardsPreferenceDetailsViewModelLegacy.i;
                Object obj3 = RewardsActivityAnalytics.ActivityFeed.d;
                return Intrinsics.c(str3, "Activity screen") ? Screens.H : Screens.G;
            case 24:
                ((RewardsCardOverlayActivity) obj).finish();
                return unit;
            case 25:
                float f3 = FinalGlanceModalBottomSheetKt.f6091a;
                ((EverydayExtraFinalGlanceBottomSheetViewModel) obj).r6();
                return unit;
            case 26:
                ((EverydayExtraLandingFragment) obj).requireActivity().finish();
                return unit;
            case 27:
                ((EverydayExtraOnboardingFragment) obj).requireActivity().finish();
                return unit;
            case 28:
                final EverydayExtraSummaryViewModel everydayExtraSummaryViewModel = (EverydayExtraSummaryViewModel) obj;
                return new FramesWebView.Callback() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryViewModel$wpayFramesWebViewCallback$2$1
                    @Override // au.com.woolworths.base.wallet.digipay.framesview.FramesWebView.Callback
                    public final void b() {
                        Object value;
                        MutableStateFlow mutableStateFlow = everydayExtraSummaryViewModel.p;
                        EverydayExtraSummaryContract.ViewState viewState = (EverydayExtraSummaryContract.ViewState) mutableStateFlow.getValue();
                        if (viewState instanceof EverydayExtraSummaryContract.ViewState.Content) {
                            do {
                                value = mutableStateFlow.getValue();
                            } while (!mutableStateFlow.d(value, EverydayExtraSummaryContract.ViewState.Content.c((EverydayExtraSummaryContract.ViewState.Content) viewState, null, false, WPayLoadingState.f, null, null, false, false, false, null, null, 1019)));
                        }
                    }

                    @Override // au.com.woolworths.base.wallet.digipay.framesview.FramesWebView.Callback
                    public final void c(CompleteResponse response) {
                        Object value;
                        Object value2;
                        Intrinsics.h(response, "response");
                        EverydayExtraSummaryViewModel everydayExtraSummaryViewModel2 = everydayExtraSummaryViewModel;
                        MutableStateFlow mutableStateFlow = everydayExtraSummaryViewModel2.p;
                        if (response instanceof CardCaptureResponse) {
                            CardCaptureResponse cardCaptureResponse = (CardCaptureResponse) response;
                            String str4 = cardCaptureResponse.h;
                            PaymentInstrument paymentInstrument = cardCaptureResponse.b;
                            String str5 = cardCaptureResponse.d;
                            ThreeDSError threeDSError = cardCaptureResponse.e;
                            if (threeDSError == null) {
                                if (((paymentInstrument != null ? paymentInstrument.e : null) != null ? paymentInstrument.e : str4) != null && str5 != null) {
                                    Bark.f8483a.a("WPay frame completed - beginning subscribe");
                                    if ((paymentInstrument != null ? paymentInstrument.e : null) != null) {
                                        str4 = paymentInstrument.e;
                                    }
                                    everydayExtraSummaryViewModel2.l = str4;
                                    everydayExtraSummaryViewModel2.B6(everydayExtraSummaryViewModel2.k, str4, str5);
                                    return;
                                }
                                everydayExtraSummaryViewModel2.w6(new FatalError("Unexpected Response"));
                                EverydayExtraSummaryContract.ViewState viewState = (EverydayExtraSummaryContract.ViewState) mutableStateFlow.getValue();
                                if (viewState instanceof EverydayExtraSummaryContract.ViewState.Content) {
                                    do {
                                        value = mutableStateFlow.getValue();
                                    } while (!mutableStateFlow.d(value, EverydayExtraSummaryContract.ViewState.Content.c((EverydayExtraSummaryContract.ViewState.Content) viewState, null, false, null, null, null, false, false, false, null, null, 991)));
                                    return;
                                }
                                return;
                            }
                            Bark.Companion companion = Bark.f8483a;
                            Bark.Barker.i(new ReportOwner(ReportOwner.Squad.e), "EDX Summary 3DS error: " + threeDSError, null, 12);
                            int iOrdinal = threeDSError.ordinal();
                            if (iOrdinal != 2 && iOrdinal != 3) {
                                if (iOrdinal == 4) {
                                    everydayExtraSummaryViewModel2.w6(new NetworkError(threeDSError.name()));
                                } else if (iOrdinal != 5 && iOrdinal != 6) {
                                    everydayExtraSummaryViewModel2.w6(new FatalError(threeDSError.name()));
                                }
                            }
                            EverydayExtraSummaryContract.ViewState viewState2 = (EverydayExtraSummaryContract.ViewState) mutableStateFlow.getValue();
                            if (viewState2 instanceof EverydayExtraSummaryContract.ViewState.Content) {
                                do {
                                    value2 = mutableStateFlow.getValue();
                                } while (!mutableStateFlow.d(value2, EverydayExtraSummaryContract.ViewState.Content.c((EverydayExtraSummaryContract.ViewState.Content) viewState2, null, false, null, null, null, false, false, false, null, null, 991)));
                            }
                        }
                    }

                    @Override // au.com.woolworths.base.wallet.digipay.framesview.FramesWebView.Callback
                    public final void d(boolean z) {
                        Object value;
                        if (z) {
                            MutableStateFlow mutableStateFlow = everydayExtraSummaryViewModel.p;
                            EverydayExtraSummaryContract.ViewState viewState = (EverydayExtraSummaryContract.ViewState) mutableStateFlow.getValue();
                            if (viewState instanceof EverydayExtraSummaryContract.ViewState.Content) {
                                do {
                                    value = mutableStateFlow.getValue();
                                } while (!mutableStateFlow.d(value, EverydayExtraSummaryContract.ViewState.Content.c((EverydayExtraSummaryContract.ViewState.Content) viewState, null, false, null, null, null, false, false, false, null, null, 1007)));
                            }
                        }
                    }

                    @Override // au.com.woolworths.base.wallet.digipay.framesview.FramesWebView.Callback
                    public final void e(Error error) {
                        everydayExtraSummaryViewModel.w6(error);
                    }
                };
            default:
                return Boolean.valueOf(((WPayLoadingState) obj) == WPayLoadingState.f);
        }
    }
}
