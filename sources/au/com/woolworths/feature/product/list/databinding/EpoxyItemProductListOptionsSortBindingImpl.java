package au.com.woolworths.feature.product.list.databinding;

import android.view.View;
import android.widget.CheckedTextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.product.list.data.SortOption;
import au.com.woolworths.feature.product.list.generated.callback.OnClickListener;
import au.com.woolworths.feature.product.list.ui.SortOptionsClickListener;
import au.com.woolworths.views.CheckableConstraintLayout;

/* loaded from: classes3.dex */
public class EpoxyItemProductListOptionsSortBindingImpl extends EpoxyItemProductListOptionsSortBinding implements OnClickListener.Listener {
    public final OnClickListener D;
    public long E;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemProductListOptionsSortBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, null);
        super(dataBindingComponent, view, (CheckableConstraintLayout) objArrT[0], (CheckedTextView) objArrT[2], (CheckedTextView) objArrT[1]);
        this.E = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        E(view);
        this.D = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (250 == i) {
            this.C = (SortOptionsClickListener) obj;
            synchronized (this) {
                this.E |= 1;
            }
            h(250);
            y();
            return true;
        }
        if (249 != i) {
            return false;
        }
        this.B = (SortOption) obj;
        synchronized (this) {
            this.E |= 2;
        }
        h(249);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.product.list.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        SortOptionsClickListener sortOptionsClickListener = this.C;
        SortOption sortOption = this.B;
        if (sortOptionsClickListener == null || sortOption == null) {
            return;
        }
        sortOptionsClickListener.p(sortOption.getId());
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String title;
        boolean z;
        boolean zIsApplied;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        SortOption sortOption = this.B;
        long j2 = 6 & j;
        String subtitle = null;
        if (j2 != 0) {
            if (sortOption != null) {
                subtitle = sortOption.getSubtitle();
                zIsApplied = sortOption.isApplied();
                title = sortOption.getTitle();
            } else {
                title = null;
                zIsApplied = false;
            }
            boolean z2 = zIsApplied;
            z = subtitle != null;
            z = z2;
        } else {
            title = null;
            z = false;
        }
        if ((j & 4) != 0) {
            this.y.setOnClickListener(this.D);
        }
        if (j2 != 0) {
            this.y.setChecked(z);
            BindingAdaptersKt.o(this.z, z);
            TextViewBindingAdapter.b(this.z, subtitle);
            TextViewBindingAdapter.b(this.A, title);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.E != 0;
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
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
