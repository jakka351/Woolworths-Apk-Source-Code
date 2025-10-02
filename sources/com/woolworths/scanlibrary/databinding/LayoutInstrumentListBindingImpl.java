package com.woolworths.scanlibrary.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ViewDataBinding;
import com.woolworths.R;
import com.woolworths.scanlibrary.generated.callback.OnClickListener;
import com.woolworths.scanlibrary.ui.checkout.pay.PayFragment;

/* loaded from: classes7.dex */
public class LayoutInstrumentListBindingImpl extends LayoutInstrumentListBinding implements OnClickListener.Listener {
    public static final SparseIntArray E;
    public final OnClickListener C;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.txtLabelYourCard, 2);
        sparseIntArray.put(R.id.paymentInstrumentFragmentHolder, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LayoutInstrumentListBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, null, E);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        FrameLayout frameLayout = (FrameLayout) objArrT[3];
        TextView textView = (TextView) objArrT[1];
        super(dataBindingComponent, view, constraintLayout, frameLayout, textView);
        this.D = -1L;
        this.y.setTag(null);
        this.A.setTag(null);
        E(view);
        this.C = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((PayFragment.ViewModel) obj);
        return true;
    }

    @Override // com.woolworths.scanlibrary.databinding.LayoutInstrumentListBinding
    public final void L(PayFragment.ViewModel viewModel) throws Throwable {
        J(2, viewModel);
        this.B = viewModel;
        synchronized (this) {
            this.D |= 4;
        }
        h(273);
        y();
    }

    @Override // com.woolworths.scanlibrary.generated.callback.OnClickListener.Listener
    public final void a(int i) throws Throwable {
        PayFragment.ViewModel viewModel = this.B;
        if (viewModel != null) {
            ObservableBoolean observableBoolean = viewModel.m;
            if (observableBoolean.e) {
                viewModel.i(true);
                observableBoolean.i(false);
            } else {
                observableBoolean.i(true);
                viewModel.i(false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x007d A[PHI: r2
  0x007d: PHI (r2v4 long) = (r2v3 long), (r2v9 long) binds: [B:29:0x0059, B:42:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.woolworths.scanlibrary.databinding.LayoutInstrumentListBindingImpl.j():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.D = 16L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.D |= 1;
            }
            return true;
        }
        if (i == 1) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.D |= 2;
            }
            return true;
        }
        if (i == 2) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.D |= 4;
            }
            return true;
        }
        if (i != 3) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.D |= 8;
        }
        return true;
    }
}
