package au.com.woolworths.foundation.rewards.common.ui.banners.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/common/ui/banners/data/RewardsBroadcastBannerData;", "", "common-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RewardsBroadcastBannerData {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof RewardsBroadcastBannerData) && Intrinsics.c(null, null) && Intrinsics.c(null, null)) {
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        b.e(b.c(b.c(((0 * 31) + 0) * 31, 31, null), 961, null), 31, false);
        throw null;
    }

    public final String toString() {
        StringBuilder sbV = a.v("RewardsBroadcastBannerData(id=, iconUrl=", null, ", title=", null, ", message=");
        androidx.constraintlayout.core.state.a.B(sbV, null, ", actionBtnText=", null, ", actionBtnUrl=, isCancelable=");
        sbV.append(false);
        sbV.append(", elevationType=");
        sbV.append((Object) null);
        sbV.append(", analytics=");
        sbV.append((Object) null);
        sbV.append(")");
        return sbV.toString();
    }
}
