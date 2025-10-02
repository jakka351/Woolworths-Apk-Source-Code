package au.com.woolworths.android.onesite.modules.search.searchscreen;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.models.search.AutoCompleteResponse;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.modules.search.analytics.SearchScreens;
import au.com.woolworths.android.onesite.modules.search.searchscreen.SearchContract;
import au.com.woolworths.android.onesite.modules.search.searchscreen.SearchableItem;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.shop.buyagain.analytics.BuyAgainEntryActions;
import io.reactivex.Observable;
import io.reactivex.functions.Action;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.internal.operators.completable.CompletableFromAction;
import io.reactivex.internal.operators.completable.CompletableToObservable;
import io.reactivex.internal.operators.observable.ObservableFromPublisher;
import io.reactivex.internal.operators.observable.ObservableMap;
import io.reactivex.internal.operators.observable.ObservableOnErrorNext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ SearchViewModel e;

    public /* synthetic */ k(SearchViewModel searchViewModel, int i) {
        this.d = i;
        this.e = searchViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object observableMap;
        int i = this.d;
        int i2 = 0;
        int i3 = 1;
        final SearchViewModel searchViewModel = this.e;
        switch (i) {
            case 0:
                List searchableItems = (List) obj;
                Intrinsics.h(searchableItems, "searchableItems");
                ArrayList arrayList = new ArrayList();
                List list = searchableItems;
                if (!list.isEmpty()) {
                    arrayList.add(new SearchableItem.HeaderItem());
                    arrayList.addAll(list);
                }
                if (searchViewModel.z.d.b() == Region.j) {
                    arrayList.add(new SearchableItem.PopularHeaderItem());
                    List list2 = SearchContract.ViewState.Companion.WhenMappings.f4423a[searchViewModel.m.b().ordinal()] == 1 ? SearchContract.ViewState.g : SearchContract.ViewState.f;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new SearchableItem.PopularSuggestedSearch((String) it.next()));
                    }
                    arrayList.addAll(arrayList2);
                }
                return new SearchContract.ViewState((String) null, arrayList, SearchContract.ViewState.Screen.g, searchViewModel.e.c, 17);
            case 1:
                String searchTerm = (String) obj;
                Intrinsics.h(searchTerm, "searchTerm");
                int length = searchTerm.length();
                EmptyList emptyList = EmptyList.d;
                if (length <= 0) {
                    observableMap = new ObservableMap(new ObservableMap(searchViewModel.e.c ? new ObservableFromPublisher(searchViewModel.s.b()) : Observable.e(emptyList), new c(8, new androidx.navigation.a(28))).i(searchViewModel.g.d()), new c(1, new k(searchViewModel, i2)));
                } else {
                    if (searchTerm.length() < 3) {
                        return Observable.e(new SearchContract.ViewState(searchTerm, (List) emptyList, SearchContract.ViewState.Screen.f, false, 24));
                    }
                    SearchInteractor searchInteractor = searchViewModel.i;
                    searchInteractor.getClass();
                    Observable<AutoCompleteResponse> observableE = searchInteractor.b.e(YU.a.g(searchInteractor.f4424a.a(), "/autocomplete"), MapsKt.i(new Pair("q", searchTerm)));
                    SchedulersProvider schedulersProvider = searchInteractor.c;
                    observableMap = new ObservableOnErrorNext(new ObservableMap(observableE.i(schedulersProvider.d()).f(schedulersProvider.b()), new c(2, new j(searchViewModel, searchTerm, i3))), new c(3, new j(searchViewModel, searchTerm, 2)));
                }
                return observableMap;
            case 2:
                SearchContract.ViewState viewState = (SearchContract.ViewState) obj;
                if (searchViewModel.z.a()) {
                    AnalyticsManager analyticsManager = searchViewModel.h;
                    SearchScreens searchScreens = SearchScreens.d;
                    analyticsManager.c(new BuyAgainEntryActions.EntryPointImpression());
                }
                Timber.f27013a.b("onNext: " + viewState, new Object[0]);
                return Unit.f24250a;
            default:
                Unit it2 = (Unit) obj;
                Intrinsics.h(it2, "it");
                CompletableFromAction completableFromAction = new CompletableFromAction(new Action() { // from class: au.com.woolworths.android.onesite.modules.search.searchscreen.l
                    @Override // io.reactivex.functions.Action
                    public final void run() {
                        searchViewModel.s.a();
                    }
                });
                return completableFromAction instanceof FuseToObservable ? ((FuseToObservable) completableFromAction).b() : new CompletableToObservable(completableFromAction);
        }
    }
}
