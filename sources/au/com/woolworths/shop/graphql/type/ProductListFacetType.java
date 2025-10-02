package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ProductListFacetType;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductListFacetType {
    public static final Companion e;
    public static final EnumType f;
    public static final ProductListFacetType g;
    public static final /* synthetic */ ProductListFacetType[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ProductListFacetType$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        ProductListFacetType productListFacetType = new ProductListFacetType("Category", 0, "Category");
        ProductListFacetType productListFacetType2 = new ProductListFacetType("Brand", 1, "Brand");
        ProductListFacetType productListFacetType3 = new ProductListFacetType("Seller", 2, "Seller");
        ProductListFacetType productListFacetType4 = new ProductListFacetType("Vendor", 3, "Vendor");
        ProductListFacetType productListFacetType5 = new ProductListFacetType("UNKNOWN__", 4, "UNKNOWN__");
        g = productListFacetType5;
        ProductListFacetType[] productListFacetTypeArr = {productListFacetType, productListFacetType2, productListFacetType3, productListFacetType4, productListFacetType5};
        h = productListFacetTypeArr;
        i = EnumEntriesKt.a(productListFacetTypeArr);
        e = new Companion();
        f = new EnumType("ProductListFacetType", CollectionsKt.R("Category", "Brand", "Seller", "Vendor"));
    }

    public ProductListFacetType(String str, int i2, String str2) {
        this.d = str2;
    }

    public static ProductListFacetType valueOf(String str) {
        return (ProductListFacetType) Enum.valueOf(ProductListFacetType.class, str);
    }

    public static ProductListFacetType[] values() {
        return (ProductListFacetType[]) h.clone();
    }
}
