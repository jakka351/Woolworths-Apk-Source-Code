package au.com.woolworths.feature.rewards.offers.databinding;

import android.util.SparseIntArray;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.rewards.base.data.RewardsEmptyStateData;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class EpoxyItemRewardsOffersFilterNoOffersBindingImpl extends EpoxyItemRewardsOffersFilterNoOffersBinding {
    public static final SparseIntArray D;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(R.id.empty_message_left_guideline, 4);
        sparseIntArray.put(R.id.empty_message_right_guideline, 5);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (68 != i) {
            return false;
        }
        this.B = (RewardsEmptyStateData) obj;
        synchronized (this) {
            this.C |= 1;
        }
        h(68);
        y();
        return true;
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
            icon = rewardsEmptyStateData.getIcon();
            title = rewardsEmptyStateData.getTitle();
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
