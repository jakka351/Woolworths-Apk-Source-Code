package au.com.woolworths.shop.digipay.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.digipay.creditcard.CreditCardEventHandler;
import au.com.woolworths.shop.digipay.generated.callback.OnClickListener;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class EpoxyItemDigipayCreditCardHeadingBindingImpl extends EpoxyItemDigipayCreditCardHeadingBinding implements OnClickListener.Listener {
    public static final SparseIntArray C;
    public final OnClickListener A;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.icon, 1);
        sparseIntArray.put(R.id.label, 2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemDigipayCreditCardHeadingBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, C);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        super(dataBindingComponent, view, constraintLayout);
        this.B = -1L;
        this.y.setTag(null);
        E(view);
        this.A = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (92 != i) {
            return false;
        }
        this.z = (CreditCardEventHandler) obj;
        synchronized (this) {
            this.B |= 1;
        }
        h(92);
        y();
        return true;
    }

    @Override // au.com.woolworths.shop.digipay.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        CreditCardEventHandler creditCardEventHandler = this.z;
        if (creditCardEventHandler != null) {
            creditCardEventHandler.A3();
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
