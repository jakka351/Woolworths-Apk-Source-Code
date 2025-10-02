package au.com.woolworths.feature.shop.homepage.databinding;

import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeHorizontalDividerBinding;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class EpoxyHomepageDividerBindingImpl extends EpoxyHomepageDividerBinding {
    public static final ViewDataBinding.IncludedLayouts B;
    public long A;
    public final IncludeHorizontalDividerBinding y;
    public final FrameLayout z;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(2);
        B = includedLayouts;
        includedLayouts.a(0, new int[]{1}, new int[]{R.layout.include_horizontal_divider}, new String[]{"include_horizontal_divider"});
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpoxyHomepageDividerBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        super(dataBindingComponent, view, 0);
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 2, B, null);
        this.A = -1L;
        IncludeHorizontalDividerBinding includeHorizontalDividerBinding = (IncludeHorizontalDividerBinding) objArrT[1];
        this.y = includeHorizontalDividerBinding;
        if (includeHorizontalDividerBinding != null) {
            includeHorizontalDividerBinding.n = this;
        }
        FrameLayout frameLayout = (FrameLayout) objArrT[0];
        this.z = frameLayout;
        frameLayout.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) {
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        synchronized (this) {
            this.A = 0L;
        }
        this.y.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.A != 0) {
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
            this.A = 1L;
        }
        this.y.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
