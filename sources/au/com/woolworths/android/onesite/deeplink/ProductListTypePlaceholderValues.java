package au.com.woolworths.android.onesite.deeplink;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/deeplink/ProductListTypePlaceholderValues;", "Lau/com/woolworths/android/onesite/deeplink/PlaceholderVariables;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductListTypePlaceholderValues implements PlaceholderVariables {
    public static final /* synthetic */ ProductListTypePlaceholderValues[] e;
    public static final /* synthetic */ EnumEntries f;
    public final String d;

    static {
        ProductListTypePlaceholderValues[] productListTypePlaceholderValuesArr = {new ProductListTypePlaceholderValues("PRODUCT_GROUP", 0, "productGroup"), new ProductListTypePlaceholderValues("SPECIALS_GROUP", 1, "specialsGroup")};
        e = productListTypePlaceholderValuesArr;
        f = EnumEntriesKt.a(productListTypePlaceholderValuesArr);
    }

    public ProductListTypePlaceholderValues(String str, int i, String str2) {
        this.d = str2;
    }

    public static ProductListTypePlaceholderValues valueOf(String str) {
        return (ProductListTypePlaceholderValues) Enum.valueOf(ProductListTypePlaceholderValues.class, str);
    }

    public static ProductListTypePlaceholderValues[] values() {
        return (ProductListTypePlaceholderValues[]) e.clone();
    }

    @Override // au.com.woolworths.android.onesite.deeplink.PlaceholderVariables
    /* renamed from: a, reason: from getter */
    public final String getD() {
        return this.d;
    }
}
