package au.com.woolworths.android.onesite.modules.main.tooltip;

import com.skydoves.balloon.ArrowOrientationRules;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/tooltip/CoachMark;", "", "Lau/com/woolworths/android/onesite/modules/main/tooltip/CollectionModeHeaderCoachMark;", "Lau/com/woolworths/android/onesite/modules/main/tooltip/InstoreModeReminderCoachmark;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CoachMark {
    Integer a();

    int b();

    default Integer c() {
        return null;
    }

    Integer d();

    default ArrowOrientationRules e() {
        return ArrowOrientationRules.d;
    }

    default int f() {
        return 0;
    }

    int g();

    int getBackgroundColour();

    Integer h();
}
