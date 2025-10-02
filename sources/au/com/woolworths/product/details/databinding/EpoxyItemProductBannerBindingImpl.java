package au.com.woolworths.product.details.databinding;

import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeInsetBannerBinding;
import au.com.woolworths.product.details.ui.BannerInfoState;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class EpoxyItemProductBannerBindingImpl extends EpoxyItemProductBannerBinding {
    public static final ViewDataBinding.IncludedLayouts C;
    public final FrameLayout A;
    public long B;
    public final IncludeInsetBannerBinding z;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(2);
        C = includedLayouts;
        includedLayouts.a(0, new int[]{1}, new int[]{R.layout.include_inset_banner}, new String[]{"include_inset_banner"});
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpoxyItemProductBannerBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        super(dataBindingComponent, view, 0);
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 2, C, null);
        this.B = -1L;
        IncludeInsetBannerBinding includeInsetBannerBinding = (IncludeInsetBannerBinding) objArrT[1];
        this.z = includeInsetBannerBinding;
        if (includeInsetBannerBinding != null) {
            includeInsetBannerBinding.n = this;
        }
        FrameLayout frameLayout = (FrameLayout) objArrT[0];
        this.A = frameLayout;
        frameLayout.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (76 != i) {
            return false;
        }
        this.y = (BannerInfoState) obj;
        synchronized (this) {
            this.B |= 1;
        }
        h(76);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        BannerInfoState bannerInfoState = this.y;
        if ((j & 3) != 0) {
            this.z.L(bannerInfoState);
        }
        this.z.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.B != 0) {
                    return true;
                }
                return this.z.p();
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
        this.z.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
