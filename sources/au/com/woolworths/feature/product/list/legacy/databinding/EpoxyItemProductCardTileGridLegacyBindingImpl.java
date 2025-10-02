package au.com.woolworths.feature.product.list.legacy.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeBrandLabelBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeTintableTextBinding;
import au.com.woolworths.android.onesite.models.products.ProductListMarketplace;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabel;
import au.com.woolworths.android.onesite.modules.customviews.tintabletext.TintableTextData;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.base.shopapp.bindings.TextViewBindingsKt;
import au.com.woolworths.base.shopapp.customviews.InlineLabel;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.feature.product.list.legacy.ProductListViewModel;
import au.com.woolworths.feature.product.list.legacy.ProductListViewModelKt;
import au.com.woolworths.feature.product.list.legacy.generated.callback.Function0;
import au.com.woolworths.feature.product.list.legacy.generated.callback.OnClickListener;
import au.com.woolworths.foundation.rewards.offers.ui.RewardsOfferDataExtKt;
import au.com.woolworths.product.composeui.wrapper.ProductLocationInfoView;
import au.com.woolworths.product.composeui.wrapper.ProductLocationInfoViewKt;
import au.com.woolworths.product.databinding.IncludeProductMultibuyLabelBinding;
import au.com.woolworths.product.databinding.IncludeProductMultibuyLabelNzBinding;
import au.com.woolworths.product.databinding.StockIndicatorBinding;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.extensions.StringExtKt;
import au.com.woolworths.product.models.InStoreAvailabilityInfo;
import au.com.woolworths.product.models.MemberPriceInfo;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.models.ProductTaggedLabel;
import au.com.woolworths.product.models.ProductUnavailableLabel;
import au.com.woolworths.product.models.RewardsOfferInfo;
import au.com.woolworths.product.models.TagLabel;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.product.tile.ProductPriceView;
import au.com.woolworths.product.tile.ProductPriceViewKt;
import au.com.woolworths.product.ui.ListButtonType;
import au.com.woolworths.product.ui.ProductCardButtonType;
import au.com.woolworths.product.ui.ProductCardButtonsState;
import au.com.woolworths.product.ui.ProductListPromotionLabel;
import au.com.woolworths.product.ui.ProductMultiBuyLabel;
import au.com.woolworths.product.utils.BindingAdaptersKt;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class EpoxyItemProductCardTileGridLegacyBindingImpl extends EpoxyItemProductCardTileGridLegacyBinding implements OnClickListener.Listener, Function0.Listener {
    public static final ViewDataBinding.IncludedLayouts s0;
    public static final SparseIntArray t0;
    public final ConstraintLayout h0;
    public final LinearLayout i0;
    public final OnClickListener j0;
    public final OnClickListener k0;
    public final Function0 l0;
    public final OnClickListener m0;
    public final OnClickListener n0;
    public final OnClickListener o0;
    public final OnClickListener p0;
    public final OnClickListener q0;
    public long r0;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(31);
        s0 = includedLayouts;
        includedLayouts.a(0, new int[]{22, 23, 24, 25, 26}, new int[]{R.layout.include_brand_label, R.layout.include_brand_label, R.layout.include_product_multibuy_label, R.layout.include_product_multibuy_label_nz, R.layout.include_tintable_text}, new String[]{"include_brand_label", "include_brand_label", "include_product_multibuy_label", "include_product_multibuy_label_nz", "include_tintable_text"});
        includedLayouts.a(12, new int[]{27, 28}, new int[]{R.layout.include_product_list_legacy_marketplace_details, R.layout.stock_indicator}, new String[]{"include_product_list_legacy_marketplace_details", "stock_indicator"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        t0 = sparseIntArray;
        sparseIntArray.put(R.id.product_image_view, 29);
        sparseIntArray.put(R.id.multibuy_and_was_price_barrier, 30);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemProductCardTileGridLegacyBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 31, s0, t0);
        Button button = (Button) objArrT[18];
        FrameLayout frameLayout = (FrameLayout) objArrT[1];
        ProductLocationInfoView productLocationInfoView = (ProductLocationInfoView) objArrT[2];
        Button button2 = (Button) objArrT[17];
        Button button3 = (Button) objArrT[16];
        Button button4 = (Button) objArrT[20];
        StockIndicatorBinding stockIndicatorBinding = (StockIndicatorBinding) objArrT[28];
        Button button5 = (Button) objArrT[14];
        Button button6 = (Button) objArrT[21];
        TextView textView = (TextView) objArrT[8];
        super(dataBindingComponent, view, button, frameLayout, productLocationInfoView, button2, button3, button4, stockIndicatorBinding, button5, button6, textView, (TextView) objArrT[11], (IncludeTintableTextBinding) objArrT[26], (TextView) objArrT[4], (ComposeView) objArrT[29], (IncludeBrandLabelBinding) objArrT[22], (IncludeProductListLegacyMarketplaceDetailsBinding) objArrT[27], (ComposeView) objArrT[10], (IncludeProductMultibuyLabelBinding) objArrT[24], (IncludeProductMultibuyLabelNzBinding) objArrT[25], (TextView) objArrT[3], (ProductPriceView) objArrT[5], (TextView) objArrT[9], (IncludeBrandLabelBinding) objArrT[23], (TextView) objArrT[6], (TextView) objArrT[13], (TextView) objArrT[7], (Button) objArrT[15], (Button) objArrT[19]);
        this.r0 = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        StockIndicatorBinding stockIndicatorBinding2 = this.E;
        if (stockIndicatorBinding2 != null) {
            stockIndicatorBinding2.n = this;
        }
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.h0 = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArrT[12];
        this.i0 = linearLayout;
        linearLayout.setTag(null);
        this.I.setTag(null);
        IncludeTintableTextBinding includeTintableTextBinding = this.J;
        if (includeTintableTextBinding != null) {
            includeTintableTextBinding.n = this;
        }
        this.K.setTag(null);
        IncludeBrandLabelBinding includeBrandLabelBinding = this.M;
        if (includeBrandLabelBinding != null) {
            includeBrandLabelBinding.n = this;
        }
        IncludeProductListLegacyMarketplaceDetailsBinding includeProductListLegacyMarketplaceDetailsBinding = this.N;
        if (includeProductListLegacyMarketplaceDetailsBinding != null) {
            includeProductListLegacyMarketplaceDetailsBinding.n = this;
        }
        this.O.setTag(null);
        IncludeProductMultibuyLabelBinding includeProductMultibuyLabelBinding = this.P;
        if (includeProductMultibuyLabelBinding != null) {
            includeProductMultibuyLabelBinding.n = this;
        }
        IncludeProductMultibuyLabelNzBinding includeProductMultibuyLabelNzBinding = this.Q;
        if (includeProductMultibuyLabelNzBinding != null) {
            includeProductMultibuyLabelNzBinding.n = this;
        }
        this.R.setTag(null);
        this.S.setTag(null);
        this.T.setTag(null);
        IncludeBrandLabelBinding includeBrandLabelBinding2 = this.U;
        if (includeBrandLabelBinding2 != null) {
            includeBrandLabelBinding2.n = this;
        }
        this.V.setTag(null);
        this.W.setTag(null);
        this.X.setTag(null);
        this.Y.setTag(null);
        this.Z.setTag(null);
        E(view);
        this.j0 = new OnClickListener(this, 8);
        this.k0 = new OnClickListener(this, 6);
        this.l0 = new Function0(this);
        this.m0 = new OnClickListener(this, 7);
        this.n0 = new OnClickListener(this, 4);
        this.o0 = new OnClickListener(this, 3);
        this.p0 = new OnClickListener(this, 5);
        this.q0 = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (157 == i) {
            N((ProductClickListener) obj);
            return true;
        }
        if (109 == i) {
            this.f0 = ((Boolean) obj).booleanValue();
            synchronized (this) {
                this.r0 |= 256;
            }
            h(109);
            y();
            return true;
        }
        if (46 == i) {
            L((String) obj);
            return true;
        }
        if (206 == i) {
            P((ProductCardConfig) obj);
            return true;
        }
        if (53 == i) {
            M((ProductCard) obj);
            return true;
        }
        if (273 != i) {
            if (205 != i) {
                return false;
            }
            O((ProductCardButtonsState) obj);
            return true;
        }
        this.g0 = (ProductListViewModel) obj;
        synchronized (this) {
            this.r0 |= 4096;
        }
        h(273);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.product.list.legacy.databinding.EpoxyItemProductCardTileGridLegacyBinding
    public final void L(String str) throws Throwable {
        this.a0 = str;
        synchronized (this) {
            this.r0 |= 512;
        }
        h(46);
        y();
    }

    @Override // au.com.woolworths.feature.product.list.legacy.databinding.EpoxyItemProductCardTileGridLegacyBinding
    public final void M(ProductCard productCard) throws Throwable {
        this.c0 = productCard;
        synchronized (this) {
            this.r0 |= llqqqql.ccc00630063c0063;
        }
        h(53);
        y();
    }

    @Override // au.com.woolworths.feature.product.list.legacy.databinding.EpoxyItemProductCardTileGridLegacyBinding
    public final void N(ProductClickListener productClickListener) throws Throwable {
        this.b0 = productClickListener;
        synchronized (this) {
            this.r0 |= 128;
        }
        h(157);
        y();
    }

    @Override // au.com.woolworths.feature.product.list.legacy.databinding.EpoxyItemProductCardTileGridLegacyBinding
    public final void O(ProductCardButtonsState productCardButtonsState) throws Throwable {
        this.e0 = productCardButtonsState;
        synchronized (this) {
            this.r0 |= 8192;
        }
        h(205);
        y();
    }

    @Override // au.com.woolworths.feature.product.list.legacy.databinding.EpoxyItemProductCardTileGridLegacyBinding
    public final void P(ProductCardConfig productCardConfig) throws Throwable {
        this.d0 = productCardConfig;
        synchronized (this) {
            this.r0 |= llqqqql.c00630063c0063c0063;
        }
        h(206);
        y();
    }

    @Override // au.com.woolworths.feature.product.list.legacy.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        switch (i) {
            case 1:
                String str = this.a0;
                ProductClickListener productClickListener = this.b0;
                ProductCard productCard = this.c0;
                if (productClickListener != null) {
                    if (str != null) {
                        productClickListener.J1(productCard, str);
                        break;
                    } else {
                        productClickListener.J1(productCard, "");
                        break;
                    }
                }
                break;
            case 3:
                String str2 = this.a0;
                ProductClickListener productClickListener2 = this.b0;
                ProductCard productCard2 = this.c0;
                if (productClickListener2 != null) {
                    if (str2 != null) {
                        productClickListener2.L0(productCard2, str2);
                        break;
                    } else {
                        productClickListener2.L0(productCard2, "");
                        break;
                    }
                }
                break;
            case 4:
                String str3 = this.a0;
                ProductClickListener productClickListener3 = this.b0;
                ProductCard productCard3 = this.c0;
                if (productClickListener3 != null) {
                    if (str3 != null) {
                        productClickListener3.u3(productCard3, str3);
                        break;
                    } else {
                        productClickListener3.u3(productCard3, "");
                        break;
                    }
                }
                break;
            case 5:
                String str4 = this.a0;
                ProductClickListener productClickListener4 = this.b0;
                ProductCard productCard4 = this.c0;
                if (productClickListener4 != null) {
                    if (str4 != null) {
                        productClickListener4.g5(productCard4, str4);
                        break;
                    } else {
                        productClickListener4.g5(productCard4, "");
                        break;
                    }
                }
                break;
            case 6:
                String str5 = this.a0;
                ProductClickListener productClickListener5 = this.b0;
                ProductCard productCard5 = this.c0;
                if (productClickListener5 != null) {
                    if (str5 != null) {
                        productClickListener5.T4(productCard5, str5);
                        break;
                    } else {
                        productClickListener5.T4(productCard5, "");
                        break;
                    }
                }
                break;
            case 7:
                String str6 = this.a0;
                ProductClickListener productClickListener6 = this.b0;
                ProductCard productCard6 = this.c0;
                if (productClickListener6 != null) {
                    if (str6 != null) {
                        productClickListener6.D4(productCard6, str6);
                        break;
                    } else {
                        productClickListener6.D4(productCard6, "");
                        break;
                    }
                }
                break;
            case 8:
                String str7 = this.a0;
                ProductClickListener productClickListener7 = this.b0;
                ProductCard productCard7 = this.c0;
                if (productClickListener7 != null) {
                    if (str7 != null) {
                        productClickListener7.L0(productCard7, str7);
                        break;
                    } else {
                        productClickListener7.L0(productCard7, "");
                        break;
                    }
                }
                break;
        }
    }

    @Override // au.com.woolworths.feature.product.list.legacy.generated.callback.Function0.Listener
    public final void d() {
        ProductClickListener productClickListener = this.b0;
        ProductCard productCard = this.c0;
        if (productClickListener != null) {
            productClickListener.T0(productCard);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        boolean z;
        long j2;
        boolean zIsInlineLabelEnabled;
        boolean z2;
        ProductClickListener productClickListener;
        boolean z3;
        boolean z4;
        String str;
        long j3;
        Integer num;
        boolean z5;
        String str2;
        String str3;
        boolean z6;
        boolean z7;
        boolean z8;
        TintableTextData tintableTextData;
        boolean z9;
        String str4;
        boolean z10;
        String str5;
        String str6;
        String str7;
        InlineLabel inlineLabel;
        String str8;
        boolean z11;
        boolean z12;
        BrandLabel brandLabel;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        String str9;
        ProductListMarketplace productListMarketplace;
        String str10;
        String str11;
        String str12;
        String str13;
        boolean z17;
        BrandLabel brandLabelK;
        boolean z18;
        boolean z19;
        boolean z20;
        BrandLabel brandLabel2;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        boolean z30;
        String str14;
        boolean z31;
        boolean z32;
        boolean z33;
        boolean z34;
        boolean z35;
        boolean z36;
        boolean z37;
        ProductCardButtonType productCardButtonType;
        ListButtonType listButtonType;
        boolean zC;
        boolean zT6;
        boolean zT62;
        String strJ;
        String strG;
        String strM;
        InlineLabel inlineLabelF;
        long j4;
        RewardsOfferInfo rewardsOfferInfo;
        String str15;
        MemberPriceInfo memberPriceInfo;
        TagLabel tagLabel;
        ProductListMarketplace marketplace;
        String unitPriceDescription;
        String wasPrice;
        InStoreAvailabilityInfo inStoreAvailabilityInfo;
        String name;
        String pricingFootnoteMd;
        String unitOfMeasureLabel;
        Integer price;
        String d;
        String m;
        synchronized (this) {
            j = this.r0;
            this.r0 = 0L;
        }
        ProductClickListener productClickListener2 = this.b0;
        boolean z38 = this.f0;
        String str16 = this.a0;
        ProductCardConfig productCardConfig = this.d0;
        ProductCard productCard = this.c0;
        ProductListViewModel productListViewModel = this.g0;
        ProductCardButtonsState productCardButtonsState = this.e0;
        long j5 = j & 19072;
        if (j5 != 0) {
            z = str16 == null;
            if (j5 != 0) {
                j |= z ? llqqqql.c0063ccc00630063 : llqqqql.ccccc00630063;
            }
        } else {
            z = false;
        }
        long j6 = j & 18688;
        if (j6 != 0 && j6 != 0) {
            j = z38 ? j | llqqqql.c00630063cc00630063 : j | llqqqql.cc0063cc00630063;
        }
        long j7 = j & 19456;
        if (j7 == 0 || productCardConfig == null) {
            j2 = 19072;
            zIsInlineLabelEnabled = false;
            z2 = false;
        } else {
            boolean zIsInstoreMode = productCardConfig.isInstoreMode();
            zIsInlineLabelEnabled = productCardConfig.isInlineLabelEnabled();
            z2 = zIsInstoreMode;
            j2 = 19072;
        }
        if ((j & 24192) != 0) {
            if ((j & j2) != 0) {
                strJ = ProductCardExtKt.j(productCard);
                strG = ProductCardExtKt.g(productCard);
            } else {
                strJ = null;
                strG = null;
            }
            if (j7 != 0) {
                strM = ProductCardExtKt.m(productCard, ProductMultiBuyLabel.e, z2, this.h.getContext());
                inlineLabelF = ProductCardExtKt.f(productCard, zIsInlineLabelEnabled);
            } else {
                strM = null;
                inlineLabelF = null;
            }
            long j8 = j & 18432;
            if (j8 != 0) {
                if (productCard != null) {
                    memberPriceInfo = productCard.getMemberPriceInfo();
                    marketplace = productCard.getMarketplace();
                    unitPriceDescription = productCard.getUnitPriceDescription();
                    wasPrice = productCard.getWasPrice();
                    inStoreAvailabilityInfo = productCard.getInStoreAvailabilityInfo();
                    name = productCard.getName();
                    TagLabel tagLabel2 = productCard.getTagLabel();
                    pricingFootnoteMd = productCard.getPricingFootnoteMd();
                    RewardsOfferInfo rewardsOfferInfo2 = productCard.getRewardsOfferInfo();
                    String disclaimer = productCard.getDisclaimer();
                    unitOfMeasureLabel = productCard.getUnitOfMeasureLabel();
                    price = productCard.getPrice();
                    tagLabel = tagLabel2;
                    long j9 = j;
                    rewardsOfferInfo = rewardsOfferInfo2;
                    str15 = disclaimer;
                    j4 = j9;
                } else {
                    j4 = j;
                    rewardsOfferInfo = null;
                    str15 = null;
                    memberPriceInfo = null;
                    tagLabel = null;
                    marketplace = null;
                    unitPriceDescription = null;
                    wasPrice = null;
                    inStoreAvailabilityInfo = null;
                    name = null;
                    pricingFootnoteMd = null;
                    unitOfMeasureLabel = null;
                    price = null;
                }
                boolean zY = ProductCardExtKt.y(productCard);
                boolean zV = ProductCardExtKt.v(productCard);
                boolean zQ = ProductCardExtKt.q(productCard);
                String str17 = str15;
                boolean z39 = ProductCardExtKt.z(productCard, ProductMultiBuyLabel.e);
                boolean z40 = memberPriceInfo != null;
                z15 = marketplace != null;
                String strA = StringExtKt.a(name);
                z16 = tagLabel == null;
                BrandLabel productTaggedLabel = tagLabel != null ? new ProductTaggedLabel(tagLabel) : ProductUnavailableLabel.DEFAULT;
                boolean z41 = tagLabel != null;
                boolean z42 = pricingFootnoteMd != null;
                BrandLabel brandLabel3 = productTaggedLabel;
                TintableTextData tintableTextDataB = RewardsOfferDataExtKt.b(rewardsOfferInfo, this.h.getContext());
                boolean z43 = str17 != null;
                boolean z44 = str17 == null;
                if (j8 != 0) {
                    j4 |= z16 ? 5242880L : 2621440L;
                }
                String lowestMarketPriceDescription = marketplace != null ? marketplace.getLowestMarketPriceDescription() : null;
                ButtonApiData button = inStoreAvailabilityInfo != null ? inStoreAvailabilityInfo.getButton() : null;
                if (rewardsOfferInfo != null) {
                    m = rewardsOfferInfo.getM();
                    d = rewardsOfferInfo.getD();
                } else {
                    d = null;
                    m = null;
                }
                String label = button != null ? button.getLabel() : null;
                boolean z45 = m != null;
                boolean z46 = d != null;
                str10 = wasPrice;
                str11 = strA;
                str12 = pricingFootnoteMd;
                str13 = unitOfMeasureLabel;
                z17 = zY;
                productClickListener = productClickListener2;
                str8 = strM;
                z4 = z38;
                str6 = strJ;
                z12 = z41;
                str5 = label;
                num = price;
                z7 = zQ;
                str4 = str17;
                z11 = z39;
                z13 = z42;
                str3 = d;
                str = str16;
                z14 = z40;
                productListMarketplace = marketplace;
                str9 = unitPriceDescription;
                j3 = j4;
                z5 = zV;
                brandLabel = brandLabel3;
                z8 = z43;
                z10 = z45;
                inlineLabel = inlineLabelF;
                str7 = strG;
                tintableTextData = tintableTextDataB;
                z3 = z;
                str2 = lowestMarketPriceDescription;
                z9 = z44;
                z6 = z46;
            } else {
                productClickListener = productClickListener2;
                str8 = strM;
                z4 = z38;
                str = str16;
                str6 = strJ;
                j3 = j;
                num = null;
                z5 = false;
                str2 = null;
                str3 = null;
                z7 = false;
                z8 = false;
                z9 = false;
                str4 = null;
                z10 = false;
                str5 = null;
                z11 = false;
                z12 = false;
                brandLabel = null;
                z13 = false;
                z14 = false;
                z15 = false;
                z16 = false;
                str9 = null;
                productListMarketplace = null;
                str10 = null;
                str11 = null;
                str12 = null;
                str13 = null;
                z17 = false;
                inlineLabel = inlineLabelF;
                str7 = strG;
                tintableTextData = null;
                z3 = z;
                z6 = false;
            }
        } else {
            productClickListener = productClickListener2;
            z3 = z;
            z4 = z38;
            str = str16;
            j3 = j;
            num = null;
            z5 = false;
            str2 = null;
            str3 = null;
            z6 = false;
            z7 = false;
            z8 = false;
            tintableTextData = null;
            z9 = false;
            str4 = null;
            z10 = false;
            str5 = null;
            str6 = null;
            str7 = null;
            inlineLabel = null;
            str8 = null;
            z11 = false;
            z12 = false;
            brandLabel = null;
            z13 = false;
            z14 = false;
            z15 = false;
            z16 = false;
            str9 = null;
            productListMarketplace = null;
            str10 = null;
            str11 = null;
            str12 = null;
            str13 = null;
            z17 = false;
        }
        long j10 = j3 & 22528;
        Integer num2 = num;
        if (j10 != 0) {
            if (productListViewModel != null) {
                zT6 = productListViewModel.T6(productCard, ProductMultiBuyLabel.f);
                zT62 = productListViewModel.T6(productCard, ProductMultiBuyLabel.e);
                zC = productListViewModel.i.c(BaseShopAppFeature.w);
            } else {
                zC = false;
                zT6 = false;
                zT62 = false;
            }
            brandLabelK = ProductCardExtKt.k(productCard, zC);
            z18 = brandLabelK == ProductListPromotionLabel.k;
            z19 = zT6;
            z20 = zT62;
        } else {
            brandLabelK = null;
            z18 = false;
            z19 = false;
            z20 = false;
        }
        long j11 = j3 & 24576;
        if (j11 != 0) {
            z21 = z18;
            if (productCardButtonsState != null) {
                productCardButtonType = productCardButtonsState.f9337a;
                listButtonType = productCardButtonsState.b;
            } else {
                productCardButtonType = null;
                listButtonType = null;
            }
            brandLabel2 = brandLabelK;
            z25 = productCardButtonType == ProductCardButtonType.e;
            boolean z47 = productCardButtonType == ProductCardButtonType.d;
            z27 = productCardButtonType == ProductCardButtonType.f;
            boolean z48 = productCardButtonType == ProductCardButtonType.i;
            boolean z49 = productCardButtonType == ProductCardButtonType.j;
            boolean z50 = productCardButtonType == ProductCardButtonType.g;
            boolean z51 = productCardButtonType == ProductCardButtonType.h;
            boolean z52 = listButtonType == ListButtonType.e;
            boolean z53 = z51;
            z28 = listButtonType == ListButtonType.d;
            z30 = z52;
            z23 = z47;
            z26 = z48;
            z22 = z49;
            z24 = z50;
            z29 = z53;
        } else {
            brandLabel2 = brandLabelK;
            z21 = z18;
            z22 = false;
            z23 = false;
            z24 = false;
            z25 = false;
            z26 = false;
            z27 = false;
            z28 = false;
            z29 = false;
            z30 = false;
        }
        boolean z54 = ((j3 & llqqqql.c006300630063c00630063) == 0 || num2 == null) ? false : true;
        long j12 = j3 & j2;
        if (j12 != 0) {
            if (z3) {
                str = "";
            }
            str14 = str;
        } else {
            str14 = null;
        }
        boolean z55 = ((j3 & llqqqql.c0063c0063c00630063) == 0 || str9 == null) ? false : true;
        boolean zO = (j3 & llqqqql.c00630063cc00630063) != 0 ? ProductCardExtKt.o(productCard) : false;
        long j13 = j3 & 18688;
        if (j13 != 0) {
            if (!z4) {
                zO = false;
            }
            z31 = zO;
        } else {
            z31 = false;
        }
        long j14 = j3 & 18432;
        if (j14 != 0) {
            if (!z16) {
                z55 = false;
            }
            if (!z16) {
                z54 = false;
            }
            z32 = z22;
            z33 = z24;
            z34 = z55;
            z35 = z54;
        } else {
            z32 = z22;
            z33 = z24;
            z34 = false;
            z35 = false;
        }
        if ((j3 & llqqqql.c0063006300630063c0063) != 0) {
            z37 = z23;
            z36 = z34;
            this.y.setOnClickListener(this.k0);
            ProductLocationInfoViewKt.a(this.A, this.l0);
            this.B.setOnClickListener(this.p0);
            this.C.setOnClickListener(this.n0);
            this.F.setOnClickListener(this.o0);
            this.G.setOnClickListener(this.j0);
            this.h0.setOnClickListener(this.q0);
            this.P.L(ProductMultiBuyLabel.e);
            this.Q.L(ProductMultiBuyLabel.f);
            this.Z.setOnClickListener(this.m0);
        } else {
            z36 = z34;
            z37 = z23;
        }
        if (j14 != 0) {
            BindingAdaptersKt.a(this.y, productCard);
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(this.z, z7);
            ProductLocationInfoViewKt.c(this.A, productCard);
            TextViewBindingAdapter.b(this.B, str5);
            BindingAdaptersKt.a(this.D, productCard);
            TextViewBindingAdapter.b(this.H, str2);
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(this.H, z5);
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(this.i0, z9);
            TextViewBindingAdapter.b(this.I, str3);
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(this.I, z6);
            this.J.L(tintableTextData);
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(this.J.h, z10);
            TextViewBindingAdapter.b(this.K, str4);
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(this.K, z8);
            this.N.L(productListMarketplace);
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(this.N.h, z15);
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(this.O, z14);
            this.P.M(productCard);
            this.Q.M(productCard);
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(this.S, z35);
            ProductPriceViewKt.a(this.S, num2, str13);
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(this.T, z13);
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.l(this.T, str12, false, null, null);
            this.U.L(brandLabel);
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(this.U.h, z12);
            TextViewBindingAdapter.b(this.V, str9);
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(this.V, z36);
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(this.W, z17);
            TextViewBindingAdapter.b(this.X, str10);
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(this.X, z11);
            BindingAdaptersKt.b(this.Z, productCard);
            if (ViewDataBinding.s >= 4) {
                this.R.setContentDescription(str11);
            }
        }
        if (j11 != 0) {
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(this.y, z37);
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(this.B, z33);
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(this.C, z32);
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(this.D, z27);
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(this.E.h, z29);
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(this.F, z28);
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(this.G, z30);
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(this.Y, z26);
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(this.Z, z25);
        }
        if (j13 != 0) {
            ProductLocationInfoViewKt.b(this.A, z31);
        }
        if ((j3 & 19456) != 0) {
            if (ViewDataBinding.s >= 4) {
                this.h0.setContentDescription(str8);
            }
            TextViewBindingsKt.c(this.R, inlineLabel, false);
        }
        if (j10 != 0) {
            this.M.L(brandLabel2);
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.j(this.M.h, z21);
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(this.P.h, z20);
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(this.Q.h, z19);
        }
        if (j12 != 0) {
            ProductListViewModelKt.a(this.W, str6, str7, str14, productClickListener);
        }
        this.M.k();
        this.U.k();
        this.P.k();
        this.Q.k();
        this.J.k();
        this.N.k();
        this.E.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.r0 != 0) {
                    return true;
                }
                return this.M.p() || this.U.p() || this.P.p() || this.Q.p() || this.J.p() || this.N.p() || this.E.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.r0 = llqqqql.c0063006300630063c0063;
        }
        this.M.r();
        this.U.r();
        this.P.r();
        this.Q.r();
        this.J.r();
        this.N.r();
        this.E.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        switch (i) {
            case 0:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.r0 |= 1;
                }
                return true;
            case 1:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.r0 |= 2;
                }
                return true;
            case 2:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.r0 |= 4;
                }
                return true;
            case 3:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.r0 |= 8;
                }
                return true;
            case 4:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.r0 |= 16;
                }
                return true;
            case 5:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.r0 |= 32;
                }
                return true;
            case 6:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.r0 |= 64;
                }
                return true;
            default:
                return false;
        }
    }
}
