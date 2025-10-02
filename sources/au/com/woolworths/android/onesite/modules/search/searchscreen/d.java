package au.com.woolworths.android.onesite.modules.search.searchscreen;

import android.view.View;
import androidx.appcompat.widget.SearchView;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.modules.search.analytics.ProductFinderTrackingKt;
import au.com.woolworths.android.onesite.modules.search.analytics.SearchActions;
import au.com.woolworths.android.onesite.modules.search.searchscreen.SearchContract;
import com.dynatrace.android.callback.Callback;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                SearchActivity searchActivity = (SearchActivity) obj;
                int i2 = SearchActivity.R;
                Callback.g(view);
                try {
                    SearchView searchView = searchActivity.H;
                    if (searchView != null) {
                        searchActivity.onQueryTextChange(searchView.getQuery().toString());
                        return;
                    } else {
                        Intrinsics.p("searchView");
                        throw null;
                    }
                } finally {
                }
            case 1:
                SearchActivity searchActivity2 = (SearchActivity) obj;
                int i3 = SearchActivity.R;
                Callback.g(view);
                try {
                    SearchView searchView2 = searchActivity2.H;
                    if (searchView2 != null) {
                        searchActivity2.onQueryTextChange(searchView2.getQuery().toString());
                        return;
                    } else {
                        Intrinsics.p("searchView");
                        throw null;
                    }
                } finally {
                }
            case 2:
                SearchActivity searchActivity3 = (SearchActivity) obj;
                int i4 = SearchActivity.R;
                Callback.g(view);
                try {
                    SearchViewModel searchViewModelT4 = searchActivity3.T4();
                    boolean z = searchActivity3.S4().j;
                    AnalyticsManager analyticsManager = searchViewModelT4.h;
                    if (z) {
                        analyticsManager.g(ProductFinderTrackingKt.a());
                    } else {
                        analyticsManager.c(SearchActions.f);
                    }
                    searchViewModelT4.u.f(SearchContract.Actions.LaunchVoiceProductFinder.f4414a);
                    return;
                } finally {
                }
            default:
                SearchAutoCompleteAdapter searchAutoCompleteAdapter = (SearchAutoCompleteAdapter) obj;
                Callback.g(view);
                try {
                    SearchAutoCompleteAdapter.G(searchAutoCompleteAdapter);
                    return;
                } finally {
                }
        }
    }
}
