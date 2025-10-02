package au.com.woolworths.android.onesite.modules.search.searchscreen;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.analytics.model.EventConfig;
import au.com.woolworths.android.onesite.models.ApiError;
import au.com.woolworths.android.onesite.models.search.AutoCompleteResponse;
import au.com.woolworths.android.onesite.models.search.AutocompleteResponseItem;
import au.com.woolworths.android.onesite.models.search.RecentSearch;
import au.com.woolworths.android.onesite.modules.search.searchscreen.SearchContract;
import au.com.woolworths.android.onesite.modules.search.searchscreen.SearchableItem;
import au.com.woolworths.android.onesite.network.NetworkExceptions;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.feature.shop.trafficdrivers.data.TrafficDriverItem;
import au.com.woolworths.feature.shop.trafficdrivers.data.TrafficDrivers;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import retrofit2.HttpException;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ SearchViewModel e;
    public final /* synthetic */ String f;

    public /* synthetic */ j(SearchViewModel searchViewModel, String str, int i) {
        this.d = i;
        this.e = searchViewModel;
        this.f = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List<SearchableItem.FeaturedBrandItem> listW0;
        ArrayList arrayList;
        ArrayList arrayList2;
        ApiError apiError;
        switch (this.d) {
            case 0:
                ArrayList arrayList3 = new ArrayList();
                String str = this.f;
                arrayList3.add(new RecentSearch(str));
                for (RecentSearch recentSearch : (List) obj) {
                    if (!StringsKt.y(recentSearch.getSearchTerm(), str, true)) {
                        arrayList3.add(recentSearch);
                    }
                }
                int size = arrayList3.size();
                ArrayList arrayListSubList = arrayList3;
                if (size > 5) {
                    arrayListSubList = arrayList3.subList(0, 5);
                }
                this.e.s.d(arrayListSubList);
                return Unit.f24250a;
            case 1:
                AutoCompleteResponse response = (AutoCompleteResponse) obj;
                Intrinsics.h(response, "response");
                String str2 = this.f;
                String string = StringsKt.k0(str2).toString();
                List<AutocompleteResponseItem> suggestions = response.getSuggestions();
                SearchViewModel searchViewModel = this.e;
                TrafficDrivers trafficDrivers = (TrafficDrivers) searchViewModel.l.c.getValue();
                if (trafficDrivers != null) {
                    ArrayList arrayList4 = trafficDrivers.c;
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj2 : arrayList4) {
                        Iterable iterable = (Iterable) ((TrafficDriverItem) obj2).d;
                        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                            Iterator it = iterable.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                if (StringsKt.y(StringsKt.k0((String) it.next()).toString(), string, true)) {
                                    arrayList5.add(obj2);
                                }
                            }
                        }
                    }
                    ArrayList arrayList6 = new ArrayList(CollectionsKt.s(arrayList5, 10));
                    Iterator it2 = arrayList5.iterator();
                    while (it2.hasNext()) {
                        arrayList6.add(new SearchableItem.FeaturedBrandItem(string, (TrafficDriverItem) it2.next(), trafficDrivers.d));
                    }
                    listW0 = CollectionsKt.w0(arrayList6, trafficDrivers.f8213a);
                } else {
                    listW0 = null;
                }
                ArrayList arrayList7 = new ArrayList();
                Iterator it3 = suggestions.iterator();
                while (it3.hasNext()) {
                    arrayList7.add(new SearchableItem.AutoCompleteItem(((AutocompleteResponseItem) it3.next()).getResult()));
                }
                List list = listW0;
                if (list == null || list.isEmpty()) {
                    arrayList = arrayList7;
                } else {
                    int i = trafficDrivers.b;
                    if (i < 0 || i > arrayList7.size()) {
                        arrayList7.addAll(list);
                    } else {
                        arrayList7.addAll(trafficDrivers.b, list);
                    }
                    ArrayList arrayList8 = new ArrayList();
                    for (SearchableItem.FeaturedBrandItem featuredBrandItem : listW0) {
                        AnalyticsData analyticsData = featuredBrandItem.b.g;
                        AnalyticsData analyticsDataC = analyticsData != null ? AnalyticsDataKt.c(analyticsData, featuredBrandItem.c, false) : null;
                        if (analyticsDataC != null) {
                            arrayList8.add(analyticsDataC);
                        }
                    }
                    if (arrayList8.isEmpty()) {
                        arrayList2 = arrayList7;
                        return new SearchContract.ViewState(str2, (List) arrayList2, SearchContract.ViewState.Screen.f, false, 24);
                    }
                    arrayList = arrayList7;
                    AnalyticsData analyticsData2 = new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, string, (String) null, (String) null, (String) null, (String) null, (List) null, 2015, (DefaultConstructorMarker) null);
                    Iterator it4 = arrayList8.iterator();
                    while (it4.hasNext()) {
                        analyticsData2 = AnalyticsDataKt.c((AnalyticsData) it4.next(), analyticsData2, false);
                    }
                    searchViewModel.h.g(AnalyticsDataKt.a(analyticsData2));
                }
                arrayList2 = arrayList;
                return new SearchContract.ViewState(str2, (List) arrayList2, SearchContract.ViewState.Screen.f, false, 24);
            default:
                Throwable throwable = (Throwable) obj;
                Intrinsics.h(throwable, "throwable");
                NetworkExceptions networkExceptions = this.e.k;
                networkExceptions.getClass();
                HttpException httpExceptionA = NetworkExceptions.a(throwable);
                if ((httpExceptionA != null && httpExceptionA.d == 404) || (NetworkExceptions.c(throwable) && (apiError = (ApiError) networkExceptions.b(throwable, ApiError.class)) != null && apiError.getErrorCode() != null && Intrinsics.c(apiError.getErrorCode(), "AC001"))) {
                    ArrayList arrayList9 = new ArrayList(1);
                    String str3 = this.f;
                    arrayList9.add(new SearchableItem.AutoCompleteItem(str3));
                    return Observable.e(new SearchContract.ViewState(str3, (List) arrayList9, SearchContract.ViewState.Screen.f, false, 24));
                }
                Timber.f27013a.p(throwable);
                networkExceptions.getClass();
                boolean z = throwable instanceof NoConnectivityException;
                EmptyList emptyList = EmptyList.d;
                return z ? Observable.e(new SearchContract.ViewState((String) null, (List) emptyList, SearchContract.ViewState.Screen.d, false, 25)) : Observable.e(new SearchContract.ViewState((String) null, (List) emptyList, SearchContract.ViewState.Screen.e, false, 25));
        }
    }

    public /* synthetic */ j(String str, SearchViewModel searchViewModel) {
        this.d = 0;
        this.f = str;
        this.e = searchViewModel;
    }
}
