package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesFullfilmentStatusItem;
import au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesContract;
import au.com.woolworths.feature.shop.myorders.generated.callback.OnClickListener;

/* loaded from: classes3.dex */
public class EpoxyItemYourGroceriesFullfilmentStatusTitleBindingImpl extends EpoxyItemYourGroceriesFullfilmentStatusTitleBinding implements OnClickListener.Listener {
    public final TextView B;
    public final OnClickListener C;
    public long D;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemYourGroceriesFullfilmentStatusTitleBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, null);
        super(dataBindingComponent, view, (ImageButton) objArrT[2]);
        this.D = -1L;
        this.y.setTag(null);
        ((LinearLayout) objArrT[0]).setTag(null);
        TextView textView = (TextView) objArrT[1];
        this.B = textView;
        textView.setTag(null);
        E(view);
        this.C = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (145 == i) {
            this.z = (YourGroceriesFullfilmentStatusItem) obj;
            synchronized (this) {
                this.D |= 1;
            }
            h(145);
            y();
            return true;
        }
        if (35 != i) {
            return false;
        }
        this.A = (YourGroceriesContract.YourGroceriesClickHandler) obj;
        synchronized (this) {
            this.D |= 2;
        }
        h(35);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.shop.myorders.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        YourGroceriesFullfilmentStatusItem yourGroceriesFullfilmentStatusItem = this.z;
        YourGroceriesContract.YourGroceriesClickHandler yourGroceriesClickHandler = this.A;
        if (yourGroceriesClickHandler != null) {
            yourGroceriesClickHandler.y3(yourGroceriesFullfilmentStatusItem);
        }
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
        YourGroceriesFullfilmentStatusItem yourGroceriesFullfilmentStatusItem = this.z;
        long j2 = 5 & j;
        if (j2 == 0 || yourGroceriesFullfilmentStatusItem == null) {
            str = null;
            str2 = null;
        } else {
            str = yourGroceriesFullfilmentStatusItem.f7705a;
            str2 = yourGroceriesFullfilmentStatusItem.b;
        }
        if ((j & 4) != 0) {
            this.y.setOnClickListener(this.C);
        }
        if (j2 != 0) {
            BindingAdaptersKt.n(this.y, str);
            TextViewBindingAdapter.b(this.B, str);
            if (ViewDataBinding.s >= 4) {
                this.y.setContentDescription(str2);
            }
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
