package au.com.woolworths.shop.addtolist.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.addtolist.edit.ListsAddListener;
import au.com.woolworths.shop.addtolist.generated.callback.OnClickListener;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class EpoxyItemListsAddBindingImpl extends EpoxyItemListsAddBinding implements OnClickListener.Listener {
    public static final SparseIntArray C;
    public final OnClickListener A;
    public long B;
    public final ConstraintLayout z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.list_icon_image, 1);
        sparseIntArray.put(R.id.text_view_title, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpoxyItemListsAddBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        super(dataBindingComponent, view, 0);
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, C);
        this.B = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.z = constraintLayout;
        constraintLayout.setTag(null);
        E(view);
        this.A = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (157 != i) {
            return false;
        }
        L((ListsAddListener) obj);
        return true;
    }

    @Override // au.com.woolworths.shop.addtolist.databinding.EpoxyItemListsAddBinding
    public final void L(ListsAddListener listsAddListener) throws Throwable {
        this.y = listsAddListener;
        synchronized (this) {
            this.B |= 1;
        }
        h(157);
        y();
    }

    @Override // au.com.woolworths.shop.addtolist.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        ListsAddListener listsAddListener = this.y;
        if (listsAddListener != null) {
            listsAddListener.H2();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        if ((j & 2) != 0) {
            this.z.setOnClickListener(this.A);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.B != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.B = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
