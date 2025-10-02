package au.com.woolworths.shop.cart.domain.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/domain/model/ProductReviewGroupType;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductReviewGroupType {
    public static final ProductReviewGroupType d;
    public static final ProductReviewGroupType e;
    public static final ProductReviewGroupType f;
    public static final /* synthetic */ ProductReviewGroupType[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        ProductReviewGroupType productReviewGroupType = new ProductReviewGroupType("STANDARD", 0);
        d = productReviewGroupType;
        ProductReviewGroupType productReviewGroupType2 = new ProductReviewGroupType("FULFILMENT_WINDOW", 1);
        e = productReviewGroupType2;
        ProductReviewGroupType productReviewGroupType3 = new ProductReviewGroupType("UNKNOWN", 2);
        f = productReviewGroupType3;
        ProductReviewGroupType[] productReviewGroupTypeArr = {productReviewGroupType, productReviewGroupType2, productReviewGroupType3};
        g = productReviewGroupTypeArr;
        h = EnumEntriesKt.a(productReviewGroupTypeArr);
    }

    public static ProductReviewGroupType valueOf(String str) {
        return (ProductReviewGroupType) Enum.valueOf(ProductReviewGroupType.class, str);
    }

    public static ProductReviewGroupType[] values() {
        return (ProductReviewGroupType[]) g.clone();
    }
}
