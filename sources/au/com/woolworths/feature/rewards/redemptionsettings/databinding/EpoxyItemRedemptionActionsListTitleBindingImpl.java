package au.com.woolworths.feature.rewards.redemptionsettings.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeHorizontalDividerBinding;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class EpoxyItemRedemptionActionsListTitleBindingImpl extends EpoxyItemRedemptionActionsListTitleBinding {
    public static final ViewDataBinding.IncludedLayouts D;
    public static final SparseIntArray E;
    public final IncludeHorizontalDividerBinding A;
    public final IncludeHorizontalDividerBinding B;
    public long C;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(6);
        D = includedLayouts;
        includedLayouts.a(0, new int[]{2, 3}, new int[]{R.layout.include_horizontal_divider, R.layout.include_horizontal_divider}, new String[]{"include_horizontal_divider", "include_horizontal_divider"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.title_start_guideline, 4);
        sparseIntArray.put(R.id.title_end_guideline, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemRedemptionActionsListTitleBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 6, D, E);
        super(dataBindingComponent, view, (TextView) objArrT[1]);
        this.C = -1L;
        IncludeHorizontalDividerBinding includeHorizontalDividerBinding = (IncludeHorizontalDividerBinding) objArrT[2];
        this.A = includeHorizontalDividerBinding;
        if (includeHorizontalDividerBinding != null) {
            includeHorizontalDividerBinding.n = this;
        }
        ((ConstraintLayout) objArrT[0]).setTag(null);
        IncludeHorizontalDividerBinding includeHorizontalDividerBinding2 = (IncludeHorizontalDividerBinding) objArrT[3];
        this.B = includeHorizontalDividerBinding2;
        if (includeHorizontalDividerBinding2 != null) {
            includeHorizontalDividerBinding2.n = this;
        }
        this.y.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (263 != i) {
            return false;
        }
        this.z = (String) obj;
        synchronized (this) {
            this.C |= 1;
        }
        h(263);
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
        String str = this.z;
        if ((j & 3) != 0) {
            TextViewBindingAdapter.b(this.y, str);
        }
        this.A.k();
        this.B.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.C != 0) {
                    return true;
                }
                return this.A.p() || this.B.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.C = 2L;
        }
        this.A.r();
        this.B.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
