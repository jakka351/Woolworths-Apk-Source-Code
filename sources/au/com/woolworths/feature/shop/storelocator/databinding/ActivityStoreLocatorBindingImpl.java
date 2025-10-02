package au.com.woolworths.feature.shop.storelocator.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.bindings.SearchViewCompatBindingAdapterKt;
import au.com.woolworths.feature.shop.storelocator.StoreLocatorContract;
import au.com.woolworths.feature.shop.storelocator.StoreLocatorViewModel;
import au.com.woolworths.feature.shop.storelocator.generated.callback.OnClickListener;
import au.com.woolworths.feature.shop.storelocator.generated.callback.OnQueryTextChange;
import au.com.woolworths.feature.shop.storelocator.generated.callback.OnQueryTextSubmit;
import au.com.woolworths.feature.shop.storelocator.generated.callback.OnRefreshListener;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class ActivityStoreLocatorBindingImpl extends ActivityStoreLocatorBinding implements OnClickListener.Listener, OnQueryTextSubmit.Listener, OnRefreshListener.Listener, OnQueryTextChange.Listener {
    public static final ViewDataBinding.IncludedLayouts P;
    public static final SparseIntArray Q;
    public final OnClickListener J;
    public final OnQueryTextSubmit K;
    public final OnRefreshListener L;
    public final OnClickListener M;
    public final OnQueryTextChange N;
    public long O;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(12);
        P = includedLayouts;
        includedLayouts.a(0, new int[]{7}, new int[]{R.layout.include_generic_error_state}, new String[]{"include_generic_error_state"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(R.id.appbar, 8);
        sparseIntArray.put(R.id.toolbar, 9);
        sparseIntArray.put(R.id.toggle_group, 10);
        sparseIntArray.put(R.id.list, 11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityStoreLocatorBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 12, P, Q);
        super(dataBindingComponent, view, (IncludeGenericErrorStateBinding) objArrT[7], (EpoxyRecyclerView) objArrT[11], (Button) objArrT[2], (ContentLoadingProgressBar) objArrT[6], (FragmentContainerView) objArrT[5], (Button) objArrT[3], (SearchView) objArrT[1], (SwipeRefreshLayout) objArrT[4], (MaterialButtonToggleGroup) objArrT[10], (Toolbar) objArrT[9]);
        this.O = -1L;
        IncludeGenericErrorStateBinding includeGenericErrorStateBinding = this.y;
        if (includeGenericErrorStateBinding != null) {
            includeGenericErrorStateBinding.n = this;
        }
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        E(view);
        this.J = new OnClickListener(this, 4);
        this.K = new OnQueryTextSubmit(this);
        this.L = new OnRefreshListener(this);
        this.M = new OnClickListener(this, 3);
        this.N = new OnQueryTextChange(this);
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
        L((StoreLocatorViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.storelocator.databinding.ActivityStoreLocatorBinding
    public final void L(StoreLocatorViewModel storeLocatorViewModel) throws Throwable {
        this.I = storeLocatorViewModel;
        synchronized (this) {
            this.O |= 4;
        }
        h(273);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        synchronized (this) {
            j = this.O;
            this.O = 0L;
        }
        StoreLocatorViewModel storeLocatorViewModel = this.I;
        long j2 = 13 & j;
        boolean z6 = false;
        if (j2 != 0) {
            MutableLiveData mutableLiveData = storeLocatorViewModel != null ? storeLocatorViewModel.n : null;
            I(0, mutableLiveData);
            StoreLocatorContract.ViewState viewState = mutableLiveData != null ? (StoreLocatorContract.ViewState) mutableLiveData.e() : null;
            z = viewState != null && viewState.f8127a && viewState.c.isEmpty() && viewState.d.isEmpty();
            z2 = viewState != null && viewState.b == StoreLocatorContract.StoreListDisplayMode.e && viewState.e == null;
            z3 = (viewState == null || !viewState.f8127a || (viewState.c.isEmpty() && viewState.d.isEmpty())) ? false : true;
            z4 = viewState != null && viewState.b == StoreLocatorContract.StoreListDisplayMode.d && viewState.e == null && !(viewState.c.isEmpty() && viewState.d.isEmpty());
            z5 = viewState != null ? !viewState.c.isEmpty() : false;
            storeLocatorFullPageErrorState = viewState != null ? viewState.e : null;
            if (storeLocatorFullPageErrorState != null) {
                z6 = true;
            }
        } else {
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
        }
        if ((12 & j) != 0) {
            this.y.L(storeLocatorViewModel);
        }
        if (j2 != 0) {
            this.y.M(storeLocatorFullPageErrorState);
            BindingAdaptersKt.o(this.y.h, z6);
            BindingAdaptersKt.o(this.B, z);
            BindingAdaptersKt.o(this.C, z2);
            this.D.setEnabled(z5);
            this.F.setRefreshing(z3);
            BindingAdaptersKt.o(this.F, z4);
        }
        if ((j & 8) != 0) {
            this.A.setOnClickListener(this.M);
            this.D.setOnClickListener(this.J);
            SearchViewCompatBindingAdapterKt.a(this.E, this.K, this.N);
            this.F.setOnRefreshListener(this.L);
        }
        this.y.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.O != 0) {
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
            this.O = 8L;
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
                this.O |= 1;
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
            this.O |= 2;
        }
        return true;
    }
}
