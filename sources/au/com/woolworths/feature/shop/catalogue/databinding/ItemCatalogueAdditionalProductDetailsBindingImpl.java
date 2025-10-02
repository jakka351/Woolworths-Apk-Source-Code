package au.com.woolworths.feature.shop.catalogue.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.databinding.adapters.ViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.common.imageloading.ImageLoaderListener;
import au.com.woolworths.feature.shop.catalogue.generated.callback.OnClickListener;
import au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListViewModel;
import au.com.woolworths.feature.shop.catalogue.productlist.additionalproducts.AdditionalItemInfo;
import au.com.woolworths.feature.shop.catalogue.productlist.additionalproducts.AdditionalProductItemState;
import au.com.woolworths.product.models.ProductCard;
import com.woolworths.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class ItemCatalogueAdditionalProductDetailsBindingImpl extends ItemCatalogueAdditionalProductDetailsBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts N;
    public static final SparseIntArray O;
    public final ConstraintLayout H;
    public final TextView I;
    public final OnClickListener J;
    public final OnClickListener K;
    public final OnClickListener L;
    public long M;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(8);
        N = includedLayouts;
        includedLayouts.a(0, new int[]{6}, new int[]{R.layout.include_cart_button}, new String[]{"include_cart_button"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(R.id.store_icon_guideline, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ItemCatalogueAdditionalProductDetailsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 8, N, O);
        IncludeCartButtonBinding includeCartButtonBinding = (IncludeCartButtonBinding) objArrT[6];
        TextView textView = (TextView) objArrT[2];
        ImageView imageView = (ImageView) objArrT[1];
        Button button = (Button) objArrT[4];
        Button button2 = (Button) objArrT[3];
        super(dataBindingComponent, view, includeCartButtonBinding, textView, imageView, button, button2);
        this.M = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.H = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView2 = (TextView) objArrT[5];
        this.I = textView2;
        textView2.setTag(null);
        IncludeCartButtonBinding includeCartButtonBinding2 = this.y;
        if (includeCartButtonBinding2 != null) {
            includeCartButtonBinding2.n = this;
        }
        this.z.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        E(view);
        this.J = new OnClickListener(this, 1);
        this.K = new OnClickListener(this, 3);
        this.L = new OnClickListener(this, 2);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (106 == i) {
            this.F = (ImageLoaderListener) obj;
            synchronized (this) {
                this.M |= 2;
            }
            h(106);
            y();
            return true;
        }
        if (148 == i) {
            L((AdditionalProductItemState) obj);
            return true;
        }
        if (273 != i) {
            return false;
        }
        M((CatalogueProductListViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.catalogue.databinding.ItemCatalogueAdditionalProductDetailsBinding
    public final void L(AdditionalProductItemState additionalProductItemState) throws Throwable {
        this.D = additionalProductItemState;
        synchronized (this) {
            this.M |= 4;
        }
        h(148);
        y();
    }

    @Override // au.com.woolworths.feature.shop.catalogue.databinding.ItemCatalogueAdditionalProductDetailsBinding
    public final void M(CatalogueProductListViewModel catalogueProductListViewModel) throws Throwable {
        this.E = catalogueProductListViewModel;
        synchronized (this) {
            this.M |= 8;
        }
        h(273);
        y();
    }

    @Override // au.com.woolworths.feature.shop.catalogue.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        if (i == 1) {
            AdditionalProductItemState additionalProductItemState = this.D;
            CatalogueProductListViewModel catalogueProductListViewModel = this.E;
            if (catalogueProductListViewModel != null) {
                catalogueProductListViewModel.t6(additionalProductItemState);
                return;
            }
            return;
        }
        if (i == 2) {
            AdditionalProductItemState additionalProductItemState2 = this.D;
            CatalogueProductListViewModel catalogueProductListViewModel2 = this.E;
            if (catalogueProductListViewModel2 == null || additionalProductItemState2 == null) {
                return;
            }
            catalogueProductListViewModel2.h1(additionalProductItemState2.b);
            return;
        }
        if (i != 3) {
            return;
        }
        AdditionalProductItemState additionalProductItemState3 = this.D;
        CatalogueProductListViewModel catalogueProductListViewModel3 = this.E;
        if (catalogueProductListViewModel3 == null || additionalProductItemState3 == null) {
            return;
        }
        catalogueProductListViewModel3.h1(additionalProductItemState3.b);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        long j2;
        long j3;
        String str;
        String str2;
        ProductCard productCard;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        long j4;
        AdditionalProductItemState.CartButton cartButton;
        boolean z5;
        boolean z6;
        AdditionalProductItemState.Buttons buttons;
        AdditionalProductItemState.ListButton listButton;
        synchronized (this) {
            j = this.M;
            this.M = 0L;
        }
        ImageLoaderListener imageLoaderListener = this.F;
        AdditionalProductItemState additionalProductItemState = this.D;
        CatalogueProductListViewModel catalogueProductListViewModel = this.E;
        long j5 = 22 & j;
        AdditionalProductItemState.CartButton cartButton2 = null;
        if (j5 != 0) {
            long j6 = j & 20;
            if (j6 != 0) {
                if (additionalProductItemState != null) {
                    buttons = additionalProductItemState.c;
                    productCard = additionalProductItemState.b;
                } else {
                    buttons = null;
                    productCard = null;
                }
                j2 = 0;
                Intrinsics.h(additionalProductItemState, "<this>");
                boolean z7 = !(additionalProductItemState.c == null);
                z2 = additionalProductItemState.c == null;
                j3 = 20;
                if (buttons != null) {
                    cartButton = buttons.b;
                    listButton = buttons.f6930a;
                } else {
                    cartButton = null;
                    listButton = null;
                }
                AdditionalProductItemState.ListButton.State state = listButton != null ? listButton.f6932a : null;
                boolean z8 = state == AdditionalProductItemState.ListButton.State.e;
                z4 = z7;
                z5 = state == AdditionalProductItemState.ListButton.State.d;
                z6 = z8;
            } else {
                j2 = 0;
                j3 = 20;
                cartButton = null;
                productCard = null;
                z5 = false;
                z2 = false;
                z4 = false;
                z6 = false;
            }
            AdditionalItemInfo additionalItemInfo = additionalProductItemState != null ? additionalProductItemState.f6929a : null;
            str2 = (j6 == 0 || additionalItemInfo == null) ? null : additionalItemInfo.f6928a;
            cartButton2 = cartButton;
            str = additionalItemInfo != null ? additionalItemInfo.d : null;
            z3 = z5;
            z = z6;
        } else {
            j2 = 0;
            j3 = 20;
            str = null;
            str2 = null;
            productCard = null;
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
        }
        long j7 = 24 & j;
        if ((j & j3) != j2) {
            this.H.setFocusable(z4);
            j4 = j;
            ViewBindingAdapter.b(this.H, this.J, z4);
            BindingAdaptersKt.o(this.I, z2);
            this.y.L(cartButton2);
            this.y.N(productCard);
            TextViewBindingAdapter.b(this.z, str2);
            BindingAdaptersKt.o(this.B, z);
            BindingAdaptersKt.o(this.C, z3);
        } else {
            j4 = j;
        }
        if (j7 != j2) {
            this.y.M(catalogueProductListViewModel);
        }
        if (j5 != 0) {
            BindingAdaptersKt.e(this.A, str, imageLoaderListener);
        }
        if ((j4 & 16) != j2) {
            this.B.setOnClickListener(this.K);
            this.C.setOnClickListener(this.L);
        }
        this.y.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.M != 0) {
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
            this.M = 16L;
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
            this.M |= 1;
        }
        return true;
    }
}
