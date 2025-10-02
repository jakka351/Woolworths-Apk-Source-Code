package au.com.woolworths.rewards.base.databinding;

import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class IncludeRewardsGenericErrorStateFullScreenBindingImpl extends IncludeRewardsGenericErrorStateFullScreenBinding {
    public static final ViewDataBinding.IncludedLayouts D;
    public final EpoxyIncludeRewardsGenericErrorStateBinding A;
    public final FrameLayout B;
    public long C;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(2);
        D = includedLayouts;
        includedLayouts.a(0, new int[]{1}, new int[]{R.layout.epoxy_include_rewards_generic_error_state}, new String[]{"epoxy_include_rewards_generic_error_state"});
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IncludeRewardsGenericErrorStateFullScreenBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        super(dataBindingComponent, view, 0);
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 2, D, null);
        this.C = -1L;
        EpoxyIncludeRewardsGenericErrorStateBinding epoxyIncludeRewardsGenericErrorStateBinding = (EpoxyIncludeRewardsGenericErrorStateBinding) objArrT[1];
        this.A = epoxyIncludeRewardsGenericErrorStateBinding;
        if (epoxyIncludeRewardsGenericErrorStateBinding != null) {
            epoxyIncludeRewardsGenericErrorStateBinding.n = this;
        }
        FrameLayout frameLayout = (FrameLayout) objArrT[0];
        this.B = frameLayout;
        frameLayout.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.A.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (76 == i) {
            M((FullPageErrorCause) obj);
            return true;
        }
        if (36 != i) {
            return false;
        }
        L((FullPageErrorStateClickHandler) obj);
        return true;
    }

    @Override // au.com.woolworths.rewards.base.databinding.IncludeRewardsGenericErrorStateFullScreenBinding
    public final void L(FullPageErrorStateClickHandler fullPageErrorStateClickHandler) throws Throwable {
        this.z = fullPageErrorStateClickHandler;
        synchronized (this) {
            this.C |= 2;
        }
        h(36);
        y();
    }

    @Override // au.com.woolworths.rewards.base.databinding.IncludeRewardsGenericErrorStateFullScreenBinding
    public final void M(FullPageErrorCause fullPageErrorCause) throws Throwable {
        this.y = fullPageErrorCause;
        synchronized (this) {
            this.C |= 1;
        }
        h(76);
        y();
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
        if ((j & 6) != 0) {
            this.A.L(fullPageErrorStateClickHandler);
        }
        if (j2 != 0) {
            this.A.M(fullPageErrorCause);
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
