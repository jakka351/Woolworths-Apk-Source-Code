package au.com.woolworths.foundation.rewards.common.ui.banners.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/common/ui/banners/data/RewardsCountdownBannerData;", "", "common-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RewardsCountdownBannerData {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RewardsCountdownBannerData) && Intrinsics.c(null, null) && Intrinsics.c(null, null) && Intrinsics.c(null, null) && Intrinsics.c(null, null) && Intrinsics.c(null, null) && Intrinsics.c(null, null) && Intrinsics.c(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        StringBuilder sbV = a.v("RewardsCountdownBannerData(id=", null, ", title=", null, ", message=");
        androidx.constraintlayout.core.state.a.B(sbV, null, ", altText=", null, ", primaryCta=");
        sbV.append((Object) null);
        sbV.append(", canDismiss=");
        sbV.append(false);
        sbV.append(", elevationType=");
        sbV.append((Object) null);
        sbV.append(", analytics=");
        sbV.append((Object) null);
        sbV.append(", countdownWheel=");
        sbV.append((Object) null);
        sbV.append(")");
        return sbV.toString();
    }
}
