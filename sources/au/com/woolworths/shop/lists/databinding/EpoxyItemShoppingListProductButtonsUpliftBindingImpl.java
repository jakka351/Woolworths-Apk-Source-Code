package au.com.woolworths.shop.lists.databinding;

import android.content.Context;
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
import au.com.woolworths.product.models.ProductQuantityHelper;
import au.com.woolworths.product.models.ProductShoppingList;
import au.com.woolworths.product.models.ProductTaggedLabel;
import au.com.woolworths.product.models.ProductUnavailableLabel;
import au.com.woolworths.product.models.TagLabel;
import au.com.woolworths.shop.lists.generated.callback.OnClickListener;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListItemListener;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListProductItemState;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class EpoxyItemShoppingListProductButtonsUpliftBindingImpl extends EpoxyItemShoppingListProductButtonsUpliftBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts L;
    public final OnClickListener G;
    public final OnClickListener H;
    public final OnClickListener I;
    public final OnClickListener J;
    public long K;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(6);
        L = includedLayouts;
        includedLayouts.a(0, new int[]{5}, new int[]{R.layout.include_brand_label}, new String[]{"include_brand_label"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemShoppingListProductButtonsUpliftBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 6, L, null);
        super(dataBindingComponent, view, (Button) objArrT[3], (Button) objArrT[1], (IncludeBrandLabelBinding) objArrT[5], (Button) objArrT[2], (Button) objArrT[4]);
        this.K = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        IncludeBrandLabelBinding includeBrandLabelBinding = this.A;
        if (includeBrandLabelBinding != null) {
            includeBrandLabelBinding.n = this;
        }
        this.B.setTag(null);
        this.C.setTag(null);
        E(view);
        this.G = new OnClickListener(this, 4);
        this.H = new OnClickListener(this, 2);
        this.I = new OnClickListener(this, 3);
        this.J = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (157 == i) {
            N((ShoppingListItemListener) obj);
            return true;
        }
        if (53 == i) {
            L((ProductItemUiModel) obj);
            return true;
        }
        if (148 != i) {
            return false;
        }
        M((ShoppingListProductItemState) obj);
        return true;
    }

    @Override // au.com.woolworths.shop.lists.databinding.EpoxyItemShoppingListProductButtonsUpliftBinding
    public final void L(ProductItemUiModel productItemUiModel) throws Throwable {
        this.D = productItemUiModel;
        synchronized (this) {
            this.K |= 4;
        }
        h(53);
        y();
    }

    @Override // au.com.woolworths.shop.lists.databinding.EpoxyItemShoppingListProductButtonsUpliftBinding
    public final void M(ShoppingListProductItemState shoppingListProductItemState) throws Throwable {
        this.F = shoppingListProductItemState;
        synchronized (this) {
            this.K |= 8;
        }
        h(148);
        y();
    }

    @Override // au.com.woolworths.shop.lists.databinding.EpoxyItemShoppingListProductButtonsUpliftBinding
    public final void N(ShoppingListItemListener shoppingListItemListener) throws Throwable {
        this.E = shoppingListItemListener;
        synchronized (this) {
            this.K |= 2;
        }
        h(157);
        y();
    }

    @Override // au.com.woolworths.shop.lists.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        if (i == 1) {
            ShoppingListItemListener shoppingListItemListener = this.E;
            ProductItemUiModel productItemUiModel = this.D;
            if (shoppingListItemListener == null || productItemUiModel == null) {
                return;
            }
            shoppingListItemListener.e(productItemUiModel.i);
            return;
        }
        if (i == 2) {
            ShoppingListItemListener shoppingListItemListener2 = this.E;
            ProductItemUiModel productItemUiModel2 = this.D;
            if (shoppingListItemListener2 != null) {
                shoppingListItemListener2.B(productItemUiModel2);
                return;
            }
            return;
        }
        if (i == 3) {
            ShoppingListItemListener shoppingListItemListener3 = this.E;
            ProductItemUiModel productItemUiModel3 = this.D;
            if (shoppingListItemListener3 != null) {
                shoppingListItemListener3.a(productItemUiModel3);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        ShoppingListItemListener shoppingListItemListener4 = this.E;
        ProductItemUiModel productItemUiModel4 = this.D;
        if (shoppingListItemListener4 != null) {
            shoppingListItemListener4.F(productItemUiModel4);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        long j2;
        long j3;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean zA;
        boolean z4;
        boolean z5;
        String str;
        BrandLabel brandLabel;
        String str2;
        String str3;
        float f;
        ProductId productId;
        ProductCard productCard;
        boolean zB;
        boolean zC;
        boolean zE;
        boolean zD;
        boolean z6;
        String label;
        String quantityLabel;
        BrandLabel productTaggedLabel;
        ProductShoppingList productShoppingList;
        TagLabel tagLabel;
        InStoreAvailabilityInfo inStoreAvailabilityInfo;
        ProductShoppingList productShoppingList2;
        synchronized (this) {
            j = this.K;
            this.K = 0L;
        }
        ProductItemUiModel productItemUiModel = this.D;
        ShoppingListProductItemState shoppingListProductItemState = this.F;
        long j4 = 28 & j;
        ProductCard productCard2 = null;
        unitLabel = null;
        String unitLabel = null;
        String string = null;
        if (j4 != 0) {
            if (productItemUiModel != null) {
                productId = productItemUiModel.g;
                f = productItemUiModel.h;
                productCard = productItemUiModel.i;
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
                productId = null;
                productCard = null;
            }
            if (shoppingListProductItemState != null) {
                zB = shoppingListProductItemState.b(productId, f);
                zC = shoppingListProductItemState.c(productCard);
                zE = shoppingListProductItemState.e(productCard);
                zD = shoppingListProductItemState.d(productCard);
                zA = shoppingListProductItemState.a(productCard);
            } else {
                zA = false;
                zB = false;
                zC = false;
                zE = false;
                zD = false;
            }
            long j5 = j & 20;
            if (j5 != 0) {
                if (productCard != null) {
                    TagLabel tagLabel2 = productCard.getTagLabel();
                    InStoreAvailabilityInfo inStoreAvailabilityInfo2 = productCard.getInStoreAvailabilityInfo();
                    productShoppingList2 = productCard.getProductShoppingList();
                    tagLabel = tagLabel2;
                    inStoreAvailabilityInfo = inStoreAvailabilityInfo2;
                    j2 = 0;
                } else {
                    j2 = 0;
                    tagLabel = null;
                    inStoreAvailabilityInfo = null;
                    productShoppingList2 = null;
                }
                z6 = tagLabel == null;
                i = 1;
                productTaggedLabel = tagLabel != null ? new ProductTaggedLabel(tagLabel) : ProductUnavailableLabel.DEFAULT;
                ButtonApiData button = inStoreAvailabilityInfo != null ? inStoreAvailabilityInfo.getButton() : null;
                String unitLabel2 = productShoppingList2 != null ? productShoppingList2.getUnitLabel() : null;
                label = button != null ? button.getLabel() : null;
                quantityLabel = ProductQuantityHelper.getQuantityLabel(f, unitLabel2);
            } else {
                j2 = 0;
                i = 1;
                z6 = false;
                label = null;
                quantityLabel = null;
                productTaggedLabel = null;
            }
            if (j5 != 0) {
                z = productItemUiModel != null ? productItemUiModel.e : false;
                Context context = this.h.getContext();
                j3 = 20;
                Intrinsics.h(productItemUiModel, "<this>");
                Intrinsics.h(context, "context");
                float f2 = productItemUiModel.h;
                ProductCard productCard3 = productItemUiModel.i;
                if (productCard3 != null && (productShoppingList = productCard3.getProductShoppingList()) != null) {
                    unitLabel = productShoppingList.getUnitLabel();
                }
                string = context.getString(R.string.shop_lists_quantity_button_description, ProductQuantityHelper.getQuantityLabel(f2, unitLabel));
                Intrinsics.g(string, "getString(...)");
            } else {
                j3 = 20;
            }
            boolean z7 = zB;
            brandLabel = productTaggedLabel;
            z4 = z;
            z = z7;
            ProductCard productCard4 = productCard;
            str3 = string;
            productCard2 = productCard4;
            str = label;
            str2 = quantityLabel;
            z3 = zC;
            z2 = zE;
            z = zD;
            z5 = z6;
        } else {
            j2 = 0;
            j3 = 20;
            i = 1;
            z = false;
            z2 = false;
            z3 = false;
            zA = false;
            z4 = false;
            z5 = false;
            str = null;
            brandLabel = null;
            str2 = null;
            str3 = null;
        }
        if (j4 != 0) {
            this.y.setEnabled(z);
            BindingAdaptersKt.o(this.y, z);
            BindingAdaptersKt.o(this.z, z2);
            BindingAdaptersKt.o(this.A.h, z3);
            BindingAdaptersKt.o(this.B, zA);
        }
        if ((16 & j) != j2) {
            this.y.setOnClickListener(this.I);
            this.z.setOnClickListener(this.J);
            this.A.M(Integer.valueOf(i));
            this.B.setOnClickListener(this.H);
            this.C.setOnClickListener(this.G);
        }
        if ((j & j3) != j2) {
            au.com.woolworths.product.utils.BindingAdaptersKt.a(this.y, productCard2);
            TextViewBindingAdapter.b(this.z, str);
            this.A.L(brandLabel);
            TextViewBindingAdapter.b(this.C, str2);
            au.com.woolworths.shop.lists.ui.utils.BindingAdaptersKt.b(this.C, z4);
            BindingAdaptersKt.o(this.C, z5);
            if (ViewDataBinding.s >= 4) {
                this.C.setContentDescription(str3);
            }
        }
        this.A.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.K != 0) {
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
            this.K = 16L;
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
            this.K |= 1;
        }
        return true;
    }
}
