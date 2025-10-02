package au.com.woolworths.android.onesite.appdata;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/appdata/ShopAppNzBuildConfig;", "Lau/com/woolworths/android/onesite/appdata/AppBuildConfig;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ShopAppNzBuildConfig implements AppBuildConfig {
    public static final ShopAppNzBuildConfig d;
    public static final ShopAppNzBuildConfig e;
    public static final ShopAppNzBuildConfig f;
    public static final ShopAppNzBuildConfig g;
    public static final ShopAppNzBuildConfig h;
    public static final /* synthetic */ ShopAppNzBuildConfig[] i;
    public static final /* synthetic */ EnumEntries j;

    static {
        ShopAppNzBuildConfig shopAppNzBuildConfig = new ShopAppNzBuildConfig() { // from class: au.com.woolworths.android.onesite.appdata.ShopAppNzBuildConfig.MOCK
            @Override // au.com.woolworths.android.onesite.appdata.AppBuildConfig
            public final String a() {
                return "https://dev.mobile-api.woolworths.com.au/mockx/phoenix/wow/v2";
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppBuildConfig
            public final String b() {
                return "https://dev.mobile-api.woolworths.com.au/mockx/phoenix/wow/v1";
            }
        };
        d = shopAppNzBuildConfig;
        ShopAppNzBuildConfig shopAppNzBuildConfig2 = new ShopAppNzBuildConfig() { // from class: au.com.woolworths.android.onesite.appdata.ShopAppNzBuildConfig.TEST
            @Override // au.com.woolworths.android.onesite.appdata.AppBuildConfig
            public final String a() {
                return "https://test-apix.woolworths.com.au/phoenix/wow/v2";
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppBuildConfig
            public final String b() {
                return "https://test-apix.woolworths.com.au/phoenix/wow/v1";
            }
        };
        e = shopAppNzBuildConfig2;
        ShopAppNzBuildConfig shopAppNzBuildConfig3 = new ShopAppNzBuildConfig() { // from class: au.com.woolworths.android.onesite.appdata.ShopAppNzBuildConfig.DEV
            @Override // au.com.woolworths.android.onesite.appdata.AppBuildConfig
            public final String a() {
                return "https://dev-apix.woolworths.com.au/phoenix/wow/v2";
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppBuildConfig
            public final String b() {
                return "https://dev-apix.woolworths.com.au/phoenix/wow/v1";
            }
        };
        f = shopAppNzBuildConfig3;
        ShopAppNzBuildConfig shopAppNzBuildConfig4 = new ShopAppNzBuildConfig() { // from class: au.com.woolworths.android.onesite.appdata.ShopAppNzBuildConfig.UAT
            @Override // au.com.woolworths.android.onesite.appdata.AppBuildConfig
            public final String a() {
                return "https://uat-apix.woolworths.com.au/phoenix/wow/v2";
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppBuildConfig
            public final String b() {
                return "https://uat-apix.woolworths.com.au/phoenix/wow/v1";
            }
        };
        g = shopAppNzBuildConfig4;
        ShopAppNzBuildConfig shopAppNzBuildConfig5 = new ShopAppNzBuildConfig() { // from class: au.com.woolworths.android.onesite.appdata.ShopAppNzBuildConfig.PRODUCTION
            @Override // au.com.woolworths.android.onesite.appdata.AppBuildConfig
            public final String a() {
                return "https://prod-apix.woolworths.com.au/phoenix/wow/v2";
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppBuildConfig
            public final String b() {
                return "https://prod-apix.woolworths.com.au/phoenix/wow/v1";
            }
        };
        h = shopAppNzBuildConfig5;
        ShopAppNzBuildConfig[] shopAppNzBuildConfigArr = {shopAppNzBuildConfig, shopAppNzBuildConfig2, shopAppNzBuildConfig3, shopAppNzBuildConfig4, shopAppNzBuildConfig5};
        i = shopAppNzBuildConfigArr;
        j = EnumEntriesKt.a(shopAppNzBuildConfigArr);
    }

    public static ShopAppNzBuildConfig valueOf(String str) {
        return (ShopAppNzBuildConfig) Enum.valueOf(ShopAppNzBuildConfig.class, str);
    }

    public static ShopAppNzBuildConfig[] values() {
        return (ShopAppNzBuildConfig[]) i.clone();
    }
}
