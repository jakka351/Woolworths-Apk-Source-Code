package au.com.woolworths.shop.specials;

import au.com.woolworths.android.onesite.featuretoggles.Feature;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/specials/SpecialsHomeFeature;", "Lau/com/woolworths/android/onesite/featuretoggles/Feature;", "", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class SpecialsHomeFeature implements Feature {
    public static final SpecialsHomeFeature d;
    public static final SpecialsHomeFeature e;
    public static final SpecialsHomeFeature f;
    public static final SpecialsHomeFeature g;
    public static final SpecialsHomeFeature h;
    public static final /* synthetic */ SpecialsHomeFeature[] i;
    public static final /* synthetic */ EnumEntries j;

    static {
        SpecialsHomeFeature specialsHomeFeature = new SpecialsHomeFeature() { // from class: au.com.woolworths.shop.specials.SpecialsHomeFeature.SPECIALS_HOME_ACTIONABLE_CARD
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_specials_home_actionable_card";
            }

            @Override // au.com.woolworths.shop.specials.SpecialsHomeFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        d = specialsHomeFeature;
        SpecialsHomeFeature specialsHomeFeature2 = new SpecialsHomeFeature() { // from class: au.com.woolworths.shop.specials.SpecialsHomeFeature.SPECIALS_HOME_EDITORIAL_BANNER
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_specials_home_editorial_banner";
            }

            @Override // au.com.woolworths.shop.specials.SpecialsHomeFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        e = specialsHomeFeature2;
        SpecialsHomeFeature specialsHomeFeature3 = new SpecialsHomeFeature() { // from class: au.com.woolworths.shop.specials.SpecialsHomeFeature.SPECIALS_HOME_PARAGRAPH_TEXT
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_specials_home_paragraph_text";
            }

            @Override // au.com.woolworths.shop.specials.SpecialsHomeFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        f = specialsHomeFeature3;
        SpecialsHomeFeature specialsHomeFeature4 = new SpecialsHomeFeature() { // from class: au.com.woolworths.shop.specials.SpecialsHomeFeature.SPECIALS_HOME_PROMOTION_CARD
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_specials_home_promotion_card";
            }

            @Override // au.com.woolworths.shop.specials.SpecialsHomeFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        g = specialsHomeFeature4;
        SpecialsHomeFeature specialsHomeFeature5 = new SpecialsHomeFeature() { // from class: au.com.woolworths.shop.specials.SpecialsHomeFeature.SPECIALS_HOME_WATCHLIST
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_specials_home_watchlist";
            }

            @Override // au.com.woolworths.shop.specials.SpecialsHomeFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        h = specialsHomeFeature5;
        SpecialsHomeFeature[] specialsHomeFeatureArr = {specialsHomeFeature, specialsHomeFeature2, specialsHomeFeature3, specialsHomeFeature4, specialsHomeFeature5};
        i = specialsHomeFeatureArr;
        j = EnumEntriesKt.a(specialsHomeFeatureArr);
    }

    public static SpecialsHomeFeature valueOf(String str) {
        return (SpecialsHomeFeature) Enum.valueOf(SpecialsHomeFeature.class, str);
    }

    public static SpecialsHomeFeature[] values() {
        return (SpecialsHomeFeature[]) i.clone();
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
