package au.com.woolworths.shop.receipts.analytics;

import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/receipts/analytics/ShopReceiptsScreens;", "Lau/com/woolworths/android/onesite/analytics/Screen;", "", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ShopReceiptsScreens implements Screen {
    public static final ShopReceiptsScreens d;
    public static final ShopReceiptsScreens e;
    public static final /* synthetic */ ShopReceiptsScreens[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        ShopReceiptsScreens shopReceiptsScreens = new ShopReceiptsScreens() { // from class: au.com.woolworths.shop.receipts.analytics.ShopReceiptsScreens.RECEIPT_DETAILS
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "eReceipts";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "ereceiptdetails_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "eReceipt Details screen";
            }
        };
        d = shopReceiptsScreens;
        ShopReceiptsScreens shopReceiptsScreens2 = new ShopReceiptsScreens() { // from class: au.com.woolworths.shop.receipts.analytics.ShopReceiptsScreens.RECEIPT_LIST
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "eReceipts";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "ereceiptslist_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "eReceipts List screen";
            }
        };
        e = shopReceiptsScreens2;
        ShopReceiptsScreens[] shopReceiptsScreensArr = {shopReceiptsScreens, shopReceiptsScreens2};
        f = shopReceiptsScreensArr;
        g = EnumEntriesKt.a(shopReceiptsScreensArr);
    }

    public static ShopReceiptsScreens valueOf(String str) {
        return (ShopReceiptsScreens) Enum.valueOf(ShopReceiptsScreens.class, str);
    }

    public static ShopReceiptsScreens[] values() {
        return (ShopReceiptsScreens[]) f.clone();
    }
}
