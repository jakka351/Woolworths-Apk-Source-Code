package au.com.woolworths.feature.shop.more.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.feature.shop.more.MoreContract;
import au.com.woolworths.feature.shop.more.MoreViewModel;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class FragmentMoreBindingImpl extends FragmentMoreBinding {
    public static final SparseIntArray D;
    public final FrameLayout B;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(R.id.loading_layout, 1);
        sparseIntArray.put(R.id.more_recycler_view, 2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentMoreBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, D);
        super(dataBindingComponent, view, (View) objArrT[1], (EpoxyRecyclerView) objArrT[2]);
        this.C = -1L;
        FrameLayout frameLayout = (FrameLayout) objArrT[0];
        this.B = frameLayout;
        frameLayout.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((MoreViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.more.databinding.FragmentMoreBinding
    public final void L(MoreViewModel moreViewModel) throws Throwable {
        this.A = moreViewModel;
        synchronized (this) {
            this.C |= 2;
        }
        h(273);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        MoreViewModel moreViewModel = this.A;
        long j2 = j & 7;
        int i = 0;
        if (j2 != 0) {
            MutableLiveData mutableLiveData = moreViewModel != null ? moreViewModel.u : null;
            I(0, mutableLiveData);
            MoreContract.ViewState viewState = mutableLiveData != null ? (MoreContract.ViewState) mutableLiveData.e() : null;
            boolean z = viewState != null ? viewState.f7581a : false;
            if (j2 != 0) {
                j |= z ? 16L : 8L;
            }
            if (!z) {
                i = 8;
            }
        }
        if ((j & 7) != 0) {
            this.y.setVisibility(i);
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
        if (i != 0) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 1;
        }
        return true;
    }
}
