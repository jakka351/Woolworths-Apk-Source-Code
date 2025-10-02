package au.com.woolworths.base.shopapp.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.base.shopapp.cartbadge.CartBadgeClickListener;
import au.com.woolworths.base.shopapp.generated.callback.OnClickListener;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class MenuCartBadgeBindingImpl extends MenuCartBadgeBinding implements OnClickListener.Listener {
    public static final SparseIntArray F;
    public final OnClickListener D;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(R.id.cart_label, 1);
        sparseIntArray.put(R.id.cart_image, 2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MenuCartBadgeBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, F);
        super(view, (ImageView) objArrT[2], (TextView) objArrT[1], (ConstraintLayout) objArrT[0], dataBindingComponent);
        this.E = -1L;
        this.y.setTag(null);
        E(view);
        this.D = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (157 != i) {
            return false;
        }
        L((CartBadgeClickListener) obj);
        return true;
    }

    @Override // au.com.woolworths.base.shopapp.databinding.MenuCartBadgeBinding
    public final void L(CartBadgeClickListener cartBadgeClickListener) throws Throwable {
        this.B = cartBadgeClickListener;
        synchronized (this) {
            this.E |= 1;
        }
        h(157);
        y();
    }

    @Override // au.com.woolworths.base.shopapp.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        CartBadgeClickListener cartBadgeClickListener = this.B;
        if (cartBadgeClickListener != null) {
            cartBadgeClickListener.Q();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        if ((j & 2) != 0) {
            this.y.setOnClickListener(this.D);
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
            this.E = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
