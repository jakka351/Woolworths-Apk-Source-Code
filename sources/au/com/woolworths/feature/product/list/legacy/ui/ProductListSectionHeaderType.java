package au.com.woolworths.feature.product.list.legacy.ui;

import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ui/ProductListSectionHeaderType;", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ProductListSectionHeaderType {
    public static final ProductListSectionHeaderType d;
    public static final ProductListSectionHeaderType e;
    public static final /* synthetic */ ProductListSectionHeaderType[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        ProductListSectionHeaderType productListSectionHeaderType = new ProductListSectionHeaderType() { // from class: au.com.woolworths.feature.product.list.legacy.ui.ProductListSectionHeaderType.PRIMARY
            @Override // au.com.woolworths.feature.product.list.legacy.ui.ProductListSectionHeaderType
            public final int a() {
                return R.style.TextAppearance_H6;
            }

            @Override // au.com.woolworths.feature.product.list.legacy.ui.ProductListSectionHeaderType
            public final int b() {
                return android.R.attr.textColorPrimary;
            }
        };
        d = productListSectionHeaderType;
        ProductListSectionHeaderType productListSectionHeaderType2 = new ProductListSectionHeaderType() { // from class: au.com.woolworths.feature.product.list.legacy.ui.ProductListSectionHeaderType.SECONDARY
            @Override // au.com.woolworths.feature.product.list.legacy.ui.ProductListSectionHeaderType
            public final int a() {
                return R.style.TextAppearance_Subtitle2;
            }

            @Override // au.com.woolworths.feature.product.list.legacy.ui.ProductListSectionHeaderType
            public final int b() {
                return android.R.attr.textColorSecondary;
            }
        };
        e = productListSectionHeaderType2;
        ProductListSectionHeaderType[] productListSectionHeaderTypeArr = {productListSectionHeaderType, productListSectionHeaderType2};
        f = productListSectionHeaderTypeArr;
        g = EnumEntriesKt.a(productListSectionHeaderTypeArr);
    }

    public static ProductListSectionHeaderType valueOf(String str) {
        return (ProductListSectionHeaderType) Enum.valueOf(ProductListSectionHeaderType.class, str);
    }

    public static ProductListSectionHeaderType[] values() {
        return (ProductListSectionHeaderType[]) f.clone();
    }

    public abstract int a();

    public abstract int b();
}
