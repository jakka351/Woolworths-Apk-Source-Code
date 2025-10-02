package au.com.woolworths.product.extensions;

import YU.a;
import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.android.onesite.extensions.IntExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.TrolleyResult;
import au.com.woolworths.android.onesite.models.TrolleyResultExtKt;
import au.com.woolworths.android.onesite.models.products.ProductListMarketplace;
import au.com.woolworths.android.onesite.models.products.PromotionInfo;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabel;
import au.com.woolworths.android.onesite.products.models.ProductPromotionTypes;
import au.com.woolworths.base.shopapp.customviews.BrandedInlineLabel;
import au.com.woolworths.base.shopapp.customviews.InlineLabel;
import au.com.woolworths.base.shopapp.customviews.InlineLabelType;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.base.shopapp.modules.button.ButtonStyleApiData;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus;
import au.com.woolworths.product.ProductFeature;
import au.com.woolworths.product.extensions.ProductInlineTypeApiDataExtKt;
import au.com.woolworths.product.models.InStoreAvailabilityInfo;
import au.com.woolworths.product.models.InStoreLocationData;
import au.com.woolworths.product.models.InStoreLocationType;
import au.com.woolworths.product.models.InstoreDetailsData;
import au.com.woolworths.product.models.MemberPriceInfo;
import au.com.woolworths.product.models.MemberPriceInfoKt;
import au.com.woolworths.product.models.MultiBuyPriceInfo;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardKt;
import au.com.woolworths.product.models.ProductId;
import au.com.woolworths.product.models.ProductInlineLabel;
import au.com.woolworths.product.models.ProductInlineLabelApiData;
import au.com.woolworths.product.models.ProductInlineTypeApiData;
import au.com.woolworths.product.models.ProductQuantityHelper;
import au.com.woolworths.product.models.ProductTileButtonType;
import au.com.woolworths.product.models.ProductTrolleyData;
import au.com.woolworths.product.models.ProductVarieties;
import au.com.woolworths.product.models.PurchaseRestriction;
import au.com.woolworths.product.models.RewardsOfferInfo;
import au.com.woolworths.product.tile.LowerPriceYellowType;
import au.com.woolworths.product.ui.CustomBrandLabel;
import au.com.woolworths.product.ui.ListButtonType;
import au.com.woolworths.product.ui.ProductCardButtonType;
import au.com.woolworths.product.ui.ProductCardButtonsState;
import au.com.woolworths.product.ui.ProductListPromotionLabel;
import au.com.woolworths.product.ui.ProductMultiBuyLabel;
import au.com.woolworths.product.ui.ProductMultiBuyLabelStyle;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductCardExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9318a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[RewardsOfferStatus.values().length];
            try {
                iArr[RewardsOfferStatus.NOT_ACTIVATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RewardsOfferStatus.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RewardsOfferStatus.ACTIVATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[ButtonStyleApiData.values().length];
            try {
                iArr2[ButtonStyleApiData.INSTOCK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ButtonStyleApiData.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ButtonStyleApiData.PRIMARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f9318a = iArr2;
            int[] iArr3 = new int[ProductTileButtonType.values().length];
            try {
                iArr3[ProductTileButtonType.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[ProductTileButtonType.UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[ProductTileButtonType.DISABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            b = iArr3;
            int[] iArr4 = new int[ProductPromotionTypes.values().length];
            try {
                iArr4[ProductPromotionTypes.LOW_PRICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[ProductPromotionTypes.SPECIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[ProductPromotionTypes.PRICE_DROPPED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[ProductPromotionTypes.LOWER_SHELF_PRICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[ProductPromotionTypes.CONTAINER_CREDITS.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[ProductPromotionTypes.LOWER_PRICE.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            c = iArr4;
            d = new int[ProductInlineTypeApiData.values().length];
            int[] iArr5 = new int[InStoreLocationType.values().length];
            try {
                iArr5[InStoreLocationType.UNAVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            e = iArr5;
        }
    }

    public static final ProductCard A(ProductCard productCard, float f) {
        Pair pair;
        String buttonLabel;
        Intrinsics.h(productCard, "<this>");
        if (productCard.isAvailable()) {
            pair = f == BitmapDescriptorFactory.HUE_RED ? new Pair(ProductTileButtonType.ADD, "Add") : new Pair(ProductTileButtonType.UPDATE, "Update");
        } else {
            ProductTileButtonType productTileButtonType = ProductTileButtonType.DISABLED;
            ProductTrolleyData trolley = productCard.getTrolley();
            if (trolley == null || (buttonLabel = trolley.getButtonLabel()) == null) {
                buttonLabel = "Unavailable";
            }
            pair = new Pair(productTileButtonType, buttonLabel);
        }
        ProductTileButtonType productTileButtonType2 = (ProductTileButtonType) pair.d;
        String str = (String) pair.e;
        ProductTrolleyData trolley2 = productCard.getTrolley();
        return productCard.copy(((-33554433) & 1) != 0 ? productCard.productId : null, ((-33554433) & 2) != 0 ? productCard.name : null, ((-33554433) & 4) != 0 ? productCard.productImage : null, ((-33554433) & 8) != 0 ? productCard.badgeImage : null, ((-33554433) & 16) != 0 ? productCard.price : null, ((-33554433) & 32) != 0 ? productCard.unitOfMeasureLabel : null, ((-33554433) & 64) != 0 ? productCard.promotionValue : null, ((-33554433) & 128) != 0 ? productCard.promotionType : null, ((-33554433) & 256) != 0 ? productCard.unitPriceDescription : null, ((-33554433) & 512) != 0 ? productCard.isAvailable : false, ((-33554433) & 1024) != 0 ? productCard.isNew : false, ((-33554433) & 2048) != 0 ? productCard.wasPrice : null, ((-33554433) & 4096) != 0 ? productCard.multiBuyPrice : null, ((-33554433) & 8192) != 0 ? productCard.multiBuyUnitPrice : null, ((-33554433) & 16384) != 0 ? productCard.purchaseWarning : null, ((-33554433) & 32768) != 0 ? productCard.trolley : trolley2 != null ? trolley2.copy((895 & 1) != 0 ? trolley2.minimum : 0.0d, (895 & 2) != 0 ? trolley2.maximum : 0.0d, (895 & 4) != 0 ? trolley2.increment : 0.0d, (895 & 8) != 0 ? trolley2.defaultValue : 0.0d, (895 & 16) != 0 ? trolley2.inTrolley : Double.valueOf(f), (895 & 32) != 0 ? trolley2.unitLabel : null, (895 & 64) != 0 ? trolley2.buttonState : productTileButtonType2, (895 & 128) != 0 ? trolley2.buttonLabel : str, (895 & 256) != 0 ? trolley2.buttonQuantity : ProductTrolleyExtKt.a(productCard.getTrolley(), f), (895 & 512) != 0 ? trolley2.title : null) : null, ((-33554433) & 65536) != 0 ? productCard.trolleys : null, ((-33554433) & 131072) != 0 ? productCard.productShoppingList : null, ((-33554433) & 262144) != 0 ? productCard.inStoreDetails : null, ((-33554433) & 524288) != 0 ? productCard.purchaseRestriction : null, ((-33554433) & 1048576) != 0 ? productCard.inlineLabels : null, ((-33554433) & 2097152) != 0 ? productCard.promotionInfo : null, ((-33554433) & 4194304) != 0 ? productCard.adId : null, ((-33554433) & 8388608) != 0 ? productCard.source : null, ((-33554433) & 16777216) != 0 ? productCard.marketplace : null, ((-33554433) & 33554432) != 0 ? productCard.rewardsOfferInfo : null, ((-33554433) & 67108864) != 0 ? productCard.disclaimer : null, ((-33554433) & 134217728) != 0 ? productCard.tagLabel : null, ((-33554433) & 268435456) != 0 ? productCard.inStoreAvailabilityInfo : null, ((-33554433) & 536870912) != 0 ? productCard.productVarieties : null, ((-33554433) & 1073741824) != 0 ? productCard.categories : null, ((-33554433) & Integer.MIN_VALUE) != 0 ? productCard.isTobacco : false, (255 & 1) != 0 ? productCard.multiBuyPriceInfo : null, (255 & 2) != 0 ? productCard.memberPriceInfo : null, (255 & 4) != 0 ? productCard.cartProductInfo : null, (255 & 8) != 0 ? productCard.inStoreLocation : null, (255 & 16) != 0 ? productCard.productCardAnalytics : null, (255 & 32) != 0 ? productCard.impressionAnalyticsData : null, (255 & 64) != 0 ? productCard.productCardAction : null, (255 & 128) != 0 ? productCard.pricingFootnoteMd : null);
    }

    public static final ProductCard B(ProductCard productCard, TrolleyResult trolleyResult) {
        Object next;
        Intrinsics.h(productCard, "<this>");
        Intrinsics.h(trolleyResult, "trolleyResult");
        Iterator<T> it = TrolleyResultExtKt.getAllGroceryAndMarketItems(trolleyResult).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ProductId.Companion companion = ProductId.INSTANCE;
            if (Intrinsics.c(companion.create(productCard.getProductId()), companion.create(((TrolleyResult.TrolleyItem) next).getArticle()))) {
                break;
            }
        }
        TrolleyResult.TrolleyItem trolleyItem = (TrolleyResult.TrolleyItem) next;
        return A(productCard, trolleyItem != null ? trolleyItem.getItemQuantityInTrolley() : BitmapDescriptorFactory.HUE_RED);
    }

    public static final boolean a(ProductCard productCard) {
        Intrinsics.h(productCard, "<this>");
        return (productCard.isTobacco() || productCard.getPurchaseRestriction() == PurchaseRestriction.LEGAL_AGE_RESTRICTION) ? false : true;
    }

    public static final String b(ProductCard productCard, int i, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(productCard, "<this>");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        if (!featureToggleManager.c(ProductFeature.e)) {
            return productCard.getProductId();
        }
        return i + "-" + productCard.getProductId();
    }

    public static final int c(ProductCard productCard) {
        Intrinsics.h(productCard, "<this>");
        InstoreDetailsData inStoreDetails = productCard.getInStoreDetails();
        InStoreLocationType locationType = inStoreDetails != null ? inStoreDetails.getLocationType() : null;
        return (locationType == null ? -1 : WhenMappings.e[locationType.ordinal()]) == 1 ? R.drawable.product_aisle_location_icon_inactive : R.drawable.product_aisle_location_icon_active;
    }

    public static final String d(ProductCard productCard, ProductMultiBuyLabel productMultiBuyLabel, boolean z, String str) {
        String strConcat;
        String title;
        String strC;
        String name = productCard.getName();
        Integer price = productCard.getPrice();
        if (price == null || (strC = IntExtKt.c(price.intValue())) == null) {
            strConcat = null;
            title = null;
        } else {
            strConcat = "Price ".concat(strC);
            title = null;
        }
        String unitOfMeasureLabel = productCard.getUnitOfMeasureLabel();
        String strA = StringExtKt.a(productCard.getUnitPriceDescription());
        String strE = e(productCard, productMultiBuyLabel);
        PromotionInfo promotionInfo = productCard.getPromotionInfo();
        String label = promotionInfo != null ? promotionInfo.getLabel() : title;
        MemberPriceInfo memberPriceInfo = productCard.getMemberPriceInfo();
        String strContentDescription = memberPriceInfo != null ? MemberPriceInfoKt.contentDescription(memberPriceInfo) : title;
        RewardsOfferInfo rewardsOfferInfo = productCard.getRewardsOfferInfo();
        String m = rewardsOfferInfo != null ? rewardsOfferInfo.getM() : title;
        RewardsOfferInfo rewardsOfferInfo2 = productCard.getRewardsOfferInfo();
        String d = rewardsOfferInfo2 != null ? rewardsOfferInfo2.getD() : title;
        ProductListMarketplace marketplace = productCard.getMarketplace();
        if (marketplace != null) {
            title = marketplace.getTitle();
        }
        ArrayList arrayListF = ArraysKt.F(new String[]{name, strConcat, unitOfMeasureLabel, strA, strE, label, strContentDescription, m, d, title, productCard.getDisclaimer(), productCard.getPricingFootnoteMd()});
        StringBuilder sb = new StringBuilder();
        sb.append(CollectionsKt.M(arrayListF, ",\n", null, null, null, 62));
        if (z) {
            sb.append(str);
            sb.append('\n');
        }
        return sb.toString();
    }

    public static final String e(ProductCard productCard, ProductMultiBuyLabel productMultiBuyLabel) {
        if (!w(productCard, productMultiBuyLabel)) {
            return productCard.getWasPrice();
        }
        MultiBuyPriceInfo multiBuyPriceInfo = productCard.getMultiBuyPriceInfo();
        if (multiBuyPriceInfo != null) {
            String strG = a.g(multiBuyPriceInfo.getPrice(), x(productCard, productMultiBuyLabel) ? a.A(", ", StringExtKt.a(multiBuyPriceInfo.getUnitPrice())) : "");
            if (strG != null) {
                return strG;
            }
        }
        return a.g(productCard.getMultiBuyPrice(), x(productCard, productMultiBuyLabel) ? a.A(", ", StringExtKt.a(productCard.getMultiBuyUnitPrice())) : "");
    }

    public static final InlineLabel f(final ProductCard productCard, boolean z) {
        ProductInlineLabelApiData productInlineLabelApiData;
        Object next;
        Intrinsics.h(productCard, "<this>");
        if (!z) {
            return new InlineLabel(productCard) { // from class: au.com.woolworths.product.extensions.ProductCardExtKt$getNameWithInlineLabel$2
                public final PlainText d;
                public final ResText e;
                public final BrandedInlineLabel f;

                {
                    this.d = new PlainText(productCard.getName());
                    this.e = productCard.isNew() ? new ResText(R.string.new_label) : null;
                    this.f = BrandedInlineLabel.d;
                }

                @Override // au.com.woolworths.base.shopapp.customviews.InlineLabel
                /* renamed from: getPlainText */
                public final Text getE() {
                    return this.d;
                }

                @Override // au.com.woolworths.base.shopapp.customviews.InlineLabel
                /* renamed from: getSpannedText */
                public final Text getD() {
                    return this.e;
                }

                @Override // au.com.woolworths.base.shopapp.customviews.InlineLabel
                /* renamed from: getType */
                public final InlineLabelType getF() {
                    return this.f;
                }
            };
        }
        List<ProductInlineLabelApiData> inlineLabels = productCard.getInlineLabels();
        if (inlineLabels != null) {
            Iterator<T> it = inlineLabels.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    Integer priority = ((ProductInlineLabelApiData) next).getPriority();
                    int iIntValue = priority != null ? priority.intValue() : 0;
                    do {
                        Object next2 = it.next();
                        Integer priority2 = ((ProductInlineLabelApiData) next2).getPriority();
                        int iIntValue2 = priority2 != null ? priority2.intValue() : 0;
                        if (iIntValue > iIntValue2) {
                            next = next2;
                            iIntValue = iIntValue2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            productInlineLabelApiData = (ProductInlineLabelApiData) next;
        } else {
            productInlineLabelApiData = null;
        }
        ProductInlineTypeApiData type = productInlineLabelApiData != null ? productInlineLabelApiData.getType() : null;
        if ((type == null ? -1 : WhenMappings.d[type.ordinal()]) == -1) {
            return new InlineLabel(productCard) { // from class: au.com.woolworths.product.extensions.ProductCardExtKt$getNameWithInlineLabel$1
                public final PlainText d;
                public final BrandedInlineLabel e = BrandedInlineLabel.d;

                {
                    this.d = new PlainText(productCard.getName());
                }

                @Override // au.com.woolworths.base.shopapp.customviews.InlineLabel
                /* renamed from: getPlainText */
                public final Text getE() {
                    return this.d;
                }

                @Override // au.com.woolworths.base.shopapp.customviews.InlineLabel
                /* renamed from: getSpannedText */
                public final /* bridge */ /* synthetic */ Text getD() {
                    return null;
                }

                @Override // au.com.woolworths.base.shopapp.customviews.InlineLabel
                /* renamed from: getType */
                public final InlineLabelType getF() {
                    return this.e;
                }
            };
        }
        ProductInlineTypeApiData type2 = productInlineLabelApiData.getType();
        String label = productInlineLabelApiData.getLabel();
        String name = productCard.getName();
        Intrinsics.h(type2, "<this>");
        Intrinsics.h(label, "label");
        Intrinsics.h(name, "name");
        int i = ProductInlineTypeApiDataExtKt.WhenMappings.f9319a[type2.ordinal()];
        if (i == 1) {
            return new ProductInlineLabel(BrandedInlineLabel.d, new PlainText(name), new PlainText(label));
        }
        if (i == 2) {
            return new ProductInlineLabel(BrandedInlineLabel.e, new PlainText(name), new PlainText(label));
        }
        throw new IllegalArgumentException(a.A("Unknown product inline label ", type2.name()));
    }

    public static final String g(ProductCard productCard) {
        Intrinsics.h(productCard, "<this>");
        ProductVarieties productVarieties = productCard.getProductVarieties();
        String priceFamilyId = productVarieties != null ? productVarieties.getPriceFamilyId() : null;
        return priceFamilyId == null ? "" : priceFamilyId;
    }

    public static final ProductCardButtonType h(ProductCard productCard, boolean z, boolean z2, boolean z3) {
        ButtonApiData button;
        if (productCard != null) {
            if (!z) {
                ProductTrolleyData trolley = productCard.getTrolley();
                ProductTileButtonType buttonState = trolley != null ? trolley.getButtonState() : null;
                int i = buttonState == null ? -1 : WhenMappings.b[buttonState.ordinal()];
                if (i != -1) {
                    if (i == 1) {
                        return ProductCardButtonType.d;
                    }
                    if (i == 2) {
                        return ProductCardButtonType.e;
                    }
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (productCard.getTagLabel() == null) {
                        return ProductCardButtonType.f;
                    }
                }
            } else if (!z2) {
                InStoreAvailabilityInfo inStoreAvailabilityInfo = productCard.getInStoreAvailabilityInfo();
                ButtonStyleApiData style = (inStoreAvailabilityInfo == null || (button = inStoreAvailabilityInfo.getButton()) == null) ? null : button.getStyle();
                if (style != null) {
                    int i2 = WhenMappings.f9318a[style.ordinal()];
                    if (i2 == 1) {
                        return ProductCardButtonType.h;
                    }
                    if (i2 == 2) {
                        return ProductCardButtonType.g;
                    }
                    if (i2 == 3 && !productCard.getInStoreAvailabilityInfo().getButton().getEnabled()) {
                        return z3 ? ProductCardButtonType.j : ProductCardButtonType.i;
                    }
                } else {
                    if (productCard.isAvailable()) {
                        return ProductCardButtonType.h;
                    }
                    if (productCard.getTagLabel() == null) {
                        return z3 ? ProductCardButtonType.j : ProductCardButtonType.i;
                    }
                }
            }
        }
        return null;
    }

    public static ProductCardButtonsState i(ProductCard productCard, boolean z, boolean z2, boolean z3, int i) {
        boolean z4 = (i & 2) == 0;
        if ((i & 4) != 0) {
            z2 = true;
        }
        if ((i & 8) != 0) {
            z3 = false;
        }
        ProductCardButtonType productCardButtonTypeH = h(productCard, z, z4, z3);
        ListButtonType listButtonType = null;
        if ((productCard != null ? productCard.getTagLabel() : null) == null && z2) {
            listButtonType = z ? ListButtonType.d : ListButtonType.e;
        }
        return new ProductCardButtonsState(productCardButtonTypeH, listButtonType);
    }

    public static final String j(ProductCard productCard) {
        Intrinsics.h(productCard, "<this>");
        ProductVarieties productVarieties = productCard.getProductVarieties();
        String label = productVarieties != null ? productVarieties.getLabel() : null;
        return label == null ? "" : label;
    }

    public static final BrandLabel k(ProductCard productCard, boolean z) {
        BrandLabel customBrandLabel;
        Intrinsics.h(productCard, "<this>");
        PromotionInfo promotionInfo = productCard.getPromotionInfo();
        if (promotionInfo == null) {
            return ProductListPromotionLabel.k;
        }
        PlainText plainText = new PlainText(promotionInfo.getLabel());
        switch (WhenMappings.c[promotionInfo.getType().ordinal()]) {
            case 1:
                customBrandLabel = ProductListPromotionLabel.h;
                break;
            case 2:
                customBrandLabel = ProductListPromotionLabel.i;
                break;
            case 3:
                customBrandLabel = ProductListPromotionLabel.e;
                break;
            case 4:
                customBrandLabel = ProductListPromotionLabel.f;
                break;
            case 5:
                customBrandLabel = ProductListPromotionLabel.j;
                break;
            case 6:
                if (!z) {
                    ProductListPromotionLabel productListPromotionLabel = ProductListPromotionLabel.g;
                    productListPromotionLabel.d = plainText;
                    customBrandLabel = productListPromotionLabel;
                    break;
                } else {
                    customBrandLabel = new CustomBrandLabel(new LowerPriceYellowType(R.color.color_black_900, R.color.color_brand_specials, R.color.color_brand_specials), plainText);
                    break;
                }
            default:
                customBrandLabel = ProductListPromotionLabel.k;
                break;
        }
        if (customBrandLabel instanceof ProductListPromotionLabel) {
            ((ProductListPromotionLabel) customBrandLabel).d = plainText;
        }
        return customBrandLabel;
    }

    public static final float l(ProductCard productCard, int i) {
        Intrinsics.h(productCard, "<this>");
        return (float) ProductQuantityHelper.INSTANCE.getQuantityFromIndex(i, productCard.getProductShoppingList().getIncrement());
    }

    public static final String m(ProductCard productCard, ProductMultiBuyLabel productMultiBuyLabel, boolean z, Context context) {
        Intrinsics.h(productCard, "<this>");
        Intrinsics.h(context, "context");
        String string = productCard.isAvailable() ? context.getString(R.string.in_stock) : context.getString(R.string.unavailable);
        Intrinsics.e(string);
        return d(productCard, productMultiBuyLabel, z, string);
    }

    public static final String n(ProductCard productCard, ProductMultiBuyLabel productMultiBuyLabel, boolean z, Composer composer) {
        String strC;
        Intrinsics.h(productCard, "<this>");
        composer.o(1187064072);
        if (productCard.isAvailable()) {
            composer.o(-934730519);
            strC = StringResources_androidKt.c(composer, R.string.in_stock);
            composer.l();
        } else {
            composer.o(-934675742);
            strC = StringResources_androidKt.c(composer, R.string.unavailable);
            composer.l();
        }
        String strD = d(productCard, productMultiBuyLabel, z, strC);
        composer.l();
        return strD;
    }

    public static final boolean o(ProductCard productCard) {
        InStoreLocationData inStoreLocation;
        return ((productCard == null || (inStoreLocation = productCard.getInStoreLocation()) == null) ? null : inStoreLocation.getDetails()) != null;
    }

    public static final Integer p(ProductCard productCard) {
        Intrinsics.h(productCard, "<this>");
        Double dU = u(productCard);
        if (dU == null) {
            return null;
        }
        double dDoubleValue = dU.doubleValue();
        ProductQuantityHelper productQuantityHelper = ProductQuantityHelper.INSTANCE;
        ProductTrolleyData trolley = productCard.getTrolley();
        Intrinsics.e(trolley);
        return Integer.valueOf(productQuantityHelper.getIndexFromQuantity(dDoubleValue, trolley.getIncrement()));
    }

    public static final boolean q(ProductCard productCard) {
        Intrinsics.h(productCard, "<this>");
        String instoreLocationText = ProductCardKt.getInstoreLocationText(productCard);
        return !(instoreLocationText == null || instoreLocationText.length() == 0);
    }

    public static final boolean r(ProductCard productCard) {
        ProductTrolleyData trolley;
        Double inTrolley;
        return (productCard == null || (trolley = productCard.getTrolley()) == null || (inTrolley = trolley.getInTrolley()) == null || inTrolley.doubleValue() <= 0.0d) ? false : true;
    }

    public static final boolean s(ProductCard productCard) {
        Intrinsics.h(productCard, "<this>");
        return k(productCard, false) != ProductListPromotionLabel.k && productCard.getTagLabel() == null;
    }

    public static final boolean t(ProductCard productCard, List list) {
        Intrinsics.h(productCard, "<this>");
        return list != null && list.contains(ProductId.INSTANCE.create(productCard.getProductId()));
    }

    public static final Double u(ProductCard productCard) {
        ProductTrolleyData trolley;
        if (productCard == null || (trolley = productCard.getTrolley()) == null) {
            return null;
        }
        return trolley.getInTrolley();
    }

    public static final boolean v(ProductCard productCard) {
        Intrinsics.h(productCard, "<this>");
        ProductListMarketplace marketplace = productCard.getMarketplace();
        String lowestMarketPriceDescription = marketplace != null ? marketplace.getLowestMarketPriceDescription() : null;
        return !(lowestMarketPriceDescription == null || StringsKt.D(lowestMarketPriceDescription));
    }

    public static final boolean w(ProductCard productCard, ProductMultiBuyLabelStyle labelStyle) {
        MultiBuyPriceInfo multiBuyPriceInfo;
        Intrinsics.h(labelStyle, "labelStyle");
        String price = (productCard == null || (multiBuyPriceInfo = productCard.getMultiBuyPriceInfo()) == null) ? null : multiBuyPriceInfo.getPrice();
        if (price == null || StringsKt.D(price)) {
            String multiBuyPrice = productCard != null ? productCard.getMultiBuyPrice() : null;
            if ((multiBuyPrice == null || StringsKt.D(multiBuyPrice)) && !x(productCard, labelStyle)) {
                return false;
            }
        }
        if ((productCard != null ? productCard.getTagLabel() : null) == null) {
            return (productCard != null ? productCard.getMemberPriceInfo() : null) == null;
        }
        return false;
    }

    public static final boolean x(ProductCard productCard, ProductMultiBuyLabelStyle labelStyle) {
        MultiBuyPriceInfo multiBuyPriceInfo;
        Intrinsics.h(labelStyle, "labelStyle");
        String unitPrice = (productCard == null || (multiBuyPriceInfo = productCard.getMultiBuyPriceInfo()) == null) ? null : multiBuyPriceInfo.getUnitPrice();
        if (unitPrice == null || StringsKt.D(unitPrice)) {
            String multiBuyUnitPrice = productCard != null ? productCard.getMultiBuyUnitPrice() : null;
            if (multiBuyUnitPrice == null || StringsKt.D(multiBuyUnitPrice)) {
                return false;
            }
        }
        if (labelStyle.b()) {
            return (productCard != null ? productCard.getTagLabel() : null) == null;
        }
        return false;
    }

    public static final boolean y(ProductCard productCard) {
        Intrinsics.h(productCard, "<this>");
        ProductVarieties productVarieties = productCard.getProductVarieties();
        String label = productVarieties != null ? productVarieties.getLabel() : null;
        return !(label == null || StringsKt.D(label));
    }

    public static final boolean z(ProductCard productCard, ProductMultiBuyLabel productMultiBuyLabel) {
        String wasPrice = productCard != null ? productCard.getWasPrice() : null;
        if (wasPrice == null || StringsKt.D(wasPrice) || w(productCard, productMultiBuyLabel)) {
            return false;
        }
        if ((productCard != null ? productCard.getTagLabel() : null) == null) {
            return (productCard != null ? productCard.getMemberPriceInfo() : null) == null;
        }
        return false;
    }
}
