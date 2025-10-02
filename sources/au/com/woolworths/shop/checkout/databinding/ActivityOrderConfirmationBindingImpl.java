package au.com.woolworths.shop.checkout.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.shop.checkout.generated.callback.OnClickListener;
import au.com.woolworths.shop.checkout.ui.analytics.OrderConfirmationActions;
import au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationContract;
import au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationErrorState;
import au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationViewModel;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class ActivityOrderConfirmationBindingImpl extends ActivityOrderConfirmationBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts M;
    public static final SparseIntArray N;
    public final ConstraintLayout H;
    public final Button I;
    public final ProgressBar J;
    public final OnClickListener K;
    public long L;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(9);
        M = includedLayouts;
        includedLayouts.a(1, new int[]{5}, new int[]{R.layout.include_generic_error_state}, new String[]{"include_generic_error_state"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 6);
        sparseIntArray.put(R.id.voc_card_container, 7);
        sparseIntArray.put(R.id.footer, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityOrderConfirmationBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 9, M, N);
        super(dataBindingComponent, view, (FrameLayout) objArrT[8], (IncludeGenericErrorStateBinding) objArrT[5], (EpoxyRecyclerView) objArrT[2], (Toolbar) objArrT[6], (ComposeView) objArrT[7]);
        this.L = -1L;
        IncludeGenericErrorStateBinding includeGenericErrorStateBinding = this.z;
        if (includeGenericErrorStateBinding != null) {
            includeGenericErrorStateBinding.n = this;
        }
        ((CoordinatorLayout) objArrT[0]).setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[1];
        this.H = constraintLayout;
        constraintLayout.setTag(null);
        Button button = (Button) objArrT[3];
        this.I = button;
        button.setTag(null);
        ProgressBar progressBar = (ProgressBar) objArrT[4];
        this.J = progressBar;
        progressBar.setTag(null);
        this.A.setTag(null);
        E(view);
        this.K = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.z.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (26 == i) {
            L((String) obj);
            return true;
        }
        if (275 == i) {
            return true;
        }
        if (76 == i) {
            M((OrderConfirmationErrorState) obj);
            return true;
        }
        if (273 == i) {
            O((OrderConfirmationViewModel) obj);
            return true;
        }
        if (131 != i) {
            return false;
        }
        N((Boolean) obj);
        return true;
    }

    @Override // au.com.woolworths.shop.checkout.databinding.ActivityOrderConfirmationBinding
    public final void L(String str) throws Throwable {
        this.E = str;
        synchronized (this) {
            this.L |= 2;
        }
        h(26);
        y();
    }

    @Override // au.com.woolworths.shop.checkout.databinding.ActivityOrderConfirmationBinding
    public final void M(OrderConfirmationErrorState orderConfirmationErrorState) throws Throwable {
        this.G = orderConfirmationErrorState;
        synchronized (this) {
            this.L |= 8;
        }
        h(76);
        y();
    }

    @Override // au.com.woolworths.shop.checkout.databinding.ActivityOrderConfirmationBinding
    public final void N(Boolean bool) throws Throwable {
        this.D = bool;
        synchronized (this) {
            this.L |= 32;
        }
        h(131);
        y();
    }

    @Override // au.com.woolworths.shop.checkout.databinding.ActivityOrderConfirmationBinding
    public final void O(OrderConfirmationViewModel orderConfirmationViewModel) throws Throwable {
        this.F = orderConfirmationViewModel;
        synchronized (this) {
            this.L |= 16;
        }
        h(273);
        y();
    }

    @Override // au.com.woolworths.shop.checkout.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        OrderConfirmationViewModel orderConfirmationViewModel = this.F;
        if (orderConfirmationViewModel != null) {
            orderConfirmationViewModel.k.f(OrderConfirmationContract.Action.NavigateToHome.f10718a);
            orderConfirmationViewModel.f.c(OrderConfirmationActions.NavigateHome.e);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        synchronized (this) {
            j = this.L;
            this.L = 0L;
        }
        String str = this.E;
        OrderConfirmationErrorState orderConfirmationErrorState = this.G;
        OrderConfirmationViewModel orderConfirmationViewModel = this.F;
        Boolean bool = this.D;
        long j2 = 66 & j;
        long j3 = 72 & j;
        boolean z4 = false;
        if (j3 != 0) {
            z = true;
            z2 = orderConfirmationErrorState == null;
            if (orderConfirmationErrorState == null) {
                z = false;
            }
        } else {
            z = false;
            z2 = false;
        }
        long j4 = 80 & j;
        long j5 = 96 & j;
        if (j5 != 0) {
            boolean zB = ViewDataBinding.B(bool);
            z4 = !zB;
            z3 = zB;
        } else {
            z3 = false;
        }
        if (j4 != 0) {
            this.z.L(orderConfirmationViewModel);
        }
        if (j3 != 0) {
            this.z.M(orderConfirmationErrorState);
            BindingAdaptersKt.o(this.z.h, z);
            BindingAdaptersKt.o(this.A, z2);
        }
        if (j5 != 0) {
            BindingAdaptersKt.o(this.H, z4);
            BindingAdaptersKt.o(this.J, z3);
        }
        if ((j & 64) != 0) {
            this.I.setOnClickListener(this.K);
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.I, str);
        }
        this.z.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.L != 0) {
                    return true;
                }
                return this.z.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.L = 64L;
        }
        this.z.r();
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
            this.L |= 1;
        }
        return true;
    }
}
