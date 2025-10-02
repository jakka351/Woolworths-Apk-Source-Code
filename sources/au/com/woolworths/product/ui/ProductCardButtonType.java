package au.com.woolworths.product.ui;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/ui/ProductCardButtonType;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductCardButtonType {
    public static final ProductCardButtonType d;
    public static final ProductCardButtonType e;
    public static final ProductCardButtonType f;
    public static final ProductCardButtonType g;
    public static final ProductCardButtonType h;
    public static final ProductCardButtonType i;
    public static final ProductCardButtonType j;
    public static final /* synthetic */ ProductCardButtonType[] k;
    public static final /* synthetic */ EnumEntries l;

    static {
        ProductCardButtonType productCardButtonType = new ProductCardButtonType("TROLLEY_ADD", 0);
        d = productCardButtonType;
        ProductCardButtonType productCardButtonType2 = new ProductCardButtonType("TROLLEY_UPDATE", 1);
        e = productCardButtonType2;
        ProductCardButtonType productCardButtonType3 = new ProductCardButtonType("TROLLEY_DISABLED", 2);
        f = productCardButtonType3;
        ProductCardButtonType productCardButtonType4 = new ProductCardButtonType("STOCK_SEE_IN_STORE", 3);
        g = productCardButtonType4;
        ProductCardButtonType productCardButtonType5 = new ProductCardButtonType("STOCK_AVAILABLE", 4);
        h = productCardButtonType5;
        ProductCardButtonType productCardButtonType6 = new ProductCardButtonType("STOCK_UNAVAILABLE", 5);
        i = productCardButtonType6;
        ProductCardButtonType productCardButtonType7 = new ProductCardButtonType("STOCK_CHECK_OTHER_STORES", 6);
        j = productCardButtonType7;
        ProductCardButtonType[] productCardButtonTypeArr = {productCardButtonType, productCardButtonType2, productCardButtonType3, productCardButtonType4, productCardButtonType5, productCardButtonType6, productCardButtonType7};
        k = productCardButtonTypeArr;
        l = EnumEntriesKt.a(productCardButtonTypeArr);
    }

    public static ProductCardButtonType valueOf(String str) {
        return (ProductCardButtonType) Enum.valueOf(ProductCardButtonType.class, str);
    }

    public static ProductCardButtonType[] values() {
        return (ProductCardButtonType[]) k.clone();
    }
}
