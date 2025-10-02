package au.com.woolworths.shop.checkout.databinding;

import android.view.View;
import android.widget.CheckedTextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.shop.checkout.domain.model.CollectionMethodOption;
import au.com.woolworths.shop.checkout.generated.callback.OnClickListener;
import au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsListener;

/* loaded from: classes4.dex */
public class EpoxyItemCheckoutCollectionMethodOptionBindingImpl extends EpoxyItemCheckoutCollectionMethodOptionBinding implements OnClickListener.Listener {
    public final CheckedTextView A;
    public final OnClickListener B;
    public long C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpoxyItemCheckoutCollectionMethodOptionBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        super(dataBindingComponent, view, 0);
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 1, null, null);
        this.C = -1L;
        CheckedTextView checkedTextView = (CheckedTextView) objArrT[0];
        this.A = checkedTextView;
        checkedTextView.setTag(null);
        E(view);
        this.B = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (157 == i) {
            this.z = (CheckoutDetailsListener) obj;
            synchronized (this) {
                this.C |= 1;
            }
            h(157);
            y();
            return true;
        }
        if (39 != i) {
            return false;
        }
        this.y = (CollectionMethodOption) obj;
        synchronized (this) {
            this.C |= 2;
        }
        h(39);
        y();
        return true;
    }

    @Override // au.com.woolworths.shop.checkout.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        CheckoutDetailsListener checkoutDetailsListener = this.z;
        CollectionMethodOption collectionMethodOption = this.y;
        if (checkoutDetailsListener != null) {
            checkoutDetailsListener.f4(collectionMethodOption);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        boolean z;
        String str;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        CollectionMethodOption collectionMethodOption = this.y;
        long j2 = 6 & j;
        if (j2 == 0 || collectionMethodOption == null) {
            z = false;
            str = null;
        } else {
            z = collectionMethodOption.c;
            str = collectionMethodOption.f10594a;
        }
        if (j2 != 0) {
            this.A.setChecked(z);
            TextViewBindingAdapter.b(this.A, str);
        }
        if ((j & 4) != 0) {
            this.A.setOnClickListener(this.B);
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
            this.C = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
