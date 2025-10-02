package au.com.woolworths.feature.shop.bundles.ui;

import androidx.paging.LoadState;
import androidx.paging.PagingLogger;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.LazyPagingItems$pagingDataPresenter$1;
import au.com.woolworths.feature.shop.bundles.data.Bundle;
import au.com.woolworths.feature.shop.catalogue.listing.category.ui.CategoryListingScreenKt;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.PromotionListingScreenKt;
import au.com.woolworths.shop.receipts.ui.ReceiptListScreenKt;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ LazyPagingItems e;

    public /* synthetic */ k(LazyPagingItems lazyPagingItems, int i) {
        this.d = i;
        this.e = lazyPagingItems;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Unit unit = Unit.f24250a;
        LazyPagingItems lazyPagingItems = this.e;
        switch (i) {
            case 0:
                ArrayList arrayList = lazyPagingItems.c().f;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (obj instanceof Bundle) {
                        arrayList2.add(obj);
                    }
                }
                return arrayList2;
            case 1:
                float f = CategoryListingScreenKt.b;
                lazyPagingItems.e();
                return unit;
            case 2:
                lazyPagingItems.e();
                return unit;
            case 3:
                lazyPagingItems.e();
                return unit;
            case 4:
                lazyPagingItems.e();
                return unit;
            case 5:
                float f2 = PromotionListingScreenKt.b;
                lazyPagingItems.e();
                return unit;
            case 6:
                lazyPagingItems.e();
                return unit;
            case 7:
                lazyPagingItems.e();
                return unit;
            case 8:
                lazyPagingItems.e();
                return unit;
            case 9:
                LazyPagingItems$pagingDataPresenter$1 lazyPagingItems$pagingDataPresenter$1 = lazyPagingItems.c;
                lazyPagingItems$pagingDataPresenter$1.getClass();
                if (PagingLogger.a(3)) {
                    PagingLogger.b(3, "Refresh signal received");
                }
                lazyPagingItems$pagingDataPresenter$1.c.h();
                return unit;
            default:
                float f3 = ReceiptListScreenKt.f12881a;
                return Boolean.valueOf((lazyPagingItems.d().c instanceof LoadState.Error) || ((lazyPagingItems.d().f3529a instanceof LoadState.Error) && !lazyPagingItems.c().isEmpty()));
        }
    }
}
