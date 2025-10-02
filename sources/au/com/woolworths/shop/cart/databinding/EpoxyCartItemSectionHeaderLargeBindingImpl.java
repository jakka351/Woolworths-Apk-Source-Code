package au.com.woolworths.shop.cart.databinding;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.foundation.shop.cart.data.model.SectionHeader;
import au.com.woolworths.shop.cart.generated.callback.OnClickListener;
import au.com.woolworths.shop.cart.ui.ProductSectionItemListener;

/* loaded from: classes4.dex */
public class EpoxyCartItemSectionHeaderLargeBindingImpl extends EpoxyCartItemSectionHeaderLargeBinding implements OnClickListener.Listener {
    public final OnClickListener E;
    public long F;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyCartItemSectionHeaderLargeBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, null, null);
        super(dataBindingComponent, view, (ImageView) objArrT[1], (ImageButton) objArrT[3], (TextView) objArrT[2]);
        this.F = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.A.setTag(null);
        E(view);
        this.E = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (97 == i) {
            this.B = (SectionHeader) obj;
            synchronized (this) {
                this.F |= 1;
            }
            h(97);
            y();
            return true;
        }
        if (157 == i) {
            this.D = (ProductSectionItemListener) obj;
            synchronized (this) {
                this.F |= 2;
            }
            h(157);
            y();
            return true;
        }
        if (133 != i) {
            return false;
        }
        this.C = (Boolean) obj;
        synchronized (this) {
            this.F |= 4;
        }
        h(133);
        y();
        return true;
    }

    @Override // au.com.woolworths.shop.cart.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        SectionHeader sectionHeader = this.B;
        ProductSectionItemListener productSectionItemListener = this.D;
        Boolean bool = this.C;
        if (productSectionItemListener == null || sectionHeader == null) {
            return;
        }
        productSectionItemListener.e6(sectionHeader.f8699a, bool.booleanValue());
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String str;
        String str2;
        synchronized (this) {
            j = this.F;
            this.F = 0L;
        }
        SectionHeader sectionHeader = this.B;
        long j2 = 9 & j;
        if (j2 == 0 || sectionHeader == null) {
            str = null;
            str2 = null;
        } else {
            str2 = sectionHeader.b;
            str = sectionHeader.f8699a;
        }
        if (j2 != 0) {
            BindingAdaptersKt.e(this.y, str2, null);
            TextViewBindingAdapter.b(this.A, str);
        }
        if ((j & 8) != 0) {
            this.z.setOnClickListener(this.E);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.F != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.F = 8L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
