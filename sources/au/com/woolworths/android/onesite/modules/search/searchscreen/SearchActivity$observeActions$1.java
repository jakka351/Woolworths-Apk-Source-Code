package au.com.woolworths.android.onesite.modules.search.searchscreen;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.widget.SearchView;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.adobe.data.SearchAnalyticsMetadata;
import au.com.woolworths.android.onesite.appdata.AppEnvironment;
import au.com.woolworths.android.onesite.deeplink.ShopAppDeepLink;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.legacy.databinding.ActivitySearchBinding;
import au.com.woolworths.android.onesite.modules.search.analytics.SearchActions;
import au.com.woolworths.android.onesite.modules.search.analytics.SearchScreens;
import au.com.woolworths.android.onesite.modules.search.searchscreen.SearchActivity;
import au.com.woolworths.android.onesite.modules.search.searchscreen.SearchContract;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.base.shopapp.modules.search.SearchType;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.sdui.model.action.ActionData;
import com.google.android.material.snackbar.Snackbar;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.android.onesite.modules.search.searchscreen.SearchActivity$observeActions$1", f = "SearchActivity.kt", l = {377}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SearchActivity$observeActions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ SearchActivity q;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchContract$Actions;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.android.onesite.modules.search.searchscreen.SearchActivity$observeActions$1$1", f = "SearchActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.android.onesite.modules.search.searchscreen.SearchActivity$observeActions$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<SearchContract.Actions, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;
        public final /* synthetic */ SearchActivity q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SearchActivity searchActivity, Continuation continuation) {
            super(2, continuation);
            this.q = searchActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, continuation);
            anonymousClass1.p = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((SearchContract.Actions) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Activities.ProductList.ExtraProductListSource extrasBySearch;
            Intent intentB;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            SearchContract.Actions actions = (SearchContract.Actions) this.p;
            boolean z = actions instanceof SearchContract.Actions.OpenBarcodeScanner;
            SearchActivity searchActivity = this.q;
            if (z) {
                ShopAppNavigator shopAppNavigator = searchActivity.E;
                if (shopAppNavigator == null) {
                    Intrinsics.p("shopAppNavigator");
                    throw null;
                }
                shopAppNavigator.a();
            } else {
                int i = SearchActivity.R;
                boolean z2 = actions instanceof SearchContract.Actions.PerformQuerySearch;
                Object openSearchResults = SearchContract.Actions.LaunchMarketplace.f4412a;
                if (z2) {
                    SearchViewModel searchViewModelT4 = searchActivity.T4();
                    SearchContract.Actions.PerformQuerySearch performQuerySearch = (SearchContract.Actions.PerformQuerySearch) actions;
                    String query = performQuerySearch.f4419a;
                    SearchAnalyticsMetadata searchAnalyticsMetadata = performQuerySearch.b;
                    Intrinsics.h(query, "query");
                    AnalyticsManager analyticsManager = searchViewModelT4.h;
                    if (!StringsKt.D(query)) {
                        searchViewModelT4.p6(query);
                        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.J2, query);
                        TrackableValue trackableValue = TrackableValue.Q2;
                        SearchType[] searchTypeArr = SearchType.d;
                        trackingMetadataA.b(trackableValue, "products");
                        trackingMetadataA.b(TrackableValue.K2, searchAnalyticsMetadata.f4070a.d);
                        analyticsManager.j(SearchActions.e, trackingMetadataA);
                        if (!query.equalsIgnoreCase("Everyday Market") || searchViewModelT4.f.b()) {
                            openSearchResults = new SearchContract.Actions.OpenSearchResults(query);
                        }
                        searchViewModelT4.u.f(openSearchResults);
                    }
                } else {
                    boolean z3 = actions instanceof SearchContract.Actions.OpenSearchResults;
                    Activities.ComposeProductListLegacy composeProductListLegacy = Activities.ComposeProductListLegacy.f4460a;
                    if (z3) {
                        String str = ((SearchContract.Actions.OpenSearchResults) actions).f4418a;
                        Activities.ProductList.ExtrasPageData extrasPageData = new Activities.ProductList.ExtrasPageData(str, null);
                        Activities.Search.Extras extrasR4 = searchActivity.R4();
                        if ((extrasR4 instanceof Activities.Search.Extras.BuyAgain) || (extrasR4 instanceof Activities.Search.Extras.Generic) || (extrasR4 instanceof Activities.Search.Extras.ProductFinder) || (extrasR4 instanceof Activities.Search.Extras.VoiceProductFinder) || (extrasR4 instanceof Activities.Search.Extras.VoiceWithMapsProductFinder)) {
                            extrasBySearch = new Activities.ProductList.ExtrasBySearch(str, (List) null, (String) null, searchActivity.S4(), 14);
                        } else {
                            if (!(extrasR4 instanceof Activities.Search.Extras.ProductAlternative)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            extrasBySearch = new Activities.ProductList.ExtrasBySearchAlternative(str, "searchAlternative", ((Activities.Search.Extras.ProductAlternative) extrasR4).j, searchActivity.S4());
                        }
                        Activities.ProductList.Extras extras = new Activities.ProductList.Extras(extrasPageData, extrasBySearch, (Activities.ProductList.ExtrasConfig) null, 4);
                        if (searchActivity.R4().h || searchActivity.R4().i) {
                            FeatureToggleManager featureToggleManager = searchActivity.B;
                            if (featureToggleManager == null) {
                                Intrinsics.p("featureToggleManager");
                                throw null;
                            }
                            if (featureToggleManager.c(BaseShopAppFeature.I)) {
                                intentB = ActivityNavigatorKt.a(Activities.ProductListV2.f4506a, ApplicationType.e).setFlags(335544320).putExtra("EXTRA_PRODUCT_LIST_INFO", extras);
                                Intrinsics.g(intentB, "putExtra(...)");
                            } else {
                                intentB = composeProductListLegacy.b(extras);
                            }
                        } else {
                            intentB = Activities.ProductList.f4505a.b(extras, true);
                        }
                        searchActivity.startActivity(intentB);
                        searchActivity.finish();
                    } else if (Intrinsics.c(actions, SearchContract.Actions.ShowSearchSuggestion.f4420a)) {
                        SearchView searchView = searchActivity.H;
                        if (searchView == null) {
                            Intrinsics.p("searchView");
                            throw null;
                        }
                        searchView.setVisibility(0);
                        SearchView searchView2 = searchActivity.H;
                        if (searchView2 == null) {
                            Intrinsics.p("searchView");
                            throw null;
                        }
                        searchView2.setIconified(false);
                        ActivitySearchBinding activitySearchBinding = searchActivity.I;
                        if (activitySearchBinding == null) {
                            Intrinsics.p("activityBinding");
                            throw null;
                        }
                        activitySearchBinding.A.h.setVisibility(0);
                    } else if (Intrinsics.c(actions, SearchContract.Actions.AutocompleteSuggestionScrolling.f4410a)) {
                        SearchView searchView3 = searchActivity.H;
                        if (searchView3 == null) {
                            Intrinsics.p("searchView");
                            throw null;
                        }
                        searchView3.clearFocus();
                    } else if (Intrinsics.c(actions, openSearchResults)) {
                        searchActivity.startActivity(ActivityNavigatorKt.a(Activities.MarketplaceActivity.f4489a, ApplicationType.e));
                        searchActivity.finish();
                    } else if (Intrinsics.c(actions, SearchContract.Actions.OpenBuyAgain.f4417a)) {
                        Intent intentA = ActivityNavigatorKt.a(Activities.BuyAgainActivity.f4453a, ApplicationType.e);
                        intentA.setFlags(67108864);
                        searchActivity.startActivity(intentA);
                    } else if (actions instanceof SearchContract.Actions.LaunchAction) {
                        ActionData actionData = ((SearchContract.Actions.LaunchAction) actions).f4411a;
                        AnalyticsData analytics = actionData.getAnalytics();
                        if (analytics != null) {
                            searchActivity.O4().g(AnalyticsDataKt.a(analytics));
                        }
                        if (SearchActivity.WhenMappings.f4407a[actionData.getType().ordinal()] == 1) {
                            searchActivity.startActivity(ShopAppDeepLink.a(SearchScreens.d, actionData.getAction()));
                        }
                        searchActivity.finish();
                    } else if (Intrinsics.c(actions, SearchContract.Actions.LaunchVoiceProductFinder.f4414a)) {
                        searchActivity.startActivity(composeProductListLegacy.c(searchActivity.S4()));
                    } else if (Intrinsics.c(actions, SearchContract.Actions.LaunchVoiceProductSearch.f4415a)) {
                        searchActivity.startActivity(composeProductListLegacy.c(Activities.ProductList.ProductListType.I));
                    } else if (actions instanceof SearchContract.Actions.ShowSnackbarMessage) {
                        String string = ((SearchContract.Actions.ShowSnackbarMessage) actions).f4421a.getText(searchActivity).toString();
                        ActivitySearchBinding activitySearchBinding2 = searchActivity.I;
                        if (activitySearchBinding2 == null) {
                            Intrinsics.p("activityBinding");
                            throw null;
                        }
                        Snackbar.j(null, activitySearchBinding2.h, string, 0).l();
                    } else {
                        if (!Intrinsics.c(actions, SearchContract.Actions.LaunchOliveChat.f4413a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        searchActivity.T4().n.getClass();
                        AppEnvironment.Production production = AppEnvironment.Production.INSTANCE;
                        searchActivity.startActivity(Activities.AskOliveActivity.b(5, null, Uri.parse(Intrinsics.c(production, production) ? "https://chatwidget.woolworths.com.au/templates/wowo.html" : "https://chatwidget-test.woolworths.com.au/templates/wowo.html").buildUpon().appendQueryParameter("currentPage", "Search").appendQueryParameter("productSource", "SearchOliveEntryPoint").build().toString(), null));
                    }
                }
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchActivity$observeActions$1(SearchActivity searchActivity, Continuation continuation) {
        super(2, continuation);
        this.q = searchActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SearchActivity$observeActions$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SearchActivity$observeActions$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            int i2 = SearchActivity.R;
            SearchActivity searchActivity = this.q;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(searchActivity, null), FlowExtKt.a(searchActivity.T4().v, searchActivity.getD(), Lifecycle.State.g));
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
