package au.com.woolworths.android.onesite.modules.main.tooltip;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.skydoves.balloon.ArrowOrientationRules;
import com.woolworths.R;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/tooltip/InstoreModeReminderCoachmark;", "Lau/com/woolworths/android/onesite/modules/main/tooltip/CoachMark;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InstoreModeReminderCoachmark implements CoachMark {

    /* renamed from: a, reason: collision with root package name */
    public final ArrowOrientationRules f4372a = ArrowOrientationRules.e;

    @Override // au.com.woolworths.android.onesite.modules.main.tooltip.CoachMark
    public final Integer a() {
        return null;
    }

    @Override // au.com.woolworths.android.onesite.modules.main.tooltip.CoachMark
    public final int b() {
        return R.drawable.rounded_corners_layout_filled_white;
    }

    @Override // au.com.woolworths.android.onesite.modules.main.tooltip.CoachMark
    public final Integer c() {
        return Integer.valueOf(R.color.white);
    }

    @Override // au.com.woolworths.android.onesite.modules.main.tooltip.CoachMark
    public final Integer d() {
        return null;
    }

    @Override // au.com.woolworths.android.onesite.modules.main.tooltip.CoachMark
    /* renamed from: e, reason: from getter */
    public final ArrowOrientationRules getF4372a() {
        return this.f4372a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InstoreModeReminderCoachmark) && this.f4372a == ((InstoreModeReminderCoachmark) obj).f4372a;
    }

    @Override // au.com.woolworths.android.onesite.modules.main.tooltip.CoachMark
    public final int f() {
        return -16;
    }

    @Override // au.com.woolworths.android.onesite.modules.main.tooltip.CoachMark
    public final int g() {
        return R.string.instore_mode_reminder_coachmark_body;
    }

    @Override // au.com.woolworths.android.onesite.modules.main.tooltip.CoachMark
    public final int getBackgroundColour() {
        return R.color.color_charcoal;
    }

    @Override // au.com.woolworths.android.onesite.modules.main.tooltip.CoachMark
    public final Integer h() {
        return null;
    }

    public final int hashCode() {
        return Integer.hashCode(-16) + ((this.f4372a.hashCode() + b.a(R.dimen.half_default_margin, b.a(R.color.white, b.a(R.color.color_charcoal, b.a(R.drawable.rounded_corners_layout_filled_white, Integer.hashCode(R.string.instore_mode_reminder_coachmark_body) * 961, 31), 31), 31), 961)) * 31);
    }

    public final String toString() {
        return "InstoreModeReminderCoachmark(titleText=null, bodyText=2132018028, ctaText=null, backgroundDrawable=2131231950, backgroundColour=2131099785, bodyTextColor=2131100861, overlayOffset=2131165439, drawableResId=null, arrowOrientationRules=" + this.f4372a + ", offsetDpY=-16)";
    }
}
