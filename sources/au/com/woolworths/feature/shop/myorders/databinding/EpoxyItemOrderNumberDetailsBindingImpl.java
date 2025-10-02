package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsClickHandler;
import au.com.woolworths.feature.shop.myorders.details.models.OrderNumberDetails;
import au.com.woolworths.feature.shop.myorders.generated.callback.OnClickListener;

/* loaded from: classes3.dex */
public class EpoxyItemOrderNumberDetailsBindingImpl extends EpoxyItemOrderNumberDetailsBinding implements OnClickListener.Listener {
    public final OnClickListener D;
    public long E;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemOrderNumberDetailsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, null, null);
        super(view, (ImageView) objArrT[3], (TextView) objArrT[2], (TextView) objArrT[1], dataBindingComponent);
        this.E = -1L;
        this.y.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        E(view);
        this.D = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (92 == i) {
            this.C = (OrderDetailsClickHandler) obj;
            synchronized (this) {
                this.E |= 1;
            }
            h(92);
            y();
            return true;
        }
        if (53 != i) {
            return false;
        }
        this.B = (OrderNumberDetails) obj;
        synchronized (this) {
            this.E |= 2;
        }
        h(53);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.shop.myorders.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        OrderDetailsClickHandler orderDetailsClickHandler = this.C;
        OrderNumberDetails orderNumberDetails = this.B;
        if (orderDetailsClickHandler == null || orderNumberDetails == null) {
            return;
        }
        orderDetailsClickHandler.G3(orderNumberDetails.b);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String str;
        String str2;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        OrderNumberDetails orderNumberDetails = this.B;
        long j2 = 6 & j;
        if (j2 == 0 || orderNumberDetails == null) {
            str = null;
            str2 = null;
        } else {
            str = orderNumberDetails.f7766a;
            str2 = orderNumberDetails.b;
        }
        if ((j & 4) != 0) {
            this.y.setOnClickListener(this.D);
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.z, str2);
            TextViewBindingAdapter.b(this.A, str);
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
            this.E = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
