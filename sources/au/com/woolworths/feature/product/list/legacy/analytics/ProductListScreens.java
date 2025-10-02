package au.com.woolworths.feature.product.list.legacy.analytics;

import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListScreens;", "Lau/com/woolworths/android/onesite/analytics/Screen;", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ProductListScreens implements Screen {
    public static final ProductListScreens d;
    public static final ProductListScreens e;
    public static final ProductListScreens f;
    public static final ProductListScreens g;
    public static final ProductListScreens h;
    public static final /* synthetic */ ProductListScreens[] i;
    public static final /* synthetic */ EnumEntries j;

    static {
        ProductListScreens productListScreens = new ProductListScreens() { // from class: au.com.woolworths.feature.product.list.legacy.analytics.ProductListScreens.PRODUCT_CHILD_FILTER
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Products";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "productchildfilter_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Product Child Filter screen";
            }
        };
        d = productListScreens;
        ProductListScreens productListScreens2 = new ProductListScreens() { // from class: au.com.woolworths.feature.product.list.legacy.analytics.ProductListScreens.PRODUCT_LIST
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Products";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "productlist_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Products List screen";
            }
        };
        e = productListScreens2;
        ProductListScreens productListScreens3 = new ProductListScreens() { // from class: au.com.woolworths.feature.product.list.legacy.analytics.ProductListScreens.PRODUCT_LIST_FROM_RECIPES
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Recipes";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "productlist_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Products List screen";
            }
        };
        f = productListScreens3;
        ProductListScreens productListScreens4 = new ProductListScreens() { // from class: au.com.woolworths.feature.product.list.legacy.analytics.ProductListScreens.PRODUCT_LIST_OPTIONS
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Products";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "productfilter_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Product Filter screen";
            }
        };
        g = productListScreens4;
        ProductListScreens productListScreens5 = new ProductListScreens() { // from class: au.com.woolworths.feature.product.list.legacy.analytics.ProductListScreens.ZERO_RESULTS
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Products";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "productlist_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Zero Result";
            }
        };
        h = productListScreens5;
        ProductListScreens[] productListScreensArr = {productListScreens, productListScreens2, productListScreens3, productListScreens4, productListScreens5};
        i = productListScreensArr;
        j = EnumEntriesKt.a(productListScreensArr);
    }

    public static ProductListScreens valueOf(String str) {
        return (ProductListScreens) Enum.valueOf(ProductListScreens.class, str);
    }

    public static ProductListScreens[] values() {
        return (ProductListScreens[]) i.clone();
    }
}
