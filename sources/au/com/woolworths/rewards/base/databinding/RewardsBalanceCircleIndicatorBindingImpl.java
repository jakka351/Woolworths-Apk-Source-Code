package au.com.woolworths.rewards.base.databinding;

import android.content.res.Resources;
import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.modules.rewards.RewardsPointsBalance;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class RewardsBalanceCircleIndicatorBindingImpl extends RewardsBalanceCircleIndicatorBinding {
    public static final SparseIntArray F;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(R.id.balance_progress_bar, 4);
        sparseIntArray.put(R.id.circle_top_center, 5);
        sparseIntArray.put(R.id.space, 6);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (216 != i) {
            return false;
        }
        L((RewardsPointsBalance) obj);
        return true;
    }

    @Override // au.com.woolworths.rewards.base.databinding.RewardsBalanceCircleIndicatorBinding
    public final void L(RewardsPointsBalance rewardsPointsBalance) throws Throwable {
        this.C = rewardsPointsBalance;
        synchronized (this) {
            this.E |= 1;
        }
        h(216);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() throws Resources.NotFoundException {
        long j;
        String str;
        String quantityString;
        String quantityString2;
        int i;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        RewardsPointsBalance rewardsPointsBalance = this.C;
        long j2 = j & 3;
        boolean z = false;
        if (j2 != 0) {
            if (rewardsPointsBalance != null) {
                String str2 = rewardsPointsBalance.e;
                boolean z2 = rewardsPointsBalance.d;
                i = rewardsPointsBalance.f4393a;
                str = str2;
                z = z2;
            } else {
                i = 0;
                str = null;
            }
            z = !z;
            quantityString2 = this.A.getResources().getQuantityString(R.plurals.rewards_points_earned_short, i);
            this.z.getResources().getQuantityString(R.plurals.point_balance_content_description, i, Integer.valueOf(i));
            quantityString = this.z.getResources().getQuantityString(R.plurals.point_balance_content_description, i, Integer.valueOf(i));
        } else {
            str = null;
            quantityString = null;
            quantityString2 = null;
        }
        if (j2 != 0) {
            if (ViewDataBinding.s >= 4) {
                this.z.setContentDescription(quantityString);
            }
            TextViewBindingAdapter.b(this.A, quantityString2);
            BindingAdaptersKt.j(this.B, z);
            BindingAdaptersKt.f(this.B, str, null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.E != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.E = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
