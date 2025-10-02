package au.com.woolworths.product.details.models;

import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import com.woolworths.product.details.ProductDetailsQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetContent$Marketplace;", "Lcom/woolworths/product/details/ProductDetailsQuery$BottomSheet;", "shop-product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductDetailsQueryBottomSheetExtKt {
    @NotNull
    public static final BottomSheetContent.Marketplace toUiModel(@NotNull ProductDetailsQuery.BottomSheet bottomSheet) {
        Intrinsics.h(bottomSheet, "<this>");
        Boolean showOnceOnly = bottomSheet.getShowOnceOnly();
        String bottomSheetTitle = bottomSheet.getBottomSheetTitle();
        String bottomSheetBody = bottomSheet.getBottomSheetBody();
        ProductDetailsQuery.PrimaryCta primaryCta = bottomSheet.getPrimaryCta();
        ContentCta uiModel = primaryCta != null ? ProductDetailsQueryPrimaryCtaExtKt.toUiModel(primaryCta) : null;
        ProductDetailsQuery.SecondaryCta secondaryCta = bottomSheet.getSecondaryCta();
        return new BottomSheetContent.Marketplace(showOnceOnly, bottomSheetTitle, bottomSheetBody, uiModel, secondaryCta != null ? ProductDetailsQuerySecondaryCtaExtKt.toUiModel(secondaryCta) : null, null, null, null, BERTags.FLAGS, null);
    }
}
