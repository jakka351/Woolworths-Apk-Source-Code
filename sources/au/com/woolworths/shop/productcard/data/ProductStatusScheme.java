package au.com.woolworths.shop.productcard.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/productcard/data/ProductStatusScheme;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductStatusScheme {
    public static final ProductStatusScheme d;
    public static final ProductStatusScheme e;
    public static final /* synthetic */ ProductStatusScheme[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        ProductStatusScheme productStatusScheme = new ProductStatusScheme("ONLINE_ONLY_SPECIAL", 0);
        d = productStatusScheme;
        ProductStatusScheme productStatusScheme2 = new ProductStatusScheme("NON_AVAILABILITY_STATUS", 1);
        e = productStatusScheme2;
        ProductStatusScheme[] productStatusSchemeArr = {productStatusScheme, productStatusScheme2};
        f = productStatusSchemeArr;
        g = EnumEntriesKt.a(productStatusSchemeArr);
    }

    public static ProductStatusScheme valueOf(String str) {
        return (ProductStatusScheme) Enum.valueOf(ProductStatusScheme.class, str);
    }

    public static ProductStatusScheme[] values() {
        return (ProductStatusScheme[]) f.clone();
    }
}
