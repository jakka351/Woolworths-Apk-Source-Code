package au.com.woolworths.feature.product.list.legacy.databinding;

import android.view.View;
import android.widget.CheckedTextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.product.list.legacy.data.SortOption;
import au.com.woolworths.feature.product.list.legacy.generated.callback.OnClickListener;
import au.com.woolworths.feature.product.list.legacy.ui.SortOptionsClickListener;
import au.com.woolworths.views.CheckableConstraintLayout;

/* loaded from: classes3.dex */
public class EpoxyItemProductListOptionsSortLegacyBindingImpl extends EpoxyItemProductListOptionsSortLegacyBinding implements OnClickListener.Listener {
    public final OnClickListener D;
    public long E;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemProductListOptionsSortLegacyBindingImpl(DataBindingComponent dataBindingComponent, View view) {
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

    @Override // au.com.woolworths.feature.product.list.legacy.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        SortOptionsClickListener sortOptionsClickListener = this.C;
        SortOption sortOption = this.B;
        if (sortOptionsClickListener == null || sortOption == null) {
            return;
        }
        sortOptionsClickListener.p(sortOption.d);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String str;
        boolean z;
        boolean z2;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        SortOption sortOption = this.B;
        long j2 = 6 & j;
        String str2 = null;
        if (j2 != 0) {
            if (sortOption != null) {
                str2 = sortOption.f;
                z2 = sortOption.g;
                str = sortOption.e;
            } else {
                str = null;
                z2 = false;
            }
            boolean z3 = z2;
            z = str2 != null;
            z = z3;
        } else {
            str = null;
            z = false;
        }
        if ((j & 4) != 0) {
            this.y.setOnClickListener(this.D);
        }
        if (j2 != 0) {
            this.y.setChecked(z);
            BindingAdaptersKt.o(this.z, z);
            TextViewBindingAdapter.b(this.z, str2);
            TextViewBindingAdapter.b(this.A, str);
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
