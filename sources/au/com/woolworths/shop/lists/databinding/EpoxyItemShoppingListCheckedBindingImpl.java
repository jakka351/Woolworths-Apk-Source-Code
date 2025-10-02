package au.com.woolworths.shop.lists.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.shop.lists.generated.callback.OnClickListener;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListItemListener;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class EpoxyItemShoppingListCheckedBindingImpl extends EpoxyItemShoppingListCheckedBinding implements OnClickListener.Listener {
    public final ConstraintLayout D;
    public final OnClickListener E;
    public long F;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemShoppingListCheckedBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, null);
        super(view, (ImageView) objArrT[2], (TextView) objArrT[1], dataBindingComponent);
        this.F = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.D = constraintLayout;
        constraintLayout.setTag(null);
        E(view);
        this.E = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (49 == i) {
            this.A = ((Integer) obj).intValue();
            synchronized (this) {
                this.F |= 1;
            }
            h(49);
            y();
            return true;
        }
        if (238 == i) {
            this.B = ((Boolean) obj).booleanValue();
            synchronized (this) {
                this.F |= 2;
            }
            h(238);
            y();
            return true;
        }
        if (157 != i) {
            return false;
        }
        this.C = (ShoppingListItemListener) obj;
        synchronized (this) {
            this.F |= 4;
        }
        h(157);
        y();
        return true;
    }

    @Override // au.com.woolworths.shop.lists.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        ShoppingListItemListener shoppingListItemListener = this.C;
        if (shoppingListItemListener != null) {
            shoppingListItemListener.f();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String string;
        String string2;
        synchronized (this) {
            j = this.F;
            this.F = 0L;
        }
        int i = this.A;
        boolean z = this.B;
        int i2 = 0;
        if ((j & 11) != 0) {
            if ((j & 10) != 0) {
                j |= z ? 32L : 16L;
            }
            if ((j & 11) != 0) {
                j = z ? j | 128 : j | 64;
            }
            if ((j & 10) != 0 && !z) {
                i2 = SubsamplingScaleImageView.ORIENTATION_180;
            }
        }
        if ((j & 192) != 0) {
            string2 = (128 & j) != 0 ? this.y.getResources().getString(R.string.shop_lists_hide_checked_header, Integer.valueOf(i)) : null;
            string = (64 & j) != 0 ? this.y.getResources().getString(R.string.shop_lists_show_checked_header, Integer.valueOf(i)) : null;
        } else {
            string = null;
            string2 = null;
        }
        long j2 = 11 & j;
        String str = j2 != 0 ? z ? string2 : string : null;
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.y, str);
        }
        if ((j & 10) != 0 && ViewDataBinding.s >= 11) {
            this.z.setRotation(i2);
        }
        if ((j & 8) != 0) {
            this.D.setOnClickListener(this.E);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.F != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.F = 8L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
