package au.com.woolworths.android.onesite.legacy.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.legacy.generated.callback.OnClickListener;
import au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressEventHandler;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class ActivityManageFullDeliveryAddressesBindingImpl extends ActivityManageFullDeliveryAddressesBinding implements OnClickListener.Listener {
    public static final SparseIntArray H;
    public final OnClickListener F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.appbar_layout, 2);
        sparseIntArray.put(R.id.toolbar, 3);
        sparseIntArray.put(R.id.scoll_view, 4);
        sparseIntArray.put(R.id.currently_selected_address_label_text_view, 5);
        sparseIntArray.put(R.id.currently_selected_address_value_text_view, 6);
        sparseIntArray.put(R.id.previously_used_addresses_label_text_view, 7);
        sparseIntArray.put(R.id.previously_used_addresses_recycler_view, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityManageFullDeliveryAddressesBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 9, null, H);
        FloatingActionButton floatingActionButton = (FloatingActionButton) objArrT[1];
        super(dataBindingComponent, view, floatingActionButton, (TextView) objArrT[6], (TextView) objArrT[7], (RecyclerView) objArrT[8], (ScrollView) objArrT[4], (Toolbar) objArrT[3]);
        this.G = -1L;
        this.y.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        E(view);
        this.F = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (78 != i) {
            return false;
        }
        L((ManageFullDeliveryAddressEventHandler) obj);
        return true;
    }

    @Override // au.com.woolworths.android.onesite.legacy.databinding.ActivityManageFullDeliveryAddressesBinding
    public final void L(ManageFullDeliveryAddressEventHandler manageFullDeliveryAddressEventHandler) throws Throwable {
        this.E = manageFullDeliveryAddressEventHandler;
        synchronized (this) {
            this.G |= 1;
        }
        h(78);
        y();
    }

    @Override // au.com.woolworths.android.onesite.legacy.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        ManageFullDeliveryAddressEventHandler manageFullDeliveryAddressEventHandler = this.E;
        if (manageFullDeliveryAddressEventHandler != null) {
            manageFullDeliveryAddressEventHandler.m3();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.G;
            this.G = 0L;
        }
        if ((j & 2) != 0) {
            this.y.setOnClickListener(this.F);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.G != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.G = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
