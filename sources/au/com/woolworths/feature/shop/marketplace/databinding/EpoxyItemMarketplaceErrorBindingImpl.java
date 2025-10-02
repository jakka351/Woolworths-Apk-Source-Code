package au.com.woolworths.feature.shop.marketplace.databinding;

import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class EpoxyItemMarketplaceErrorBindingImpl extends EpoxyItemMarketplaceErrorBinding {
    public static final ViewDataBinding.IncludedLayouts D;
    public final IncludeGenericErrorStateBinding A;
    public final FrameLayout B;
    public long C;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(2);
        D = includedLayouts;
        includedLayouts.a(0, new int[]{1}, new int[]{R.layout.include_generic_error_state}, new String[]{"include_generic_error_state"});
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpoxyItemMarketplaceErrorBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        super(dataBindingComponent, view, 0);
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 2, D, null);
        this.C = -1L;
        IncludeGenericErrorStateBinding includeGenericErrorStateBinding = (IncludeGenericErrorStateBinding) objArrT[1];
        this.A = includeGenericErrorStateBinding;
        if (includeGenericErrorStateBinding != null) {
            includeGenericErrorStateBinding.n = this;
        }
        FrameLayout frameLayout = (FrameLayout) objArrT[0];
        this.B = frameLayout;
        frameLayout.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (76 == i) {
            this.y = (FullPageErrorCause) obj;
            synchronized (this) {
                this.C |= 1;
            }
            h(76);
            y();
            return true;
        }
        if (157 != i) {
            return false;
        }
        this.z = (FullPageErrorStateClickHandler) obj;
        synchronized (this) {
            this.C |= 2;
        }
        h(157);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        FullPageErrorCause fullPageErrorCause = this.y;
        FullPageErrorStateClickHandler fullPageErrorStateClickHandler = this.z;
        long j2 = 5 & j;
        boolean z = false;
        if (j2 != 0 && fullPageErrorCause != null) {
            z = true;
        }
        if ((j & 6) != 0) {
            this.A.L(fullPageErrorStateClickHandler);
        }
        if (j2 != 0) {
            this.A.M(fullPageErrorCause);
            BindingAdaptersKt.o(this.A.h, z);
        }
        this.A.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.C != 0) {
                    return true;
                }
                return this.A.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.C = 4L;
        }
        this.A.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
