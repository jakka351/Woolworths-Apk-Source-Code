package au.com.woolworths.shop.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ProductOfferScheme;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductOfferScheme {
    public static final Companion e;
    public static final ProductOfferScheme f;
    public static final /* synthetic */ ProductOfferScheme[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ProductOfferScheme$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        ProductOfferScheme productOfferScheme = new ProductOfferScheme("MultiBuy", 0, "MultiBuy");
        ProductOfferScheme productOfferScheme2 = new ProductOfferScheme("MembersMultiBuy", 1, "MembersMultiBuy");
        ProductOfferScheme productOfferScheme3 = new ProductOfferScheme("Members", 2, "Members");
        ProductOfferScheme productOfferScheme4 = new ProductOfferScheme("Campaign", 3, "Campaign");
        ProductOfferScheme productOfferScheme5 = new ProductOfferScheme("Variety", 4, "Variety");
        ProductOfferScheme productOfferScheme6 = new ProductOfferScheme("UNKNOWN__", 5, "UNKNOWN__");
        f = productOfferScheme6;
        ProductOfferScheme[] productOfferSchemeArr = {productOfferScheme, productOfferScheme2, productOfferScheme3, productOfferScheme4, productOfferScheme5, productOfferScheme6};
        g = productOfferSchemeArr;
        h = EnumEntriesKt.a(productOfferSchemeArr);
        e = new Companion();
        CollectionsKt.R("MultiBuy", "MembersMultiBuy", "Members", "Campaign", "Variety");
    }

    public ProductOfferScheme(String str, int i, String str2) {
        this.d = str2;
    }

    public static ProductOfferScheme valueOf(String str) {
        return (ProductOfferScheme) Enum.valueOf(ProductOfferScheme.class, str);
    }

    public static ProductOfferScheme[] values() {
        return (ProductOfferScheme[]) g.clone();
    }
}
