package au.com.woolworths.feature.shop.storelocator.legacy.databinding;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.locationresult.PickUpLocationResultContract;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.locationresult.PickUpLocationResultErrorState;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.locationresult.PickUpLocationResultViewModel;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class ActivityPickUpLocationResultBindingImpl extends ActivityPickUpLocationResultBinding {
    public static final ViewDataBinding.IncludedLayouts E;
    public static final SparseIntArray F;
    public long D;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(6);
        E = includedLayouts;
        includedLayouts.a(0, new int[]{3}, new int[]{R.layout.include_generic_error_state}, new String[]{"include_generic_error_state"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(R.id.appbar, 4);
        sparseIntArray.put(R.id.toolbar, 5);
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
        L((PickUpLocationResultViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.storelocator.legacy.databinding.ActivityPickUpLocationResultBinding
    public final void L(PickUpLocationResultViewModel pickUpLocationResultViewModel) throws Throwable {
        this.C = pickUpLocationResultViewModel;
        synchronized (this) {
            this.D |= 4;
        }
        h(273);
        y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [au.com.woolworths.feature.shop.storelocator.legacy.pickup.locationresult.PickUpLocationResultContract$PageState] */
    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        boolean z;
        boolean z2;
        PickUpLocationResultErrorState pickUpLocationResultErrorState;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        PickUpLocationResultViewModel pickUpLocationResultViewModel = this.C;
        long j2 = j & 13;
        PickUpLocationResultErrorState pickUpLocationResultErrorState2 = null;
        if (j2 != 0) {
            MutableLiveData mutableLiveData = pickUpLocationResultViewModel != null ? pickUpLocationResultViewModel.j : null;
            I(0, mutableLiveData);
            PickUpLocationResultContract.ViewState viewState = mutableLiveData != null ? (PickUpLocationResultContract.ViewState) mutableLiveData.e() : null;
            if (viewState != null) {
                PickUpLocationResultErrorState pickUpLocationResultErrorState3 = viewState.b;
                ?? r11 = viewState.f8206a;
                pickUpLocationResultErrorState = pickUpLocationResultErrorState3;
                pickUpLocationResultErrorState2 = r11;
            } else {
                pickUpLocationResultErrorState = null;
            }
            boolean z3 = pickUpLocationResultErrorState2 == PickUpLocationResultContract.PageState.f;
            z2 = pickUpLocationResultErrorState2 == PickUpLocationResultContract.PageState.e;
            z = pickUpLocationResultErrorState2 == PickUpLocationResultContract.PageState.d;
            if (j2 != 0) {
                j |= z3 ? 32L : 16L;
            }
            i = z3 ? 0 : 8;
            pickUpLocationResultErrorState2 = pickUpLocationResultErrorState;
        } else {
            z = false;
            z2 = false;
        }
        if ((13 & j) != 0) {
            this.y.h.setVisibility(i);
            this.y.M(pickUpLocationResultErrorState2);
            BindingAdaptersKt.o(this.z, z2);
            BindingAdaptersKt.o(this.A, z);
        }
        if ((j & 12) != 0) {
            this.y.L(pickUpLocationResultViewModel);
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
