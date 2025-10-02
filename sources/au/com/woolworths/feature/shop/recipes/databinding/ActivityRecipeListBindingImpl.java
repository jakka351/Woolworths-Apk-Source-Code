package au.com.woolworths.feature.shop.recipes.databinding;

import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MediatorLiveData;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.feature.shop.recipes.generated.callback.OnFocusChangeListener;
import au.com.woolworths.feature.shop.recipes.recipes.list.RecipeListViewModel;
import au.com.woolworths.feature.shop.recipes.recipes.list.RecipesListContract;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class ActivityRecipeListBindingImpl extends ActivityRecipeListBinding implements OnFocusChangeListener.Listener {
    public static final ViewDataBinding.IncludedLayouts I;
    public static final SparseIntArray J;
    public final ContentLoadingProgressBar F;
    public final OnFocusChangeListener G;
    public long H;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(9);
        I = includedLayouts;
        includedLayouts.a(0, new int[]{5}, new int[]{R.layout.include_generic_error_state}, new String[]{"include_generic_error_state"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(R.id.app_bar, 6);
        sparseIntArray.put(R.id.toolbar, 7);
        sparseIntArray.put(R.id.search_card, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityRecipeListBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 9, I, J);
        super(dataBindingComponent, view, (EpoxyRecyclerView) objArrT[3], (IncludeGenericErrorStateBinding) objArrT[5], (MaterialCardView) objArrT[8], (SearchView) objArrT[1], (Toolbar) objArrT[7], (TextView) objArrT[2]);
        this.H = -1L;
        this.y.setTag(null);
        IncludeGenericErrorStateBinding includeGenericErrorStateBinding = this.z;
        if (includeGenericErrorStateBinding != null) {
            includeGenericErrorStateBinding.n = this;
        }
        ((CoordinatorLayout) objArrT[0]).setTag(null);
        ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) objArrT[4];
        this.F = contentLoadingProgressBar;
        contentLoadingProgressBar.setTag(null);
        this.B.setTag(null);
        this.D.setTag(null);
        E(view);
        this.G = new OnFocusChangeListener(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.z.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (214 != i) {
            return false;
        }
        L((RecipeListViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.recipes.databinding.ActivityRecipeListBinding
    public final void L(RecipeListViewModel recipeListViewModel) throws Throwable {
        this.E = recipeListViewModel;
        synchronized (this) {
            this.H |= 4;
        }
        h(214);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() throws Resources.NotFoundException {
        long j;
        String quantityString;
        int i;
        boolean z;
        boolean z2;
        FullPageErrorCause fullPageErrorCause;
        int i2;
        synchronized (this) {
            j = this.H;
            this.H = 0L;
        }
        RecipeListViewModel recipeListViewModel = this.E;
        long j2 = j & 13;
        FullPageErrorCause fullPageErrorCause2 = null;
        boolean z3 = false;
        if (j2 != 0) {
            MediatorLiveData mediatorLiveData = recipeListViewModel != null ? recipeListViewModel.k : null;
            I(0, mediatorLiveData);
            RecipesListContract.ViewState viewState = mediatorLiveData != null ? (RecipesListContract.ViewState) mediatorLiveData.e() : null;
            if (viewState != null) {
                i2 = viewState.b;
                fullPageErrorCause = viewState.c;
                z = viewState.f8081a;
            } else {
                fullPageErrorCause = null;
                i2 = 0;
                z = false;
            }
            this.D.getResources().getQuantityString(R.plurals.recipe_list_total_count, i2, Integer.valueOf(i2));
            quantityString = this.D.getResources().getQuantityString(R.plurals.recipe_list_total_count, i2, Integer.valueOf(i2));
            boolean z4 = i2 > 0;
            boolean z5 = fullPageErrorCause == null;
            if (j2 != 0) {
                j |= z5 ? 32L : 16L;
            }
            FullPageErrorCause fullPageErrorCause3 = fullPageErrorCause;
            z2 = z4;
            fullPageErrorCause2 = fullPageErrorCause3;
            i = z5 ? 8 : 0;
            z3 = z5;
        } else {
            quantityString = null;
            i = 0;
            z = false;
            z2 = false;
        }
        if ((13 & j) != 0) {
            BindingAdaptersKt.o(this.y, z3);
            this.z.h.setVisibility(i);
            this.z.M(fullPageErrorCause2);
            BindingAdaptersKt.o(this.F, z);
            TextViewBindingAdapter.b(this.D, quantityString);
            BindingAdaptersKt.o(this.D, z2);
        }
        if ((12 & j) != 0) {
            this.z.L(recipeListViewModel);
        }
        if ((j & 8) != 0) {
            this.B.setOnQueryTextFocusChangeListener(this.G);
        }
        this.z.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.H != 0) {
                    return true;
                }
                return this.z.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.H = 8L;
        }
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
                this.H |= 1;
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
            this.H |= 2;
        }
        return true;
    }
}
