package au.com.woolworths.feature.shop.instore.navigation.productfinder;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.analytics.model.EventConfig;
import au.com.woolworths.analytics.supers.products.ProductFinderAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.database.RecentSearchDao;
import au.com.woolworths.android.onesite.database.WoolworthsSupermarketDatabase;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.feature.shop.instore.navigation.onboarding.domain.ProductFinderOnboardingInteractorImpl;
import au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderContract;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.instore.navigation.map.InstoreNavigationInteractor;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.Store;
import au.com.woolworths.geolocation.location.LocationInteractor;
import au.com.woolworths.geolocation.location.LocationsKt;
import com.google.android.gms.actions.SearchIntents;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import timber.log.Timber;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/productfinder/ProductFinderViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/feature/shop/instore/navigation/productfinder/ProductFinderCallbacks;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductFinderViewModel extends ViewModel implements ProductFinderCallbacks {
    public final CollectionModeInteractor e;
    public final InstoreNavigationInteractor f;
    public final LocationInteractor g;
    public final ProductFinderOnboardingInteractorImpl h;
    public final AnalyticsManager i;
    public final MutableStateFlow j;
    public final StateFlow k;
    public final SharedFlowImpl l;
    public final SharedFlowImpl m;
    public final RecentSearchDao n;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderViewModel$1", f = "ProductFinderViewModel.kt", l = {61}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderViewModel$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ProductFinderViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            try {
                if (i == 0) {
                    ResultKt.b(obj);
                    InstoreNavigationInteractor instoreNavigationInteractor = ProductFinderViewModel.this.f;
                    this.p = 1;
                    if (instoreNavigationInteractor.g(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
            } catch (Throwable th) {
                if (th instanceof CancellationException) {
                    throw th;
                }
                Timber.f27013a.c(th);
            }
            return Unit.f24250a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ProductFinderContract.LocationServicesUnavailableState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ProductFinderContract.LocationServicesUnavailableState locationServicesUnavailableState = ProductFinderContract.LocationServicesUnavailableState.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ProductFinderContract.LocationServicesUnavailableState locationServicesUnavailableState2 = ProductFinderContract.LocationServicesUnavailableState.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ProductFinderViewModel(CollectionModeInteractor collectionModeInteractor, InstoreNavigationInteractor instoreNavigationInteractor, LocationInteractor locationInteractor, WoolworthsSupermarketDatabase database, ProductFinderOnboardingInteractorImpl productFinderOnboardingInteractorImpl, AnalyticsManager analyticsManager, FeatureToggleManager featureToggleManager) {
        String str;
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(instoreNavigationInteractor, "instoreNavigationInteractor");
        Intrinsics.h(locationInteractor, "locationInteractor");
        Intrinsics.h(database, "database");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.e = collectionModeInteractor;
        this.f = instoreNavigationInteractor;
        this.g = locationInteractor;
        this.h = productFinderOnboardingInteractorImpl;
        this.i = analyticsManager;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new ProductFinderContract.ViewState(null, null, 63));
        this.j = mutableStateFlowA;
        this.k = FlowKt.b(mutableStateFlowA);
        if (!featureToggleManager.c(BaseShopAppFeature.u)) {
            BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass1(null), 3);
        }
        ProductFinderContract.ViewState viewState = (ProductFinderContract.ViewState) mutableStateFlowA.getValue();
        Store storeH = collectionModeInteractor.h();
        mutableStateFlowA.setValue(ProductFinderContract.ViewState.a(viewState, (storeH == null || (str = storeH.f) == null) ? "" : str, null, null, 59));
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.l = sharedFlowImplB;
        this.m = sharedFlowImplB;
        this.n = database.t();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object p6(au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderViewModel r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            boolean r0 = r5 instanceof au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderViewModel$fetchRecentSearches$1
            if (r0 == 0) goto L13
            r0 = r5
            au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderViewModel$fetchRecentSearches$1 r0 = (au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderViewModel$fetchRecentSearches$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderViewModel$fetchRecentSearches$1 r0 = new au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderViewModel$fetchRecentSearches$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r5)
            goto L46
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            kotlin.ResultKt.b(r5)
            au.com.woolworths.android.onesite.database.RecentSearchDao r5 = r4.n
            io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe r5 = r5.b()
            io.reactivex.internal.operators.observable.ObservableFromPublisher r2 = new io.reactivex.internal.operators.observable.ObservableFromPublisher
            r2.<init>(r5)
            r0.r = r3
            java.lang.Object r5 = kotlinx.coroutines.rx2.RxAwaitKt.c(r2, r0)
            if (r5 != r1) goto L46
            return r1
        L46:
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L81
            kotlinx.coroutines.flow.MutableStateFlow r4 = r4.j
            java.lang.Object r0 = r4.getValue()
            au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderContract$ViewState r0 = (au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderContract.ViewState) r0
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.CollectionsKt.s(r5, r2)
            r1.<init>(r2)
            java.util.Iterator r5 = r5.iterator()
        L63:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L77
            java.lang.Object r2 = r5.next()
            au.com.woolworths.android.onesite.models.search.RecentSearch r2 = (au.com.woolworths.android.onesite.models.search.RecentSearch) r2
            java.lang.String r2 = r2.getSearchTerm()
            r1.add(r2)
            goto L63
        L77:
            r5 = 55
            r2 = 0
            au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderContract$ViewState r5 = au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderContract.ViewState.a(r0, r2, r1, r2, r5)
            r4.setValue(r5)
        L81:
            kotlin.Unit r4 = kotlin.Unit.f24250a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderViewModel.p6(au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderViewModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderCallbacks
    public final void C4() {
        this.i.g(ProductFinderAnalytics.ProductFinder.Action.g);
        String strA = this.e.a();
        if (strA == null) {
            strA = "";
        }
        this.l.f(new ProductFinderContract.Action.LaunchStoreDetails(strA));
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderCallbacks
    public final void J5() {
        this.i.f(ProductFinderAnalytics.ProductFinder.d);
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderCallbacks
    public final void b() {
        this.l.f(ProductFinderContract.Action.LaunchSearch.f7431a);
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderCallbacks
    public final void d2() {
        CloseableCoroutineScope closeableCoroutineScopeA = ViewModelKt.a(this);
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        BuildersKt.c(closeableCoroutineScopeA, DefaultIoScheduler.f, null, new ProductFinderViewModel$onClearRecentClick$1(this, null), 2);
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderCallbacks
    public final void g2() {
        this.l.f(ProductFinderContract.Action.Back.f7428a);
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderCallbacks
    public final void h() {
        this.i.g(ProductFinderAnalytics.ProductFinder.Action.f);
        this.l.f(ProductFinderContract.Action.LaunchOlive.f7430a);
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderCallbacks
    public final void j2(ProductFinderContract.LocationServicesUnavailableState state) {
        Intrinsics.h(state, "state");
        int iOrdinal = state.ordinal();
        AnalyticsManager analyticsManager = this.i;
        if (iOrdinal == 0) {
            analyticsManager.g(ProductFinderAnalytics.ProductFinder.Action.e);
        } else if (iOrdinal == 1) {
            analyticsManager.g(ProductFinderAnalytics.ProductFinder.Action.d);
        } else if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int iOrdinal2 = state.ordinal();
        SharedFlowImpl sharedFlowImpl = this.l;
        if (iOrdinal2 == 0) {
            sharedFlowImpl.f(ProductFinderContract.Action.ShowPermissionsDialog.f7434a);
        } else if (iOrdinal2 == 1) {
            sharedFlowImpl.f(ProductFinderContract.Action.GoToSettings.f7429a);
        } else {
            if (iOrdinal2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            sharedFlowImpl.f(ProductFinderContract.Action.TurnOnDeviceLocation.f7435a);
        }
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderCallbacks
    public final void p1(String searchTerm) {
        Intrinsics.h(searchTerm, "searchTerm");
        ProductFinderAnalytics.ProductFinder productFinder = ProductFinderAnalytics.ProductFinder.d;
        Category category = Category.g;
        this.i.g(AnalyticsDataKt.b(productFinder, new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, "search", "Search", (String) null, SearchIntents.EXTRA_QUERY, (String) null, "search_query", (List) null, 1359, (DefaultConstructorMarker) null)));
        this.l.f(new ProductFinderContract.Action.LaunchSearchResult(searchTerm));
    }

    public final void q6() {
        MutableStateFlow mutableStateFlow = this.j;
        ProductFinderContract.ViewState viewState = (ProductFinderContract.ViewState) mutableStateFlow.getValue();
        LocationInteractor locationInteractor = this.g;
        mutableStateFlow.setValue(ProductFinderContract.ViewState.a(viewState, null, null, !LocationsKt.b(locationInteractor.f8946a) ? locationInteractor.e() ? ProductFinderContract.LocationServicesUnavailableState.e : ProductFinderContract.LocationServicesUnavailableState.d : !locationInteractor.d() ? ProductFinderContract.LocationServicesUnavailableState.f : null, 31));
    }
}
