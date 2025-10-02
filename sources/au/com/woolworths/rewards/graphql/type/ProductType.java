package au.com.woolworths.rewards.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/ProductType;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductType {
    public static final Companion e;
    public static final ProductType f;
    public static final /* synthetic */ ProductType[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/ProductType$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        ProductType productType = new ProductType("THIRD_PARTY", 0, "THIRD_PARTY");
        ProductType productType2 = new ProductType("GIFT_CARD", 1, "GIFT_CARD");
        ProductType productType3 = new ProductType("ThirdParty", 2, "ThirdParty");
        ProductType productType4 = new ProductType("GiftCard", 3, "GiftCard");
        ProductType productType5 = new ProductType("UNKNOWN", 4, "UNKNOWN");
        ProductType productType6 = new ProductType("UNKNOWN__", 5, "UNKNOWN__");
        f = productType6;
        ProductType[] productTypeArr = {productType, productType2, productType3, productType4, productType5, productType6};
        g = productTypeArr;
        h = EnumEntriesKt.a(productTypeArr);
        e = new Companion();
        CollectionsKt.R("THIRD_PARTY", "GIFT_CARD", "ThirdParty", "GiftCard", "UNKNOWN");
    }

    public ProductType(String str, int i, String str2) {
        this.d = str2;
    }

    public static ProductType valueOf(String str) {
        return (ProductType) Enum.valueOf(ProductType.class, str);
    }

    public static ProductType[] values() {
        return (ProductType[]) g.clone();
    }
}
