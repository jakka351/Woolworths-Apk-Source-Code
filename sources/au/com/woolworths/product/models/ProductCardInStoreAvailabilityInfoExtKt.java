package au.com.woolworths.product.models;

import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/product/models/InStoreAvailabilityInfo;", "Lau/com/woolworths/graphql/common/fragment/ProductCard$InStoreAvailabilityInfo;", "shop-product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductCardInStoreAvailabilityInfoExtKt {
    @NotNull
    public static final InStoreAvailabilityInfo toUiModel(@NotNull ProductCard.InStoreAvailabilityInfo inStoreAvailabilityInfo) {
        Intrinsics.h(inStoreAvailabilityInfo, "<this>");
        ButtonApiData uiModel = ProductCardButtonExtKt.toUiModel(inStoreAvailabilityInfo.f8958a);
        String str = inStoreAvailabilityInfo.b;
        ProductCard.InfoSheet infoSheet = inStoreAvailabilityInfo.c;
        return new InStoreAvailabilityInfo(uiModel, str, infoSheet != null ? ProductCardInfoSheetExtKt.toUiModel(infoSheet) : null);
    }
}
