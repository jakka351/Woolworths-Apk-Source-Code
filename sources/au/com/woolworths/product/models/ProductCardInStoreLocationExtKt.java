package au.com.woolworths.product.models;

import au.com.woolworths.graphql.common.fragment.ProductCard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/product/models/InStoreLocationData;", "Lau/com/woolworths/graphql/common/fragment/ProductCard$InStoreLocation;", "shop-product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductCardInStoreLocationExtKt {
    @NotNull
    public static final InStoreLocationData toUiModel(@NotNull ProductCard.InStoreLocation inStoreLocation) {
        Intrinsics.h(inStoreLocation, "<this>");
        ProductCard.Details details = inStoreLocation.f8960a;
        InstoreLocationDetailsData uiModel = details != null ? ProductCardDetailsExtKt.toUiModel(details) : null;
        ProductCard.DisplayInfo displayInfo = inStoreLocation.b;
        return new InStoreLocationData(uiModel, displayInfo != null ? ProductCardDisplayInfoExtKt.toUiModel(displayInfo) : null);
    }
}
