package au.com.woolworths.feature.shop.homepage.databinding;

import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeHorizontalDividerBinding;
import au.com.woolworths.feature.shop.homepage.generated.callback.OnClickListener;
import au.com.woolworths.feature.shop.homepage.presentation.RegistrationClickListener;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class EpoxyItemRegistrationTileBindingImpl extends EpoxyItemRegistrationTileBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts F;
    public final IncludeHorizontalDividerBinding B;
    public final OnClickListener C;
    public final OnClickListener D;
    public long E;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(4);
        F = includedLayouts;
        includedLayouts.a(0, new int[]{3}, new int[]{R.layout.include_horizontal_divider}, new String[]{"include_horizontal_divider"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemRegistrationTileBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, F, null);
        super(dataBindingComponent, view, (Button) objArrT[2], (Button) objArrT[1]);
        this.E = -1L;
        this.y.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        IncludeHorizontalDividerBinding includeHorizontalDividerBinding = (IncludeHorizontalDividerBinding) objArrT[3];
        this.B = includeHorizontalDividerBinding;
        if (includeHorizontalDividerBinding != null) {
            includeHorizontalDividerBinding.n = this;
        }
        this.z.setTag(null);
        E(view);
        this.C = new OnClickListener(this, 1);
        this.D = new OnClickListener(this, 2);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (157 != i) {
            if (53 != i) {
                return false;
            }
            return true;
        }
        this.A = (RegistrationClickListener) obj;
        synchronized (this) {
            this.E |= 1;
        }
        h(157);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.shop.homepage.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        RegistrationClickListener registrationClickListener;
        if (i != 1) {
            if (i == 2 && (registrationClickListener = this.A) != null) {
                registrationClickListener.Y4();
                return;
            }
            return;
        }
        RegistrationClickListener registrationClickListener2 = this.A;
        if (registrationClickListener2 != null) {
            registrationClickListener2.d6();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        if ((j & 4) != 0) {
            this.y.setOnClickListener(this.D);
            this.z.setOnClickListener(this.C);
        }
        this.B.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.E != 0) {
                    return true;
                }
                return this.B.p();
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
        this.B.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
