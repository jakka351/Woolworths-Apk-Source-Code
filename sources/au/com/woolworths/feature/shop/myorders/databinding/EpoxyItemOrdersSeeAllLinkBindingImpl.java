package au.com.woolworths.feature.shop.myorders.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.myorders.generated.callback.OnClickListener;
import au.com.woolworths.feature.shop.myorders.orders.SeeAllOrdersListener;
import com.google.android.material.card.MaterialCardView;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class EpoxyItemOrdersSeeAllLinkBindingImpl extends EpoxyItemOrdersSeeAllLinkBinding implements OnClickListener.Listener {
    public static final SparseIntArray C;
    public final OnClickListener A;
    public long B;
    public final MaterialCardView z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.see_all_orders_icon, 1);
        sparseIntArray.put(R.id.see_all_orders_text, 2);
        sparseIntArray.put(R.id.see_all_orders_button, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpoxyItemOrdersSeeAllLinkBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        super(dataBindingComponent, view, 0);
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, null, C);
        this.B = -1L;
        MaterialCardView materialCardView = (MaterialCardView) objArrT[0];
        this.z = materialCardView;
        materialCardView.setTag(null);
        E(view);
        this.A = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (92 != i) {
            return false;
        }
        L((SeeAllOrdersListener) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemOrdersSeeAllLinkBinding
    public final void L(SeeAllOrdersListener seeAllOrdersListener) throws Throwable {
        this.y = seeAllOrdersListener;
        synchronized (this) {
            this.B |= 1;
        }
        h(92);
        y();
    }

    @Override // au.com.woolworths.feature.shop.myorders.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        SeeAllOrdersListener seeAllOrdersListener = this.y;
        if (seeAllOrdersListener != null) {
            seeAllOrdersListener.M2();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        if ((j & 2) != 0) {
            this.z.setOnClickListener(this.A);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.B != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.B = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
