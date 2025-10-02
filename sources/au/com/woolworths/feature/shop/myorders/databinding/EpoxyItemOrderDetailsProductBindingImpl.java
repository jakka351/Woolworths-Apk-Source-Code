package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.shop.myorders.details.models.OrderDetailsProductCardData;
import au.com.woolworths.feature.shop.myorders.details.models.ui.OrderDetailsProductClickHandler;
import au.com.woolworths.feature.shop.myorders.generated.callback.OnClickListener;
import com.google.android.material.card.MaterialCardView;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class EpoxyItemOrderDetailsProductBindingImpl extends EpoxyItemOrderDetailsProductBinding implements OnClickListener.Listener {
    public final MaterialCardView B;
    public final OnClickListener C;
    public long D;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemOrderDetailsProductBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 2, null, null);
        super(dataBindingComponent, view, (ImageView) objArrT[1]);
        this.D = -1L;
        MaterialCardView materialCardView = (MaterialCardView) objArrT[0];
        this.B = materialCardView;
        materialCardView.setTag(null);
        this.y.setTag(null);
        E(view);
        this.C = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (92 == i) {
            this.A = (OrderDetailsProductClickHandler) obj;
            synchronized (this) {
                this.D |= 1;
            }
            h(92);
            y();
            return true;
        }
        if (53 != i) {
            return false;
        }
        this.z = (OrderDetailsProductCardData) obj;
        synchronized (this) {
            this.D |= 2;
        }
        h(53);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.shop.myorders.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        OrderDetailsProductClickHandler orderDetailsProductClickHandler = this.A;
        OrderDetailsProductCardData orderDetailsProductCardData = this.z;
        if (orderDetailsProductClickHandler == null || orderDetailsProductCardData == null) {
            return;
        }
        orderDetailsProductClickHandler.R0(String.valueOf(orderDetailsProductCardData.d));
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String str;
        String str2;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        OrderDetailsProductCardData orderDetailsProductCardData = this.z;
        long j2 = 6 & j;
        if (j2 == 0 || orderDetailsProductCardData == null) {
            str = null;
            str2 = null;
        } else {
            str = orderDetailsProductCardData.e;
            str2 = orderDetailsProductCardData.f;
        }
        if (j2 != 0) {
            if (ViewDataBinding.s >= 4) {
                this.B.setContentDescription(str);
            }
            ImageView imageView = this.y;
            d.z(this.y, R.drawable.ic_product_image_unavailable, imageView, str2, AppCompatResources.b(R.drawable.ic_product_image_loading, imageView.getContext()));
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
