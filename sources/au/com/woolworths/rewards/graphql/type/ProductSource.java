package au.com.woolworths.rewards.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/ProductSource;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductSource {
    public static final Companion e;
    public static final ProductSource f;
    public static final /* synthetic */ ProductSource[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/ProductSource$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        ProductSource productSource = new ProductSource("UNKNOWN", 0, "UNKNOWN");
        ProductSource productSource2 = new ProductSource("MY_DEAL_MARKETPLACE", 1, "MY_DEAL_MARKETPLACE");
        ProductSource productSource3 = new ProductSource("GAA_S", 2, "GAA_S");
        ProductSource productSource4 = new ProductSource("UNKNOWN__", 3, "UNKNOWN__");
        f = productSource4;
        ProductSource[] productSourceArr = {productSource, productSource2, productSource3, productSource4};
        g = productSourceArr;
        h = EnumEntriesKt.a(productSourceArr);
        e = new Companion();
        CollectionsKt.R("UNKNOWN", "MY_DEAL_MARKETPLACE", "GAA_S");
    }

    public ProductSource(String str, int i, String str2) {
        this.d = str2;
    }

    public static ProductSource valueOf(String str) {
        return (ProductSource) Enum.valueOf(ProductSource.class, str);
    }

    public static ProductSource[] values() {
        return (ProductSource[]) g.clone();
    }
}
