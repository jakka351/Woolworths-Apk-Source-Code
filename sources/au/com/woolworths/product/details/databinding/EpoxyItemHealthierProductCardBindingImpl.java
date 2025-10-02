package au.com.woolworths.product.details.databinding;

import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.product.details.ProductDetailsClickHandler;
import au.com.woolworths.product.details.generated.callback.OnClickListener;
import au.com.woolworths.product.details.models.HealthierOption;
import com.google.android.material.card.MaterialCardView;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class EpoxyItemHealthierProductCardBindingImpl extends EpoxyItemHealthierProductCardBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts E;
    public final MaterialCardView B;
    public final OnClickListener C;
    public long D;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(2);
        E = includedLayouts;
        includedLayouts.a(0, new int[]{1}, new int[]{R.layout.include_healthier_product_card}, new String[]{"include_healthier_product_card"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemHealthierProductCardBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 2, E, null);
        super(dataBindingComponent, view, (IncludeHealthierProductCardBinding) objArrT[1]);
        this.D = -1L;
        IncludeHealthierProductCardBinding includeHealthierProductCardBinding = this.y;
        if (includeHealthierProductCardBinding != null) {
            includeHealthierProductCardBinding.n = this;
        }
        MaterialCardView materialCardView = (MaterialCardView) objArrT[0];
        this.B = materialCardView;
        materialCardView.setTag(null);
        E(view);
        this.C = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (35 == i) {
            this.A = (ProductDetailsClickHandler) obj;
            synchronized (this) {
                this.D |= 2;
            }
            h(35);
            y();
            return true;
        }
        if (53 != i) {
            return false;
        }
        this.z = (HealthierOption) obj;
        synchronized (this) {
            this.D |= 4;
        }
        h(53);
        y();
        return true;
    }

    @Override // au.com.woolworths.product.details.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        ProductDetailsClickHandler productDetailsClickHandler = this.A;
        HealthierOption healthierOption = this.z;
        if (productDetailsClickHandler == null || healthierOption == null) {
            return;
        }
        productDetailsClickHandler.I5(healthierOption.getProductCard());
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        HealthierOption healthierOption = this.z;
        if ((12 & j) != 0) {
            this.y.L(healthierOption);
        }
        if ((j & 8) != 0) {
            this.B.setOnClickListener(this.C);
        }
        this.y.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.D != 0) {
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
            this.D = 8L;
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
            this.D |= 1;
        }
        return true;
    }
}
