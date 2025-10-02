package au.com.woolworths.feature.rewards.offers.tigernew;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.featuretoggles.Feature;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/tigernew/TigerNewFeature;", "Lau/com/woolworths/android/onesite/featuretoggles/Feature;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TigerNewFeature implements Feature {
    public static final TigerNewFeature d = new TigerNewFeature();

    @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
    public final String a() {
        return "";
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
    public final String c() {
        return "ft_rewards_tiger_new";
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof TigerNewFeature);
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
    public final boolean getDefaultValue() {
        return false;
    }

    public final int hashCode() {
        return -1584110928;
    }

    public final String toString() {
        return "TigerNewFeature";
    }
}
