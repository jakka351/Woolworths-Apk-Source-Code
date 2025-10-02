package au.com.woolworths.product.details.models;

import au.com.woolworths.android.onesite.models.products.PromotionInfo;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.products.models.ProductPromotionTypes;
import au.com.woolworths.product.details.ui.ProductDetailsPromotionLabel;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"getPromotionLabel", "Lau/com/woolworths/product/details/ui/ProductDetailsPromotionLabel;", "Lau/com/woolworths/product/models/ProductCard;", "shop-product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductCardTileExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductPromotionTypes.values().length];
            try {
                iArr[ProductPromotionTypes.LOW_PRICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductPromotionTypes.SPECIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductPromotionTypes.PRICE_DROPPED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProductPromotionTypes.LOWER_SHELF_PRICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ProductPromotionTypes.LOWER_PRICE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ProductPromotionTypes.CONTAINER_CREDITS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Nullable
    public static final ProductDetailsPromotionLabel getPromotionLabel(@NotNull ProductCard productCard) {
        ProductDetailsPromotionLabel productDetailsPromotionLabel;
        Intrinsics.h(productCard, "<this>");
        if (productCard.getPromotionInfo() != null) {
            PromotionInfo promotionInfo = productCard.getPromotionInfo();
            Intrinsics.f(promotionInfo, "null cannot be cast to non-null type au.com.woolworths.android.onesite.models.products.PromotionInfo");
            switch (WhenMappings.$EnumSwitchMapping$0[promotionInfo.getType().ordinal()]) {
                case 1:
                    productDetailsPromotionLabel = ProductDetailsPromotionLabel.g;
                    break;
                case 2:
                    productDetailsPromotionLabel = ProductDetailsPromotionLabel.h;
                    break;
                case 3:
                    productDetailsPromotionLabel = ProductDetailsPromotionLabel.e;
                    break;
                case 4:
                    productDetailsPromotionLabel = ProductDetailsPromotionLabel.f;
                    break;
                case 5:
                    productDetailsPromotionLabel = ProductDetailsPromotionLabel.i;
                    break;
                case 6:
                    productDetailsPromotionLabel = ProductDetailsPromotionLabel.j;
                    break;
                default:
                    productDetailsPromotionLabel = null;
                    break;
            }
            if (productDetailsPromotionLabel != null) {
                productDetailsPromotionLabel.d = new PlainText(promotionInfo.getLabel());
                return productDetailsPromotionLabel;
            }
        }
        return null;
    }
}
