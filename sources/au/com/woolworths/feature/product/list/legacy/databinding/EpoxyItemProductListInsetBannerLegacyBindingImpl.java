package au.com.woolworths.feature.product.list.legacy.databinding;

import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeInsetBannerBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerClickListener;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class EpoxyItemProductListInsetBannerLegacyBindingImpl extends EpoxyItemProductListInsetBannerLegacyBinding {
    public static final ViewDataBinding.IncludedLayouts F;
    public final FrameLayout D;
    public long E;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(2);
        F = includedLayouts;
        includedLayouts.a(0, new int[]{1}, new int[]{R.layout.include_inset_banner}, new String[]{"include_inset_banner"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemProductListInsetBannerLegacyBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 2, F, null);
        super(dataBindingComponent, view, (IncludeInsetBannerBinding) objArrT[1]);
        this.E = -1L;
        IncludeInsetBannerBinding includeInsetBannerBinding = this.y;
        if (includeInsetBannerBinding != null) {
            includeInsetBannerBinding.n = this;
        }
        FrameLayout frameLayout = (FrameLayout) objArrT[0];
        this.D = frameLayout;
        frameLayout.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (11 == i) {
            L((InsetBannerData) obj);
            return true;
        }
        if (267 == i) {
            M((Integer) obj);
            return true;
        }
        if (157 != i) {
            return false;
        }
        this.B = (InsetBannerClickListener) obj;
        synchronized (this) {
            this.E |= 8;
        }
        h(157);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.product.list.legacy.databinding.EpoxyItemProductListInsetBannerLegacyBinding
    public final void L(InsetBannerData insetBannerData) throws Throwable {
        this.z = insetBannerData;
        synchronized (this) {
            this.E |= 2;
        }
        h(11);
        y();
    }

    @Override // au.com.woolworths.feature.product.list.legacy.databinding.EpoxyItemProductListInsetBannerLegacyBinding
    public final void M(Integer num) throws Throwable {
        this.A = num;
        synchronized (this) {
            this.E |= 4;
        }
        h(267);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() throws Resources.NotFoundException {
        long j;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        InsetBannerData insetBannerData = this.z;
        Integer num = this.A;
        InsetBannerClickListener insetBannerClickListener = this.B;
        long j2 = 18 & j;
        long j3 = 20 & j;
        int iZ = j3 != 0 ? ViewDataBinding.z(num) : 0;
        long j4 = j & 24;
        if (j3 != 0) {
            BindingAdaptersKt.k(iZ, this.y.h);
        }
        if (j2 != 0) {
            this.y.L(insetBannerData);
        }
        if (j4 != 0) {
            this.y.M(insetBannerClickListener);
        }
        this.y.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.E != 0) {
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
            this.E = 16L;
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
            this.E |= 1;
        }
        return true;
    }
}
