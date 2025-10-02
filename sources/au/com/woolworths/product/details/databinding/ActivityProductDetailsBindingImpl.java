package au.com.woolworths.product.details.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.product.details.ProductDetailsClickHandler;
import au.com.woolworths.product.details.ProductDetailsContract;
import au.com.woolworths.product.details.ProductDetailsContractKt;
import au.com.woolworths.product.details.ProductDetailsErrorState;
import au.com.woolworths.product.details.ProductDetailsViewModel;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.ui.ProductCardButtonType;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class ActivityProductDetailsBindingImpl extends ActivityProductDetailsBinding {
    public static final ViewDataBinding.IncludedLayouts K;
    public static final SparseIntArray L;
    public final ContentLoadingProgressBar I;
    public long J;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(10);
        K = includedLayouts;
        includedLayouts.a(0, new int[]{4, 5}, new int[]{R.layout.include_product_details_bottom_action_layout, R.layout.include_product_details_bottom_buttons_layout}, new String[]{"include_product_details_bottom_action_layout", "include_product_details_bottom_buttons_layout"});
        includedLayouts.a(1, new int[]{3}, new int[]{R.layout.include_generic_error_state}, new String[]{"include_generic_error_state"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(R.id.appbar, 6);
        sparseIntArray.put(R.id.toolbar, 7);
        sparseIntArray.put(R.id.content, 8);
        sparseIntArray.put(R.id.bottom_button_barrier, 9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityProductDetailsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 10, K, L);
        IncludeProductDetailsBottomActionLayoutBinding includeProductDetailsBottomActionLayoutBinding = (IncludeProductDetailsBottomActionLayoutBinding) objArrT[4];
        super(dataBindingComponent, view, includeProductDetailsBottomActionLayoutBinding, (IncludeProductDetailsBottomButtonsLayoutBinding) objArrT[5], (EpoxyRecyclerView) objArrT[8], (CoordinatorLayout) objArrT[1], (IncludeGenericErrorStateBinding) objArrT[3], (Toolbar) objArrT[7]);
        this.J = -1L;
        IncludeProductDetailsBottomActionLayoutBinding includeProductDetailsBottomActionLayoutBinding2 = this.y;
        if (includeProductDetailsBottomActionLayoutBinding2 != null) {
            includeProductDetailsBottomActionLayoutBinding2.n = this;
        }
        IncludeProductDetailsBottomButtonsLayoutBinding includeProductDetailsBottomButtonsLayoutBinding = this.z;
        if (includeProductDetailsBottomButtonsLayoutBinding != null) {
            includeProductDetailsBottomButtonsLayoutBinding.n = this;
        }
        this.B.setTag(null);
        IncludeGenericErrorStateBinding includeGenericErrorStateBinding = this.C;
        if (includeGenericErrorStateBinding != null) {
            includeGenericErrorStateBinding.n = this;
        }
        ((ConstraintLayout) objArrT[0]).setTag(null);
        ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) objArrT[2];
        this.I = contentLoadingProgressBar;
        contentLoadingProgressBar.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.C.D(lifecycleOwner);
        this.y.D(lifecycleOwner);
        this.z.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (40 == i) {
            M((CollectionMode) obj);
            return true;
        }
        if (35 == i) {
            L((ProductDetailsClickHandler) obj);
            return true;
        }
        if (204 == i) {
            N((ProductCardButtonType) obj);
            return true;
        }
        if (273 != i) {
            return false;
        }
        O((ProductDetailsViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.product.details.databinding.ActivityProductDetailsBinding
    public final void L(ProductDetailsClickHandler productDetailsClickHandler) throws Throwable {
        this.F = productDetailsClickHandler;
        synchronized (this) {
            this.J |= 32;
        }
        h(35);
        y();
    }

    @Override // au.com.woolworths.product.details.databinding.ActivityProductDetailsBinding
    public final void M(CollectionMode collectionMode) throws Throwable {
        this.G = collectionMode;
        synchronized (this) {
            this.J |= 16;
        }
        h(40);
        y();
    }

    @Override // au.com.woolworths.product.details.databinding.ActivityProductDetailsBinding
    public final void N(ProductCardButtonType productCardButtonType) throws Throwable {
        this.H = productCardButtonType;
        synchronized (this) {
            this.J |= 64;
        }
        h(204);
        y();
    }

    @Override // au.com.woolworths.product.details.databinding.ActivityProductDetailsBinding
    public final void O(ProductDetailsViewModel productDetailsViewModel) throws Throwable {
        this.E = productDetailsViewModel;
        synchronized (this) {
            this.J |= 128;
        }
        h(273);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        long j2;
        long j3;
        ProductDetailsErrorState productDetailsErrorState;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        synchronized (this) {
            j = this.J;
            this.J = 0L;
        }
        CollectionMode collectionMode = this.G;
        ProductDetailsClickHandler productDetailsClickHandler = this.F;
        ProductCardButtonType productCardButtonType = this.H;
        ProductDetailsViewModel productDetailsViewModel = this.E;
        long j4 = 272 & j;
        long j5 = 288 & j;
        long j6 = 320 & j;
        long j7 = 388 & j;
        ProductCard productCard = null;
        ProductDetailsErrorState productDetailsErrorState2 = null;
        if (j7 != 0) {
            MutableLiveData mutableLiveData = productDetailsViewModel != null ? productDetailsViewModel.o : null;
            j2 = 0;
            I(2, mutableLiveData);
            ProductDetailsContract.ViewState viewState = mutableLiveData != null ? (ProductDetailsContract.ViewState) mutableLiveData.e() : null;
            if (viewState != null) {
                z4 = viewState.c;
                productDetailsErrorState2 = viewState.d;
            } else {
                z4 = false;
            }
            boolean z5 = (viewState == null || ProductDetailsContractKt.a(viewState) != null || ProductDetailsContractKt.c(viewState) == null) ? false : true;
            ProductCard productCardC = ProductDetailsContractKt.c(viewState);
            boolean z6 = (viewState == null || ProductDetailsContractKt.a(viewState) == null || ProductDetailsContractKt.c(viewState) == null) ? false : true;
            z3 = productDetailsErrorState2 != null;
            z = z5;
            boolean z7 = z4;
            z2 = z6;
            productDetailsErrorState = productDetailsErrorState2;
            productCard = productCardC;
            j3 = j;
            z = z7;
        } else {
            j2 = 0;
            j3 = j;
            productDetailsErrorState = null;
            z = false;
            z2 = false;
            z3 = false;
        }
        if (j5 != 0) {
            this.y.L(productDetailsClickHandler);
        }
        if (j7 != 0) {
            this.y.N(productCard);
            BindingAdaptersKt.o(this.y.h, z);
            BindingAdaptersKt.o(this.z.h, z2);
            BindingAdaptersKt.o(this.C.h, z3);
            this.C.M(productDetailsErrorState);
            BindingAdaptersKt.o(this.I, z);
        }
        if (j4 != 0) {
            this.y.M(collectionMode);
        }
        if (j6 != 0) {
            this.y.O(productCardButtonType);
        }
        if ((j3 & 384) != j2) {
            this.C.L(productDetailsViewModel);
        }
        this.C.k();
        this.y.k();
        this.z.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.J != 0) {
                    return true;
                }
                return this.C.p() || this.y.p() || this.z.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.J = 256L;
        }
        this.C.r();
        this.y.r();
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
                this.J |= 1;
            }
            return true;
        }
        if (i == 1) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.J |= 2;
            }
            return true;
        }
        if (i == 2) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.J |= 4;
            }
            return true;
        }
        if (i != 3) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.J |= 8;
        }
        return true;
    }
}
