package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.myorders.details.help.HelpActionView;
import au.com.woolworths.feature.shop.myorders.generated.callback.OnClickListener;

/* loaded from: classes3.dex */
public class MenuItemHelpBindingImpl extends MenuItemHelpBinding implements OnClickListener.Listener {
    public final OnClickListener B;
    public long C;

    /* JADX WARN: Illegal instructions before constructor call */
    public MenuItemHelpBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 2, null, null);
        super(dataBindingComponent, view, (Button) objArrT[1]);
        this.C = -1L;
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.y.setTag(null);
        E(view);
        this.B = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (92 != i) {
            return false;
        }
        L((HelpActionView.ClickHandler) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.myorders.databinding.MenuItemHelpBinding
    public final void L(HelpActionView.ClickHandler clickHandler) throws Throwable {
        this.z = clickHandler;
        synchronized (this) {
            this.C |= 1;
        }
        h(92);
        y();
    }

    @Override // au.com.woolworths.feature.shop.myorders.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        HelpActionView.ClickHandler clickHandler = this.z;
        if (clickHandler != null) {
            clickHandler.h5();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        if ((j & 2) != 0) {
            this.y.setOnClickListener(this.B);
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
            this.C = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
