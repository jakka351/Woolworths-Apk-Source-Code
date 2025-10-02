package au.com.woolworths.android.onesite.analytics.productcategory;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/productcategory/ProductSubCategoryData;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ProductSubCategoryData implements Action {
    public static final ProductSubCategoryData e;
    public static final ProductSubCategoryData f;
    public static final /* synthetic */ ProductSubCategoryData[] g;
    public static final /* synthetic */ EnumEntries h;
    public final ProductCategoryScreensData d = ProductCategoryScreensData.d;

    static {
        ProductSubCategoryData productSubCategoryData = new ProductSubCategoryData() { // from class: au.com.woolworths.android.onesite.analytics.productcategory.ProductSubCategoryData.SERVER_ERROR
            public final Category i = Category.v;
            public final String j = "Server Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getJ() {
                return this.j;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getI() {
                return this.i;
            }
        };
        e = productSubCategoryData;
        ProductSubCategoryData productSubCategoryData2 = new ProductSubCategoryData() { // from class: au.com.woolworths.android.onesite.analytics.productcategory.ProductSubCategoryData.NETWORK_ERROR
            public final Category i = Category.v;
            public final String j = "Network Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getJ() {
                return this.j;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getI() {
                return this.i;
            }
        };
        f = productSubCategoryData2;
        ProductSubCategoryData[] productSubCategoryDataArr = {productSubCategoryData, productSubCategoryData2};
        g = productSubCategoryDataArr;
        h = EnumEntriesKt.a(productSubCategoryDataArr);
    }

    public ProductSubCategoryData(String str, int i) {
    }

    public static ProductSubCategoryData valueOf(String str) {
        return (ProductSubCategoryData) Enum.valueOf(ProductSubCategoryData.class, str);
    }

    public static ProductSubCategoryData[] values() {
        return (ProductSubCategoryData[]) g.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
