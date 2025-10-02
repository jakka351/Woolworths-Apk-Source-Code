package au.com.woolworths.rewards.base.databinding;

import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.modules.rewards.RewardsPointsBalance;
import au.com.woolworths.rewards.base.generated.callback.OnClickListener;
import au.com.woolworths.rewards.base.points.RewardsBalanceCircleIndicator;
import au.com.woolworths.rewards.base.points.RewardsBalanceCircleIndicatorKt;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public class IncludeBalanceIndicatorBindingImpl extends IncludeBalanceIndicatorBinding implements OnClickListener.Listener {
    public final OnClickListener B;
    public long C;

    public IncludeBalanceIndicatorBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        super(dataBindingComponent, view, (RewardsBalanceCircleIndicator) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
        this.C = -1L;
        this.y.setTag(null);
        E(view);
        this.B = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (217 == i) {
            M((RewardsPointsBalance) obj);
            return true;
        }
        if (180 != i) {
            return false;
        }
        L((Function0) obj);
        return true;
    }

    @Override // au.com.woolworths.rewards.base.databinding.IncludeBalanceIndicatorBinding
    public final void L(Function0 function0) throws Throwable {
        this.A = function0;
        synchronized (this) {
            this.C |= 2;
        }
        h(SubsamplingScaleImageView.ORIENTATION_180);
        y();
    }

    @Override // au.com.woolworths.rewards.base.databinding.IncludeBalanceIndicatorBinding
    public final void M(RewardsPointsBalance rewardsPointsBalance) throws Throwable {
        this.z = rewardsPointsBalance;
        synchronized (this) {
            this.C |= 1;
        }
        h(217);
        y();
    }

    @Override // au.com.woolworths.rewards.base.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        Function0 function0 = this.A;
        if (function0 != null) {
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        RewardsPointsBalance rewardsPointsBalance = this.z;
        long j2 = 5 & j;
        if ((j & 4) != 0) {
            this.y.setOnClickListener(this.B);
        }
        if (j2 != 0) {
            RewardsBalanceCircleIndicatorKt.a(this.y, rewardsPointsBalance);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.C = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
