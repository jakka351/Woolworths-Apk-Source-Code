package au.com.woolworths.shop.checkout.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.modules.inlinemessage.InlineMessage;
import au.com.woolworths.shop.checkout.domain.model.breakdown.CheckoutOrderTotalDetails;
import au.com.woolworths.shop.checkout.generated.callback.OnClickListener;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentListener;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class FragmentCheckoutContentBindingImpl extends FragmentCheckoutContentBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts P;
    public static final SparseIntArray Q;
    public final OnClickListener N;
    public long O;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(8);
        P = includedLayouts;
        includedLayouts.a(0, new int[]{6}, new int[]{R.layout.include_generic_error_state}, new String[]{"include_generic_error_state"});
        includedLayouts.a(1, new int[]{5}, new int[]{R.layout.include_checkout_order_total_details}, new String[]{"include_checkout_order_total_details"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(R.id.view_loading, 4);
        sparseIntArray.put(R.id.compose_bottom_sheet, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentCheckoutContentBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 8, P, Q);
        super(dataBindingComponent, view, (ComposeView) objArrT[7], (ComposeView) objArrT[3], (CoordinatorLayout) objArrT[1], (IncludeGenericErrorStateBinding) objArrT[6], (IncludeCheckoutOrderTotalDetailsBinding) objArrT[5], (EpoxyRecyclerView) objArrT[2], (View) objArrT[4]);
        this.O = -1L;
        this.z.setTag(null);
        this.A.setTag(null);
        IncludeGenericErrorStateBinding includeGenericErrorStateBinding = this.B;
        if (includeGenericErrorStateBinding != null) {
            includeGenericErrorStateBinding.n = this;
        }
        IncludeCheckoutOrderTotalDetailsBinding includeCheckoutOrderTotalDetailsBinding = this.C;
        if (includeCheckoutOrderTotalDetailsBinding != null) {
            includeCheckoutOrderTotalDetailsBinding.n = this;
        }
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.D.setTag(null);
        E(view);
        this.N = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (117 == i) {
            M((InlineMessage) obj);
            return true;
        }
        if (190 == i) {
            R((CheckoutOrderTotalDetails) obj);
            return true;
        }
        if (122 == i) {
            N((Boolean) obj);
            return true;
        }
        if (157 == i) {
            Q((CheckoutContentListener) obj);
            return true;
        }
        if (131 == i) {
            P((Boolean) obj);
            return true;
        }
        if (76 == i) {
            L((FullPageErrorCause) obj);
            return true;
        }
        if (124 != i) {
            return false;
        }
        O((Boolean) obj);
        return true;
    }

    @Override // au.com.woolworths.shop.checkout.databinding.FragmentCheckoutContentBinding
    public final void L(FullPageErrorCause fullPageErrorCause) throws Throwable {
        this.L = fullPageErrorCause;
        synchronized (this) {
            this.O |= 128;
        }
        h(76);
        y();
    }

    @Override // au.com.woolworths.shop.checkout.databinding.FragmentCheckoutContentBinding
    public final void M(InlineMessage inlineMessage) throws Throwable {
        this.H = inlineMessage;
        synchronized (this) {
            this.O |= 4;
        }
        h(117);
        y();
    }

    @Override // au.com.woolworths.shop.checkout.databinding.FragmentCheckoutContentBinding
    public final void N(Boolean bool) throws Throwable {
        this.I = bool;
        synchronized (this) {
            this.O |= 16;
        }
        h(122);
        y();
    }

    @Override // au.com.woolworths.shop.checkout.databinding.FragmentCheckoutContentBinding
    public final void O(Boolean bool) throws Throwable {
        this.J = bool;
        synchronized (this) {
            this.O |= 256;
        }
        h(124);
        y();
    }

    @Override // au.com.woolworths.shop.checkout.databinding.FragmentCheckoutContentBinding
    public final void P(Boolean bool) throws Throwable {
        this.F = bool;
        synchronized (this) {
            this.O |= 64;
        }
        h(131);
        y();
    }

    @Override // au.com.woolworths.shop.checkout.databinding.FragmentCheckoutContentBinding
    public final void Q(CheckoutContentListener checkoutContentListener) throws Throwable {
        this.K = checkoutContentListener;
        synchronized (this) {
            this.O |= 32;
        }
        h(157);
        y();
    }

    @Override // au.com.woolworths.shop.checkout.databinding.FragmentCheckoutContentBinding
    public final void R(CheckoutOrderTotalDetails checkoutOrderTotalDetails) throws Throwable {
        this.G = checkoutOrderTotalDetails;
        synchronized (this) {
            this.O |= 8;
        }
        h(190);
        y();
    }

    @Override // au.com.woolworths.shop.checkout.generated.callback.OnClickListener.Listener
    public final void a(int i) {
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0057 A[PHI: r2
  0x0057: PHI (r2v1 long) = (r2v0 long), (r2v4 long) binds: [B:16:0x003e, B:25:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.databinding.FragmentCheckoutContentBindingImpl.j():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.O != 0) {
                    return true;
                }
                return this.C.p() || this.B.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.O = 512L;
        }
        this.C.r();
        this.B.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.O |= 1;
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.O |= 2;
        }
        return true;
    }
}
