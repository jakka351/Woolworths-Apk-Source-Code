package au.com.woolworths.feature.product.list.legacy.data;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import com.woolworths.product.list.legacy.ProductListQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.asn1.BERTags;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list-legacy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductListQueryMarketplaceBottomSheetExtKt {
    public static final BottomSheetContent.Marketplace a(ProductListQuery.MarketplaceBottomSheet marketplaceBottomSheet) {
        Boolean showOnceOnly = marketplaceBottomSheet.getShowOnceOnly();
        String bottomSheetTitle = marketplaceBottomSheet.getBottomSheetTitle();
        String bottomSheetBody = marketplaceBottomSheet.getBottomSheetBody();
        ProductListQuery.PrimaryCta primaryCta = marketplaceBottomSheet.getPrimaryCta();
        ContentCta contentCta = primaryCta != null ? new ContentCta(primaryCta.getLabel(), (String) null, (String) null, (Boolean) null, (AnalyticsData) null, 28, (DefaultConstructorMarker) null) : null;
        ProductListQuery.SecondaryCta secondaryCta = marketplaceBottomSheet.getSecondaryCta();
        return new BottomSheetContent.Marketplace(showOnceOnly, bottomSheetTitle, bottomSheetBody, contentCta, secondaryCta != null ? new ContentCta(secondaryCta.getLabel(), (String) null, (String) null, (Boolean) null, (AnalyticsData) null, 28, (DefaultConstructorMarker) null) : null, null, null, null, BERTags.FLAGS, null);
    }
}
