package au.com.woolworths.shop.deliveryunlimited.signup.databinding;

import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSubscribeTermsMarkdown;

/* loaded from: classes4.dex */
public class EpoxyItemDeliveryUnlimitedSignUpLandingDisclaimerBindingImpl extends EpoxyItemDeliveryUnlimitedSignUpLandingDisclaimerBinding {
    public long B;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (260 != i) {
            return false;
        }
        this.A = (DeliveryUnlimitedSubscribeTermsMarkdown) obj;
        synchronized (this) {
            this.B |= 1;
        }
        h(260);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String title;
        String content;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        DeliveryUnlimitedSubscribeTermsMarkdown deliveryUnlimitedSubscribeTermsMarkdown = this.A;
        long j2 = j & 3;
        if (j2 == 0 || deliveryUnlimitedSubscribeTermsMarkdown == null) {
            title = null;
            content = null;
        } else {
            title = deliveryUnlimitedSubscribeTermsMarkdown.getTitle();
            content = deliveryUnlimitedSubscribeTermsMarkdown.getContent();
        }
        if (j2 != 0) {
            BindingAdaptersKt.l(this.y, content, false, null, null);
            TextViewBindingAdapter.b(this.z, title);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.B != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.B = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
