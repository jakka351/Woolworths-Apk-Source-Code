package au.com.woolworths.foundation.shop.instore.navigation;

import au.com.woolworths.android.onesite.featuretoggles.Feature;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/instore/navigation/InstoreNavigationFeature;", "Lau/com/woolworths/android/onesite/featuretoggles/Feature;", "", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class InstoreNavigationFeature implements Feature {
    public static final InstoreNavigationFeature d;
    public static final InstoreNavigationFeature e;
    public static final /* synthetic */ InstoreNavigationFeature[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        InstoreNavigationFeature instoreNavigationFeature = new InstoreNavigationFeature() { // from class: au.com.woolworths.foundation.shop.instore.navigation.InstoreNavigationFeature.ORIIENT_SMART_INITIALIZATION
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_oriient_smart_initialization";
            }

            @Override // au.com.woolworths.foundation.shop.instore.navigation.InstoreNavigationFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        d = instoreNavigationFeature;
        InstoreNavigationFeature instoreNavigationFeature2 = new InstoreNavigationFeature() { // from class: au.com.woolworths.foundation.shop.instore.navigation.InstoreNavigationFeature.OVERRIDE_MAPPED_STORE_WHITELIST
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_override_mapped_store_whitelist";
            }
        };
        e = instoreNavigationFeature2;
        InstoreNavigationFeature[] instoreNavigationFeatureArr = {instoreNavigationFeature, instoreNavigationFeature2};
        f = instoreNavigationFeatureArr;
        g = EnumEntriesKt.a(instoreNavigationFeatureArr);
    }

    public static InstoreNavigationFeature valueOf(String str) {
        return (InstoreNavigationFeature) Enum.valueOf(InstoreNavigationFeature.class, str);
    }

    public static InstoreNavigationFeature[] values() {
        return (InstoreNavigationFeature[]) f.clone();
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
