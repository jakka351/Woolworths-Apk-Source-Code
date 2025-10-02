package au.com.woolworths.feature.product.list.databinding;

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
import au.com.woolworths.base.shopapp.modules.button.Button;
import au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler;
import au.com.woolworths.feature.product.list.ProductListViewModel;
import au.com.woolworths.feature.product.list.compose.FullScreenMessageView;
import au.com.woolworths.feature.product.list.generated.callback.StatefulButtonClickHandler;
import au.com.woolworths.shop.lists.databinding.IncludeBoostAllBannerBinding;
import com.google.android.material.appbar.AppBarLayout;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class FragmentProductListBindingImpl extends FragmentProductListBinding implements StatefulButtonClickHandler.Listener {
    public static final ViewDataBinding.IncludedLayouts O;
    public static final SparseIntArray P;
    public final FrameLayout I;
    public final FullScreenMessageView J;
    public final ScrollView K;
    public final StatefulButtonClickHandler L;
    public ButtonClickHandlerImpl M;
    public long N;

    public static class ButtonClickHandlerImpl implements ButtonClickHandler {
        public ProductListViewModel d;

        @Override // au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler
        public final void O2(Button button) {
            this.d.O2(button);
        }
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(14);
        O = includedLayouts;
        includedLayouts.a(2, new int[]{9}, new int[]{R.layout.include_product_list_header}, new String[]{"include_product_list_header"});
        includedLayouts.a(3, new int[]{10}, new int[]{R.layout.include_boost_all_banner}, new String[]{"include_boost_all_banner"});
        includedLayouts.a(8, new int[]{11}, new int[]{R.layout.include_generic_error_state}, new String[]{"include_generic_error_state"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(R.id.inset_banners_container, 12);
        sparseIntArray.put(R.id.compose_coachmark_view, 13);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentProductListBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 14, O, P);
        super(dataBindingComponent, view, (AppBarLayout) objArrT[2], (IncludeBoostAllBannerBinding) objArrT[10], (ComposeView) objArrT[13], (IncludeGenericErrorStateBinding) objArrT[11], (LinearLayout) objArrT[12], (ComposeView) objArrT[4], (IncludeProductListHeaderBinding) objArrT[9], (ComposeView) objArrT[1], (ComposeView) objArrT[6]);
        this.N = -1L;
        this.y.setTag(null);
        IncludeBoostAllBannerBinding includeBoostAllBannerBinding = this.z;
        if (includeBoostAllBannerBinding != null) {
            includeBoostAllBannerBinding.n = this;
        }
        IncludeGenericErrorStateBinding includeGenericErrorStateBinding = this.B;
        if (includeGenericErrorStateBinding != null) {
            includeGenericErrorStateBinding.n = this;
        }
        this.D.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArrT[3];
        this.I = frameLayout;
        frameLayout.setTag(null);
        FullScreenMessageView fullScreenMessageView = (FullScreenMessageView) objArrT[5];
        this.J = fullScreenMessageView;
        fullScreenMessageView.setTag(null);
        ScrollView scrollView = (ScrollView) objArrT[7];
        this.K = scrollView;
        scrollView.setTag(null);
        ((LinearLayout) objArrT[8]).setTag(null);
        IncludeProductListHeaderBinding includeProductListHeaderBinding = this.E;
        if (includeProductListHeaderBinding != null) {
            includeProductListHeaderBinding.n = this;
        }
        this.F.setTag(null);
        this.G.setTag(null);
        E(view);
        this.L = new StatefulButtonClickHandler(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.E.D(lifecycleOwner);
        this.z.D(lifecycleOwner);
        this.B.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (263 == i) {
            return true;
        }
        if (273 == i) {
            L((ProductListViewModel) obj);
            return true;
        }
        if (213 != i) {
            return false;
        }
        return true;
    }

    @Override // au.com.woolworths.feature.product.list.databinding.FragmentProductListBinding
    public final void L(ProductListViewModel productListViewModel) throws Throwable {
        this.H = productListViewModel;
        synchronized (this) {
            this.N |= 32;
        }
        h(273);
        y();
    }

    @Override // au.com.woolworths.feature.product.list.generated.callback.StatefulButtonClickHandler.Listener
    public final void b(int i) {
        ProductListViewModel productListViewModel = this.H;
        if (productListViewModel != null) {
            productListViewModel.G1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fc  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.databinding.FragmentProductListBindingImpl.j():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.N != 0) {
                    return true;
                }
                return this.E.p() || this.z.p() || this.B.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.N = 128L;
        }
        this.E.r();
        this.z.r();
        this.B.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.N |= 1;
            }
            return true;
        }
        if (i == 1) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.N |= 2;
            }
            return true;
        }
        if (i == 2) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.N |= 4;
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
            this.N |= 8;
        }
        return true;
    }
}
