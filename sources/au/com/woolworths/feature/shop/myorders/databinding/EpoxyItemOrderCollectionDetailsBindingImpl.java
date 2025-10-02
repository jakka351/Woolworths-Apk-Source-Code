package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsClickHandler;
import au.com.woolworths.feature.shop.myorders.details.models.OrderCollectionDetails;
import au.com.woolworths.feature.shop.myorders.details.models.OrderCollectionParkingDetails;
import au.com.woolworths.feature.shop.myorders.generated.callback.OnClickListener;

/* loaded from: classes3.dex */
public class EpoxyItemOrderCollectionDetailsBindingImpl extends EpoxyItemOrderCollectionDetailsBinding implements OnClickListener.Listener {
    public final OnClickListener D;
    public long E;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemOrderCollectionDetailsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, null, null);
        super(dataBindingComponent, view, (TextView) objArrT[3], (TextView) objArrT[2], (TextView) objArrT[1]);
        this.E = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
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
        this.B = (OrderCollectionDetails) obj;
        synchronized (this) {
            this.E |= 2;
        }
        h(53);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.shop.myorders.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        OrderCollectionParkingDetails orderCollectionParkingDetails;
        OrderDetailsClickHandler orderDetailsClickHandler = this.C;
        OrderCollectionDetails orderCollectionDetails = this.B;
        if (orderCollectionDetails == null || (orderCollectionParkingDetails = orderCollectionDetails.d) == null || orderDetailsClickHandler == null) {
            return;
        }
        orderDetailsClickHandler.A4(orderCollectionParkingDetails);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [au.com.woolworths.feature.shop.myorders.details.models.OrderCollectionParkingDetails] */
    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String str;
        String str2;
        String str3;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        OrderCollectionDetails orderCollectionDetails = this.B;
        long j2 = 6 & j;
        String str4 = null;
        if (j2 != 0) {
            if (orderCollectionDetails != null) {
                String str5 = orderCollectionDetails.c;
                ?? r8 = orderCollectionDetails.d;
                str2 = orderCollectionDetails.b;
                str = orderCollectionDetails.f7762a;
                str3 = str5;
                str4 = r8;
            } else {
                str3 = null;
                str = null;
                str2 = null;
            }
            z = str4 != null;
            str4 = str3;
        } else {
            str = null;
            str2 = null;
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.y, str4);
            BindingAdaptersKt.o(this.y, z);
            TextViewBindingAdapter.b(this.z, str);
            TextViewBindingAdapter.b(this.A, str2);
        }
        if ((j & 4) != 0) {
            this.y.setOnClickListener(this.D);
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
