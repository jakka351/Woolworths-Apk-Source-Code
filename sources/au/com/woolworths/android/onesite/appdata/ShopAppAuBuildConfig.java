package au.com.woolworths.android.onesite.appdata;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/appdata/ShopAppAuBuildConfig;", "Lau/com/woolworths/android/onesite/appdata/AppBuildConfig;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ShopAppAuBuildConfig implements AppBuildConfig {
    public static final ShopAppAuBuildConfig d;
    public static final ShopAppAuBuildConfig e;
    public static final ShopAppAuBuildConfig f;
    public static final ShopAppAuBuildConfig g;
    public static final ShopAppAuBuildConfig h;
    public static final /* synthetic */ ShopAppAuBuildConfig[] i;
    public static final /* synthetic */ EnumEntries j;

    static {
        ShopAppAuBuildConfig shopAppAuBuildConfig = new ShopAppAuBuildConfig() { // from class: au.com.woolworths.android.onesite.appdata.ShopAppAuBuildConfig.MOCK
            @Override // au.com.woolworths.android.onesite.appdata.AppBuildConfig
            public final String a() {
                return "https://dev.mobile-api.woolworths.com.au/mockx/wow/v2";
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppBuildConfig
            public final String b() {
                return "https://dev.mobile-api.woolworths.com.au/mockx/wow/v1";
            }
        };
        d = shopAppAuBuildConfig;
        ShopAppAuBuildConfig shopAppAuBuildConfig2 = new ShopAppAuBuildConfig() { // from class: au.com.woolworths.android.onesite.appdata.ShopAppAuBuildConfig.TEST
            @Override // au.com.woolworths.android.onesite.appdata.AppBuildConfig
            public final String a() {
                return "https://test.mobile-api.woolworths.com.au/wow/v2";
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppBuildConfig
            public final String b() {
                return "https://test.mobile-api.woolworths.com.au/wow/v1";
            }
        };
        e = shopAppAuBuildConfig2;
        ShopAppAuBuildConfig shopAppAuBuildConfig3 = new ShopAppAuBuildConfig() { // from class: au.com.woolworths.android.onesite.appdata.ShopAppAuBuildConfig.DEV
            @Override // au.com.woolworths.android.onesite.appdata.AppBuildConfig
            public final String a() {
                return "https://dev.mobile-api.woolworths.com.au/wow/v2";
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppBuildConfig
            public final String b() {
                return "https://dev.mobile-api.woolworths.com.au/wow/v1";
            }
        };
        f = shopAppAuBuildConfig3;
        ShopAppAuBuildConfig shopAppAuBuildConfig4 = new ShopAppAuBuildConfig() { // from class: au.com.woolworths.android.onesite.appdata.ShopAppAuBuildConfig.UAT
            @Override // au.com.woolworths.android.onesite.appdata.AppBuildConfig
            public final String a() {
                return "https://uat.mobile-api.woolworths.com.au/wow/v2";
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppBuildConfig
            public final String b() {
                return "https://uat.mobile-api.woolworths.com.au/wow/v1";
            }
        };
        g = shopAppAuBuildConfig4;
        ShopAppAuBuildConfig shopAppAuBuildConfig5 = new ShopAppAuBuildConfig() { // from class: au.com.woolworths.android.onesite.appdata.ShopAppAuBuildConfig.PRODUCTION
            @Override // au.com.woolworths.android.onesite.appdata.AppBuildConfig
            public final String a() {
                return "https://prod.mobile-api.woolworths.com.au/wow/v2";
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppBuildConfig
            public final String b() {
                return "https://prod.mobile-api.woolworths.com.au/wow/v1";
            }
        };
        h = shopAppAuBuildConfig5;
        ShopAppAuBuildConfig[] shopAppAuBuildConfigArr = {shopAppAuBuildConfig, shopAppAuBuildConfig2, shopAppAuBuildConfig3, shopAppAuBuildConfig4, shopAppAuBuildConfig5};
        i = shopAppAuBuildConfigArr;
        j = EnumEntriesKt.a(shopAppAuBuildConfigArr);
    }

    public static ShopAppAuBuildConfig valueOf(String str) {
        return (ShopAppAuBuildConfig) Enum.valueOf(ShopAppAuBuildConfig.class, str);
    }

    public static ShopAppAuBuildConfig[] values() {
        return (ShopAppAuBuildConfig[]) i.clone();
    }
}
