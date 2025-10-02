package au.com.woolworths.feature.product.list.databinding;

import android.view.View;
import android.widget.ImageView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.product.list.ProductsDisplayMode;
import au.com.woolworths.feature.product.list.ProductsDisplayModeKt;
import au.com.woolworths.feature.product.list.generated.callback.OnClickListener;
import au.com.woolworths.feature.product.list.ui.DisplayModeClickListener;
import au.com.woolworths.views.CheckableConstraintLayout;

/* loaded from: classes3.dex */
public class EpoxyItemProductListOptionsDisplayModeBindingImpl extends EpoxyItemProductListOptionsDisplayModeBinding implements OnClickListener.Listener {
    public final OnClickListener D;
    public long E;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemProductListOptionsDisplayModeBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 2, null, null);
        super(dataBindingComponent, view, (ImageView) objArrT[1], (CheckableConstraintLayout) objArrT[0]);
        this.E = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        E(view);
        this.D = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (37 == i) {
            this.C = (DisplayModeClickListener) obj;
            synchronized (this) {
                this.E |= 1;
            }
            h(37);
            y();
            return true;
        }
        if (123 == i) {
            this.B = ((Boolean) obj).booleanValue();
            synchronized (this) {
                this.E |= 2;
            }
            h(123);
            y();
            return true;
        }
        if (172 != i) {
            return false;
        }
        this.A = (ProductsDisplayMode) obj;
        synchronized (this) {
            this.E |= 4;
        }
        h(172);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.product.list.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        DisplayModeClickListener displayModeClickListener = this.C;
        boolean z = this.B;
        ProductsDisplayMode productsDisplayMode = this.A;
        if (z || displayModeClickListener == null) {
            return;
        }
        displayModeClickListener.Y1(productsDisplayMode);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        int iC;
        String strB;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        boolean z = this.B;
        ProductsDisplayMode productsDisplayMode = this.A;
        long j2 = 10 & j;
        long j3 = 12 & j;
        if (j3 != 0) {
            iC = ProductsDisplayModeKt.c(productsDisplayMode);
            strB = ProductsDisplayModeKt.b(productsDisplayMode, this.h.getContext());
        } else {
            iC = 0;
            strB = null;
        }
        if (j3 != 0) {
            if (ViewDataBinding.s >= 4) {
                this.y.setContentDescription(strB);
            }
            BindingAdaptersKt.m(this.y, iC, null);
        }
        if ((j & 8) != 0) {
            this.z.setOnClickListener(this.D);
        }
        if (j2 != 0) {
            this.z.setChecked(z);
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
            this.E = 8L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
