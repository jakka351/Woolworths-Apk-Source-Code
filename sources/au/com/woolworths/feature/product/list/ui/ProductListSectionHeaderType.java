package au.com.woolworths.feature.product.list.ui;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ui/ProductListSectionHeaderType;", "", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ProductListSectionHeaderType {
    public static final /* synthetic */ ProductListSectionHeaderType[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        ProductListSectionHeaderType[] productListSectionHeaderTypeArr = {new ProductListSectionHeaderType() { // from class: au.com.woolworths.feature.product.list.ui.ProductListSectionHeaderType.PRIMARY
        }, new ProductListSectionHeaderType() { // from class: au.com.woolworths.feature.product.list.ui.ProductListSectionHeaderType.SECONDARY
        }};
        d = productListSectionHeaderTypeArr;
        e = EnumEntriesKt.a(productListSectionHeaderTypeArr);
    }

    public static ProductListSectionHeaderType valueOf(String str) {
        return (ProductListSectionHeaderType) Enum.valueOf(ProductListSectionHeaderType.class, str);
    }

    public static ProductListSectionHeaderType[] values() {
        return (ProductListSectionHeaderType[]) d.clone();
    }
}
