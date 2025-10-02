package au.com.woolworths.shop.lists.databinding;

import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.lists.generated.callback.OnClickListener;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListItemListener;

/* loaded from: classes4.dex */
public class EpoxyItemShoppingListCheckedMenuBindingImpl extends EpoxyItemShoppingListCheckedMenuBinding implements OnClickListener.Listener {
    public final OnClickListener B;
    public final OnClickListener C;
    public long D;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemShoppingListCheckedMenuBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, null);
        super(dataBindingComponent, view, (Button) objArrT[2], (Button) objArrT[1]);
        this.D = -1L;
        this.y.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.z.setTag(null);
        E(view);
        this.B = new OnClickListener(this, 1);
        this.C = new OnClickListener(this, 2);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (157 != i) {
            return false;
        }
        this.A = (ShoppingListItemListener) obj;
        synchronized (this) {
            this.D |= 1;
        }
        h(157);
        y();
        return true;
    }

    @Override // au.com.woolworths.shop.lists.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        ShoppingListItemListener shoppingListItemListener;
        if (i != 1) {
            if (i == 2 && (shoppingListItemListener = this.A) != null) {
                shoppingListItemListener.y();
                return;
            }
            return;
        }
        ShoppingListItemListener shoppingListItemListener2 = this.A;
        if (shoppingListItemListener2 != null) {
            shoppingListItemListener2.o();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        if ((j & 2) != 0) {
            this.y.setOnClickListener(this.C);
            this.z.setOnClickListener(this.B);
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
            this.D = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
