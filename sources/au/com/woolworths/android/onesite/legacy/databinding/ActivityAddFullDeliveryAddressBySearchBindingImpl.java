package au.com.woolworths.android.onesite.legacy.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeSearchableToolbarWrapperBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.legacy.generated.callback.OnQueryTextChange;
import au.com.woolworths.android.onesite.legacy.generated.callback.OnQueryTextSubmit;
import au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchContract;
import au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchErrorState;
import au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchViewModel;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.woolworths.R;
import java.util.List;

/* loaded from: classes3.dex */
public class ActivityAddFullDeliveryAddressBySearchBindingImpl extends ActivityAddFullDeliveryAddressBySearchBinding implements OnQueryTextChange.Listener, OnQueryTextSubmit.Listener {
    public static final ViewDataBinding.IncludedLayouts G;
    public static final SparseIntArray H;
    public final IncludeGenericErrorStateBinding C;
    public final OnQueryTextChange D;
    public final OnQueryTextSubmit E;
    public long F;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(6);
        G = includedLayouts;
        includedLayouts.a(0, new int[]{3, 4}, new int[]{R.layout.include_generic_error_state, R.layout.include_searchable_toolbar_wrapper}, new String[]{"include_generic_error_state", "include_searchable_toolbar_wrapper"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.search_bar_barrier, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityAddFullDeliveryAddressBySearchBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 6, G, H);
        ComposeView composeView = (ComposeView) objArrT[2];
        super(dataBindingComponent, view, composeView, (EpoxyRecyclerView) objArrT[1], (IncludeSearchableToolbarWrapperBinding) objArrT[4]);
        this.F = -1L;
        this.y.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        IncludeGenericErrorStateBinding includeGenericErrorStateBinding = (IncludeGenericErrorStateBinding) objArrT[3];
        this.C = includeGenericErrorStateBinding;
        if (includeGenericErrorStateBinding != null) {
            includeGenericErrorStateBinding.n = this;
        }
        this.z.setTag(null);
        IncludeSearchableToolbarWrapperBinding includeSearchableToolbarWrapperBinding = this.A;
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
        this.C.D(lifecycleOwner);
        this.A.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((DeliveryAddressSearchViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.android.onesite.legacy.databinding.ActivityAddFullDeliveryAddressBySearchBinding
    public final void L(DeliveryAddressSearchViewModel deliveryAddressSearchViewModel) throws Throwable {
        this.B = deliveryAddressSearchViewModel;
        synchronized (this) {
            this.F |= 4;
        }
        h(273);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        int i;
        boolean z;
        int i2;
        List list;
        DeliveryAddressSearchViewModel.ScreenOptions screenOptions;
        synchronized (this) {
            j = this.F;
            this.F = 0L;
        }
        DeliveryAddressSearchViewModel deliveryAddressSearchViewModel = this.B;
        long j2 = j & 14;
        DeliveryAddressSearchErrorState deliveryAddressSearchErrorState = null;
        int i3 = 0;
        if (j2 != 0) {
            MutableLiveData mutableLiveData = deliveryAddressSearchViewModel != null ? deliveryAddressSearchViewModel.r : null;
            I(1, mutableLiveData);
            DeliveryAddressSearchContract.ViewState viewState = mutableLiveData != null ? (DeliveryAddressSearchContract.ViewState) mutableLiveData.e() : null;
            if (viewState != null) {
                deliveryAddressSearchErrorState = viewState.b;
                screenOptions = viewState.d;
                list = viewState.c;
            } else {
                list = null;
                screenOptions = null;
            }
            boolean z2 = deliveryAddressSearchErrorState == null;
            if (j2 != 0) {
                j |= z2 ? 512L : 256L;
            }
            boolean z3 = screenOptions != null ? screenOptions.c : false;
            int size = list != null ? list.size() : 0;
            i2 = z2 ? 8 : 0;
            boolean z4 = z3;
            z = size > 0;
            if ((j & 14) != 0) {
                j |= z4 ? 160L : 80L;
            }
            i = z4 ? 8 : 0;
            if (!z4) {
                i3 = 8;
            }
        } else {
            i = 0;
            z = false;
            i2 = 0;
        }
        if ((14 & j) != 0) {
            this.y.setVisibility(i3);
            this.C.h.setVisibility(i2);
            this.C.M(deliveryAddressSearchErrorState);
            BindingAdaptersKt.o(this.z, z);
            this.A.h.setVisibility(i);
        }
        if ((12 & j) != 0) {
            this.C.L(deliveryAddressSearchViewModel);
        }
        if ((j & 8) != 0) {
            this.A.L(this.D);
            this.A.N(this.E);
            this.A.O(this.h.getResources().getString(R.string.search_address_hint));
        }
        this.C.k();
        this.A.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.F != 0) {
                    return true;
                }
                return this.C.p() || this.A.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.F = 8L;
        }
        this.C.r();
        this.A.r();
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
        if (i != 1) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.F |= 2;
        }
        return true;
    }
}
