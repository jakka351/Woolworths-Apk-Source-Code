package com.woolworths.scanlibrary.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.pay.sdk.web.StepUpView;
import com.woolworths.R;
import com.woolworths.scanlibrary.generated.callback.OnClickListener;
import com.woolworths.scanlibrary.ui.checkout.pay.PayContract;
import com.woolworths.scanlibrary.ui.checkout.pay.PayFragment$requestStepUp$1;
import com.woolworths.scanlibrary.ui.checkout.stepup.StepUpDialogFragment;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class FragmentStepupDialogBindingImpl extends FragmentStepupDialogBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts K;
    public static final SparseIntArray L;
    public final TextView F;
    public final ProgressBar G;
    public final OnClickListener H;
    public final OnClickListener I;
    public long J;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(9);
        K = includedLayouts;
        includedLayouts.a(0, new int[]{5}, new int[]{R.layout.view_payment_error}, new String[]{"view_payment_error"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(R.id.stepUpWrapperLinearLayout, 6);
        sparseIntArray.put(R.id.cvvStepUpLinearLayout, 7);
        sparseIntArray.put(R.id.dummyView, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentStepupDialogBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 9, K, L);
        Button button = (Button) objArrT[3];
        FrameLayout frameLayout = (FrameLayout) objArrT[7];
        View view2 = (View) objArrT[8];
        ViewPaymentErrorBinding viewPaymentErrorBinding = (ViewPaymentErrorBinding) objArrT[5];
        super(dataBindingComponent, view, button, frameLayout, view2, viewPaymentErrorBinding, (Button) objArrT[4]);
        this.J = -1L;
        this.y.setTag(null);
        ((LinearLayout) objArrT[0]).setTag(null);
        TextView textView = (TextView) objArrT[1];
        this.F = textView;
        textView.setTag(null);
        ProgressBar progressBar = (ProgressBar) objArrT[2];
        this.G = progressBar;
        progressBar.setTag(null);
        ViewPaymentErrorBinding viewPaymentErrorBinding2 = this.B;
        if (viewPaymentErrorBinding2 != null) {
            viewPaymentErrorBinding2.n = this;
        }
        this.C.setTag(null);
        E(view);
        this.H = new OnClickListener(this, 1);
        this.I = new OnClickListener(this, 2);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((StepUpDialogFragment.StepUpViewModel) obj);
        return true;
    }

    @Override // com.woolworths.scanlibrary.databinding.FragmentStepupDialogBinding
    public final void L(StepUpDialogFragment.StepUpViewModel stepUpViewModel) throws Throwable {
        J(6, stepUpViewModel);
        this.D = stepUpViewModel;
        synchronized (this) {
            this.J |= 64;
        }
        h(273);
        y();
    }

    @Override // com.woolworths.scanlibrary.generated.callback.OnClickListener.Listener
    public final void a(int i) throws Throwable {
        StepUpDialogFragment.StepUpViewModel stepUpViewModel;
        StepUpView stepUpView;
        if (i == 1) {
            StepUpDialogFragment.StepUpViewModel stepUpViewModel2 = this.D;
            if (stepUpViewModel2 != null) {
                StepUpDialogFragment stepUpDialogFragment = StepUpDialogFragment.this;
                PayFragment$requestStepUp$1 payFragment$requestStepUp$1 = stepUpDialogFragment.h;
                if (payFragment$requestStepUp$1 != null) {
                    ((PayContract.Presenter) payFragment$requestStepUp$1.f21235a.Q1()).R0();
                }
                stepUpDialogFragment.dismiss();
                return;
            }
            return;
        }
        if (i == 2 && (stepUpViewModel = this.D) != null) {
            StepUpDialogFragment stepUpDialogFragment2 = StepUpDialogFragment.this;
            stepUpDialogFragment2.f.h.i(false);
            WeakReference weakReference = stepUpDialogFragment2.g;
            if (weakReference == null || (stepUpView = (StepUpView) weakReference.get()) == null) {
                return;
            }
            stepUpView.d(new JSONObject());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004a A[PHI: r2
  0x004a: PHI (r2v3 long) = (r2v0 long), (r2v5 long) binds: [B:9:0x0028, B:22:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e5  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.woolworths.scanlibrary.databinding.FragmentStepupDialogBindingImpl.j():void");
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
            this.J = 512L;
        }
        this.B.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        switch (i) {
            case 0:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.J |= 1;
                }
                return true;
            case 1:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.J |= 2;
                }
                return true;
            case 2:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.J |= 4;
                }
                return true;
            case 3:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.J |= 8;
                }
                return true;
            case 4:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.J |= 16;
                }
                return true;
            case 5:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.J |= 32;
                }
                return true;
            case 6:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.J |= 64;
                }
                return true;
            case 7:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.J |= 128;
                }
                return true;
            case 8:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.J |= 256;
                }
                return true;
            default:
                return false;
        }
    }
}
