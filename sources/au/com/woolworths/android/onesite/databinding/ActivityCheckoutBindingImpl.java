package au.com.woolworths.android.onesite.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.generated.callback.OnClickListener;
import au.com.woolworths.shop.checkout.databinding.IncludeCheckoutAppBarBinding;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class ActivityCheckoutBindingImpl extends ActivityCheckoutBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts E;
    public static final SparseIntArray F;
    public final OnClickListener C;
    public long D;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(5);
        E = includedLayouts;
        includedLayouts.a(0, new int[]{2}, new int[]{R.layout.include_checkout_app_bar}, new String[]{"include_checkout_app_bar"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(R.id.view_loading, 1);
        sparseIntArray.put(R.id.nav_host_fragment, 3);
        sparseIntArray.put(R.id.snack_coordinator_layout, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityCheckoutBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 5, E, F);
        IncludeCheckoutAppBarBinding includeCheckoutAppBarBinding = (IncludeCheckoutAppBarBinding) objArrT[2];
        super(dataBindingComponent, view, includeCheckoutAppBarBinding, (CoordinatorLayout) objArrT[4], (View) objArrT[1]);
        this.D = -1L;
        IncludeCheckoutAppBarBinding includeCheckoutAppBarBinding2 = this.y;
        if (includeCheckoutAppBarBinding2 != null) {
            includeCheckoutAppBarBinding2.n = this;
        }
        ((ConstraintLayout) objArrT[0]).setTag(null);
        E(view);
        this.C = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (241 != i) {
            return false;
        }
        L((Boolean) obj);
        return true;
    }

    @Override // au.com.woolworths.android.onesite.databinding.ActivityCheckoutBinding
    public final void L(Boolean bool) throws Throwable {
        this.B = bool;
        synchronized (this) {
            this.D |= 2;
        }
        h(241);
        y();
    }

    @Override // au.com.woolworths.android.onesite.generated.callback.OnClickListener.Listener
    public final void a(int i) {
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        long j2 = 6 & j;
        boolean zB = j2 != 0 ? ViewDataBinding.B(this.B) : false;
        if ((j & 4) != 0) {
            this.A.setOnClickListener(this.C);
        }
        if (j2 != 0) {
            BindingAdaptersKt.o(this.A, zB);
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
            this.D = 4L;
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
