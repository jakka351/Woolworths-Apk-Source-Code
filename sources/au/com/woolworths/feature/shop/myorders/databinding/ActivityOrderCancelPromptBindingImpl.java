package au.com.woolworths.feature.shop.myorders.databinding;

import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.feature.shop.myorders.details.cancel.OrderCancellationPromptContract;
import au.com.woolworths.feature.shop.myorders.details.cancel.OrderCancellationPromptViewModel;
import au.com.woolworths.feature.shop.myorders.details.models.OrderCancelWarning;
import au.com.woolworths.feature.shop.myorders.generated.callback.OnUnlockListener;
import au.com.woolworths.views.unlockslider.UnlockSlider;
import au.com.woolworths.views.unlockslider.UnlockSliderBindingAdaptersKt;
import com.woolworths.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class ActivityOrderCancelPromptBindingImpl extends ActivityOrderCancelPromptBinding implements OnUnlockListener.Listener {
    public static final ViewDataBinding.IncludedLayouts K;
    public static final SparseIntArray L;
    public final OnUnlockListener I;
    public long J;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(11);
        K = includedLayouts;
        includedLayouts.a(0, new int[]{5}, new int[]{R.layout.include_generic_error_state}, new String[]{"include_generic_error_state"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(R.id.appbar_orders, 6);
        sparseIntArray.put(R.id.toolbar, 7);
        sparseIntArray.put(R.id.container_content, 8);
        sparseIntArray.put(R.id.content, 9);
        sparseIntArray.put(R.id.cancel_order_slider, 10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityOrderCancelPromptBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 11, K, L);
        UnlockSlider unlockSlider = (UnlockSlider) objArrT[3];
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[10];
        super(dataBindingComponent, view, unlockSlider, constraintLayout, (TextView) objArrT[9], (IncludeGenericErrorStateBinding) objArrT[5], (FrameLayout) objArrT[4], (TextView) objArrT[2], (TextView) objArrT[1], (Toolbar) objArrT[7]);
        this.J = -1L;
        this.y.setTag(null);
        IncludeGenericErrorStateBinding includeGenericErrorStateBinding = this.B;
        if (includeGenericErrorStateBinding != null) {
            includeGenericErrorStateBinding.n = this;
        }
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        E(view);
        this.I = new OnUnlockListener(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.B.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (188 == i) {
            L((Integer) obj);
            return true;
        }
        if (273 != i) {
            return false;
        }
        M((OrderCancellationPromptViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.myorders.databinding.ActivityOrderCancelPromptBinding
    public final void L(Integer num) throws Throwable {
        this.G = num;
        synchronized (this) {
            this.J |= 4;
        }
        h(188);
        y();
    }

    @Override // au.com.woolworths.feature.shop.myorders.databinding.ActivityOrderCancelPromptBinding
    public final void M(OrderCancellationPromptViewModel orderCancellationPromptViewModel) throws Throwable {
        this.H = orderCancellationPromptViewModel;
        synchronized (this) {
            this.J |= 8;
        }
        h(273);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() throws Resources.NotFoundException {
        long j;
        boolean z;
        boolean z2;
        String str;
        String str2;
        boolean z3;
        FullPageErrorCause fullPageErrorCause;
        OrderCancelWarning orderCancelWarning;
        synchronized (this) {
            j = this.J;
            this.J = 0L;
        }
        OrderCancellationPromptViewModel orderCancellationPromptViewModel = this.H;
        long j2 = 25 & j;
        FullPageErrorCause fullPageErrorCause2 = null;
        if (j2 != 0) {
            MutableLiveData mutableLiveData = orderCancellationPromptViewModel != null ? orderCancellationPromptViewModel.i : null;
            I(0, mutableLiveData);
            OrderCancellationPromptContract.ViewState viewState = mutableLiveData != null ? (OrderCancellationPromptContract.ViewState) mutableLiveData.e() : null;
            if (viewState != null) {
                fullPageErrorCause = viewState.c;
                orderCancelWarning = viewState.b;
                z3 = viewState.f7696a;
            } else {
                z3 = false;
                fullPageErrorCause = null;
                orderCancelWarning = null;
            }
            z2 = fullPageErrorCause != null;
            if (orderCancelWarning != null) {
                String str3 = orderCancelWarning.e;
                str2 = orderCancelWarning.d;
                boolean z4 = z3;
                str = str3;
                fullPageErrorCause2 = fullPageErrorCause;
                z = z4;
            } else {
                str2 = null;
                fullPageErrorCause2 = fullPageErrorCause;
                z = z3;
                str = null;
            }
        } else {
            z = false;
            z2 = false;
            str = null;
            str2 = null;
        }
        if ((16 & j) != 0) {
            UnlockSlider unlockSlider = this.y;
            OnUnlockListener onUnlockListener = this.I;
            Intrinsics.h(unlockSlider, "unlockSlider");
            unlockSlider.setOnUnlockListener(onUnlockListener);
            UnlockSlider unlockSlider2 = this.y;
            unlockSlider2.setButtonIcon(AppCompatResources.b(R.drawable.ic_arrow_right, unlockSlider2.getContext()));
            UnlockSlider unlockSlider3 = this.y;
            unlockSlider3.setButtonText(unlockSlider3.getResources().getString(R.string.cancelling_slider));
            UnlockSliderBindingAdaptersKt.a(this.y);
            UnlockSlider unlockSlider4 = this.y;
            unlockSlider4.setText(unlockSlider4.getResources().getString(R.string.unlock_now_slider));
        }
        if (j2 != 0) {
            UnlockSlider unlockSlider5 = this.y;
            Intrinsics.h(unlockSlider5, "unlockSlider");
            unlockSlider5.k(z, false);
            BindingAdaptersKt.o(this.B.h, z2);
            this.B.M(fullPageErrorCause2);
            BindingAdaptersKt.o(this.C, z);
            TextViewBindingAdapter.b(this.D, str);
            TextViewBindingAdapter.b(this.E, str2);
        }
        if ((j & 24) != 0) {
            this.B.L(orderCancellationPromptViewModel);
        }
        this.B.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.J != 0) {
                    return true;
                }
                return this.B.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.J = 16L;
        }
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
                this.J |= 1;
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
            this.J |= 2;
        }
        return true;
    }
}
