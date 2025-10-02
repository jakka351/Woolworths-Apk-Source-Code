package au.com.woolworths.feature.product.list.legacy.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListOptionsActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ProductListOptionsActions implements Action {
    public static final ProductListOptionsActions e;
    public static final ProductListOptionsActions f;
    public static final ProductListOptionsActions g;
    public static final ProductListOptionsActions h;
    public static final ProductListOptionsActions i;
    public static final ProductListOptionsActions j;
    public static final ProductListOptionsActions k;
    public static final ProductListOptionsActions l;
    public static final /* synthetic */ ProductListOptionsActions[] m;
    public static final /* synthetic */ EnumEntries n;
    public final ProductListScreens d = ProductListScreens.g;

    static {
        ProductListOptionsActions productListOptionsActions = new ProductListOptionsActions() { // from class: au.com.woolworths.feature.product.list.legacy.analytics.ProductListOptionsActions.CLOSE_FILTERS
            public final Category o = Category.m;
            public final String p = "Close Filters Bottomsheet";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getP() {
                return this.p;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getO() {
                return this.o;
            }
        };
        e = productListOptionsActions;
        ProductListOptionsActions productListOptionsActions2 = new ProductListOptionsActions() { // from class: au.com.woolworths.feature.product.list.legacy.analytics.ProductListOptionsActions.FILTER_SCREEN_IMPRESSION
            public final Category o = Category.k;
            public final String p = "Filter";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getP() {
                return this.p;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getO() {
                return this.o;
            }
        };
        f = productListOptionsActions2;
        ProductListOptionsActions productListOptionsActions3 = new ProductListOptionsActions() { // from class: au.com.woolworths.feature.product.list.legacy.analytics.ProductListOptionsActions.MARKETPLACE_SWITCH_CHECK_OFF
            public final Category o = Category.h0;
            public final String p = "Everyday Market filter off";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getP() {
                return this.p;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getO() {
                return this.o;
            }
        };
        g = productListOptionsActions3;
        ProductListOptionsActions productListOptionsActions4 = new ProductListOptionsActions() { // from class: au.com.woolworths.feature.product.list.legacy.analytics.ProductListOptionsActions.MARKETPLACE_SWITCH_CHECK_ON
            public final Category o = Category.i0;
            public final String p = "Everyday Market filter on";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getP() {
                return this.p;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getO() {
                return this.o;
            }
        };
        h = productListOptionsActions4;
        ProductListOptionsActions productListOptionsActions5 = new ProductListOptionsActions() { // from class: au.com.woolworths.feature.product.list.legacy.analytics.ProductListOptionsActions.MARKETPLACE_SWITCH_CTA_CLICK
            public final Category o = Category.m;
            public final String p = "Learn more - Everyday Market Filter";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getP() {
                return this.p;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getO() {
                return this.o;
            }
        };
        i = productListOptionsActions5;
        ProductListOptionsActions productListOptionsActions6 = new ProductListOptionsActions() { // from class: au.com.woolworths.feature.product.list.legacy.analytics.ProductListOptionsActions.RESET_FILTER_CLICK
            public final Category o = Category.m;
            public final String p = "Reset Filters";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getP() {
                return this.p;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getO() {
                return this.o;
            }
        };
        j = productListOptionsActions6;
        ProductListOptionsActions productListOptionsActions7 = new ProductListOptionsActions() { // from class: au.com.woolworths.feature.product.list.legacy.analytics.ProductListOptionsActions.SEE_RESULTS_CLICK
            public final Category o = Category.m;
            public final String p = "See Results";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getP() {
                return this.p;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getO() {
                return this.o;
            }
        };
        k = productListOptionsActions7;
        ProductListOptionsActions productListOptionsActions8 = new ProductListOptionsActions() { // from class: au.com.woolworths.feature.product.list.legacy.analytics.ProductListOptionsActions.UNABLE_TO_APPLY_FILTERS_ERROR
            public final Category o = Category.g0;
            public final String p = "Product Filter Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getP() {
                return this.p;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getO() {
                return this.o;
            }
        };
        l = productListOptionsActions8;
        ProductListOptionsActions[] productListOptionsActionsArr = {productListOptionsActions, productListOptionsActions2, productListOptionsActions3, productListOptionsActions4, productListOptionsActions5, productListOptionsActions6, productListOptionsActions7, productListOptionsActions8};
        m = productListOptionsActionsArr;
        n = EnumEntriesKt.a(productListOptionsActionsArr);
    }

    public ProductListOptionsActions(String str, int i2) {
    }

    public static ProductListOptionsActions valueOf(String str) {
        return (ProductListOptionsActions) Enum.valueOf(ProductListOptionsActions.class, str);
    }

    public static ProductListOptionsActions[] values() {
        return (ProductListOptionsActions[]) m.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
