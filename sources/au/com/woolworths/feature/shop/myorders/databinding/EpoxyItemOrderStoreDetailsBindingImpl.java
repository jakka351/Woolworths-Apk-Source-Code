package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsClickHandler;
import au.com.woolworths.feature.shop.myorders.details.models.OrderStoreDetails;
import au.com.woolworths.feature.shop.myorders.generated.callback.OnClickListener;

/* loaded from: classes3.dex */
public class EpoxyItemOrderStoreDetailsBindingImpl extends EpoxyItemOrderStoreDetailsBinding implements OnClickListener.Listener {
    public final OnClickListener D;
    public long E;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemOrderStoreDetailsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
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
        this.B = (OrderStoreDetails) obj;
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
        OrderStoreDetails orderStoreDetails = this.B;
        if (orderStoreDetails == null || orderStoreDetails.c == null || orderDetailsClickHandler == null) {
            return;
        }
        orderDetailsClickHandler.R3(orderStoreDetails.b);
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
        OrderStoreDetails orderStoreDetails = this.B;
        long j2 = 6 & j;
        String str3 = null;
        if (j2 != 0) {
            if (orderStoreDetails != null) {
                String str4 = orderStoreDetails.b;
                str = orderStoreDetails.f7769a;
                str3 = orderStoreDetails.c;
                str2 = str4;
            } else {
                str2 = null;
                str = null;
            }
            z = str3 != null;
            str3 = str2;
        } else {
            str = null;
        }
        if ((j & 4) != 0) {
            this.y.setOnClickListener(this.D);
        }
        if (j2 != 0) {
            BindingAdaptersKt.o(this.y, z);
            TextViewBindingAdapter.b(this.z, str3);
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
