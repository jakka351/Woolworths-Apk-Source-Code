package au.com.woolworths.promotion.banner;

import au.com.woolworths.android.onesite.featuretoggles.Feature;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/promotion/banner/PromotionBannerFeature;", "Lau/com/woolworths/android/onesite/featuretoggles/Feature;", "", "promotion-banner_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PromotionBannerFeature implements Feature {
    public static final /* synthetic */ PromotionBannerFeature[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        PromotionBannerFeature[] promotionBannerFeatureArr = new PromotionBannerFeature[0];
        d = promotionBannerFeatureArr;
        e = EnumEntriesKt.a(promotionBannerFeatureArr);
    }

    public static PromotionBannerFeature valueOf(String str) {
        return (PromotionBannerFeature) Enum.valueOf(PromotionBannerFeature.class, str);
    }

    public static PromotionBannerFeature[] values() {
        return (PromotionBannerFeature[]) d.clone();
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
    public final String a() {
        return null;
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
    public final boolean getDefaultValue() {
        return false;
    }
}
