package au.com.woolworths.shop.receipts;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.CachedPagingDataKt;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.c;
import au.com.woolworths.shop.receipts.ReceiptListContract;
import au.com.woolworths.shop.receipts.analytics.ReceiptListActions;
import au.com.woolworths.shop.receipts.pagination.NoReceiptsError;
import au.com.woolworths.shop.receipts.pagination.ReceiptPaginationAdapter;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/receipts/ShopReceiptListViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/shop/receipts/ReceiptListContract$ReceiptListAnalyticsHandler;", "Companion", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ShopReceiptListViewModel extends ViewModel implements ReceiptListContract.ReceiptListAnalyticsHandler {
    public final ReceiptPaginationAdapter e;
    public final AnalyticsManager f;
    public final SharedFlowImpl g;
    public final Flow h;
    public final MutableStateFlow i;
    public final StateFlow j;
    public final Flow k;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/receipts/ShopReceiptListViewModel$Companion;", "", "", "PAGE_SIZE", "I", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ShopReceiptListViewModel(GetReceiptListInteractor getReceiptListInteractor, ReceiptPaginationAdapter receiptPaginationAdapter, AnalyticsManager analyticsManager) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = receiptPaginationAdapter;
        this.f = analyticsManager;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.g = sharedFlowImplB;
        this.h = FlowKt.a(sharedFlowImplB);
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new ReceiptListContract.ViewState());
        this.i = mutableStateFlowA;
        this.j = FlowKt.b(mutableStateFlowA);
        this.k = CachedPagingDataKt.a(new Pager(new PagingConfig(10, 0, 0, 62, false), new c(this, 3)).f3571a, ViewModelKt.a(this));
    }

    @Override // au.com.woolworths.shop.receipts.ReceiptListContract.ReceiptListAnalyticsHandler
    public final void H4() {
        this.f.c(ReceiptListActions.e);
    }

    @Override // au.com.woolworths.shop.receipts.ReceiptListContract.ReceiptListAnalyticsHandler
    public final void M1() {
        this.f.c(ReceiptListActions.h);
    }

    @Override // au.com.woolworths.shop.receipts.ReceiptListContract.ReceiptListAnalyticsHandler
    public final void O5() {
        this.f.c(ReceiptListActions.o);
    }

    @Override // au.com.woolworths.shop.receipts.ReceiptListContract.ReceiptListAnalyticsHandler
    public final void R2() {
        this.f.c(ReceiptListActions.g);
    }

    @Override // au.com.woolworths.shop.receipts.ReceiptListContract.ReceiptListAnalyticsHandler
    public final void S(Throwable error) {
        Intrinsics.h(error, "error");
        this.f.c(error instanceof NoReceiptsError ? ReceiptListActions.u : error instanceof NoConnectivityException ? ReceiptListActions.q : ReceiptListActions.s);
    }

    @Override // au.com.woolworths.shop.receipts.ReceiptListContract.ReceiptListAnalyticsHandler
    public final void Y0() {
        this.f.c(ReceiptListActions.f);
    }

    @Override // au.com.woolworths.shop.receipts.ReceiptListContract.ReceiptListAnalyticsHandler
    public final void Y3() {
        this.f.c(ReceiptListActions.k);
    }

    @Override // au.com.woolworths.shop.receipts.ReceiptListContract.ReceiptListAnalyticsHandler
    public final void f3(Throwable error) {
        Intrinsics.h(error, "error");
        this.f.c(error instanceof NoConnectivityException ? ReceiptListActions.r : ReceiptListActions.t);
    }

    @Override // au.com.woolworths.shop.receipts.ReceiptListContract.ReceiptListAnalyticsHandler
    public final void k2() {
        this.f.c(ReceiptListActions.i);
    }

    @Override // au.com.woolworths.shop.receipts.ReceiptListContract.ReceiptListAnalyticsHandler
    public final void m2() {
        this.f.c(ReceiptListActions.j);
    }

    @Override // au.com.woolworths.shop.receipts.ReceiptListContract.ReceiptListAnalyticsHandler
    public final void r4() {
        this.f.c(ReceiptListActions.p);
    }
}
