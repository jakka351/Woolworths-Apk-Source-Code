package au.com.woolworths.android.onesite.modules.search.searchscreen;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.adobe.data.ActionData;
import au.com.woolworths.android.onesite.analytics.adobe.data.SearchAnalyticsMetadata;
import au.com.woolworths.android.onesite.database.RecentSearchDao;
import au.com.woolworths.android.onesite.database.WoolworthsSupermarketDatabase;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.search.SearchScreenListener;
import au.com.woolworths.android.onesite.modules.search.analytics.SearchScreens;
import au.com.woolworths.android.onesite.modules.search.searchscreen.SearchContract;
import au.com.woolworths.android.onesite.modules.search.searchscreen.SearchableItem;
import au.com.woolworths.android.onesite.network.NetworkExceptions;
import au.com.woolworths.android.onesite.repository.ReleaseSettingsInteractorImpl;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.base.shopapp.appdata.LegacyShopAnalyticsManager;
import au.com.woolworths.base.shopapp.modules.search.SearchKeywordType;
import au.com.woolworths.feature.shop.trafficdrivers.TrafficDriversInteractor;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.editorder.EditOrderEventHandler;
import au.com.woolworths.foundation.shop.editorder.analytics.EditOrderActions;
import au.com.woolworths.shop.buyagain.domain.BuyAgainEntryPointInteractor;
import dagger.assisted.AssistedFactory;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.internal.operators.flowable.FlowableElementAtMaybe;
import io.reactivex.internal.operators.maybe.MaybeCallbackObserver;
import io.reactivex.internal.operators.maybe.MaybeSubscribeOn;
import io.reactivex.internal.operators.observable.ObservableDoOnEach;
import io.reactivex.subjects.PublishSubject;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/android/onesite/modules/search/SearchScreenListener;", "Lau/com/woolworths/foundation/shop/editorder/EditOrderEventHandler;", "Factory", "Companion", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SearchViewModel extends ViewModel implements SearchScreenListener, EditOrderEventHandler {
    public final ScreenOptions e;
    public final CollectionModeInteractor f;
    public final SchedulersProvider g;
    public final AnalyticsManager h;
    public final SearchInteractor i;
    public final LegacyShopAnalyticsManager j;
    public final NetworkExceptions k;
    public final TrafficDriversInteractor l;
    public final ShopAppRegionInteractor m;
    public final ReleaseSettingsInteractorImpl n;
    public final String o;
    public final PublishSubject p;
    public final CompositeDisposable q;
    public final PublishSubject r;
    public final RecentSearchDao s;
    public final String t;
    public final SharedFlowImpl u;
    public final SharedFlow v;
    public final MutableLiveData w;
    public final MutableLiveData x;
    public final LiveData y;
    public final SearchViewConditionsChecker z;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchViewModel$Companion;", "", "", "MIN_SEARCH_LEN", "I", "MAX_RECENT_SEARCH_COUNT", "", "MIN_QUERY_CHAR_ERROR", "Ljava/lang/String;", "MARKETPLACE_SEARCH_QUERY", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @AssistedFactory
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchViewModel$Factory;", "", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        SearchViewModel a(ScreenOptions screenOptions);
    }

    public SearchViewModel(ScreenOptions screenOptions, CollectionModeInteractor collectionModeInteractor, SchedulersProvider schedulersProvider, AnalyticsManager analyticsManager, SearchInteractor searchInteractor, LegacyShopAnalyticsManager legacyShopAnalyticsManager, NetworkExceptions networkExceptions, TrafficDriversInteractor trafficDriversInteractor, ShopAppRegionInteractor shopAppRegionInteractor, ReleaseSettingsInteractorImpl releaseSettingsInteractorImpl, BuyAgainEntryPointInteractor buyAgainEntryPointInteractor, FeatureToggleManager featureToggleManager, WoolworthsSupermarketDatabase database) throws Exception {
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(schedulersProvider, "schedulersProvider");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(legacyShopAnalyticsManager, "legacyShopAnalyticsManager");
        Intrinsics.h(networkExceptions, "networkExceptions");
        Intrinsics.h(trafficDriversInteractor, "trafficDriversInteractor");
        Intrinsics.h(shopAppRegionInteractor, "shopAppRegionInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(database, "database");
        this.e = screenOptions;
        this.f = collectionModeInteractor;
        this.g = schedulersProvider;
        this.h = analyticsManager;
        this.i = searchInteractor;
        this.j = legacyShopAnalyticsManager;
        this.k = networkExceptions;
        this.l = trafficDriversInteractor;
        this.m = shopAppRegionInteractor;
        this.n = releaseSettingsInteractorImpl;
        this.o = "Search screen";
        PublishSubject publishSubject = new PublishSubject();
        this.p = publishSubject;
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        this.q = compositeDisposable;
        PublishSubject publishSubject2 = new PublishSubject();
        this.r = publishSubject2;
        this.s = database.t();
        this.t = "";
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.u = sharedFlowImplB;
        this.v = FlowKt.a(sharedFlowImplB);
        MutableLiveData mutableLiveData = new MutableLiveData(new SearchContract.ViewState((String) null, (List) null, (SearchContract.ViewState.Screen) null, false, 31));
        this.w = mutableLiveData;
        this.x = mutableLiveData;
        this.y = LiveDataReactiveStreams.a(new ObservableDoOnEach(publishSubject.j(new c(5, new k(this, 1))).i(schedulersProvider.d()).f(schedulersProvider.b()), new c(6, new k(this, 2))).l(BackpressureStrategy.e));
        this.z = new SearchViewConditionsChecker(screenOptions, buyAgainEntryPointInteractor, featureToggleManager, shopAppRegionInteractor);
        Observable observableJ = publishSubject2.f(schedulersProvider.d()).j(new c(7, new k(this, 3)));
        LambdaObserver lambdaObserver = new LambdaObserver(Functions.d, Functions.e);
        observableJ.a(lambdaObserver);
        compositeDisposable.d(lambdaObserver);
        StringsKt.D(this.t);
    }

    @Override // au.com.woolworths.foundation.shop.editorder.EditOrderEventHandler
    public final void F3(Text text) {
        BuildersKt.c(ViewModelKt.a(this), null, null, new SearchViewModel$onCancellationSuccess$1(this, text, null), 3);
    }

    @Override // au.com.woolworths.foundation.shop.editorder.EditOrderEventHandler
    public final void F4() {
        this.h.c(new EditOrderActions.ConfirmCancellationWarningDialog(SearchScreens.d));
        MutableLiveData mutableLiveData = this.w;
        SearchContract.ViewState viewState = (SearchContract.ViewState) mutableLiveData.e();
        mutableLiveData.m(viewState != null ? SearchContract.ViewState.a(viewState, true) : null);
    }

    @Override // au.com.woolworths.foundation.shop.editorder.EditOrderEventHandler
    public final void c6() {
        this.h.c(new EditOrderActions.CancellationWarmingDialogImpression(SearchScreens.d));
    }

    @Override // au.com.woolworths.foundation.shop.editorder.EditOrderEventHandler
    public final void k1() {
        this.h.c(new EditOrderActions.CancelEditModeClick(SearchScreens.d));
    }

    @Override // androidx.lifecycle.ViewModel
    public final void o6() {
        this.q.e();
    }

    public final void p6(String str) {
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.j(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        String string = str.subSequence(i, length + 1).toString();
        if (StringsKt.D(string)) {
            return;
        }
        FlowableElementAtMaybe flowableElementAtMaybe = new FlowableElementAtMaybe(this.s.b());
        Scheduler schedulerD = this.g.d();
        ObjectHelper.b(schedulerD, "scheduler is null");
        new MaybeSubscribeOn(flowableElementAtMaybe, schedulerD).a(new MaybeCallbackObserver(new c(4, new j(string, this))));
    }

    @Override // au.com.woolworths.foundation.shop.editorder.EditOrderEventHandler
    public final void q0() {
        this.h.c(new EditOrderActions.CloseCancellationWarningDialog(SearchScreens.d));
    }

    public final void q6(SearchableItem item) {
        String str;
        SearchAnalyticsMetadata searchAnalyticsMetadata;
        Intrinsics.h(item, "item");
        if (item instanceof SearchableItem.AutoCompleteItem) {
            str = ((SearchableItem.AutoCompleteItem) item).f4426a;
            searchAnalyticsMetadata = new SearchAnalyticsMetadata(SearchKeywordType.h);
        } else if (item instanceof SearchableItem.SuggestedSearch) {
            str = ((SearchableItem.SuggestedSearch) item).f4429a;
            searchAnalyticsMetadata = new SearchAnalyticsMetadata(SearchKeywordType.f);
        } else {
            if (!(item instanceof SearchableItem.PopularSuggestedSearch)) {
                return;
            }
            str = ((SearchableItem.PopularSuggestedSearch) item).f4428a;
            searchAnalyticsMetadata = new SearchAnalyticsMetadata(SearchKeywordType.e);
        }
        this.u.f(new SearchContract.Actions.PerformQuerySearch(str, searchAnalyticsMetadata));
        p6(str);
    }

    public final void r6() {
        ActionData actionDataA = ActionData.Companion.a("Barcode Scanner Click");
        actionDataA.b(this.o);
        actionDataA.c = "1";
        this.j.d(actionDataA);
        this.u.f(new SearchContract.Actions.OpenBarcodeScanner(this.f.b()));
    }

    @Override // au.com.woolworths.foundation.shop.editorder.EditOrderEventHandler
    public final void v3(Text text) {
        BuildersKt.c(ViewModelKt.a(this), null, null, new SearchViewModel$onCancellationFailure$1(this, text, null), 3);
    }
}
