package au.com.woolworths.shop.product.navigation.data.marketplace;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/shop/product/navigation/data/marketplace/ProductListFacetType;", "", "<init>", "(Ljava/lang/String;I)V", "CATEGORY", "BRAND", "VENDOR", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductListFacetType {

    @SerializedName("Brand")
    public static final ProductListFacetType BRAND;

    @SerializedName("Category")
    public static final ProductListFacetType CATEGORY;

    @SerializedName("Vendor")
    public static final ProductListFacetType VENDOR;
    public static final /* synthetic */ ProductListFacetType[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        ProductListFacetType productListFacetType = new ProductListFacetType("CATEGORY", 0);
        CATEGORY = productListFacetType;
        ProductListFacetType productListFacetType2 = new ProductListFacetType("BRAND", 1);
        BRAND = productListFacetType2;
        ProductListFacetType productListFacetType3 = new ProductListFacetType("VENDOR", 2);
        VENDOR = productListFacetType3;
        ProductListFacetType[] productListFacetTypeArr = {productListFacetType, productListFacetType2, productListFacetType3, new ProductListFacetType("UNKNOWN", 3)};
        d = productListFacetTypeArr;
        e = EnumEntriesKt.a(productListFacetTypeArr);
    }

    private ProductListFacetType(String str, int i) {
    }

    public static ProductListFacetType valueOf(String str) {
        return (ProductListFacetType) Enum.valueOf(ProductListFacetType.class, str);
    }

    public static ProductListFacetType[] values() {
        return (ProductListFacetType[]) d.clone();
    }
}
