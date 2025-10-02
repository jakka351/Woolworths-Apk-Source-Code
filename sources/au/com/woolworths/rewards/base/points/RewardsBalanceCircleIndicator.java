package au.com.woolworths.rewards.base.points;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.rewards.base.databinding.RewardsBalanceCircleIndicatorBinding;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/rewards/base/points/RewardsBalanceCircleIndicator;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RewardsBalanceCircleIndicator extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public final RewardsBalanceCircleIndicatorBinding d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsBalanceCircleIndicator(@NotNull Context context) {
        super(context);
        Intrinsics.h(context, "context");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int i = RewardsBalanceCircleIndicatorBinding.D;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        RewardsBalanceCircleIndicatorBinding rewardsBalanceCircleIndicatorBinding = (RewardsBalanceCircleIndicatorBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.rewards_balance_circle_indicator, this, true, null);
        Intrinsics.g(rewardsBalanceCircleIndicatorBinding, "inflate(...)");
        this.d = rewardsBalanceCircleIndicatorBinding;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsBalanceCircleIndicator(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.h(context, "context");
        Intrinsics.h(attrs, "attrs");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int i = RewardsBalanceCircleIndicatorBinding.D;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        RewardsBalanceCircleIndicatorBinding rewardsBalanceCircleIndicatorBinding = (RewardsBalanceCircleIndicatorBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.rewards_balance_circle_indicator, this, true, null);
        Intrinsics.g(rewardsBalanceCircleIndicatorBinding, "inflate(...)");
        this.d = rewardsBalanceCircleIndicatorBinding;
    }
}
