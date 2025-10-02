package au.com.woolworths.android.onesite.modules.search.searchscreen;

import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.SavedStateHandle;
import au.com.woolworths.android.onesite.legacy.databinding.ActivitySearchBinding;
import au.com.woolworths.android.onesite.legacy.databinding.IncludeConnectionErrorBinding;
import au.com.woolworths.android.onesite.legacy.databinding.IncludeSearchSuggestionBinding;
import au.com.woolworths.android.onesite.legacy.databinding.IncludeUnableToLoadBinding;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.modules.search.searchscreen.SearchContract;
import au.com.woolworths.android.onesite.modules.search.searchscreen.SearchViewModel;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.utils.Logout;
import au.com.woolworths.feature.product.list.legacy.compose.productsearch.SearchTile;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import java.util.LinkedList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ SearchActivity e;

    public /* synthetic */ a(SearchActivity searchActivity, int i) {
        this.d = i;
        this.e = searchActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        final int i2 = 0;
        final int i3 = 1;
        Unit unit = Unit.f24250a;
        final SearchActivity searchActivity = this.e;
        switch (i) {
            case 0:
                SearchContract.ViewState viewState = (SearchContract.ViewState) obj;
                int i4 = SearchActivity.R;
                SearchContract.ViewState.Screen screen = viewState.c;
                List result = viewState.b;
                int iOrdinal = screen.ordinal();
                int i5 = 3;
                if (iOrdinal == 0) {
                    IncludeConnectionErrorBinding includeConnectionErrorBinding = searchActivity.K;
                    if (includeConnectionErrorBinding == null) {
                        Intrinsics.p("connectionErrorLayoutBinding");
                        throw null;
                    }
                    includeConnectionErrorBinding.h.setVisibility(0);
                    IncludeUnableToLoadBinding includeUnableToLoadBinding = searchActivity.J;
                    if (includeUnableToLoadBinding == null) {
                        Intrinsics.p("unableToLoadLayoutBinding");
                        throw null;
                    }
                    includeUnableToLoadBinding.h.setVisibility(8);
                } else if (iOrdinal == 1) {
                    IncludeConnectionErrorBinding includeConnectionErrorBinding2 = searchActivity.K;
                    if (includeConnectionErrorBinding2 == null) {
                        Intrinsics.p("connectionErrorLayoutBinding");
                        throw null;
                    }
                    includeConnectionErrorBinding2.h.setVisibility(8);
                    IncludeUnableToLoadBinding includeUnableToLoadBinding2 = searchActivity.J;
                    if (includeUnableToLoadBinding2 == null) {
                        Intrinsics.p("unableToLoadLayoutBinding");
                        throw null;
                    }
                    includeUnableToLoadBinding2.h.setVisibility(0);
                } else if (iOrdinal == 2) {
                    String str = viewState.f4422a;
                    if (str != null) {
                        SearchAutoCompleteAdapter searchAutoCompleteAdapter = searchActivity.L;
                        if (searchAutoCompleteAdapter == null) {
                            Intrinsics.p("autoCompleteAdapter");
                            throw null;
                        }
                        searchAutoCompleteAdapter.h = str;
                    }
                    ActivitySearchBinding activitySearchBinding = searchActivity.I;
                    if (activitySearchBinding == null) {
                        Intrinsics.p("activityBinding");
                        throw null;
                    }
                    ComposeView vpsEntryPoint = activitySearchBinding.G;
                    Intrinsics.g(vpsEntryPoint, "vpsEntryPoint");
                    SearchViewConditionsChecker searchViewConditionsChecker = searchActivity.T4().z;
                    vpsEntryPoint.setVisibility((searchViewConditionsChecker.f4425a.d && ((Boolean) searchViewConditionsChecker.e.getD()).booleanValue() && searchViewConditionsChecker.d.b() != Region.j) ? 0 : 8);
                    ActivitySearchBinding activitySearchBinding2 = searchActivity.I;
                    if (activitySearchBinding2 == null) {
                        Intrinsics.p("activityBinding");
                        throw null;
                    }
                    IncludeSearchSuggestionBinding includeSearchSuggestionBinding = activitySearchBinding2.A;
                    includeSearchSuggestionBinding.A.setVisibility(8);
                    includeSearchSuggestionBinding.z.setVisibility(8);
                    SearchAutoCompleteAdapter searchAutoCompleteAdapter2 = searchActivity.L;
                    if (searchAutoCompleteAdapter2 == null) {
                        Intrinsics.p("autoCompleteAdapter");
                        throw null;
                    }
                    Intrinsics.h(result, "result");
                    LinkedList linkedList = searchAutoCompleteAdapter2.i;
                    linkedList.clear();
                    linkedList.addAll(result);
                    searchActivity.runOnUiThread(new Runnable() { // from class: au.com.woolworths.android.onesite.modules.search.searchscreen.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    SearchAutoCompleteAdapter searchAutoCompleteAdapter3 = searchActivity.L;
                                    if (searchAutoCompleteAdapter3 != null) {
                                        searchAutoCompleteAdapter3.l();
                                        return;
                                    } else {
                                        Intrinsics.p("autoCompleteAdapter");
                                        throw null;
                                    }
                                default:
                                    SearchAutoCompleteAdapter searchAutoCompleteAdapter4 = searchActivity.L;
                                    if (searchAutoCompleteAdapter4 != null) {
                                        searchAutoCompleteAdapter4.l();
                                        return;
                                    } else {
                                        Intrinsics.p("autoCompleteAdapter");
                                        throw null;
                                    }
                            }
                        }
                    });
                    IncludeConnectionErrorBinding includeConnectionErrorBinding3 = searchActivity.K;
                    if (includeConnectionErrorBinding3 == null) {
                        Intrinsics.p("connectionErrorLayoutBinding");
                        throw null;
                    }
                    includeConnectionErrorBinding3.h.setVisibility(8);
                    IncludeUnableToLoadBinding includeUnableToLoadBinding3 = searchActivity.J;
                    if (includeUnableToLoadBinding3 == null) {
                        Intrinsics.p("unableToLoadLayoutBinding");
                        throw null;
                    }
                    includeUnableToLoadBinding3.h.setVisibility(8);
                } else {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ActivitySearchBinding activitySearchBinding3 = searchActivity.I;
                    if (activitySearchBinding3 == null) {
                        Intrinsics.p("activityBinding");
                        throw null;
                    }
                    activitySearchBinding3.G.setVisibility(8);
                    ActivitySearchBinding activitySearchBinding4 = searchActivity.I;
                    if (activitySearchBinding4 == null) {
                        Intrinsics.p("activityBinding");
                        throw null;
                    }
                    IncludeSearchSuggestionBinding includeSearchSuggestionBinding2 = activitySearchBinding4.A;
                    ComposeView searchTiles = includeSearchSuggestionBinding2.A;
                    Intrinsics.g(searchTiles, "searchTiles");
                    SearchViewConditionsChecker searchViewConditionsChecker2 = searchActivity.T4().z;
                    searchViewConditionsChecker2.getClass();
                    searchTiles.setVisibility((searchViewConditionsChecker2.b(SearchTile.d) || searchViewConditionsChecker2.b(SearchTile.e)) ? 0 : 8);
                    ComposeView searchRows = includeSearchSuggestionBinding2.z;
                    Intrinsics.g(searchRows, "searchRows");
                    SearchViewConditionsChecker searchViewConditionsChecker3 = searchActivity.T4().z;
                    searchViewConditionsChecker3.getClass();
                    if (!searchViewConditionsChecker3.b(SearchTile.f) && !searchViewConditionsChecker3.b(SearchTile.g) && !searchViewConditionsChecker3.b(SearchTile.h)) {
                        i2 = 8;
                    }
                    searchRows.setVisibility(i2);
                    SearchAutoCompleteAdapter searchAutoCompleteAdapter3 = searchActivity.L;
                    if (searchAutoCompleteAdapter3 == null) {
                        Intrinsics.p("autoCompleteAdapter");
                        throw null;
                    }
                    Intrinsics.h(result, "result");
                    LinkedList linkedList2 = searchAutoCompleteAdapter3.i;
                    linkedList2.clear();
                    linkedList2.addAll(result);
                    searchActivity.runOnUiThread(new Runnable() { // from class: au.com.woolworths.android.onesite.modules.search.searchscreen.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i3) {
                                case 0:
                                    SearchAutoCompleteAdapter searchAutoCompleteAdapter32 = searchActivity.L;
                                    if (searchAutoCompleteAdapter32 != null) {
                                        searchAutoCompleteAdapter32.l();
                                        return;
                                    } else {
                                        Intrinsics.p("autoCompleteAdapter");
                                        throw null;
                                    }
                                default:
                                    SearchAutoCompleteAdapter searchAutoCompleteAdapter4 = searchActivity.L;
                                    if (searchAutoCompleteAdapter4 != null) {
                                        searchAutoCompleteAdapter4.l();
                                        return;
                                    } else {
                                        Intrinsics.p("autoCompleteAdapter");
                                        throw null;
                                    }
                            }
                        }
                    });
                    IncludeConnectionErrorBinding includeConnectionErrorBinding4 = searchActivity.K;
                    if (includeConnectionErrorBinding4 == null) {
                        Intrinsics.p("connectionErrorLayoutBinding");
                        throw null;
                    }
                    includeConnectionErrorBinding4.h.setVisibility(8);
                    IncludeUnableToLoadBinding includeUnableToLoadBinding4 = searchActivity.J;
                    if (includeUnableToLoadBinding4 == null) {
                        Intrinsics.p("unableToLoadLayoutBinding");
                        throw null;
                    }
                    includeUnableToLoadBinding4.h.setVisibility(8);
                }
                searchActivity.T4().x.f(searchActivity, new SearchActivity$sam$androidx_lifecycle_Observer$0(new a(searchActivity, i5)));
                return unit;
            case 1:
                ShopAccountInteractor shopAccountInteractor = searchActivity.C;
                if (shopAccountInteractor != null) {
                    Logout.a(searchActivity, shopAccountInteractor);
                    return unit;
                }
                Intrinsics.p("accountInteractor");
                throw null;
            case 2:
                SavedStateHandle it = (SavedStateHandle) obj;
                int i6 = SearchActivity.R;
                Intrinsics.h(it, "it");
                SearchViewModel.Factory factory = searchActivity.F;
                if (factory != null) {
                    return factory.a(new ScreenOptions(searchActivity.R4().e, searchActivity.R4().f, searchActivity.R4().g, searchActivity.R4().i, searchActivity.R4().h, searchActivity.S4() == Activities.ProductList.ProductListType.t));
                }
                Intrinsics.p("viewModelFactory");
                throw null;
            default:
                SearchContract.ViewState viewState2 = (SearchContract.ViewState) obj;
                ActivitySearchBinding activitySearchBinding5 = searchActivity.I;
                if (activitySearchBinding5 != null) {
                    activitySearchBinding5.L(Boolean.valueOf(viewState2.e));
                    return unit;
                }
                Intrinsics.p("activityBinding");
                throw null;
        }
    }
}
