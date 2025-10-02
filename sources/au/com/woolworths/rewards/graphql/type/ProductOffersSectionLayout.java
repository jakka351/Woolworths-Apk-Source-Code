package au.com.woolworths.rewards.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/ProductOffersSectionLayout;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductOffersSectionLayout {
    public static final Companion e;
    public static final EnumType f;
    public static final ProductOffersSectionLayout g;
    public static final /* synthetic */ ProductOffersSectionLayout[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/ProductOffersSectionLayout$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        ProductOffersSectionLayout productOffersSectionLayout = new ProductOffersSectionLayout("VERTICAL_LIST", 0, "VERTICAL_LIST");
        ProductOffersSectionLayout productOffersSectionLayout2 = new ProductOffersSectionLayout("CAROUSEL", 1, "CAROUSEL");
        ProductOffersSectionLayout productOffersSectionLayout3 = new ProductOffersSectionLayout("SINGLE_ROW_CAROUSEL", 2, "SINGLE_ROW_CAROUSEL");
        ProductOffersSectionLayout productOffersSectionLayout4 = new ProductOffersSectionLayout("UNKNOWN__", 3, "UNKNOWN__");
        g = productOffersSectionLayout4;
        ProductOffersSectionLayout[] productOffersSectionLayoutArr = {productOffersSectionLayout, productOffersSectionLayout2, productOffersSectionLayout3, productOffersSectionLayout4};
        h = productOffersSectionLayoutArr;
        i = EnumEntriesKt.a(productOffersSectionLayoutArr);
        e = new Companion();
        f = new EnumType("ProductOffersSectionLayout", CollectionsKt.R("VERTICAL_LIST", "CAROUSEL", "SINGLE_ROW_CAROUSEL"));
    }

    public ProductOffersSectionLayout(String str, int i2, String str2) {
        this.d = str2;
    }

    public static ProductOffersSectionLayout valueOf(String str) {
        return (ProductOffersSectionLayout) Enum.valueOf(ProductOffersSectionLayout.class, str);
    }

    public static ProductOffersSectionLayout[] values() {
        return (ProductOffersSectionLayout[]) h.clone();
    }
}
