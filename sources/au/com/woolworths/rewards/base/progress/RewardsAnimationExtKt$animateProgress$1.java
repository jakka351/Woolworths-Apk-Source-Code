package au.com.woolworths.rewards.base.progress;

import android.util.Property;
import android.widget.ProgressBar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"au/com/woolworths/rewards/base/progress/RewardsAnimationExtKt$animateProgress$1", "Landroid/util/Property;", "Landroid/widget/ProgressBar;", "", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RewardsAnimationExtKt$animateProgress$1 extends Property<ProgressBar, Float> {
    @Override // android.util.Property
    public final Float get(ProgressBar progressBar) {
        ProgressBar progressBar2 = progressBar;
        Intrinsics.h(progressBar2, "progressBar");
        return Float.valueOf(progressBar2.getProgress());
    }

    @Override // android.util.Property
    public final void set(ProgressBar progressBar, Float f) {
        ProgressBar progressBar2 = progressBar;
        float fFloatValue = f.floatValue();
        Intrinsics.h(progressBar2, "progressBar");
        progressBar2.setProgress((int) fFloatValue);
    }
}
