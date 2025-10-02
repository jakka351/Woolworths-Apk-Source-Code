package au.com.woolworths.foundation.rewards.onboarding.ui.preview;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/onboarding/ui/preview/CoachMarkPopupContentDescriptor;", "", "onboarding-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final /* data */ class CoachMarkPopupContentDescriptor {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CoachMarkPopupContentDescriptor) && Dp.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    public final int hashCode() {
        Float.hashCode(BitmapDescriptorFactory.HUE_RED);
        Boolean.hashCode(false);
        throw null;
    }

    public final String toString() {
        return a.h("CoachMarkPopupContentDescriptor(offsetX=", Dp.b(BitmapDescriptorFactory.HUE_RED), ", pointingDown=false, text=null, darkMode=false)");
    }
}
