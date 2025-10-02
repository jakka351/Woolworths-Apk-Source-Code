package au.com.woolworths.feature.shared.instore.wifi.analytics;

import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/analytics/WifiScreens;", "Lau/com/woolworths/android/onesite/analytics/Screen;", "", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class WifiScreens implements Screen {
    public static final WifiScreens d;
    public static final WifiScreens e;
    public static final WifiScreens f;
    public static final /* synthetic */ WifiScreens[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        WifiScreens wifiScreens = new WifiScreens() { // from class: au.com.woolworths.feature.shared.instore.wifi.analytics.WifiScreens.INSTORE_WIFI
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Instore Wi-Fi";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "instorewi-fi_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Instore Wi-Fi screen";
            }
        };
        d = wifiScreens;
        WifiScreens wifiScreens2 = new WifiScreens() { // from class: au.com.woolworths.feature.shared.instore.wifi.analytics.WifiScreens.INSTORE_WIFI_ALREADY_CONNECTED
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Instore Wi-Fi";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "instorewi-fienabled_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Instore Wi-Fi enabled screen";
            }
        };
        e = wifiScreens2;
        WifiScreens wifiScreens3 = new WifiScreens() { // from class: au.com.woolworths.feature.shared.instore.wifi.analytics.WifiScreens.INSTORE_WIFI_TNCS
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Instore Wi-Fi";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "t&candprivacypolicy_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "T&C and Privacy Policy screen";
            }
        };
        f = wifiScreens3;
        WifiScreens[] wifiScreensArr = {wifiScreens, wifiScreens2, wifiScreens3};
        g = wifiScreensArr;
        h = EnumEntriesKt.a(wifiScreensArr);
    }

    public static WifiScreens valueOf(String str) {
        return (WifiScreens) Enum.valueOf(WifiScreens.class, str);
    }

    public static WifiScreens[] values() {
        return (WifiScreens[]) g.clone();
    }
}
