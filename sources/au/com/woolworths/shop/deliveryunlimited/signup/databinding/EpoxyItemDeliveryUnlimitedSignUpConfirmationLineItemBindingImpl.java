package au.com.woolworths.shop.deliveryunlimited.signup.databinding;

import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSubscribeConfirmationLineItem;

/* loaded from: classes4.dex */
public class EpoxyItemDeliveryUnlimitedSignUpConfirmationLineItemBindingImpl extends EpoxyItemDeliveryUnlimitedSignUpConfirmationLineItemBinding {
    public long C;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (53 != i) {
            return false;
        }
        this.B = (DeliveryUnlimitedSubscribeConfirmationLineItem) obj;
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
        String label;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        DeliveryUnlimitedSubscribeConfirmationLineItem deliveryUnlimitedSubscribeConfirmationLineItem = this.B;
        long j2 = j & 3;
        boolean z = false;
        String str2 = null;
        if (j2 != 0) {
            if (deliveryUnlimitedSubscribeConfirmationLineItem != null) {
                String title = deliveryUnlimitedSubscribeConfirmationLineItem.getTitle();
                String iconUrl = deliveryUnlimitedSubscribeConfirmationLineItem.getIconUrl();
                label = deliveryUnlimitedSubscribeConfirmationLineItem.getLabel();
                str = title;
                str2 = iconUrl;
            } else {
                str = null;
                label = null;
            }
            if (str2 != null) {
                z = true;
            }
        } else {
            str = null;
            label = null;
        }
        if (j2 != 0) {
            BindingAdaptersKt.d(this.y, str2);
            BindingAdaptersKt.o(this.y, z);
            TextViewBindingAdapter.b(this.z, label);
            TextViewBindingAdapter.b(this.A, str);
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
