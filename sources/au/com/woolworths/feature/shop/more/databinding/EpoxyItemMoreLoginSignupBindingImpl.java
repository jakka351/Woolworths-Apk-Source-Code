package au.com.woolworths.feature.shop.more.databinding;

import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.more.MoreContract;
import au.com.woolworths.feature.shop.more.MoreViewModel;
import au.com.woolworths.feature.shop.more.generated.callback.OnClickListener;

/* loaded from: classes3.dex */
public class EpoxyItemMoreLoginSignupBindingImpl extends EpoxyItemMoreLoginSignupBinding implements OnClickListener.Listener {
    public final OnClickListener C;
    public final OnClickListener D;
    public long E;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemMoreLoginSignupBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, null);
        super(dataBindingComponent, view, (Button) objArrT[1], (ConstraintLayout) objArrT[0], (Button) objArrT[2]);
        this.E = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        E(view);
        this.C = new OnClickListener(this, 2);
        this.D = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        this.B = (MoreViewModel) obj;
        synchronized (this) {
            this.E |= 1;
        }
        h(273);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.shop.more.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        MoreViewModel moreViewModel;
        if (i != 1) {
            if (i == 2 && (moreViewModel = this.B) != null) {
                moreViewModel.v.f(MoreContract.Actions.LaunchSignUp.f7572a);
                return;
            }
            return;
        }
        MoreViewModel moreViewModel2 = this.B;
        if (moreViewModel2 != null) {
            moreViewModel2.v.f(MoreContract.Actions.LaunchLogin.f7565a);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        if ((j & 2) != 0) {
            this.y.setOnClickListener(this.D);
            this.A.setOnClickListener(this.C);
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
            this.E = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
