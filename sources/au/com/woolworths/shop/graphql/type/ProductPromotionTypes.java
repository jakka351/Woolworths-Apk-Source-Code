package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ProductPromotionTypes;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductPromotionTypes {
    public static final Companion e;
    public static final EnumType f;
    public static final ProductPromotionTypes g;
    public static final /* synthetic */ ProductPromotionTypes[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ProductPromotionTypes$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        ProductPromotionTypes productPromotionTypes = new ProductPromotionTypes("SPECIAL", 0, "SPECIAL");
        ProductPromotionTypes productPromotionTypes2 = new ProductPromotionTypes("LOW_PRICE", 1, "LOW_PRICE");
        ProductPromotionTypes productPromotionTypes3 = new ProductPromotionTypes("PRICE_DROPPED", 2, "PRICE_DROPPED");
        ProductPromotionTypes productPromotionTypes4 = new ProductPromotionTypes("CONTAINER_CREDITS", 3, "CONTAINER_CREDITS");
        ProductPromotionTypes productPromotionTypes5 = new ProductPromotionTypes("LOWER_SHELF_PRICE", 4, "LOWER_SHELF_PRICE");
        ProductPromotionTypes productPromotionTypes6 = new ProductPromotionTypes("LOWER_PRICE", 5, "LOWER_PRICE");
        ProductPromotionTypes productPromotionTypes7 = new ProductPromotionTypes("UNKNOWN__", 6, "UNKNOWN__");
        g = productPromotionTypes7;
        ProductPromotionTypes[] productPromotionTypesArr = {productPromotionTypes, productPromotionTypes2, productPromotionTypes3, productPromotionTypes4, productPromotionTypes5, productPromotionTypes6, productPromotionTypes7};
        h = productPromotionTypesArr;
        i = EnumEntriesKt.a(productPromotionTypesArr);
        e = new Companion();
        f = new EnumType("ProductPromotionTypes", CollectionsKt.R("SPECIAL", "LOW_PRICE", "PRICE_DROPPED", "CONTAINER_CREDITS", "LOWER_SHELF_PRICE", "LOWER_PRICE"));
    }

    public ProductPromotionTypes(String str, int i2, String str2) {
        this.d = str2;
    }

    public static ProductPromotionTypes valueOf(String str) {
        return (ProductPromotionTypes) Enum.valueOf(ProductPromotionTypes.class, str);
    }

    public static ProductPromotionTypes[] values() {
        return (ProductPromotionTypes[]) h.clone();
    }
}
