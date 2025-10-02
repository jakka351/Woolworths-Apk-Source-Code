package au.com.woolworths.rewards.base.databinding;

import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.rewards.base.data.RewardsEmptyStateData;

/* loaded from: classes4.dex */
public class IncludeRewardsEmptyStateFullScreenBindingImpl extends IncludeRewardsEmptyStateFullScreenBinding {
    public long C;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (53 != i) {
            return false;
        }
        L((RewardsEmptyStateData) obj);
        return true;
    }

    @Override // au.com.woolworths.rewards.base.databinding.IncludeRewardsEmptyStateFullScreenBinding
    public final void L(RewardsEmptyStateData rewardsEmptyStateData) throws Throwable {
        this.B = rewardsEmptyStateData;
        synchronized (this) {
            this.C |= 1;
        }
        h(53);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        int icon;
        String message;
        String title;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        RewardsEmptyStateData rewardsEmptyStateData = this.B;
        long j2 = j & 3;
        if (j2 == 0 || rewardsEmptyStateData == null) {
            icon = 0;
            message = null;
            title = null;
        } else {
            message = rewardsEmptyStateData.getMessage();
            title = rewardsEmptyStateData.getTitle();
            icon = rewardsEmptyStateData.getIcon();
        }
        if (j2 != 0) {
            BindingAdaptersKt.q(this.y, icon);
            BindingAdaptersKt.m(this.y, icon, null);
            TextViewBindingAdapter.b(this.z, message);
            TextViewBindingAdapter.b(this.A, title);
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
            this.C = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
