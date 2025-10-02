package au.com.woolworths.product.details.databinding;

import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.product.details.ProductDetailsClickHandler;
import au.com.woolworths.product.details.generated.callback.OnClickListener;
import au.com.woolworths.product.details.models.HealthierHorizontalListData;
import au.com.woolworths.product.details.models.HealthierLinkedInfo;

/* loaded from: classes4.dex */
public class EpoxyItemHealthierListHeaderBindingImpl extends EpoxyItemHealthierListHeaderBinding implements OnClickListener.Listener {
    public final OnClickListener D;
    public long E;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemHealthierListHeaderBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, null, null);
        super(dataBindingComponent, view, (Button) objArrT[3], (TextView) objArrT[2], (TextView) objArrT[1]);
        this.E = -1L;
        this.y.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        E(view);
        this.D = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (35 == i) {
            this.C = (ProductDetailsClickHandler) obj;
            synchronized (this) {
                this.E |= 1;
            }
            h(35);
            y();
            return true;
        }
        if (53 != i) {
            return false;
        }
        this.B = (HealthierHorizontalListData) obj;
        synchronized (this) {
            this.E |= 2;
        }
        h(53);
        y();
        return true;
    }

    @Override // au.com.woolworths.product.details.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        ProductDetailsClickHandler productDetailsClickHandler = this.C;
        HealthierHorizontalListData healthierHorizontalListData = this.B;
        if (productDetailsClickHandler != null) {
            productDetailsClickHandler.v0(healthierHorizontalListData);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        boolean z;
        String subtitle;
        String title;
        HealthierLinkedInfo linkedInfo;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        HealthierHorizontalListData healthierHorizontalListData = this.B;
        long j2 = 6 & j;
        if (j2 != 0) {
            if (healthierHorizontalListData != null) {
                title = healthierHorizontalListData.getTitle();
                linkedInfo = healthierHorizontalListData.getLinkedInfo();
                subtitle = healthierHorizontalListData.getSubtitle();
            } else {
                subtitle = null;
                title = null;
                linkedInfo = null;
            }
            z = linkedInfo != null;
            boolean zIsEmpty = TextUtils.isEmpty(subtitle);
            buttonLabel = linkedInfo != null ? linkedInfo.getButtonLabel() : null;
            z = !zIsEmpty;
        } else {
            z = false;
            subtitle = null;
            title = null;
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.y, buttonLabel);
            BindingAdaptersKt.o(this.y, z);
            TextViewBindingAdapter.b(this.z, subtitle);
            BindingAdaptersKt.o(this.z, z);
            TextViewBindingAdapter.b(this.A, title);
        }
        if ((j & 4) != 0) {
            this.y.setOnClickListener(this.D);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.E != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.E = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
