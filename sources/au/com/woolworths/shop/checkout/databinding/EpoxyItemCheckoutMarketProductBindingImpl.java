package au.com.woolworths.shop.checkout.databinding;

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
import au.com.woolworths.shop.checkout.domain.model.MarketProductRow;
import au.com.woolworths.shop.checkout.generated.callback.OnClickListener;
import au.com.woolworths.shop.checkout.ui.product.CheckoutProductListener;
import com.google.apphosting.datastore.testing.DatastoreTestTrace;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class EpoxyItemCheckoutMarketProductBindingImpl extends EpoxyItemCheckoutMarketProductBinding implements OnClickListener.Listener {
    public final OnClickListener I;
    public long J;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemCheckoutMarketProductBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 7, null, null);
        super(dataBindingComponent, view, (ImageButton) objArrT[4], (ImageView) objArrT[1], (TextView) objArrT[2], (TextView) objArrT[6], (TextView) objArrT[5], (TextView) objArrT[3]);
        this.J = -1L;
        this.y.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        E(view);
        this.I = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (60 == i) {
            this.G = (String) obj;
            synchronized (this) {
                this.J |= 1;
            }
            h(60);
            y();
            return true;
        }
        if (226 == i) {
            this.F = (String) obj;
            synchronized (this) {
                this.J |= 2;
            }
            h(226);
            y();
            return true;
        }
        if (202 == i) {
            this.E = (MarketProductRow) obj;
            synchronized (this) {
                this.J |= 4;
            }
            h(DatastoreTestTrace.FirestoreV1Action.DATABASE_CONTENTS_BEFORE_ACTION_FIELD_NUMBER);
            y();
            return true;
        }
        if (157 != i) {
            return false;
        }
        this.H = (CheckoutProductListener) obj;
        synchronized (this) {
            this.J |= 8;
        }
        h(157);
        y();
        return true;
    }

    @Override // au.com.woolworths.shop.checkout.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        MarketProductRow marketProductRow = this.E;
        String str = this.G;
        CheckoutProductListener checkoutProductListener = this.H;
        String str2 = this.F;
        if (checkoutProductListener != null) {
            checkoutProductListener.u4(marketProductRow, str2, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        synchronized (this) {
            j = this.J;
            this.J = 0L;
        }
        MarketProductRow marketProductRow = this.E;
        long j2 = 20 & j;
        if (j2 == 0 || marketProductRow == null) {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
        } else {
            str = marketProductRow.f10620a;
            str3 = marketProductRow.e;
            str4 = marketProductRow.g;
            str5 = marketProductRow.f;
            str2 = marketProductRow.d;
        }
        if ((j & 16) != 0) {
            this.y.setOnClickListener(this.I);
        }
        if (j2 != 0) {
            ImageView imageView = this.z;
            d.z(this.z, R.drawable.ic_product_image_unavailable, imageView, str4, AppCompatResources.b(R.drawable.ic_product_image_loading, imageView.getContext()));
            TextViewBindingAdapter.b(this.A, str);
            TextViewBindingAdapter.b(this.B, str3);
            TextViewBindingAdapter.b(this.C, str5);
            TextViewBindingAdapter.b(this.D, str2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.J != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.J = 16L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
