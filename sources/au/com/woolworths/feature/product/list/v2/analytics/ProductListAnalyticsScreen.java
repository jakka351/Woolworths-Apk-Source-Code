package au.com.woolworths.feature.product.list.v2.analytics;

import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/analytics/ProductListAnalyticsScreen;", "Lau/com/woolworths/android/onesite/analytics/Screen;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ProductListAnalyticsScreen implements Screen {
    public static final ProductListAnalyticsScreen d;
    public static final /* synthetic */ ProductListAnalyticsScreen[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        ProductListAnalyticsScreen productListAnalyticsScreen = new ProductListAnalyticsScreen() { // from class: au.com.woolworths.feature.product.list.v2.analytics.ProductListAnalyticsScreen.SEARCH_RESULTS
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Text Search";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Search Results screen";
            }
        };
        d = productListAnalyticsScreen;
        ProductListAnalyticsScreen[] productListAnalyticsScreenArr = {productListAnalyticsScreen};
        e = productListAnalyticsScreenArr;
        f = EnumEntriesKt.a(productListAnalyticsScreenArr);
    }

    public static ProductListAnalyticsScreen valueOf(String str) {
        return (ProductListAnalyticsScreen) Enum.valueOf(ProductListAnalyticsScreen.class, str);
    }

    public static ProductListAnalyticsScreen[] values() {
        return (ProductListAnalyticsScreen[]) e.clone();
    }
}
