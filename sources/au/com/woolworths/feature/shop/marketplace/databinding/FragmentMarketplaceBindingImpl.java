package au.com.woolworths.feature.shop.marketplace.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceErrorState;
import com.google.android.material.tabs.TabLayout;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class FragmentMarketplaceBindingImpl extends FragmentMarketplaceBinding {
    public static final ViewDataBinding.IncludedLayouts I;
    public static final SparseIntArray J;
    public final FrameLayout F;
    public final ContentLoadingProgressBar G;
    public long H;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(5);
        I = includedLayouts;
        includedLayouts.a(0, new int[]{2}, new int[]{R.layout.include_generic_error_state}, new String[]{"include_generic_error_state"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(R.id.tab_layout, 3);
        sparseIntArray.put(R.id.view_pager, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentMarketplaceBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 5, I, J);
        super(dataBindingComponent, view, (IncludeGenericErrorStateBinding) objArrT[2], (TabLayout) objArrT[3], (ViewPager2) objArrT[4]);
        this.H = -1L;
        IncludeGenericErrorStateBinding includeGenericErrorStateBinding = this.y;
        if (includeGenericErrorStateBinding != null) {
            includeGenericErrorStateBinding.n = this;
        }
        FrameLayout frameLayout = (FrameLayout) objArrT[0];
        this.F = frameLayout;
        frameLayout.setTag(null);
        ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) objArrT[1];
        this.G = contentLoadingProgressBar;
        contentLoadingProgressBar.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (76 == i) {
            M((MarketplaceErrorState) obj);
            return true;
        }
        if (74 == i) {
            L((FullPageErrorStateClickHandler) obj);
            return true;
        }
        if (131 != i) {
            return false;
        }
        N((Boolean) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.marketplace.databinding.FragmentMarketplaceBinding
    public final void L(FullPageErrorStateClickHandler fullPageErrorStateClickHandler) throws Throwable {
        this.C = fullPageErrorStateClickHandler;
        synchronized (this) {
            this.H |= 4;
        }
        h(74);
        y();
    }

    @Override // au.com.woolworths.feature.shop.marketplace.databinding.FragmentMarketplaceBinding
    public final void M(MarketplaceErrorState marketplaceErrorState) throws Throwable {
        this.D = marketplaceErrorState;
        synchronized (this) {
            this.H |= 2;
        }
        h(76);
        y();
    }

    @Override // au.com.woolworths.feature.shop.marketplace.databinding.FragmentMarketplaceBinding
    public final void N(Boolean bool) throws Throwable {
        this.B = bool;
        synchronized (this) {
            this.H |= 8;
        }
        h(131);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.H;
            this.H = 0L;
        }
        MarketplaceErrorState marketplaceErrorState = this.D;
        FullPageErrorStateClickHandler fullPageErrorStateClickHandler = this.C;
        Boolean bool = this.B;
        long j2 = 18 & j;
        boolean z = (j2 == 0 || marketplaceErrorState == null) ? false : true;
        long j3 = 20 & j;
        long j4 = j & 24;
        boolean zB = j4 != 0 ? ViewDataBinding.B(bool) : false;
        if (j3 != 0) {
            this.y.L(fullPageErrorStateClickHandler);
        }
        if (j2 != 0) {
            this.y.M(marketplaceErrorState);
            BindingAdaptersKt.o(this.y.h, z);
        }
        if (j4 != 0) {
            BindingAdaptersKt.o(this.G, zB);
        }
        this.y.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.H != 0) {
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
            this.H = 16L;
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
            this.H |= 1;
        }
        return true;
    }
}
