package au.com.woolworths.feature.product.list.legacy.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeSearchableToolbarWrapperBinding;
import au.com.woolworths.base.shopapp.modules.button.Button;
import au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler;
import au.com.woolworths.feature.product.list.legacy.ProductListViewModel;
import au.com.woolworths.feature.product.list.legacy.compose.FullScreenMessageView;
import au.com.woolworths.feature.product.list.legacy.generated.callback.StatefulButtonClickHandler;
import au.com.woolworths.shop.lists.databinding.IncludeBoostAllBannerBinding;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class FragmentProductListLegacyBindingImpl extends FragmentProductListLegacyBinding implements StatefulButtonClickHandler.Listener {
    public static final ViewDataBinding.IncludedLayouts Q;
    public static final SparseIntArray R;
    public final AppBarLayout J;
    public final FrameLayout K;
    public final FullScreenMessageView L;
    public final ScrollView M;
    public final StatefulButtonClickHandler N;
    public ButtonClickHandlerImpl O;
    public long P;

    public static class ButtonClickHandlerImpl implements ButtonClickHandler {
        public ProductListViewModel d;

        @Override // au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler
        public final void O2(Button button) {
            this.d.O2(button);
        }
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(15);
        Q = includedLayouts;
        includedLayouts.a(0, new int[]{8, 9}, new int[]{R.layout.include_searchable_toolbar_wrapper, R.layout.include_searchable_toolbar_wrapper_with_compose_legacy}, new String[]{"include_searchable_toolbar_wrapper", "include_searchable_toolbar_wrapper_with_compose_legacy"});
        includedLayouts.a(1, new int[]{10}, new int[]{R.layout.include_product_list_header_legacy}, new String[]{"include_product_list_header_legacy"});
        includedLayouts.a(2, new int[]{11}, new int[]{R.layout.include_boost_all_banner}, new String[]{"include_boost_all_banner"});
        includedLayouts.a(7, new int[]{12}, new int[]{R.layout.include_generic_error_state}, new String[]{"include_generic_error_state"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(R.id.inset_banners_container, 13);
        sparseIntArray.put(R.id.compose_coachmark_view, 14);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentProductListLegacyBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 15, Q, R);
        super(dataBindingComponent, view, (IncludeBoostAllBannerBinding) objArrT[11], (ComposeView) objArrT[14], (IncludeGenericErrorStateBinding) objArrT[12], (LinearLayout) objArrT[13], (IncludeProductListHeaderLegacyBinding) objArrT[10], (EpoxyRecyclerView) objArrT[3], (IncludeSearchableToolbarWrapperWithComposeLegacyBinding) objArrT[9], (IncludeSearchableToolbarWrapperBinding) objArrT[8], (ComposeView) objArrT[5]);
        this.P = -1L;
        IncludeBoostAllBannerBinding includeBoostAllBannerBinding = this.y;
        if (includeBoostAllBannerBinding != null) {
            includeBoostAllBannerBinding.n = this;
        }
        IncludeGenericErrorStateBinding includeGenericErrorStateBinding = this.A;
        if (includeGenericErrorStateBinding != null) {
            includeGenericErrorStateBinding.n = this;
        }
        ((ConstraintLayout) objArrT[0]).setTag(null);
        AppBarLayout appBarLayout = (AppBarLayout) objArrT[1];
        this.J = appBarLayout;
        appBarLayout.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArrT[2];
        this.K = frameLayout;
        frameLayout.setTag(null);
        FullScreenMessageView fullScreenMessageView = (FullScreenMessageView) objArrT[4];
        this.L = fullScreenMessageView;
        fullScreenMessageView.setTag(null);
        ScrollView scrollView = (ScrollView) objArrT[6];
        this.M = scrollView;
        scrollView.setTag(null);
        ((LinearLayout) objArrT[7]).setTag(null);
        IncludeProductListHeaderLegacyBinding includeProductListHeaderLegacyBinding = this.C;
        if (includeProductListHeaderLegacyBinding != null) {
            includeProductListHeaderLegacyBinding.n = this;
        }
        this.D.setTag(null);
        IncludeSearchableToolbarWrapperWithComposeLegacyBinding includeSearchableToolbarWrapperWithComposeLegacyBinding = this.E;
        if (includeSearchableToolbarWrapperWithComposeLegacyBinding != null) {
            includeSearchableToolbarWrapperWithComposeLegacyBinding.n = this;
        }
        IncludeSearchableToolbarWrapperBinding includeSearchableToolbarWrapperBinding = this.F;
        if (includeSearchableToolbarWrapperBinding != null) {
            includeSearchableToolbarWrapperBinding.n = this;
        }
        this.G.setTag(null);
        E(view);
        this.N = new StatefulButtonClickHandler(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.F.D(lifecycleOwner);
        this.E.D(lifecycleOwner);
        this.C.D(lifecycleOwner);
        this.y.D(lifecycleOwner);
        this.A.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (263 == i) {
            return true;
        }
        if (273 == i) {
            M((ProductListViewModel) obj);
            return true;
        }
        if (213 != i) {
            return false;
        }
        L((View.OnFocusChangeListener) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.product.list.legacy.databinding.FragmentProductListLegacyBinding
    public final void L(View.OnFocusChangeListener onFocusChangeListener) throws Throwable {
        this.I = onFocusChangeListener;
        synchronized (this) {
            this.P |= 256;
        }
        h(213);
        y();
    }

    @Override // au.com.woolworths.feature.product.list.legacy.databinding.FragmentProductListLegacyBinding
    public final void M(ProductListViewModel productListViewModel) throws Throwable {
        this.H = productListViewModel;
        synchronized (this) {
            this.P |= 128;
        }
        h(273);
        y();
    }

    @Override // au.com.woolworths.feature.product.list.legacy.generated.callback.StatefulButtonClickHandler.Listener
    public final void b(int i) {
        ProductListViewModel productListViewModel = this.H;
        if (productListViewModel != null) {
            productListViewModel.G1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x011d  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.legacy.databinding.FragmentProductListLegacyBindingImpl.j():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.P != 0) {
                    return true;
                }
                return this.F.p() || this.E.p() || this.C.p() || this.y.p() || this.A.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.P = 512L;
        }
        this.F.r();
        this.E.r();
        this.C.r();
        this.y.r();
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
                this.P |= 1;
            }
            return true;
        }
        if (i == 1) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.P |= 2;
            }
            return true;
        }
        if (i == 2) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.P |= 4;
            }
            return true;
        }
        if (i == 3) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.P |= 8;
            }
            return true;
        }
        if (i == 4) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.P |= 16;
            }
            return true;
        }
        if (i != 5) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.P |= 32;
        }
        return true;
    }
}
