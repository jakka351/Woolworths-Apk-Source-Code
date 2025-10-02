package au.com.woolworths.shop.lists.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MediatorLiveData;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.shop.lists.ui.lists.errors.SuggestedListsFullPageError;
import au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsContract;
import au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsViewModel;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class FragmentSuggestedListsBindingImpl extends FragmentSuggestedListsBinding {
    public static final ViewDataBinding.IncludedLayouts E;
    public static final SparseIntArray F;
    public final ContentLoadingProgressBar C;
    public long D;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(4);
        E = includedLayouts;
        includedLayouts.a(0, new int[]{2}, new int[]{R.layout.include_generic_error_state}, new String[]{"include_generic_error_state"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(R.id.recycler_view, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentSuggestedListsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, E, F);
        super(dataBindingComponent, view, (IncludeGenericErrorStateBinding) objArrT[2], (EpoxyRecyclerView) objArrT[3]);
        this.D = -1L;
        IncludeGenericErrorStateBinding includeGenericErrorStateBinding = this.y;
        if (includeGenericErrorStateBinding != null) {
            includeGenericErrorStateBinding.n = this;
        }
        ((ConstraintLayout) objArrT[0]).setTag(null);
        ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) objArrT[1];
        this.C = contentLoadingProgressBar;
        contentLoadingProgressBar.setTag(null);
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
        L((SuggestedListsViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.shop.lists.databinding.FragmentSuggestedListsBinding
    public final void L(SuggestedListsViewModel suggestedListsViewModel) throws Throwable {
        this.A = suggestedListsViewModel;
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
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        SuggestedListsViewModel suggestedListsViewModel = this.A;
        long j2 = 13 & j;
        SuggestedListsFullPageError suggestedListsFullPageError = null;
        boolean z2 = false;
        if (j2 != 0) {
            MediatorLiveData mediatorLiveData = suggestedListsViewModel != null ? suggestedListsViewModel.m : null;
            I(0, mediatorLiveData);
            SuggestedListsContract.ViewState viewState = mediatorLiveData != null ? (SuggestedListsContract.ViewState) mediatorLiveData.e() : null;
            if (viewState != null) {
                boolean z3 = viewState.f12350a;
                SuggestedListsFullPageError suggestedListsFullPageError2 = viewState.b;
                z = z3;
                suggestedListsFullPageError = suggestedListsFullPageError2;
            } else {
                z = false;
            }
            if (suggestedListsFullPageError != null) {
                z2 = true;
            }
        } else {
            z = false;
        }
        if ((j & 12) != 0) {
            this.y.L(suggestedListsViewModel);
        }
        if (j2 != 0) {
            this.y.M(suggestedListsFullPageError);
            BindingAdaptersKt.o(this.y.h, z2);
            BindingAdaptersKt.o(this.C, z);
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
