package au.com.woolworths.rewards.base.progress;

import android.util.Property;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"au/com/woolworths/rewards/base/progress/RewardsAnimationExtKt$animateText$1", "Landroid/util/Property;", "Landroid/widget/TextView;", "", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RewardsAnimationExtKt$animateText$1 extends Property<TextView, Integer> {
    @Override // android.util.Property
    public final Integer get(TextView textView) {
        TextView textView2 = textView;
        Intrinsics.h(textView2, "textView");
        return Integer.valueOf(Integer.parseInt(textView2.getText().toString()));
    }

    @Override // android.util.Property
    public final void set(TextView textView, Integer num) {
        TextView textView2 = textView;
        int iIntValue = num.intValue();
        Intrinsics.h(textView2, "textView");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.B(new Object[0], 0, String.valueOf(iIntValue), textView2);
    }
}
