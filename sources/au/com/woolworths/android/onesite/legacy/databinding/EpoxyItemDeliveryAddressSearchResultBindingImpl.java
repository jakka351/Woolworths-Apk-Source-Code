package au.com.woolworths.android.onesite.legacy.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.legacy.generated.callback.OnClickListener;
import au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchResultClickListener;
import au.com.woolworths.base.shopapp.models.address.AddressResult;

/* loaded from: classes3.dex */
public class EpoxyItemDeliveryAddressSearchResultBindingImpl extends EpoxyItemDeliveryAddressSearchResultBinding implements OnClickListener.Listener {
    public final OnClickListener B;
    public long C;

    public EpoxyItemDeliveryAddressSearchResultBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        super(dataBindingComponent, view, (TextView) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
        this.C = -1L;
        this.y.setTag(null);
        E(view);
        this.B = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (92 == i) {
            this.A = (DeliveryAddressSearchResultClickListener) obj;
            synchronized (this) {
                this.C |= 1;
            }
            h(92);
            y();
            return true;
        }
        if (4 != i) {
            return false;
        }
        this.z = (AddressResult.Address) obj;
        synchronized (this) {
            this.C |= 2;
        }
        h(4);
        y();
        return true;
    }

    @Override // au.com.woolworths.android.onesite.legacy.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        DeliveryAddressSearchResultClickListener deliveryAddressSearchResultClickListener = this.A;
        AddressResult.Address address = this.z;
        if (deliveryAddressSearchResultClickListener != null) {
            deliveryAddressSearchResultClickListener.R5(address);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        AddressResult.Address address = this.z;
        long j2 = 6 & j;
        String strC = (j2 == 0 || address == null) ? null : address.c();
        if ((j & 4) != 0) {
            this.y.setOnClickListener(this.B);
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.y, strC);
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
            this.C = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
