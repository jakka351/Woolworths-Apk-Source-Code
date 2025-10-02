package au.com.woolworths.shop.lists.databinding;

import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.CompoundButtonBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeBrandLabelBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.models.products.ProductListMarketplace;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabel;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.product.composeui.wrapper.ProductLocationInfoView;
import au.com.woolworths.product.composeui.wrapper.ProductLocationInfoViewKt;
import au.com.woolworths.product.databinding.IncludeProductMultibuyLabelBinding;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.MemberPriceInfo;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.offers.ProductsBoostView;
import au.com.woolworths.product.tile.ProductPriceView;
import au.com.woolworths.product.tile.ProductPriceViewKt;
import au.com.woolworths.product.ui.ProductMultiBuyLabel;
import au.com.woolworths.shop.lists.generated.callback.Function0;
import au.com.woolworths.shop.lists.generated.callback.OnCheckedChangeListener;
import au.com.woolworths.shop.lists.generated.callback.OnClickListener;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListItemListener;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListProductItemState;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel;
import com.airbnb.lottie.LottieAnimationView;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import com.woolworths.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class EpoxyItemShoppingListProductBindingImpl extends EpoxyItemShoppingListProductBinding implements Function0.Listener, OnCheckedChangeListener.Listener, OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts c0;
    public static final SparseIntArray d0;
    public final ConstraintLayout W;
    public final Space X;
    public final Function0 Y;
    public final OnCheckedChangeListener Z;
    public final OnClickListener a0;
    public long b0;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(21);
        c0 = includedLayouts;
        includedLayouts.a(0, new int[]{13, 14, 15, 16}, new int[]{R.layout.include_brand_label, R.layout.include_product_multibuy_label, R.layout.item_product_list_marketplace_details, R.layout.epoxy_item_shopping_list_product_buttons_uplift}, new String[]{"include_brand_label", "include_product_multibuy_label", "item_product_list_marketplace_details", "epoxy_item_shopping_list_product_buttons_uplift"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        d0 = sparseIntArray;
        sparseIntArray.put(R.id.multibuy_and_was_price_barrier, 17);
        sparseIntArray.put(R.id.more_menu, 18);
        sparseIntArray.put(R.id.more_menu_badge, 19);
        sparseIntArray.put(R.id.coachmark_focus, 20);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemShoppingListProductBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 21, c0, d0);
        ProductLocationInfoView productLocationInfoView = (ProductLocationInfoView) objArrT[4];
        ImageView imageView = (ImageView) objArrT[3];
        CheckBox checkBox = (CheckBox) objArrT[1];
        View view2 = (View) objArrT[20];
        EpoxyItemShoppingListProductButtonsUpliftBinding epoxyItemShoppingListProductButtonsUpliftBinding = (EpoxyItemShoppingListProductButtonsUpliftBinding) objArrT[16];
        ImageButton imageButton = (ImageButton) objArrT[18];
        LottieAnimationView lottieAnimationView = (LottieAnimationView) objArrT[19];
        super(dataBindingComponent, view, productLocationInfoView, imageView, checkBox, view2, epoxyItemShoppingListProductButtonsUpliftBinding, imageButton, lottieAnimationView, (TextView) objArrT[12], (ImageView) objArrT[2], (IncludeBrandLabelBinding) objArrT[13], (ItemProductListMarketplaceDetailsBinding) objArrT[15], (ComposeView) objArrT[10], (IncludeProductMultibuyLabelBinding) objArrT[14], (TextView) objArrT[6], (ProductPriceView) objArrT[7], (TextView) objArrT[8], (TextView) objArrT[9], (ProductsBoostView) objArrT[11]);
        this.b0 = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        EpoxyItemShoppingListProductButtonsUpliftBinding epoxyItemShoppingListProductButtonsUpliftBinding2 = this.C;
        if (epoxyItemShoppingListProductButtonsUpliftBinding2 != null) {
            epoxyItemShoppingListProductButtonsUpliftBinding2.n = this;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.W = constraintLayout;
        constraintLayout.setTag(null);
        Space space = (Space) objArrT[5];
        this.X = space;
        space.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        IncludeBrandLabelBinding includeBrandLabelBinding = this.H;
        if (includeBrandLabelBinding != null) {
            includeBrandLabelBinding.n = this;
        }
        ItemProductListMarketplaceDetailsBinding itemProductListMarketplaceDetailsBinding = this.I;
        if (itemProductListMarketplaceDetailsBinding != null) {
            itemProductListMarketplaceDetailsBinding.n = this;
        }
        this.J.setTag(null);
        IncludeProductMultibuyLabelBinding includeProductMultibuyLabelBinding = this.K;
        if (includeProductMultibuyLabelBinding != null) {
            includeProductMultibuyLabelBinding.n = this;
        }
        this.L.setTag(null);
        this.M.setTag(null);
        this.N.setTag(null);
        this.O.setTag(null);
        this.P.setTag(null);
        E(view);
        this.Y = new Function0(this, 3);
        this.Z = new OnCheckedChangeListener(this, 2);
        this.a0 = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (143 == i) {
            this.T = (Boolean) obj;
            synchronized (this) {
                this.b0 |= 16;
            }
            h(143);
            y();
            return true;
        }
        if (157 == i) {
            this.R = (ShoppingListItemListener) obj;
            synchronized (this) {
                this.b0 |= 32;
            }
            h(157);
            y();
            return true;
        }
        if (53 == i) {
            this.Q = (ProductItemUiModel) obj;
            synchronized (this) {
                this.b0 |= 64;
            }
            h(53);
            y();
            return true;
        }
        if (148 == i) {
            this.S = (ShoppingListProductItemState) obj;
            synchronized (this) {
                this.b0 |= 128;
            }
            h(148);
            y();
            return true;
        }
        if (109 == i) {
            this.U = ((Boolean) obj).booleanValue();
            synchronized (this) {
                this.b0 |= 256;
            }
            h(109);
            y();
            return true;
        }
        if (132 != i) {
            return false;
        }
        this.V = ((Boolean) obj).booleanValue();
        synchronized (this) {
            this.b0 |= 512;
        }
        h(132);
        y();
        return true;
    }

    @Override // au.com.woolworths.shop.lists.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        ShoppingListItemListener shoppingListItemListener = this.R;
        ProductItemUiModel productItemUiModel = this.Q;
        if (shoppingListItemListener != null) {
            shoppingListItemListener.c(productItemUiModel);
        }
    }

    @Override // au.com.woolworths.shop.lists.generated.callback.OnCheckedChangeListener.Listener
    public final void c(CompoundButton compoundButton, boolean z) {
        ShoppingListItemListener shoppingListItemListener = this.R;
        ProductItemUiModel productItemUiModel = this.Q;
        if (shoppingListItemListener != null) {
            shoppingListItemListener.d(productItemUiModel, z);
        }
    }

    @Override // au.com.woolworths.shop.lists.generated.callback.Function0.Listener
    public final void d() {
        ShoppingListItemListener shoppingListItemListener = this.R;
        ProductItemUiModel productItemUiModel = this.Q;
        if (shoppingListItemListener == null || productItemUiModel == null) {
            return;
        }
        shoppingListItemListener.M(productItemUiModel.i);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() throws Resources.NotFoundException {
        long j;
        long j2;
        boolean z;
        ShoppingListItemListener shoppingListItemListener;
        ShoppingListProductItemState shoppingListProductItemState;
        boolean z2;
        long j3;
        boolean z3;
        boolean z4;
        boolean z5;
        String str;
        boolean z6;
        boolean z7;
        boolean z8;
        String str2;
        String str3;
        boolean z9;
        ProductListMarketplace productListMarketplace;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        ProductCard productCard;
        String string;
        BrandLabel brandLabelK;
        String str4;
        boolean z14;
        String str5;
        String str6;
        Integer num;
        boolean z15;
        boolean z16;
        ProductCard productCard2;
        boolean zO;
        boolean z17;
        boolean z18;
        String str7;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        String str8;
        boolean zB;
        String str9;
        boolean z24;
        boolean z25;
        String str10;
        String str11;
        ProductListMarketplace productListMarketplace2;
        String str12;
        String str13;
        Integer num2;
        boolean z26;
        String str14;
        boolean z27;
        boolean z28;
        boolean z29;
        boolean z30;
        String unitPriceDescription;
        String productImage;
        ProductListMarketplace marketplace;
        String name;
        String disclaimer;
        String wasPrice;
        Integer price;
        MemberPriceInfo memberPriceInfo;
        String badgeImage;
        synchronized (this) {
            j = this.b0;
            this.b0 = 0L;
        }
        Boolean bool = this.T;
        ShoppingListItemListener shoppingListItemListener2 = this.R;
        ProductItemUiModel productItemUiModel = this.Q;
        ShoppingListProductItemState shoppingListProductItemState2 = this.S;
        boolean z31 = this.U;
        boolean z32 = this.V;
        boolean z33 = (j & 1040) != 0 ? !ViewDataBinding.B(bool) : false;
        if ((j & 1600) != 0) {
            long j4 = j & 1088;
            if (j4 == 0 || productItemUiModel == null) {
                j2 = 1040;
                z9 = false;
                z10 = false;
                zB = false;
            } else {
                z10 = productItemUiModel.e;
                zB = productItemUiModel.b();
                j2 = 1040;
                z9 = productItemUiModel.e;
            }
            ProductCard productCard3 = productItemUiModel != null ? productItemUiModel.i : null;
            if (j4 != 0) {
                if (productCard3 != null) {
                    unitPriceDescription = productCard3.getUnitPriceDescription();
                    productImage = productCard3.getProductImage();
                    marketplace = productCard3.getMarketplace();
                    name = productCard3.getName();
                    disclaimer = productCard3.getDisclaimer();
                    wasPrice = productCard3.getWasPrice();
                    price = productCard3.getPrice();
                    memberPriceInfo = productCard3.getMemberPriceInfo();
                    badgeImage = productCard3.getBadgeImage();
                } else {
                    unitPriceDescription = null;
                    productImage = null;
                    marketplace = null;
                    name = null;
                    disclaimer = null;
                    wasPrice = null;
                    price = null;
                    memberPriceInfo = null;
                    badgeImage = null;
                }
                boolean zS = ProductCardExtKt.s(productCard3);
                boolean zW = ProductCardExtKt.w(productCard3, ProductMultiBuyLabel.i);
                boolean zQ = ProductCardExtKt.q(productCard3);
                boolean z34 = (productCard3.getWasPrice() == null || productCard3.getTagLabel() != null || ProductCardExtKt.w(productCard3, ProductMultiBuyLabel.e)) ? false : true;
                long j5 = j;
                String string2 = this.N.getResources().getString(R.string.shop_lists_unit_price_text_description, unitPriceDescription);
                boolean z35 = marketplace != null;
                boolean z36 = name == null;
                z30 = disclaimer != null;
                boolean z37 = memberPriceInfo != null;
                boolean z38 = badgeImage != null;
                z15 = !zS;
                if (j4 != 0) {
                    j5 |= z36 ? 4096L : llqqqql.ccc00630063c0063;
                }
                if ((j5 & 1088) != 0) {
                    j5 = !zS ? j5 | llqqqql.c0063ccc00630063 : j5 | llqqqql.ccccc00630063;
                }
                z6 = z35;
                boolean z39 = z34;
                str9 = string2;
                j = j5;
                z29 = zQ;
                z28 = z38;
                z27 = zS;
                str14 = badgeImage;
                z26 = z37;
                num2 = price;
                str13 = wasPrice;
                str12 = disclaimer;
                string = name;
                productListMarketplace2 = marketplace;
                str11 = productImage;
                str10 = unitPriceDescription;
                z25 = z36;
                z12 = zW;
                z24 = z39;
            } else {
                str9 = null;
                z6 = false;
                z24 = false;
                z12 = false;
                z25 = false;
                str10 = null;
                str11 = null;
                productListMarketplace2 = null;
                string = null;
                str12 = null;
                str13 = null;
                num2 = null;
                z26 = false;
                str14 = null;
                z27 = false;
                z28 = false;
                z29 = false;
                z30 = false;
                z15 = false;
            }
            boolean z40 = z26;
            z = z33;
            z3 = z40;
            String str15 = str14;
            str4 = str9;
            str = str15;
            String str16 = str13;
            shoppingListItemListener = shoppingListItemListener2;
            z7 = z28;
            str5 = str16;
            String str17 = str11;
            z2 = z31;
            str2 = str17;
            String str18 = str12;
            brandLabelK = ProductCardExtKt.k(productCard3, z32);
            str3 = str18;
            ProductListMarketplace productListMarketplace3 = productListMarketplace2;
            productCard = productCard3;
            productListMarketplace = productListMarketplace3;
            boolean z41 = z27;
            z14 = z24;
            z11 = z41;
            num = num2;
            shoppingListProductItemState = shoppingListProductItemState2;
            z8 = z30;
            long j6 = j;
            z4 = zB;
            z13 = z25;
            z5 = z29;
            str6 = str10;
            j3 = j6;
        } else {
            j2 = 1040;
            z = z33;
            shoppingListItemListener = shoppingListItemListener2;
            shoppingListProductItemState = shoppingListProductItemState2;
            z2 = z31;
            j3 = j;
            z3 = false;
            z4 = false;
            z5 = false;
            str = null;
            z6 = false;
            z7 = false;
            z8 = false;
            str2 = null;
            str3 = null;
            z9 = false;
            productListMarketplace = null;
            z10 = false;
            z11 = false;
            z12 = false;
            z13 = false;
            productCard = null;
            string = null;
            brandLabelK = null;
            str4 = null;
            z14 = false;
            str5 = null;
            str6 = null;
            num = null;
            z15 = false;
        }
        long j7 = j3 & 1344;
        if (j7 != 0 && j7 != 0) {
            j3 = z2 ? j3 | llqqqql.c0063006300630063c0063 : j3 | 8192;
        }
        if ((j3 & llqqqql.c0063006300630063c0063) != 0) {
            z16 = z4;
            productCard2 = productItemUiModel != null ? productItemUiModel.i : productCard;
            zO = ProductCardExtKt.o(productCard2);
        } else {
            z16 = z4;
            productCard2 = productCard;
            zO = false;
        }
        long j8 = j3 & 1088;
        if (j8 != 0) {
            if (z13) {
                z18 = z12;
                z17 = z9;
                string = this.L.getResources().getString(R.string.shop_lists_list_no_product_detail);
            } else {
                z17 = z9;
                z18 = z12;
            }
            str7 = string;
        } else {
            z17 = z9;
            z18 = z12;
            str7 = null;
        }
        boolean z42 = (j3 & llqqqql.c0063ccc00630063) != 0 ? !z5 : false;
        long j9 = j3 & 1344;
        if (j9 != 0) {
            if (!z2) {
                zO = false;
            }
            z19 = z42;
            z20 = zO;
        } else {
            z19 = z42;
            z20 = false;
        }
        if (j8 != 0) {
            if (!z15) {
                z19 = false;
            }
            boolean z43 = z19;
            z21 = z20;
            z22 = z43;
        } else {
            z21 = z20;
            z22 = false;
        }
        if ((j3 & llqqqql.c00630063c0063c0063) != 0) {
            str8 = str7;
            ProductLocationInfoView productLocationInfoView = this.y;
            z23 = z3;
            Intrinsics.h(productLocationInfoView, "<this>");
            productLocationInfoView.setApplyPlaceholder(false);
            ProductLocationInfoViewKt.a(this.y, this.Y);
            this.A.setOnCheckedChangeListener(this.Z);
            this.W.setOnClickListener(this.a0);
            this.K.L(ProductMultiBuyLabel.i);
        } else {
            z23 = z3;
            str8 = str7;
        }
        if (j8 != 0) {
            ProductLocationInfoViewKt.c(this.y, productCard2);
            BindingAdaptersKt.o(this.y, z5);
            BindingAdaptersKt.d(this.z, str);
            BindingAdaptersKt.o(this.z, z7);
            CompoundButtonBindingAdapter.a(this.A, z10);
            this.C.L(productItemUiModel);
            BindingAdaptersKt.o(this.X, z22);
            TextViewBindingAdapter.b(this.F, str3);
            BindingAdaptersKt.o(this.F, z8);
            ImageView imageView = this.G;
            d.z(this.G, R.drawable.ic_product_image_unavailable, imageView, str2, AppCompatResources.b(R.drawable.ic_product_image_loading, imageView.getContext()));
            BindingAdaptersKt.o(this.H.h, z11);
            this.I.L(productListMarketplace);
            BindingAdaptersKt.o(this.I.h, z6);
            BindingAdaptersKt.o(this.J, z23);
            this.K.M(productCard2);
            boolean z44 = z17;
            au.com.woolworths.shop.lists.ui.utils.BindingAdaptersKt.b(this.K.h, z44);
            BindingAdaptersKt.o(this.K.h, z18);
            TextViewBindingAdapter.b(this.L, str8);
            au.com.woolworths.shop.lists.ui.utils.BindingAdaptersKt.a(this.L, z10);
            au.com.woolworths.shop.lists.ui.utils.BindingAdaptersKt.b(this.L, z44);
            au.com.woolworths.shop.lists.ui.utils.BindingAdaptersKt.b(this.M, z44);
            boolean z45 = z16;
            BindingAdaptersKt.o(this.M, z45);
            ProductPriceViewKt.a(this.M, num, null);
            TextViewBindingAdapter.b(this.N, str6);
            au.com.woolworths.shop.lists.ui.utils.BindingAdaptersKt.b(this.N, z44);
            BindingAdaptersKt.o(this.N, z45);
            TextViewBindingAdapter.b(this.O, str5);
            au.com.woolworths.shop.lists.ui.utils.BindingAdaptersKt.b(this.O, z44);
            BindingAdaptersKt.o(this.O, z14);
            this.P.setProduct(productCard2);
            if (ViewDataBinding.s >= 4) {
                this.N.setContentDescription(str4);
            }
        }
        if (j9 != 0) {
            ProductLocationInfoViewKt.b(this.y, z21);
        }
        if ((j3 & j2) != 0) {
            BindingAdaptersKt.o(this.A, z);
        }
        if ((j3 & 1152) != 0) {
            this.C.M(shoppingListProductItemState);
        }
        if ((j3 & 1056) != 0) {
            this.C.N(shoppingListItemListener);
        }
        if ((j3 & 1600) != 0) {
            this.H.L(brandLabelK);
        }
        this.H.k();
        this.K.k();
        this.I.k();
        this.C.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.b0 != 0) {
                    return true;
                }
                return this.H.p() || this.K.p() || this.I.p() || this.C.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.b0 = llqqqql.c00630063c0063c0063;
        }
        this.H.r();
        this.K.r();
        this.I.r();
        this.C.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.b0 |= 1;
            }
            return true;
        }
        if (i == 1) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.b0 |= 2;
            }
            return true;
        }
        if (i == 2) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.b0 |= 4;
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
            this.b0 |= 8;
        }
        return true;
    }
}
