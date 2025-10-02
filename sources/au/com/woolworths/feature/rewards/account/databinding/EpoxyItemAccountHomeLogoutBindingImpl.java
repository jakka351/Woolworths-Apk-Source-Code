package au.com.woolworths.feature.rewards.account.databinding;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.rewards.account.generated.callback.OnClickListener;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public class EpoxyItemAccountHomeLogoutBindingImpl extends EpoxyItemAccountHomeLogoutBinding implements OnClickListener.Listener {
    public final OnClickListener A;
    public long B;
    public final ConstraintLayout z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpoxyItemAccountHomeLogoutBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        super(dataBindingComponent, view, 0);
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 1, null, null);
        this.B = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.z = constraintLayout;
        constraintLayout.setTag(null);
        E(view);
        this.A = new OnClickListener(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (177 != i) {
            return false;
        }
        this.y = (Function0) obj;
        synchronized (this) {
            this.B |= 1;
        }
        h(177);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.rewards.account.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        Function0 function0 = this.y;
        if (function0 != null) {
            function0.invoke();
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
            this.z.setOnClickListener(this.A);
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
