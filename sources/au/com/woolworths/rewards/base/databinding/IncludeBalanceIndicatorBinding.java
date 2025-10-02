package au.com.woolworths.rewards.base.databinding;

import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.modules.rewards.RewardsPointsBalance;
import au.com.woolworths.rewards.base.points.RewardsBalanceCircleIndicator;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class IncludeBalanceIndicatorBinding extends ViewDataBinding {
    public Function0 A;
    public final RewardsBalanceCircleIndicator y;
    public RewardsPointsBalance z;

    public IncludeBalanceIndicatorBinding(DataBindingComponent dataBindingComponent, View view, RewardsBalanceCircleIndicator rewardsBalanceCircleIndicator) {
        super(dataBindingComponent, view, 0);
        this.y = rewardsBalanceCircleIndicator;
    }

    public abstract void L(Function0 function0);

    public abstract void M(RewardsPointsBalance rewardsPointsBalance);
}
