package au.com.woolworths.feature.product.list;

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
import au.com.woolworths.feature.product.list.databinding.ActivityProductListBindingImpl;
import au.com.woolworths.feature.product.list.databinding.ActivityProductListOptionsBindingImpl;
import au.com.woolworths.feature.product.list.databinding.EpoxyItemFilterHighlightCardBindingImpl;
import au.com.woolworths.feature.product.list.databinding.EpoxyItemProductCardTileGridSkeletonBindingImpl;
import au.com.woolworths.feature.product.list.databinding.EpoxyItemProductCardTileListSkeletonBindingImpl;
import au.com.woolworths.feature.product.list.databinding.EpoxyItemProductListInsetBannerBindingImpl;
import au.com.woolworths.feature.product.list.databinding.EpoxyItemProductListOptionsChildFilterBindingImpl;
import au.com.woolworths.feature.product.list.databinding.EpoxyItemProductListOptionsDisplayModeBindingImpl;
import au.com.woolworths.feature.product.list.databinding.EpoxyItemProductListOptionsFilterBindingImpl;
import au.com.woolworths.feature.product.list.databinding.EpoxyItemProductListOptionsHeaderBindingImpl;
import au.com.woolworths.feature.product.list.databinding.EpoxyItemProductListOptionsInsetBannerBindingImpl;
import au.com.woolworths.feature.product.list.databinding.EpoxyItemProductListOptionsMarketplaceBindingImpl;
import au.com.woolworths.feature.product.list.databinding.EpoxyItemProductListOptionsSortBindingImpl;
import au.com.woolworths.feature.product.list.databinding.EpoxyItemProductListOptionsSortExpandBindingImpl;
import au.com.woolworths.feature.product.list.databinding.FragmentNutritionBottomSheetBindingImpl;
import au.com.woolworths.feature.product.list.databinding.FragmentProductListBindingImpl;
import au.com.woolworths.feature.product.list.databinding.FragmentProductListOptionsFilterBindingImpl;
import au.com.woolworths.feature.product.list.databinding.FragmentProductMainFilterBindingImpl;
import au.com.woolworths.feature.product.list.databinding.IncludeCircledCountBindingImpl;
import au.com.woolworths.feature.product.list.databinding.IncludeProductListHeaderBindingImpl;
import au.com.woolworths.feature.product.list.databinding.IncludeProductListMarketplaceDetailsBindingImpl;
import au.com.woolworths.feature.product.list.databinding.IncludeSearchableToolbarWrapperWithComposeBindingImpl;
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
    public static final SparseIntArray f5210a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = au.com.woolworths.android.onesite.a.b(186, 0, 1, "_all", "actionState");
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
            sparseArrayB.put(142, "productCardConfig");
            sparseArrayB.put(143, "productConfig");
            sparseArrayB.put(144, "productData");
            sparseArrayB.put(145, "quantity");
            sparseArrayB.put(146, "queryTextFocusChangeListener");
            sparseArrayB.put(147, "rewardsPointsBalance");
            sparseArrayB.put(148, "rewardsPointsBalanceData");
            sparseArrayB.put(149, "rewardsRegistered");
            sparseArrayB.put(150, "rewardsRegisteredRedeemable");
            sparseArrayB.put(151, "rewardsUnregistered");
            sparseArrayB.put(152, "searchQueryHint");
            sparseArrayB.put(153, "section");
            sparseArrayB.put(154, "sectionHeader");
            sparseArrayB.put(ModuleDescriptor.MODULE_VERSION, "sectionTitle");
            sparseArrayB.put(156, "seller");
            sparseArrayB.put(157, "sellerName");
            sparseArrayB.put(158, "shoppingList");
            sparseArrayB.put(159, "shouldHideToolbar");
            sparseArrayB.put(160, "shouldShowLoadingState");
            sparseArrayB.put(161, "shouldShowNewBadge");
            sparseArrayB.put(162, "shouldShowNotificationDot");
            sparseArrayB.put(163, "shouldShowWebArrow");
            sparseArrayB.put(164, "showAddToListButton");
            sparseArrayB.put(165, "showBoostAnimation");
            sparseArrayB.put(166, "showCheckedItems");
            sparseArrayB.put(167, "showDisabledState");
            sparseArrayB.put(168, "showLoadingView");
            sparseArrayB.put(169, "showNewDismissIcon");
            sparseArrayB.put(170, "showTigerDisplayExpiry");
            sparseArrayB.put(171, "showTigerOffersLabel");
            sparseArrayB.put(172, "singleLine");
            sparseArrayB.put(173, "sortByViewListener");
            sparseArrayB.put(174, "sortOption");
            sparseArrayB.put(175, "sortOptionClickListener");
            sparseArrayB.put(176, "state");
            sparseArrayB.put(177, "store");
            sparseArrayB.put(178, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(179, "title");
            sparseArrayB.put(SubsamplingScaleImageView.ORIENTATION_180, "topMarginRes");
            sparseArrayB.put(181, "viewListener");
            sparseArrayB.put(182, "viewModel");
            sparseArrayB.put(183, "viewState");
            sparseArrayB.put(184, "vocViewModel");
            sparseArrayB.put(185, "windowSubheader");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f5211a;

        static {
            HashMap map = new HashMap(22);
            f5211a = map;
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_product_list, map, "layout/activity_product_list_0", com.woolworths.R.layout.activity_product_list_options, "layout/activity_product_list_options_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_filter_highlight_card, map, "layout/epoxy_item_filter_highlight_card_0", com.woolworths.R.layout.epoxy_item_product_card_tile_grid_skeleton, "layout/epoxy_item_product_card_tile_grid_skeleton_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_product_card_tile_list_skeleton, map, "layout/epoxy_item_product_card_tile_list_skeleton_0", com.woolworths.R.layout.epoxy_item_product_list_inset_banner, "layout/epoxy_item_product_list_inset_banner_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_product_list_options_child_filter, map, "layout/epoxy_item_product_list_options_child_filter_0", com.woolworths.R.layout.epoxy_item_product_list_options_display_mode, "layout/epoxy_item_product_list_options_display_mode_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_product_list_options_filter, map, "layout/epoxy_item_product_list_options_filter_0", com.woolworths.R.layout.epoxy_item_product_list_options_header, "layout/epoxy_item_product_list_options_header_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_product_list_options_inset_banner, map, "layout/epoxy_item_product_list_options_inset_banner_0", com.woolworths.R.layout.epoxy_item_product_list_options_marketplace, "layout/epoxy_item_product_list_options_marketplace_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_product_list_options_sort, map, "layout/epoxy_item_product_list_options_sort_0", com.woolworths.R.layout.epoxy_item_product_list_options_sort_expand, "layout/epoxy_item_product_list_options_sort_expand_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.fragment_nutrition_bottom_sheet, map, "layout/fragment_nutrition_bottom_sheet_0", com.woolworths.R.layout.fragment_product_list, "layout/fragment_product_list_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.fragment_product_list_options_filter, map, "layout/fragment_product_list_options_filter_0", com.woolworths.R.layout.fragment_product_main_filter, "layout/fragment_product_main_filter_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.include_circled_count, map, "layout/include_circled_count_0", com.woolworths.R.layout.include_product_list_header, "layout/include_product_list_header_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.include_product_list_marketplace_details, map, "layout/include_product_list_marketplace_details_0", com.woolworths.R.layout.include_searchable_toolbar_wrapper_with_compose, "layout/include_searchable_toolbar_wrapper_with_compose_0");
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(22);
        f5210a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.activity_product_list, 1);
        sparseIntArray.put(com.woolworths.R.layout.activity_product_list_options, 2);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_filter_highlight_card, 3);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_product_card_tile_grid_skeleton, 4);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_product_card_tile_list_skeleton, 5);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_product_list_inset_banner, 6);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_product_list_options_child_filter, 7);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_product_list_options_display_mode, 8);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_product_list_options_filter, 9);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_product_list_options_header, 10);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_product_list_options_inset_banner, 11);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_product_list_options_marketplace, 12);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_product_list_options_sort, 13);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_product_list_options_sort_expand, 14);
        sparseIntArray.put(com.woolworths.R.layout.fragment_nutrition_bottom_sheet, 15);
        sparseIntArray.put(com.woolworths.R.layout.fragment_product_list, 16);
        sparseIntArray.put(com.woolworths.R.layout.fragment_product_list_options_filter, 17);
        sparseIntArray.put(com.woolworths.R.layout.fragment_product_main_filter, 18);
        sparseIntArray.put(com.woolworths.R.layout.include_circled_count, 19);
        sparseIntArray.put(com.woolworths.R.layout.include_product_list_header, 20);
        sparseIntArray.put(com.woolworths.R.layout.include_product_list_marketplace_details, 21);
        sparseIntArray.put(com.woolworths.R.layout.include_searchable_toolbar_wrapper_with_compose, 22);
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
        int i2 = f5210a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            switch (i2) {
                case 1:
                    if (!"layout/activity_product_list_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for activity_product_list is invalid. Received: "));
                    }
                    Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 2, null, ActivityProductListBindingImpl.A);
                    ActivityProductListBindingImpl activityProductListBindingImpl = new ActivityProductListBindingImpl(dataBindingComponent, view, (FrameLayout) objArrT[1]);
                    activityProductListBindingImpl.z = -1L;
                    ((ConstraintLayout) objArrT[0]).setTag(null);
                    activityProductListBindingImpl.E(view);
                    activityProductListBindingImpl.r();
                    return activityProductListBindingImpl;
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
                    if ("layout/epoxy_item_filter_highlight_card_0".equals(tag)) {
                        return new EpoxyItemFilterHighlightCardBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_filter_highlight_card is invalid. Received: "));
                case 4:
                    if (!"layout/epoxy_item_product_card_tile_grid_skeleton_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_product_card_tile_grid_skeleton is invalid. Received: "));
                    }
                    Object[] objArrT3 = ViewDataBinding.t(dataBindingComponent, view, 5, null, EpoxyItemProductCardTileGridSkeletonBindingImpl.D);
                    EpoxyItemProductCardTileGridSkeletonBindingImpl epoxyItemProductCardTileGridSkeletonBindingImpl = new EpoxyItemProductCardTileGridSkeletonBindingImpl(dataBindingComponent, view, (View) objArrT3[1], (View) objArrT3[4], (View) objArrT3[3], (View) objArrT3[2]);
                    epoxyItemProductCardTileGridSkeletonBindingImpl.C = -1L;
                    ((ConstraintLayout) objArrT3[0]).setTag(null);
                    epoxyItemProductCardTileGridSkeletonBindingImpl.E(view);
                    epoxyItemProductCardTileGridSkeletonBindingImpl.r();
                    return epoxyItemProductCardTileGridSkeletonBindingImpl;
                case 5:
                    if (!"layout/epoxy_item_product_card_tile_list_skeleton_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_product_card_tile_list_skeleton is invalid. Received: "));
                    }
                    Object[] objArrT4 = ViewDataBinding.t(dataBindingComponent, view, 5, null, EpoxyItemProductCardTileListSkeletonBindingImpl.D);
                    EpoxyItemProductCardTileListSkeletonBindingImpl epoxyItemProductCardTileListSkeletonBindingImpl = new EpoxyItemProductCardTileListSkeletonBindingImpl(dataBindingComponent, view, (View) objArrT4[1], (View) objArrT4[4], (View) objArrT4[3], (View) objArrT4[2]);
                    epoxyItemProductCardTileListSkeletonBindingImpl.C = -1L;
                    ((ConstraintLayout) objArrT4[0]).setTag(null);
                    epoxyItemProductCardTileListSkeletonBindingImpl.E(view);
                    epoxyItemProductCardTileListSkeletonBindingImpl.r();
                    return epoxyItemProductCardTileListSkeletonBindingImpl;
                case 6:
                    if ("layout/epoxy_item_product_list_inset_banner_0".equals(tag)) {
                        return new EpoxyItemProductListInsetBannerBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_product_list_inset_banner is invalid. Received: "));
                case 7:
                    if ("layout/epoxy_item_product_list_options_child_filter_0".equals(tag)) {
                        return new EpoxyItemProductListOptionsChildFilterBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_product_list_options_child_filter is invalid. Received: "));
                case 8:
                    if ("layout/epoxy_item_product_list_options_display_mode_0".equals(tag)) {
                        return new EpoxyItemProductListOptionsDisplayModeBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_product_list_options_display_mode is invalid. Received: "));
                case 9:
                    if ("layout/epoxy_item_product_list_options_filter_0".equals(tag)) {
                        return new EpoxyItemProductListOptionsFilterBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_product_list_options_filter is invalid. Received: "));
                case 10:
                    if (!"layout/epoxy_item_product_list_options_header_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_product_list_options_header is invalid. Received: "));
                    }
                    EpoxyItemProductListOptionsHeaderBindingImpl epoxyItemProductListOptionsHeaderBindingImpl = new EpoxyItemProductListOptionsHeaderBindingImpl(dataBindingComponent, view, (TextView) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
                    epoxyItemProductListOptionsHeaderBindingImpl.A = -1L;
                    epoxyItemProductListOptionsHeaderBindingImpl.y.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, epoxyItemProductListOptionsHeaderBindingImpl);
                    epoxyItemProductListOptionsHeaderBindingImpl.r();
                    return epoxyItemProductListOptionsHeaderBindingImpl;
                case 11:
                    if ("layout/epoxy_item_product_list_options_inset_banner_0".equals(tag)) {
                        return new EpoxyItemProductListOptionsInsetBannerBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_product_list_options_inset_banner is invalid. Received: "));
                case 12:
                    if (!"layout/epoxy_item_product_list_options_marketplace_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_product_list_options_marketplace is invalid. Received: "));
                    }
                    Object[] objArrT5 = ViewDataBinding.t(dataBindingComponent, view, 7, EpoxyItemProductListOptionsMarketplaceBindingImpl.G, EpoxyItemProductListOptionsMarketplaceBindingImpl.H);
                    EpoxyItemProductListOptionsMarketplaceBindingImpl epoxyItemProductListOptionsMarketplaceBindingImpl = new EpoxyItemProductListOptionsMarketplaceBindingImpl(dataBindingComponent, view, (TextView) objArrT5[5], (IncludeHorizontalDividerBinding) objArrT5[4], (IncludeHorizontalDividerBinding) objArrT5[3], (ImageView) objArrT5[1], (SwitchMaterial) objArrT5[6], (TextView) objArrT5[2]);
                    epoxyItemProductListOptionsMarketplaceBindingImpl.F = -1L;
                    IncludeHorizontalDividerBinding includeHorizontalDividerBinding = epoxyItemProductListOptionsMarketplaceBindingImpl.z;
                    if (includeHorizontalDividerBinding != null) {
                        includeHorizontalDividerBinding.n = epoxyItemProductListOptionsMarketplaceBindingImpl;
                    }
                    IncludeHorizontalDividerBinding includeHorizontalDividerBinding2 = epoxyItemProductListOptionsMarketplaceBindingImpl.A;
                    if (includeHorizontalDividerBinding2 != null) {
                        includeHorizontalDividerBinding2.n = epoxyItemProductListOptionsMarketplaceBindingImpl;
                    }
                    epoxyItemProductListOptionsMarketplaceBindingImpl.B.setTag(null);
                    ((ConstraintLayout) objArrT5[0]).setTag(null);
                    epoxyItemProductListOptionsMarketplaceBindingImpl.D.setTag(null);
                    epoxyItemProductListOptionsMarketplaceBindingImpl.E(view);
                    epoxyItemProductListOptionsMarketplaceBindingImpl.r();
                    return epoxyItemProductListOptionsMarketplaceBindingImpl;
                case 13:
                    if ("layout/epoxy_item_product_list_options_sort_0".equals(tag)) {
                        return new EpoxyItemProductListOptionsSortBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_product_list_options_sort is invalid. Received: "));
                case 14:
                    if ("layout/epoxy_item_product_list_options_sort_expand_0".equals(tag)) {
                        return new EpoxyItemProductListOptionsSortExpandBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_product_list_options_sort_expand is invalid. Received: "));
                case 15:
                    if (!"layout/fragment_nutrition_bottom_sheet_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for fragment_nutrition_bottom_sheet is invalid. Received: "));
                    }
                    Object[] objArrT6 = ViewDataBinding.t(dataBindingComponent, view, 4, null, FragmentNutritionBottomSheetBindingImpl.D);
                    ConstraintLayout constraintLayout = (ConstraintLayout) objArrT6[0];
                    TextView textView = (TextView) objArrT6[2];
                    FragmentNutritionBottomSheetBindingImpl fragmentNutritionBottomSheetBindingImpl = new FragmentNutritionBottomSheetBindingImpl(dataBindingComponent, view, constraintLayout, textView, (TextView) objArrT6[1]);
                    fragmentNutritionBottomSheetBindingImpl.C = -1L;
                    fragmentNutritionBottomSheetBindingImpl.y.setTag(null);
                    fragmentNutritionBottomSheetBindingImpl.z.setTag(null);
                    fragmentNutritionBottomSheetBindingImpl.A.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, fragmentNutritionBottomSheetBindingImpl);
                    fragmentNutritionBottomSheetBindingImpl.r();
                    return fragmentNutritionBottomSheetBindingImpl;
                case 16:
                    if ("layout/fragment_product_list_0".equals(tag)) {
                        return new FragmentProductListBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for fragment_product_list is invalid. Received: "));
                case 17:
                    if ("layout/fragment_product_list_options_filter_0".equals(tag)) {
                        return new FragmentProductListOptionsFilterBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for fragment_product_list_options_filter is invalid. Received: "));
                case 18:
                    if ("layout/fragment_product_main_filter_0".equals(tag)) {
                        return new FragmentProductMainFilterBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for fragment_product_main_filter is invalid. Received: "));
                case 19:
                    if (!"layout/include_circled_count_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for include_circled_count is invalid. Received: "));
                    }
                    IncludeCircledCountBindingImpl includeCircledCountBindingImpl = new IncludeCircledCountBindingImpl(dataBindingComponent, view, (TextView) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
                    includeCircledCountBindingImpl.C = -1L;
                    includeCircledCountBindingImpl.y.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, includeCircledCountBindingImpl);
                    includeCircledCountBindingImpl.r();
                    return includeCircledCountBindingImpl;
                case 20:
                    if ("layout/include_product_list_header_0".equals(tag)) {
                        return new IncludeProductListHeaderBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for include_product_list_header is invalid. Received: "));
                case 21:
                    if ("layout/include_product_list_marketplace_details_0".equals(tag)) {
                        return new IncludeProductListMarketplaceDetailsBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for include_product_list_marketplace_details is invalid. Received: "));
                case 22:
                    if ("layout/include_searchable_toolbar_wrapper_with_compose_0".equals(tag)) {
                        return new IncludeSearchableToolbarWrapperWithComposeBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for include_searchable_toolbar_wrapper_with_compose is invalid. Received: "));
            }
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f5210a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f5211a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
