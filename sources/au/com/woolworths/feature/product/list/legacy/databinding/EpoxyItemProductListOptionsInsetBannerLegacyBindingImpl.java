package au.com.woolworths.feature.product.list.legacy.databinding;

import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeInsetBannerBinding;
import au.com.woolworths.feature.product.list.legacy.data.FilterInsetBannerData;
import au.com.woolworths.feature.product.list.legacy.ui.FilterInsetBannerClickListener;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class EpoxyItemProductListOptionsInsetBannerLegacyBindingImpl extends EpoxyItemProductListOptionsInsetBannerLegacyBinding {
    public static final ViewDataBinding.IncludedLayouts D;
    public final FrameLayout B;
    public long C;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(2);
        D = includedLayouts;
        includedLayouts.a(0, new int[]{1}, new int[]{R.layout.include_inset_banner}, new String[]{"include_inset_banner"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemProductListOptionsInsetBannerLegacyBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 2, D, null);
        super(dataBindingComponent, view, (IncludeInsetBannerBinding) objArrT[1]);
        this.C = -1L;
        IncludeInsetBannerBinding includeInsetBannerBinding = this.y;
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
        if (11 == i) {
            this.z = (FilterInsetBannerData) obj;
            synchronized (this) {
                this.C |= 2;
            }
            h(11);
            y();
            return true;
        }
        if (35 != i) {
            return false;
        }
        this.A = (FilterInsetBannerClickListener) obj;
        synchronized (this) {
            this.C |= 4;
        }
        h(35);
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
        FilterInsetBannerData filterInsetBannerData = this.z;
        FilterInsetBannerClickListener filterInsetBannerClickListener = this.A;
        long j2 = 10 & j;
        long j3 = j & 12;
        if (j2 != 0) {
            this.y.L(filterInsetBannerData);
        }
        if (j3 != 0) {
            this.y.M(filterInsetBannerClickListener);
        }
        this.y.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.C != 0) {
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
            this.C = 8L;
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
            this.C |= 1;
        }
        return true;
    }
}
