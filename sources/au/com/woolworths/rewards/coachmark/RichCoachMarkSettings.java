package au.com.woolworths.rewards.coachmark;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.modules.customviews.coachmark.CoachMarkSettings;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/coachmark/RichCoachMarkSettings;", "Lau/com/woolworths/android/onesite/modules/customviews/coachmark/CoachMarkSettings;", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RichCoachMarkSettings implements CoachMarkSettings {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RichCoachMarkSettings) && Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0;
    }

    public final int hashCode() {
        Boolean.hashCode(false);
        Boolean.hashCode(false);
        Integer.hashCode(0);
        throw null;
    }

    public final String toString() {
        return "RichCoachMarkSettings(titleText=null, bodyText=null, leftCtaText=null, rightCtaText=null, textBetweenCtas=null, asset=null, hideImageIfSmallScreen=false, hideImage=false, backgroundColorRes=0, arrowOrientationRules=null, arrowOrientation=null, arrowPosition=0.0, overlayEnabled=false)";
    }
}
