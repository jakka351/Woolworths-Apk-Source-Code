package au.com.woolworths.android.onesite.legacy.databinding;

import android.util.SparseIntArray;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class IncludeOnboardingStepperViewBindingImpl extends IncludeOnboardingStepperViewBinding {
    public static final SparseIntArray G;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(R.id.step_1_account_image_view, 1);
        sparseIntArray.put(R.id.step_1_account_text_view, 2);
        sparseIntArray.put(R.id.start_guide, 3);
        sparseIntArray.put(R.id.step_2_rewards_image_view, 4);
        sparseIntArray.put(R.id.step_2_rewards_text_view, 5);
        sparseIntArray.put(R.id.end_guide, 6);
        sparseIntArray.put(R.id.step_3_collect_image_view, 7);
        sparseIntArray.put(R.id.step_3_collect_text_view, 8);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) {
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        synchronized (this) {
            this.F = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.F != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.F = 1L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
