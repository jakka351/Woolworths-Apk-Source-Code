package au.com.woolworths.shop.digipay.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.digipay.creditcard.CardCaptureViewEventHandler;
import au.com.woolworths.shop.digipay.generated.callback.OnClickListener;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class IncludeDigipayCardCaptureErrorStateBindingImpl extends IncludeDigipayCardCaptureErrorStateBinding implements OnClickListener.Listener {
    public static final SparseIntArray C;
    public final OnClickListener A;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.icon, 2);
        sparseIntArray.put(R.id.message, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IncludeDigipayCardCaptureErrorStateBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, null, C);
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
        if (35 != i) {
            return false;
        }
        L((CardCaptureViewEventHandler) obj);
        return true;
    }

    @Override // au.com.woolworths.shop.digipay.databinding.IncludeDigipayCardCaptureErrorStateBinding
    public final void L(CardCaptureViewEventHandler cardCaptureViewEventHandler) throws Throwable {
        this.z = cardCaptureViewEventHandler;
        synchronized (this) {
            this.B |= 1;
        }
        h(35);
        y();
    }

    @Override // au.com.woolworths.shop.digipay.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        CardCaptureViewEventHandler cardCaptureViewEventHandler = this.z;
        if (cardCaptureViewEventHandler != null) {
            cardCaptureViewEventHandler.i4();
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
