package au.com.woolworths.shop.lists.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.shop.lists.generated.callback.OnClickListener;
import au.com.woolworths.shop.lists.ui.pastshops.PastShopsClickListener;

/* loaded from: classes4.dex */
public class EpoxyItemPastShopsPaginationErrorStateBindingImpl extends EpoxyItemPastShopsPaginationErrorStateBinding implements OnClickListener.Listener {
    public final OnClickListener C;
    public long D;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemPastShopsPaginationErrorStateBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, null);
        super(view, (Button) objArrT[2], (TextView) objArrT[1], dataBindingComponent);
        this.D = -1L;
        this.y.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.z.setTag(null);
        E(view);
        this.C = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (73 == i) {
            this.A = (Text) obj;
            synchronized (this) {
                this.D |= 1;
            }
            h(73);
            y();
            return true;
        }
        if (35 != i) {
            return false;
        }
        this.B = (PastShopsClickListener) obj;
        synchronized (this) {
            this.D |= 2;
        }
        h(35);
        y();
        return true;
    }

    @Override // au.com.woolworths.shop.lists.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        PastShopsClickListener pastShopsClickListener = this.B;
        if (pastShopsClickListener != null) {
            pastShopsClickListener.g3();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        Text text = this.A;
        long j2 = 5 & j;
        CharSequence text2 = (j2 == 0 || text == null) ? null : text.getText(this.h.getContext());
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.y, text2);
        }
        if ((j & 4) != 0) {
            this.z.setOnClickListener(this.C);
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
