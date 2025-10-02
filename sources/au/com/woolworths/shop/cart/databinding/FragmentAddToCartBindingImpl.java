package au.com.woolworths.shop.cart.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButton;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonBindingKt;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.product.addtocart.AddToCartContract;
import au.com.woolworths.product.addtocart.AddToCartViewModel;
import au.com.woolworths.product.databinding.LayoutProductInfoBinding;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.shop.cart.generated.callback.StatefulButtonClickHandler;
import au.com.woolworths.views.BottomSheetWithHandle;
import au.com.woolworths.views.horizontalselector.HorizontalSelectorView;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class FragmentAddToCartBindingImpl extends FragmentAddToCartBinding implements StatefulButtonClickHandler.Listener {
    public static final ViewDataBinding.IncludedLayouts N;
    public static final SparseIntArray O;
    public final StatefulButtonClickHandler J;
    public final StatefulButtonClickHandler K;
    public final StatefulButtonClickHandler L;
    public long M;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(11);
        N = includedLayouts;
        includedLayouts.a(1, new int[]{6}, new int[]{R.layout.layout_product_info}, new String[]{"layout_product_info"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(R.id.begin_guide_line, 7);
        sparseIntArray.put(R.id.end_guide_line, 8);
        sparseIntArray.put(R.id.quantity_weight_selector, 9);
        sparseIntArray.put(R.id.overlay_view, 10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentAddToCartBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 11, N, O);
        StatefulButton statefulButton = (StatefulButton) objArrT[3];
        super(dataBindingComponent, view, statefulButton, (LayoutProductInfoBinding) objArrT[6], (HorizontalSelectorView) objArrT[2], (FrameLayout) objArrT[10], (ComposeView) objArrT[9], (StatefulButton) objArrT[5], (StatefulButton) objArrT[4]);
        this.M = -1L;
        this.y.setTag(null);
        LayoutProductInfoBinding layoutProductInfoBinding = this.z;
        if (layoutProductInfoBinding != null) {
            layoutProductInfoBinding.n = this;
        }
        this.A.setTag(null);
        ((BottomSheetWithHandle) objArrT[0]).setTag(null);
        ((ConstraintLayout) objArrT[1]).setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        E(view);
        this.J = new StatefulButtonClickHandler(this, 3);
        this.K = new StatefulButtonClickHandler(this, 1);
        this.L = new StatefulButtonClickHandler(this, 2);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.z.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (207 == i) {
            L((ProductCardConfig) obj);
            return true;
        }
        if (273 == i) {
            N((AddToCartViewModel) obj);
            return true;
        }
        if (208 != i) {
            return false;
        }
        M((ProductCard) obj);
        return true;
    }

    @Override // au.com.woolworths.shop.cart.databinding.FragmentAddToCartBinding
    public final void L(ProductCardConfig productCardConfig) throws Throwable {
        this.G = productCardConfig;
        synchronized (this) {
            this.M |= 4;
        }
        h(207);
        y();
    }

    @Override // au.com.woolworths.shop.cart.databinding.FragmentAddToCartBinding
    public final void M(ProductCard productCard) throws Throwable {
        this.H = productCard;
        synchronized (this) {
            this.M |= 16;
        }
        h(208);
        y();
    }

    @Override // au.com.woolworths.shop.cart.databinding.FragmentAddToCartBinding
    public final void N(AddToCartViewModel addToCartViewModel) throws Throwable {
        this.F = addToCartViewModel;
        synchronized (this) {
            this.M |= 8;
        }
        h(273);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        long j2;
        long j3;
        boolean z;
        String str;
        StatefulButtonState statefulButtonState;
        boolean zR;
        long j4;
        int i;
        boolean z2;
        String str2;
        synchronized (this) {
            j = this.M;
            this.M = 0L;
        }
        ProductCardConfig productCardConfig = this.G;
        AddToCartViewModel addToCartViewModel = this.F;
        ProductCard productCard = this.H;
        long j5 = 36 & j;
        long j6 = 42 & j;
        boolean zC = false;
        ProductCard productCard2 = null;
        if (j6 != 0) {
            MutableLiveData mutableLiveData = addToCartViewModel != null ? addToCartViewModel.m : null;
            I(1, mutableLiveData);
            AddToCartContract.ViewState viewState = mutableLiveData != null ? (AddToCartContract.ViewState) mutableLiveData.e() : null;
            if (viewState != null) {
                int i2 = viewState.i;
                j2 = 0;
                ProductCard productCard3 = viewState.f9248a;
                z2 = viewState.j;
                j3 = 40;
                str2 = viewState.h;
                statefulButtonState = viewState.k;
                productCard2 = productCard3;
                i = i2;
            } else {
                j2 = 0;
                j3 = 40;
                i = 0;
                z2 = false;
                str2 = null;
                statefulButtonState = null;
            }
            zR = ProductCardExtKt.r(productCard2);
            String string = this.h.getContext().getString(i, str2);
            if ((j & j3) != j2 && addToCartViewModel != null) {
                zC = addToCartViewModel.k.c(BaseShopAppFeature.w);
            }
            boolean z3 = z2;
            str = string;
            z = zC;
            zC = z3;
        } else {
            j2 = 0;
            j3 = 40;
            z = false;
            str = null;
            statefulButtonState = null;
            zR = false;
        }
        long j7 = j & 48;
        if ((j & 32) != j2) {
            this.y.setClickHandler(this.K);
            StatefulButton statefulButton = this.y;
            StatefulButtonState statefulButtonState2 = StatefulButtonState.d;
            statefulButton.setStatefulButtonState(statefulButtonState2);
            j4 = j;
            this.z.M(true);
            this.D.setClickHandler(this.J);
            this.D.setStatefulButtonState(statefulButtonState2);
            StatefulButton statefulButton2 = this.D;
            StatefulButtonBindingKt.a(statefulButton2, statefulButton2.getResources().getString(R.string.product_bottom_sheet_remove));
            this.E.setClickHandler(this.L);
            StatefulButton statefulButton3 = this.E;
            StatefulButtonBindingKt.a(statefulButton3, statefulButton3.getResources().getString(R.string.product_bottom_sheet_update_cart));
        } else {
            j4 = j;
        }
        if (j6 != 0) {
            BindingAdaptersKt.o(this.y, zC);
            StatefulButtonBindingKt.a(this.y, str);
            BindingAdaptersKt.o(this.D, zR);
            this.E.setStatefulButtonState(statefulButtonState);
            BindingAdaptersKt.o(this.E, zR);
        }
        if ((j4 & j3) != j2) {
            this.z.N(z);
            this.z.L(addToCartViewModel);
            this.A.setAnalyticsListener(addToCartViewModel);
            this.A.setViewListener(addToCartViewModel);
        }
        if (j5 != 0) {
            this.z.O(productCardConfig);
        }
        if (j7 != j2) {
            this.z.P(productCard);
        }
        this.z.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.M != 0) {
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
            this.M = 32L;
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
                this.M |= 1;
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
            this.M |= 2;
        }
        return true;
    }
}
