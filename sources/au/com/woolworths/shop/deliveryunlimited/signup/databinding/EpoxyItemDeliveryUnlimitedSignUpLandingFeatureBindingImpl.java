package au.com.woolworths.shop.deliveryunlimited.signup.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.base.shopapp.bindings.TextViewBindingsKt;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSignUpLandingFeature;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSubscribeLink;
import au.com.woolworths.shop.deliveryunlimited.signup.generated.callback.OnClickListener;
import au.com.woolworths.shop.deliveryunlimited.signup.landing.DeliveryUnlimitedSummaryClickListener;

/* loaded from: classes4.dex */
public class EpoxyItemDeliveryUnlimitedSignUpLandingFeatureBindingImpl extends EpoxyItemDeliveryUnlimitedSignUpLandingFeatureBinding implements OnClickListener.Listener {
    public final OnClickListener E;
    public long F;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemDeliveryUnlimitedSignUpLandingFeatureBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 5, null, null);
        super(view, (ImageView) objArrT[1], (TextView) objArrT[3], (TextView) objArrT[4], (TextView) objArrT[2], dataBindingComponent);
        this.F = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.B.setTag(null);
        E(view);
        this.E = new OnClickListener(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (37 == i) {
            this.D = (DeliveryUnlimitedSummaryClickListener) obj;
            synchronized (this) {
                this.F |= 1;
            }
            h(37);
            y();
            return true;
        }
        if (53 != i) {
            return false;
        }
        this.C = (DeliveryUnlimitedSignUpLandingFeature) obj;
        synchronized (this) {
            this.F |= 2;
        }
        h(53);
        y();
        return true;
    }

    @Override // au.com.woolworths.shop.deliveryunlimited.signup.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        DeliveryUnlimitedSummaryClickListener deliveryUnlimitedSummaryClickListener = this.D;
        DeliveryUnlimitedSignUpLandingFeature deliveryUnlimitedSignUpLandingFeature = this.C;
        if (deliveryUnlimitedSummaryClickListener == null || deliveryUnlimitedSignUpLandingFeature == null) {
            return;
        }
        deliveryUnlimitedSummaryClickListener.A0(deliveryUnlimitedSignUpLandingFeature.getLink());
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String str;
        String title;
        String iconUrl;
        String description;
        DeliveryUnlimitedSubscribeLink link;
        synchronized (this) {
            j = this.F;
            this.F = 0L;
        }
        DeliveryUnlimitedSignUpLandingFeature deliveryUnlimitedSignUpLandingFeature = this.C;
        long j2 = 6 & j;
        if (j2 != 0) {
            if (deliveryUnlimitedSignUpLandingFeature != null) {
                title = deliveryUnlimitedSignUpLandingFeature.getTitle();
                iconUrl = deliveryUnlimitedSignUpLandingFeature.getIconUrl();
                link = deliveryUnlimitedSignUpLandingFeature.getLink();
                description = deliveryUnlimitedSignUpLandingFeature.getDescription();
            } else {
                description = null;
                title = null;
                iconUrl = null;
                link = null;
            }
            text = link != null ? link.getText() : null;
            z = text != null;
            String str2 = text;
            text = description;
            str = str2;
        } else {
            str = null;
            title = null;
            iconUrl = null;
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.y, text);
            BindingAdaptersKt.d(this.z, iconUrl);
            TextViewBindingAdapter.b(this.A, str);
            BindingAdaptersKt.o(this.A, z);
            TextViewBindingsKt.a(this.B, title);
        }
        if ((j & 4) != 0) {
            this.A.setOnClickListener(this.E);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.F != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.F = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
