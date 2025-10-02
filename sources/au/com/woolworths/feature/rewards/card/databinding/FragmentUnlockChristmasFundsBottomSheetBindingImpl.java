package au.com.woolworths.feature.rewards.card.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeDownloadableAssetBinding;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.feature.rewards.card.generated.callback.OnClickListener;
import au.com.woolworths.feature.rewards.card.generated.callback.OnUnlockListener;
import au.com.woolworths.feature.rewards.card.unlock.UnlockChristmasFundsContract;
import au.com.woolworths.feature.rewards.card.unlock.UnlockChristmasFundsViewModel;
import au.com.woolworths.views.unlockslider.UnlockSlider;
import com.woolworths.R;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* loaded from: classes3.dex */
public class FragmentUnlockChristmasFundsBottomSheetBindingImpl extends FragmentUnlockChristmasFundsBottomSheetBinding implements OnUnlockListener.Listener, OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts Q;
    public static final SparseIntArray R;
    public final ProgressBar K;
    public final OnUnlockListener L;
    public final OnClickListener M;
    public final OnClickListener N;
    public final OnClickListener O;
    public long P;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(14);
        Q = includedLayouts;
        includedLayouts.a(0, new int[]{10}, new int[]{R.layout.include_downloadable_asset}, new String[]{"include_downloadable_asset"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(R.id.grab_handle_image_view, 11);
        sparseIntArray.put(R.id.asset_barrier, 12);
        sparseIntArray.put(R.id.snackbar_anchor, 13);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentUnlockChristmasFundsBottomSheetBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 14, Q, R);
        Button button = (Button) objArrT[8];
        Button button2 = (Button) objArrT[9];
        IncludeDownloadableAssetBinding includeDownloadableAssetBinding = (IncludeDownloadableAssetBinding) objArrT[10];
        super(dataBindingComponent, view, button, button2, includeDownloadableAssetBinding, (TextView) objArrT[2], (Space) objArrT[13], (TextView) objArrT[3], (Button) objArrT[6], (FrameLayout) objArrT[4], (UnlockSlider) objArrT[5], (ImageView) objArrT[1]);
        this.P = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        IncludeDownloadableAssetBinding includeDownloadableAssetBinding2 = this.A;
        if (includeDownloadableAssetBinding2 != null) {
            includeDownloadableAssetBinding2.n = this;
        }
        this.B.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        ProgressBar progressBar = (ProgressBar) objArrT[7];
        this.K = progressBar;
        progressBar.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        E(view);
        this.L = new OnUnlockListener(this);
        this.M = new OnClickListener(this, 4);
        this.N = new OnClickListener(this, 3);
        this.O = new OnClickListener(this, 2);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.A.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((UnlockChristmasFundsViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.rewards.card.databinding.FragmentUnlockChristmasFundsBottomSheetBinding
    public final void L(UnlockChristmasFundsViewModel unlockChristmasFundsViewModel) throws Throwable {
        this.I = unlockChristmasFundsViewModel;
        synchronized (this) {
            this.P |= 4;
        }
        h(273);
        y();
    }

    @Override // au.com.woolworths.feature.rewards.card.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        MutableLiveData mutableLiveData;
        UnlockChristmasFundsContract.ViewState viewState;
        ContentCta callToAction;
        String url;
        UnlockChristmasFundsViewModel unlockChristmasFundsViewModel;
        if (i == 2) {
            UnlockChristmasFundsViewModel unlockChristmasFundsViewModel2 = this.I;
            if (unlockChristmasFundsViewModel2 != null) {
                unlockChristmasFundsViewModel2.p6();
                return;
            }
            return;
        }
        UnlockChristmasFundsContract.Actions.Dismiss dismiss = UnlockChristmasFundsContract.Actions.Dismiss.f5836a;
        if (i != 3) {
            if (i == 4 && (unlockChristmasFundsViewModel = this.I) != null) {
                unlockChristmasFundsViewModel.h.f(dismiss);
                return;
            }
            return;
        }
        UnlockChristmasFundsViewModel unlockChristmasFundsViewModel3 = this.I;
        if (unlockChristmasFundsViewModel3 == null || (mutableLiveData = unlockChristmasFundsViewModel3.i) == null || (viewState = (UnlockChristmasFundsContract.ViewState) mutableLiveData.e()) == null || (callToAction = viewState.c.getCallToAction()) == null || (url = callToAction.getUrl()) == null) {
            return;
        }
        SharedFlowImpl sharedFlowImpl = unlockChristmasFundsViewModel3.h;
        sharedFlowImpl.f(new UnlockChristmasFundsContract.Actions.OpenUrl(url));
        sharedFlowImpl.f(dismiss);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017e  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.card.databinding.FragmentUnlockChristmasFundsBottomSheetBindingImpl.j():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.P != 0) {
                    return true;
                }
                return this.A.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.P = 8L;
        }
        this.A.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.P |= 1;
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.P |= 2;
        }
        return true;
    }
}
