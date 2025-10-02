package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesFilterGroupItem;
import com.google.android.material.chip.Chip;

/* loaded from: classes3.dex */
public class EpoxyItemOrderYourGroceriesFilterChipBindingImpl extends EpoxyItemOrderYourGroceriesFilterChipBinding {
    public long A;
    public final Chip z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpoxyItemOrderYourGroceriesFilterChipBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        super(dataBindingComponent, view, 0);
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 1, null, null);
        this.A = -1L;
        Chip chip = (Chip) objArrT[0];
        this.z = chip;
        chip.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (145 != i) {
            return false;
        }
        this.y = (YourGroceriesFilterGroupItem.YourGroceriesFilterItem) obj;
        synchronized (this) {
            this.A |= 1;
        }
        h(145);
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
        YourGroceriesFilterGroupItem.YourGroceriesFilterItem yourGroceriesFilterItem = this.y;
        long j2 = j & 3;
        String str = (j2 == 0 || yourGroceriesFilterItem == null) ? null : yourGroceriesFilterItem.b;
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.z, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.A != 0;
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
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
