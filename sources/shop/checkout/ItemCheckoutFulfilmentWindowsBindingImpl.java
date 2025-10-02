package shop.checkout;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.airbnb.epoxy.Carousel;

/* loaded from: classes8.dex */
public class ItemCheckoutFulfilmentWindowsBindingImpl extends ItemCheckoutFulfilmentWindowsBinding {
    public final TextView B;
    public long C;

    /* JADX WARN: Illegal instructions before constructor call */
    public ItemCheckoutFulfilmentWindowsBindingImpl(DataBindingComponent dataBindingComponent, View[] viewArr) {
        Object[] objArrU = ViewDataBinding.u(dataBindingComponent, viewArr, 2, null);
        super(dataBindingComponent, viewArr[0], (Carousel) objArrU[1]);
        this.C = -1L;
        this.y.setTag(null);
        TextView textView = (TextView) objArrU[0];
        this.B = textView;
        textView.setTag(null);
        F(viewArr);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (263 != i) {
            return false;
        }
        L((String) obj);
        return true;
    }

    @Override // shop.checkout.ItemCheckoutFulfilmentWindowsBinding
    public final void L(String str) throws Throwable {
        this.z = str;
        synchronized (this) {
            this.C |= 1;
        }
        h(263);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        String str = this.z;
        if ((j & 3) != 0) {
            TextViewBindingAdapter.b(this.B, str);
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
