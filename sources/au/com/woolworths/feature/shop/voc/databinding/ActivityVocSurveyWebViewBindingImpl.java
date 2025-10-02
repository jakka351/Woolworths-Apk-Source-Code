package au.com.woolworths.feature.shop.voc.databinding;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBindingKtx;
import androidx.lifecycle.LifecycleOwner;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.shop.voc.webview.VocSurveyWebViewContract;
import au.com.woolworths.feature.shop.voc.webview.VocSurveyWebViewFullPageError;
import au.com.woolworths.feature.shop.voc.webview.VocSurveyWebViewViewModel;
import com.woolworths.R;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes3.dex */
public class ActivityVocSurveyWebViewBindingImpl extends ActivityVocSurveyWebViewBinding {
    public static final ViewDataBinding.IncludedLayouts F;
    public static final SparseIntArray G;
    public long E;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(7);
        F = includedLayouts;
        includedLayouts.a(0, new int[]{3}, new int[]{R.layout.include_generic_error_state}, new String[]{"include_generic_error_state"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(R.id.appbar_layout, 4);
        sparseIntArray.put(R.id.toolbar, 5);
        sparseIntArray.put(R.id.web_view, 6);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.y.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((VocSurveyWebViewViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.voc.databinding.ActivityVocSurveyWebViewBinding
    public final void L(VocSurveyWebViewViewModel vocSurveyWebViewViewModel) throws Throwable {
        this.D = vocSurveyWebViewViewModel;
        synchronized (this) {
            this.E |= 4;
        }
        h(273);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        boolean z;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        VocSurveyWebViewViewModel vocSurveyWebViewViewModel = this.D;
        long j2 = 13 & j;
        VocSurveyWebViewFullPageError vocSurveyWebViewFullPageError = null;
        boolean z2 = false;
        if (j2 != 0) {
            StateFlow stateFlow = vocSurveyWebViewViewModel != null ? vocSurveyWebViewViewModel.h : null;
            ViewDataBindingKtx.a(this, 0, stateFlow);
            VocSurveyWebViewContract.ViewState viewState = stateFlow != null ? (VocSurveyWebViewContract.ViewState) stateFlow.getValue() : null;
            if (viewState != null) {
                vocSurveyWebViewFullPageError = viewState.b;
                z = viewState.f8249a;
            } else {
                z = false;
            }
            if (vocSurveyWebViewFullPageError != null) {
                z2 = true;
            }
        } else {
            z = false;
        }
        if ((j & 12) != 0) {
            this.y.L(vocSurveyWebViewViewModel);
        }
        if (j2 != 0) {
            this.y.M(vocSurveyWebViewFullPageError);
            BindingAdaptersKt.o(this.y.h, z2);
            BindingAdaptersKt.o(this.z, z);
            BindingAdaptersKt.o(this.A, z);
        }
        this.y.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.E != 0) {
                    return true;
                }
                return this.y.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.E = 8L;
        }
        this.y.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.E |= 1;
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
            this.E |= 2;
        }
        return true;
    }
}
