package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ProductStatusScheme;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductStatusScheme {
    public static final Companion e;
    public static final EnumType f;
    public static final ProductStatusScheme g;
    public static final /* synthetic */ ProductStatusScheme[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ProductStatusScheme$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        ProductStatusScheme productStatusScheme = new ProductStatusScheme("ONLINE_ONLY_SPECIAL", 0, "ONLINE_ONLY_SPECIAL");
        ProductStatusScheme productStatusScheme2 = new ProductStatusScheme("NON_AVAILABILITY_STATUS", 1, "NON_AVAILABILITY_STATUS");
        ProductStatusScheme productStatusScheme3 = new ProductStatusScheme("UNKNOWN__", 2, "UNKNOWN__");
        g = productStatusScheme3;
        ProductStatusScheme[] productStatusSchemeArr = {productStatusScheme, productStatusScheme2, productStatusScheme3};
        h = productStatusSchemeArr;
        i = EnumEntriesKt.a(productStatusSchemeArr);
        e = new Companion();
        f = new EnumType("ProductStatusScheme", CollectionsKt.R("ONLINE_ONLY_SPECIAL", "NON_AVAILABILITY_STATUS"));
    }

    public ProductStatusScheme(String str, int i2, String str2) {
        this.d = str2;
    }

    public static ProductStatusScheme valueOf(String str) {
        return (ProductStatusScheme) Enum.valueOf(ProductStatusScheme.class, str);
    }

    public static ProductStatusScheme[] values() {
        return (ProductStatusScheme[]) h.clone();
    }
}
