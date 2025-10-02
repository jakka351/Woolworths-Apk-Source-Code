package au.com.woolworths.feature.shop.more;

import au.com.woolworths.android.onesite.featuretoggles.Feature;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreFeature;", "Lau/com/woolworths/android/onesite/featuretoggles/Feature;", "", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class MoreFeature implements Feature {
    public static final MoreFeature d;
    public static final MoreFeature e;
    public static final /* synthetic */ MoreFeature[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        MoreFeature moreFeature = new MoreFeature() { // from class: au.com.woolworths.feature.shop.more.MoreFeature.NATIVE_MY_ACCOUNT
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_native_my_account";
            }

            @Override // au.com.woolworths.feature.shop.more.MoreFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        d = moreFeature;
        MoreFeature moreFeature2 = new MoreFeature() { // from class: au.com.woolworths.feature.shop.more.MoreFeature.SCAN_AND_GO_ENABLED
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_scanandgo_enabled";
            }

            @Override // au.com.woolworths.feature.shop.more.MoreFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        e = moreFeature2;
        MoreFeature[] moreFeatureArr = {moreFeature, moreFeature2};
        f = moreFeatureArr;
        g = EnumEntriesKt.a(moreFeatureArr);
    }

    public static MoreFeature valueOf(String str) {
        return (MoreFeature) Enum.valueOf(MoreFeature.class, str);
    }

    public static MoreFeature[] values() {
        return (MoreFeature[]) f.clone();
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
