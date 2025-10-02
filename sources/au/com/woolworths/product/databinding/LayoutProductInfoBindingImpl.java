package au.com.woolworths.product.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeBrandLabelBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabel;
import au.com.woolworths.base.shopapp.bindings.TextViewBindingsKt;
import au.com.woolworths.base.shopapp.customviews.InlineLabel;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.offers.ProductsBoostView;
import au.com.woolworths.product.offers.ProductsBoostViewListener;
import au.com.woolworths.product.tile.ProductPriceView;
import au.com.woolworths.product.tile.ProductPriceViewKt;
import au.com.woolworths.product.ui.ProductListPromotionLabel;
import au.com.woolworths.product.ui.ProductMultiBuyLabel;
import com.woolworths.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class LayoutProductInfoBindingImpl extends LayoutProductInfoBinding {
    public static final ViewDataBinding.IncludedLayouts S;
    public static final SparseIntArray T;
    public final ConstraintLayout Q;
    public long R;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(14);
        S = includedLayouts;
        includedLayouts.a(0, new int[]{10, 11}, new int[]{R.layout.include_brand_label, R.layout.include_product_multibuy_label}, new String[]{"include_brand_label", "include_product_multibuy_label"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        T = sparseIntArray;
        sparseIntArray.put(R.id.start_guideline, 12);
        sparseIntArray.put(R.id.member_price_compose_view, 13);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LayoutProductInfoBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 14, S, T);
        ImageView imageView = (ImageView) objArrT[3];
        ComposeView composeView = (ComposeView) objArrT[13];
        ImageView imageView2 = (ImageView) objArrT[2];
        IncludeBrandLabelBinding includeBrandLabelBinding = (IncludeBrandLabelBinding) objArrT[10];
        IncludeProductMultibuyLabelBinding includeProductMultibuyLabelBinding = (IncludeProductMultibuyLabelBinding) objArrT[11];
        TextView textView = (TextView) objArrT[4];
        ProductPriceView productPriceView = (ProductPriceView) objArrT[5];
        TextView textView2 = (TextView) objArrT[8];
        TextView textView3 = (TextView) objArrT[6];
        TextView textView4 = (TextView) objArrT[1];
        TextView textView5 = (TextView) objArrT[7];
        ProductsBoostView productsBoostView = (ProductsBoostView) objArrT[9];
        super(dataBindingComponent, view, imageView, composeView, imageView2, includeBrandLabelBinding, includeProductMultibuyLabelBinding, textView, productPriceView, textView2, textView3, textView4, textView5, productsBoostView);
        this.R = -1L;
        this.y.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.Q = constraintLayout;
        constraintLayout.setTag(null);
        this.A.setTag(null);
        IncludeBrandLabelBinding includeBrandLabelBinding2 = this.B;
        if (includeBrandLabelBinding2 != null) {
            includeBrandLabelBinding2.n = this;
        }
        IncludeProductMultibuyLabelBinding includeProductMultibuyLabelBinding2 = this.C;
        if (includeProductMultibuyLabelBinding2 != null) {
            includeProductMultibuyLabelBinding2.n = this;
        }
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.J.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.B.D(lifecycleOwner);
        this.C.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (69 == i) {
            M(((Boolean) obj).booleanValue());
            return true;
        }
        if (132 == i) {
            N(((Boolean) obj).booleanValue());
            return true;
        }
        if (206 == i) {
            O((ProductCardConfig) obj);
            return true;
        }
        if (20 == i) {
            L((ProductsBoostViewListener) obj);
            return true;
        }
        if (208 != i) {
            return false;
        }
        P((ProductCard) obj);
        return true;
    }

    @Override // au.com.woolworths.product.databinding.LayoutProductInfoBinding
    public final void L(ProductsBoostViewListener productsBoostViewListener) throws Throwable {
        this.M = productsBoostViewListener;
        synchronized (this) {
            this.R |= 32;
        }
        h(20);
        y();
    }

    @Override // au.com.woolworths.product.databinding.LayoutProductInfoBinding
    public final void M(boolean z) throws Throwable {
        this.N = z;
        synchronized (this) {
            this.R |= 4;
        }
        h(69);
        y();
    }

    @Override // au.com.woolworths.product.databinding.LayoutProductInfoBinding
    public final void N(boolean z) throws Throwable {
        this.O = z;
        synchronized (this) {
            this.R |= 8;
        }
        h(132);
        y();
    }

    @Override // au.com.woolworths.product.databinding.LayoutProductInfoBinding
    public final void O(ProductCardConfig productCardConfig) throws Throwable {
        this.L = productCardConfig;
        synchronized (this) {
            this.R |= 16;
        }
        h(206);
        y();
    }

    @Override // au.com.woolworths.product.databinding.LayoutProductInfoBinding
    public final void P(ProductCard productCard) throws Throwable {
        this.K = productCard;
        synchronized (this) {
            this.R |= 64;
        }
        h(208);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        long j2;
        long j3;
        boolean z;
        long j4;
        ProductCardConfig productCardConfig;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean zW;
        boolean z5;
        boolean z6;
        boolean z7;
        Integer num;
        String str;
        String strM;
        BrandLabel brandLabelK;
        InlineLabel inlineLabel;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        ProductsBoostViewListener productsBoostViewListener;
        boolean z8;
        String str8;
        BrandLabel brandLabel;
        boolean z9;
        boolean z10;
        boolean z11;
        InlineLabel inlineLabelF;
        String unitOfMeasureLabel;
        String pricingFootnoteMd;
        String purchaseWarning;
        String wasPrice;
        String productImage;
        String unitPriceDescription;
        String badgeImage;
        Integer price;
        synchronized (this) {
            j = this.R;
            this.R = 0L;
        }
        boolean z12 = this.N;
        boolean z13 = this.O;
        ProductCardConfig productCardConfig2 = this.L;
        ProductsBoostViewListener productsBoostViewListener2 = this.M;
        ProductCard productCard = this.K;
        boolean zIsInstoreMode = ((j & 208) == 0 || productCardConfig2 == null) ? false : productCardConfig2.isInstoreMode();
        if ((216 & j) != 0) {
            long j5 = j & 192;
            if (j5 != 0) {
                Intrinsics.h(productCard, "<this>");
                BrandLabel brandLabelK2 = ProductCardExtKt.k(productCard, false);
                j2 = 208;
                zW = ProductCardExtKt.w(productCard, ProductMultiBuyLabel.g);
                inlineLabelF = ProductCardExtKt.f(productCard, true);
                unitOfMeasureLabel = productCard.getUnitOfMeasureLabel();
                pricingFootnoteMd = productCard.getPricingFootnoteMd();
                purchaseWarning = productCard.getPurchaseWarning();
                wasPrice = productCard.getWasPrice();
                productImage = productCard.getProductImage();
                unitPriceDescription = productCard.getUnitPriceDescription();
                badgeImage = productCard.getBadgeImage();
                price = productCard.getPrice();
                z5 = brandLabelK2 != ProductListPromotionLabel.k;
                z6 = pricingFootnoteMd != null;
                z10 = purchaseWarning != null;
                z11 = wasPrice != null;
                z7 = unitPriceDescription != null;
                z9 = price != null;
                if (j5 != 0) {
                    j |= z7 ? 512L : 256L;
                }
            } else {
                j2 = 208;
                zW = false;
                z5 = false;
                z6 = false;
                z9 = false;
                z10 = false;
                z11 = false;
                z7 = false;
                inlineLabelF = null;
                unitOfMeasureLabel = null;
                pricingFootnoteMd = null;
                purchaseWarning = null;
                wasPrice = null;
                productImage = null;
                unitPriceDescription = null;
                badgeImage = null;
                price = null;
            }
            if ((j & j2) != 0) {
                j3 = 200;
                strM = ProductCardExtKt.m(productCard, ProductMultiBuyLabel.g, zIsInstoreMode, this.h.getContext());
            } else {
                j3 = 200;
                strM = null;
            }
            if ((j & j3) != 0) {
                brandLabelK = ProductCardExtKt.k(productCard, z13);
                inlineLabel = inlineLabelF;
                str3 = unitOfMeasureLabel;
                str4 = pricingFootnoteMd;
                str5 = purchaseWarning;
                str6 = wasPrice;
                str = productImage;
                str7 = unitPriceDescription;
                str2 = badgeImage;
            } else {
                inlineLabel = inlineLabelF;
                str3 = unitOfMeasureLabel;
                str4 = pricingFootnoteMd;
                str5 = purchaseWarning;
                str6 = wasPrice;
                str = productImage;
                str7 = unitPriceDescription;
                str2 = badgeImage;
                brandLabelK = null;
            }
            z = z12;
            j4 = j;
            productCardConfig = productCardConfig2;
            num = price;
            z3 = z9;
            z4 = z10;
            z2 = z11;
        } else {
            j2 = 208;
            j3 = 200;
            z = z12;
            j4 = j;
            productCardConfig = productCardConfig2;
            z2 = false;
            z3 = false;
            z4 = false;
            zW = false;
            z5 = false;
            z6 = false;
            z7 = false;
            num = null;
            str = null;
            strM = null;
            brandLabelK = null;
            inlineLabel = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            str7 = null;
        }
        long j6 = j4 & 192;
        if (j6 != 0) {
            productsBoostViewListener = productsBoostViewListener2;
            z8 = z7 ? z3 : false;
        } else {
            productsBoostViewListener = productsBoostViewListener2;
            z8 = false;
        }
        if (j6 != 0) {
            brandLabel = brandLabelK;
            BindingAdaptersKt.d(this.y, str2);
            ImageView imageView = this.A;
            str8 = strM;
            d.z(this.A, R.drawable.ic_product_image_unavailable, imageView, str, AppCompatResources.b(R.drawable.ic_product_image_loading, imageView.getContext()));
            BindingAdaptersKt.o(this.B.h, z5);
            this.C.M(productCard);
            BindingAdaptersKt.o(this.C.h, zW);
            TextViewBindingsKt.c(this.D, inlineLabel, false);
            BindingAdaptersKt.o(this.E, z3);
            ProductPriceViewKt.a(this.E, num, str3);
            BindingAdaptersKt.o(this.F, z6);
            BindingAdaptersKt.l(this.F, str4, false, null, null);
            TextViewBindingAdapter.b(this.G, str7);
            BindingAdaptersKt.o(this.G, z8);
            this.H.setText(str5);
            BindingAdaptersKt.o(this.H, z4);
            TextViewBindingAdapter.b(this.I, str6);
            BindingAdaptersKt.o(this.I, z2);
            this.J.setProduct(productCard);
        } else {
            str8 = strM;
            brandLabel = brandLabelK;
        }
        if ((j4 & j2) != 0 && ViewDataBinding.s >= 4) {
            this.Q.setContentDescription(str8);
        }
        if ((j4 & j3) != 0) {
            this.B.L(brandLabel);
        }
        if ((j4 & 128) != 0) {
            this.C.L(ProductMultiBuyLabel.g);
        }
        if ((j4 & 160) != 0) {
            this.J.setBoostViewListener(productsBoostViewListener);
        }
        if ((j4 & 132) != 0) {
            this.J.setEnableBoostAnimationContainerGap(z);
        }
        if ((j4 & 144) != 0) {
            this.J.setProductCardConfig(productCardConfig);
        }
        this.B.k();
        this.C.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.R != 0) {
                    return true;
                }
                return this.B.p() || this.C.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.R = 128L;
        }
        this.B.r();
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
                this.R |= 1;
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
            this.R |= 2;
        }
        return true;
    }
}
