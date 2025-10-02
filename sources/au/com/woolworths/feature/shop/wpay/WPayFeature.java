package au.com.woolworths.feature.shop.wpay;

import au.com.woolworths.android.onesite.featuretoggles.Feature;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/WPayFeature;", "Lau/com/woolworths/android/onesite/featuretoggles/Feature;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class WPayFeature implements Feature {
    public static final WPayFeature d;
    public static final WPayFeature e;
    public static final WPayFeature f;
    public static final /* synthetic */ WPayFeature[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        WPayFeature wPayFeature = new WPayFeature() { // from class: au.com.woolworths.feature.shop.wpay.WPayFeature.CHECKOUT_WPAY_INTEGRATION_LAST_USED_PAYMENT
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_wpay_integration_last_used_payment";
            }

            @Override // au.com.woolworths.feature.shop.wpay.WPayFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        d = wPayFeature;
        WPayFeature wPayFeature2 = new WPayFeature() { // from class: au.com.woolworths.feature.shop.wpay.WPayFeature.CHECKOUT_WPAY_THREAT_METRIX
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_wpay_threat_metrix";
            }

            @Override // au.com.woolworths.feature.shop.wpay.WPayFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        e = wPayFeature2;
        WPayFeature wPayFeature3 = new WPayFeature() { // from class: au.com.woolworths.feature.shop.wpay.WPayFeature.GOOGLE_PAY_INTEGRATION
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_google_pay_integration";
            }
        };
        f = wPayFeature3;
        WPayFeature[] wPayFeatureArr = {wPayFeature, wPayFeature2, wPayFeature3};
        g = wPayFeatureArr;
        h = EnumEntriesKt.a(wPayFeatureArr);
    }

    public static WPayFeature valueOf(String str) {
        return (WPayFeature) Enum.valueOf(WPayFeature.class, str);
    }

    public static WPayFeature[] values() {
        return (WPayFeature[]) g.clone();
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
