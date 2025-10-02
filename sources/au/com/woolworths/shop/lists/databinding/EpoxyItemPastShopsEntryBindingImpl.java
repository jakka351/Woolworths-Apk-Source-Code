package au.com.woolworths.shop.lists.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.shop.lists.data.model.PurchaseHistoryEvent;
import au.com.woolworths.shop.lists.generated.callback.OnClickListener;
import au.com.woolworths.shop.lists.ui.pastshops.PastShopsClickListener;

/* loaded from: classes4.dex */
public class EpoxyItemPastShopsEntryBindingImpl extends EpoxyItemPastShopsEntryBinding implements OnClickListener.Listener {
    public final ConstraintLayout B;
    public final OnClickListener C;
    public long D;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemPastShopsEntryBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 2, null, null);
        super(dataBindingComponent, view, (TextView) objArrT[1]);
        this.D = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.B = constraintLayout;
        constraintLayout.setTag(null);
        this.y.setTag(null);
        E(view);
        this.C = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (157 == i) {
            this.A = (PastShopsClickListener) obj;
            synchronized (this) {
                this.D |= 1;
            }
            h(157);
            y();
            return true;
        }
        if (53 != i) {
            return false;
        }
        this.z = (PurchaseHistoryEvent) obj;
        synchronized (this) {
            this.D |= 2;
        }
        h(53);
        y();
        return true;
    }

    @Override // au.com.woolworths.shop.lists.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        PastShopsClickListener pastShopsClickListener = this.A;
        PurchaseHistoryEvent purchaseHistoryEvent = this.z;
        if (pastShopsClickListener != null) {
            pastShopsClickListener.a4(purchaseHistoryEvent);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        PurchaseHistoryEvent purchaseHistoryEvent = this.z;
        long j2 = 6 & j;
        String title = (j2 == 0 || purchaseHistoryEvent == null) ? null : purchaseHistoryEvent.getTitle();
        if ((j & 4) != 0) {
            this.B.setOnClickListener(this.C);
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.y, title);
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
