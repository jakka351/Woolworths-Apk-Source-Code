package au.com.woolworths.shop.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ProductReviewSource;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductReviewSource {
    public static final Companion e;
    public static final ProductReviewSource f;
    public static final ProductReviewSource g;
    public static final ProductReviewSource h;
    public static final /* synthetic */ ProductReviewSource[] i;
    public static final /* synthetic */ EnumEntries j;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ProductReviewSource$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        ProductReviewSource productReviewSource = new ProductReviewSource("CART", 0, "CART");
        f = productReviewSource;
        ProductReviewSource productReviewSource2 = new ProductReviewSource("CHECKOUT", 1, "CHECKOUT");
        g = productReviewSource2;
        ProductReviewSource productReviewSource3 = new ProductReviewSource("UNKNOWN__", 2, "UNKNOWN__");
        h = productReviewSource3;
        ProductReviewSource[] productReviewSourceArr = {productReviewSource, productReviewSource2, productReviewSource3};
        i = productReviewSourceArr;
        j = EnumEntriesKt.a(productReviewSourceArr);
        e = new Companion();
        CollectionsKt.R("CART", "CHECKOUT");
    }

    public ProductReviewSource(String str, int i2, String str2) {
        this.d = str2;
    }

    public static ProductReviewSource valueOf(String str) {
        return (ProductReviewSource) Enum.valueOf(ProductReviewSource.class, str);
    }

    public static ProductReviewSource[] values() {
        return (ProductReviewSource[]) i.clone();
    }
}
