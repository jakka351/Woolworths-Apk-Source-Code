package au.com.woolworths.feature.shop.more.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.feature.shop.more.MoreClickListener;
import au.com.woolworths.feature.shop.more.data.MoreDeliveryUnlimitedUnavailable;
import au.com.woolworths.feature.shop.more.generated.callback.OnClickListener;

/* loaded from: classes3.dex */
public class EpoxyItemDeliveryUnlimitedUnavailableBindingImpl extends EpoxyItemDeliveryUnlimitedUnavailableBinding implements OnClickListener.Listener {
    public final ConstraintLayout B;
    public final OnClickListener C;
    public long D;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemDeliveryUnlimitedUnavailableBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 2, null, null);
        super(dataBindingComponent, view, (TextView) objArrT[1]);
        this.D = -1L;
        this.y.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.B = constraintLayout;
        constraintLayout.setTag(null);
        E(view);
        this.C = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (37 == i) {
            this.A = (MoreClickListener) obj;
            synchronized (this) {
                this.D |= 1;
            }
            h(37);
            y();
            return true;
        }
        if (53 != i) {
            return false;
        }
        this.z = (MoreDeliveryUnlimitedUnavailable) obj;
        synchronized (this) {
            this.D |= 2;
        }
        h(53);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.shop.more.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        MoreClickListener moreClickListener = this.A;
        if (moreClickListener != null) {
            moreClickListener.t2();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        MoreDeliveryUnlimitedUnavailable moreDeliveryUnlimitedUnavailable = this.z;
        long j2 = 6 & j;
        CharSequence text = null;
        if (j2 != 0) {
            ResText resText = moreDeliveryUnlimitedUnavailable != null ? moreDeliveryUnlimitedUnavailable.f7630a : null;
            if (resText != null) {
                text = resText.getText(this.h.getContext());
            }
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.y, text);
        }
        if ((j & 4) != 0) {
            this.B.setOnClickListener(this.C);
        }
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
            this.D = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
