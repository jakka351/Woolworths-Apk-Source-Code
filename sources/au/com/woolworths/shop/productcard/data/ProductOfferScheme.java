package au.com.woolworths.shop.productcard.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/productcard/data/ProductOfferScheme;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductOfferScheme {
    public static final /* synthetic */ ProductOfferScheme[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        ProductOfferScheme[] productOfferSchemeArr = {new ProductOfferScheme("MultiBuy", 0), new ProductOfferScheme("MembersMultiBuy", 1), new ProductOfferScheme("Members", 2), new ProductOfferScheme("Campaign", 3), new ProductOfferScheme("Variety", 4)};
        d = productOfferSchemeArr;
        e = EnumEntriesKt.a(productOfferSchemeArr);
    }

    public static ProductOfferScheme valueOf(String str) {
        return (ProductOfferScheme) Enum.valueOf(ProductOfferScheme.class, str);
    }

    public static ProductOfferScheme[] values() {
        return (ProductOfferScheme[]) d.clone();
    }
}
