package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.base.shopapp.databinding.EpoxyItemButtonBinding;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.feature.shop.myorders.generated.callback.ButtonClickHandler;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class EpoxyItemOrderDetailsButtonBindingImpl extends EpoxyItemOrderDetailsButtonBinding implements ButtonClickHandler.Listener {
    public static final ViewDataBinding.IncludedLayouts E;
    public final FrameLayout B;
    public final ButtonClickHandler C;
    public long D;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(2);
        E = includedLayouts;
        includedLayouts.a(0, new int[]{1}, new int[]{R.layout.epoxy_item_button}, new String[]{"epoxy_item_button"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemOrderDetailsButtonBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 2, E, null);
        super(dataBindingComponent, view, (EpoxyItemButtonBinding) objArrT[1]);
        this.D = -1L;
        EpoxyItemButtonBinding epoxyItemButtonBinding = this.y;
        if (epoxyItemButtonBinding != null) {
            epoxyItemButtonBinding.n = this;
        }
        FrameLayout frameLayout = (FrameLayout) objArrT[0];
        this.B = frameLayout;
        frameLayout.setTag(null);
        E(view);
        this.C = new ButtonClickHandler(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (92 == i) {
            this.A = (au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler) obj;
            synchronized (this) {
                this.D |= 2;
            }
            h(92);
            y();
            return true;
        }
        if (53 != i) {
            return false;
        }
        this.z = (ButtonApiData) obj;
        synchronized (this) {
            this.D |= 4;
        }
        h(53);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.shop.myorders.generated.callback.ButtonClickHandler.Listener
    public final void g(int i) {
        au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler buttonClickHandler = this.A;
        ButtonApiData buttonApiData = this.z;
        if (buttonClickHandler != null) {
            buttonClickHandler.O2(buttonApiData);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        ButtonApiData buttonApiData = this.z;
        long j2 = 12 & j;
        if ((j & 8) != 0) {
            this.y.M(this.C);
        }
        if (j2 != 0) {
            this.y.L(buttonApiData);
        }
        this.y.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.D != 0) {
                    return true;
                }
                return this.y.p();
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
        this.y.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i != 0) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.D |= 1;
        }
        return true;
    }
}
