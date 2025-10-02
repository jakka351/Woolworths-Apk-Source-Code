package au.com.woolworths.shop.addtolist.databinding;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.shop.addtolist.add.ListItemClickListener;
import au.com.woolworths.shop.addtolist.generated.callback.OnClickListener;
import au.com.woolworths.shop.lists.data.model.ShoppingList;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* loaded from: classes4.dex */
public class EpoxyItemAddToListBindingImpl extends EpoxyItemAddToListBinding implements OnClickListener.Listener {
    public final ConstraintLayout F;
    public final OnClickListener G;
    public long H;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemAddToListBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, null, null);
        super(view, (ProgressBar) objArrT[3], (TextView) objArrT[2], (TextView) objArrT[1], dataBindingComponent);
        this.H = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.F = constraintLayout;
        constraintLayout.setTag(null);
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        E(view);
        this.G = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (140 == i) {
            this.E = (Boolean) obj;
            synchronized (this) {
                this.H |= 1;
            }
            h(140);
            y();
            return true;
        }
        if (146 == i) {
            this.D = (ListItemClickListener) obj;
            synchronized (this) {
                this.H |= 2;
            }
            h(146);
            y();
            return true;
        }
        if (229 == i) {
            this.C = (ShoppingList) obj;
            synchronized (this) {
                this.H |= 4;
            }
            h(229);
            y();
            return true;
        }
        if (155 != i) {
            return false;
        }
        this.B = ((Integer) obj).intValue();
        synchronized (this) {
            this.H |= 8;
        }
        h(ModuleDescriptor.MODULE_VERSION);
        y();
        return true;
    }

    @Override // au.com.woolworths.shop.addtolist.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        ListItemClickListener listItemClickListener = this.D;
        ShoppingList shoppingList = this.C;
        int i2 = this.B;
        if (listItemClickListener != null) {
            listItemClickListener.V1(shoppingList, i2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.H;
            this.H = 0L;
        }
        Boolean bool = this.E;
        ShoppingList shoppingList = this.C;
        long j2 = 17 & j;
        boolean zB = j2 != 0 ? ViewDataBinding.B(bool) : false;
        long j3 = 20 & j;
        String title = (j3 == 0 || shoppingList == null) ? null : shoppingList.getTitle();
        if ((j & 16) != 0) {
            this.F.setOnClickListener(this.G);
        }
        if (j2 != 0) {
            BindingAdaptersKt.o(this.y, zB);
            BindingAdaptersKt.j(this.z, zB);
        }
        if (j3 != 0) {
            TextViewBindingAdapter.b(this.A, title);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.H != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.H = 16L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
