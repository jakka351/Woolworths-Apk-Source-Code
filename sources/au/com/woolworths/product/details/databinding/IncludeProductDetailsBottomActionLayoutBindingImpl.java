package au.com.woolworths.product.details.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.product.databinding.StockIndicatorBinding;
import au.com.woolworths.product.details.ProductDetailsClickHandler;
import au.com.woolworths.product.details.generated.callback.OnClickListener;
import au.com.woolworths.product.models.InStoreAvailabilityInfo;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductTrolleyData;
import au.com.woolworths.product.ui.ProductCardButtonType;
import au.com.woolworths.product.utils.BindingAdaptersKt;
import com.google.apphosting.datastore.testing.DatastoreTestTrace;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class IncludeProductDetailsBottomActionLayoutBindingImpl extends IncludeProductDetailsBottomActionLayoutBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts S;
    public final OnClickListener M;
    public final OnClickListener N;
    public final OnClickListener O;
    public final OnClickListener P;
    public final OnClickListener Q;
    public long R;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(10);
        S = includedLayouts;
        includedLayouts.a(2, new int[]{9}, new int[]{R.layout.stock_indicator}, new String[]{"stock_indicator"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IncludeProductDetailsBottomActionLayoutBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 10, S, null);
        super(dataBindingComponent, view, (ConstraintLayout) objArrT[0], (Button) objArrT[6], (Button) objArrT[4], (Button) objArrT[5], (StockIndicatorBinding) objArrT[9], (Button) objArrT[8], (Button) objArrT[1], (FrameLayout) objArrT[2], (Button) objArrT[3], (Button) objArrT[7]);
        this.R = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        StockIndicatorBinding stockIndicatorBinding = this.C;
        if (stockIndicatorBinding != null) {
            stockIndicatorBinding.n = this;
        }
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        E(view);
        this.M = new OnClickListener(this, 3);
        this.N = new OnClickListener(this, 4);
        this.O = new OnClickListener(this, 1);
        this.P = new OnClickListener(this, 5);
        this.Q = new OnClickListener(this, 2);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.C.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (203 == i) {
            N((ProductCard) obj);
            return true;
        }
        if (40 == i) {
            M((CollectionMode) obj);
            return true;
        }
        if (35 == i) {
            L((ProductDetailsClickHandler) obj);
            return true;
        }
        if (204 != i) {
            return false;
        }
        O((ProductCardButtonType) obj);
        return true;
    }

    @Override // au.com.woolworths.product.details.databinding.IncludeProductDetailsBottomActionLayoutBinding
    public final void L(ProductDetailsClickHandler productDetailsClickHandler) throws Throwable {
        this.J = productDetailsClickHandler;
        synchronized (this) {
            this.R |= 8;
        }
        h(35);
        y();
    }

    @Override // au.com.woolworths.product.details.databinding.IncludeProductDetailsBottomActionLayoutBinding
    public final void M(CollectionMode collectionMode) throws Throwable {
        this.K = collectionMode;
        synchronized (this) {
            this.R |= 4;
        }
        h(40);
        y();
    }

    @Override // au.com.woolworths.product.details.databinding.IncludeProductDetailsBottomActionLayoutBinding
    public final void N(ProductCard productCard) throws Throwable {
        this.I = productCard;
        synchronized (this) {
            this.R |= 2;
        }
        h(DatastoreTestTrace.FirestoreV1Action.MATCHING_DOCUMENTS_FIELD_NUMBER);
        y();
    }

    @Override // au.com.woolworths.product.details.databinding.IncludeProductDetailsBottomActionLayoutBinding
    public final void O(ProductCardButtonType productCardButtonType) throws Throwable {
        this.L = productCardButtonType;
        synchronized (this) {
            this.R |= 16;
        }
        h(204);
        y();
    }

    @Override // au.com.woolworths.product.details.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        if (i == 1) {
            ProductCard productCard = this.I;
            ProductDetailsClickHandler productDetailsClickHandler = this.J;
            if (productDetailsClickHandler != null) {
                productDetailsClickHandler.h1(productCard);
                return;
            }
            return;
        }
        if (i == 2) {
            ProductCard productCard2 = this.I;
            ProductDetailsClickHandler productDetailsClickHandler2 = this.J;
            if (productDetailsClickHandler2 != null) {
                productDetailsClickHandler2.e(productCard2);
                return;
            }
            return;
        }
        if (i == 3) {
            ProductDetailsClickHandler productDetailsClickHandler3 = this.J;
            if (productDetailsClickHandler3 != null) {
                productDetailsClickHandler3.W5();
                return;
            }
            return;
        }
        if (i == 4) {
            ProductDetailsClickHandler productDetailsClickHandler4 = this.J;
            if (productDetailsClickHandler4 != null) {
                productDetailsClickHandler4.k0();
                return;
            }
            return;
        }
        if (i != 5) {
            return;
        }
        ProductCard productCard3 = this.I;
        ProductDetailsClickHandler productDetailsClickHandler5 = this.J;
        if (productDetailsClickHandler5 != null) {
            productDetailsClickHandler5.h1(productCard3);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String label;
        boolean z;
        boolean z2;
        long j2;
        long j3;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        long j4;
        synchronized (this) {
            j = this.R;
            this.R = 0L;
        }
        ProductCard productCard = this.I;
        CollectionMode collectionMode = this.K;
        ProductCardButtonType productCardButtonType = this.L;
        long j5 = j & 34;
        if (j5 != 0) {
            z = productCard != null;
            if (j5 != 0) {
                j = z ? j | 8704 : j | 4352;
            }
            InStoreAvailabilityInfo inStoreAvailabilityInfo = productCard != null ? productCard.getInStoreAvailabilityInfo() : null;
            ButtonApiData button = inStoreAvailabilityInfo != null ? inStoreAvailabilityInfo.getButton() : null;
            label = button != null ? button.getLabel() : null;
        } else {
            label = null;
            z = false;
        }
        long j6 = j & 38;
        if (j6 != 0) {
            z2 = collectionMode instanceof CollectionMode.InStore;
            if (j6 != 0) {
                j = z2 ? j | 128 : j | 64;
            }
        } else {
            z2 = false;
        }
        if ((j & 48) != 0) {
            z3 = productCardButtonType == ProductCardButtonType.d;
            z4 = productCardButtonType == ProductCardButtonType.f;
            j2 = 34;
            z6 = productCardButtonType == ProductCardButtonType.h;
            z7 = productCardButtonType == ProductCardButtonType.e;
            j3 = 4352;
            z8 = productCardButtonType == ProductCardButtonType.i;
            z5 = productCardButtonType == ProductCardButtonType.g;
        } else {
            j2 = 34;
            j3 = 4352;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
            z7 = false;
            z8 = false;
        }
        if ((j & 128) != 0) {
            z = productCard != null;
            if ((j & j2) != 0) {
                j = z ? j | 8704 : j | j3;
            }
        }
        long j7 = j & 38;
        if (j7 != 0) {
            z9 = z2 ? z : false;
            if (j7 != 0) {
                j |= z9 ? llqqqql.ccc00630063c0063 : llqqqql.c00630063c0063c0063;
            }
        } else {
            z9 = false;
        }
        if ((9728 & j) != 0) {
            ProductTrolleyData trolley = productCard != null ? productCard.getTrolley() : null;
            z10 = (8192 & j) != 0 && trolley == null;
            z11 = ((1536 & j) == 0 || trolley == null) ? false : true;
        } else {
            z10 = false;
            z11 = false;
        }
        long j8 = j & j2;
        if (j8 != 0) {
            z12 = z ? z11 : false;
            if (!z) {
                z10 = false;
            }
        } else {
            z10 = false;
            z12 = false;
        }
        long j9 = j & 38;
        if (j9 != 0) {
            z13 = z9 ? true : z11;
        } else {
            z13 = false;
        }
        if ((j & 32) != 0) {
            j4 = j;
            this.z.setOnClickListener(this.M);
            this.A.setOnClickListener(this.Q);
            this.D.setOnClickListener(this.P);
            this.E.setOnClickListener(this.O);
            this.H.setOnClickListener(this.N);
        } else {
            j4 = j;
        }
        if (j8 != 0) {
            BindingAdaptersKt.a(this.z, productCard);
            TextViewBindingAdapter.b(this.A, label);
            BindingAdaptersKt.a(this.B, productCard);
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(this.D, z10);
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(this.E, z12);
            BindingAdaptersKt.b(this.H, productCard);
        }
        if ((j4 & 48) != 0) {
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(this.z, z3);
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(this.A, z5);
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(this.B, z4);
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(this.C.h, z6);
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(this.G, z8);
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(this.H, z7);
        }
        if (j9 != 0) {
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(this.F, z13);
        }
        this.C.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.R != 0) {
                    return true;
                }
                return this.C.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.R = 32L;
        }
        this.C.r();
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
            this.R |= 1;
        }
        return true;
    }
}
