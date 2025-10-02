package au.com.woolworths.shop.receipts.ui;

import androidx.compose.material.ModalBottomSheetState;
import androidx.paging.LoadState;
import androidx.paging.PagingLogger;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.LazyPagingItems$pagingDataPresenter$1;
import au.com.woolworths.shop.receipts.ReceiptListContract;
import au.com.woolworths.shop.receipts.ShopReceiptListViewModel;
import au.com.woolworths.shop.receipts.analytics.ReceiptListActions;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ d(int i, Object obj, Object obj2, Object obj3) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Unit unit = Unit.f24250a;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                float f = ReceiptListScreenKt.f12881a;
                BuildersKt.c((CoroutineScope) obj3, null, null, new ReceiptListScreenKt$ReceiptListScreen$3$1$1((ModalBottomSheetState) obj2, (Function0) obj, null), 3);
                break;
            case 1:
                float f2 = ReceiptListScreenKt.f12881a;
                ((ReceiptListContract.ReceiptListAnalyticsHandler) obj2).R2();
                BuildersKt.c((CoroutineScope) obj3, null, null, new ReceiptListScreenKt$ReceiptListScreenContent$pullRefreshState$1$1$1((LazyPagingItems) obj, null), 3);
                break;
            case 2:
                ((ShopReceiptListViewModel) obj).f.c(ReceiptListActions.m);
                BuildersKt.c((CoroutineScope) obj3, null, null, new ReceiptListScreenKt$ReceiptListScreen$4$1$1$1((ModalBottomSheetState) obj2, null), 3);
                break;
            default:
                float f3 = ReceiptListScreenKt.f12881a;
                ((ReceiptListContract.ReceiptListAnalyticsHandler) obj3).f3(((LoadState.Error) ((LoadState) obj2)).b);
                LazyPagingItems$pagingDataPresenter$1 lazyPagingItems$pagingDataPresenter$1 = ((LazyPagingItems) obj).c;
                lazyPagingItems$pagingDataPresenter$1.getClass();
                if (PagingLogger.a(3)) {
                    PagingLogger.b(3, "Refresh signal received");
                }
                lazyPagingItems$pagingDataPresenter$1.c.h();
                break;
        }
        return unit;
    }

    public /* synthetic */ d(ReceiptListContract.ReceiptListAnalyticsHandler receiptListAnalyticsHandler, CoroutineScope coroutineScope, LazyPagingItems lazyPagingItems) {
        this.d = 1;
        this.f = receiptListAnalyticsHandler;
        this.e = coroutineScope;
        this.g = lazyPagingItems;
    }

    public /* synthetic */ d(ShopReceiptListViewModel shopReceiptListViewModel, CoroutineScope coroutineScope, ModalBottomSheetState modalBottomSheetState) {
        this.d = 2;
        this.g = shopReceiptListViewModel;
        this.e = coroutineScope;
        this.f = modalBottomSheetState;
    }
}
