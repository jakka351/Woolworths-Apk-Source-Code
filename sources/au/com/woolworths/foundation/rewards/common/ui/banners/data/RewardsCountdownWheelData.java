package au.com.woolworths.foundation.rewards.common.ui.banners.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/common/ui/banners/data/RewardsCountdownWheelData;", "", "common-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RewardsCountdownWheelData {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RewardsCountdownWheelData) {
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        b.a(0, Integer.hashCode(0) * 31, 31);
        throw null;
    }

    public final String toString() {
        return a.o(a.q(0, 0, "RewardsCountdownWheelData(intervalsRemaining=", ", totalIntervals=", ", intervalLabel="), null, ")");
    }
}
