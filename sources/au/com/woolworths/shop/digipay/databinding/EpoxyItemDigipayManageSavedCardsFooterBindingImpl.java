package au.com.woolworths.shop.digipay.databinding;

import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.digipay.creditcard.CreditCardEventHandler;
import au.com.woolworths.shop.digipay.generated.callback.OnClickListener;

/* loaded from: classes4.dex */
public class EpoxyItemDigipayManageSavedCardsFooterBindingImpl extends EpoxyItemDigipayManageSavedCardsFooterBinding implements OnClickListener.Listener {
    public final OnClickListener A;
    public long B;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemDigipayManageSavedCardsFooterBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 2, null, null);
        super(dataBindingComponent, view, (Button) objArrT[1]);
        this.B = -1L;
        this.y.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        E(view);
        this.A = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (35 != i) {
            return false;
        }
        this.z = (CreditCardEventHandler) obj;
        synchronized (this) {
            this.B |= 1;
        }
        h(35);
        y();
        return true;
    }

    @Override // au.com.woolworths.shop.digipay.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        CreditCardEventHandler creditCardEventHandler = this.z;
        if (creditCardEventHandler != null) {
            creditCardEventHandler.U5();
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
