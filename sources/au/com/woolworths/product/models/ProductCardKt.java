package au.com.woolworths.product.models;

import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.product.quantityselector.QuantitySelectorInfoExtKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\f\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0002\u001a\n\u0010\t\u001a\u00020\u0001*\u00020\n\u001a\n\u0010\t\u001a\u00020\u0001*\u00020\u000b¨\u0006\f"}, d2 = {"currentTrolley", "Lau/com/woolworths/product/models/ProductTrolleyData;", "Lau/com/woolworths/product/models/ProductCard;", "selectedIndex", "", "toSelectorOptions", "", "", "getInstoreLocationText", "toUiModel", "Lau/com/woolworths/graphql/common/fragment/ProductCard$Trolley;", "Lau/com/woolworths/graphql/common/fragment/ProductCard$Trolley1;", "shop-product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductCardKt {
    @Nullable
    public static final ProductTrolleyData currentTrolley(@NotNull ProductCard productCard, int i) {
        ProductTrolleyData productTrolleyData;
        Intrinsics.h(productCard, "<this>");
        List<ProductTrolleyData> trolleys = productCard.getTrolleys();
        List<String> trolleySelectorTitleList = productCard.getTrolleySelectorTitleList();
        if (trolleySelectorTitleList == null || trolleySelectorTitleList.isEmpty()) {
            trolleys = null;
        }
        return (trolleys == null || (productTrolleyData = (ProductTrolleyData) CollectionsKt.J(i, trolleys)) == null) ? productCard.getTrolley() : productTrolleyData;
    }

    @Nullable
    public static final String getInstoreLocationText(@NotNull ProductCard productCard) {
        InstoreDetailsData displayInfo;
        String locationText;
        Intrinsics.h(productCard, "<this>");
        InStoreLocationData inStoreLocation = productCard.getInStoreLocation();
        if (inStoreLocation != null && (displayInfo = inStoreLocation.getDisplayInfo()) != null && (locationText = displayInfo.getLocationText()) != null) {
            if (StringsKt.D(locationText)) {
                locationText = null;
            }
            if (locationText != null) {
                return locationText;
            }
        }
        InstoreDetailsData inStoreDetails = productCard.getInStoreDetails();
        if (inStoreDetails != null) {
            return inStoreDetails.getLocationText();
        }
        return null;
    }

    @NotNull
    public static final List<String> toSelectorOptions(@NotNull ProductCard productCard, int i) {
        Intrinsics.h(productCard, "<this>");
        ProductTrolleyData productTrolleyDataCurrentTrolley = currentTrolley(productCard, i);
        return productTrolleyDataCurrentTrolley != null ? QuantitySelectorInfoExtKt.a(productTrolleyDataCurrentTrolley) : EmptyList.d;
    }

    @NotNull
    public static final ProductTrolleyData toUiModel(@NotNull ProductCard.Trolley trolley) {
        Intrinsics.h(trolley, "<this>");
        return ProductTrolleyExtKt.toUiModel(trolley.b);
    }

    @NotNull
    public static final ProductTrolleyData toUiModel(@NotNull ProductCard.Trolley1 trolley1) {
        Intrinsics.h(trolley1, "<this>");
        return ProductTrolleyExtKt.toUiModel(trolley1.b);
    }
}
