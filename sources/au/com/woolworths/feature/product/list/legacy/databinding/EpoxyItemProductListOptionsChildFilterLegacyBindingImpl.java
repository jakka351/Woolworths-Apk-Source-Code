package au.com.woolworths.feature.product.list.legacy.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.state.ToggleableState;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.databinding.adapters.ViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.checkbox.IndeterminateCheckBox;
import au.com.woolworths.checkbox.IndeterminateCheckBoxBindingAdaptersKt;
import au.com.woolworths.feature.product.list.legacy.generated.callback.OnClickListener;
import au.com.woolworths.feature.product.list.legacy.generated.callback.OnStateChangedListener;
import au.com.woolworths.feature.product.list.legacy.ui.FilterMenuItem;
import au.com.woolworths.feature.product.list.legacy.ui.FilterOptionsClickListener;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class EpoxyItemProductListOptionsChildFilterLegacyBindingImpl extends EpoxyItemProductListOptionsChildFilterLegacyBinding implements OnStateChangedListener.Listener, OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts I;
    public final ConstraintLayout E;
    public final OnStateChangedListener F;
    public final OnClickListener G;
    public long H;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(5);
        I = includedLayouts;
        includedLayouts.a(0, new int[]{4}, new int[]{R.layout.include_circled_count_legacy}, new String[]{"include_circled_count_legacy"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemProductListOptionsChildFilterLegacyBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 5, I, null);
        super(dataBindingComponent, view, (IndeterminateCheckBox) objArrT[1], (ImageView) objArrT[3], (IncludeCircledCountLegacyBinding) objArrT[4], (TextView) objArrT[2]);
        this.H = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        IncludeCircledCountLegacyBinding includeCircledCountLegacyBinding = this.A;
        if (includeCircledCountLegacyBinding != null) {
            includeCircledCountLegacyBinding.n = this;
        }
        this.B.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.E = constraintLayout;
        constraintLayout.setTag(null);
        E(view);
        this.F = new OnStateChangedListener(this);
        this.G = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (82 == i) {
            this.D = (FilterOptionsClickListener) obj;
            synchronized (this) {
                this.H |= 2;
            }
            h(82);
            y();
            return true;
        }
        if (80 != i) {
            return false;
        }
        this.C = (FilterMenuItem) obj;
        synchronized (this) {
            this.H |= 4;
        }
        h(80);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.product.list.legacy.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        FilterMenuItem filterMenuItem = this.C;
        FilterOptionsClickListener filterOptionsClickListener = this.D;
        if (filterOptionsClickListener == null || filterMenuItem == null) {
            return;
        }
        filterOptionsClickListener.I(filterMenuItem.k);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        boolean z;
        String str;
        ToggleableState toggleableState;
        int i;
        synchronized (this) {
            j = this.H;
            this.H = 0L;
        }
        FilterMenuItem filterMenuItem = this.C;
        long j2 = 12 & j;
        if (j2 == 0 || filterMenuItem == null) {
            z = false;
            str = null;
            toggleableState = null;
            i = 0;
        } else {
            str = filterMenuItem.f;
            z = filterMenuItem.h;
            i = filterMenuItem.j;
            toggleableState = filterMenuItem.i;
        }
        if (j2 != 0) {
            this.y.setCheckBoxState(toggleableState);
            BindingAdaptersKt.o(this.z, z);
            this.A.L(Integer.valueOf(i));
            TextViewBindingAdapter.b(this.B, str);
            ViewBindingAdapter.b(this.E, this.G, z);
        }
        if ((j & 8) != 0) {
            IndeterminateCheckBoxBindingAdaptersKt.a(this.y, this.F);
            this.A.M(2);
        }
        this.A.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.H != 0) {
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
            this.H = 8L;
        }
        this.A.r();
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
            this.H |= 1;
        }
        return true;
    }
}
