package au.com.woolworths.android.onesite.modules.main.tooltip;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.R;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/tooltip/CollectionModeHeaderCoachMark;", "Lau/com/woolworths/android/onesite/modules/main/tooltip/CoachMark;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CollectionModeHeaderCoachMark implements CoachMark {
    @Override // au.com.woolworths.android.onesite.modules.main.tooltip.CoachMark
    public final Integer a() {
        return Integer.valueOf(R.string.change_shopping_mode_hint_header);
    }

    @Override // au.com.woolworths.android.onesite.modules.main.tooltip.CoachMark
    public final int b() {
        return R.drawable.rounded_corners_layout_filled_white;
    }

    @Override // au.com.woolworths.android.onesite.modules.main.tooltip.CoachMark
    public final Integer d() {
        return Integer.valueOf(R.string.hint_gotit);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof CollectionModeHeaderCoachMark);
    }

    @Override // au.com.woolworths.android.onesite.modules.main.tooltip.CoachMark
    public final int g() {
        return R.string.collection_mode_mode_coachmark_body;
    }

    @Override // au.com.woolworths.android.onesite.modules.main.tooltip.CoachMark
    public final int getBackgroundColour() {
        return R.color.white;
    }

    @Override // au.com.woolworths.android.onesite.modules.main.tooltip.CoachMark
    public final Integer h() {
        return Integer.valueOf(R.drawable.ic_coach_mark_shopping_mode);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.ic_coach_mark_shopping_mode) + b.a(R.dimen.half_default_margin, b.a(R.color.white, b.a(R.drawable.rounded_corners_layout_filled_white, b.a(R.string.hint_gotit, b.a(R.string.collection_mode_mode_coachmark_body, Integer.hashCode(R.string.change_shopping_mode_hint_header) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "CollectionModeHeaderCoachMark(titleText=2132017481, bodyText=2132017616, ctaText=2132017983, backgroundDrawable=2131231950, backgroundColour=2131100861, overlayOffset=2131165439, drawableResId=2131231328)";
    }
}
