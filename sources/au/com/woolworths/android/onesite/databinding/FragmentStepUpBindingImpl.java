package au.com.woolworths.android.onesite.databinding;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class FragmentStepUpBindingImpl extends FragmentStepUpBinding {
    public static final ViewDataBinding.IncludedLayouts G;
    public static final SparseIntArray H;
    public long F;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(10);
        G = includedLayouts;
        includedLayouts.a(0, new int[]{1}, new int[]{R.layout.include_checkout_error_all_rounded}, new String[]{"include_checkout_error_all_rounded"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.infoImageView, 2);
        sparseIntArray.put(R.id.stepUpInstructionTextView, 3);
        sparseIntArray.put(R.id.stepUpWrapperLinearLayout, 4);
        sparseIntArray.put(R.id.cvvLabelTextView, 5);
        sparseIntArray.put(R.id.cvvStepUpLinearLayout, 6);
        sparseIntArray.put(R.id.dummyView, 7);
        sparseIntArray.put(R.id.cancelButton, 8);
        sparseIntArray.put(R.id.validateButton, 9);
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
        this.z.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.F != 0) {
                    return true;
                }
                return this.z.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.F = 2L;
        }
        this.z.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i != 0) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.F |= 1;
        }
        return true;
    }
}
