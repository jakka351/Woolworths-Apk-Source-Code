package au.com.woolworths.product.details.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;

/* loaded from: classes4.dex */
public class ItemProductNutritionTableHeaderCellBindingImpl extends ItemProductNutritionTableHeaderCellBinding {
    public final TextView A;
    public long B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemProductNutritionTableHeaderCellBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        super(dataBindingComponent, view, 0);
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 1, null, null);
        this.B = -1L;
        TextView textView = (TextView) objArrT[0];
        this.A = textView;
        textView.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (53 != i) {
            return false;
        }
        L((String) obj);
        return true;
    }

    @Override // au.com.woolworths.product.details.databinding.ItemProductNutritionTableHeaderCellBinding
    public final void L(String str) throws Throwable {
        this.y = str;
        synchronized (this) {
            this.B |= 1;
        }
        h(53);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        String str = this.y;
        if ((j & 3) != 0) {
            TextViewBindingAdapter.b(this.A, str);
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
