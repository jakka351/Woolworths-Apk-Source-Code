package au.com.woolworths.shop.checkout.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class EpoxyItemCheckoutProductMessageBindingImpl extends EpoxyItemCheckoutProductMessageBinding {
    public static final SparseIntArray C;
    public final LinearLayout A;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.icon_info, 2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemCheckoutProductMessageBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, C);
        TextView textView = (TextView) objArrT[1];
        super(dataBindingComponent, view, textView);
        this.B = -1L;
        this.y.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArrT[0];
        this.A = linearLayout;
        linearLayout.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (171 != i) {
            return false;
        }
        this.z = (String) obj;
        synchronized (this) {
            this.B |= 1;
        }
        h(171);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        String str = this.z;
        if ((j & 3) != 0) {
            TextViewBindingAdapter.b(this.y, str);
            if (ViewDataBinding.s >= 4) {
                this.A.setContentDescription(str);
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.B != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.B = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
