package au.com.woolworths.android.onesite.legacy.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.legacy.generated.callback.OnClickListener;
import au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.PreviouslyUsedAddressItemEventHandler;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class ItemPreviouslyUsedAddressBindingImpl extends ItemPreviouslyUsedAddressBinding implements OnClickListener.Listener {
    public static final SparseIntArray H;
    public final OnClickListener E;
    public final OnClickListener F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.address_text_view, 2);
        sparseIntArray.put(R.id.item_progress_bar, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ItemPreviouslyUsedAddressBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, null, H);
        super(dataBindingComponent, view, (TextView) objArrT[2], (ProgressBar) objArrT[3], (Button) objArrT[1], (ConstraintLayout) objArrT[0]);
        this.G = -1L;
        this.A.setTag(null);
        this.B.setTag(null);
        E(view);
        this.E = new OnClickListener(this, 1);
        this.F = new OnClickListener(this, 2);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (78 != i) {
            return false;
        }
        L((PreviouslyUsedAddressItemEventHandler) obj);
        return true;
    }

    @Override // au.com.woolworths.android.onesite.legacy.databinding.ItemPreviouslyUsedAddressBinding
    public final void L(PreviouslyUsedAddressItemEventHandler previouslyUsedAddressItemEventHandler) throws Throwable {
        this.C = previouslyUsedAddressItemEventHandler;
        synchronized (this) {
            this.G |= 1;
        }
        h(78);
        y();
    }

    @Override // au.com.woolworths.android.onesite.legacy.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        PreviouslyUsedAddressItemEventHandler previouslyUsedAddressItemEventHandler;
        if (i != 1) {
            if (i == 2 && (previouslyUsedAddressItemEventHandler = this.C) != null) {
                previouslyUsedAddressItemEventHandler.b();
                return;
            }
            return;
        }
        PreviouslyUsedAddressItemEventHandler previouslyUsedAddressItemEventHandler2 = this.C;
        if (previouslyUsedAddressItemEventHandler2 != null) {
            previouslyUsedAddressItemEventHandler2.a();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.G;
            this.G = 0L;
        }
        if ((j & 2) != 0) {
            this.A.setOnClickListener(this.F);
            this.B.setOnClickListener(this.E);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.G != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.G = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
