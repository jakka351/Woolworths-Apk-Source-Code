package au.com.woolworths.feature.shop.catalogue.listing.category.ui;

import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import androidx.compose.foundation.lazy.grid.LazyGridSpanKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.paging.compose.LazyPagingItems;
import au.com.woolworths.feature.shop.catalogue.listing.category.model.HeroProductCard;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.details.ui.PromotionDetailsScreenKt;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.PromotionListingScreenKt;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ LazyPagingItems e;

    public /* synthetic */ d(LazyPagingItems lazyPagingItems, int i) {
        this.d = 1;
        this.e = lazyPagingItems;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        LazyPagingItems lazyPagingItems = this.e;
        switch (i) {
            case 0:
                LazyGridItemSpanScope items = (LazyGridItemSpanScope) obj;
                int iIntValue = ((Integer) obj2).intValue();
                float f = CategoryListingScreenKt.b;
                Intrinsics.h(items, "$this$items");
                return new GridItemSpan(LazyGridSpanKt.a(lazyPagingItems.a(iIntValue) instanceof HeroProductCard ? 2 : 1));
            case 1:
                ((Integer) obj2).getClass();
                PromotionDetailsScreenKt.h(lazyPagingItems, (Composer) obj, RecomposeScopeImplKt.a(9));
                return Unit.f24250a;
            default:
                LazyGridItemSpanScope items2 = (LazyGridItemSpanScope) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                float f2 = PromotionListingScreenKt.b;
                Intrinsics.h(items2, "$this$items");
                return new GridItemSpan(lazyPagingItems.a(iIntValue2) instanceof ProductCard ? LazyGridSpanKt.a(1) : LazyGridSpanKt.a(2));
        }
    }

    public /* synthetic */ d(LazyPagingItems lazyPagingItems, int i, byte b) {
        this.d = i;
        this.e = lazyPagingItems;
    }
}
