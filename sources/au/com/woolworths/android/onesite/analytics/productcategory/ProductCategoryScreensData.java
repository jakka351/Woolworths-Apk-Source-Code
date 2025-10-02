package au.com.woolworths.android.onesite.analytics.productcategory;

import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/productcategory/ProductCategoryScreensData;", "Lau/com/woolworths/android/onesite/analytics/Screen;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ProductCategoryScreensData implements Screen {
    public static final ProductCategoryScreensData d;
    public static final /* synthetic */ ProductCategoryScreensData[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        ProductCategoryScreensData productCategoryScreensData = new ProductCategoryScreensData() { // from class: au.com.woolworths.android.onesite.analytics.productcategory.ProductCategoryScreensData.PRODUCT_CATEGORY
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Products";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "error_impression";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Products screen";
            }
        };
        d = productCategoryScreensData;
        ProductCategoryScreensData[] productCategoryScreensDataArr = {productCategoryScreensData};
        e = productCategoryScreensDataArr;
        f = EnumEntriesKt.a(productCategoryScreensDataArr);
    }

    public static ProductCategoryScreensData valueOf(String str) {
        return (ProductCategoryScreensData) Enum.valueOf(ProductCategoryScreensData.class, str);
    }

    public static ProductCategoryScreensData[] values() {
        return (ProductCategoryScreensData[]) e.clone();
    }
}
