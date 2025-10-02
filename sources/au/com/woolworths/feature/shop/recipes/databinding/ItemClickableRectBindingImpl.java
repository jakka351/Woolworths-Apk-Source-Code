package au.com.woolworths.feature.shop.recipes.databinding;

import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes3.dex */
public class ItemClickableRectBindingImpl extends ItemClickableRectBinding {
    public final View A;
    public long B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemClickableRectBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        super(dataBindingComponent, view, 0);
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 1, null, null);
        this.B = -1L;
        View view2 = (View) objArrT[0];
        this.A = view2;
        view2.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (48 != i) {
            return false;
        }
        this.y = (String) obj;
        synchronized (this) {
            this.B |= 1;
        }
        h(48);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        String str = this.y;
        if ((j & 3) == 0 || ViewDataBinding.s < 4) {
            return;
        }
        this.A.setContentDescription(str);
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
