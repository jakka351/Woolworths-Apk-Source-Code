package au.com.woolworths.feature.shop.ask.olive.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.shop.ask.olive.ui.AskOliveContract;
import au.com.woolworths.feature.shop.ask.olive.ui.AskOliveErrorState;
import au.com.woolworths.feature.shop.ask.olive.ui.AskOliveViewModel;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class ActivityChatWithOliveBindingImpl extends ActivityChatWithOliveBinding {
    public static final ViewDataBinding.IncludedLayouts E;
    public static final SparseIntArray F;
    public final ContentLoadingProgressBar C;
    public long D;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(6);
        E = includedLayouts;
        includedLayouts.a(0, new int[]{3}, new int[]{R.layout.include_generic_error_state}, new String[]{"include_generic_error_state"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(R.id.appbar_layout, 4);
        sparseIntArray.put(R.id.toolbar, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityChatWithOliveBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 6, E, F);
        super(dataBindingComponent, view, (IncludeGenericErrorStateBinding) objArrT[3], (Toolbar) objArrT[5], (WebView) objArrT[1]);
        this.D = -1L;
        IncludeGenericErrorStateBinding includeGenericErrorStateBinding = this.y;
        if (includeGenericErrorStateBinding != null) {
            includeGenericErrorStateBinding.n = this;
        }
        ((ConstraintLayout) objArrT[0]).setTag(null);
        ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) objArrT[2];
        this.C = contentLoadingProgressBar;
        contentLoadingProgressBar.setTag(null);
        this.A.setTag(null);
        E(view);
        r();
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
        L((AskOliveViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.ask.olive.databinding.ActivityChatWithOliveBinding
    public final void L(AskOliveViewModel askOliveViewModel) throws Throwable {
        this.B = askOliveViewModel;
        synchronized (this) {
            this.D |= 4;
        }
        h(273);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        boolean z;
        boolean z2;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        AskOliveViewModel askOliveViewModel = this.B;
        long j2 = 13 & j;
        AskOliveErrorState askOliveErrorState = null;
        if (j2 != 0) {
            MutableLiveData mutableLiveData = askOliveViewModel != null ? askOliveViewModel.p : null;
            I(0, mutableLiveData);
            AskOliveContract.ViewState viewState = mutableLiveData != null ? (AskOliveContract.ViewState) mutableLiveData.e() : null;
            if (viewState != null) {
                askOliveErrorState = viewState.c;
                z = viewState.b;
            } else {
                z = false;
            }
            z = askOliveErrorState != null;
            z2 = !z;
        } else {
            z = false;
            z2 = false;
        }
        if ((j & 12) != 0) {
            this.y.L(askOliveViewModel);
        }
        if (j2 != 0) {
            this.y.M(askOliveErrorState);
            BindingAdaptersKt.o(this.y.h, z);
            BindingAdaptersKt.o(this.C, z);
            BindingAdaptersKt.o(this.A, z2);
        }
        this.y.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.D != 0) {
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
            this.D = 8L;
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
                this.D |= 1;
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
            this.D |= 2;
        }
        return true;
    }
}
