package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.utils.Extensions;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesProductItem;
import au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesContract;
import au.com.woolworths.feature.shop.myorders.generated.callback.OnClickListener;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class EpoxyItemOrderProductListFeedItemBindingImpl extends EpoxyItemOrderProductListFeedItemBinding implements OnClickListener.Listener {
    public final ConstraintLayout G;
    public final OnClickListener H;
    public long I;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemOrderProductListFeedItemBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 6, null, null);
        super(view, (ImageView) objArrT[1], (TextView) objArrT[5], (TextView) objArrT[3], (TextView) objArrT[4], (TextView) objArrT[2], dataBindingComponent);
        this.I = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.G = constraintLayout;
        constraintLayout.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        E(view);
        this.H = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (262 == i) {
            this.E = ((Integer) obj).intValue();
            synchronized (this) {
                this.I |= 1;
            }
            h(262);
            y();
            return true;
        }
        if (145 == i) {
            this.D = (YourGroceriesProductItem) obj;
            synchronized (this) {
                this.I |= 2;
            }
            h(145);
            y();
            return true;
        }
        if (35 != i) {
            return false;
        }
        this.F = (YourGroceriesContract.YourGroceriesClickHandler) obj;
        synchronized (this) {
            this.I |= 4;
        }
        h(35);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.shop.myorders.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        YourGroceriesProductItem yourGroceriesProductItem = this.D;
        YourGroceriesContract.YourGroceriesClickHandler yourGroceriesClickHandler = this.F;
        if (yourGroceriesClickHandler != null) {
            yourGroceriesClickHandler.X0(yourGroceriesProductItem);
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
            j = this.I;
            this.I = 0L;
        }
        int i = this.E;
        YourGroceriesProductItem yourGroceriesProductItem = this.D;
        long j2 = 9 & j;
        int iA = j2 != 0 ? Extensions.a(i, this.h.getContext()) : 0;
        long j3 = 10 & j;
        if (j3 == 0 || yourGroceriesProductItem == null) {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
        } else {
            str = yourGroceriesProductItem.e;
            str3 = yourGroceriesProductItem.f;
            str4 = yourGroceriesProductItem.b;
            str5 = yourGroceriesProductItem.d;
            str2 = yourGroceriesProductItem.c;
        }
        if (j3 != 0) {
            TextViewBindingAdapter.b(this.y, str3);
            ImageView imageView = this.z;
            d.z(this.z, R.drawable.ic_product_image_unavailable, imageView, str2, AppCompatResources.b(R.drawable.ic_product_image_loading, imageView.getContext()));
            TextViewBindingAdapter.b(this.A, str5);
            TextViewBindingAdapter.b(this.B, str);
            TextViewBindingAdapter.b(this.C, str4);
        }
        if (j2 != 0) {
            this.y.setTextColor(iA);
        }
        if ((j & 8) != 0) {
            this.G.setOnClickListener(this.H);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.I != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.I = 8L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
