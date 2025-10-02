package au.com.woolworths.shop.deliveryunlimited.signup.databinding;

import android.util.SparseIntArray;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class FragmentAcceptTermsAndConditionBottomSheetOldBindingImpl extends FragmentAcceptTermsAndConditionBottomSheetOldBinding {
    public static final SparseIntArray A;
    public long z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(R.id.grab_handle_image_view, 1);
        sparseIntArray.put(R.id.recycler_view, 2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) {
        if (273 != i) {
            return false;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        synchronized (this) {
            this.z = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.z != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.z = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
