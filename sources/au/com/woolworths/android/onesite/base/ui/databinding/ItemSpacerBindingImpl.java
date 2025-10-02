package au.com.woolworths.android.onesite.base.ui.databinding;

import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class ItemSpacerBindingImpl extends ItemSpacerBinding {
    public long A;
    public final View z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemSpacerBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        super(dataBindingComponent, view, 0);
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 1, null, null);
        this.A = -1L;
        View view2 = (View) objArrT[0];
        this.z = view2;
        view2.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (99 != i) {
            return false;
        }
        L(((Integer) obj).intValue());
        return true;
    }

    @Override // au.com.woolworths.android.onesite.base.ui.databinding.ItemSpacerBinding
    public final void L(int i) throws Throwable {
        this.y = i;
        synchronized (this) {
            this.A |= 1;
        }
        h(99);
        y();
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
            View view = this.z;
            Intrinsics.h(view, "view");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Intrinsics.g(layoutParams, "getLayoutParams(...)");
            layoutParams.height = view.getContext().getResources().getDimensionPixelSize(i);
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
