package au.com.woolworths.rewards.base.points;

import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.widget.TextView;
import androidx.core.widget.ContentLoadingProgressBar;
import au.com.woolworths.android.onesite.modules.rewards.RewardsPointsBalance;
import au.com.woolworths.rewards.base.databinding.RewardsBalanceCircleIndicatorBinding;
import au.com.woolworths.rewards.base.progress.RewardsAnimationExtKt$animateProgress$1;
import au.com.woolworths.rewards.base.progress.RewardsAnimationExtKt$animateText$1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.bouncycastle.i18n.TextBundle;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base-rewards-app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RewardsBalanceCircleIndicatorKt {
    public static final void a(RewardsBalanceCircleIndicator rewardsBalanceCircleIndicator, RewardsPointsBalance rewardsPointsBalance) {
        Intrinsics.h(rewardsBalanceCircleIndicator, "rewardsBalanceCircleIndicator");
        if (rewardsPointsBalance == null) {
            return;
        }
        int i = RewardsBalanceCircleIndicator.e;
        RewardsBalanceCircleIndicatorBinding rewardsBalanceCircleIndicatorBinding = rewardsBalanceCircleIndicator.d;
        if (Intrinsics.c(rewardsBalanceCircleIndicatorBinding.C, rewardsPointsBalance)) {
            return;
        }
        rewardsBalanceCircleIndicatorBinding.L(rewardsPointsBalance);
        ContentLoadingProgressBar balanceProgressBar = rewardsBalanceCircleIndicatorBinding.y;
        Intrinsics.g(balanceProgressBar, "balanceProgressBar");
        final int i2 = 1;
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(balanceProgressBar, new RewardsAnimationExtKt$animateProgress$1(Float.TYPE, "progress"), new TypeEvaluator() { // from class: au.com.woolworths.rewards.base.progress.a
            @Override // android.animation.TypeEvaluator
            public final Object evaluate(float f, Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        return Integer.valueOf((int) (((((Integer) obj2).intValue() - r3) * f) + ((Integer) obj).intValue()));
                    default:
                        float fFloatValue = ((Float) obj).floatValue();
                        return Float.valueOf((((((Float) obj2).floatValue() - fFloatValue) * f) + fFloatValue) * 100);
                }
            }
        }, Float.valueOf(balanceProgressBar.getProgress() / 100), Float.valueOf((float) rewardsPointsBalance.b));
        objectAnimatorOfObject.setDuration(500L);
        objectAnimatorOfObject.setStartDelay(300L);
        objectAnimatorOfObject.start();
        TextView pointAmountTextView = rewardsBalanceCircleIndicatorBinding.z;
        Intrinsics.g(pointAmountTextView, "pointAmountTextView");
        int i3 = rewardsPointsBalance.f4393a;
        RewardsAnimationExtKt$animateText$1 rewardsAnimationExtKt$animateText$1 = new RewardsAnimationExtKt$animateText$1(Integer.TYPE, TextBundle.TEXT_ENTRY);
        TypeEvaluator typeEvaluator = new TypeEvaluator() { // from class: au.com.woolworths.rewards.base.progress.a
            @Override // android.animation.TypeEvaluator
            public final Object evaluate(float f, Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        return Integer.valueOf((int) (((((Integer) obj2).intValue() - r3) * f) + ((Integer) obj).intValue()));
                    default:
                        float fFloatValue = ((Float) obj).floatValue();
                        return Float.valueOf((((((Float) obj2).floatValue() - fFloatValue) * f) + fFloatValue) * 100);
                }
            }
        };
        Integer numI0 = StringsKt.i0(pointAmountTextView.getText().toString());
        ObjectAnimator objectAnimatorOfObject2 = ObjectAnimator.ofObject(pointAmountTextView, rewardsAnimationExtKt$animateText$1, typeEvaluator, Integer.valueOf(numI0 != null ? numI0.intValue() : 0), Integer.valueOf(i3));
        objectAnimatorOfObject2.setDuration(500L);
        objectAnimatorOfObject2.setStartDelay(300L);
        objectAnimatorOfObject2.start();
        rewardsBalanceCircleIndicatorBinding.l();
    }
}
