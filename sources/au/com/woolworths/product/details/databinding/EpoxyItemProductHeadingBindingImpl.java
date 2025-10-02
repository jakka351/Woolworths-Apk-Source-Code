package au.com.woolworths.product.details.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeBrandLabelBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeTintableTextBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.extensions.IntExtKt;
import au.com.woolworths.android.onesite.models.products.PromotionInfo;
import au.com.woolworths.android.onesite.modules.customviews.tintabletext.TintableTextData;
import au.com.woolworths.foundation.rewards.offers.ui.RewardsOfferDataExtKt;
import au.com.woolworths.product.composeui.wrapper.ProductLocationInfoView;
import au.com.woolworths.product.composeui.wrapper.ProductLocationInfoViewKt;
import au.com.woolworths.product.databinding.IncludeProductMultibuyLabelBinding;
import au.com.woolworths.product.details.ProductDetailsClickHandler;
import au.com.woolworths.product.details.generated.callback.Function0;
import au.com.woolworths.product.details.models.ProductCardTileExtKt;
import au.com.woolworths.product.details.ui.ProductDetailsPromotionLabel;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.extensions.StringExtKt;
import au.com.woolworths.product.models.MemberPriceInfo;
import au.com.woolworths.product.models.MemberPriceInfoKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardKt;
import au.com.woolworths.product.models.RewardsOfferInfo;
import au.com.woolworths.product.tile.ProductPriceView;
import au.com.woolworths.product.tile.ProductPriceViewKt;
import au.com.woolworths.product.ui.ProductMultiBuyLabel;
import com.woolworths.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class EpoxyItemProductHeadingBindingImpl extends EpoxyItemProductHeadingBinding implements Function0.Listener {
    public static final ViewDataBinding.IncludedLayouts O;
    public static final SparseIntArray P;
    public final ConstraintLayout K;
    public final IncludeTintableTextBinding L;
    public final Function0 M;
    public long N;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(12);
        O = includedLayouts;
        includedLayouts.a(0, new int[]{7, 8, 9}, new int[]{R.layout.include_brand_label, R.layout.include_product_multibuy_label, R.layout.include_tintable_text}, new String[]{"include_brand_label", "include_product_multibuy_label", "include_tintable_text"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(R.id.member_price_compose_view, 10);
        sparseIntArray.put(R.id.offer_barrier, 11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemProductHeadingBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 12, O, P);
        FrameLayout frameLayout = (FrameLayout) objArrT[1];
        ProductLocationInfoView productLocationInfoView = (ProductLocationInfoView) objArrT[2];
        ComposeView composeView = (ComposeView) objArrT[10];
        super(dataBindingComponent, view, frameLayout, productLocationInfoView, composeView, (IncludeProductMultibuyLabelBinding) objArrT[8], (TextView) objArrT[3], (ProductPriceView) objArrT[4], (TextView) objArrT[5], (TextView) objArrT[6], (IncludeBrandLabelBinding) objArrT[7]);
        this.N = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.K = constraintLayout;
        constraintLayout.setTag(null);
        IncludeTintableTextBinding includeTintableTextBinding = (IncludeTintableTextBinding) objArrT[9];
        this.L = includeTintableTextBinding;
        if (includeTintableTextBinding != null) {
            includeTintableTextBinding.n = this;
        }
        IncludeProductMultibuyLabelBinding includeProductMultibuyLabelBinding = this.B;
        if (includeProductMultibuyLabelBinding != null) {
            includeProductMultibuyLabelBinding.n = this;
        }
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        IncludeBrandLabelBinding includeBrandLabelBinding = this.G;
        if (includeBrandLabelBinding != null) {
            includeBrandLabelBinding.n = this;
        }
        E(view);
        this.M = new Function0(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (35 == i) {
            this.I = (ProductDetailsClickHandler) obj;
            synchronized (this) {
                this.N |= 4;
            }
            h(35);
            y();
            return true;
        }
        if (53 == i) {
            this.H = (ProductCard) obj;
            synchronized (this) {
                this.N |= 8;
            }
            h(53);
            y();
            return true;
        }
        if (109 != i) {
            return false;
        }
        this.J = ((Boolean) obj).booleanValue();
        synchronized (this) {
            this.N |= 16;
        }
        h(109);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        long j2;
        long j3;
        long j4;
        boolean z;
        boolean z2;
        boolean z3;
        boolean zQ;
        boolean zW;
        boolean z4;
        StringBuilder sb;
        ProductDetailsPromotionLabel productDetailsPromotionLabel;
        TintableTextData tintableTextDataB;
        boolean z5;
        boolean z6;
        Integer price;
        String unitPriceDescription;
        String wasPrice;
        String name;
        boolean z7;
        RewardsOfferInfo rewardsOfferInfo;
        synchronized (this) {
            j = this.N;
            this.N = 0L;
        }
        ProductCard productCard = this.H;
        boolean z8 = this.J;
        if ((j & 40) != 0) {
            if (productCard != null) {
                rewardsOfferInfo = productCard.getRewardsOfferInfo();
                price = productCard.getPrice();
                unitPriceDescription = productCard.getUnitPriceDescription();
                wasPrice = productCard.getWasPrice();
                name = productCard.getName();
            } else {
                rewardsOfferInfo = null;
                price = null;
                unitPriceDescription = null;
                wasPrice = null;
                name = null;
            }
            j2 = 0;
            ProductMultiBuyLabel productMultiBuyLabel = ProductMultiBuyLabel.h;
            zW = ProductCardExtKt.w(productCard, productMultiBuyLabel);
            ProductDetailsPromotionLabel promotionLabel = ProductCardTileExtKt.getPromotionLabel(productCard);
            j3 = 40;
            Intrinsics.h(productCard, "<this>");
            String instoreLocationText = ProductCardKt.getInstoreLocationText(productCard);
            if (instoreLocationText == null) {
                instoreLocationText = "";
            }
            sb = new StringBuilder(instoreLocationText);
            sb.append(StringExtKt.a(productCard.getName()));
            sb.append('\n');
            Integer price2 = productCard.getPrice();
            String strC = price2 != null ? IntExtKt.c(price2.intValue()) : null;
            sb.append(strC == null ? "" : strC);
            sb.append('\n');
            String strA = StringExtKt.a(productCard.getUnitPriceDescription());
            if (strA == null) {
                strA = "";
            }
            sb.append(strA);
            sb.append('\n');
            String strE = ProductCardExtKt.e(productCard, productMultiBuyLabel);
            if (strE == null) {
                strE = "";
            }
            sb.append(strE);
            sb.append('\n');
            MemberPriceInfo memberPriceInfo = productCard.getMemberPriceInfo();
            sb.append(memberPriceInfo != null ? MemberPriceInfoKt.contentDescription(memberPriceInfo) : null);
            sb.append('\n');
            PromotionInfo promotionInfo = productCard.getPromotionInfo();
            String label = promotionInfo != null ? promotionInfo.getLabel() : null;
            if (label == null) {
                label = "";
            }
            sb.append(label);
            sb.append('\n');
            RewardsOfferInfo rewardsOfferInfo2 = productCard.getRewardsOfferInfo();
            String m = rewardsOfferInfo2 != null ? rewardsOfferInfo2.getM() : null;
            if (m == null) {
                m = "";
            }
            sb.append(m);
            sb.append('\n');
            zQ = ProductCardExtKt.q(productCard);
            String m2 = rewardsOfferInfo != null ? rewardsOfferInfo.getM() : null;
            tintableTextDataB = RewardsOfferDataExtKt.b(rewardsOfferInfo, this.h.getContext());
            boolean z9 = price != null;
            boolean z10 = unitPriceDescription != null;
            boolean z11 = wasPrice != null;
            boolean z12 = promotionLabel != null;
            z6 = m2 != null;
            productDetailsPromotionLabel = promotionLabel;
            z5 = z9;
            z = z8;
            z4 = z12;
            z2 = z10;
            z3 = z11;
            j4 = j;
        } else {
            j2 = 0;
            j3 = 40;
            j4 = j;
            z = z8;
            z2 = false;
            z3 = false;
            zQ = false;
            zW = false;
            z4 = false;
            sb = null;
            productDetailsPromotionLabel = null;
            tintableTextDataB = null;
            z5 = false;
            z6 = false;
            price = null;
            unitPriceDescription = null;
            wasPrice = null;
            name = null;
        }
        long j5 = j4 & 56;
        if (j5 != j2 && j5 != j2) {
            j4 = z ? j4 | 128 : j4 | 64;
        }
        boolean zO = (j4 & 128) != j2 ? ProductCardExtKt.o(productCard) : false;
        long j6 = j4 & 56;
        if (j6 != j2) {
            if (!z) {
                zO = false;
            }
            z7 = zO;
        } else {
            z7 = false;
        }
        if ((j4 & j3) != j2) {
            StringBuilder sb2 = sb;
            BindingAdaptersKt.o(this.y, zQ);
            ProductLocationInfoViewKt.c(this.z, productCard);
            this.L.L(tintableTextDataB);
            BindingAdaptersKt.o(this.L.h, z6);
            this.B.M(productCard);
            BindingAdaptersKt.o(this.B.h, zW);
            TextViewBindingAdapter.b(this.C, name);
            BindingAdaptersKt.o(this.D, z5);
            ProductPriceViewKt.a(this.D, price, null);
            TextViewBindingAdapter.b(this.E, unitPriceDescription);
            BindingAdaptersKt.o(this.E, z2);
            TextViewBindingAdapter.b(this.F, wasPrice);
            BindingAdaptersKt.o(this.F, z3);
            this.G.L(productDetailsPromotionLabel);
            BindingAdaptersKt.o(this.G.h, z4);
            if (ViewDataBinding.s >= 4) {
                this.K.setContentDescription(sb2);
            }
        }
        if (j6 != j2) {
            ProductLocationInfoViewKt.b(this.z, z7);
        }
        if ((j4 & 32) != j2) {
            ProductLocationInfoViewKt.a(this.z, this.M);
            this.B.L(ProductMultiBuyLabel.h);
        }
        this.G.k();
        this.B.k();
        this.L.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.N != 0) {
                    return true;
                }
                return this.G.p() || this.B.p() || this.L.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.N = 32L;
        }
        this.G.r();
        this.B.r();
        this.L.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.N |= 1;
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
            this.N |= 2;
        }
        return true;
    }
}
