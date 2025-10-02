package au.com.woolworths.feature.rewards.offers.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.rewards.offers.spinsurprise.SpinSurpriseGameContract;
import au.com.woolworths.feature.rewards.offers.spinsurprise.SpinSurpriseGameViewModel;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class ActivitySpinSurpriseGameBindingImpl extends ActivitySpinSurpriseGameBinding {
    public static final SparseIntArray E;
    public final FrameLayout B;
    public final ProgressBar C;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.web_view, 2);
        sparseIntArray.put(R.id.toolbar, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivitySpinSurpriseGameBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, null, E);
        super(dataBindingComponent, view, (Toolbar) objArrT[3], (WebView) objArrT[2]);
        this.D = -1L;
        FrameLayout frameLayout = (FrameLayout) objArrT[0];
        this.B = frameLayout;
        frameLayout.setTag(null);
        ProgressBar progressBar = (ProgressBar) objArrT[1];
        this.C = progressBar;
        progressBar.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((SpinSurpriseGameViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.rewards.offers.databinding.ActivitySpinSurpriseGameBinding
    public final void L(SpinSurpriseGameViewModel spinSurpriseGameViewModel) throws Throwable {
        this.A = spinSurpriseGameViewModel;
        synchronized (this) {
            this.D |= 2;
        }
        h(273);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        SpinSurpriseGameViewModel spinSurpriseGameViewModel = this.A;
        long j2 = j & 7;
        boolean z = false;
        if (j2 != 0) {
            MutableLiveData mutableLiveData = spinSurpriseGameViewModel != null ? spinSurpriseGameViewModel.i : null;
            I(0, mutableLiveData);
            SpinSurpriseGameContract.ViewState viewState = mutableLiveData != null ? (SpinSurpriseGameContract.ViewState) mutableLiveData.e() : null;
            if (viewState != null) {
                z = viewState.f6400a;
            }
        }
        if (j2 != 0) {
            BindingAdaptersKt.o(this.C, z);
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
        if (i != 0) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.D |= 1;
        }
        return true;
    }
}
