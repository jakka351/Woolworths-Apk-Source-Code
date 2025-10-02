package au.com.woolworths.shop.deliveryunlimited.signup.databinding;

import android.util.SparseIntArray;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class EpoxyItemDeliveryUnlimitedSignUpConfirmationHeadingBindingImpl extends EpoxyItemDeliveryUnlimitedSignUpConfirmationHeadingBinding {
    public static final SparseIntArray z;
    public long y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        z = sparseIntArray;
        sparseIntArray.put(R.id.icon, 1);
        sparseIntArray.put(R.id.title, 2);
        sparseIntArray.put(R.id.subtitle, 3);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) {
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        synchronized (this) {
            this.y = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.y != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.y = 1L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
