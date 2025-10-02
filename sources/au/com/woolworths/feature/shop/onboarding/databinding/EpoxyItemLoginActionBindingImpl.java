package au.com.woolworths.feature.shop.onboarding.databinding;

import android.view.View;
import android.widget.Button;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.onboarding.OnboardingClickHandler;
import au.com.woolworths.feature.shop.onboarding.generated.callback.OnClickListener;

/* loaded from: classes3.dex */
public class EpoxyItemLoginActionBindingImpl extends EpoxyItemLoginActionBinding implements OnClickListener.Listener {
    public final OnClickListener A;
    public long B;

    public EpoxyItemLoginActionBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        super(dataBindingComponent, view, (Button) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
        this.B = -1L;
        this.y.setTag(null);
        E(view);
        this.A = new OnClickListener(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (35 != i) {
            return false;
        }
        this.z = (OnboardingClickHandler) obj;
        synchronized (this) {
            this.B |= 1;
        }
        h(35);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.shop.onboarding.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        OnboardingClickHandler onboardingClickHandler = this.z;
        if (onboardingClickHandler != null) {
            onboardingClickHandler.D2();
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
