package au.com.woolworths.android.onesite.deeplink;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/deeplink/ProductListPathPlaceholders;", "Lau/com/woolworths/android/onesite/deeplink/PlaceholderValue;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ProductListPathPlaceholders implements PlaceholderValue {
    public static final /* synthetic */ ProductListPathPlaceholders[] d;
    public static final /* synthetic */ EnumEntries e;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/android/onesite/deeplink/ProductListPathPlaceholders.TYPE", "Lau/com/woolworths/android/onesite/deeplink/ProductListPathPlaceholders;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TYPE extends ProductListPathPlaceholders {
        @Override // au.com.woolworths.android.onesite.deeplink.PlaceholderValue
        public final List a() {
            return CollectionsKt.G0(ProductListTypePlaceholderValues.f);
        }
    }

    static {
        ProductListPathPlaceholders[] productListPathPlaceholdersArr = {new TYPE(CredentialProviderBaseController.TYPE_TAG, 0)};
        d = productListPathPlaceholdersArr;
        e = EnumEntriesKt.a(productListPathPlaceholdersArr);
    }

    public static ProductListPathPlaceholders valueOf(String str) {
        return (ProductListPathPlaceholders) Enum.valueOf(ProductListPathPlaceholders.class, str);
    }

    public static ProductListPathPlaceholders[] values() {
        return (ProductListPathPlaceholders[]) d.clone();
    }

    @Override // au.com.woolworths.android.onesite.deeplink.PlaceholderValue
    public final String b() {
        return "type";
    }
}
