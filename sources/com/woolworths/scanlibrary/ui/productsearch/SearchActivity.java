package com.woolworths.scanlibrary.ui.productsearch;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.database.MatrixCursor;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.SearchView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.paging.AsyncPagedListDiffer;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.LinearLayoutManager;
import au.com.woolworths.android.onesite.extensions.ActivityExtKt;
import au.com.woolworths.android.onesite.extensions.ViewExtKt;
import au.com.woolworths.pagingutils.NetworkState;
import com.google.android.gms.actions.SearchIntents;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.woolworths.R;
import com.woolworths.scanlibrary.analytics.AnalyticsProvider;
import com.woolworths.scanlibrary.analytics.ProductSearchTracking;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmActivity;
import com.woolworths.scanlibrary.base.mvp.MvpView;
import com.woolworths.scanlibrary.base.mvvm.CommonViewAction;
import com.woolworths.scanlibrary.databinding.ActivitySearchSngBinding;
import com.woolworths.scanlibrary.di.user.UserScopedActivity;
import com.woolworths.scanlibrary.models.error.ApigeeErrorResponse;
import com.woolworths.scanlibrary.ui.productsearch.adapter.ProductSearchResultItemAdapter;
import com.woolworths.scanlibrary.ui.productsearch.adapter.SuggestionCursorAdapter;
import com.woolworths.scanlibrary.util.event.Event;
import com.woolworths.scanlibrary.util.widget.ProductSearchView;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.security.cert.CertPathValidatorException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okhttp3.ResponseBody;
import retrofit2.HttpException;
import retrofit2.Response;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/scanlibrary/ui/productsearch/SearchActivity;", "Lcom/woolworths/scanlibrary/base/dagger/DaggerBaseMvvmActivity;", "Lcom/woolworths/scanlibrary/di/user/UserScopedActivity;", "<init>", "()V", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SearchActivity extends DaggerBaseMvvmActivity implements UserScopedActivity {
    public static final /* synthetic */ int M = 0;
    public ActivitySearchSngBinding F;
    public SuggestionCursorAdapter G;
    public ProductSearchResultItemAdapter H;
    public ProductSearchView J;
    public final String[] K;
    public final MatrixCursor L;
    public final ViewModelLazy E = new ViewModelLazy(Reflection.f24268a.b(SearchViewModel.class), new Function0<ViewModelStore>() { // from class: com.woolworths.scanlibrary.ui.productsearch.SearchActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new a(this, 0), new Function0<CreationExtras>() { // from class: com.woolworths.scanlibrary.ui.productsearch.SearchActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final ArrayList I = new ArrayList();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/woolworths/scanlibrary/ui/productsearch/SearchActivity$Companion;", "", "", "KEY_SEARCH_BY_SHOPPING_ITEM_NAME", "Ljava/lang/String;", "", "SEARCH_SUGGEST_THRESHOLD", "I", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static void a(Activity activity) {
            Intent intent = new Intent(activity, (Class<?>) SearchActivity.class);
            intent.addFlags(0);
            activity.startActivity(intent);
        }
    }

    public SearchActivity() {
        String[] strArr = {"_id", "suggest_text_1", "suggest_intent_data"};
        this.K = strArr;
        this.L = new MatrixCursor(strArr);
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmActivity
    public final int O4() {
        return R.layout.activity_search_sng;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmActivity
    public final void R4() {
        ActivitySearchSngBinding activitySearchSngBinding = (ActivitySearchSngBinding) DataBindingUtil.d(this, R.layout.activity_search_sng);
        this.F = activitySearchSngBinding;
        if (activitySearchSngBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        V4();
        ActivitySearchSngBinding activitySearchSngBinding2 = this.F;
        if (activitySearchSngBinding2 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activitySearchSngBinding2.D(this);
        SearchViewModel searchViewModelV4 = V4();
        final int i = 0;
        searchViewModelV4.o.f21299a.f(this, new Observer(this) { // from class: com.woolworths.scanlibrary.ui.productsearch.b
            public final /* synthetic */ SearchActivity e;

            {
                this.e = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ResponseBody responseBody;
                int i2 = i;
                ApigeeErrorResponse apigeeErrorResponse = null;
                SearchActivity searchActivity = this.e;
                switch (i2) {
                    case 0:
                        Pair pair = (Pair) obj;
                        int i3 = SearchActivity.M;
                        MatrixCursor matrixCursor = new MatrixCursor(searchActivity.K);
                        ArrayList arrayList = searchActivity.I;
                        arrayList.clear();
                        List list = pair != null ? (List) pair.e : null;
                        Intrinsics.e(list);
                        arrayList.addAll(list);
                        int size = arrayList.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            matrixCursor.addRow(new String[]{String.valueOf(i4), arrayList.get(i4), arrayList.get(i4)});
                        }
                        SuggestionCursorAdapter suggestionCursorAdapter = searchActivity.G;
                        if (suggestionCursorAdapter == null) {
                            Intrinsics.p("suggestionCursorAdapter");
                            throw null;
                        }
                        String str = (String) pair.d;
                        Intrinsics.h(str, "<set-?>");
                        suggestionCursorAdapter.m = str;
                        SuggestionCursorAdapter suggestionCursorAdapter2 = searchActivity.G;
                        if (suggestionCursorAdapter2 != null) {
                            suggestionCursorAdapter2.a(matrixCursor);
                            return;
                        } else {
                            Intrinsics.p("suggestionCursorAdapter");
                            throw null;
                        }
                    case 1:
                        PagedList it = (PagedList) obj;
                        int i5 = SearchActivity.M;
                        Intrinsics.h(it, "it");
                        if (it.isEmpty()) {
                            ActivitySearchSngBinding activitySearchSngBinding3 = searchActivity.F;
                            if (activitySearchSngBinding3 == null) {
                                Intrinsics.p("viewBinding");
                                throw null;
                            }
                            activitySearchSngBinding3.D.setVisibility(8);
                            ActivitySearchSngBinding activitySearchSngBinding4 = searchActivity.F;
                            if (activitySearchSngBinding4 == null) {
                                Intrinsics.p("viewBinding");
                                throw null;
                            }
                            activitySearchSngBinding4.A.setVisibility(0);
                            ActivitySearchSngBinding activitySearchSngBinding5 = searchActivity.F;
                            if (activitySearchSngBinding5 == null) {
                                Intrinsics.p("viewBinding");
                                throw null;
                            }
                            activitySearchSngBinding5.z.setVisibility(0);
                            ActivitySearchSngBinding activitySearchSngBinding6 = searchActivity.F;
                            if (activitySearchSngBinding6 != null) {
                                activitySearchSngBinding6.A.setText(searchActivity.getString(R.string.sng_product_search_no_result_msg));
                                return;
                            } else {
                                Intrinsics.p("viewBinding");
                                throw null;
                            }
                        }
                        ActivitySearchSngBinding activitySearchSngBinding7 = searchActivity.F;
                        if (activitySearchSngBinding7 == null) {
                            Intrinsics.p("viewBinding");
                            throw null;
                        }
                        activitySearchSngBinding7.D.setVisibility(0);
                        ActivitySearchSngBinding activitySearchSngBinding8 = searchActivity.F;
                        if (activitySearchSngBinding8 == null) {
                            Intrinsics.p("viewBinding");
                            throw null;
                        }
                        activitySearchSngBinding8.A.setVisibility(8);
                        ActivitySearchSngBinding activitySearchSngBinding9 = searchActivity.F;
                        if (activitySearchSngBinding9 == null) {
                            Intrinsics.p("viewBinding");
                            throw null;
                        }
                        activitySearchSngBinding9.z.setVisibility(8);
                        ProductSearchView productSearchView = searchActivity.J;
                        if (productSearchView == null) {
                            Intrinsics.p("searchView");
                            throw null;
                        }
                        View viewFindViewById = productSearchView.findViewById(R.id.search_src_text);
                        Intrinsics.f(viewFindViewById, "null cannot be cast to non-null type androidx.appcompat.widget.SearchView.SearchAutoComplete");
                        ((SearchView.SearchAutoComplete) viewFindViewById).dismissDropDown();
                        ProductSearchResultItemAdapter productSearchResultItemAdapter = searchActivity.H;
                        if (productSearchResultItemAdapter == null) {
                            Intrinsics.p("productSearchResultItemAdapter");
                            throw null;
                        }
                        productSearchResultItemAdapter.g.e(it);
                        ActivityExtKt.a(searchActivity);
                        return;
                    default:
                        NetworkState networkState = (NetworkState) obj;
                        ProductSearchResultItemAdapter productSearchResultItemAdapter2 = searchActivity.H;
                        if (productSearchResultItemAdapter2 == null) {
                            Intrinsics.p("productSearchResultItemAdapter");
                            throw null;
                        }
                        AsyncPagedListDiffer asyncPagedListDiffer = productSearchResultItemAdapter2.g;
                        NetworkState networkState2 = productSearchResultItemAdapter2.j;
                        boolean zH = productSearchResultItemAdapter2.H();
                        productSearchResultItemAdapter2.j = networkState;
                        boolean zH2 = productSearchResultItemAdapter2.H();
                        if (zH != zH2) {
                            if (zH) {
                                productSearchResultItemAdapter2.t(asyncPagedListDiffer.b());
                            } else {
                                productSearchResultItemAdapter2.o(asyncPagedListDiffer.b());
                            }
                        } else if (zH2 && !Intrinsics.c(networkState2, networkState)) {
                            productSearchResultItemAdapter2.m(productSearchResultItemAdapter2.i() - 1);
                        }
                        if (networkState != null) {
                            Throwable th = networkState.c;
                            if (!(th instanceof HttpException)) {
                                if (th instanceof Exception) {
                                    searchActivity.V4().f.j(new Event(new CommonViewAction.NonApplicationError(th instanceof SocketTimeoutException ? MvpView.ErrorType.d : ((th instanceof CertPathValidatorException) || (th instanceof IOException)) ? MvpView.ErrorType.e : MvpView.ErrorType.f)));
                                    return;
                                }
                                return;
                            }
                            HttpException httpException = (HttpException) th;
                            int i6 = httpException.d;
                            try {
                                Gson gson = new Gson();
                                Response response = httpException.e;
                                apigeeErrorResponse = (ApigeeErrorResponse) gson.d(ApigeeErrorResponse.class, (response == null || (responseBody = response.c) == null) ? null : responseBody.d());
                            } catch (JsonSyntaxException unused) {
                            }
                            if (i6 == 401) {
                                searchActivity.V4().f.j(new Event(new CommonViewAction.ApplicationError(i6, apigeeErrorResponse, 21)));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        final int i2 = 1;
        searchViewModelV4.r.f(this, new Observer(this) { // from class: com.woolworths.scanlibrary.ui.productsearch.b
            public final /* synthetic */ SearchActivity e;

            {
                this.e = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ResponseBody responseBody;
                int i22 = i2;
                ApigeeErrorResponse apigeeErrorResponse = null;
                SearchActivity searchActivity = this.e;
                switch (i22) {
                    case 0:
                        Pair pair = (Pair) obj;
                        int i3 = SearchActivity.M;
                        MatrixCursor matrixCursor = new MatrixCursor(searchActivity.K);
                        ArrayList arrayList = searchActivity.I;
                        arrayList.clear();
                        List list = pair != null ? (List) pair.e : null;
                        Intrinsics.e(list);
                        arrayList.addAll(list);
                        int size = arrayList.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            matrixCursor.addRow(new String[]{String.valueOf(i4), arrayList.get(i4), arrayList.get(i4)});
                        }
                        SuggestionCursorAdapter suggestionCursorAdapter = searchActivity.G;
                        if (suggestionCursorAdapter == null) {
                            Intrinsics.p("suggestionCursorAdapter");
                            throw null;
                        }
                        String str = (String) pair.d;
                        Intrinsics.h(str, "<set-?>");
                        suggestionCursorAdapter.m = str;
                        SuggestionCursorAdapter suggestionCursorAdapter2 = searchActivity.G;
                        if (suggestionCursorAdapter2 != null) {
                            suggestionCursorAdapter2.a(matrixCursor);
                            return;
                        } else {
                            Intrinsics.p("suggestionCursorAdapter");
                            throw null;
                        }
                    case 1:
                        PagedList it = (PagedList) obj;
                        int i5 = SearchActivity.M;
                        Intrinsics.h(it, "it");
                        if (it.isEmpty()) {
                            ActivitySearchSngBinding activitySearchSngBinding3 = searchActivity.F;
                            if (activitySearchSngBinding3 == null) {
                                Intrinsics.p("viewBinding");
                                throw null;
                            }
                            activitySearchSngBinding3.D.setVisibility(8);
                            ActivitySearchSngBinding activitySearchSngBinding4 = searchActivity.F;
                            if (activitySearchSngBinding4 == null) {
                                Intrinsics.p("viewBinding");
                                throw null;
                            }
                            activitySearchSngBinding4.A.setVisibility(0);
                            ActivitySearchSngBinding activitySearchSngBinding5 = searchActivity.F;
                            if (activitySearchSngBinding5 == null) {
                                Intrinsics.p("viewBinding");
                                throw null;
                            }
                            activitySearchSngBinding5.z.setVisibility(0);
                            ActivitySearchSngBinding activitySearchSngBinding6 = searchActivity.F;
                            if (activitySearchSngBinding6 != null) {
                                activitySearchSngBinding6.A.setText(searchActivity.getString(R.string.sng_product_search_no_result_msg));
                                return;
                            } else {
                                Intrinsics.p("viewBinding");
                                throw null;
                            }
                        }
                        ActivitySearchSngBinding activitySearchSngBinding7 = searchActivity.F;
                        if (activitySearchSngBinding7 == null) {
                            Intrinsics.p("viewBinding");
                            throw null;
                        }
                        activitySearchSngBinding7.D.setVisibility(0);
                        ActivitySearchSngBinding activitySearchSngBinding8 = searchActivity.F;
                        if (activitySearchSngBinding8 == null) {
                            Intrinsics.p("viewBinding");
                            throw null;
                        }
                        activitySearchSngBinding8.A.setVisibility(8);
                        ActivitySearchSngBinding activitySearchSngBinding9 = searchActivity.F;
                        if (activitySearchSngBinding9 == null) {
                            Intrinsics.p("viewBinding");
                            throw null;
                        }
                        activitySearchSngBinding9.z.setVisibility(8);
                        ProductSearchView productSearchView = searchActivity.J;
                        if (productSearchView == null) {
                            Intrinsics.p("searchView");
                            throw null;
                        }
                        View viewFindViewById = productSearchView.findViewById(R.id.search_src_text);
                        Intrinsics.f(viewFindViewById, "null cannot be cast to non-null type androidx.appcompat.widget.SearchView.SearchAutoComplete");
                        ((SearchView.SearchAutoComplete) viewFindViewById).dismissDropDown();
                        ProductSearchResultItemAdapter productSearchResultItemAdapter = searchActivity.H;
                        if (productSearchResultItemAdapter == null) {
                            Intrinsics.p("productSearchResultItemAdapter");
                            throw null;
                        }
                        productSearchResultItemAdapter.g.e(it);
                        ActivityExtKt.a(searchActivity);
                        return;
                    default:
                        NetworkState networkState = (NetworkState) obj;
                        ProductSearchResultItemAdapter productSearchResultItemAdapter2 = searchActivity.H;
                        if (productSearchResultItemAdapter2 == null) {
                            Intrinsics.p("productSearchResultItemAdapter");
                            throw null;
                        }
                        AsyncPagedListDiffer asyncPagedListDiffer = productSearchResultItemAdapter2.g;
                        NetworkState networkState2 = productSearchResultItemAdapter2.j;
                        boolean zH = productSearchResultItemAdapter2.H();
                        productSearchResultItemAdapter2.j = networkState;
                        boolean zH2 = productSearchResultItemAdapter2.H();
                        if (zH != zH2) {
                            if (zH) {
                                productSearchResultItemAdapter2.t(asyncPagedListDiffer.b());
                            } else {
                                productSearchResultItemAdapter2.o(asyncPagedListDiffer.b());
                            }
                        } else if (zH2 && !Intrinsics.c(networkState2, networkState)) {
                            productSearchResultItemAdapter2.m(productSearchResultItemAdapter2.i() - 1);
                        }
                        if (networkState != null) {
                            Throwable th = networkState.c;
                            if (!(th instanceof HttpException)) {
                                if (th instanceof Exception) {
                                    searchActivity.V4().f.j(new Event(new CommonViewAction.NonApplicationError(th instanceof SocketTimeoutException ? MvpView.ErrorType.d : ((th instanceof CertPathValidatorException) || (th instanceof IOException)) ? MvpView.ErrorType.e : MvpView.ErrorType.f)));
                                    return;
                                }
                                return;
                            }
                            HttpException httpException = (HttpException) th;
                            int i6 = httpException.d;
                            try {
                                Gson gson = new Gson();
                                Response response = httpException.e;
                                apigeeErrorResponse = (ApigeeErrorResponse) gson.d(ApigeeErrorResponse.class, (response == null || (responseBody = response.c) == null) ? null : responseBody.d());
                            } catch (JsonSyntaxException unused) {
                            }
                            if (i6 == 401) {
                                searchActivity.V4().f.j(new Event(new CommonViewAction.ApplicationError(i6, apigeeErrorResponse, 21)));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        searchViewModelV4.t.f(this, new androidx.compose.runtime.livedata.a(searchViewModelV4, 11));
        final int i3 = 2;
        searchViewModelV4.s.f(this, new Observer(this) { // from class: com.woolworths.scanlibrary.ui.productsearch.b
            public final /* synthetic */ SearchActivity e;

            {
                this.e = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ResponseBody responseBody;
                int i22 = i3;
                ApigeeErrorResponse apigeeErrorResponse = null;
                SearchActivity searchActivity = this.e;
                switch (i22) {
                    case 0:
                        Pair pair = (Pair) obj;
                        int i32 = SearchActivity.M;
                        MatrixCursor matrixCursor = new MatrixCursor(searchActivity.K);
                        ArrayList arrayList = searchActivity.I;
                        arrayList.clear();
                        List list = pair != null ? (List) pair.e : null;
                        Intrinsics.e(list);
                        arrayList.addAll(list);
                        int size = arrayList.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            matrixCursor.addRow(new String[]{String.valueOf(i4), arrayList.get(i4), arrayList.get(i4)});
                        }
                        SuggestionCursorAdapter suggestionCursorAdapter = searchActivity.G;
                        if (suggestionCursorAdapter == null) {
                            Intrinsics.p("suggestionCursorAdapter");
                            throw null;
                        }
                        String str = (String) pair.d;
                        Intrinsics.h(str, "<set-?>");
                        suggestionCursorAdapter.m = str;
                        SuggestionCursorAdapter suggestionCursorAdapter2 = searchActivity.G;
                        if (suggestionCursorAdapter2 != null) {
                            suggestionCursorAdapter2.a(matrixCursor);
                            return;
                        } else {
                            Intrinsics.p("suggestionCursorAdapter");
                            throw null;
                        }
                    case 1:
                        PagedList it = (PagedList) obj;
                        int i5 = SearchActivity.M;
                        Intrinsics.h(it, "it");
                        if (it.isEmpty()) {
                            ActivitySearchSngBinding activitySearchSngBinding3 = searchActivity.F;
                            if (activitySearchSngBinding3 == null) {
                                Intrinsics.p("viewBinding");
                                throw null;
                            }
                            activitySearchSngBinding3.D.setVisibility(8);
                            ActivitySearchSngBinding activitySearchSngBinding4 = searchActivity.F;
                            if (activitySearchSngBinding4 == null) {
                                Intrinsics.p("viewBinding");
                                throw null;
                            }
                            activitySearchSngBinding4.A.setVisibility(0);
                            ActivitySearchSngBinding activitySearchSngBinding5 = searchActivity.F;
                            if (activitySearchSngBinding5 == null) {
                                Intrinsics.p("viewBinding");
                                throw null;
                            }
                            activitySearchSngBinding5.z.setVisibility(0);
                            ActivitySearchSngBinding activitySearchSngBinding6 = searchActivity.F;
                            if (activitySearchSngBinding6 != null) {
                                activitySearchSngBinding6.A.setText(searchActivity.getString(R.string.sng_product_search_no_result_msg));
                                return;
                            } else {
                                Intrinsics.p("viewBinding");
                                throw null;
                            }
                        }
                        ActivitySearchSngBinding activitySearchSngBinding7 = searchActivity.F;
                        if (activitySearchSngBinding7 == null) {
                            Intrinsics.p("viewBinding");
                            throw null;
                        }
                        activitySearchSngBinding7.D.setVisibility(0);
                        ActivitySearchSngBinding activitySearchSngBinding8 = searchActivity.F;
                        if (activitySearchSngBinding8 == null) {
                            Intrinsics.p("viewBinding");
                            throw null;
                        }
                        activitySearchSngBinding8.A.setVisibility(8);
                        ActivitySearchSngBinding activitySearchSngBinding9 = searchActivity.F;
                        if (activitySearchSngBinding9 == null) {
                            Intrinsics.p("viewBinding");
                            throw null;
                        }
                        activitySearchSngBinding9.z.setVisibility(8);
                        ProductSearchView productSearchView = searchActivity.J;
                        if (productSearchView == null) {
                            Intrinsics.p("searchView");
                            throw null;
                        }
                        View viewFindViewById = productSearchView.findViewById(R.id.search_src_text);
                        Intrinsics.f(viewFindViewById, "null cannot be cast to non-null type androidx.appcompat.widget.SearchView.SearchAutoComplete");
                        ((SearchView.SearchAutoComplete) viewFindViewById).dismissDropDown();
                        ProductSearchResultItemAdapter productSearchResultItemAdapter = searchActivity.H;
                        if (productSearchResultItemAdapter == null) {
                            Intrinsics.p("productSearchResultItemAdapter");
                            throw null;
                        }
                        productSearchResultItemAdapter.g.e(it);
                        ActivityExtKt.a(searchActivity);
                        return;
                    default:
                        NetworkState networkState = (NetworkState) obj;
                        ProductSearchResultItemAdapter productSearchResultItemAdapter2 = searchActivity.H;
                        if (productSearchResultItemAdapter2 == null) {
                            Intrinsics.p("productSearchResultItemAdapter");
                            throw null;
                        }
                        AsyncPagedListDiffer asyncPagedListDiffer = productSearchResultItemAdapter2.g;
                        NetworkState networkState2 = productSearchResultItemAdapter2.j;
                        boolean zH = productSearchResultItemAdapter2.H();
                        productSearchResultItemAdapter2.j = networkState;
                        boolean zH2 = productSearchResultItemAdapter2.H();
                        if (zH != zH2) {
                            if (zH) {
                                productSearchResultItemAdapter2.t(asyncPagedListDiffer.b());
                            } else {
                                productSearchResultItemAdapter2.o(asyncPagedListDiffer.b());
                            }
                        } else if (zH2 && !Intrinsics.c(networkState2, networkState)) {
                            productSearchResultItemAdapter2.m(productSearchResultItemAdapter2.i() - 1);
                        }
                        if (networkState != null) {
                            Throwable th = networkState.c;
                            if (!(th instanceof HttpException)) {
                                if (th instanceof Exception) {
                                    searchActivity.V4().f.j(new Event(new CommonViewAction.NonApplicationError(th instanceof SocketTimeoutException ? MvpView.ErrorType.d : ((th instanceof CertPathValidatorException) || (th instanceof IOException)) ? MvpView.ErrorType.e : MvpView.ErrorType.f)));
                                    return;
                                }
                                return;
                            }
                            HttpException httpException = (HttpException) th;
                            int i6 = httpException.d;
                            try {
                                Gson gson = new Gson();
                                Response response = httpException.e;
                                apigeeErrorResponse = (ApigeeErrorResponse) gson.d(ApigeeErrorResponse.class, (response == null || (responseBody = response.c) == null) ? null : responseBody.d());
                            } catch (JsonSyntaxException unused) {
                            }
                            if (i6 == 401) {
                                searchActivity.V4().f.j(new Event(new CommonViewAction.ApplicationError(i6, apigeeErrorResponse, 21)));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        U4(V4().f, V4().g);
        AnalyticsProvider analyticsProvider = this.x;
        if (analyticsProvider == null) {
            Intrinsics.p("analyticsAggregator");
            throw null;
        }
        analyticsProvider.a(new ProductSearchTracking("Product Search Screen"));
        ActivitySearchSngBinding activitySearchSngBinding3 = this.F;
        if (activitySearchSngBinding3 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        setSupportActionBar(activitySearchSngBinding3.E);
        ActivitySearchSngBinding activitySearchSngBinding4 = this.F;
        if (activitySearchSngBinding4 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activitySearchSngBinding4.F.setText(getResources().getString(R.string.sng_label_product_search));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.u();
            supportActionBar.s(false);
        }
        Object systemService = getSystemService("search");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.app.SearchManager");
        SearchManager searchManager = (SearchManager) systemService;
        ActivitySearchSngBinding activitySearchSngBinding5 = this.F;
        if (activitySearchSngBinding5 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        final ProductSearchView productSearchView = activitySearchSngBinding5.C;
        Intrinsics.f(productSearchView, "null cannot be cast to non-null type com.woolworths.scanlibrary.util.widget.ProductSearchView");
        this.J = productSearchView;
        productSearchView.setFocusable(true);
        productSearchView.setIconified(false);
        productSearchView.onActionViewExpanded();
        productSearchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        SuggestionCursorAdapter suggestionCursorAdapter = new SuggestionCursorAdapter(this);
        this.G = suggestionCursorAdapter;
        productSearchView.setSuggestionsAdapter(suggestionCursorAdapter);
        productSearchView.setOnSuggestionListener(new SearchView.OnSuggestionListener() { // from class: com.woolworths.scanlibrary.ui.productsearch.SearchActivity$setUpSearchBar$1$1
            @Override // androidx.appcompat.widget.SearchView.OnSuggestionListener
            public final void onSuggestionClick(int i4) {
                SearchActivity searchActivity = this;
                ArrayList arrayList = searchActivity.I;
                CharSequence charSequence = (CharSequence) arrayList.get(i4);
                ProductSearchView productSearchView2 = productSearchView;
                productSearchView2.s(charSequence, false);
                productSearchView2.clearFocus();
                searchActivity.V4().r6((String) arrayList.get(i4));
            }
        });
        productSearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() { // from class: com.woolworths.scanlibrary.ui.productsearch.SearchActivity$setUpSearchBar$1$2
            @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
            public final boolean onQueryTextChange(String newText) {
                Intrinsics.h(newText, "newText");
                int length = newText.length();
                SearchActivity searchActivity = this.d;
                if (length >= 4) {
                    SuggestionCursorAdapter suggestionCursorAdapter2 = searchActivity.G;
                    if (suggestionCursorAdapter2 == null) {
                        Intrinsics.p("suggestionCursorAdapter");
                        throw null;
                    }
                    suggestionCursorAdapter2.a(searchActivity.L);
                    searchActivity.V4().l.onNext(StringsKt.k0(newText).toString());
                    return true;
                }
                if (newText.length() != 0) {
                    return true;
                }
                ActivitySearchSngBinding activitySearchSngBinding6 = searchActivity.F;
                if (activitySearchSngBinding6 == null) {
                    Intrinsics.p("viewBinding");
                    throw null;
                }
                activitySearchSngBinding6.D.setVisibility(8);
                ActivitySearchSngBinding activitySearchSngBinding7 = searchActivity.F;
                if (activitySearchSngBinding7 == null) {
                    Intrinsics.p("viewBinding");
                    throw null;
                }
                activitySearchSngBinding7.A.setText(searchActivity.getString(R.string.sng_search_products_default_msg));
                ActivitySearchSngBinding activitySearchSngBinding8 = searchActivity.F;
                if (activitySearchSngBinding8 == null) {
                    Intrinsics.p("viewBinding");
                    throw null;
                }
                activitySearchSngBinding8.A.setVisibility(8);
                ActivitySearchSngBinding activitySearchSngBinding9 = searchActivity.F;
                if (activitySearchSngBinding9 == null) {
                    Intrinsics.p("viewBinding");
                    throw null;
                }
                activitySearchSngBinding9.z.setVisibility(0);
                ProductSearchResultItemAdapter productSearchResultItemAdapter = searchActivity.H;
                if (productSearchResultItemAdapter == null) {
                    Intrinsics.p("productSearchResultItemAdapter");
                    throw null;
                }
                if (productSearchResultItemAdapter.i() <= 0) {
                    return true;
                }
                ProductSearchResultItemAdapter productSearchResultItemAdapter2 = searchActivity.H;
                if (productSearchResultItemAdapter2 == null) {
                    Intrinsics.p("productSearchResultItemAdapter");
                    throw null;
                }
                productSearchResultItemAdapter2.g.e(null);
                searchActivity.V4().p.j("");
                return true;
            }

            @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
            public final boolean onQueryTextSubmit(String query) {
                Intrinsics.h(query, "query");
                SearchActivity searchActivity = this.d;
                SuggestionCursorAdapter suggestionCursorAdapter2 = searchActivity.G;
                if (suggestionCursorAdapter2 != null) {
                    suggestionCursorAdapter2.a(searchActivity.L);
                    return false;
                }
                Intrinsics.p("suggestionCursorAdapter");
                throw null;
            }
        });
        ActivitySearchSngBinding activitySearchSngBinding6 = this.F;
        if (activitySearchSngBinding6 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activitySearchSngBinding6.D.setLayoutManager(new LinearLayoutManager(this));
        ProductSearchResultItemAdapter productSearchResultItemAdapter = new ProductSearchResultItemAdapter(this, new a(this, 1));
        this.H = productSearchResultItemAdapter;
        ActivitySearchSngBinding activitySearchSngBinding7 = this.F;
        if (activitySearchSngBinding7 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activitySearchSngBinding7.D.setAdapter(productSearchResultItemAdapter);
        ActivitySearchSngBinding activitySearchSngBinding8 = this.F;
        if (activitySearchSngBinding8 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        ConstraintLayout rootContainer = activitySearchSngBinding8.B;
        Intrinsics.g(rootContainer, "rootContainer");
        ViewExtKt.b(rootContainer, new au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.b(17));
        ActivitySearchSngBinding activitySearchSngBinding9 = this.F;
        if (activitySearchSngBinding9 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activitySearchSngBinding9.y.setOnClickListener(new com.woolworths.scanlibrary.ui.parking.a(this, 9));
        if (getIntent().hasExtra("key.shopping_item.product.name")) {
            ProductSearchView productSearchView2 = this.J;
            if (productSearchView2 == null) {
                Intrinsics.p("searchView");
                throw null;
            }
            productSearchView2.s(getIntent().getStringExtra("key.shopping_item.product.name"), true);
            ActivityExtKt.a(this);
        }
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmActivity
    public final boolean S4() {
        return false;
    }

    public final SearchViewModel V4() {
        return (SearchViewModel) this.E.getD();
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        Intent intent = getIntent();
        Intrinsics.g(intent, "getIntent(...)");
        if (!"android.intent.action.SEARCH".equals(intent.getAction()) || (stringExtra = intent.getStringExtra(SearchIntents.EXTRA_QUERY)) == null) {
            return;
        }
        V4().r6(stringExtra);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        String stringExtra;
        Intrinsics.h(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        if (!"android.intent.action.SEARCH".equals(intent.getAction()) || (stringExtra = intent.getStringExtra(SearchIntents.EXTRA_QUERY)) == null) {
            return;
        }
        V4().r6(stringExtra);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        ProductSearchView productSearchView = this.J;
        if (productSearchView == null) {
            Intrinsics.p("searchView");
            throw null;
        }
        CharSequence query = productSearchView.getQuery();
        Intrinsics.g(query, "getQuery(...)");
        if (query.length() > 0) {
            ProductSearchView productSearchView2 = this.J;
            if (productSearchView2 == null) {
                Intrinsics.p("searchView");
                throw null;
            }
            View viewFindViewById = productSearchView2.findViewById(R.id.search_src_text);
            Intrinsics.f(viewFindViewById, "null cannot be cast to non-null type androidx.appcompat.widget.SearchView.SearchAutoComplete");
            SearchView.SearchAutoComplete searchAutoComplete = (SearchView.SearchAutoComplete) viewFindViewById;
            if (searchAutoComplete.getAdapter().isEmpty()) {
                return;
            }
            searchAutoComplete.showDropDown();
        }
    }
}
