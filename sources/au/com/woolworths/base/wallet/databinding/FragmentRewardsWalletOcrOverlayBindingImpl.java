package au.com.woolworths.base.wallet.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.base.wallet.generated.callback.OnClickListener;
import au.com.woolworths.base.wallet.ocr.OverlayClickHandler;
import com.google.android.material.appbar.MaterialToolbar;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class FragmentRewardsWalletOcrOverlayBindingImpl extends FragmentRewardsWalletOcrOverlayBinding implements OnClickListener.Listener {
    public static final SparseIntArray G;
    public final OnClickListener E;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(R.id.bg_top, 2);
        sparseIntArray.put(R.id.bg_bottom, 3);
        sparseIntArray.put(R.id.appbar, 4);
        sparseIntArray.put(R.id.toolbar, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentRewardsWalletOcrOverlayBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 6, null, G);
        super(dataBindingComponent, view, (View) objArrT[3], (View) objArrT[2], (Button) objArrT[1], (MaterialToolbar) objArrT[5]);
        this.F = -1L;
        this.A.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        E(view);
        this.E = new OnClickListener(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (35 != i) {
            return false;
        }
        L((OverlayClickHandler) obj);
        return true;
    }

    @Override // au.com.woolworths.base.wallet.databinding.FragmentRewardsWalletOcrOverlayBinding
    public final void L(OverlayClickHandler overlayClickHandler) throws Throwable {
        this.C = overlayClickHandler;
        synchronized (this) {
            this.F |= 1;
        }
        h(35);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.F;
            this.F = 0L;
        }
        if ((j & 2) != 0) {
            this.A.setOnClickListener(this.E);
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
            this.F = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
