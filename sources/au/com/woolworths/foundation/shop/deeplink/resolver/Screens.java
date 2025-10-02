package au.com.woolworths.foundation.shop.deeplink.resolver;

import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/deeplink/resolver/Screens;", "Lau/com/woolworths/android/onesite/analytics/Screen;", "", "deeplink-resolver_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class Screens implements Screen {
    public static final Screens d;
    public static final /* synthetic */ Screens[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        Screens screens = new Screens() { // from class: au.com.woolworths.foundation.shop.deeplink.resolver.Screens.SHOP_APP_DEEPLINK
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "DeepLink";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Shop App DeepLink screen";
            }
        };
        d = screens;
        Screens[] screensArr = {screens};
        e = screensArr;
        f = EnumEntriesKt.a(screensArr);
    }

    public static Screens valueOf(String str) {
        return (Screens) Enum.valueOf(Screens.class, str);
    }

    public static Screens[] values() {
        return (Screens[]) e.clone();
    }
}
