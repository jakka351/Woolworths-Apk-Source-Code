package au.com.woolworths.feature.shop.catalogue.databinding;

import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeSearchableToolbarWrapperBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.shop.catalogue.generated.callback.OnQueryTextChange;
import au.com.woolworths.feature.shop.catalogue.generated.callback.OnQueryTextSubmit;
import au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorContract;
import au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorErrorState;
import au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorViewModel;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class ActivityCatalogueStoreSelectorBindingImpl extends ActivityCatalogueStoreSelectorBinding implements OnQueryTextSubmit.Listener, OnQueryTextChange.Listener {
    public static final ViewDataBinding.IncludedLayouts G;
    public final OnQueryTextSubmit D;
    public final OnQueryTextChange E;
    public long F;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(5);
        G = includedLayouts;
        includedLayouts.a(0, new int[]{3, 4}, new int[]{R.layout.include_searchable_toolbar_wrapper, R.layout.include_generic_error_state}, new String[]{"include_searchable_toolbar_wrapper", "include_generic_error_state"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityCatalogueStoreSelectorBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 5, G, null);
        super(view, (ProgressBar) objArrT[2], dataBindingComponent, (RecyclerView) objArrT[1], (IncludeGenericErrorStateBinding) objArrT[4], (IncludeSearchableToolbarWrapperBinding) objArrT[3]);
        this.F = -1L;
        IncludeGenericErrorStateBinding includeGenericErrorStateBinding = this.y;
        if (includeGenericErrorStateBinding != null) {
            includeGenericErrorStateBinding.n = this;
        }
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        IncludeSearchableToolbarWrapperBinding includeSearchableToolbarWrapperBinding = this.B;
        if (includeSearchableToolbarWrapperBinding != null) {
            includeSearchableToolbarWrapperBinding.n = this;
        }
        E(view);
        this.D = new OnQueryTextSubmit(this);
        this.E = new OnQueryTextChange(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.B.D(lifecycleOwner);
        this.y.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((CatalogueStoreSelectorViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.catalogue.databinding.ActivityCatalogueStoreSelectorBinding
    public final void L(CatalogueStoreSelectorViewModel catalogueStoreSelectorViewModel) throws Throwable {
        this.C = catalogueStoreSelectorViewModel;
        synchronized (this) {
            this.F |= 8;
        }
        h(273);
        y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorContract$PageState] */
    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        boolean z;
        boolean z2;
        CatalogueStoreSelectorErrorState catalogueStoreSelectorErrorState;
        synchronized (this) {
            j = this.F;
            this.F = 0L;
        }
        CatalogueStoreSelectorViewModel catalogueStoreSelectorViewModel = this.C;
        long j2 = j & 25;
        CatalogueStoreSelectorErrorState catalogueStoreSelectorErrorState2 = null;
        if (j2 != 0) {
            MutableLiveData mutableLiveData = catalogueStoreSelectorViewModel != null ? catalogueStoreSelectorViewModel.g : null;
            I(0, mutableLiveData);
            CatalogueStoreSelectorContract.ViewState viewState = mutableLiveData != null ? (CatalogueStoreSelectorContract.ViewState) mutableLiveData.e() : null;
            if (viewState != null) {
                CatalogueStoreSelectorErrorState catalogueStoreSelectorErrorState3 = viewState.b;
                ?? r11 = viewState.f6951a;
                z2 = r11 == CatalogueStoreSelectorContract.PageState.f;
                catalogueStoreSelectorErrorState = catalogueStoreSelectorErrorState3;
                catalogueStoreSelectorErrorState2 = r11;
            } else {
                catalogueStoreSelectorErrorState = null;
                z2 = false;
            }
            boolean z3 = catalogueStoreSelectorErrorState2 == CatalogueStoreSelectorContract.PageState.g;
            z = catalogueStoreSelectorErrorState2 == CatalogueStoreSelectorContract.PageState.d;
            if (j2 != 0) {
                j |= z3 ? 64L : 32L;
            }
            i = z3 ? 0 : 8;
            catalogueStoreSelectorErrorState2 = catalogueStoreSelectorErrorState;
        } else {
            z = false;
            z2 = false;
        }
        if ((25 & j) != 0) {
            this.y.h.setVisibility(i);
            this.y.M(catalogueStoreSelectorErrorState2);
            BindingAdaptersKt.o(this.z, z);
            BindingAdaptersKt.o(this.A, z2);
        }
        if ((24 & j) != 0) {
            this.y.L(catalogueStoreSelectorViewModel);
        }
        if ((j & 16) != 0) {
            this.B.L(this.E);
            this.B.N(this.D);
            this.B.O(this.h.getResources().getString(R.string.store_locator_hint));
        }
        this.B.k();
        this.y.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.F != 0) {
                    return true;
                }
                return this.B.p() || this.y.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.F = 16L;
        }
        this.B.r();
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
                this.F |= 1;
            }
            return true;
        }
        if (i == 1) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.F |= 2;
            }
            return true;
        }
        if (i != 2) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.F |= 4;
        }
        return true;
    }
}
