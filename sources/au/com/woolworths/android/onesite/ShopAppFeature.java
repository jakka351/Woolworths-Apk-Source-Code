package au.com.woolworths.android.onesite;

import au.com.woolworths.android.onesite.featuretoggles.Feature;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/ShopAppFeature;", "Lau/com/woolworths/android/onesite/featuretoggles/Feature;", "", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ShopAppFeature implements Feature {
    public static final ShopAppFeature d;
    public static final /* synthetic */ ShopAppFeature[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        ShopAppFeature shopAppFeature = new ShopAppFeature() { // from class: au.com.woolworths.android.onesite.ShopAppFeature.AKAMAI_BOTMANAGER
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_akamai_botmanager";
            }

            @Override // au.com.woolworths.android.onesite.ShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        d = shopAppFeature;
        ShopAppFeature[] shopAppFeatureArr = {shopAppFeature, new ShopAppFeature() { // from class: au.com.woolworths.android.onesite.ShopAppFeature.MARKETING_OPTIN_SIGNUP
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean b() {
                return true;
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_marketing_optin_signup";
            }

            @Override // au.com.woolworths.android.onesite.ShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        }, new ShopAppFeature() { // from class: au.com.woolworths.android.onesite.ShopAppFeature.SPLASH_SCREEN_WATCHDOG_TIMEOUT
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_splash_screen_watchdog_timeout";
            }

            @Override // au.com.woolworths.android.onesite.ShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        }};
        e = shopAppFeatureArr;
        f = EnumEntriesKt.a(shopAppFeatureArr);
    }

    public static ShopAppFeature valueOf(String str) {
        return (ShopAppFeature) Enum.valueOf(ShopAppFeature.class, str);
    }

    public static ShopAppFeature[] values() {
        return (ShopAppFeature[]) e.clone();
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
    public final String a() {
        return "";
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
    public boolean getDefaultValue() {
        return false;
    }
}
