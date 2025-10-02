package au.com.woolworths.product.details.databinding;

import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeInsetBannerBinding;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import au.com.woolworths.product.details.ProductDetailsClickHandler;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class EpoxyItemProductInsetBannerBindingImpl extends EpoxyItemProductInsetBannerBinding {
    public static final ViewDataBinding.IncludedLayouts D;
    public final IncludeInsetBannerBinding A;
    public final FrameLayout B;
    public long C;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(2);
        D = includedLayouts;
        includedLayouts.a(0, new int[]{1}, new int[]{R.layout.include_inset_banner}, new String[]{"include_inset_banner"});
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpoxyItemProductInsetBannerBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        super(dataBindingComponent, view, 0);
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 2, D, null);
        this.C = -1L;
        IncludeInsetBannerBinding includeInsetBannerBinding = (IncludeInsetBannerBinding) objArrT[1];
        this.A = includeInsetBannerBinding;
        if (includeInsetBannerBinding != null) {
            includeInsetBannerBinding.n = this;
        }
        FrameLayout frameLayout = (FrameLayout) objArrT[0];
        this.B = frameLayout;
        frameLayout.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (35 == i) {
            this.z = (ProductDetailsClickHandler) obj;
            synchronized (this) {
                this.C |= 1;
            }
            h(35);
            y();
            return true;
        }
        if (14 != i) {
            return false;
        }
        this.y = (InsetBannerData) obj;
        synchronized (this) {
            this.C |= 2;
        }
        h(14);
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
        ProductDetailsClickHandler productDetailsClickHandler = this.z;
        InsetBannerData insetBannerData = this.y;
        long j2 = 5 & j;
        if ((j & 6) != 0) {
            this.A.L(insetBannerData);
        }
        if (j2 != 0) {
            this.A.M(productDetailsClickHandler);
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
