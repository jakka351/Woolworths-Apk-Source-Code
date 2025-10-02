package au.com.woolworths.shop.deliveryunlimited.signup.databinding;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.ItemSpacerBinding;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class EpoxyItemDeliveryUnlimitedSpacerWrapperBindingImpl extends EpoxyItemDeliveryUnlimitedSpacerWrapperBinding {
    public static final ViewDataBinding.IncludedLayouts B;
    public long A;
    public final ItemSpacerBinding z;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(2);
        B = includedLayouts;
        includedLayouts.a(0, new int[]{1}, new int[]{R.layout.item_spacer}, new String[]{"item_spacer"});
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpoxyItemDeliveryUnlimitedSpacerWrapperBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        super(dataBindingComponent, view, 0);
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 2, B, null);
        this.A = -1L;
        ItemSpacerBinding itemSpacerBinding = (ItemSpacerBinding) objArrT[1];
        this.z = itemSpacerBinding;
        if (itemSpacerBinding != null) {
            itemSpacerBinding.n = this;
        }
        ((ConstraintLayout) objArrT[0]).setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (99 != i) {
            return false;
        }
        this.y = ((Integer) obj).intValue();
        synchronized (this) {
            this.A |= 1;
        }
        h(99);
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
        int i = this.y;
        if ((j & 3) != 0) {
            this.z.L(i);
        }
        this.z.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.A != 0) {
                    return true;
                }
                return this.z.p();
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
        this.z.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
