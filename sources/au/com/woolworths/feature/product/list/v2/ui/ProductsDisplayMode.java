package au.com.woolworths.feature.product.list.v2.ui;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ui/ProductsDisplayMode;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductsDisplayMode {
    public static final ProductsDisplayMode d;
    public static final ProductsDisplayMode e;
    public static final /* synthetic */ ProductsDisplayMode[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        ProductsDisplayMode productsDisplayMode = new ProductsDisplayMode("LIST", 0);
        d = productsDisplayMode;
        ProductsDisplayMode productsDisplayMode2 = new ProductsDisplayMode("GRID", 1);
        e = productsDisplayMode2;
        ProductsDisplayMode[] productsDisplayModeArr = {productsDisplayMode, productsDisplayMode2};
        f = productsDisplayModeArr;
        g = EnumEntriesKt.a(productsDisplayModeArr);
    }

    public static ProductsDisplayMode valueOf(String str) {
        return (ProductsDisplayMode) Enum.valueOf(ProductsDisplayMode.class, str);
    }

    public static ProductsDisplayMode[] values() {
        return (ProductsDisplayMode[]) f.clone();
    }
}
