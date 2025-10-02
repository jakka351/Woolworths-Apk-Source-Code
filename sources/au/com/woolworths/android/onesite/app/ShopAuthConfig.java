package au.com.woolworths.android.onesite.app;

import au.com.woolworths.auth.api.AuthConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/app/ShopAuthConfig;", "Lau/com/woolworths/auth/api/AuthConfig;", "", "ShopApp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ShopAuthConfig implements AuthConfig {
    public static final ShopAuthConfig d;
    public static final ShopAuthConfig e;
    public static final ShopAuthConfig f;
    public static final /* synthetic */ ShopAuthConfig[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        ShopAuthConfig shopAuthConfig = new ShopAuthConfig() { // from class: au.com.woolworths.android.onesite.app.ShopAuthConfig.PT
            @Override // au.com.woolworths.auth.api.AuthConfig
            public final String a() {
                return "devsite.woolworths.com.au";
            }

            @Override // au.com.woolworths.auth.api.AuthConfig
            public final String b() {
                return "NHNW5aeCrC1F0frPZg6mvwBtlsXUg4aJ";
            }

            @Override // au.com.woolworths.auth.api.AuthConfig
            public final String c() {
                return "auth-pt.woolworths.com.au";
            }
        };
        d = shopAuthConfig;
        ShopAuthConfig shopAuthConfig2 = new ShopAuthConfig() { // from class: au.com.woolworths.android.onesite.app.ShopAuthConfig.UAT
            @Override // au.com.woolworths.auth.api.AuthConfig
            public final String a() {
                return "uatsite.woolworths.com.au";
            }

            @Override // au.com.woolworths.auth.api.AuthConfig
            public final String b() {
                return "6CwZqGVOiDSij3rp2EMwmV3rDG9OBZ5K";
            }

            @Override // au.com.woolworths.auth.api.AuthConfig
            public final String c() {
                return "auth-uat.woolworths.com.au";
            }
        };
        e = shopAuthConfig2;
        ShopAuthConfig shopAuthConfig3 = new ShopAuthConfig() { // from class: au.com.woolworths.android.onesite.app.ShopAuthConfig.PRODUCTION
            @Override // au.com.woolworths.auth.api.AuthConfig
            public final String a() {
                return "www.woolworths.com.au";
            }

            @Override // au.com.woolworths.auth.api.AuthConfig
            public final String b() {
                return "YjmOzaMbwec9zQAvV6uIP9C4VLkgcaBr";
            }

            @Override // au.com.woolworths.auth.api.AuthConfig
            public final String c() {
                return "auth.woolworths.com.au";
            }
        };
        f = shopAuthConfig3;
        ShopAuthConfig[] shopAuthConfigArr = {shopAuthConfig, shopAuthConfig2, shopAuthConfig3};
        g = shopAuthConfigArr;
        h = EnumEntriesKt.a(shopAuthConfigArr);
    }

    public static ShopAuthConfig valueOf(String str) {
        return (ShopAuthConfig) Enum.valueOf(ShopAuthConfig.class, str);
    }

    public static ShopAuthConfig[] values() {
        return (ShopAuthConfig[]) g.clone();
    }
}
