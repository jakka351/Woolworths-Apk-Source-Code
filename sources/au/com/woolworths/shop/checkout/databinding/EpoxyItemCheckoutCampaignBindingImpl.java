package au.com.woolworths.shop.checkout.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.checkout.domain.model.CheckoutProductCampaign;
import au.com.woolworths.shop.checkout.generated.callback.OnClickListener;
import au.com.woolworths.shop.checkout.ui.product.CheckoutProductListener;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class EpoxyItemCheckoutCampaignBindingImpl extends EpoxyItemCheckoutCampaignBinding implements OnClickListener.Listener {
    public static final SparseIntArray I;
    public final OnClickListener G;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(R.id.opted_in_switch, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemCheckoutCampaignBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 7, null, I);
        super(dataBindingComponent, view, (ImageView) objArrT[1], (TextView) objArrT[2], (SwitchMaterial) objArrT[6], (TextView) objArrT[4], (TextView) objArrT[3], (ImageButton) objArrT[5]);
        this.H = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        E(view);
        this.G = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (27 == i) {
            this.E = (CheckoutProductCampaign) obj;
            synchronized (this) {
                this.H |= 1;
            }
            h(27);
            y();
            return true;
        }
        if (157 != i) {
            return false;
        }
        this.F = (CheckoutProductListener) obj;
        synchronized (this) {
            this.H |= 2;
        }
        h(157);
        y();
        return true;
    }

    @Override // au.com.woolworths.shop.checkout.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        CheckoutProductCampaign checkoutProductCampaign = this.E;
        CheckoutProductListener checkoutProductListener = this.F;
        if (checkoutProductListener == null || checkoutProductCampaign == null) {
            return;
        }
        checkoutProductListener.W3(checkoutProductCampaign.g);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String str;
        String str2;
        String str3;
        String str4;
        synchronized (this) {
            j = this.H;
            this.H = 0L;
        }
        CheckoutProductCampaign checkoutProductCampaign = this.E;
        long j2 = 5 & j;
        if (j2 == 0 || checkoutProductCampaign == null) {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
        } else {
            str = checkoutProductCampaign.e;
            str3 = checkoutProductCampaign.f10566a;
            str4 = checkoutProductCampaign.c;
            str2 = checkoutProductCampaign.b;
        }
        if (j2 != 0) {
            ImageView imageView = this.y;
            d.z(this.y, R.drawable.ic_campaign_default, imageView, str, AppCompatResources.b(R.drawable.ic_campaign_default, imageView.getContext()));
            TextViewBindingAdapter.b(this.z, str3);
            TextViewBindingAdapter.b(this.B, str4);
            TextViewBindingAdapter.b(this.C, str2);
        }
        if ((j & 4) != 0) {
            this.D.setOnClickListener(this.G);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.H != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.H = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
