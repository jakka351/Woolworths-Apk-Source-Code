package au.com.woolworths.shop.product.navigation.analytics;

import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/product/navigation/analytics/ProductCategoryScreens;", "Lau/com/woolworths/android/onesite/analytics/Screen;", "", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ProductCategoryScreens implements Screen {
    public static final ProductCategoryScreens d;
    public static final ProductCategoryScreens e;
    public static final ProductCategoryScreens f;
    public static final /* synthetic */ ProductCategoryScreens[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        ProductCategoryScreens productCategoryScreens = new ProductCategoryScreens() { // from class: au.com.woolworths.shop.product.navigation.analytics.ProductCategoryScreens.PRODUCT_CATEGORY
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Products";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "productcategories_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Product Categories Screen";
            }
        };
        d = productCategoryScreens;
        ProductCategoryScreens productCategoryScreens2 = new ProductCategoryScreens() { // from class: au.com.woolworths.shop.product.navigation.analytics.ProductCategoryScreens.SPECIALS
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Specials";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "specials_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Specials screen";
            }
        };
        e = productCategoryScreens2;
        ProductCategoryScreens productCategoryScreens3 = new ProductCategoryScreens() { // from class: au.com.woolworths.shop.product.navigation.analytics.ProductCategoryScreens.SPECIALS_CATEGORY
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Specials";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "specialscategory_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Specials Category screen";
            }
        };
        f = productCategoryScreens3;
        ProductCategoryScreens[] productCategoryScreensArr = {productCategoryScreens, productCategoryScreens2, productCategoryScreens3};
        g = productCategoryScreensArr;
        h = EnumEntriesKt.a(productCategoryScreensArr);
    }

    public static ProductCategoryScreens valueOf(String str) {
        return (ProductCategoryScreens) Enum.valueOf(ProductCategoryScreens.class, str);
    }

    public static ProductCategoryScreens[] values() {
        return (ProductCategoryScreens[]) g.clone();
    }
}
