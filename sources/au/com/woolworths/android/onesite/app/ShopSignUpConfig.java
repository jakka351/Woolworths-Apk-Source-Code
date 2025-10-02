package au.com.woolworths.android.onesite.app;

import au.com.woolworths.feature.shop.signup.api.SignUpConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/app/ShopSignUpConfig;", "Lau/com/woolworths/feature/shop/signup/api/SignUpConfig;", "", "ShopApp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ShopSignUpConfig implements SignUpConfig {
    public static final ShopSignUpConfig d;
    public static final ShopSignUpConfig e;
    public static final ShopSignUpConfig f;
    public static final ShopSignUpConfig g;
    public static final ShopSignUpConfig h;
    public static final /* synthetic */ ShopSignUpConfig[] i;
    public static final /* synthetic */ EnumEntries j;

    static {
        ShopSignUpConfig shopSignUpConfig = new ShopSignUpConfig() { // from class: au.com.woolworths.android.onesite.app.ShopSignUpConfig.MOCK
            @Override // au.com.woolworths.feature.shop.signup.api.SignUpConfig
            public final /* bridge */ /* synthetic */ String a() {
                return null;
            }
        };
        d = shopSignUpConfig;
        ShopSignUpConfig shopSignUpConfig2 = new ShopSignUpConfig() { // from class: au.com.woolworths.android.onesite.app.ShopSignUpConfig.DEV
            @Override // au.com.woolworths.feature.shop.signup.api.SignUpConfig
            public final String a() {
                return "https://devsite.woolworths.com.au/shop/signup/one-login";
            }
        };
        e = shopSignUpConfig2;
        ShopSignUpConfig shopSignUpConfig3 = new ShopSignUpConfig() { // from class: au.com.woolworths.android.onesite.app.ShopSignUpConfig.TEST
            @Override // au.com.woolworths.feature.shop.signup.api.SignUpConfig
            public final /* bridge */ /* synthetic */ String a() {
                return null;
            }
        };
        f = shopSignUpConfig3;
        ShopSignUpConfig shopSignUpConfig4 = new ShopSignUpConfig() { // from class: au.com.woolworths.android.onesite.app.ShopSignUpConfig.UAT
            @Override // au.com.woolworths.feature.shop.signup.api.SignUpConfig
            public final String a() {
                return "https://uatsite.woolworths.com.au/shop/signup/one-login";
            }
        };
        g = shopSignUpConfig4;
        ShopSignUpConfig shopSignUpConfig5 = new ShopSignUpConfig() { // from class: au.com.woolworths.android.onesite.app.ShopSignUpConfig.PRODUCTION
            @Override // au.com.woolworths.feature.shop.signup.api.SignUpConfig
            public final String a() {
                return "https://www.woolworths.com.au/shop/signup/one-login";
            }
        };
        h = shopSignUpConfig5;
        ShopSignUpConfig[] shopSignUpConfigArr = {shopSignUpConfig, shopSignUpConfig2, shopSignUpConfig3, shopSignUpConfig4, shopSignUpConfig5};
        i = shopSignUpConfigArr;
        j = EnumEntriesKt.a(shopSignUpConfigArr);
    }

    public static ShopSignUpConfig valueOf(String str) {
        return (ShopSignUpConfig) Enum.valueOf(ShopSignUpConfig.class, str);
    }

    public static ShopSignUpConfig[] values() {
        return (ShopSignUpConfig[]) i.clone();
    }
}
