package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import au.com.woolworths.shop.graphql.ProductsByFacetQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetContent$Marketplace;", "Lau/com/woolworths/shop/graphql/ProductsByFacetQuery$MarketplaceBottomSheet;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductsByFacetQueryMarketplaceBottomSheetExtKt {
    @NotNull
    public static final BottomSheetContent.Marketplace toUiModel(@NotNull ProductsByFacetQuery.MarketplaceBottomSheet marketplaceBottomSheet) {
        Intrinsics.h(marketplaceBottomSheet, "<this>");
        Boolean bool = marketplaceBottomSheet.e;
        String str = marketplaceBottomSheet.f10933a;
        String str2 = marketplaceBottomSheet.b;
        ProductsByFacetQuery.PrimaryCta primaryCta = marketplaceBottomSheet.c;
        ContentCta uiModel = primaryCta != null ? ProductsByFacetQueryPrimaryCtaExtKt.toUiModel(primaryCta) : null;
        ProductsByFacetQuery.SecondaryCta secondaryCta = marketplaceBottomSheet.d;
        return new BottomSheetContent.Marketplace(bool, str, str2, uiModel, secondaryCta != null ? ProductsByFacetQuerySecondaryCtaExtKt.toUiModel(secondaryCta) : null, null, null, null, BERTags.FLAGS, null);
    }
}
