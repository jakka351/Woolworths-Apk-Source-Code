package au.com.woolworths.shop.digipay.databinding;

import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeInsetBannerBinding;
import au.com.woolworths.shop.digipay.creditcard.CreditCardCaptureInlineErrorState;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class EpoxyItemDigipaySavedCreditCardInlineErrorBindingImpl extends EpoxyItemDigipaySavedCreditCardInlineErrorBinding {
    public static final ViewDataBinding.IncludedLayouts C;
    public final FrameLayout A;
    public long B;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(2);
        C = includedLayouts;
        includedLayouts.a(0, new int[]{1}, new int[]{R.layout.include_inset_banner}, new String[]{"include_inset_banner"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemDigipaySavedCreditCardInlineErrorBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 2, C, null);
        super(dataBindingComponent, view, (IncludeInsetBannerBinding) objArrT[1]);
        this.B = -1L;
        IncludeInsetBannerBinding includeInsetBannerBinding = this.y;
        if (includeInsetBannerBinding != null) {
            includeInsetBannerBinding.n = this;
        }
        FrameLayout frameLayout = (FrameLayout) objArrT[0];
        this.A = frameLayout;
        frameLayout.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (76 != i) {
            return false;
        }
        this.z = (CreditCardCaptureInlineErrorState) obj;
        synchronized (this) {
            this.B |= 2;
        }
        h(76);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        CreditCardCaptureInlineErrorState creditCardCaptureInlineErrorState = this.z;
        if ((j & 6) != 0) {
            this.y.L(creditCardCaptureInlineErrorState);
        }
        this.y.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.B != 0) {
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
            this.B = 4L;
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
            this.B |= 1;
        }
        return true;
    }
}
