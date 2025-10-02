package au.com.woolworths.shop.buyagain.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import au.com.woolworths.product.databinding.LayoutProductInfoBinding;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.buyagain.generated.callback.OnClickListener;
import au.com.woolworths.shop.buyagain.ui.legacy.quantityselector.BuyAgainQuantitySelectorContract;
import au.com.woolworths.shop.buyagain.ui.legacy.quantityselector.BuyAgainQuantitySelectorViewModel;
import au.com.woolworths.views.horizontalselector.HorizontalSelectorView;
import au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener;
import com.woolworths.R;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* loaded from: classes4.dex */
public class FragmentBuyAgainQuantitySelectorBindingImpl extends FragmentBuyAgainQuantitySelectorBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts J;
    public static final SparseIntArray K;
    public final OnClickListener G;
    public final OnClickListener H;
    public long I;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(8);
        J = includedLayouts;
        includedLayouts.a(0, new int[]{4}, new int[]{R.layout.layout_product_info}, new String[]{"layout_product_info"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(R.id.begin_guide_line, 5);
        sparseIntArray.put(R.id.end_guide_line, 6);
        sparseIntArray.put(R.id.grab_handle_image_view, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentBuyAgainQuantitySelectorBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 8, J, K);
        super(dataBindingComponent, view, (LayoutProductInfoBinding) objArrT[4], (HorizontalSelectorView) objArrT[1], (Button) objArrT[2], (Button) objArrT[3]);
        this.I = -1L;
        LayoutProductInfoBinding layoutProductInfoBinding = this.y;
        if (layoutProductInfoBinding != null) {
            layoutProductInfoBinding.n = this;
        }
        this.z.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        E(view);
        this.G = new OnClickListener(this, 2);
        this.H = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.y.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (272 == i) {
            M((HorizontalSelectorViewListener) obj);
            return true;
        }
        if (273 == i) {
            N((BuyAgainQuantitySelectorViewModel) obj);
            return true;
        }
        if (208 != i) {
            return false;
        }
        L((ProductCard) obj);
        return true;
    }

    @Override // au.com.woolworths.shop.buyagain.databinding.FragmentBuyAgainQuantitySelectorBinding
    public final void L(ProductCard productCard) throws Throwable {
        this.D = productCard;
        synchronized (this) {
            this.I |= 16;
        }
        h(208);
        y();
    }

    @Override // au.com.woolworths.shop.buyagain.databinding.FragmentBuyAgainQuantitySelectorBinding
    public final void M(HorizontalSelectorViewListener horizontalSelectorViewListener) throws Throwable {
        this.C = horizontalSelectorViewListener;
        synchronized (this) {
            this.I |= 4;
        }
        h(272);
        y();
    }

    @Override // au.com.woolworths.shop.buyagain.databinding.FragmentBuyAgainQuantitySelectorBinding
    public final void N(BuyAgainQuantitySelectorViewModel buyAgainQuantitySelectorViewModel) throws Throwable {
        this.E = buyAgainQuantitySelectorViewModel;
        synchronized (this) {
            this.I |= 8;
        }
        h(273);
        y();
    }

    @Override // au.com.woolworths.shop.buyagain.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        BuyAgainQuantitySelectorViewModel buyAgainQuantitySelectorViewModel;
        if (i != 1) {
            if (i == 2 && (buyAgainQuantitySelectorViewModel = this.E) != null) {
                SharedFlowImpl sharedFlowImpl = buyAgainQuantitySelectorViewModel.f;
                ProductCard productCard = buyAgainQuantitySelectorViewModel.j;
                if (productCard != null) {
                    sharedFlowImpl.f(new BuyAgainQuantitySelectorContract.Actions.Update(productCard, buyAgainQuantitySelectorViewModel.l));
                    return;
                } else {
                    Intrinsics.p("product");
                    throw null;
                }
            }
            return;
        }
        BuyAgainQuantitySelectorViewModel buyAgainQuantitySelectorViewModel2 = this.E;
        if (buyAgainQuantitySelectorViewModel2 != null) {
            SharedFlowImpl sharedFlowImpl2 = buyAgainQuantitySelectorViewModel2.f;
            ProductCard productCard2 = buyAgainQuantitySelectorViewModel2.j;
            if (productCard2 != null) {
                sharedFlowImpl2.f(new BuyAgainQuantitySelectorContract.Actions.Remove(productCard2));
            } else {
                Intrinsics.p("product");
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.buyagain.databinding.FragmentBuyAgainQuantitySelectorBindingImpl.j():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.I != 0) {
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
            this.I = 32L;
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
                this.I |= 1;
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
            this.I |= 2;
        }
        return true;
    }
}
