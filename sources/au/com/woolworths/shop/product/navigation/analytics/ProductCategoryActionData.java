package au.com.woolworths.shop.product.navigation.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.Screens;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/product/navigation/analytics/ProductCategoryActionData;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ProductCategoryActionData implements Action {
    public static final /* synthetic */ ProductCategoryActionData[] e;
    public static final /* synthetic */ EnumEntries f;
    public final Screens d = Screens.u;

    static {
        ProductCategoryActionData[] productCategoryActionDataArr = {new ProductCategoryActionData() { // from class: au.com.woolworths.shop.product.navigation.analytics.ProductCategoryActionData.SERVER_ERROR
            public final Category g = Category.v;
            public final String h = "Server Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getH() {
                return this.h;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getG() {
                return this.g;
            }
        }, new ProductCategoryActionData() { // from class: au.com.woolworths.shop.product.navigation.analytics.ProductCategoryActionData.NETWORK_ERROR
            public final Category g = Category.v;
            public final String h = "Network Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getH() {
                return this.h;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getG() {
                return this.g;
            }
        }, new ProductCategoryActionData() { // from class: au.com.woolworths.shop.product.navigation.analytics.ProductCategoryActionData.NO_RESULT
            public final Category g = Category.v;
            public final String h = "No Results Found";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getH() {
                return this.h;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getG() {
                return this.g;
            }
        }, new ProductCategoryActionData() { // from class: au.com.woolworths.shop.product.navigation.analytics.ProductCategoryActionData.SERVER_ERROR_TRY_AGAIN
            public final Category g = Category.m;
            public final String h = "Server Error - Try Again";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getH() {
                return this.h;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getG() {
                return this.g;
            }
        }, new ProductCategoryActionData() { // from class: au.com.woolworths.shop.product.navigation.analytics.ProductCategoryActionData.NETWORK_ERROR_TRY_AGAIN
            public final Category g = Category.m;
            public final String h = "Network Error - Try Again";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getH() {
                return this.h;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getG() {
                return this.g;
            }
        }};
        e = productCategoryActionDataArr;
        f = EnumEntriesKt.a(productCategoryActionDataArr);
    }

    public ProductCategoryActionData(String str, int i) {
    }

    public static ProductCategoryActionData valueOf(String str) {
        return (ProductCategoryActionData) Enum.valueOf(ProductCategoryActionData.class, str);
    }

    public static ProductCategoryActionData[] values() {
        return (ProductCategoryActionData[]) e.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
