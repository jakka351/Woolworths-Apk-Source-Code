package au.com.woolworths.android.onesite.modules.couponbanner;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/couponbanner/EverydayMarketCouponBannerColorTheme;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EverydayMarketCouponBannerColorTheme {
    public static final EverydayMarketCouponBannerColorTheme d;
    public static final EverydayMarketCouponBannerColorTheme e;
    public static final /* synthetic */ EverydayMarketCouponBannerColorTheme[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        EverydayMarketCouponBannerColorTheme everydayMarketCouponBannerColorTheme = new EverydayMarketCouponBannerColorTheme("DEFAULT", 0);
        d = everydayMarketCouponBannerColorTheme;
        EverydayMarketCouponBannerColorTheme everydayMarketCouponBannerColorTheme2 = new EverydayMarketCouponBannerColorTheme("DEFAULT_BG_WHITE", 1);
        e = everydayMarketCouponBannerColorTheme2;
        EverydayMarketCouponBannerColorTheme[] everydayMarketCouponBannerColorThemeArr = {everydayMarketCouponBannerColorTheme, everydayMarketCouponBannerColorTheme2};
        f = everydayMarketCouponBannerColorThemeArr;
        g = EnumEntriesKt.a(everydayMarketCouponBannerColorThemeArr);
    }

    public static EverydayMarketCouponBannerColorTheme valueOf(String str) {
        return (EverydayMarketCouponBannerColorTheme) Enum.valueOf(EverydayMarketCouponBannerColorTheme.class, str);
    }

    public static EverydayMarketCouponBannerColorTheme[] values() {
        return (EverydayMarketCouponBannerColorTheme[]) f.clone();
    }
}
