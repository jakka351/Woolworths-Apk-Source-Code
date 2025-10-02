package au.com.woolworths.product.details;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.camera.core.processing.f;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.OneShotPreDrawListener;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.data.HorizontalListDataInterface;
import au.com.woolworths.android.onesite.epoxy.CarouselWithPagerSnapExpoxyModel;
import au.com.woolworths.android.onesite.epoxy.HorizontalDividerEpoxyModel;
import au.com.woolworths.android.onesite.epoxy.ItemSpacerEpoxyModel;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.couponbanner.CouponBannerTermsAndConditions;
import au.com.woolworths.android.onesite.modules.couponbanner.EverydayMarketCouponBannerColorTheme;
import au.com.woolworths.android.onesite.modules.couponbanner.EverydayMarketCouponBannerData;
import au.com.woolworths.android.onesite.modules.customviews.itemdividers.Divider;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerClickListener;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.base.shopapp.epoxy.HorizontalListActionState;
import au.com.woolworths.base.shopapp.epoxy.HorizontalModelGroup;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.product.list.legacy.k;
import au.com.woolworths.product.ItemProductCardTileBindingModel_;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.composeui.ProductMemberPriceLabelStyling;
import au.com.woolworths.product.details.analytics.ProductDetailsActions;
import au.com.woolworths.product.details.customviews.HtmlLinkTextView;
import au.com.woolworths.product.details.databinding.EpoxyItemCollapsibleContentBinding;
import au.com.woolworths.product.details.databinding.EpoxyItemHealthierProductCardBinding;
import au.com.woolworths.product.details.databinding.EpoxyItemProductNutritionInfoBinding;
import au.com.woolworths.product.details.databinding.ItemProductNutritionTableHeaderCellBinding;
import au.com.woolworths.product.details.databinding.ItemProductNutritionTableRowCellBinding;
import au.com.woolworths.product.details.epoxy.HealthierHorizontalModelGroup;
import au.com.woolworths.product.details.epoxy.ProductCardGroup;
import au.com.woolworths.product.details.models.BannerInfoData;
import au.com.woolworths.product.details.models.BannerInfoDataKt;
import au.com.woolworths.product.details.models.CountryOfOriginAndHealthInfo;
import au.com.woolworths.product.details.models.CppProductsHorizontalList;
import au.com.woolworths.product.details.models.CtaData;
import au.com.woolworths.product.details.models.DisclaimerData;
import au.com.woolworths.product.details.models.HealthierHorizontalListData;
import au.com.woolworths.product.details.models.HealthierOption;
import au.com.woolworths.product.details.models.ProductDetailsMarketplace;
import au.com.woolworths.product.details.models.ProductImage;
import au.com.woolworths.product.details.models.ProductRatingsAndReviewsSummaryData;
import au.com.woolworths.product.details.models.RatingsAndReviewsCtaAction;
import au.com.woolworths.product.details.ui.BannerInfoState;
import au.com.woolworths.product.details.ui.CollapsibleContentUiModel;
import au.com.woolworths.product.details.ui.CountryOfOriginImageLoaderListener;
import au.com.woolworths.product.details.ui.ProductNutritionInfoUiModel;
import au.com.woolworths.product.details.ui.ProductReviewsSummaryTileKt;
import au.com.woolworths.product.extensions.ProductExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.promotion.banner.ItemPromotionBannerBindingModel_;
import au.com.woolworths.promotion.banner.ui.PromotionBanner;
import au.com.woolworths.sdui.shop.actionablecard.ActionableCard;
import au.com.woolworths.shared.ui.compose.couponbanner.EverydayMarketCouponBannerKt;
import au.com.woolworths.shared.ui.compose.dynamicsizecard.DynamicSizeCardKt;
import au.com.woolworths.shop.ratingsandreviews.data.RatingsAndReviewsPreviewData;
import au.com.woolworths.shop.ratingsandreviews.ui.RatingsAndReviewsPreviewUIKt;
import com.airbnb.epoxy.Carousel;
import com.airbnb.epoxy.ComposeInteropKt;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.Typed2EpoxyController;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 )2\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00020\u0001:\u0001)B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0014J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u001aH\u0002J\f\u0010\u001b\u001a\u00020\u001c*\u00020\u001dH\u0002J\f\u0010\u001e\u001a\u00020\u001c*\u00020\u001dH\u0002J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001cH\u0002J\u0018\u0010#\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J\f\u0010'\u001a\u00020(*\u00020(H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lau/com/woolworths/product/details/ProductDetailsEpoxyController;", "Lcom/airbnb/epoxy/Typed2EpoxyController;", "", "Lau/com/woolworths/product/details/models/ProductImage;", "", "clickHandler", "Lau/com/woolworths/product/details/ProductDetailsClickHandler;", "featureToggleManager", "Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;", "viewModel", "Lau/com/woolworths/product/details/ProductDetailsViewModel;", "<init>", "(Lau/com/woolworths/product/details/ProductDetailsClickHandler;Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;Lau/com/woolworths/product/details/ProductDetailsViewModel;)V", "buildModels", "", "imageList", "feed", "getHorizontalListActionState", "Lau/com/woolworths/base/shopapp/epoxy/HorizontalListActionState;", "data", "Lau/com/woolworths/android/onesite/data/HorizontalListDataInterface;", "buildCppProductsHorizontalList", "Lau/com/woolworths/product/details/models/CppProductsHorizontalList;", "index", "", "buildHealthierHorizontalList", "Lau/com/woolworths/product/details/models/HealthierHorizontalListData;", "shouldEllipsis", "", "Landroid/widget/TextView;", "isOverSizedContent", "setUpCollapsibleContent", "Lau/com/woolworths/product/details/databinding/EpoxyItemCollapsibleContentBinding;", "binding", "isCollapsed", "buildNutritionTable", "Lau/com/woolworths/product/details/databinding/EpoxyItemProductNutritionInfoBinding;", "nutritionInfoUiModel", "Lau/com/woolworths/product/details/ui/ProductNutritionInfoUiModel;", "configureNutritionTableCellLayoutParams", "Landroid/view/View;", "Companion", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductDetailsEpoxyController extends Typed2EpoxyController<List<? extends ProductImage>, List<? extends Object>> {
    public static final int $stable = 8;
    private static final int MAX_LINES_WHEN_COLLAPSE = 3;

    @NotNull
    private final ProductDetailsClickHandler clickHandler;

    @NotNull
    private final FeatureToggleManager featureToggleManager;

    @NotNull
    private final ProductDetailsViewModel viewModel;

    public ProductDetailsEpoxyController(@NotNull ProductDetailsClickHandler clickHandler, @NotNull FeatureToggleManager featureToggleManager, @NotNull ProductDetailsViewModel viewModel) {
        Intrinsics.h(clickHandler, "clickHandler");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(viewModel, "viewModel");
        this.clickHandler = clickHandler;
        this.featureToggleManager = featureToggleManager;
        this.viewModel = viewModel;
    }

    private final void buildCppProductsHorizontalList(CppProductsHorizontalList data, int index) {
        final String title = data.getD();
        if (title == null) {
            title = "";
        }
        List<Object> items = data.getH();
        ArrayList arrayList = new ArrayList();
        for (Object obj : items) {
            if (obj instanceof ProductCard) {
                arrayList.add(obj);
            }
        }
        ProductDetailsViewModel productDetailsViewModel = this.viewModel;
        productDetailsViewModel.getClass();
        productDetailsViewModel.g.j(new ProductDetailsActions.CppCarouselImpression("Carousel - ".concat(title)), ProductAnalyticsExtKt.f(arrayList));
        ItemSpacerEpoxyModel itemSpacerEpoxyModel = new ItemSpacerEpoxyModel(com.woolworths.R.layout.item_spacer);
        buildCppProductsHorizontalList$lambda$12(itemSpacerEpoxyModel);
        add(itemSpacerEpoxyModel);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ProductCard productCard = (ProductCard) it.next();
            ItemProductCardTileBindingModel_ itemProductCardTileBindingModel_ = new ItemProductCardTileBindingModel_();
            itemProductCardTileBindingModel_.M(productCard.getProductId());
            String title2 = data.getD();
            itemProductCardTileBindingModel_.t();
            itemProductCardTileBindingModel_.o = title2;
            itemProductCardTileBindingModel_.t();
            itemProductCardTileBindingModel_.q = productCard;
            ProductClickListener productClickListener = new ProductClickListener() { // from class: au.com.woolworths.product.details.ProductDetailsEpoxyController$buildCppProductsHorizontalList$modelsForCarousel$1$1
                @Override // au.com.woolworths.product.tile.ProductClickListener
                public final void D4(ProductCard productCardTileData, String containerTitle) {
                    Intrinsics.h(containerTitle, "containerTitle");
                    Intrinsics.h(productCardTileData, "productCardTileData");
                    this.d.clickHandler.k3(productCardTileData, title);
                }

                @Override // au.com.woolworths.product.tile.ProductClickListener
                public final void J1(ProductCard productCardData, String containerTitle) {
                    Intrinsics.h(containerTitle, "containerTitle");
                    Intrinsics.h(productCardData, "productCardData");
                    this.d.clickHandler.F5(productCardData, containerTitle);
                }

                @Override // au.com.woolworths.product.tile.ProductClickListener
                public final void L0(ProductCard productCardTileData, String containerTitle) {
                    Intrinsics.h(containerTitle, "containerTitle");
                    Intrinsics.h(productCardTileData, "productCardTileData");
                    this.d.clickHandler.i2(productCardTileData, containerTitle);
                }

                @Override // au.com.woolworths.product.tile.ProductClickListener
                public final void T4(ProductCard productCardTileData, String containerTitle) {
                    Intrinsics.h(containerTitle, "containerTitle");
                    Intrinsics.h(productCardTileData, "productCardTileData");
                    this.d.clickHandler.M5(productCardTileData, containerTitle);
                }
            };
            itemProductCardTileBindingModel_.t();
            itemProductCardTileBindingModel_.p = productClickListener;
            Boolean bool = Boolean.TRUE;
            itemProductCardTileBindingModel_.t();
            itemProductCardTileBindingModel_.r = bool;
            arrayList2.add(itemProductCardTileBindingModel_);
        }
        addInternal(new HorizontalModelGroup(data, null, arrayList2, Integer.valueOf(index), getHorizontalListActionState(data), 34));
    }

    private static final Unit buildCppProductsHorizontalList$lambda$12(ItemSpacerEpoxyModel itemSpacer) {
        Intrinsics.h(itemSpacer, "$this$itemSpacer");
        itemSpacer.p("spacer_" + itemSpacer.hashCode());
        itemSpacer.D(com.woolworths.R.dimen.default_padding);
        return Unit.f24250a;
    }

    private final void buildHealthierHorizontalList(HealthierHorizontalListData data) {
        Ref.IntRef intRef = new Ref.IntRef();
        List<HealthierOption> healthierOptions = data.getHealthierOptions();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(healthierOptions, 10));
        for (HealthierOption healthierOption : healthierOptions) {
            ItemHealthierProductCardBindingModel_ itemHealthierProductCardBindingModel_ = new ItemHealthierProductCardBindingModel_();
            itemHealthierProductCardBindingModel_.M("product_card_" + healthierOption.getProductCard().getProductId());
            itemHealthierProductCardBindingModel_.t();
            itemHealthierProductCardBindingModel_.p = healthierOption;
            ProductDetailsClickHandler productDetailsClickHandler = this.clickHandler;
            itemHealthierProductCardBindingModel_.t();
            itemHealthierProductCardBindingModel_.q = productDetailsClickHandler;
            au.com.woolworths.feature.shop.delivery.address.a aVar = new au.com.woolworths.feature.shop.delivery.address.a(healthierOption, 29);
            itemHealthierProductCardBindingModel_.t();
            itemHealthierProductCardBindingModel_.n = aVar;
            f fVar = new f(6, data, intRef, this);
            itemHealthierProductCardBindingModel_.t();
            itemHealthierProductCardBindingModel_.o = fVar;
            arrayList.add(itemHealthierProductCardBindingModel_);
        }
        ArrayList arrayListJ0 = CollectionsKt.J0(arrayList);
        ProductDetailsClickHandler clickHandler = this.clickHandler;
        Intrinsics.h(clickHandler, "clickHandler");
        ArrayList arrayList2 = new ArrayList();
        ItemHealthierListHeaderBindingModel_ itemHealthierListHeaderBindingModel_ = new ItemHealthierListHeaderBindingModel_();
        itemHealthierListHeaderBindingModel_.M();
        itemHealthierListHeaderBindingModel_.t();
        itemHealthierListHeaderBindingModel_.n = data;
        itemHealthierListHeaderBindingModel_.t();
        itemHealthierListHeaderBindingModel_.o = clickHandler;
        arrayList2.add(itemHealthierListHeaderBindingModel_);
        CarouselWithPagerSnapExpoxyModel carouselWithPagerSnapExpoxyModel = new CarouselWithPagerSnapExpoxyModel();
        carouselWithPagerSnapExpoxyModel.E("healthier_horizontal_carousel");
        carouselWithPagerSnapExpoxyModel.F(arrayListJ0);
        au.com.woolworths.product.details.epoxy.a aVar2 = new au.com.woolworths.product.details.epoxy.a(arrayListJ0, 0);
        carouselWithPagerSnapExpoxyModel.t();
        carouselWithPagerSnapExpoxyModel.o = aVar2;
        k kVar = new k(22);
        carouselWithPagerSnapExpoxyModel.t();
        carouselWithPagerSnapExpoxyModel.p = kVar;
        carouselWithPagerSnapExpoxyModel.G(new Carousel.Padding(com.woolworths.R.dimen.default_padding, com.woolworths.R.dimen.default_padding, com.woolworths.R.dimen.three_quarter_default_padding));
        arrayList2.add(carouselWithPagerSnapExpoxyModel);
        addInternal(new HealthierHorizontalModelGroup(com.woolworths.R.layout.item_healthier_horizontal_list_tile, arrayList2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildHealthierHorizontalList$lambda$17$lambda$15(HealthierOption healthierOption, ItemHealthierProductCardBindingModel_ itemHealthierProductCardBindingModel_, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        ViewDataBinding viewDataBinding = dataBindingHolder.f13309a;
        EpoxyItemHealthierProductCardBinding epoxyItemHealthierProductCardBinding = viewDataBinding instanceof EpoxyItemHealthierProductCardBinding ? (EpoxyItemHealthierProductCardBinding) viewDataBinding : null;
        if (epoxyItemHealthierProductCardBinding != null) {
            ComposeView productMemberPricingLabel = epoxyItemHealthierProductCardBinding.y.C;
            Intrinsics.g(productMemberPricingLabel, "productMemberPricingLabel");
            ProductExtKt.a(productMemberPricingLabel, healthierOption.getProductCard().getMemberPriceInfo(), ProductMemberPriceLabelStyling.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildHealthierHorizontalList$lambda$17$lambda$16(HealthierHorizontalListData healthierHorizontalListData, Ref.IntRef intRef, ProductDetailsEpoxyController productDetailsEpoxyController, ItemHealthierProductCardBindingModel_ itemHealthierProductCardBindingModel_, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        if (i == 4) {
            int iIndexOf = healthierHorizontalListData.getHealthierOptions().indexOf(itemHealthierProductCardBindingModel_.p);
            if (iIndexOf > intRef.d) {
                productDetailsEpoxyController.clickHandler.Q3();
            } else {
                productDetailsEpoxyController.clickHandler.U();
            }
            intRef.d = iIndexOf;
        }
    }

    private static final Unit buildModels$lambda$11$lambda$10(int i, HorizontalDividerEpoxyModel includeHorizontalDivider) {
        Intrinsics.h(includeHorizontalDivider, "$this$includeHorizontalDivider");
        includeHorizontalDivider.p("divider_" + i);
        return Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$11$lambda$4$lambda$3(Object obj, ProductDetailsEpoxyController productDetailsEpoxyController, ItemCollapsibleContentBindingModel_ itemCollapsibleContentBindingModel_, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        CollapsibleContentUiModel collapsibleContentUiModel = (CollapsibleContentUiModel) obj;
        if (collapsibleContentUiModel.d) {
            ViewDataBinding viewDataBinding = dataBindingHolder.f13309a;
            Intrinsics.f(viewDataBinding, "null cannot be cast to non-null type au.com.woolworths.product.details.databinding.EpoxyItemCollapsibleContentBinding");
            productDetailsEpoxyController.setUpCollapsibleContent((EpoxyItemCollapsibleContentBinding) viewDataBinding, collapsibleContentUiModel.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$11$lambda$7$lambda$6(ProductDetailsEpoxyController productDetailsEpoxyController, Object obj, ItemProductNutritionInfoBindingModel_ itemProductNutritionInfoBindingModel_, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        ViewDataBinding viewDataBinding = dataBindingHolder.f13309a;
        Intrinsics.f(viewDataBinding, "null cannot be cast to non-null type au.com.woolworths.product.details.databinding.EpoxyItemProductNutritionInfoBinding");
        productDetailsEpoxyController.buildNutritionTable((EpoxyItemProductNutritionInfoBinding) viewDataBinding, (ProductNutritionInfoUiModel) obj);
    }

    private final void buildNutritionTable(EpoxyItemProductNutritionInfoBinding binding, ProductNutritionInfoUiModel nutritionInfoUiModel) {
        boolean z = nutritionInfoUiModel.g;
        List<List> list = nutritionInfoUiModel.f;
        if (z) {
            return;
        }
        LinearLayout linearLayout = binding.D;
        LinearLayout linearLayout2 = binding.D;
        View view = binding.h;
        if (linearLayout.getChildCount() == list.size() + 1) {
            return;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(view.getContext());
        linearLayout2.removeAllViews();
        int color = view.getContext().getColor(com.woolworths.R.color.nutrition_table_header_color);
        LinearLayout linearLayout3 = new LinearLayout(view.getContext());
        linearLayout3.setOrientation(0);
        linearLayout3.setBackgroundColor(color);
        linearLayout3.setFocusable(true);
        for (String str : nutritionInfoUiModel.e) {
            int i = ItemProductNutritionTableHeaderCellBinding.z;
            androidx.databinding.DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
            ItemProductNutritionTableHeaderCellBinding itemProductNutritionTableHeaderCellBinding = (ItemProductNutritionTableHeaderCellBinding) ViewDataBinding.q(layoutInflaterFrom, com.woolworths.R.layout.item_product_nutrition_table_header_cell, null, false, null);
            itemProductNutritionTableHeaderCellBinding.L(str);
            View view2 = itemProductNutritionTableHeaderCellBinding.h;
            Intrinsics.g(view2, "getRoot(...)");
            linearLayout3.addView(configureNutritionTableCellLayoutParams(view2));
        }
        linearLayout2.addView(linearLayout3);
        int color2 = view.getContext().getColor(com.woolworths.R.color.nutrition_table_row_color);
        for (List<String> list2 : list) {
            LinearLayout linearLayout4 = new LinearLayout(view.getContext());
            linearLayout4.setOrientation(0);
            linearLayout4.setBackgroundColor(color2);
            linearLayout4.setFocusable(true);
            for (String str2 : list2) {
                int i2 = ItemProductNutritionTableRowCellBinding.z;
                androidx.databinding.DataBinderMapperImpl dataBinderMapperImpl2 = DataBindingUtil.f2545a;
                ItemProductNutritionTableRowCellBinding itemProductNutritionTableRowCellBinding = (ItemProductNutritionTableRowCellBinding) ViewDataBinding.q(layoutInflaterFrom, com.woolworths.R.layout.item_product_nutrition_table_row_cell, null, false, null);
                itemProductNutritionTableRowCellBinding.L(str2);
                View view3 = itemProductNutritionTableRowCellBinding.h;
                Intrinsics.g(view3, "getRoot(...)");
                linearLayout4.addView(configureNutritionTableCellLayoutParams(view3));
            }
            linearLayout2.addView(linearLayout4);
        }
    }

    private final View configureNutritionTableCellLayoutParams(View view) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.gravity = 16;
        view.setLayoutParams(layoutParams);
        return view;
    }

    private final HorizontalListActionState getHorizontalListActionState(HorizontalListDataInterface data) {
        String deepLink = data.getG();
        return (deepLink == null || deepLink.length() == 0) ? HorizontalListActionState.f : HorizontalListActionState.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isOverSizedContent(TextView textView) {
        return textView.getLineCount() > 3;
    }

    private final EpoxyItemCollapsibleContentBinding setUpCollapsibleContent(final EpoxyItemCollapsibleContentBinding binding, final boolean isCollapsed) {
        final HtmlLinkTextView content = binding.z;
        Intrinsics.g(content, "content");
        OneShotPreDrawListener.a(content, new Runnable() { // from class: au.com.woolworths.product.details.ProductDetailsEpoxyController$setUpCollapsibleContent$lambda$19$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                EpoxyItemCollapsibleContentBinding epoxyItemCollapsibleContentBinding = binding;
                HtmlLinkTextView content2 = epoxyItemCollapsibleContentBinding.z;
                Intrinsics.g(content2, "content");
                ProductDetailsEpoxyController productDetailsEpoxyController = this;
                if (!productDetailsEpoxyController.shouldEllipsis(content2)) {
                    HtmlLinkTextView content3 = epoxyItemCollapsibleContentBinding.z;
                    Intrinsics.g(content3, "content");
                    if (!productDetailsEpoxyController.isOverSizedContent(content3)) {
                        epoxyItemCollapsibleContentBinding.A.setVisibility(8);
                        epoxyItemCollapsibleContentBinding.z.setMaxLines(Integer.MAX_VALUE);
                        return;
                    }
                }
                epoxyItemCollapsibleContentBinding.A.setVisibility(0);
                epoxyItemCollapsibleContentBinding.z.setMaxLines(isCollapsed ? 3 : Integer.MAX_VALUE);
            }
        });
        return binding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldEllipsis(TextView textView) {
        return textView.getLayout().getEllipsisCount(textView.getLineCount() - 1) > 0;
    }

    @Override // com.airbnb.epoxy.Typed2EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends ProductImage> list, List<? extends Object> list2) {
        buildModels2((List<ProductImage>) list, list2);
    }

    /* renamed from: buildModels, reason: avoid collision after fix types in other method */
    public void buildModels2(@NotNull List<ProductImage> imageList, @NotNull List<? extends Object> feed) {
        Intrinsics.h(imageList, "imageList");
        Intrinsics.h(feed, "feed");
        int i = 0;
        for (Object obj : feed) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            if (obj instanceof EverydayMarketCouponBannerData) {
                Object[] objArr = {obj};
                final EverydayMarketCouponBannerData everydayMarketCouponBannerData = (EverydayMarketCouponBannerData) obj;
                ComposeInteropKt.a(this, YU.a.d(i, "everyday_market_coupon_banner_"), objArr, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.product.details.ProductDetailsEpoxyController$buildModels$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Composer composer = (Composer) obj2;
                        if ((((Number) obj3).intValue() & 3) == 2 && composer.c()) {
                            composer.j();
                        } else {
                            final EverydayMarketCouponBannerData everydayMarketCouponBannerData2 = everydayMarketCouponBannerData;
                            final ProductDetailsEpoxyController productDetailsEpoxyController = this;
                            CoreThemeKt.b(6, composer, ComposableLambdaKt.c(1108662941, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.product.details.ProductDetailsEpoxyController$buildModels$1$1.1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    Composer composer2 = (Composer) obj4;
                                    if ((((Number) obj5).intValue() & 3) == 2 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        Modifier modifierF = PaddingKt.f(Modifier.Companion.d, 16);
                                        EverydayMarketCouponBannerData everydayMarketCouponBannerData3 = everydayMarketCouponBannerData2;
                                        String str = everydayMarketCouponBannerData3.e;
                                        String str2 = everydayMarketCouponBannerData3.f;
                                        CouponBannerTermsAndConditions couponBannerTermsAndConditions = everydayMarketCouponBannerData3.k;
                                        String str3 = couponBannerTermsAndConditions.e;
                                        String str4 = couponBannerTermsAndConditions.d;
                                        String strM = CollectionsKt.M(StringsKt.m(str2), ",", null, null, null, 62);
                                        String str5 = everydayMarketCouponBannerData3.g;
                                        String str6 = everydayMarketCouponBannerData3.h;
                                        EverydayMarketCouponBannerColorTheme everydayMarketCouponBannerColorTheme = everydayMarketCouponBannerData3.d;
                                        ProductDetailsEpoxyController productDetailsEpoxyController2 = productDetailsEpoxyController;
                                        ProductDetailsClickHandler productDetailsClickHandler = productDetailsEpoxyController2.clickHandler;
                                        composer2.o(5004770);
                                        boolean zI = composer2.I(productDetailsClickHandler);
                                        Object objG = composer2.G();
                                        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                        if (zI || objG == composer$Companion$Empty$1) {
                                            ProductDetailsEpoxyController$buildModels$1$1$1$1$1 productDetailsEpoxyController$buildModels$1$1$1$1$1 = new ProductDetailsEpoxyController$buildModels$1$1$1$1$1(2, productDetailsClickHandler, ProductDetailsClickHandler.class, "onEverydayMarketTermsAndConditionsClicked", "onEverydayMarketTermsAndConditionsClicked(Ljava/lang/String;Ljava/lang/String;)V", 0);
                                            composer2.A(productDetailsEpoxyController$buildModels$1$1$1$1$1);
                                            objG = productDetailsEpoxyController$buildModels$1$1$1$1$1;
                                        }
                                        KFunction kFunction = (KFunction) objG;
                                        composer2.l();
                                        ProductDetailsClickHandler productDetailsClickHandler2 = productDetailsEpoxyController2.clickHandler;
                                        composer2.o(5004770);
                                        boolean zI2 = composer2.I(productDetailsClickHandler2);
                                        Object objG2 = composer2.G();
                                        if (zI2 || objG2 == composer$Companion$Empty$1) {
                                            objG2 = new ProductDetailsEpoxyController$buildModels$1$1$1$2$1(1, productDetailsClickHandler2, ProductDetailsClickHandler.class, "onEverydayMarketCouponCodeClicked", "onEverydayMarketCouponCodeClicked(Ljava/lang/String;)V", 0);
                                            composer2.A(objG2);
                                        }
                                        composer2.l();
                                        EverydayMarketCouponBannerKt.a(str, str2, str6, str3, str4, strM, str5, everydayMarketCouponBannerColorTheme, (Function2) kFunction, (Function1) ((KFunction) objG2), modifierF, composer2, 0, 6, 0);
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer));
                        }
                        return Unit.f24250a;
                    }
                }, true, 1106575866));
            } else if (obj instanceof ActionableCard) {
                final ActionableCard actionableCard = (ActionableCard) obj;
                add(ComposeInteropKt.b(YU.a.d(i, "actionable_card_"), new Object[0], new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.product.details.ProductDetailsEpoxyController$buildModels$1$2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Composer composer = (Composer) obj2;
                        if ((((Number) obj3).intValue() & 3) == 2 && composer.c()) {
                            composer.j();
                        } else {
                            final ActionableCard actionableCard2 = actionableCard;
                            final ProductDetailsEpoxyController productDetailsEpoxyController = this;
                            ThemeKt.b(6, composer, ComposableLambdaKt.c(-960489800, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.product.details.ProductDetailsEpoxyController$buildModels$1$2.1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    Composer composer2 = (Composer) obj4;
                                    if ((((Number) obj5).intValue() & 3) == 2 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        float f = 16;
                                        Modifier modifierJ = PaddingKt.j(SizeKt.x(SizeKt.e(Modifier.Companion.d, 1.0f), Alignment.Companion.k, false), f, 8, f, BitmapDescriptorFactory.HUE_RED, 8);
                                        composer2.o(5004770);
                                        ProductDetailsEpoxyController productDetailsEpoxyController2 = productDetailsEpoxyController;
                                        boolean zI = composer2.I(productDetailsEpoxyController2);
                                        Object objG = composer2.G();
                                        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                        if (zI || objG == composer$Companion$Empty$1) {
                                            objG = new au.com.woolworths.feature.shop.instore.navigation.map.utils.a(productDetailsEpoxyController2, 29);
                                            composer2.A(objG);
                                        }
                                        Function1 function1 = (Function1) objG;
                                        Object objE = au.com.woolworths.android.onesite.a.e(composer2, 1849434622);
                                        if (objE == composer$Companion$Empty$1) {
                                            objE = new au.com.woolworths.foundation.shop.olive.voice.ui.search.a(20);
                                            composer2.A(objE);
                                        }
                                        composer2.l();
                                        DynamicSizeCardKt.b(actionableCard2, modifierJ, function1, (Function1) objE, null, BitmapDescriptorFactory.HUE_RED, composer2, 3080, 48);
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer));
                        }
                        return Unit.f24250a;
                    }
                }, true, -1952730000)));
            } else if (obj instanceof ProductCard) {
                addInternal(new ProductCardGroup(imageList, (ProductCard) obj, this.clickHandler, this.viewModel.l.d()));
            } else if (obj instanceof ProductRatingsAndReviewsSummaryData) {
                final ProductRatingsAndReviewsSummaryData productRatingsAndReviewsSummaryData = (ProductRatingsAndReviewsSummaryData) obj;
                addInternal(ComposeInteropKt.b(YU.a.d(productRatingsAndReviewsSummaryData.hashCode(), "product_reviews_summary_"), new Object[0], new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.product.details.ProductDetailsEpoxyController$buildModels$1$3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Composer composer = (Composer) obj2;
                        if ((((Number) obj3).intValue() & 3) == 2 && composer.c()) {
                            composer.j();
                        } else {
                            final ProductRatingsAndReviewsSummaryData productRatingsAndReviewsSummaryData2 = productRatingsAndReviewsSummaryData;
                            final ProductDetailsEpoxyController productDetailsEpoxyController = this;
                            ThemeKt.b(6, composer, ComposableLambdaKt.c(-2080376984, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.product.details.ProductDetailsEpoxyController$buildModels$1$3.1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    RatingsAndReviewsCtaAction action;
                                    Composer composer2 = (Composer) obj4;
                                    if ((((Number) obj5).intValue() & 3) == 2 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        final ProductRatingsAndReviewsSummaryData productRatingsAndReviewsSummaryData3 = productRatingsAndReviewsSummaryData2;
                                        CtaData cta = productRatingsAndReviewsSummaryData3.getCta();
                                        String id = (cta == null || (action = cta.getAction()) == null) ? null : action.getId();
                                        if (id != null) {
                                            String text = productRatingsAndReviewsSummaryData3.getRatingText().getText();
                                            String altText = productRatingsAndReviewsSummaryData3.getRatingText().getAltText();
                                            double displayRatings = productRatingsAndReviewsSummaryData3.getDisplayRatings();
                                            String str = productRatingsAndReviewsSummaryData3.getCta().getCtaText().d;
                                            String str2 = productRatingsAndReviewsSummaryData3.getCta().getCtaText().e;
                                            composer2.o(-1633490746);
                                            final ProductDetailsEpoxyController productDetailsEpoxyController2 = productDetailsEpoxyController;
                                            boolean zI = composer2.I(productDetailsEpoxyController2) | composer2.I(productRatingsAndReviewsSummaryData3);
                                            Object objG = composer2.G();
                                            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                            if (zI || objG == composer$Companion$Empty$1) {
                                                final int i3 = 0;
                                                objG = new Function0() { // from class: au.com.woolworths.product.details.c
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        switch (i3) {
                                                            case 0:
                                                                ProductDetailsClickHandler productDetailsClickHandler = productDetailsEpoxyController2.clickHandler;
                                                                ProductRatingsAndReviewsSummaryData productRatingsAndReviewsSummaryData4 = productRatingsAndReviewsSummaryData3;
                                                                productDetailsClickHandler.M3(productRatingsAndReviewsSummaryData4.getCta().getAction().getAction(), productRatingsAndReviewsSummaryData4.getCta().getCtaText().e);
                                                                break;
                                                            default:
                                                                ProductDetailsClickHandler productDetailsClickHandler2 = productDetailsEpoxyController2.clickHandler;
                                                                ProductRatingsAndReviewsSummaryData productRatingsAndReviewsSummaryData5 = productRatingsAndReviewsSummaryData3;
                                                                productDetailsClickHandler2.M0(productRatingsAndReviewsSummaryData5.getCta().getAction().getAction(), productRatingsAndReviewsSummaryData5.getCta().getCtaText().e);
                                                                break;
                                                        }
                                                        return Unit.f24250a;
                                                    }
                                                };
                                                composer2.A(objG);
                                            }
                                            Function0 function0 = (Function0) objG;
                                            composer2.l();
                                            composer2.o(-1633490746);
                                            boolean zI2 = composer2.I(productDetailsEpoxyController2) | composer2.I(productRatingsAndReviewsSummaryData3);
                                            Object objG2 = composer2.G();
                                            if (zI2 || objG2 == composer$Companion$Empty$1) {
                                                final int i4 = 1;
                                                objG2 = new Function0() { // from class: au.com.woolworths.product.details.c
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        switch (i4) {
                                                            case 0:
                                                                ProductDetailsClickHandler productDetailsClickHandler = productDetailsEpoxyController2.clickHandler;
                                                                ProductRatingsAndReviewsSummaryData productRatingsAndReviewsSummaryData4 = productRatingsAndReviewsSummaryData3;
                                                                productDetailsClickHandler.M3(productRatingsAndReviewsSummaryData4.getCta().getAction().getAction(), productRatingsAndReviewsSummaryData4.getCta().getCtaText().e);
                                                                break;
                                                            default:
                                                                ProductDetailsClickHandler productDetailsClickHandler2 = productDetailsEpoxyController2.clickHandler;
                                                                ProductRatingsAndReviewsSummaryData productRatingsAndReviewsSummaryData5 = productRatingsAndReviewsSummaryData3;
                                                                productDetailsClickHandler2.M0(productRatingsAndReviewsSummaryData5.getCta().getAction().getAction(), productRatingsAndReviewsSummaryData5.getCta().getCtaText().e);
                                                                break;
                                                        }
                                                        return Unit.f24250a;
                                                    }
                                                };
                                                composer2.A(objG2);
                                            }
                                            composer2.l();
                                            ProductReviewsSummaryTileKt.a(text, altText, displayRatings, str, str2, id, function0, (Function0) objG2, composer2, 0);
                                        }
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer));
                        }
                        return Unit.f24250a;
                    }
                }, true, -2140469472)));
            } else if (obj instanceof InsetBannerData) {
                ItemProductInsetBannerBindingModel_ itemProductInsetBannerBindingModel_ = new ItemProductInsetBannerBindingModel_();
                InsetBannerData insetBannerData = (InsetBannerData) obj;
                itemProductInsetBannerBindingModel_.M("inset_banner_" + insetBannerData.hashCode());
                itemProductInsetBannerBindingModel_.t();
                itemProductInsetBannerBindingModel_.n = insetBannerData;
                ProductDetailsClickHandler productDetailsClickHandler = this.clickHandler;
                itemProductInsetBannerBindingModel_.t();
                itemProductInsetBannerBindingModel_.o = productDetailsClickHandler;
                add(itemProductInsetBannerBindingModel_);
            } else if (obj instanceof BannerInfoData) {
                ItemProductBannerBindingModel_ itemProductBannerBindingModel_ = new ItemProductBannerBindingModel_();
                BannerInfoData bannerInfoData = (BannerInfoData) obj;
                itemProductBannerBindingModel_.M("product_banner_" + bannerInfoData.hashCode());
                BannerInfoState uiModel = BannerInfoDataKt.toUiModel(bannerInfoData);
                itemProductBannerBindingModel_.t();
                itemProductBannerBindingModel_.n = uiModel;
                add(itemProductBannerBindingModel_);
            } else if (obj instanceof DisclaimerData) {
                ItemProductDisclaimerBindingModel_ itemProductDisclaimerBindingModel_ = new ItemProductDisclaimerBindingModel_();
                DisclaimerData disclaimerData = (DisclaimerData) obj;
                itemProductDisclaimerBindingModel_.M("product_disclaimer_" + disclaimerData.hashCode());
                String content = disclaimerData.getContent();
                itemProductDisclaimerBindingModel_.t();
                itemProductDisclaimerBindingModel_.n = content;
                add(itemProductDisclaimerBindingModel_);
            } else if (obj instanceof CollapsibleContentUiModel) {
                ItemCollapsibleContentBindingModel_ itemCollapsibleContentBindingModel_ = new ItemCollapsibleContentBindingModel_();
                CollapsibleContentUiModel collapsibleContentUiModel = (CollapsibleContentUiModel) obj;
                itemCollapsibleContentBindingModel_.M(collapsibleContentUiModel.f9315a);
                itemCollapsibleContentBindingModel_.t();
                itemCollapsibleContentBindingModel_.o = collapsibleContentUiModel;
                ProductDetailsClickHandler productDetailsClickHandler2 = this.clickHandler;
                itemCollapsibleContentBindingModel_.t();
                itemCollapsibleContentBindingModel_.p = productDetailsClickHandler2;
                b bVar = new b(0, collapsibleContentUiModel, this);
                itemCollapsibleContentBindingModel_.t();
                itemCollapsibleContentBindingModel_.n = bVar;
                add(itemCollapsibleContentBindingModel_);
            } else if (obj instanceof CountryOfOriginAndHealthInfo) {
                ItemCountryOfOriginAndHealthInfoBindingModel_ itemCountryOfOriginAndHealthInfoBindingModel_ = new ItemCountryOfOriginAndHealthInfoBindingModel_();
                CountryOfOriginAndHealthInfo countryOfOriginAndHealthInfo = (CountryOfOriginAndHealthInfo) obj;
                itemCountryOfOriginAndHealthInfoBindingModel_.M("image_content_" + countryOfOriginAndHealthInfo.hashCode());
                itemCountryOfOriginAndHealthInfoBindingModel_.t();
                itemCountryOfOriginAndHealthInfoBindingModel_.n = countryOfOriginAndHealthInfo;
                CountryOfOriginImageLoaderListener countryOfOriginImageLoaderListener = new CountryOfOriginImageLoaderListener();
                itemCountryOfOriginAndHealthInfoBindingModel_.t();
                itemCountryOfOriginAndHealthInfoBindingModel_.o = countryOfOriginImageLoaderListener;
                add(itemCountryOfOriginAndHealthInfoBindingModel_);
            } else if (obj instanceof ProductNutritionInfoUiModel) {
                ItemProductNutritionInfoBindingModel_ itemProductNutritionInfoBindingModel_ = new ItemProductNutritionInfoBindingModel_();
                itemProductNutritionInfoBindingModel_.M();
                ProductNutritionInfoUiModel productNutritionInfoUiModel = (ProductNutritionInfoUiModel) obj;
                itemProductNutritionInfoBindingModel_.t();
                itemProductNutritionInfoBindingModel_.o = productNutritionInfoUiModel;
                ProductDetailsClickHandler productDetailsClickHandler3 = this.clickHandler;
                itemProductNutritionInfoBindingModel_.t();
                itemProductNutritionInfoBindingModel_.p = productDetailsClickHandler3;
                b bVar2 = new b(this, productNutritionInfoUiModel);
                itemProductNutritionInfoBindingModel_.t();
                itemProductNutritionInfoBindingModel_.n = bVar2;
                add(itemProductNutritionInfoBindingModel_);
            } else if (obj instanceof ProductDetailsMarketplace) {
                ItemProductDetailsMarketplaceBindingModel_ itemProductDetailsMarketplaceBindingModel_ = new ItemProductDetailsMarketplaceBindingModel_();
                itemProductDetailsMarketplaceBindingModel_.M();
                itemProductDetailsMarketplaceBindingModel_.t();
                itemProductDetailsMarketplaceBindingModel_.n = (ProductDetailsMarketplace) obj;
                ProductDetailsClickHandler productDetailsClickHandler4 = this.clickHandler;
                itemProductDetailsMarketplaceBindingModel_.t();
                itemProductDetailsMarketplaceBindingModel_.o = productDetailsClickHandler4;
                add(itemProductDetailsMarketplaceBindingModel_);
            } else if (obj instanceof PromotionBanner) {
                ItemPromotionBannerBindingModel_ itemPromotionBannerBindingModel_ = new ItemPromotionBannerBindingModel_();
                final PromotionBanner promotionBanner = (PromotionBanner) obj;
                itemPromotionBannerBindingModel_.M("promotion_banner_" + promotionBanner.hashCode());
                InsetBannerData insetBannerData2 = promotionBanner.f9341a;
                itemPromotionBannerBindingModel_.t();
                itemPromotionBannerBindingModel_.n = insetBannerData2;
                InsetBannerClickListener insetBannerClickListener = new InsetBannerClickListener() { // from class: au.com.woolworths.product.details.ProductDetailsEpoxyController$buildModels$1$11$1
                    @Override // au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerClickListener
                    public final void onActionClicked(InsetBanner insetBanner) {
                        Intrinsics.h(insetBanner, "insetBanner");
                        this.d.clickHandler.z3(promotionBanner);
                    }
                };
                itemPromotionBannerBindingModel_.t();
                itemPromotionBannerBindingModel_.o = insetBannerClickListener;
                add(itemPromotionBannerBindingModel_);
            } else if (obj instanceof HealthierHorizontalListData) {
                buildHealthierHorizontalList((HealthierHorizontalListData) obj);
            } else if (obj instanceof Divider) {
                HorizontalDividerEpoxyModel horizontalDividerEpoxyModel = new HorizontalDividerEpoxyModel(com.woolworths.R.layout.include_horizontal_divider);
                buildModels$lambda$11$lambda$10(i, horizontalDividerEpoxyModel);
                add(horizontalDividerEpoxyModel);
            } else if (obj instanceof CppProductsHorizontalList) {
                buildCppProductsHorizontalList((CppProductsHorizontalList) obj, i);
            } else if ((obj instanceof RatingsAndReviewsPreviewData) && this.featureToggleManager.c(BaseShopAppFeature.N)) {
                final RatingsAndReviewsPreviewData ratingsAndReviewsPreviewData = (RatingsAndReviewsPreviewData) obj;
                addInternal(ComposeInteropKt.b(YU.a.d(ratingsAndReviewsPreviewData.d.hashCode(), "product_reviews_preview_"), new Object[0], new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.product.details.ProductDetailsEpoxyController$buildModels$1$13
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Composer composer = (Composer) obj2;
                        if ((((Number) obj3).intValue() & 3) == 2 && composer.c()) {
                            composer.j();
                        } else {
                            final RatingsAndReviewsPreviewData ratingsAndReviewsPreviewData2 = ratingsAndReviewsPreviewData;
                            final ProductDetailsEpoxyController productDetailsEpoxyController = this;
                            CoreThemeKt.c(6, composer, ComposableLambdaKt.c(563436412, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.product.details.ProductDetailsEpoxyController$buildModels$1$13.1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    Composer composer2 = (Composer) obj4;
                                    if ((((Number) obj5).intValue() & 3) == 2 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        ProductDetailsEpoxyController productDetailsEpoxyController2 = productDetailsEpoxyController;
                                        ProductDetailsClickHandler productDetailsClickHandler5 = productDetailsEpoxyController2.clickHandler;
                                        composer2.o(5004770);
                                        boolean zI = composer2.I(productDetailsClickHandler5);
                                        Object objG = composer2.G();
                                        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                        if (zI || objG == composer$Companion$Empty$1) {
                                            ProductDetailsEpoxyController$buildModels$1$13$1$1$1 productDetailsEpoxyController$buildModels$1$13$1$1$1 = new ProductDetailsEpoxyController$buildModels$1$13$1$1$1(2, productDetailsClickHandler5, ProductDetailsClickHandler.class, "onWriteReviewClick", "onWriteReviewClick(Ljava/lang/String;Ljava/lang/String;)V", 0);
                                            composer2.A(productDetailsEpoxyController$buildModels$1$13$1$1$1);
                                            objG = productDetailsEpoxyController$buildModels$1$13$1$1$1;
                                        }
                                        composer2.l();
                                        Function2 function2 = (Function2) ((KFunction) objG);
                                        ProductDetailsClickHandler productDetailsClickHandler6 = productDetailsEpoxyController2.clickHandler;
                                        composer2.o(5004770);
                                        boolean zI2 = composer2.I(productDetailsClickHandler6);
                                        Object objG2 = composer2.G();
                                        if (zI2 || objG2 == composer$Companion$Empty$1) {
                                            ProductDetailsEpoxyController$buildModels$1$13$1$2$1 productDetailsEpoxyController$buildModels$1$13$1$2$1 = new ProductDetailsEpoxyController$buildModels$1$13$1$2$1(2, productDetailsClickHandler6, ProductDetailsClickHandler.class, "onSeeAllRatingsAndReviewsClicked", "onSeeAllRatingsAndReviewsClicked(Ljava/lang/String;Ljava/lang/String;)V", 0);
                                            composer2.A(productDetailsEpoxyController$buildModels$1$13$1$2$1);
                                            objG2 = productDetailsEpoxyController$buildModels$1$13$1$2$1;
                                        }
                                        composer2.l();
                                        Function2 function22 = (Function2) ((KFunction) objG2);
                                        ProductDetailsClickHandler productDetailsClickHandler7 = productDetailsEpoxyController2.clickHandler;
                                        composer2.o(5004770);
                                        boolean zI3 = composer2.I(productDetailsClickHandler7);
                                        Object objG3 = composer2.G();
                                        if (zI3 || objG3 == composer$Companion$Empty$1) {
                                            ProductDetailsEpoxyController$buildModels$1$13$1$3$1 productDetailsEpoxyController$buildModels$1$13$1$3$1 = new ProductDetailsEpoxyController$buildModels$1$13$1$3$1(2, productDetailsClickHandler7, ProductDetailsClickHandler.class, "onShowAllReviewsClicked", "onShowAllReviewsClicked(Ljava/lang/String;Ljava/lang/String;)V", 0);
                                            composer2.A(productDetailsEpoxyController$buildModels$1$13$1$3$1);
                                            objG3 = productDetailsEpoxyController$buildModels$1$13$1$3$1;
                                        }
                                        composer2.l();
                                        RatingsAndReviewsPreviewUIKt.b(ratingsAndReviewsPreviewData2, function2, function22, (Function2) ((KFunction) objG3), null, composer2, 0);
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer));
                        }
                        return Unit.f24250a;
                    }
                }, true, 469441568)));
            }
            i = i2;
        }
    }
}
