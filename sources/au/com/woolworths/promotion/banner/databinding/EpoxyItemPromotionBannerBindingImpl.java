package au.com.woolworths.promotion.banner.databinding;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeInsetBannerBinding;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerClickListener;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class EpoxyItemPromotionBannerBindingImpl extends EpoxyItemPromotionBannerBinding {
    public static final ViewDataBinding.IncludedLayouts E;
    public final FrameLayout B;
    public final IncludeInsetBannerBinding C;
    public long D;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(2);
        E = includedLayouts;
        includedLayouts.a(0, new int[]{1}, new int[]{R.layout.include_inset_banner}, new String[]{"include_inset_banner"});
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpoxyItemPromotionBannerBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        super(dataBindingComponent, view, 0);
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 2, E, null);
        this.D = -1L;
        FrameLayout frameLayout = (FrameLayout) objArrT[0];
        this.B = frameLayout;
        frameLayout.setTag(null);
        IncludeInsetBannerBinding includeInsetBannerBinding = (IncludeInsetBannerBinding) objArrT[1];
        this.C = includeInsetBannerBinding;
        if (includeInsetBannerBinding != null) {
            includeInsetBannerBinding.n = this;
        }
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (8 == i) {
            this.y = (Integer) obj;
            synchronized (this) {
                this.D |= 1;
            }
            h(8);
            y();
            return true;
        }
        if (157 == i) {
            this.A = (InsetBannerClickListener) obj;
            synchronized (this) {
                this.D |= 2;
            }
            h(157);
            y();
            return true;
        }
        if (14 != i) {
            return false;
        }
        this.z = (InsetBannerData) obj;
        synchronized (this) {
            this.D |= 4;
        }
        h(14);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        boolean z;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        Integer num = this.y;
        InsetBannerClickListener insetBannerClickListener = this.A;
        InsetBannerData insetBannerData = this.z;
        long j2 = j & 9;
        int i = 0;
        if (j2 != 0) {
            z = num != null;
            if (j2 != 0) {
                j = z ? j | 32 : j | 16;
            }
        } else {
            z = false;
        }
        long j3 = 10 & j;
        long j4 = 12 & j;
        int color = (32 & j) != 0 ? this.h.getContext().getColor(ViewDataBinding.z(num)) : 0;
        long j5 = j & 9;
        if (j5 != 0) {
            if (!z) {
                color = ViewDataBinding.n(android.R.color.transparent, this.B);
            }
            i = color;
        }
        if (j5 != 0) {
            this.B.setBackground(new ColorDrawable(i));
        }
        if (j4 != 0) {
            this.C.L(insetBannerData);
        }
        if (j3 != 0) {
            this.C.M(insetBannerClickListener);
        }
        this.C.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.D != 0) {
                    return true;
                }
                return this.C.p();
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
        this.C.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
