package au.com.woolworths.shop.digipay.databinding;

import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.shop.digipay.creditcard.CreditCardEventHandler;
import au.com.woolworths.shop.digipay.generated.callback.OnClickListener;
import au.com.woolworths.shop.digipay.models.SavedCreditCardFooter;

/* loaded from: classes4.dex */
public class EpoxyItemDigipaySavedCreditCardListFooterBindingImpl extends EpoxyItemDigipaySavedCreditCardListFooterBinding implements OnClickListener.Listener {
    public final OnClickListener C;
    public final OnClickListener D;
    public long E;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemDigipaySavedCreditCardListFooterBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, null);
        super(dataBindingComponent, view, (Button) objArrT[1], (Button) objArrT[2]);
        this.E = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        E(view);
        this.C = new OnClickListener(this, 1);
        this.D = new OnClickListener(this, 2);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (35 == i) {
            this.B = (CreditCardEventHandler) obj;
            synchronized (this) {
                this.E |= 1;
            }
            h(35);
            y();
            return true;
        }
        if (53 != i) {
            return false;
        }
        this.A = (SavedCreditCardFooter) obj;
        synchronized (this) {
            this.E |= 2;
        }
        h(53);
        y();
        return true;
    }

    @Override // au.com.woolworths.shop.digipay.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        CreditCardEventHandler creditCardEventHandler;
        if (i != 1) {
            if (i == 2 && (creditCardEventHandler = this.B) != null) {
                creditCardEventHandler.B1();
                return;
            }
            return;
        }
        CreditCardEventHandler creditCardEventHandler2 = this.B;
        if (creditCardEventHandler2 != null) {
            creditCardEventHandler2.O();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        SavedCreditCardFooter savedCreditCardFooter = this.A;
        long j2 = 6 & j;
        boolean z = (j2 == 0 || savedCreditCardFooter == null) ? false : savedCreditCardFooter.f10923a;
        if ((j & 4) != 0) {
            this.y.setOnClickListener(this.C);
            this.z.setOnClickListener(this.D);
        }
        if (j2 != 0) {
            BindingAdaptersKt.o(this.y, z);
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
