package au.com.woolworths.feature.product.list.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.feature.product.list.generated.callback.OnClickListener;
import au.com.woolworths.feature.product.list.ui.FilterOptionsClickListener;
import au.com.woolworths.feature.product.list.ui.ProductListOptionsItem;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class EpoxyItemProductListOptionsFilterBindingImpl extends EpoxyItemProductListOptionsFilterBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts F;
    public final ConstraintLayout B;
    public final IncludeCircledCountBinding C;
    public final OnClickListener D;
    public long E;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(3);
        F = includedLayouts;
        includedLayouts.a(0, new int[]{2}, new int[]{R.layout.include_circled_count}, new String[]{"include_circled_count"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemProductListOptionsFilterBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, F, null);
        super(dataBindingComponent, view, (TextView) objArrT[1]);
        this.E = -1L;
        this.y.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.B = constraintLayout;
        constraintLayout.setTag(null);
        IncludeCircledCountBinding includeCircledCountBinding = (IncludeCircledCountBinding) objArrT[2];
        this.C = includeCircledCountBinding;
        if (includeCircledCountBinding != null) {
            includeCircledCountBinding.n = this;
        }
        E(view);
        this.D = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (82 == i) {
            this.A = (FilterOptionsClickListener) obj;
            synchronized (this) {
                this.E |= 1;
            }
            h(82);
            y();
            return true;
        }
        if (81 != i) {
            return false;
        }
        this.z = (ProductListOptionsItem.FilterOptionItem) obj;
        synchronized (this) {
            this.E |= 2;
        }
        h(81);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.product.list.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        FilterOptionsClickListener filterOptionsClickListener = this.A;
        ProductListOptionsItem.FilterOptionItem filterOptionItem = this.z;
        if (filterOptionsClickListener == null || filterOptionItem == null) {
            return;
        }
        filterOptionsClickListener.I(filterOptionItem.f5393a);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String str;
        int i;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        ProductListOptionsItem.FilterOptionItem filterOptionItem = this.z;
        long j2 = 6 & j;
        if (j2 == 0 || filterOptionItem == null) {
            str = null;
            i = 0;
        } else {
            str = filterOptionItem.b;
            i = filterOptionItem.c;
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.y, str);
            this.C.L(Integer.valueOf(i));
        }
        if ((j & 4) != 0) {
            this.B.setOnClickListener(this.D);
            this.C.M(1);
        }
        this.C.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.E != 0) {
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
            this.E = 4L;
        }
        this.C.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
