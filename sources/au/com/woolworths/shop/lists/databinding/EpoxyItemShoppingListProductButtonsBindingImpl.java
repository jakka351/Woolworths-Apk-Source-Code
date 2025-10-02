package au.com.woolworths.shop.lists.databinding;

import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeBrandLabelBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabel;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.product.models.InStoreAvailabilityInfo;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductId;
import au.com.woolworths.product.models.ProductTaggedLabel;
import au.com.woolworths.product.models.ProductUnavailableLabel;
import au.com.woolworths.product.models.TagLabel;
import au.com.woolworths.shop.lists.generated.callback.OnClickListener;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListItemListener;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListProductItemState;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class EpoxyItemShoppingListProductButtonsBindingImpl extends EpoxyItemShoppingListProductButtonsBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts J;
    public final OnClickListener F;
    public final OnClickListener G;
    public final OnClickListener H;
    public long I;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(5);
        J = includedLayouts;
        includedLayouts.a(0, new int[]{4}, new int[]{R.layout.include_brand_label}, new String[]{"include_brand_label"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemShoppingListProductButtonsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 5, J, null);
        super(dataBindingComponent, view, (Button) objArrT[3], (Button) objArrT[1], (IncludeBrandLabelBinding) objArrT[4], (Button) objArrT[2]);
        this.I = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        IncludeBrandLabelBinding includeBrandLabelBinding = this.A;
        if (includeBrandLabelBinding != null) {
            includeBrandLabelBinding.n = this;
        }
        this.B.setTag(null);
        E(view);
        this.F = new OnClickListener(this, 2);
        this.G = new OnClickListener(this, 1);
        this.H = new OnClickListener(this, 3);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (157 == i) {
            this.D = (ShoppingListItemListener) obj;
            synchronized (this) {
                this.I |= 2;
            }
            h(157);
            y();
            return true;
        }
        if (53 == i) {
            this.C = (ProductItemUiModel) obj;
            synchronized (this) {
                this.I |= 4;
            }
            h(53);
            y();
            return true;
        }
        if (148 != i) {
            return false;
        }
        this.E = (ShoppingListProductItemState) obj;
        synchronized (this) {
            this.I |= 8;
        }
        h(148);
        y();
        return true;
    }

    @Override // au.com.woolworths.shop.lists.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        if (i == 1) {
            ShoppingListItemListener shoppingListItemListener = this.D;
            ProductItemUiModel productItemUiModel = this.C;
            if (shoppingListItemListener == null || productItemUiModel == null) {
                return;
            }
            shoppingListItemListener.e(productItemUiModel.i);
            return;
        }
        if (i == 2) {
            ShoppingListItemListener shoppingListItemListener2 = this.D;
            ProductItemUiModel productItemUiModel2 = this.C;
            if (shoppingListItemListener2 != null) {
                shoppingListItemListener2.B(productItemUiModel2);
                return;
            }
            return;
        }
        if (i != 3) {
            return;
        }
        ShoppingListItemListener shoppingListItemListener3 = this.D;
        ProductItemUiModel productItemUiModel3 = this.C;
        if (shoppingListItemListener3 != null) {
            shoppingListItemListener3.a(productItemUiModel3);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        long j2;
        boolean z;
        boolean zA;
        boolean zE;
        boolean zD;
        String str;
        BrandLabel brandLabel;
        float f;
        ProductCard productCard;
        ProductId productId;
        boolean z2;
        TagLabel tagLabel;
        InStoreAvailabilityInfo inStoreAvailabilityInfo;
        synchronized (this) {
            j = this.I;
            this.I = 0L;
        }
        ProductItemUiModel productItemUiModel = this.C;
        ShoppingListProductItemState shoppingListProductItemState = this.E;
        long j3 = 28 & j;
        boolean z3 = false;
        ProductCard productCard2 = null;
        if (j3 != 0) {
            if (productItemUiModel != null) {
                productId = productItemUiModel.g;
                f = productItemUiModel.h;
                productCard = productItemUiModel.i;
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
                productCard = null;
                productId = null;
            }
            if (shoppingListProductItemState != null) {
                boolean zB = shoppingListProductItemState.b(productId, f);
                boolean zC = shoppingListProductItemState.c(productCard);
                zE = shoppingListProductItemState.e(productCard);
                zD = shoppingListProductItemState.d(productCard);
                zA = shoppingListProductItemState.a(productCard);
                z2 = zB;
                z3 = zC;
            } else {
                zA = false;
                z2 = false;
                zE = false;
                zD = false;
            }
            if ((j & 20) != 0) {
                if (productCard != null) {
                    tagLabel = productCard.getTagLabel();
                    inStoreAvailabilityInfo = productCard.getInStoreAvailabilityInfo();
                } else {
                    tagLabel = null;
                    inStoreAvailabilityInfo = null;
                }
                j2 = 0;
                BrandLabel productTaggedLabel = tagLabel != null ? new ProductTaggedLabel(tagLabel) : ProductUnavailableLabel.DEFAULT;
                ButtonApiData button = inStoreAvailabilityInfo != null ? inStoreAvailabilityInfo.getButton() : null;
                String label = button != null ? button.getLabel() : null;
                brandLabel = productTaggedLabel;
                str = label;
            } else {
                j2 = 0;
                str = null;
                brandLabel = null;
            }
            productCard2 = productCard;
            z = z3;
            z3 = z2;
        } else {
            j2 = 0;
            z = false;
            zA = false;
            zE = false;
            zD = false;
            str = null;
            brandLabel = null;
        }
        if (j3 != 0) {
            this.y.setEnabled(z3);
            BindingAdaptersKt.o(this.y, zD);
            BindingAdaptersKt.o(this.z, zE);
            BindingAdaptersKt.o(this.A.h, z);
            BindingAdaptersKt.o(this.B, zA);
        }
        if ((16 & j) != j2) {
            this.y.setOnClickListener(this.H);
            this.z.setOnClickListener(this.G);
            this.A.M(1);
            this.B.setOnClickListener(this.F);
        }
        if ((j & 20) != j2) {
            au.com.woolworths.product.utils.BindingAdaptersKt.a(this.y, productCard2);
            TextViewBindingAdapter.b(this.z, str);
            this.A.L(brandLabel);
        }
        this.A.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.I != 0) {
                    return true;
                }
                return this.A.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.I = 16L;
        }
        this.A.r();
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
            this.I |= 1;
        }
        return true;
    }
}
