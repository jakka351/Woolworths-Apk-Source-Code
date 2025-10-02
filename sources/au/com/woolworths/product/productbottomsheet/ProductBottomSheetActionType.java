package au.com.woolworths.product.productbottomsheet;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/productbottomsheet/ProductBottomSheetActionType;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductBottomSheetActionType {
    public static final ProductBottomSheetActionType d;
    public static final ProductBottomSheetActionType e;
    public static final ProductBottomSheetActionType f;
    public static final /* synthetic */ ProductBottomSheetActionType[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        ProductBottomSheetActionType productBottomSheetActionType = new ProductBottomSheetActionType("ADD", 0);
        d = productBottomSheetActionType;
        ProductBottomSheetActionType productBottomSheetActionType2 = new ProductBottomSheetActionType("UPDATE", 1);
        e = productBottomSheetActionType2;
        ProductBottomSheetActionType productBottomSheetActionType3 = new ProductBottomSheetActionType("REMOVE", 2);
        f = productBottomSheetActionType3;
        ProductBottomSheetActionType[] productBottomSheetActionTypeArr = {productBottomSheetActionType, productBottomSheetActionType2, productBottomSheetActionType3};
        g = productBottomSheetActionTypeArr;
        h = EnumEntriesKt.a(productBottomSheetActionTypeArr);
    }

    public static ProductBottomSheetActionType valueOf(String str) {
        return (ProductBottomSheetActionType) Enum.valueOf(ProductBottomSheetActionType.class, str);
    }

    public static ProductBottomSheetActionType[] values() {
        return (ProductBottomSheetActionType[]) g.clone();
    }
}
