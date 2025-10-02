package au.com.woolworths.feature.shop.weblink.databinding;

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
import au.com.woolworths.feature.shop.weblink.WebLinkContract;
import au.com.woolworths.feature.shop.weblink.WebLinkErrorState;
import au.com.woolworths.feature.shop.weblink.WebLinkViewModel;
import au.com.woolworths.feature.shop.weblink.model.WebLink;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class ActivityWebLinkBindingImpl extends ActivityWebLinkBinding {
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
        sparseIntArray.put(R.id.web_view, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityWebLinkBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 6, E, F);
        super(dataBindingComponent, view, (IncludeGenericErrorStateBinding) objArrT[3], (Toolbar) objArrT[1], (WebView) objArrT[5]);
        this.D = -1L;
        IncludeGenericErrorStateBinding includeGenericErrorStateBinding = this.y;
        if (includeGenericErrorStateBinding != null) {
            includeGenericErrorStateBinding.n = this;
        }
        ((ConstraintLayout) objArrT[0]).setTag(null);
        ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) objArrT[2];
        this.C = contentLoadingProgressBar;
        contentLoadingProgressBar.setTag(null);
        this.z.setTag(null);
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
        L((WebLinkViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.weblink.databinding.ActivityWebLinkBinding
    public final void L(WebLinkViewModel webLinkViewModel) throws Throwable {
        this.B = webLinkViewModel;
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
        String str;
        WebLink webLink;
        WebLinkErrorState webLinkErrorState;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        WebLinkViewModel webLinkViewModel = this.B;
        long j2 = 13 & j;
        WebLinkErrorState webLinkErrorState2 = null;
        if (j2 != 0) {
            MutableLiveData mutableLiveData = webLinkViewModel != null ? webLinkViewModel.h : null;
            I(0, mutableLiveData);
            WebLinkContract.ViewState viewState = mutableLiveData != null ? (WebLinkContract.ViewState) mutableLiveData.e() : null;
            if (viewState != null) {
                webLinkErrorState = viewState.c;
                z = viewState.b;
                webLink = viewState.f8255a;
            } else {
                z = false;
                webLink = null;
                webLinkErrorState = null;
            }
            z = webLinkErrorState != null;
            str = webLink != null ? webLink.f8260a : null;
            webLinkErrorState2 = webLinkErrorState;
        } else {
            z = false;
            str = null;
        }
        if ((j & 12) != 0) {
            this.y.L(webLinkViewModel);
        }
        if (j2 != 0) {
            this.y.M(webLinkErrorState2);
            BindingAdaptersKt.o(this.y.h, z);
            BindingAdaptersKt.o(this.C, z);
            this.z.setTitle(str);
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
