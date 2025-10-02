package au.com.woolworths.android.onesite.legacy.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.legacy.generated.callback.OnClickListener;
import au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchResultClickListener;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class EpoxyItemDeliveryAddressSearchResultFooterBindingImpl extends EpoxyItemDeliveryAddressSearchResultFooterBinding implements OnClickListener.Listener {
    public static final SparseIntArray C;
    public final OnClickListener A;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.add_address_manually_rational, 2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemDeliveryAddressSearchResultFooterBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, C);
        Button button = (Button) objArrT[1];
        super(dataBindingComponent, view, button);
        this.B = -1L;
        this.y.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        E(view);
        this.A = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (92 != i) {
            return false;
        }
        this.z = (DeliveryAddressSearchResultClickListener) obj;
        synchronized (this) {
            this.B |= 1;
        }
        h(92);
        y();
        return true;
    }

    @Override // au.com.woolworths.android.onesite.legacy.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        DeliveryAddressSearchResultClickListener deliveryAddressSearchResultClickListener = this.z;
        if (deliveryAddressSearchResultClickListener != null) {
            deliveryAddressSearchResultClickListener.l0();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        if ((j & 2) != 0) {
            this.y.setOnClickListener(this.A);
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
