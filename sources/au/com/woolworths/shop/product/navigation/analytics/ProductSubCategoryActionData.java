package au.com.woolworths.shop.product.navigation.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/product/navigation/analytics/ProductSubCategoryActionData;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ProductSubCategoryActionData implements Action {
    public static final ProductSubCategoryActionData e;
    public static final ProductSubCategoryActionData f;
    public static final ProductSubCategoryActionData g;
    public static final ProductSubCategoryActionData h;
    public static final ProductSubCategoryActionData i;
    public static final ProductSubCategoryActionData j;
    public static final /* synthetic */ ProductSubCategoryActionData[] k;
    public static final /* synthetic */ EnumEntries l;
    public final ProductCategoryScreens d = ProductCategoryScreens.d;

    static {
        ProductSubCategoryActionData productSubCategoryActionData = new ProductSubCategoryActionData() { // from class: au.com.woolworths.shop.product.navigation.analytics.ProductSubCategoryActionData.SERVER_ERROR
            public final Category m = Category.v;
            public final String n = "Server Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getN() {
                return this.n;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getM() {
                return this.m;
            }
        };
        e = productSubCategoryActionData;
        ProductSubCategoryActionData productSubCategoryActionData2 = new ProductSubCategoryActionData() { // from class: au.com.woolworths.shop.product.navigation.analytics.ProductSubCategoryActionData.NETWORK_ERROR
            public final Category m = Category.v;
            public final String n = "Network Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getN() {
                return this.n;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getM() {
                return this.m;
            }
        };
        f = productSubCategoryActionData2;
        ProductSubCategoryActionData productSubCategoryActionData3 = new ProductSubCategoryActionData() { // from class: au.com.woolworths.shop.product.navigation.analytics.ProductSubCategoryActionData.NO_RESULT
            public final Category m = Category.v;
            public final String n = "No Results Found";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getN() {
                return this.n;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getM() {
                return this.m;
            }
        };
        g = productSubCategoryActionData3;
        ProductSubCategoryActionData productSubCategoryActionData4 = new ProductSubCategoryActionData() { // from class: au.com.woolworths.shop.product.navigation.analytics.ProductSubCategoryActionData.SERVER_ERROR_TRY_AGAIN
            public final Category m = Category.v;
            public final String n = "Server Error - Try Again";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getN() {
                return this.n;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getM() {
                return this.m;
            }
        };
        h = productSubCategoryActionData4;
        ProductSubCategoryActionData productSubCategoryActionData5 = new ProductSubCategoryActionData() { // from class: au.com.woolworths.shop.product.navigation.analytics.ProductSubCategoryActionData.NETWORK_ERROR_TRY_AGAIN
            public final Category m = Category.v;
            public final String n = "Network Error - Try Again";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getN() {
                return this.n;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getM() {
                return this.m;
            }
        };
        i = productSubCategoryActionData5;
        ProductSubCategoryActionData productSubCategoryActionData6 = new ProductSubCategoryActionData() { // from class: au.com.woolworths.shop.product.navigation.analytics.ProductSubCategoryActionData.SEARCH_ICON_CLICK
            public final Category m = Category.m;
            public final String n = "Tap Search Icon";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getN() {
                return this.n;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getM() {
                return this.m;
            }
        };
        j = productSubCategoryActionData6;
        ProductSubCategoryActionData[] productSubCategoryActionDataArr = {productSubCategoryActionData, productSubCategoryActionData2, productSubCategoryActionData3, productSubCategoryActionData4, productSubCategoryActionData5, productSubCategoryActionData6};
        k = productSubCategoryActionDataArr;
        l = EnumEntriesKt.a(productSubCategoryActionDataArr);
    }

    public ProductSubCategoryActionData(String str, int i2) {
    }

    public static ProductSubCategoryActionData valueOf(String str) {
        return (ProductSubCategoryActionData) Enum.valueOf(ProductSubCategoryActionData.class, str);
    }

    public static ProductSubCategoryActionData[] values() {
        return (ProductSubCategoryActionData[]) k.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
