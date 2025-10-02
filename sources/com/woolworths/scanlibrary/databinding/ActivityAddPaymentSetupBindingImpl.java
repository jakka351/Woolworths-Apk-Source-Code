package com.woolworths.scanlibrary.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.woolworths.R;
import com.woolworths.scanlibrary.generated.callback.OnClickListener;
import com.woolworths.scanlibrary.ui.payment.analytics.AddPaymentTracking;
import com.woolworths.scanlibrary.ui.payment.setup.AddPaymentSetupContract;
import com.woolworths.scanlibrary.ui.payment.setup.AddPaymentSetupViewModel;

/* loaded from: classes7.dex */
public class ActivityAddPaymentSetupBindingImpl extends ActivityAddPaymentSetupBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts D;
    public static final SparseIntArray E;
    public final OnClickListener B;
    public long C;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(6);
        D = includedLayouts;
        includedLayouts.a(0, new int[]{2}, new int[]{R.layout.layout_wow_toolbar}, new String[]{"layout_wow_toolbar"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.txtViewTitle, 3);
        sparseIntArray.put(R.id.txtViewSubTitle, 4);
        sparseIntArray.put(R.id.imageViewPaymentOption, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityAddPaymentSetupBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 6, D, E);
        LayoutWowToolbarBinding layoutWowToolbarBinding = (LayoutWowToolbarBinding) objArrT[2];
        TextView textView = (TextView) objArrT[1];
        super(dataBindingComponent, view, layoutWowToolbarBinding, textView);
        this.C = -1L;
        LayoutWowToolbarBinding layoutWowToolbarBinding2 = this.y;
        if (layoutWowToolbarBinding2 != null) {
            layoutWowToolbarBinding2.n = this;
        }
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.z.setTag(null);
        E(view);
        this.B = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.y.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (270 != i) {
            return false;
        }
        L((AddPaymentSetupViewModel) obj);
        return true;
    }

    @Override // com.woolworths.scanlibrary.databinding.ActivityAddPaymentSetupBinding
    public final void L(AddPaymentSetupViewModel addPaymentSetupViewModel) throws Throwable {
        this.A = addPaymentSetupViewModel;
        synchronized (this) {
            this.C |= 2;
        }
        h(SubsamplingScaleImageView.ORIENTATION_270);
        y();
    }

    @Override // com.woolworths.scanlibrary.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        AddPaymentSetupViewModel addPaymentSetupViewModel = this.A;
        if (addPaymentSetupViewModel != null) {
            addPaymentSetupViewModel.h.c(AddPaymentTracking.d);
            addPaymentSetupViewModel.i.f(AddPaymentSetupContract.Actions.AddPayment.f21289a);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        if ((j & 4) != 0) {
            this.z.setOnClickListener(this.B);
        }
        this.y.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.C != 0) {
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
            this.C = 4L;
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
            this.C |= 1;
        }
        return true;
    }
}
