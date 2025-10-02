package au.com.woolworths.foundation.shop.bottomsheet.databinding;

import android.view.View;
import android.widget.Button;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetContract;
import au.com.woolworths.foundation.shop.bottomsheet.generated.callback.OnClickListener;

/* loaded from: classes4.dex */
public class EpoxyItemSecondaryCtaBindingImpl extends EpoxyItemSecondaryCtaBinding implements OnClickListener.Listener {
    public final OnClickListener B;
    public long C;

    public EpoxyItemSecondaryCtaBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        super(dataBindingComponent, view, (Button) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
        this.C = -1L;
        this.y.setTag(null);
        E(view);
        this.B = new OnClickListener(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (51 == i) {
            this.z = (ContentCta) obj;
            synchronized (this) {
                this.C |= 1;
            }
            h(51);
            y();
            return true;
        }
        if (157 != i) {
            return false;
        }
        this.A = (BaseBottomSheetContract.CtaClickListener) obj;
        synchronized (this) {
            this.C |= 2;
        }
        h(157);
        y();
        return true;
    }

    @Override // au.com.woolworths.foundation.shop.bottomsheet.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        ContentCta contentCta = this.z;
        BaseBottomSheetContract.CtaClickListener ctaClickListener = this.A;
        if (ctaClickListener != null) {
            ctaClickListener.B4(contentCta);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        ContentCta contentCta = this.z;
        long j2 = 5 & j;
        String label = (j2 == 0 || contentCta == null) ? null : contentCta.getLabel();
        if ((j & 4) != 0) {
            this.y.setOnClickListener(this.B);
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.y, label);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.C != 0;
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
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
