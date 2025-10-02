package au.com.woolworths.feature.shop.catalogue.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.shop.catalogue.generated.callback.OnClickListener;
import au.com.woolworths.feature.shop.catalogue.productlist.PrimaryButtonClickListener;
import au.com.woolworths.feature.shop.catalogue.productlist.additionalproducts.AdditionalProductItemState;
import au.com.woolworths.product.databinding.StockIndicatorBinding;
import au.com.woolworths.product.models.ProductCard;
import com.google.apphosting.datastore.testing.DatastoreTestTrace;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class IncludeCartButtonBindingImpl extends IncludeCartButtonBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts O;
    public final OnClickListener J;
    public final OnClickListener K;
    public final OnClickListener L;
    public final OnClickListener M;
    public long N;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(8);
        O = includedLayouts;
        includedLayouts.a(0, new int[]{7}, new int[]{R.layout.stock_indicator}, new String[]{"stock_indicator"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IncludeCartButtonBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 8, O, null);
        super(dataBindingComponent, view, (Button) objArrT[4], (FrameLayout) objArrT[0], (Button) objArrT[6], (Button) objArrT[3], (StockIndicatorBinding) objArrT[7], (Button) objArrT[1], (Button) objArrT[2], (Button) objArrT[5]);
        this.N = -1L;
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
        E(view);
        this.J = new OnClickListener(this, 3);
        this.K = new OnClickListener(this, 1);
        this.L = new OnClickListener(this, 4);
        this.M = new OnClickListener(this, 2);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (203 == i) {
            N((ProductCard) obj);
            return true;
        }
        if (201 == i) {
            M((PrimaryButtonClickListener) obj);
            return true;
        }
        if (31 != i) {
            return false;
        }
        L((AdditionalProductItemState.CartButton) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.catalogue.databinding.IncludeCartButtonBinding
    public final void L(AdditionalProductItemState.CartButton cartButton) throws Throwable {
        this.H = cartButton;
        synchronized (this) {
            this.N |= 8;
        }
        h(31);
        y();
    }

    @Override // au.com.woolworths.feature.shop.catalogue.databinding.IncludeCartButtonBinding
    public final void M(PrimaryButtonClickListener primaryButtonClickListener) throws Throwable {
        this.I = primaryButtonClickListener;
        synchronized (this) {
            this.N |= 4;
        }
        h(201);
        y();
    }

    @Override // au.com.woolworths.feature.shop.catalogue.databinding.IncludeCartButtonBinding
    public final void N(ProductCard productCard) throws Throwable {
        this.G = productCard;
        synchronized (this) {
            this.N |= 2;
        }
        h(DatastoreTestTrace.FirestoreV1Action.MATCHING_DOCUMENTS_FIELD_NUMBER);
        y();
    }

    @Override // au.com.woolworths.feature.shop.catalogue.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        if (i == 1) {
            ProductCard productCard = this.G;
            PrimaryButtonClickListener primaryButtonClickListener = this.I;
            if (primaryButtonClickListener != null) {
                primaryButtonClickListener.b2(productCard);
                return;
            }
            return;
        }
        if (i == 2) {
            ProductCard productCard2 = this.G;
            PrimaryButtonClickListener primaryButtonClickListener2 = this.I;
            if (primaryButtonClickListener2 != null) {
                primaryButtonClickListener2.K4(productCard2);
                return;
            }
            return;
        }
        if (i == 3) {
            ProductCard productCard3 = this.G;
            PrimaryButtonClickListener primaryButtonClickListener3 = this.I;
            if (primaryButtonClickListener3 != null) {
                primaryButtonClickListener3.K4(productCard3);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        ProductCard productCard4 = this.G;
        PrimaryButtonClickListener primaryButtonClickListener4 = this.I;
        if (primaryButtonClickListener4 != null) {
            primaryButtonClickListener4.i3(productCard4);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        long j2;
        long j3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        String str;
        String str2;
        String str3;
        AdditionalProductItemState.CartButton.State state;
        synchronized (this) {
            j = this.N;
            this.N = 0L;
        }
        AdditionalProductItemState.CartButton cartButton = this.H;
        long j4 = j & 24;
        if (j4 != 0) {
            if (cartButton != null) {
                str = cartButton.b;
                str2 = cartButton.c;
                str3 = cartButton.d;
                state = cartButton.f6931a;
            } else {
                state = null;
                str = null;
                str2 = null;
                str3 = null;
            }
            boolean z9 = str == null;
            j2 = 0;
            z2 = state == AdditionalProductItemState.CartButton.State.f;
            z3 = state == AdditionalProductItemState.CartButton.State.h;
            j3 = 24;
            z4 = state == AdditionalProductItemState.CartButton.State.e;
            z5 = state == AdditionalProductItemState.CartButton.State.j;
            z7 = state == AdditionalProductItemState.CartButton.State.g;
            boolean z10 = state == AdditionalProductItemState.CartButton.State.d;
            boolean z11 = state == AdditionalProductItemState.CartButton.State.i;
            if (j4 != 0) {
                j |= z9 ? 64L : 32L;
            }
            z = z10;
            z8 = z9;
            z6 = z11;
        } else {
            j2 = 0;
            j3 = 24;
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
            z7 = false;
            z8 = false;
            str = null;
            str2 = null;
            str3 = null;
        }
        long j5 = j & j3;
        String string = j5 != j2 ? z8 ? this.E.getResources().getString(R.string.unavailable) : str : null;
        if ((j & 16) != j2) {
            this.y.setOnClickListener(this.M);
            this.A.setOnClickListener(this.L);
            this.D.setOnClickListener(this.K);
            this.F.setOnClickListener(this.J);
        }
        if (j5 != j2) {
            TextViewBindingAdapter.b(this.y, str);
            BindingAdaptersKt.o(this.y, z7);
            BindingAdaptersKt.o(this.A, z5);
            TextViewBindingAdapter.b(this.B, str);
            BindingAdaptersKt.o(this.B, z2);
            BindingAdaptersKt.o(this.C.h, z);
            TextViewBindingAdapter.b(this.D, str);
            BindingAdaptersKt.o(this.D, z6);
            TextViewBindingAdapter.b(this.E, string);
            BindingAdaptersKt.o(this.E, z4);
            BindingAdaptersKt.o(this.F, z3);
            au.com.woolworths.product.utils.BindingAdaptersKt.c(this.F, str2, str3);
        }
        this.C.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.N != 0) {
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
            this.N = 16L;
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
            this.N |= 1;
        }
        return true;
    }
}
