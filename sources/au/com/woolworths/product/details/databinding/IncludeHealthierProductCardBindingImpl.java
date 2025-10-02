package au.com.woolworths.product.details.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeBrandLabelBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.extensions.IntExtKt;
import au.com.woolworths.android.onesite.models.products.PromotionInfo;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabel;
import au.com.woolworths.base.shopapp.bindings.TextViewBindingsKt;
import au.com.woolworths.base.shopapp.customviews.InlineLabel;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.product.databinding.IncludeProductMultibuyLabelBinding;
import au.com.woolworths.product.details.extensions.HealthierOptionExtKt;
import au.com.woolworths.product.details.models.HealthierOption;
import au.com.woolworths.product.details.models.ImageContent;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.MemberPriceInfo;
import au.com.woolworths.product.models.MemberPriceInfoKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.tile.ProductPriceView;
import au.com.woolworths.product.tile.ProductPriceViewKt;
import au.com.woolworths.product.ui.ProductListPromotionLabel;
import au.com.woolworths.product.ui.ProductMultiBuyLabel;
import com.woolworths.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class IncludeHealthierProductCardBindingImpl extends IncludeHealthierProductCardBinding {
    public static final ViewDataBinding.IncludedLayouts L;
    public static final SparseIntArray M;
    public final ConstraintLayout J;
    public long K;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(12);
        L = includedLayouts;
        includedLayouts.a(0, new int[]{9, 10}, new int[]{R.layout.include_brand_label, R.layout.include_product_multibuy_label}, new String[]{"include_brand_label", "include_product_multibuy_label"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(R.id.start_guideline, 11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IncludeHealthierProductCardBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 12, L, M);
        ImageView imageView = (ImageView) objArrT[5];
        ImageView imageView2 = (ImageView) objArrT[2];
        ImageView imageView3 = (ImageView) objArrT[1];
        IncludeBrandLabelBinding includeBrandLabelBinding = (IncludeBrandLabelBinding) objArrT[9];
        ComposeView composeView = (ComposeView) objArrT[8];
        IncludeProductMultibuyLabelBinding includeProductMultibuyLabelBinding = (IncludeProductMultibuyLabelBinding) objArrT[10];
        TextView textView = (TextView) objArrT[3];
        ProductPriceView productPriceView = (ProductPriceView) objArrT[4];
        TextView textView2 = (TextView) objArrT[6];
        TextView textView3 = (TextView) objArrT[7];
        super(dataBindingComponent, view, imageView, imageView2, imageView3, includeBrandLabelBinding, composeView, includeProductMultibuyLabelBinding, textView, productPriceView, textView2, textView3);
        this.K = -1L;
        this.y.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.J = constraintLayout;
        constraintLayout.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        IncludeBrandLabelBinding includeBrandLabelBinding2 = this.B;
        if (includeBrandLabelBinding2 != null) {
            includeBrandLabelBinding2.n = this;
        }
        this.C.setTag(null);
        IncludeProductMultibuyLabelBinding includeProductMultibuyLabelBinding2 = this.D;
        if (includeProductMultibuyLabelBinding2 != null) {
            includeProductMultibuyLabelBinding2.n = this;
        }
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (53 != i) {
            return false;
        }
        L((HealthierOption) obj);
        return true;
    }

    @Override // au.com.woolworths.product.details.databinding.IncludeHealthierProductCardBinding
    public final void L(HealthierOption healthierOption) throws Throwable {
        this.I = healthierOption;
        synchronized (this) {
            this.K |= 4;
        }
        h(53);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        long j2;
        long j3;
        int i;
        boolean z;
        boolean z2;
        boolean zW;
        InlineLabel inlineLabelF;
        boolean z3;
        BrandLabel brandLabelK;
        String str;
        boolean z4;
        ProductCard productCard;
        String url;
        String unitPriceDescription;
        boolean z5;
        String productImage;
        Integer price;
        String str2;
        String str3;
        boolean z6;
        String wasPrice;
        String badgeImage;
        MemberPriceInfo memberPriceInfo;
        synchronized (this) {
            j = this.K;
            this.K = 0L;
        }
        HealthierOption healthierOption = this.I;
        int i2 = ((12 & j) > 0L ? 1 : ((12 & j) == 0L ? 0 : -1));
        if (i2 != 0) {
            Intrinsics.h(healthierOption, "<this>");
            String name = healthierOption.getProductCard().getName();
            ImageContent healthStarRating = healthierOption.getHealthStarRating();
            String strA = HealthierOptionExtKt.a(name, healthStarRating != null ? healthStarRating.getAltText() : null);
            Integer price2 = healthierOption.getProductCard().getPrice();
            String strA2 = HealthierOptionExtKt.a(strA, price2 != null ? IntExtKt.c(price2.intValue()) : null);
            PromotionInfo promotionInfo = healthierOption.getProductCard().getPromotionInfo();
            String strA3 = HealthierOptionExtKt.a(HealthierOptionExtKt.a(strA2, promotionInfo != null ? promotionInfo.getLabel() : null), healthierOption.getProductCard().getMultiBuyPrice());
            MemberPriceInfo memberPriceInfo2 = healthierOption.getProductCard().getMemberPriceInfo();
            String strA4 = HealthierOptionExtKt.a(strA3, memberPriceInfo2 != null ? MemberPriceInfoKt.contentDescription(memberPriceInfo2) : null);
            productCard = healthierOption.getProductCard();
            ImageContent healthStarRating2 = healthierOption.getHealthStarRating();
            if (productCard != null) {
                unitPriceDescription = productCard.getUnitPriceDescription();
                wasPrice = productCard.getWasPrice();
                productImage = productCard.getProductImage();
                price = productCard.getPrice();
                badgeImage = productCard.getBadgeImage();
                memberPriceInfo = productCard.getMemberPriceInfo();
            } else {
                unitPriceDescription = null;
                wasPrice = null;
                productImage = null;
                price = null;
                badgeImage = null;
                memberPriceInfo = null;
            }
            j2 = 0;
            inlineLabelF = ProductCardExtKt.f(productCard, true);
            zW = ProductCardExtKt.w(productCard, ProductMultiBuyLabel.g);
            brandLabelK = ProductCardExtKt.k(productCard, false);
            boolean z7 = healthStarRating2 != null;
            url = healthStarRating2 != null ? healthStarRating2.getUrl() : null;
            boolean z8 = unitPriceDescription != null;
            boolean z9 = wasPrice != null;
            boolean z10 = badgeImage != null;
            str = badgeImage;
            z6 = z9;
            i = i2;
            z3 = z7;
            str2 = strA4;
            z4 = z8;
            str3 = wasPrice;
            z5 = z10;
            z = memberPriceInfo != null;
            j3 = j;
            z2 = brandLabelK != ProductListPromotionLabel.k;
        } else {
            j2 = 0;
            j3 = j;
            i = i2;
            z = false;
            z2 = false;
            zW = false;
            inlineLabelF = null;
            z3 = false;
            brandLabelK = null;
            str = null;
            z4 = false;
            productCard = null;
            url = null;
            unitPriceDescription = null;
            z5 = false;
            productImage = null;
            price = null;
            str2 = null;
            str3 = null;
            z6 = false;
        }
        if (i != 0) {
            boolean z11 = z4;
            BindingAdaptersKt.o(this.y, z3);
            BindingAdaptersKt.d(this.y, url);
            BindingAdaptersKt.d(this.z, str);
            BindingAdaptersKt.o(this.z, z5);
            ImageView imageView = this.A;
            d.z(this.A, R.drawable.ic_product_image_unavailable, imageView, productImage, AppCompatResources.b(R.drawable.ic_product_image_loading, imageView.getContext()));
            this.B.L(brandLabelK);
            BindingAdaptersKt.o(this.B.h, z2);
            BindingAdaptersKt.o(this.C, z);
            this.D.M(productCard);
            BindingAdaptersKt.o(this.D.h, zW);
            TextViewBindingsKt.c(this.E, inlineLabelF, false);
            ProductPriceViewKt.a(this.F, price, null);
            TextViewBindingAdapter.b(this.G, unitPriceDescription);
            TextView textView = this.G;
            Intrinsics.h(textView, "textView");
            Intrinsics.h(healthierOption, "healthierOption");
            ViewParent parent = textView.getParent();
            Intrinsics.f(parent, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.g(constraintLayout);
            if (healthierOption.getHealthStarRating() == null) {
                constraintSet.h(R.id.product_unit_price_text_view, 6, R.id.product_price, 7);
                constraintSet.h(R.id.product_was_price_text_view, 3, R.id.product_price, 4);
            } else {
                constraintSet.h(R.id.product_unit_price_text_view, 6, R.id.product_image_view, 7);
                constraintSet.h(R.id.product_unit_price_text_view, 3, R.id.product_price, 4);
                constraintSet.h(R.id.product_was_price_text_view, 3, R.id.product_unit_price_text_view, 4);
            }
            constraintSet.c(constraintLayout);
            BindingAdaptersKt.o(this.G, z11);
            TextViewBindingAdapter.b(this.H, str3);
            BindingAdaptersKt.o(this.H, z6);
            if (ViewDataBinding.s >= 4) {
                this.J.setContentDescription(str2);
            }
        }
        if ((j3 & 8) != j2) {
            this.D.L(ProductMultiBuyLabel.e);
        }
        this.B.k();
        this.D.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.K != 0) {
                    return true;
                }
                return this.B.p() || this.D.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.K = 8L;
        }
        this.B.r();
        this.D.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.K |= 1;
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
            this.K |= 2;
        }
        return true;
    }
}
