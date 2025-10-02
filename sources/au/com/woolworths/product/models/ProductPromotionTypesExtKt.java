package au.com.woolworths.product.models;

import au.com.woolworths.shop.graphql.type.ProductPromotionTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/android/onesite/products/models/ProductPromotionTypes;", "Lau/com/woolworths/shop/graphql/type/ProductPromotionTypes;", "shop-product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductPromotionTypesExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductPromotionTypes.values().length];
            try {
                ProductPromotionTypes.Companion companion = ProductPromotionTypes.e;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ProductPromotionTypes.Companion companion2 = ProductPromotionTypes.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ProductPromotionTypes.Companion companion3 = ProductPromotionTypes.e;
                iArr[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ProductPromotionTypes.Companion companion4 = ProductPromotionTypes.e;
                iArr[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ProductPromotionTypes.Companion companion5 = ProductPromotionTypes.e;
                iArr[2] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ProductPromotionTypes.Companion companion6 = ProductPromotionTypes.e;
                iArr[3] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final au.com.woolworths.android.onesite.products.models.ProductPromotionTypes toUiModel(@NotNull ProductPromotionTypes productPromotionTypes) {
        Intrinsics.h(productPromotionTypes, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[productPromotionTypes.ordinal()]) {
            case 1:
                return au.com.woolworths.android.onesite.products.models.ProductPromotionTypes.SPECIAL;
            case 2:
                return au.com.woolworths.android.onesite.products.models.ProductPromotionTypes.LOW_PRICE;
            case 3:
                return au.com.woolworths.android.onesite.products.models.ProductPromotionTypes.LOWER_SHELF_PRICE;
            case 4:
                return au.com.woolworths.android.onesite.products.models.ProductPromotionTypes.LOWER_PRICE;
            case 5:
                return au.com.woolworths.android.onesite.products.models.ProductPromotionTypes.PRICE_DROPPED;
            case 6:
                return au.com.woolworths.android.onesite.products.models.ProductPromotionTypes.CONTAINER_CREDITS;
            default:
                return au.com.woolworths.android.onesite.products.models.ProductPromotionTypes.PRICE_DROPPED;
        }
    }
}
