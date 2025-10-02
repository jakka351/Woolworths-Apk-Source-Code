package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import com.woolworths.product.list.ProductsByCategoryQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetContent$Marketplace;", "Lcom/woolworths/product/list/ProductsByCategoryQuery$MarketplaceBottomSheet;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductsByCategoryQueryMarketplaceBottomSheetExtKt {
    @NotNull
    public static final BottomSheetContent.Marketplace toUiModel(@NotNull ProductsByCategoryQuery.MarketplaceBottomSheet marketplaceBottomSheet) {
        Intrinsics.h(marketplaceBottomSheet, "<this>");
        Boolean showOnceOnly = marketplaceBottomSheet.getShowOnceOnly();
        String bottomSheetTitle = marketplaceBottomSheet.getBottomSheetTitle();
        String bottomSheetBody = marketplaceBottomSheet.getBottomSheetBody();
        ProductsByCategoryQuery.PrimaryCta primaryCta = marketplaceBottomSheet.getPrimaryCta();
        ContentCta uiModel = primaryCta != null ? ProductsByCategoryQueryPrimaryCtaExtKt.toUiModel(primaryCta) : null;
        ProductsByCategoryQuery.SecondaryCta secondaryCta = marketplaceBottomSheet.getSecondaryCta();
        return new BottomSheetContent.Marketplace(showOnceOnly, bottomSheetTitle, bottomSheetBody, uiModel, secondaryCta != null ? ProductsByCategoryQuerySecondaryCtaExtKt.toUiModel(secondaryCta) : null, null, null, null, BERTags.FLAGS, null);
    }
}
