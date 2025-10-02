package au.com.woolworths.feature.shop.storelocator.legacy.databinding;

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
import au.com.woolworths.feature.shop.storelocator.legacy.generated.callback.OnQueryTextChange;
import au.com.woolworths.feature.shop.storelocator.legacy.generated.callback.OnQueryTextSubmit;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.PickUpLocatorContract;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.PickUpLocatorPageErrorState;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.PickUpLocatorViewModel;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class ActivityPickUpLocatorBindingImpl extends ActivityPickUpLocatorBinding implements OnQueryTextChange.Listener, OnQueryTextSubmit.Listener {
    public static final ViewDataBinding.IncludedLayouts G;
    public final OnQueryTextChange D;
    public final OnQueryTextSubmit E;
    public long F;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(5);
        G = includedLayouts;
        includedLayouts.a(0, new int[]{3, 4}, new int[]{R.layout.include_searchable_toolbar_wrapper, R.layout.include_generic_error_state}, new String[]{"include_searchable_toolbar_wrapper", "include_generic_error_state"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityPickUpLocatorBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 5, G, null);
        IncludeGenericErrorStateBinding includeGenericErrorStateBinding = (IncludeGenericErrorStateBinding) objArrT[4];
        super(view, (ProgressBar) objArrT[2], dataBindingComponent, (RecyclerView) objArrT[1], includeGenericErrorStateBinding, (IncludeSearchableToolbarWrapperBinding) objArrT[3]);
        this.F = -1L;
        IncludeGenericErrorStateBinding includeGenericErrorStateBinding2 = this.y;
        if (includeGenericErrorStateBinding2 != null) {
            includeGenericErrorStateBinding2.n = this;
        }
        this.z.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.A.setTag(null);
        IncludeSearchableToolbarWrapperBinding includeSearchableToolbarWrapperBinding = this.B;
        if (includeSearchableToolbarWrapperBinding != null) {
            includeSearchableToolbarWrapperBinding.n = this;
        }
        E(view);
        this.D = new OnQueryTextChange(this);
        this.E = new OnQueryTextSubmit(this);
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
        L((PickUpLocatorViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.storelocator.legacy.databinding.ActivityPickUpLocatorBinding
    public final void L(PickUpLocatorViewModel pickUpLocatorViewModel) throws Throwable {
        this.C = pickUpLocatorViewModel;
        synchronized (this) {
            this.F |= 8;
        }
        h(273);
        y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [au.com.woolworths.feature.shop.storelocator.legacy.pickup.PickUpLocatorContract$PageState] */
    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        boolean z;
        boolean z2;
        PickUpLocatorPageErrorState pickUpLocatorPageErrorState;
        synchronized (this) {
            j = this.F;
            this.F = 0L;
        }
        PickUpLocatorViewModel pickUpLocatorViewModel = this.C;
        long j2 = j & 25;
        PickUpLocatorPageErrorState pickUpLocatorPageErrorState2 = null;
        if (j2 != 0) {
            MutableLiveData mutableLiveData = pickUpLocatorViewModel != null ? pickUpLocatorViewModel.k : null;
            I(0, mutableLiveData);
            PickUpLocatorContract.ViewState viewState = mutableLiveData != null ? (PickUpLocatorContract.ViewState) mutableLiveData.e() : null;
            if (viewState != null) {
                PickUpLocatorPageErrorState pickUpLocatorPageErrorState3 = viewState.b;
                ?? r11 = viewState.f8184a;
                z2 = r11 == PickUpLocatorContract.PageState.e || r11 == PickUpLocatorContract.PageState.f;
                pickUpLocatorPageErrorState = pickUpLocatorPageErrorState3;
                pickUpLocatorPageErrorState2 = r11;
            } else {
                pickUpLocatorPageErrorState = null;
                z2 = false;
            }
            boolean z3 = pickUpLocatorPageErrorState2 == PickUpLocatorContract.PageState.g;
            z = pickUpLocatorPageErrorState2 == PickUpLocatorContract.PageState.d;
            if (j2 != 0) {
                j |= z3 ? 64L : 32L;
            }
            i = z3 ? 0 : 8;
            pickUpLocatorPageErrorState2 = pickUpLocatorPageErrorState;
        } else {
            z = false;
            z2 = false;
        }
        if ((25 & j) != 0) {
            this.y.h.setVisibility(i);
            this.y.M(pickUpLocatorPageErrorState2);
            BindingAdaptersKt.o(this.z, z2);
            BindingAdaptersKt.o(this.A, z);
        }
        if ((24 & j) != 0) {
            this.y.L(pickUpLocatorViewModel);
        }
        if ((j & 16) != 0) {
            this.B.L(this.D);
            this.B.N(this.E);
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
