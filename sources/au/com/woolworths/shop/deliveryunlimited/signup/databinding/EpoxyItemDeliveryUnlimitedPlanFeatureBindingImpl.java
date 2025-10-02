package au.com.woolworths.shop.deliveryunlimited.signup.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSignUpPlanFeature;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class EpoxyItemDeliveryUnlimitedPlanFeatureBindingImpl extends EpoxyItemDeliveryUnlimitedPlanFeatureBinding {
    public final TextView A;
    public long B;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemDeliveryUnlimitedPlanFeatureBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, null);
        super(dataBindingComponent, view, (ImageView) objArrT[1]);
        this.B = -1L;
        this.y.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        TextView textView = (TextView) objArrT[2];
        this.A = textView;
        textView.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (53 != i) {
            return false;
        }
        this.z = (DeliveryUnlimitedSignUpPlanFeature) obj;
        synchronized (this) {
            this.B |= 1;
        }
        h(53);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String description;
        String iconUrl;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        DeliveryUnlimitedSignUpPlanFeature deliveryUnlimitedSignUpPlanFeature = this.z;
        long j2 = j & 3;
        if (j2 == 0 || deliveryUnlimitedSignUpPlanFeature == null) {
            description = null;
            iconUrl = null;
        } else {
            description = deliveryUnlimitedSignUpPlanFeature.getDescription();
            iconUrl = deliveryUnlimitedSignUpPlanFeature.getIconUrl();
        }
        if (j2 != 0) {
            ImageView imageView = this.y;
            d.z(imageView, R.drawable.ic_delivery_unlimited_sign_up_tick, imageView, iconUrl, null);
            TextViewBindingAdapter.b(this.A, description);
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
