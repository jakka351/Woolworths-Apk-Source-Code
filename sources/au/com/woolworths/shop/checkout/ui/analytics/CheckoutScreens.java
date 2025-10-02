package au.com.woolworths.shop.checkout.ui.analytics;

import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutScreens;", "Lau/com/woolworths/android/onesite/analytics/Screen;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class CheckoutScreens implements Screen {
    public static final CheckoutScreens d;
    public static final CheckoutScreens e;
    public static final /* synthetic */ CheckoutScreens[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        CheckoutScreens checkoutScreens = new CheckoutScreens() { // from class: au.com.woolworths.shop.checkout.ui.analytics.CheckoutScreens.CHECKOUT_SUBSTITUTION
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Checkout";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Substitution Preference";
            }
        };
        d = checkoutScreens;
        CheckoutScreens checkoutScreens2 = new CheckoutScreens() { // from class: au.com.woolworths.shop.checkout.ui.analytics.CheckoutScreens.CHECKOUT_WINDOWS_SELECTION
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Checkout";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Window Selection screen";
            }
        };
        e = checkoutScreens2;
        CheckoutScreens[] checkoutScreensArr = {checkoutScreens, checkoutScreens2};
        f = checkoutScreensArr;
        g = EnumEntriesKt.a(checkoutScreensArr);
    }

    public static CheckoutScreens valueOf(String str) {
        return (CheckoutScreens) Enum.valueOf(CheckoutScreens.class, str);
    }

    public static CheckoutScreens[] values() {
        return (CheckoutScreens[]) f.clone();
    }
}
