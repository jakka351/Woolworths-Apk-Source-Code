package au.com.woolworths.feature.product.list.v2.data;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.feature.product.list.v2.ProductListQuery;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list-v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductListQueryMarketplaceBottomSheetExtKt {
    public static final BottomSheetContent.Marketplace a(ProductListQuery.MarketplaceBottomSheet marketplaceBottomSheet) {
        Intrinsics.h(marketplaceBottomSheet, "<this>");
        Boolean bool = marketplaceBottomSheet.e;
        String str = marketplaceBottomSheet.f5447a;
        String str2 = marketplaceBottomSheet.b;
        ProductListQuery.PrimaryCta primaryCta = marketplaceBottomSheet.c;
        ContentCta contentCta = primaryCta != null ? new ContentCta(primaryCta.f5479a, (String) null, (String) null, (Boolean) null, (AnalyticsData) null, 28, (DefaultConstructorMarker) null) : null;
        ProductListQuery.SecondaryCta secondaryCta = marketplaceBottomSheet.d;
        return new BottomSheetContent.Marketplace(bool, str, str2, contentCta, secondaryCta != null ? new ContentCta(secondaryCta.f5484a, (String) null, (String) null, (Boolean) null, (AnalyticsData) null, 28, (DefaultConstructorMarker) null) : null, null, null, null, BERTags.FLAGS, null);
    }
}
