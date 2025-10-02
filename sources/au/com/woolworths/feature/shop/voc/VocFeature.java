package au.com.woolworths.feature.shop.voc;

import au.com.woolworths.android.onesite.featuretoggles.Feature;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/voc/VocFeature;", "Lau/com/woolworths/android/onesite/featuretoggles/Feature;", "", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class VocFeature implements Feature {
    public static final VocFeature d;
    public static final /* synthetic */ VocFeature[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        VocFeature vocFeature = new VocFeature() { // from class: au.com.woolworths.feature.shop.voc.VocFeature.CHECKOUT_VOC_SURVEY
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_checkout_voc_survey";
            }

            @Override // au.com.woolworths.feature.shop.voc.VocFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        d = vocFeature;
        VocFeature[] vocFeatureArr = {vocFeature};
        e = vocFeatureArr;
        f = EnumEntriesKt.a(vocFeatureArr);
    }

    public static VocFeature valueOf(String str) {
        return (VocFeature) Enum.valueOf(VocFeature.class, str);
    }

    public static VocFeature[] values() {
        return (VocFeature[]) e.clone();
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
