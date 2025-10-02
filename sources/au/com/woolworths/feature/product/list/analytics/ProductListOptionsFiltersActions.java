package au.com.woolworths.feature.product.list.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/analytics/ProductListOptionsFiltersActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ProductListOptionsFiltersActions implements Action {
    public static final ProductListOptionsFiltersActions e;
    public static final ProductListOptionsFiltersActions f;
    public static final ProductListOptionsFiltersActions g;
    public static final ProductListOptionsFiltersActions h;
    public static final ProductListOptionsFiltersActions i;
    public static final ProductListOptionsFiltersActions j;
    public static final ProductListOptionsFiltersActions k;
    public static final /* synthetic */ ProductListOptionsFiltersActions[] l;
    public static final /* synthetic */ EnumEntries m;
    public final ProductListScreens d = ProductListScreens.d;

    static {
        ProductListOptionsFiltersActions productListOptionsFiltersActions = new ProductListOptionsFiltersActions() { // from class: au.com.woolworths.feature.product.list.analytics.ProductListOptionsFiltersActions.CLEAR_CLICK
            public final Category n = Category.m;
            public final String o = "Clear";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.o;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.n;
            }
        };
        e = productListOptionsFiltersActions;
        ProductListOptionsFiltersActions productListOptionsFiltersActions2 = new ProductListOptionsFiltersActions() { // from class: au.com.woolworths.feature.product.list.analytics.ProductListOptionsFiltersActions.DIETARY_BANNER_IMPRESSION
            public final Category n = Category.B;
            public final String o = "Inset Banner impression";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.o;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.n;
            }
        };
        f = productListOptionsFiltersActions2;
        ProductListOptionsFiltersActions productListOptionsFiltersActions3 = new ProductListOptionsFiltersActions() { // from class: au.com.woolworths.feature.product.list.analytics.ProductListOptionsFiltersActions.DIETARY_BANNER_FIND_OUT_MORE_CLICK
            public final Category n = Category.m;
            public final String o = "Click on Inset Banner";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.o;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.n;
            }
        };
        g = productListOptionsFiltersActions3;
        ProductListOptionsFiltersActions productListOptionsFiltersActions4 = new ProductListOptionsFiltersActions() { // from class: au.com.woolworths.feature.product.list.analytics.ProductListOptionsFiltersActions.FILTER_CHECKED
            public final Category n = Category.p;
            public final String o = "Select Child Filter";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.o;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.n;
            }
        };
        h = productListOptionsFiltersActions4;
        ProductListOptionsFiltersActions productListOptionsFiltersActions5 = new ProductListOptionsFiltersActions() { // from class: au.com.woolworths.feature.product.list.analytics.ProductListOptionsFiltersActions.FILTER_UNCHECKED
            public final Category n = Category.q;
            public final String o = "Deselect Child Filter";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.o;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.n;
            }
        };
        i = productListOptionsFiltersActions5;
        ProductListOptionsFiltersActions productListOptionsFiltersActions6 = new ProductListOptionsFiltersActions() { // from class: au.com.woolworths.feature.product.list.analytics.ProductListOptionsFiltersActions.SEE_RESULTS_CLICK
            public final Category n = Category.m;
            public final String o = "See Results";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.o;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.n;
            }
        };
        j = productListOptionsFiltersActions6;
        ProductListOptionsFiltersActions productListOptionsFiltersActions7 = new ProductListOptionsFiltersActions() { // from class: au.com.woolworths.feature.product.list.analytics.ProductListOptionsFiltersActions.SELECT_ALL_CLICK
            public final Category n = Category.m;
            public final String o = "Select All";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.o;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.n;
            }
        };
        k = productListOptionsFiltersActions7;
        ProductListOptionsFiltersActions[] productListOptionsFiltersActionsArr = {productListOptionsFiltersActions, productListOptionsFiltersActions2, productListOptionsFiltersActions3, productListOptionsFiltersActions4, productListOptionsFiltersActions5, productListOptionsFiltersActions6, productListOptionsFiltersActions7};
        l = productListOptionsFiltersActionsArr;
        m = EnumEntriesKt.a(productListOptionsFiltersActionsArr);
    }

    public ProductListOptionsFiltersActions(String str, int i2) {
    }

    public static ProductListOptionsFiltersActions valueOf(String str) {
        return (ProductListOptionsFiltersActions) Enum.valueOf(ProductListOptionsFiltersActions.class, str);
    }

    public static ProductListOptionsFiltersActions[] values() {
        return (ProductListOptionsFiltersActions[]) l.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
