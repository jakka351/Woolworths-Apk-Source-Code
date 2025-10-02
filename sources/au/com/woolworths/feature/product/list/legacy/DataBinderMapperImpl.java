package au.com.woolworths.feature.product.list.legacy;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeHorizontalDividerBinding;
import au.com.woolworths.android.onesite.models.notification.NotificationResult;
import au.com.woolworths.feature.product.list.legacy.databinding.ActivityLegacyProductListBindingImpl;
import au.com.woolworths.feature.product.list.legacy.databinding.ActivityProductListOptionsBindingImpl;
import au.com.woolworths.feature.product.list.legacy.databinding.EpoxyItemFilterHighlightCardLegacyBindingImpl;
import au.com.woolworths.feature.product.list.legacy.databinding.EpoxyItemIngredientCardSeparatorBindingImpl;
import au.com.woolworths.feature.product.list.legacy.databinding.EpoxyItemNutritionInfoBindingImpl;
import au.com.woolworths.feature.product.list.legacy.databinding.EpoxyItemProductCardTileConsolidatedLegacyBindingImpl;
import au.com.woolworths.feature.product.list.legacy.databinding.EpoxyItemProductCardTileGridLegacyBindingImpl;
import au.com.woolworths.feature.product.list.legacy.databinding.EpoxyItemProductCardTileGridSkeletonLegacyBindingImpl;
import au.com.woolworths.feature.product.list.legacy.databinding.EpoxyItemProductCardTileListLegacyBindingImpl;
import au.com.woolworths.feature.product.list.legacy.databinding.EpoxyItemProductCardTileListSkeletonLegacyBindingImpl;
import au.com.woolworths.feature.product.list.legacy.databinding.EpoxyItemProductIngredientBindingImpl;
import au.com.woolworths.feature.product.list.legacy.databinding.EpoxyItemProductListInsetBannerLegacyBindingImpl;
import au.com.woolworths.feature.product.list.legacy.databinding.EpoxyItemProductListOptionsChildFilterLegacyBindingImpl;
import au.com.woolworths.feature.product.list.legacy.databinding.EpoxyItemProductListOptionsDisplayModeLegacyBindingImpl;
import au.com.woolworths.feature.product.list.legacy.databinding.EpoxyItemProductListOptionsFilterLegacyBindingImpl;
import au.com.woolworths.feature.product.list.legacy.databinding.EpoxyItemProductListOptionsHeaderLegacyBindingImpl;
import au.com.woolworths.feature.product.list.legacy.databinding.EpoxyItemProductListOptionsInsetBannerLegacyBindingImpl;
import au.com.woolworths.feature.product.list.legacy.databinding.EpoxyItemProductListOptionsMarketplaceLegacyBindingImpl;
import au.com.woolworths.feature.product.list.legacy.databinding.EpoxyItemProductListOptionsSortExpandLegacyBindingImpl;
import au.com.woolworths.feature.product.list.legacy.databinding.EpoxyItemProductListOptionsSortLegacyBindingImpl;
import au.com.woolworths.feature.product.list.legacy.databinding.EpoxyItemProductListPaginationErrorStateBindingImpl;
import au.com.woolworths.feature.product.list.legacy.databinding.EpoxyItemProductListPaginationLoadingStateBindingImpl;
import au.com.woolworths.feature.product.list.legacy.databinding.EpoxyItemProductListSectionHeaderBindingImpl;
import au.com.woolworths.feature.product.list.legacy.databinding.FragmentNutritionBottomSheetLegacyBindingImpl;
import au.com.woolworths.feature.product.list.legacy.databinding.FragmentProductListLegacyBindingImpl;
import au.com.woolworths.feature.product.list.legacy.databinding.FragmentProductListOptionsFilterLegacyBindingImpl;
import au.com.woolworths.feature.product.list.legacy.databinding.FragmentProductMainFilterLegacyBindingImpl;
import au.com.woolworths.feature.product.list.legacy.databinding.IncludeCircledCountLegacyBindingImpl;
import au.com.woolworths.feature.product.list.legacy.databinding.IncludeProductListHeaderLegacyBindingImpl;
import au.com.woolworths.feature.product.list.legacy.databinding.IncludeProductListLegacyMarketplaceDetailsBindingImpl;
import au.com.woolworths.feature.product.list.legacy.databinding.IncludeSearchableToolbarWrapperWithComposeLegacyBindingImpl;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f5284a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = au.com.woolworths.android.onesite.a.b(187, 0, 1, "_all", "actionState");
            sparseArrayB.put(2, "address");
            sparseArrayB.put(3, "asset");
            sparseArrayB.put(4, "backgroundColor");
            sparseArrayB.put(5, "banner");
            sparseArrayB.put(6, "bannerAsset");
            sparseArrayB.put(7, "bannerIcon");
            sparseArrayB.put(8, "bannerState");
            sparseArrayB.put(9, "billingAddress");
            sparseArrayB.put(10, "body");
            sparseArrayB.put(11, "boostAllBannerState");
            sparseArrayB.put(12, "boostAnimationVisibility");
            sparseArrayB.put(13, "boostViewListener");
            sparseArrayB.put(14, "brandLabel");
            sparseArrayB.put(15, "buttonText");
            sparseArrayB.put(16, "buttonTint");
            sparseArrayB.put(17, "buttonTitle");
            sparseArrayB.put(18, NotificationResult.Notification.CAMPAIGN);
            sparseArrayB.put(19, "canShowWatchlist");
            sparseArrayB.put(20, "cartButton");
            sparseArrayB.put(21, "cataloguePage");
            sparseArrayB.put(22, "cents");
            sparseArrayB.put(23, "clickHandler");
            sparseArrayB.put(24, "clickHandlers");
            sparseArrayB.put(25, "clickListener");
            sparseArrayB.put(26, "coachMark");
            sparseArrayB.put(27, "collectionMethodOption");
            sparseArrayB.put(28, "color");
            sparseArrayB.put(29, "colorName");
            sparseArrayB.put(30, "condition");
            sparseArrayB.put(31, "containerTitle");
            sparseArrayB.put(32, "count");
            sparseArrayB.put(33, "cta");
            sparseArrayB.put(34, "ctaText");
            sparseArrayB.put(35, "data");
            sparseArrayB.put(36, "deliveryNowWindow");
            sparseArrayB.put(37, lqlqqlq.mmm006Dm006Dm);
            sparseArrayB.put(38, "descriptionText");
            sparseArrayB.put(39, "directToBootNowWindow");
            sparseArrayB.put(40, "discountItem");
            sparseArrayB.put(41, "dispatchNote");
            sparseArrayB.put(42, "displayExpiryExtended");
            sparseArrayB.put(43, "displayFreeTextClearIcon");
            sparseArrayB.put(44, "displayFreeTextSearchIcon");
            sparseArrayB.put(45, "displayName");
            sparseArrayB.put(46, "dollars");
            sparseArrayB.put(47, "emptyState");
            sparseArrayB.put(48, "enableBoostAnimationContainerGap");
            sparseArrayB.put(49, "enabled");
            sparseArrayB.put(50, "errorLabelText");
            sparseArrayB.put(51, "errorState");
            sparseArrayB.put(52, "eventHandler");
            sparseArrayB.put(53, "filter");
            sparseArrayB.put(54, "filterMenuItem");
            sparseArrayB.put(55, "filterOption");
            sparseArrayB.put(56, "filterOptionClickListener");
            sparseArrayB.put(57, "footer");
            sparseArrayB.put(58, "fulfilmentWindow");
            sparseArrayB.put(59, "fulfilmentWindows");
            sparseArrayB.put(60, "fulfilmentWindowsOption");
            sparseArrayB.put(61, "fulfilmentWindowsSlot");
            sparseArrayB.put(62, "groupTitle");
            sparseArrayB.put(63, "handler");
            sparseArrayB.put(64, "header");
            sparseArrayB.put(65, "heightRes");
            sparseArrayB.put(66, "hostScreen");
            sparseArrayB.put(67, "hostViewListener");
            sparseArrayB.put(68, "htmlListener");
            sparseArrayB.put(69, "iconResId");
            sparseArrayB.put(70, "imageItem");
            sparseArrayB.put(71, "imageLoadListener");
            sparseArrayB.put(72, "imageLoaderListener");
            sparseArrayB.put(73, "importantForAccessibility");
            sparseArrayB.put(74, "inMappedStore");
            sparseArrayB.put(75, "index");
            sparseArrayB.put(76, "info");
            sparseArrayB.put(77, "infoSectionItem");
            sparseArrayB.put(78, "infoView");
            sparseArrayB.put(79, "inlineMessage");
            sparseArrayB.put(80, "insetBanner");
            sparseArrayB.put(81, "isAccountNotificationBadgeShown");
            sparseArrayB.put(82, "isButtonEnabled");
            sparseArrayB.put(83, "isChecked");
            sparseArrayB.put(84, "isComposeContentViewEnabled");
            sparseArrayB.put(85, "isCtaInProgress");
            sparseArrayB.put(86, "isEdited");
            sparseArrayB.put(87, "isEnabled");
            sparseArrayB.put(88, "isInSnGSession");
            sparseArrayB.put(89, "isLoading");
            sparseArrayB.put(90, "isLowerPriceYellow");
            sparseArrayB.put(91, "isMarketplace");
            sparseArrayB.put(92, "isPopup");
            sparseArrayB.put(93, "isRewardStyle");
            sparseArrayB.put(94, "isSelected");
            sparseArrayB.put(95, "isShoppingListBeingSaved");
            sparseArrayB.put(96, "isToggleInProgress");
            sparseArrayB.put(97, "isUnlocking");
            sparseArrayB.put(98, "isWatchlist");
            sparseArrayB.put(99, "isWatchlisted");
            sparseArrayB.put(100, "item");
            sparseArrayB.put(101, "itemClickListener");
            sparseArrayB.put(102, "itemState");
            sparseArrayB.put(103, "itemWidthRes");
            sparseArrayB.put(104, AnnotatedPrivateKey.LABEL);
            sparseArrayB.put(105, "labelStyle");
            sparseArrayB.put(106, "lightTheme");
            sparseArrayB.put(107, "linkHandler");
            sparseArrayB.put(108, "listId");
            sparseArrayB.put(109, "listIndex");
            sparseArrayB.put(110, "listViewModel");
            sparseArrayB.put(111, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            sparseArrayB.put(112, "loadingMessage");
            sparseArrayB.put(113, "lottieAutoPlay");
            sparseArrayB.put(114, "lottieBackgroundColor");
            sparseArrayB.put(115, "lottieLoop");
            sparseArrayB.put(116, "margins");
            sparseArrayB.put(117, "markdownContent");
            sparseArrayB.put(118, "marketSellerGroup");
            sparseArrayB.put(119, "marketplace");
            sparseArrayB.put(120, "memberPriceInfo");
            sparseArrayB.put(121, "message");
            sparseArrayB.put(122, "mode");
            sparseArrayB.put(123, "offerViewItem");
            sparseArrayB.put(124, "onBannerClick");
            sparseArrayB.put(125, "onClick");
            sparseArrayB.put(126, "onMaxLinesToggleListener");
            sparseArrayB.put(127, "onPointsBalanceClick");
            sparseArrayB.put(128, "onQueryTextChangeListener");
            sparseArrayB.put(129, "onQueryTextFocusChangeListener");
            sparseArrayB.put(130, "onQueryTextSubmitListener");
            sparseArrayB.put(131, "onSelected");
            sparseArrayB.put(132, "optionText");
            sparseArrayB.put(133, "orderTotalDetails");
            sparseArrayB.put(134, "packagingMethodOption");
            sparseArrayB.put(135, "paddingBottom");
            sparseArrayB.put(136, "pageItem");
            sparseArrayB.put(137, "postcode");
            sparseArrayB.put(138, "previewContent");
            sparseArrayB.put(139, "primaryButtonClickListener");
            sparseArrayB.put(140, "product");
            sparseArrayB.put(141, "productCard");
            sparseArrayB.put(142, "productCardButtonsState");
            sparseArrayB.put(143, "productCardConfig");
            sparseArrayB.put(144, "productConfig");
            sparseArrayB.put(145, "productData");
            sparseArrayB.put(146, "quantity");
            sparseArrayB.put(147, "queryTextFocusChangeListener");
            sparseArrayB.put(148, "rewardsPointsBalance");
            sparseArrayB.put(149, "rewardsPointsBalanceData");
            sparseArrayB.put(150, "rewardsRegistered");
            sparseArrayB.put(151, "rewardsRegisteredRedeemable");
            sparseArrayB.put(152, "rewardsUnregistered");
            sparseArrayB.put(153, "searchQueryHint");
            sparseArrayB.put(154, "section");
            sparseArrayB.put(ModuleDescriptor.MODULE_VERSION, "sectionHeader");
            sparseArrayB.put(156, "sectionTitle");
            sparseArrayB.put(157, "seller");
            sparseArrayB.put(158, "sellerName");
            sparseArrayB.put(159, "shoppingList");
            sparseArrayB.put(160, "shouldHideToolbar");
            sparseArrayB.put(161, "shouldShowLoadingState");
            sparseArrayB.put(162, "shouldShowNewBadge");
            sparseArrayB.put(163, "shouldShowNotificationDot");
            sparseArrayB.put(164, "shouldShowWebArrow");
            sparseArrayB.put(165, "showAddToListButton");
            sparseArrayB.put(166, "showBoostAnimation");
            sparseArrayB.put(167, "showCheckedItems");
            sparseArrayB.put(168, "showDisabledState");
            sparseArrayB.put(169, "showLoadingView");
            sparseArrayB.put(170, "showNewDismissIcon");
            sparseArrayB.put(171, "showTigerDisplayExpiry");
            sparseArrayB.put(172, "showTigerOffersLabel");
            sparseArrayB.put(173, "singleLine");
            sparseArrayB.put(174, "sortByViewListener");
            sparseArrayB.put(175, "sortOption");
            sparseArrayB.put(176, "sortOptionClickListener");
            sparseArrayB.put(177, "state");
            sparseArrayB.put(178, "store");
            sparseArrayB.put(179, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(SubsamplingScaleImageView.ORIENTATION_180, "title");
            sparseArrayB.put(181, "topMarginRes");
            sparseArrayB.put(182, "viewListener");
            sparseArrayB.put(183, "viewModel");
            sparseArrayB.put(184, "viewState");
            sparseArrayB.put(185, "vocViewModel");
            sparseArrayB.put(186, "windowSubheader");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f5285a;

        static {
            HashMap map = new HashMap(31);
            f5285a = map;
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_legacy_product_list, map, "layout/activity_legacy_product_list_0", com.woolworths.R.layout.activity_product_list_options, "layout/activity_product_list_options_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_filter_highlight_card_legacy, map, "layout/epoxy_item_filter_highlight_card_legacy_0", com.woolworths.R.layout.epoxy_item_ingredient_card_separator, "layout/epoxy_item_ingredient_card_separator_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_nutrition_info, map, "layout/epoxy_item_nutrition_info_0", com.woolworths.R.layout.epoxy_item_product_card_tile_consolidated_legacy, "layout/epoxy_item_product_card_tile_consolidated_legacy_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_product_card_tile_grid_legacy, map, "layout/epoxy_item_product_card_tile_grid_legacy_0", com.woolworths.R.layout.epoxy_item_product_card_tile_grid_skeleton_legacy, "layout/epoxy_item_product_card_tile_grid_skeleton_legacy_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_product_card_tile_list_legacy, map, "layout/epoxy_item_product_card_tile_list_legacy_0", com.woolworths.R.layout.epoxy_item_product_card_tile_list_skeleton_legacy, "layout/epoxy_item_product_card_tile_list_skeleton_legacy_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_product_ingredient, map, "layout/epoxy_item_product_ingredient_0", com.woolworths.R.layout.epoxy_item_product_list_inset_banner_legacy, "layout/epoxy_item_product_list_inset_banner_legacy_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_product_list_options_child_filter_legacy, map, "layout/epoxy_item_product_list_options_child_filter_legacy_0", com.woolworths.R.layout.epoxy_item_product_list_options_display_mode_legacy, "layout/epoxy_item_product_list_options_display_mode_legacy_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_product_list_options_filter_legacy, map, "layout/epoxy_item_product_list_options_filter_legacy_0", com.woolworths.R.layout.epoxy_item_product_list_options_header_legacy, "layout/epoxy_item_product_list_options_header_legacy_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_product_list_options_inset_banner_legacy, map, "layout/epoxy_item_product_list_options_inset_banner_legacy_0", com.woolworths.R.layout.epoxy_item_product_list_options_marketplace_legacy, "layout/epoxy_item_product_list_options_marketplace_legacy_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_product_list_options_sort_expand_legacy, map, "layout/epoxy_item_product_list_options_sort_expand_legacy_0", com.woolworths.R.layout.epoxy_item_product_list_options_sort_legacy, "layout/epoxy_item_product_list_options_sort_legacy_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_product_list_pagination_error_state, map, "layout/epoxy_item_product_list_pagination_error_state_0", com.woolworths.R.layout.epoxy_item_product_list_pagination_loading_state, "layout/epoxy_item_product_list_pagination_loading_state_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_product_list_section_header, map, "layout/epoxy_item_product_list_section_header_0", com.woolworths.R.layout.fragment_nutrition_bottom_sheet_legacy, "layout/fragment_nutrition_bottom_sheet_legacy_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.fragment_product_list_legacy, map, "layout/fragment_product_list_legacy_0", com.woolworths.R.layout.fragment_product_list_options_filter_legacy, "layout/fragment_product_list_options_filter_legacy_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.fragment_product_main_filter_legacy, map, "layout/fragment_product_main_filter_legacy_0", com.woolworths.R.layout.include_circled_count_legacy, "layout/include_circled_count_legacy_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.include_product_list_header_legacy, map, "layout/include_product_list_header_legacy_0", com.woolworths.R.layout.include_product_list_legacy_marketplace_details, "layout/include_product_list_legacy_marketplace_details_0");
            map.put("layout/include_searchable_toolbar_wrapper_with_compose_legacy_0", Integer.valueOf(com.woolworths.R.layout.include_searchable_toolbar_wrapper_with_compose_legacy));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(31);
        f5284a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.activity_legacy_product_list, 1);
        sparseIntArray.put(com.woolworths.R.layout.activity_product_list_options, 2);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_filter_highlight_card_legacy, 3);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_ingredient_card_separator, 4);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_nutrition_info, 5);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_product_card_tile_consolidated_legacy, 6);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_product_card_tile_grid_legacy, 7);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_product_card_tile_grid_skeleton_legacy, 8);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_product_card_tile_list_legacy, 9);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_product_card_tile_list_skeleton_legacy, 10);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_product_ingredient, 11);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_product_list_inset_banner_legacy, 12);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_product_list_options_child_filter_legacy, 13);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_product_list_options_display_mode_legacy, 14);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_product_list_options_filter_legacy, 15);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_product_list_options_header_legacy, 16);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_product_list_options_inset_banner_legacy, 17);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_product_list_options_marketplace_legacy, 18);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_product_list_options_sort_expand_legacy, 19);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_product_list_options_sort_legacy, 20);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_product_list_pagination_error_state, 21);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_product_list_pagination_loading_state, 22);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_product_list_section_header, 23);
        sparseIntArray.put(com.woolworths.R.layout.fragment_nutrition_bottom_sheet_legacy, 24);
        sparseIntArray.put(com.woolworths.R.layout.fragment_product_list_legacy, 25);
        sparseIntArray.put(com.woolworths.R.layout.fragment_product_list_options_filter_legacy, 26);
        sparseIntArray.put(com.woolworths.R.layout.fragment_product_main_filter_legacy, 27);
        sparseIntArray.put(com.woolworths.R.layout.include_circled_count_legacy, 28);
        sparseIntArray.put(com.woolworths.R.layout.include_product_list_header_legacy, 29);
        sparseIntArray.put(com.woolworths.R.layout.include_product_list_legacy_marketplace_details, 30);
        sparseIntArray.put(com.woolworths.R.layout.include_searchable_toolbar_wrapper_with_compose_legacy, 31);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(14);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.base.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.base.shopapp.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.checkbox.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.rewards.offers.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.foundation.rewards.offers.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.foundation.shop.bottomsheet.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.product.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shared.ui.views.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shop.addtolist.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shop.buyagain.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shop.cart.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shop.lists.DataBinderMapperImpl());
        arrayList.add(new com.airbnb.epoxy.databinding.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f5284a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            switch (i2) {
                case 1:
                    if (!"layout/activity_legacy_product_list_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for activity_legacy_product_list is invalid. Received: "));
                    }
                    Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 2, null, ActivityLegacyProductListBindingImpl.A);
                    ActivityLegacyProductListBindingImpl activityLegacyProductListBindingImpl = new ActivityLegacyProductListBindingImpl(dataBindingComponent, view, (FrameLayout) objArrT[1]);
                    activityLegacyProductListBindingImpl.z = -1L;
                    ((ConstraintLayout) objArrT[0]).setTag(null);
                    activityLegacyProductListBindingImpl.E(view);
                    activityLegacyProductListBindingImpl.r();
                    return activityLegacyProductListBindingImpl;
                case 2:
                    if (!"layout/activity_product_list_options_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for activity_product_list_options is invalid. Received: "));
                    }
                    Object[] objArrT2 = ViewDataBinding.t(dataBindingComponent, view, 3, null, ActivityProductListOptionsBindingImpl.B);
                    FrameLayout frameLayout = (FrameLayout) objArrT2[1];
                    ActivityProductListOptionsBindingImpl activityProductListOptionsBindingImpl = new ActivityProductListOptionsBindingImpl(dataBindingComponent, view, frameLayout);
                    activityProductListOptionsBindingImpl.A = -1L;
                    ((ConstraintLayout) objArrT2[0]).setTag(null);
                    activityProductListOptionsBindingImpl.y.setTag(null);
                    activityProductListOptionsBindingImpl.E(view);
                    activityProductListOptionsBindingImpl.r();
                    return activityProductListOptionsBindingImpl;
                case 3:
                    if ("layout/epoxy_item_filter_highlight_card_legacy_0".equals(tag)) {
                        return new EpoxyItemFilterHighlightCardLegacyBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_filter_highlight_card_legacy is invalid. Received: "));
                case 4:
                    if ("layout/epoxy_item_ingredient_card_separator_0".equals(tag)) {
                        return new EpoxyItemIngredientCardSeparatorBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_ingredient_card_separator is invalid. Received: "));
                case 5:
                    if ("layout/epoxy_item_nutrition_info_0".equals(tag)) {
                        return new EpoxyItemNutritionInfoBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_nutrition_info is invalid. Received: "));
                case 6:
                    if ("layout/epoxy_item_product_card_tile_consolidated_legacy_0".equals(tag)) {
                        return new EpoxyItemProductCardTileConsolidatedLegacyBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_product_card_tile_consolidated_legacy is invalid. Received: "));
                case 7:
                    if ("layout/epoxy_item_product_card_tile_grid_legacy_0".equals(tag)) {
                        return new EpoxyItemProductCardTileGridLegacyBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_product_card_tile_grid_legacy is invalid. Received: "));
                case 8:
                    if (!"layout/epoxy_item_product_card_tile_grid_skeleton_legacy_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_product_card_tile_grid_skeleton_legacy is invalid. Received: "));
                    }
                    Object[] objArrT3 = ViewDataBinding.t(dataBindingComponent, view, 5, null, EpoxyItemProductCardTileGridSkeletonLegacyBindingImpl.D);
                    EpoxyItemProductCardTileGridSkeletonLegacyBindingImpl epoxyItemProductCardTileGridSkeletonLegacyBindingImpl = new EpoxyItemProductCardTileGridSkeletonLegacyBindingImpl(dataBindingComponent, view, (View) objArrT3[1], (View) objArrT3[4], (View) objArrT3[3], (View) objArrT3[2]);
                    epoxyItemProductCardTileGridSkeletonLegacyBindingImpl.C = -1L;
                    ((ConstraintLayout) objArrT3[0]).setTag(null);
                    epoxyItemProductCardTileGridSkeletonLegacyBindingImpl.E(view);
                    epoxyItemProductCardTileGridSkeletonLegacyBindingImpl.r();
                    return epoxyItemProductCardTileGridSkeletonLegacyBindingImpl;
                case 9:
                    if ("layout/epoxy_item_product_card_tile_list_legacy_0".equals(tag)) {
                        return new EpoxyItemProductCardTileListLegacyBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_product_card_tile_list_legacy is invalid. Received: "));
                case 10:
                    if (!"layout/epoxy_item_product_card_tile_list_skeleton_legacy_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_product_card_tile_list_skeleton_legacy is invalid. Received: "));
                    }
                    Object[] objArrT4 = ViewDataBinding.t(dataBindingComponent, view, 5, null, EpoxyItemProductCardTileListSkeletonLegacyBindingImpl.D);
                    EpoxyItemProductCardTileListSkeletonLegacyBindingImpl epoxyItemProductCardTileListSkeletonLegacyBindingImpl = new EpoxyItemProductCardTileListSkeletonLegacyBindingImpl(dataBindingComponent, view, (View) objArrT4[1], (View) objArrT4[4], (View) objArrT4[3], (View) objArrT4[2]);
                    epoxyItemProductCardTileListSkeletonLegacyBindingImpl.C = -1L;
                    ((ConstraintLayout) objArrT4[0]).setTag(null);
                    epoxyItemProductCardTileListSkeletonLegacyBindingImpl.E(view);
                    epoxyItemProductCardTileListSkeletonLegacyBindingImpl.r();
                    return epoxyItemProductCardTileListSkeletonLegacyBindingImpl;
                case 11:
                    if (!"layout/epoxy_item_product_ingredient_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_product_ingredient is invalid. Received: "));
                    }
                    EpoxyItemProductIngredientBindingImpl epoxyItemProductIngredientBindingImpl = new EpoxyItemProductIngredientBindingImpl(dataBindingComponent, view, (TextView) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
                    epoxyItemProductIngredientBindingImpl.A = -1L;
                    epoxyItemProductIngredientBindingImpl.y.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, epoxyItemProductIngredientBindingImpl);
                    epoxyItemProductIngredientBindingImpl.r();
                    return epoxyItemProductIngredientBindingImpl;
                case 12:
                    if ("layout/epoxy_item_product_list_inset_banner_legacy_0".equals(tag)) {
                        return new EpoxyItemProductListInsetBannerLegacyBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_product_list_inset_banner_legacy is invalid. Received: "));
                case 13:
                    if ("layout/epoxy_item_product_list_options_child_filter_legacy_0".equals(tag)) {
                        return new EpoxyItemProductListOptionsChildFilterLegacyBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_product_list_options_child_filter_legacy is invalid. Received: "));
                case 14:
                    if ("layout/epoxy_item_product_list_options_display_mode_legacy_0".equals(tag)) {
                        return new EpoxyItemProductListOptionsDisplayModeLegacyBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_product_list_options_display_mode_legacy is invalid. Received: "));
                case 15:
                    if ("layout/epoxy_item_product_list_options_filter_legacy_0".equals(tag)) {
                        return new EpoxyItemProductListOptionsFilterLegacyBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_product_list_options_filter_legacy is invalid. Received: "));
                case 16:
                    if (!"layout/epoxy_item_product_list_options_header_legacy_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_product_list_options_header_legacy is invalid. Received: "));
                    }
                    EpoxyItemProductListOptionsHeaderLegacyBindingImpl epoxyItemProductListOptionsHeaderLegacyBindingImpl = new EpoxyItemProductListOptionsHeaderLegacyBindingImpl(dataBindingComponent, view, (TextView) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
                    epoxyItemProductListOptionsHeaderLegacyBindingImpl.A = -1L;
                    epoxyItemProductListOptionsHeaderLegacyBindingImpl.y.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, epoxyItemProductListOptionsHeaderLegacyBindingImpl);
                    epoxyItemProductListOptionsHeaderLegacyBindingImpl.r();
                    return epoxyItemProductListOptionsHeaderLegacyBindingImpl;
                case 17:
                    if ("layout/epoxy_item_product_list_options_inset_banner_legacy_0".equals(tag)) {
                        return new EpoxyItemProductListOptionsInsetBannerLegacyBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_product_list_options_inset_banner_legacy is invalid. Received: "));
                case 18:
                    if (!"layout/epoxy_item_product_list_options_marketplace_legacy_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_product_list_options_marketplace_legacy is invalid. Received: "));
                    }
                    Object[] objArrT5 = ViewDataBinding.t(dataBindingComponent, view, 7, EpoxyItemProductListOptionsMarketplaceLegacyBindingImpl.G, EpoxyItemProductListOptionsMarketplaceLegacyBindingImpl.H);
                    EpoxyItemProductListOptionsMarketplaceLegacyBindingImpl epoxyItemProductListOptionsMarketplaceLegacyBindingImpl = new EpoxyItemProductListOptionsMarketplaceLegacyBindingImpl(dataBindingComponent, view, (TextView) objArrT5[5], (IncludeHorizontalDividerBinding) objArrT5[4], (IncludeHorizontalDividerBinding) objArrT5[3], (ImageView) objArrT5[1], (SwitchMaterial) objArrT5[6], (TextView) objArrT5[2]);
                    epoxyItemProductListOptionsMarketplaceLegacyBindingImpl.F = -1L;
                    IncludeHorizontalDividerBinding includeHorizontalDividerBinding = epoxyItemProductListOptionsMarketplaceLegacyBindingImpl.z;
                    if (includeHorizontalDividerBinding != null) {
                        includeHorizontalDividerBinding.n = epoxyItemProductListOptionsMarketplaceLegacyBindingImpl;
                    }
                    IncludeHorizontalDividerBinding includeHorizontalDividerBinding2 = epoxyItemProductListOptionsMarketplaceLegacyBindingImpl.A;
                    if (includeHorizontalDividerBinding2 != null) {
                        includeHorizontalDividerBinding2.n = epoxyItemProductListOptionsMarketplaceLegacyBindingImpl;
                    }
                    epoxyItemProductListOptionsMarketplaceLegacyBindingImpl.B.setTag(null);
                    ((ConstraintLayout) objArrT5[0]).setTag(null);
                    epoxyItemProductListOptionsMarketplaceLegacyBindingImpl.D.setTag(null);
                    epoxyItemProductListOptionsMarketplaceLegacyBindingImpl.E(view);
                    epoxyItemProductListOptionsMarketplaceLegacyBindingImpl.r();
                    return epoxyItemProductListOptionsMarketplaceLegacyBindingImpl;
                case 19:
                    if ("layout/epoxy_item_product_list_options_sort_expand_legacy_0".equals(tag)) {
                        return new EpoxyItemProductListOptionsSortExpandLegacyBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_product_list_options_sort_expand_legacy is invalid. Received: "));
                case 20:
                    if ("layout/epoxy_item_product_list_options_sort_legacy_0".equals(tag)) {
                        return new EpoxyItemProductListOptionsSortLegacyBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_product_list_options_sort_legacy is invalid. Received: "));
                case 21:
                    if ("layout/epoxy_item_product_list_pagination_error_state_0".equals(tag)) {
                        return new EpoxyItemProductListPaginationErrorStateBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_product_list_pagination_error_state is invalid. Received: "));
                case 22:
                    if (!"layout/epoxy_item_product_list_pagination_loading_state_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_product_list_pagination_loading_state is invalid. Received: "));
                    }
                    Object[] objArrT6 = ViewDataBinding.t(dataBindingComponent, view, 1, null, null);
                    EpoxyItemProductListPaginationLoadingStateBindingImpl epoxyItemProductListPaginationLoadingStateBindingImpl = new EpoxyItemProductListPaginationLoadingStateBindingImpl(dataBindingComponent, view, 0);
                    epoxyItemProductListPaginationLoadingStateBindingImpl.y = -1L;
                    ((ConstraintLayout) objArrT6[0]).setTag(null);
                    epoxyItemProductListPaginationLoadingStateBindingImpl.E(view);
                    epoxyItemProductListPaginationLoadingStateBindingImpl.r();
                    return epoxyItemProductListPaginationLoadingStateBindingImpl;
                case 23:
                    if ("layout/epoxy_item_product_list_section_header_0".equals(tag)) {
                        return new EpoxyItemProductListSectionHeaderBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_product_list_section_header is invalid. Received: "));
                case 24:
                    if (!"layout/fragment_nutrition_bottom_sheet_legacy_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for fragment_nutrition_bottom_sheet_legacy is invalid. Received: "));
                    }
                    Object[] objArrT7 = ViewDataBinding.t(dataBindingComponent, view, 4, null, FragmentNutritionBottomSheetLegacyBindingImpl.D);
                    ConstraintLayout constraintLayout = (ConstraintLayout) objArrT7[0];
                    TextView textView = (TextView) objArrT7[2];
                    FragmentNutritionBottomSheetLegacyBindingImpl fragmentNutritionBottomSheetLegacyBindingImpl = new FragmentNutritionBottomSheetLegacyBindingImpl(dataBindingComponent, view, constraintLayout, textView, (TextView) objArrT7[1]);
                    fragmentNutritionBottomSheetLegacyBindingImpl.C = -1L;
                    fragmentNutritionBottomSheetLegacyBindingImpl.y.setTag(null);
                    fragmentNutritionBottomSheetLegacyBindingImpl.z.setTag(null);
                    fragmentNutritionBottomSheetLegacyBindingImpl.A.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, fragmentNutritionBottomSheetLegacyBindingImpl);
                    fragmentNutritionBottomSheetLegacyBindingImpl.r();
                    return fragmentNutritionBottomSheetLegacyBindingImpl;
                case 25:
                    if ("layout/fragment_product_list_legacy_0".equals(tag)) {
                        return new FragmentProductListLegacyBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for fragment_product_list_legacy is invalid. Received: "));
                case 26:
                    if ("layout/fragment_product_list_options_filter_legacy_0".equals(tag)) {
                        return new FragmentProductListOptionsFilterLegacyBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for fragment_product_list_options_filter_legacy is invalid. Received: "));
                case 27:
                    if ("layout/fragment_product_main_filter_legacy_0".equals(tag)) {
                        return new FragmentProductMainFilterLegacyBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for fragment_product_main_filter_legacy is invalid. Received: "));
                case 28:
                    if (!"layout/include_circled_count_legacy_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for include_circled_count_legacy is invalid. Received: "));
                    }
                    IncludeCircledCountLegacyBindingImpl includeCircledCountLegacyBindingImpl = new IncludeCircledCountLegacyBindingImpl(dataBindingComponent, view, (TextView) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
                    includeCircledCountLegacyBindingImpl.C = -1L;
                    includeCircledCountLegacyBindingImpl.y.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, includeCircledCountLegacyBindingImpl);
                    includeCircledCountLegacyBindingImpl.r();
                    return includeCircledCountLegacyBindingImpl;
                case 29:
                    if ("layout/include_product_list_header_legacy_0".equals(tag)) {
                        return new IncludeProductListHeaderLegacyBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for include_product_list_header_legacy is invalid. Received: "));
                case 30:
                    if ("layout/include_product_list_legacy_marketplace_details_0".equals(tag)) {
                        return new IncludeProductListLegacyMarketplaceDetailsBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for include_product_list_legacy_marketplace_details is invalid. Received: "));
                case 31:
                    if ("layout/include_searchable_toolbar_wrapper_with_compose_legacy_0".equals(tag)) {
                        return new IncludeSearchableToolbarWrapperWithComposeLegacyBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for include_searchable_toolbar_wrapper_with_compose_legacy is invalid. Received: "));
            }
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f5284a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f5285a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
