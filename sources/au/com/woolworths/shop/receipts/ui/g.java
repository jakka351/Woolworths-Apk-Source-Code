package au.com.woolworths.shop.receipts.ui;

import androidx.compose.material.ModalBottomSheetState;
import androidx.paging.compose.LazyPagingItems;
import au.com.woolworths.shop.receipts.ReceiptListContract;
import au.com.woolworths.shop.receipts.ShopReceiptListViewModel;
import au.com.woolworths.shop.receipts.analytics.ReceiptListActions;
import au.com.woolworths.shop.receipts.data.ReceiptListItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final /* synthetic */ class g implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Unit unit = Unit.f24250a;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                BuildersKt.c((CoroutineScope) obj2, null, null, new ReceiptListScreenKt$ReceiptListScreen$5$2$1$1$1((ModalBottomSheetState) obj, null), 3);
                break;
            case 1:
                ((Function1) obj2).invoke((ReceiptListItem) obj);
                break;
            case 2:
                float f = ReceiptListScreenKt.f12881a;
                ((ReceiptListContract.ReceiptListAnalyticsHandler) obj2).r4();
                ((LazyPagingItems) obj).e();
                break;
            default:
                ((ShopReceiptListViewModel) obj2).f.c(ReceiptListActions.n);
                ((Function0) obj).invoke();
                break;
        }
        return unit;
    }
}
