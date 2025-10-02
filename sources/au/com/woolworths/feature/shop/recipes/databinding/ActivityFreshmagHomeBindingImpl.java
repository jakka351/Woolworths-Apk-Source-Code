package au.com.woolworths.feature.shop.recipes.databinding;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagHomeContract;
import au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagHomeErrorState;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class ActivityFreshmagHomeBindingImpl extends ActivityFreshmagHomeBinding {
    public static final ViewDataBinding.IncludedLayouts F;
    public static final SparseIntArray G;
    public long E;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(6);
        F = includedLayouts;
        includedLayouts.a(0, new int[]{2}, new int[]{R.layout.include_generic_error_state}, new String[]{"include_generic_error_state"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(R.id.appbar_layout, 3);
        sparseIntArray.put(R.id.toolbar, 4);
        sparseIntArray.put(R.id.recycler_view, 5);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.y.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (76 == i) {
            L((FreshMagHomeErrorState) obj);
            return true;
        }
        if (196 != i) {
            return false;
        }
        M((FreshMagHomeContract.PageState) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.recipes.databinding.ActivityFreshmagHomeBinding
    public final void L(FreshMagHomeErrorState freshMagHomeErrorState) throws Throwable {
        this.D = freshMagHomeErrorState;
        synchronized (this) {
            this.E |= 2;
        }
        h(76);
        y();
    }

    @Override // au.com.woolworths.feature.shop.recipes.databinding.ActivityFreshmagHomeBinding
    public final void M(FreshMagHomeContract.PageState pageState) throws Throwable {
        this.C = pageState;
        synchronized (this) {
            this.E |= 4;
        }
        h(196);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        FreshMagHomeErrorState freshMagHomeErrorState = this.D;
        FreshMagHomeContract.PageState pageState = this.C;
        long j2 = 10 & j;
        boolean z = false;
        boolean z2 = (j2 == 0 || freshMagHomeErrorState == null) ? false : true;
        long j3 = j & 12;
        if (j3 != 0) {
            z = pageState == FreshMagHomeContract.PageState.d;
        }
        if (j2 != 0) {
            this.y.M(freshMagHomeErrorState);
            BindingAdaptersKt.o(this.y.h, z2);
        }
        if (j3 != 0) {
            BindingAdaptersKt.o(this.z, z);
        }
        this.y.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.E != 0) {
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
            this.E = 8L;
        }
        this.y.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i != 0) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.E |= 1;
        }
        return true;
    }
}
