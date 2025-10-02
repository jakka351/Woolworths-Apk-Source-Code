package au.com.woolworths.rewards.base.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class IncludeAccountButtonBindingImpl extends IncludeAccountButtonBinding {
    public static final SparseIntArray B;
    public long A;
    public final ImageView z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        B = sparseIntArray;
        sparseIntArray.put(R.id.account_settings_button, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IncludeAccountButtonBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        super(dataBindingComponent, view, 0);
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, B);
        this.A = -1L;
        ((ConstraintLayout) objArrT[0]).setTag(null);
        ImageView imageView = (ImageView) objArrT[1];
        this.z = imageView;
        imageView.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (120 != i) {
            return false;
        }
        this.y = (Boolean) obj;
        synchronized (this) {
            this.A |= 1;
        }
        h(120);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.A;
            this.A = 0L;
        }
        long j2 = j & 3;
        boolean zB = j2 != 0 ? ViewDataBinding.B(this.y) : false;
        if (j2 != 0) {
            BindingAdaptersKt.o(this.z, zB);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.A != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.A = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
