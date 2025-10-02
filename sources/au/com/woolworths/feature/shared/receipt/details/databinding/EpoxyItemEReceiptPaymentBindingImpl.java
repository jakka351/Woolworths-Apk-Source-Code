package au.com.woolworths.feature.shared.receipt.details.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptDetailsPayment;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class EpoxyItemEReceiptPaymentBindingImpl extends EpoxyItemEReceiptPaymentBinding {
    public final TextView B;
    public long C;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemEReceiptPaymentBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, null, null);
        super(view, (ImageView) objArrT[1], (TextView) objArrT[3], dataBindingComponent);
        this.C = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        TextView textView = (TextView) objArrT[2];
        this.B = textView;
        textView.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (53 != i) {
            return false;
        }
        this.A = (EReceiptDetailsPayment) obj;
        synchronized (this) {
            this.C |= 1;
        }
        h(53);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String str;
        String str2;
        String altText;
        String str3;
        String amount;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        EReceiptDetailsPayment eReceiptDetailsPayment = this.A;
        long j2 = j & 3;
        String str4 = null;
        if (j2 != 0) {
            if (eReceiptDetailsPayment != null) {
                String description = eReceiptDetailsPayment.getDescription();
                String iconUrl = eReceiptDetailsPayment.getIconUrl();
                altText = eReceiptDetailsPayment.getAltText();
                amount = eReceiptDetailsPayment.getAmount();
                str3 = description;
                str4 = iconUrl;
            } else {
                str3 = null;
                amount = null;
                altText = null;
            }
            z = str4 != null;
            String str5 = str3;
            str = str4;
            str4 = amount;
            str2 = str5;
        } else {
            str = null;
            str2 = null;
            altText = null;
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.y, str4);
            BindingAdaptersKt.o(this.z, z);
            ImageView imageView = this.z;
            BindingAdaptersKt.f(imageView, str, AppCompatResources.b(R.drawable.ic_card_placeholder, imageView.getContext()));
            TextViewBindingAdapter.b(this.B, str2);
            if (ViewDataBinding.s >= 4) {
                this.z.setContentDescription(altText);
            }
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
            this.C = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
