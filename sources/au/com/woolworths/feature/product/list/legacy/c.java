package au.com.woolworths.feature.product.list.legacy;

import androidx.activity.OnBackPressedCallback;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.product.list.legacy.ComposeProductListActivityContract;
import au.com.woolworths.foundation.shop.olive.voice.OliveVoiceViewModel;
import au.com.woolworths.foundation.shop.olive.voice.SearchResult;
import au.com.woolworths.foundation.shop.olive.voice.VoiceSearchResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ComposeProductListActivity e;

    public /* synthetic */ c(ComposeProductListActivity composeProductListActivity, int i) {
        this.d = i;
        this.e = composeProductListActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        final ComposeProductListActivity composeProductListActivity = this.e;
        switch (i) {
            case 0:
                DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj;
                int i2 = ComposeProductListActivity.H;
                Intrinsics.h(DisposableEffect, "$this$DisposableEffect");
                ComposeProductListActivityViewModel composeProductListActivityViewModelQ4 = composeProductListActivity.Q4();
                MediatorLiveData initialNetworkState = composeProductListActivity.S4().C;
                Flow productListViewStateFlow = FlowLiveDataConversions.a(composeProductListActivity.S4().F);
                Flow productListActionsFlow = composeProductListActivity.S4().w;
                c cVar = new c(composeProductListActivity, 2);
                Intrinsics.h(initialNetworkState, "initialNetworkState");
                Intrinsics.h(productListViewStateFlow, "productListViewStateFlow");
                Intrinsics.h(productListActionsFlow, "productListActionsFlow");
                Timber.f27013a.b("SearchResultsCollection start", new Object[0]);
                composeProductListActivityViewModelQ4.h = BuildersKt.c(ViewModelKt.a(composeProductListActivityViewModelQ4), null, null, new ComposeProductListActivityViewModel$startSuccessSearchResultCollection$1(initialNetworkState, composeProductListActivityViewModelQ4, cVar, null), 3);
                composeProductListActivityViewModelQ4.i = BuildersKt.c(ViewModelKt.a(composeProductListActivityViewModelQ4), null, null, new ComposeProductListActivityViewModel$startFailureSearchResultCollection$1(productListViewStateFlow, productListActionsFlow, composeProductListActivityViewModelQ4, cVar, null), 3);
                break;
            case 1:
                OnBackPressedCallback addCallback = (OnBackPressedCallback) obj;
                int i3 = ComposeProductListActivity.H;
                Intrinsics.h(addCallback, "$this$addCallback");
                if (!((ComposeProductListActivityContract.ViewState) composeProductListActivity.Q4().k.getValue()).e) {
                    composeProductListActivity.Q4().l.f(ComposeProductListActivityContract.Action.NavigateUp.f5280a);
                    break;
                } else if (!composeProductListActivity.Q4().n) {
                    composeProductListActivity.finish();
                    break;
                } else {
                    composeProductListActivity.Q4().p6(false);
                    break;
                }
            case 2:
                SearchResult it = (SearchResult) obj;
                int i4 = ComposeProductListActivity.H;
                Intrinsics.h(it, "it");
                MutableStateFlow mutableStateFlow = composeProductListActivity.Q4().j;
                mutableStateFlow.setValue(ComposeProductListActivityContract.ViewState.a((ComposeProductListActivityContract.ViewState) mutableStateFlow.getValue(), null, null, false, false, false, false, 31));
                ((OliveVoiceViewModel) composeProductListActivity.E.getD()).r6(it);
                break;
            default:
                VoiceSearchResult searchResult = (VoiceSearchResult) obj;
                Intrinsics.h(searchResult, "searchResult");
                Timber.Forest forest = Timber.f27013a;
                String str = searchResult.f8818a;
                forest.o("execute search for ".concat(str), new Object[0]);
                int i5 = ComposeProductListActivity.H;
                MutableStateFlow mutableStateFlow2 = composeProductListActivity.Q4().j;
                mutableStateFlow2.setValue(ComposeProductListActivityContract.ViewState.a((ComposeProductListActivityContract.ViewState) mutableStateFlow2.getValue(), null, null, false, false, false, true, 31));
                Activities.ProductList.Extras extras = new Activities.ProductList.Extras(new Activities.ProductList.ExtrasPageData(str, null), new Activities.ProductList.ExtrasBySearch(str, searchResult.b, (String) null, composeProductListActivity.R4().e.getE(), 10), (Activities.ProductList.ExtrasConfig) null, 12);
                composeProductListActivity.Q4().q6(extras);
                composeProductListActivity.S4().Q6(extras);
                composeProductListActivity.getIntent().putExtra("EXTRA_PRODUCT_LIST_INFO", extras);
                break;
        }
        return unit;
    }
}
