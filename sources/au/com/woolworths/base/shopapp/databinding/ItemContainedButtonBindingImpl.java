package au.com.woolworths.base.shopapp.databinding;

import android.view.View;
import android.widget.Button;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.base.shopapp.generated.callback.OnClickListener;
import au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler;

/* loaded from: classes3.dex */
public class ItemContainedButtonBindingImpl extends ItemContainedButtonBinding implements OnClickListener.Listener {
    public final OnClickListener C;
    public long D;

    public ItemContainedButtonBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        super(dataBindingComponent, view, (Button) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
        this.D = -1L;
        this.y.setTag(null);
        E(view);
        this.C = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (92 == i) {
            this.A = (ButtonClickHandler) obj;
            synchronized (this) {
                this.D |= 1;
            }
            h(92);
            y();
            return true;
        }
        if (53 == i) {
            this.z = (au.com.woolworths.base.shopapp.modules.button.Button) obj;
            synchronized (this) {
                this.D |= 2;
            }
            h(53);
            y();
            return true;
        }
        if (70 != i) {
            return false;
        }
        this.B = (Boolean) obj;
        synchronized (this) {
            this.D |= 4;
        }
        h(70);
        y();
        return true;
    }

    @Override // au.com.woolworths.base.shopapp.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        ButtonClickHandler buttonClickHandler = this.A;
        au.com.woolworths.base.shopapp.modules.button.Button button = this.z;
        if (buttonClickHandler != null) {
            buttonClickHandler.O2(button);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        au.com.woolworths.base.shopapp.modules.button.Button button = this.z;
        Boolean bool = this.B;
        long j2 = 10 & j;
        String label = (j2 == 0 || button == null) ? null : button.getLabel();
        long j3 = 12 & j;
        boolean zB = j3 != 0 ? ViewDataBinding.B(bool) : false;
        if (j3 != 0) {
            this.y.setEnabled(zB);
        }
        if ((j & 8) != 0) {
            this.y.setOnClickListener(this.C);
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.y, label);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.D = 8L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
