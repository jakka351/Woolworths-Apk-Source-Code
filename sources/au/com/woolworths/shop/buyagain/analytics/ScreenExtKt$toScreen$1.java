package au.com.woolworths.shop.buyagain.analytics;

import au.com.woolworths.analytics.supers.buyagain.BuyAgainAnalytics;
import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/shop/buyagain/analytics/ScreenExtKt$toScreen$1", "Lau/com/woolworths/android/onesite/analytics/Screen;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ScreenExtKt$toScreen$1 implements Screen {
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // au.com.woolworths.android.onesite.analytics.Screen
    /* renamed from: a */
    public final String getD() {
        Object obj = BuyAgainAnalytics.BuyAgain.d;
        return String.valueOf(BuyAgainAnalytics.BuyAgain.d.get("app.Section"));
    }

    @Override // au.com.woolworths.android.onesite.analytics.Screen
    public final String b() {
        Object obj = BuyAgainAnalytics.BuyAgain.d;
        return "buy_again_screen";
    }

    @Override // au.com.woolworths.android.onesite.analytics.Screen
    public final String d() {
        Object obj = BuyAgainAnalytics.BuyAgain.d;
        return "Buy Again screen";
    }
}
