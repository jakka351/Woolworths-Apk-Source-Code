package au.com.woolworths.feature.shop.catalogue.databinding;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListContract;
import au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListErrorState;
import au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListInlineState;
import au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListViewModel;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class ActivityCatalogueProductListBindingImpl extends ActivityCatalogueProductListBinding {
    public static final ViewDataBinding.IncludedLayouts F;
    public static final SparseIntArray G;
    public long E;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(7);
        F = includedLayouts;
        includedLayouts.a(0, new int[]{2, 3}, new int[]{R.layout.include_generic_inline_error_state, R.layout.include_generic_error_state}, new String[]{"include_generic_inline_error_state", "include_generic_error_state"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(R.id.appbar_layout, 4);
        sparseIntArray.put(R.id.toolbar, 5);
        sparseIntArray.put(R.id.catalogue_product_list_recycler_view, 6);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.A.D(lifecycleOwner);
        this.z.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((CatalogueProductListViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.catalogue.databinding.ActivityCatalogueProductListBinding
    public final void L(CatalogueProductListViewModel catalogueProductListViewModel) throws Throwable {
        this.D = catalogueProductListViewModel;
        synchronized (this) {
            this.E |= 8;
        }
        h(273);
        y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4, types: [au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListContract$PageState] */
    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        CatalogueProductListInlineState catalogueProductListInlineState;
        boolean z;
        CatalogueProductListErrorState catalogueProductListErrorState;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        CatalogueProductListViewModel catalogueProductListViewModel = this.D;
        long j2 = j & 25;
        CatalogueProductListErrorState catalogueProductListErrorState2 = null;
        if (j2 != 0) {
            MutableLiveData mutableLiveData = catalogueProductListViewModel != null ? catalogueProductListViewModel.k : null;
            I(0, mutableLiveData);
            CatalogueProductListContract.ViewState viewState = mutableLiveData != null ? (CatalogueProductListContract.ViewState) mutableLiveData.e() : null;
            if (viewState != null) {
                CatalogueProductListErrorState catalogueProductListErrorState3 = viewState.b;
                ?? r12 = viewState.f6916a;
                CatalogueProductListInlineState catalogueProductListInlineState2 = viewState.c;
                catalogueProductListErrorState = catalogueProductListErrorState3;
                catalogueProductListErrorState2 = r12;
                catalogueProductListInlineState = catalogueProductListInlineState2;
            } else {
                catalogueProductListErrorState = null;
                catalogueProductListInlineState = null;
            }
            boolean z2 = catalogueProductListErrorState2 == CatalogueProductListContract.PageState.f;
            z = catalogueProductListErrorState2 == CatalogueProductListContract.PageState.d;
            if (j2 != 0) {
                j |= z2 ? 64L : 32L;
            }
            i = z2 ? 0 : 8;
            catalogueProductListErrorState2 = catalogueProductListErrorState;
        } else {
            catalogueProductListInlineState = null;
            z = false;
        }
        if ((25 & j) != 0) {
            this.z.h.setVisibility(i);
            this.z.M(catalogueProductListErrorState2);
            this.A.M(catalogueProductListInlineState);
            BindingAdaptersKt.o(this.B, z);
        }
        if ((j & 24) != 0) {
            this.z.L(catalogueProductListViewModel);
        }
        this.A.k();
        this.z.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.E != 0) {
                    return true;
                }
                return this.A.p() || this.z.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.E = 16L;
        }
        this.A.r();
        this.z.r();
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
        if (i == 1) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.E |= 2;
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
            this.E |= 4;
        }
        return true;
    }
}
