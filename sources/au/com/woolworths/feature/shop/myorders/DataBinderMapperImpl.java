package au.com.woolworths.feature.shop.myorders;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.impl.b;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeHorizontalDividerBinding;
import au.com.woolworths.feature.shop.myorders.databinding.ActivityEditDriverInstructionBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.ActivityEditOrderConditionsBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.ActivityOrderCancelPromptBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.ActivityOrderDetailsBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.ActivityOrdersBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.ActivityParkingGuideBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.ActivityProgressStepperInfoBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemCurrentDeliveryOrderOverviewBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemCurrentPickupOrderOverviewBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemDeliveryInstructionsBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemDividerDeprecatedBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemEditOrderWarningAcceptTermCheckboxBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemEditOrderWarningBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemEditOrderWarningImageBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemEditOrderWarningTitleBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemHorizontalSelectorBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemOrderCardTileListSkeletonBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemOrderCollectionDetailsBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemOrderCompactCardTileListSkeletonBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemOrderDetailsButtonBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemOrderDetailsFooterMessageBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemOrderDetailsHorizontalDividerBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemOrderDetailsItemBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemOrderDetailsProductBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemOrderDetailsRefundHorizontalDividerBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemOrderHorizontalListTileHeaderBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemOrderNumberDetailsBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemOrderOverviewBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemOrderProductListFeedItemBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemOrderStoreDetailsBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemOrderYourGroceriesCategoryCardGroupBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemOrderYourGroceriesFilterChipBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemOrderYourGroceriesFilterGroupBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemOrderYourGroceriesSectionDividerBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemOrderYourGroceriesSubstitutionCardBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemOrdersCompactBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemOrdersDeliveryBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemOrdersPaginationTryAgainBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemOrdersPickUpBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemOrdersProgressBarBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemOrdersSeeAllLinkBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemParkingMapBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemParkingStepBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemParkingStepTitleBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemPaymentItemBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemPaymentSummaryDividerBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemPrimingImageBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemPrimingRationaleBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemProgressStepperInfoDescriptionBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemProgressStepperInfoStepBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemSectionTitleBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemSubtotalTitleBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemYourGroceriesCategoryTitleBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemYourGroceriesCountTileBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemYourGroceriesFullfilmentStatusTitleBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemYourGroceriesHorizontalDividerBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemYourGroceriesLoadingTileBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemYourGroceriesSkeletonHeaderTileBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemYourGroceriesSkeletonInfoTileBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.FragmentBayNumberSelectorBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.FragmentOrdersListBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.FragmentPickupEtaSelectorBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.IncludeOrderDeliveredAnimationViewBinding;
import au.com.woolworths.feature.shop.myorders.databinding.IncludeOrderDeliveredAnimationViewBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.IncludePriceBreakdownBottomSheetBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.LayoutOrderProgressBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.MenuItemHelpBindingImpl;
import au.com.woolworths.feature.shop.myorders.databinding.PrimingDialogBindingImpl;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.tabs.TabLayout;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f7634a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = a.b(122, 0, 1, "_all", "actionState");
            sparseArrayB.put(2, "amountColorRes");
            sparseArrayB.put(3, "asset");
            sparseArrayB.put(4, "backgroundColor");
            sparseArrayB.put(5, "banner");
            sparseArrayB.put(6, "bannerAsset");
            sparseArrayB.put(7, "bannerIcon");
            sparseArrayB.put(8, "bannerState");
            sparseArrayB.put(9, "body");
            sparseArrayB.put(10, "boostAnimationVisibility");
            sparseArrayB.put(11, "boostViewListener");
            sparseArrayB.put(12, "brandLabel");
            sparseArrayB.put(13, "buttonText");
            sparseArrayB.put(14, "buttonTint");
            sparseArrayB.put(15, "canShowWatchlist");
            sparseArrayB.put(16, "checkboxText");
            sparseArrayB.put(17, "clickHandler");
            sparseArrayB.put(18, "clickHandlers");
            sparseArrayB.put(19, "clickListener");
            sparseArrayB.put(20, "coachMark");
            sparseArrayB.put(21, "containerTitle");
            sparseArrayB.put(22, "countLabel");
            sparseArrayB.put(23, "cta");
            sparseArrayB.put(24, "ctaText");
            sparseArrayB.put(25, "data");
            sparseArrayB.put(26, lqlqqlq.mmm006Dm006Dm);
            sparseArrayB.put(27, "displayExpiryExtended");
            sparseArrayB.put(28, "emptyState");
            sparseArrayB.put(29, "enableBoostAnimationContainerGap");
            sparseArrayB.put(30, "enabled");
            sparseArrayB.put(31, "errorState");
            sparseArrayB.put(32, "errorsHandler");
            sparseArrayB.put(33, "filter");
            sparseArrayB.put(34, "footer");
            sparseArrayB.put(35, "groupTitle");
            sparseArrayB.put(36, "handler");
            sparseArrayB.put(37, "header");
            sparseArrayB.put(38, "heightRes");
            sparseArrayB.put(39, "hostScreen");
            sparseArrayB.put(40, "htmlListener");
            sparseArrayB.put(41, "iconResId");
            sparseArrayB.put(42, "imageLoaderListener");
            sparseArrayB.put(43, "imageUrl");
            sparseArrayB.put(44, "importantForAccessibility");
            sparseArrayB.put(45, "index");
            sparseArrayB.put(46, "info");
            sparseArrayB.put(47, "infoIconClickHandler");
            sparseArrayB.put(48, "infoSectionItem");
            sparseArrayB.put(49, "inlineMessage");
            sparseArrayB.put(50, "isAccountNotificationBadgeShown");
            sparseArrayB.put(51, "isChecked");
            sparseArrayB.put(52, "isCtaInProgress");
            sparseArrayB.put(53, "isEnabled");
            sparseArrayB.put(54, "isLowerPriceYellow");
            sparseArrayB.put(55, "isMarketplace");
            sparseArrayB.put(56, "isPopup");
            sparseArrayB.put(57, "isRewardStyle");
            sparseArrayB.put(58, "isSelected");
            sparseArrayB.put(59, "isUnlocking");
            sparseArrayB.put(60, "isWatchlisted");
            sparseArrayB.put(61, "item");
            sparseArrayB.put(62, "itemWidthRes");
            sparseArrayB.put(63, AnnotatedPrivateKey.LABEL);
            sparseArrayB.put(64, "labelStyle");
            sparseArrayB.put(65, "linkHandler");
            sparseArrayB.put(66, "listViewModel");
            sparseArrayB.put(67, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            sparseArrayB.put(68, "loadingMessage");
            sparseArrayB.put(69, "lottieAutoPlay");
            sparseArrayB.put(70, "lottieBackgroundColor");
            sparseArrayB.put(71, "lottieLoop");
            sparseArrayB.put(72, "margins");
            sparseArrayB.put(73, "markdownContent");
            sparseArrayB.put(74, "memberPriceInfo");
            sparseArrayB.put(75, "message");
            sparseArrayB.put(76, "offerViewItem");
            sparseArrayB.put(77, "onBannerClick");
            sparseArrayB.put(78, "onClick");
            sparseArrayB.put(79, "onPointsBalanceClick");
            sparseArrayB.put(80, "onQueryTextChangeListener");
            sparseArrayB.put(81, "onQueryTextFocusChangeListener");
            sparseArrayB.put(82, "onQueryTextSubmitListener");
            sparseArrayB.put(83, "optionText");
            sparseArrayB.put(84, "order");
            sparseArrayB.put(85, "orderId");
            sparseArrayB.put(86, "orderOverview");
            sparseArrayB.put(87, "paddingBottom");
            sparseArrayB.put(88, "pickUpInstructionsClickHandler");
            sparseArrayB.put(89, "product");
            sparseArrayB.put(90, "productCard");
            sparseArrayB.put(91, "productCardConfig");
            sparseArrayB.put(92, "productConfig");
            sparseArrayB.put(93, "productData");
            sparseArrayB.put(94, "progressStepper");
            sparseArrayB.put(95, "rewardsPointsBalance");
            sparseArrayB.put(96, "rewardsPointsBalanceData");
            sparseArrayB.put(97, "searchQueryHint");
            sparseArrayB.put(98, "section");
            sparseArrayB.put(99, "sectionTitle");
            sparseArrayB.put(100, "seller");
            sparseArrayB.put(101, "showAddToListButton");
            sparseArrayB.put(102, "showBoostAnimation");
            sparseArrayB.put(103, "showNewDismissIcon");
            sparseArrayB.put(104, "showPickOrderCollectedState");
            sparseArrayB.put(105, "showSkeleton");
            sparseArrayB.put(106, "showTigerDisplayExpiry");
            sparseArrayB.put(107, "showTigerOffersLabel");
            sparseArrayB.put(108, "singleLine");
            sparseArrayB.put(109, "state");
            sparseArrayB.put(110, "stepContent");
            sparseArrayB.put(111, "stepIndex");
            sparseArrayB.put(112, "stepInfoData");
            sparseArrayB.put(113, "stepsToolTip");
            sparseArrayB.put(114, "swipeRefresh");
            sparseArrayB.put(115, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(116, "textColorAttr");
            sparseArrayB.put(117, "title");
            sparseArrayB.put(118, "typefaceRes");
            sparseArrayB.put(119, "value");
            sparseArrayB.put(120, "viewListener");
            sparseArrayB.put(121, "viewModel");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f7635a;

        static {
            HashMap map = new HashMap(67);
            f7635a = map;
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_edit_driver_instruction, map, "layout/activity_edit_driver_instruction_0", com.woolworths.R.layout.activity_edit_order_conditions, "layout/activity_edit_order_conditions_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_order_cancel_prompt, map, "layout/activity_order_cancel_prompt_0", com.woolworths.R.layout.activity_order_details, "layout/activity_order_details_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_orders, map, "layout/activity_orders_0", com.woolworths.R.layout.activity_parking_guide, "layout/activity_parking_guide_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_progress_stepper_info, map, "layout/activity_progress_stepper_info_0", com.woolworths.R.layout.epoxy_item_current_delivery_order_overview, "layout/epoxy_item_current_delivery_order_overview_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_current_pickup_order_overview, map, "layout/epoxy_item_current_pickup_order_overview_0", com.woolworths.R.layout.epoxy_item_delivery_instructions, "layout/epoxy_item_delivery_instructions_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_divider_deprecated, map, "layout/epoxy_item_divider_deprecated_0", com.woolworths.R.layout.epoxy_item_edit_order_warning, "layout/epoxy_item_edit_order_warning_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_edit_order_warning_accept_term_checkbox, map, "layout/epoxy_item_edit_order_warning_accept_term_checkbox_0", com.woolworths.R.layout.epoxy_item_edit_order_warning_image, "layout/epoxy_item_edit_order_warning_image_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_edit_order_warning_title, map, "layout/epoxy_item_edit_order_warning_title_0", com.woolworths.R.layout.epoxy_item_horizontal_selector, "layout/epoxy_item_horizontal_selector_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_order_card_tile_list_skeleton, map, "layout/epoxy_item_order_card_tile_list_skeleton_0", com.woolworths.R.layout.epoxy_item_order_collection_details, "layout/epoxy_item_order_collection_details_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_order_compact_card_tile_list_skeleton, map, "layout/epoxy_item_order_compact_card_tile_list_skeleton_0", com.woolworths.R.layout.epoxy_item_order_details_button, "layout/epoxy_item_order_details_button_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_order_details_footer_message, map, "layout/epoxy_item_order_details_footer_message_0", com.woolworths.R.layout.epoxy_item_order_details_horizontal_divider, "layout/epoxy_item_order_details_horizontal_divider_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_order_details_item, map, "layout/epoxy_item_order_details_item_0", com.woolworths.R.layout.epoxy_item_order_details_product, "layout/epoxy_item_order_details_product_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_order_details_refund_horizontal_divider, map, "layout/epoxy_item_order_details_refund_horizontal_divider_0", com.woolworths.R.layout.epoxy_item_order_horizontal_list_tile_header, "layout/epoxy_item_order_horizontal_list_tile_header_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_order_number_details, map, "layout/epoxy_item_order_number_details_0", com.woolworths.R.layout.epoxy_item_order_overview, "layout/epoxy_item_order_overview_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_order_product_list_feed_item, map, "layout/epoxy_item_order_product_list_feed_item_0", com.woolworths.R.layout.epoxy_item_order_store_details, "layout/epoxy_item_order_store_details_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_order_your_groceries_category_card_group, map, "layout/epoxy_item_order_your_groceries_category_card_group_0", com.woolworths.R.layout.epoxy_item_order_your_groceries_filter_chip, "layout/epoxy_item_order_your_groceries_filter_chip_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_order_your_groceries_filter_group, map, "layout/epoxy_item_order_your_groceries_filter_group_0", com.woolworths.R.layout.epoxy_item_order_your_groceries_section_divider, "layout/epoxy_item_order_your_groceries_section_divider_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_order_your_groceries_substitution_card, map, "layout/epoxy_item_order_your_groceries_substitution_card_0", com.woolworths.R.layout.epoxy_item_orders_compact, "layout/epoxy_item_orders_compact_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_orders_delivery, map, "layout/epoxy_item_orders_delivery_0", com.woolworths.R.layout.epoxy_item_orders_pagination_try_again, "layout/epoxy_item_orders_pagination_try_again_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_orders_pick_up, map, "layout/epoxy_item_orders_pick_up_0", com.woolworths.R.layout.epoxy_item_orders_progress_bar, "layout/epoxy_item_orders_progress_bar_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_orders_see_all_link, map, "layout/epoxy_item_orders_see_all_link_0", com.woolworths.R.layout.epoxy_item_parking_map, "layout/epoxy_item_parking_map_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_parking_step, map, "layout/epoxy_item_parking_step_0", com.woolworths.R.layout.epoxy_item_parking_step_title, "layout/epoxy_item_parking_step_title_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_payment_item, map, "layout/epoxy_item_payment_item_0", com.woolworths.R.layout.epoxy_item_payment_summary_divider, "layout/epoxy_item_payment_summary_divider_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_priming_image, map, "layout/epoxy_item_priming_image_0", com.woolworths.R.layout.epoxy_item_priming_rationale, "layout/epoxy_item_priming_rationale_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_progress_stepper_info_description, map, "layout/epoxy_item_progress_stepper_info_description_0", com.woolworths.R.layout.epoxy_item_progress_stepper_info_step, "layout/epoxy_item_progress_stepper_info_step_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_section_title, map, "layout/epoxy_item_section_title_0", com.woolworths.R.layout.epoxy_item_subtotal_title, "layout/epoxy_item_subtotal_title_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_your_groceries_category_title, map, "layout/epoxy_item_your_groceries_category_title_0", com.woolworths.R.layout.epoxy_item_your_groceries_count_tile, "layout/epoxy_item_your_groceries_count_tile_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_your_groceries_fullfilment_status_title, map, "layout/epoxy_item_your_groceries_fullfilment_status_title_0", com.woolworths.R.layout.epoxy_item_your_groceries_horizontal_divider, "layout/epoxy_item_your_groceries_horizontal_divider_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_your_groceries_loading_tile, map, "layout/epoxy_item_your_groceries_loading_tile_0", com.woolworths.R.layout.epoxy_item_your_groceries_skeleton_header_tile, "layout/epoxy_item_your_groceries_skeleton_header_tile_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_your_groceries_skeleton_info_tile, map, "layout/epoxy_item_your_groceries_skeleton_info_tile_0", com.woolworths.R.layout.fragment_bay_number_selector, "layout/fragment_bay_number_selector_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.fragment_orders_list, map, "layout/fragment_orders_list_0", com.woolworths.R.layout.fragment_pickup_eta_selector, "layout/fragment_pickup_eta_selector_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.include_order_delivered_animation_view, map, "layout/include_order_delivered_animation_view_0", com.woolworths.R.layout.include_price_breakdown_bottom_sheet, "layout/include_price_breakdown_bottom_sheet_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.layout_order_progress, map, "layout/layout_order_progress_0", com.woolworths.R.layout.menu_item_help, "layout/menu_item_help_0");
            map.put("layout/priming_dialog_0", Integer.valueOf(com.woolworths.R.layout.priming_dialog));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(67);
        f7634a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.activity_edit_driver_instruction, 1);
        sparseIntArray.put(com.woolworths.R.layout.activity_edit_order_conditions, 2);
        sparseIntArray.put(com.woolworths.R.layout.activity_order_cancel_prompt, 3);
        sparseIntArray.put(com.woolworths.R.layout.activity_order_details, 4);
        sparseIntArray.put(com.woolworths.R.layout.activity_orders, 5);
        sparseIntArray.put(com.woolworths.R.layout.activity_parking_guide, 6);
        sparseIntArray.put(com.woolworths.R.layout.activity_progress_stepper_info, 7);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_current_delivery_order_overview, 8);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_current_pickup_order_overview, 9);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_delivery_instructions, 10);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_divider_deprecated, 11);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_edit_order_warning, 12);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_edit_order_warning_accept_term_checkbox, 13);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_edit_order_warning_image, 14);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_edit_order_warning_title, 15);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_horizontal_selector, 16);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_order_card_tile_list_skeleton, 17);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_order_collection_details, 18);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_order_compact_card_tile_list_skeleton, 19);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_order_details_button, 20);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_order_details_footer_message, 21);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_order_details_horizontal_divider, 22);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_order_details_item, 23);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_order_details_product, 24);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_order_details_refund_horizontal_divider, 25);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_order_horizontal_list_tile_header, 26);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_order_number_details, 27);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_order_overview, 28);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_order_product_list_feed_item, 29);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_order_store_details, 30);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_order_your_groceries_category_card_group, 31);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_order_your_groceries_filter_chip, 32);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_order_your_groceries_filter_group, 33);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_order_your_groceries_section_divider, 34);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_order_your_groceries_substitution_card, 35);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_orders_compact, 36);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_orders_delivery, 37);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_orders_pagination_try_again, 38);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_orders_pick_up, 39);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_orders_progress_bar, 40);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_orders_see_all_link, 41);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_parking_map, 42);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_parking_step, 43);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_parking_step_title, 44);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_payment_item, 45);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_payment_summary_divider, 46);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_priming_image, 47);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_priming_rationale, 48);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_progress_stepper_info_description, 49);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_progress_stepper_info_step, 50);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_section_title, 51);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_subtotal_title, 52);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_your_groceries_category_title, 53);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_your_groceries_count_tile, 54);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_your_groceries_fullfilment_status_title, 55);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_your_groceries_horizontal_divider, 56);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_your_groceries_loading_tile, 57);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_your_groceries_skeleton_header_tile, 58);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_your_groceries_skeleton_info_tile, 59);
        sparseIntArray.put(com.woolworths.R.layout.fragment_bay_number_selector, 60);
        sparseIntArray.put(com.woolworths.R.layout.fragment_orders_list, 61);
        sparseIntArray.put(com.woolworths.R.layout.fragment_pickup_eta_selector, 62);
        sparseIntArray.put(com.woolworths.R.layout.include_order_delivered_animation_view, 63);
        sparseIntArray.put(com.woolworths.R.layout.include_price_breakdown_bottom_sheet, 64);
        sparseIntArray.put(com.woolworths.R.layout.layout_order_progress, 65);
        sparseIntArray.put(com.woolworths.R.layout.menu_item_help, 66);
        sparseIntArray.put(com.woolworths.R.layout.priming_dialog, 67);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(11);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.base.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.base.shopapp.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.rewards.offers.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.shop.login.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.foundation.shop.editorder.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.product.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.rewards.base.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shared.ui.views.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shop.cart.DataBinderMapperImpl());
        arrayList.add(new com.airbnb.epoxy.databinding.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f7634a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            int i3 = (i2 - 1) / 50;
            if (i3 == 0) {
                switch (i2) {
                    case 1:
                        if ("layout/activity_edit_driver_instruction_0".equals(tag)) {
                            return new ActivityEditDriverInstructionBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for activity_edit_driver_instruction is invalid. Received: "));
                    case 2:
                        if ("layout/activity_edit_order_conditions_0".equals(tag)) {
                            return new ActivityEditOrderConditionsBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for activity_edit_order_conditions is invalid. Received: "));
                    case 3:
                        if ("layout/activity_order_cancel_prompt_0".equals(tag)) {
                            return new ActivityOrderCancelPromptBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for activity_order_cancel_prompt is invalid. Received: "));
                    case 4:
                        if (!"layout/activity_order_details_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for activity_order_details is invalid. Received: "));
                        }
                        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 10, ActivityOrderDetailsBindingImpl.H, ActivityOrderDetailsBindingImpl.I);
                        ActivityOrderDetailsBindingImpl activityOrderDetailsBindingImpl = new ActivityOrderDetailsBindingImpl(dataBindingComponent, view, (IncludeGenericErrorStateBinding) objArrT[5], (View) objArrT[3], (EpoxyRecyclerView) objArrT[9], (ContentLoadingProgressBar) objArrT[4], (SwipeRefreshLayout) objArrT[2], (Toolbar) objArrT[8], (IncludeOrderDeliveredAnimationViewBinding) objArrT[6]);
                        activityOrderDetailsBindingImpl.G = -1L;
                        IncludeGenericErrorStateBinding includeGenericErrorStateBinding = activityOrderDetailsBindingImpl.y;
                        if (includeGenericErrorStateBinding != null) {
                            includeGenericErrorStateBinding.n = activityOrderDetailsBindingImpl;
                        }
                        activityOrderDetailsBindingImpl.z.setTag(null);
                        ((CoordinatorLayout) objArrT[0]).setTag(null);
                        ((ConstraintLayout) objArrT[1]).setTag(null);
                        activityOrderDetailsBindingImpl.B.setTag(null);
                        activityOrderDetailsBindingImpl.C.setTag(null);
                        IncludeOrderDeliveredAnimationViewBinding includeOrderDeliveredAnimationViewBinding = activityOrderDetailsBindingImpl.E;
                        if (includeOrderDeliveredAnimationViewBinding != null) {
                            includeOrderDeliveredAnimationViewBinding.n = activityOrderDetailsBindingImpl;
                        }
                        activityOrderDetailsBindingImpl.E(view);
                        activityOrderDetailsBindingImpl.r();
                        return activityOrderDetailsBindingImpl;
                    case 5:
                        if (!"layout/activity_orders_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for activity_orders is invalid. Received: "));
                        }
                        Object[] objArrT2 = ViewDataBinding.t(dataBindingComponent, view, 5, null, ActivityOrdersBindingImpl.D);
                        ActivityOrdersBindingImpl activityOrdersBindingImpl = new ActivityOrdersBindingImpl(dataBindingComponent, view, (ViewPager2) objArrT2[4], (TabLayout) objArrT2[1], (Toolbar) objArrT2[3]);
                        activityOrdersBindingImpl.C = -1L;
                        ((CoordinatorLayout) objArrT2[0]).setTag(null);
                        activityOrdersBindingImpl.z.setTag(null);
                        activityOrdersBindingImpl.E(view);
                        activityOrdersBindingImpl.r();
                        return activityOrdersBindingImpl;
                    case 6:
                        if (!"layout/activity_parking_guide_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for activity_parking_guide is invalid. Received: "));
                        }
                        Object[] objArrT3 = ViewDataBinding.t(dataBindingComponent, view, 4, null, ActivityParkingGuideBindingImpl.B);
                        ActivityParkingGuideBindingImpl activityParkingGuideBindingImpl = new ActivityParkingGuideBindingImpl(dataBindingComponent, view, (EpoxyRecyclerView) objArrT3[3], (Toolbar) objArrT3[2]);
                        activityParkingGuideBindingImpl.A = -1L;
                        ((CoordinatorLayout) objArrT3[0]).setTag(null);
                        activityParkingGuideBindingImpl.E(view);
                        activityParkingGuideBindingImpl.r();
                        return activityParkingGuideBindingImpl;
                    case 7:
                        if (!"layout/activity_progress_stepper_info_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for activity_progress_stepper_info is invalid. Received: "));
                        }
                        Object[] objArrT4 = ViewDataBinding.t(dataBindingComponent, view, 5, null, ActivityProgressStepperInfoBindingImpl.B);
                        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) objArrT4[4];
                        ActivityProgressStepperInfoBindingImpl activityProgressStepperInfoBindingImpl = new ActivityProgressStepperInfoBindingImpl(dataBindingComponent, view, epoxyRecyclerView, (Toolbar) objArrT4[3]);
                        activityProgressStepperInfoBindingImpl.A = -1L;
                        ((CoordinatorLayout) objArrT4[0]).setTag(null);
                        activityProgressStepperInfoBindingImpl.E(view);
                        activityProgressStepperInfoBindingImpl.r();
                        return activityProgressStepperInfoBindingImpl;
                    case 8:
                        if ("layout/epoxy_item_current_delivery_order_overview_0".equals(tag)) {
                            return new EpoxyItemCurrentDeliveryOrderOverviewBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_current_delivery_order_overview is invalid. Received: "));
                    case 9:
                        if ("layout/epoxy_item_current_pickup_order_overview_0".equals(tag)) {
                            return new EpoxyItemCurrentPickupOrderOverviewBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_current_pickup_order_overview is invalid. Received: "));
                    case 10:
                        if ("layout/epoxy_item_delivery_instructions_0".equals(tag)) {
                            return new EpoxyItemDeliveryInstructionsBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_delivery_instructions is invalid. Received: "));
                    case 11:
                        if ("layout/epoxy_item_divider_deprecated_0".equals(tag)) {
                            return new EpoxyItemDividerDeprecatedBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_divider_deprecated is invalid. Received: "));
                    case 12:
                        if (!"layout/epoxy_item_edit_order_warning_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_edit_order_warning is invalid. Received: "));
                        }
                        Object[] objArrT5 = ViewDataBinding.t(dataBindingComponent, view, 3, null, EpoxyItemEditOrderWarningBindingImpl.B);
                        EpoxyItemEditOrderWarningBindingImpl epoxyItemEditOrderWarningBindingImpl = new EpoxyItemEditOrderWarningBindingImpl(dataBindingComponent, view, (TextView) objArrT5[1]);
                        epoxyItemEditOrderWarningBindingImpl.A = -1L;
                        ((ConstraintLayout) objArrT5[0]).setTag(null);
                        epoxyItemEditOrderWarningBindingImpl.y.setTag(null);
                        epoxyItemEditOrderWarningBindingImpl.E(view);
                        epoxyItemEditOrderWarningBindingImpl.r();
                        return epoxyItemEditOrderWarningBindingImpl;
                    case 13:
                        if ("layout/epoxy_item_edit_order_warning_accept_term_checkbox_0".equals(tag)) {
                            return new EpoxyItemEditOrderWarningAcceptTermCheckboxBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_edit_order_warning_accept_term_checkbox is invalid. Received: "));
                    case 14:
                        if ("layout/epoxy_item_edit_order_warning_image_0".equals(tag)) {
                            return new EpoxyItemEditOrderWarningImageBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_edit_order_warning_image is invalid. Received: "));
                    case 15:
                        if ("layout/epoxy_item_edit_order_warning_title_0".equals(tag)) {
                            return new EpoxyItemEditOrderWarningTitleBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_edit_order_warning_title is invalid. Received: "));
                    case 16:
                        if ("layout/epoxy_item_horizontal_selector_0".equals(tag)) {
                            return new EpoxyItemHorizontalSelectorBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_horizontal_selector is invalid. Received: "));
                    case 17:
                        if (!"layout/epoxy_item_order_card_tile_list_skeleton_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_order_card_tile_list_skeleton is invalid. Received: "));
                        }
                        Object[] objArrT6 = ViewDataBinding.t(dataBindingComponent, view, 8, null, EpoxyItemOrderCardTileListSkeletonBindingImpl.F);
                        View view2 = (View) objArrT6[5];
                        View view3 = (View) objArrT6[4];
                        View view4 = (View) objArrT6[7];
                        View view5 = (View) objArrT6[6];
                        View view6 = (View) objArrT6[3];
                        EpoxyItemOrderCardTileListSkeletonBindingImpl epoxyItemOrderCardTileListSkeletonBindingImpl = new EpoxyItemOrderCardTileListSkeletonBindingImpl(dataBindingComponent, view, view2, view3, view4, view5, view6, (View) objArrT6[2]);
                        epoxyItemOrderCardTileListSkeletonBindingImpl.E = -1L;
                        ((MaterialCardView) objArrT6[0]).setTag(null);
                        epoxyItemOrderCardTileListSkeletonBindingImpl.E(view);
                        epoxyItemOrderCardTileListSkeletonBindingImpl.r();
                        return epoxyItemOrderCardTileListSkeletonBindingImpl;
                    case 18:
                        if ("layout/epoxy_item_order_collection_details_0".equals(tag)) {
                            return new EpoxyItemOrderCollectionDetailsBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_order_collection_details is invalid. Received: "));
                    case 19:
                        if (!"layout/epoxy_item_order_compact_card_tile_list_skeleton_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_order_compact_card_tile_list_skeleton is invalid. Received: "));
                        }
                        Object[] objArrT7 = ViewDataBinding.t(dataBindingComponent, view, 9, EpoxyItemOrderCompactCardTileListSkeletonBindingImpl.E, EpoxyItemOrderCompactCardTileListSkeletonBindingImpl.F);
                        IncludeHorizontalDividerBinding includeHorizontalDividerBinding = (IncludeHorizontalDividerBinding) objArrT7[2];
                        View view7 = (View) objArrT7[8];
                        EpoxyItemOrderCompactCardTileListSkeletonBindingImpl epoxyItemOrderCompactCardTileListSkeletonBindingImpl = new EpoxyItemOrderCompactCardTileListSkeletonBindingImpl(dataBindingComponent, view, includeHorizontalDividerBinding, view7, (View) objArrT7[7], (View) objArrT7[4], (View) objArrT7[3]);
                        epoxyItemOrderCompactCardTileListSkeletonBindingImpl.D = -1L;
                        IncludeHorizontalDividerBinding includeHorizontalDividerBinding2 = epoxyItemOrderCompactCardTileListSkeletonBindingImpl.y;
                        if (includeHorizontalDividerBinding2 != null) {
                            includeHorizontalDividerBinding2.n = epoxyItemOrderCompactCardTileListSkeletonBindingImpl;
                        }
                        ((MaterialCardView) objArrT7[0]).setTag(null);
                        ((ConstraintLayout) objArrT7[1]).setTag(null);
                        epoxyItemOrderCompactCardTileListSkeletonBindingImpl.E(view);
                        epoxyItemOrderCompactCardTileListSkeletonBindingImpl.r();
                        return epoxyItemOrderCompactCardTileListSkeletonBindingImpl;
                    case 20:
                        if ("layout/epoxy_item_order_details_button_0".equals(tag)) {
                            return new EpoxyItemOrderDetailsButtonBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_order_details_button is invalid. Received: "));
                    case 21:
                        if (!"layout/epoxy_item_order_details_footer_message_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_order_details_footer_message is invalid. Received: "));
                        }
                        Object[] objArrT8 = ViewDataBinding.t(dataBindingComponent, view, 2, null, null);
                        EpoxyItemOrderDetailsFooterMessageBindingImpl epoxyItemOrderDetailsFooterMessageBindingImpl = new EpoxyItemOrderDetailsFooterMessageBindingImpl(dataBindingComponent, view, (TextView) objArrT8[1]);
                        epoxyItemOrderDetailsFooterMessageBindingImpl.A = -1L;
                        ((ConstraintLayout) objArrT8[0]).setTag(null);
                        epoxyItemOrderDetailsFooterMessageBindingImpl.y.setTag(null);
                        epoxyItemOrderDetailsFooterMessageBindingImpl.E(view);
                        epoxyItemOrderDetailsFooterMessageBindingImpl.r();
                        return epoxyItemOrderDetailsFooterMessageBindingImpl;
                    case 22:
                        if (!"layout/epoxy_item_order_details_horizontal_divider_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_order_details_horizontal_divider is invalid. Received: "));
                        }
                        Object[] objArrT9 = ViewDataBinding.t(dataBindingComponent, view, 2, EpoxyItemOrderDetailsHorizontalDividerBindingImpl.A, null);
                        EpoxyItemOrderDetailsHorizontalDividerBindingImpl epoxyItemOrderDetailsHorizontalDividerBindingImpl = new EpoxyItemOrderDetailsHorizontalDividerBindingImpl(dataBindingComponent, view, (IncludeHorizontalDividerBinding) objArrT9[1]);
                        epoxyItemOrderDetailsHorizontalDividerBindingImpl.z = -1L;
                        ((ConstraintLayout) objArrT9[0]).setTag(null);
                        IncludeHorizontalDividerBinding includeHorizontalDividerBinding3 = epoxyItemOrderDetailsHorizontalDividerBindingImpl.y;
                        if (includeHorizontalDividerBinding3 != null) {
                            includeHorizontalDividerBinding3.n = epoxyItemOrderDetailsHorizontalDividerBindingImpl;
                        }
                        epoxyItemOrderDetailsHorizontalDividerBindingImpl.E(view);
                        epoxyItemOrderDetailsHorizontalDividerBindingImpl.r();
                        return epoxyItemOrderDetailsHorizontalDividerBindingImpl;
                    case 23:
                        if (!"layout/epoxy_item_order_details_item_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_order_details_item is invalid. Received: "));
                        }
                        Object[] objArrT10 = ViewDataBinding.t(dataBindingComponent, view, 3, null, null);
                        EpoxyItemOrderDetailsItemBindingImpl epoxyItemOrderDetailsItemBindingImpl = new EpoxyItemOrderDetailsItemBindingImpl(dataBindingComponent, view, (TextView) objArrT10[2], (TextView) objArrT10[1]);
                        epoxyItemOrderDetailsItemBindingImpl.B = -1L;
                        ((ConstraintLayout) objArrT10[0]).setTag(null);
                        epoxyItemOrderDetailsItemBindingImpl.y.setTag(null);
                        epoxyItemOrderDetailsItemBindingImpl.z.setTag(null);
                        epoxyItemOrderDetailsItemBindingImpl.E(view);
                        epoxyItemOrderDetailsItemBindingImpl.r();
                        return epoxyItemOrderDetailsItemBindingImpl;
                    case 24:
                        if ("layout/epoxy_item_order_details_product_0".equals(tag)) {
                            return new EpoxyItemOrderDetailsProductBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_order_details_product is invalid. Received: "));
                    case 25:
                        if (!"layout/epoxy_item_order_details_refund_horizontal_divider_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_order_details_refund_horizontal_divider is invalid. Received: "));
                        }
                        Object[] objArrT11 = ViewDataBinding.t(dataBindingComponent, view, 2, EpoxyItemOrderDetailsRefundHorizontalDividerBindingImpl.A, null);
                        EpoxyItemOrderDetailsRefundHorizontalDividerBindingImpl epoxyItemOrderDetailsRefundHorizontalDividerBindingImpl = new EpoxyItemOrderDetailsRefundHorizontalDividerBindingImpl(dataBindingComponent, view, (IncludeHorizontalDividerBinding) objArrT11[1]);
                        epoxyItemOrderDetailsRefundHorizontalDividerBindingImpl.z = -1L;
                        ((ConstraintLayout) objArrT11[0]).setTag(null);
                        IncludeHorizontalDividerBinding includeHorizontalDividerBinding4 = epoxyItemOrderDetailsRefundHorizontalDividerBindingImpl.y;
                        if (includeHorizontalDividerBinding4 != null) {
                            includeHorizontalDividerBinding4.n = epoxyItemOrderDetailsRefundHorizontalDividerBindingImpl;
                        }
                        epoxyItemOrderDetailsRefundHorizontalDividerBindingImpl.E(view);
                        epoxyItemOrderDetailsRefundHorizontalDividerBindingImpl.r();
                        return epoxyItemOrderDetailsRefundHorizontalDividerBindingImpl;
                    case 26:
                        if ("layout/epoxy_item_order_horizontal_list_tile_header_0".equals(tag)) {
                            return new EpoxyItemOrderHorizontalListTileHeaderBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_order_horizontal_list_tile_header is invalid. Received: "));
                    case 27:
                        if ("layout/epoxy_item_order_number_details_0".equals(tag)) {
                            return new EpoxyItemOrderNumberDetailsBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_order_number_details is invalid. Received: "));
                    case 28:
                        if ("layout/epoxy_item_order_overview_0".equals(tag)) {
                            return new EpoxyItemOrderOverviewBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_order_overview is invalid. Received: "));
                    case 29:
                        if ("layout/epoxy_item_order_product_list_feed_item_0".equals(tag)) {
                            return new EpoxyItemOrderProductListFeedItemBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_order_product_list_feed_item is invalid. Received: "));
                    case 30:
                        if ("layout/epoxy_item_order_store_details_0".equals(tag)) {
                            return new EpoxyItemOrderStoreDetailsBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_order_store_details is invalid. Received: "));
                    case 31:
                        if (!"layout/epoxy_item_order_your_groceries_category_card_group_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_order_your_groceries_category_card_group is invalid. Received: "));
                        }
                        Object[] objArrT12 = ViewDataBinding.t(dataBindingComponent, view, 2, null, EpoxyItemOrderYourGroceriesCategoryCardGroupBindingImpl.z);
                        EpoxyItemOrderYourGroceriesCategoryCardGroupBindingImpl epoxyItemOrderYourGroceriesCategoryCardGroupBindingImpl = new EpoxyItemOrderYourGroceriesCategoryCardGroupBindingImpl(dataBindingComponent, view, 0);
                        epoxyItemOrderYourGroceriesCategoryCardGroupBindingImpl.y = -1L;
                        ((MaterialCardView) objArrT12[0]).setTag(null);
                        epoxyItemOrderYourGroceriesCategoryCardGroupBindingImpl.E(view);
                        epoxyItemOrderYourGroceriesCategoryCardGroupBindingImpl.r();
                        return epoxyItemOrderYourGroceriesCategoryCardGroupBindingImpl;
                    case 32:
                        if ("layout/epoxy_item_order_your_groceries_filter_chip_0".equals(tag)) {
                            return new EpoxyItemOrderYourGroceriesFilterChipBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_order_your_groceries_filter_chip is invalid. Received: "));
                    case 33:
                        if ("layout/epoxy_item_order_your_groceries_filter_group_0".equals(tag)) {
                            return new EpoxyItemOrderYourGroceriesFilterGroupBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_order_your_groceries_filter_group is invalid. Received: "));
                    case 34:
                        if ("layout/epoxy_item_order_your_groceries_section_divider_0".equals(tag)) {
                            return new EpoxyItemOrderYourGroceriesSectionDividerBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_order_your_groceries_section_divider is invalid. Received: "));
                    case 35:
                        if ("layout/epoxy_item_order_your_groceries_substitution_card_0".equals(tag)) {
                            return new EpoxyItemOrderYourGroceriesSubstitutionCardBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_order_your_groceries_substitution_card is invalid. Received: "));
                    case 36:
                        if ("layout/epoxy_item_orders_compact_0".equals(tag)) {
                            return new EpoxyItemOrdersCompactBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_orders_compact is invalid. Received: "));
                    case 37:
                        if ("layout/epoxy_item_orders_delivery_0".equals(tag)) {
                            return new EpoxyItemOrdersDeliveryBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_orders_delivery is invalid. Received: "));
                    case 38:
                        if ("layout/epoxy_item_orders_pagination_try_again_0".equals(tag)) {
                            return new EpoxyItemOrdersPaginationTryAgainBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_orders_pagination_try_again is invalid. Received: "));
                    case 39:
                        if ("layout/epoxy_item_orders_pick_up_0".equals(tag)) {
                            return new EpoxyItemOrdersPickUpBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_orders_pick_up is invalid. Received: "));
                    case 40:
                        if ("layout/epoxy_item_orders_progress_bar_0".equals(tag)) {
                            return new EpoxyItemOrdersProgressBarBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_orders_progress_bar is invalid. Received: "));
                    case 41:
                        if ("layout/epoxy_item_orders_see_all_link_0".equals(tag)) {
                            return new EpoxyItemOrdersSeeAllLinkBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_orders_see_all_link is invalid. Received: "));
                    case 42:
                        if ("layout/epoxy_item_parking_map_0".equals(tag)) {
                            return new EpoxyItemParkingMapBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_parking_map is invalid. Received: "));
                    case 43:
                        if (!"layout/epoxy_item_parking_step_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_parking_step is invalid. Received: "));
                        }
                        Object[] objArrT13 = ViewDataBinding.t(dataBindingComponent, view, 3, null, null);
                        EpoxyItemParkingStepBindingImpl epoxyItemParkingStepBindingImpl = new EpoxyItemParkingStepBindingImpl(dataBindingComponent, view, (TextView) objArrT13[2], (TextView) objArrT13[1]);
                        epoxyItemParkingStepBindingImpl.C = -1L;
                        ((ConstraintLayout) objArrT13[0]).setTag(null);
                        epoxyItemParkingStepBindingImpl.y.setTag(null);
                        epoxyItemParkingStepBindingImpl.z.setTag(null);
                        epoxyItemParkingStepBindingImpl.E(view);
                        epoxyItemParkingStepBindingImpl.r();
                        return epoxyItemParkingStepBindingImpl;
                    case 44:
                        if (!"layout/epoxy_item_parking_step_title_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_parking_step_title is invalid. Received: "));
                        }
                        Object[] objArrT14 = ViewDataBinding.t(dataBindingComponent, view, 1, null, null);
                        EpoxyItemParkingStepTitleBindingImpl epoxyItemParkingStepTitleBindingImpl = new EpoxyItemParkingStepTitleBindingImpl(dataBindingComponent, view, 0);
                        epoxyItemParkingStepTitleBindingImpl.y = -1L;
                        ((TextView) objArrT14[0]).setTag(null);
                        epoxyItemParkingStepTitleBindingImpl.E(view);
                        epoxyItemParkingStepTitleBindingImpl.r();
                        return epoxyItemParkingStepTitleBindingImpl;
                    case 45:
                        if (!"layout/epoxy_item_payment_item_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_payment_item is invalid. Received: "));
                        }
                        Object[] objArrT15 = ViewDataBinding.t(dataBindingComponent, view, 5, null, null);
                        EpoxyItemPaymentItemBindingImpl epoxyItemPaymentItemBindingImpl = new EpoxyItemPaymentItemBindingImpl(dataBindingComponent, view, (TextView) objArrT15[4], (ImageView) objArrT15[1], (ImageView) objArrT15[3], (TextView) objArrT15[2]);
                        epoxyItemPaymentItemBindingImpl.F = -1L;
                        epoxyItemPaymentItemBindingImpl.y.setTag(null);
                        epoxyItemPaymentItemBindingImpl.z.setTag(null);
                        epoxyItemPaymentItemBindingImpl.A.setTag(null);
                        ((ConstraintLayout) objArrT15[0]).setTag(null);
                        epoxyItemPaymentItemBindingImpl.B.setTag(null);
                        epoxyItemPaymentItemBindingImpl.E(view);
                        epoxyItemPaymentItemBindingImpl.r();
                        return epoxyItemPaymentItemBindingImpl;
                    case 46:
                        if (!"layout/epoxy_item_payment_summary_divider_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_payment_summary_divider is invalid. Received: "));
                        }
                        Object[] objArrT16 = ViewDataBinding.t(dataBindingComponent, view, 2, EpoxyItemPaymentSummaryDividerBindingImpl.A, null);
                        EpoxyItemPaymentSummaryDividerBindingImpl epoxyItemPaymentSummaryDividerBindingImpl = new EpoxyItemPaymentSummaryDividerBindingImpl(dataBindingComponent, view, (IncludeHorizontalDividerBinding) objArrT16[1]);
                        epoxyItemPaymentSummaryDividerBindingImpl.z = -1L;
                        ((ConstraintLayout) objArrT16[0]).setTag(null);
                        IncludeHorizontalDividerBinding includeHorizontalDividerBinding5 = epoxyItemPaymentSummaryDividerBindingImpl.y;
                        if (includeHorizontalDividerBinding5 != null) {
                            includeHorizontalDividerBinding5.n = epoxyItemPaymentSummaryDividerBindingImpl;
                        }
                        epoxyItemPaymentSummaryDividerBindingImpl.E(view);
                        epoxyItemPaymentSummaryDividerBindingImpl.r();
                        return epoxyItemPaymentSummaryDividerBindingImpl;
                    case 47:
                        if ("layout/epoxy_item_priming_image_0".equals(tag)) {
                            return new EpoxyItemPrimingImageBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_priming_image is invalid. Received: "));
                    case 48:
                        if (!"layout/epoxy_item_priming_rationale_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_priming_rationale is invalid. Received: "));
                        }
                        Object[] objArrT17 = ViewDataBinding.t(dataBindingComponent, view, 3, null, EpoxyItemPrimingRationaleBindingImpl.B);
                        EpoxyItemPrimingRationaleBindingImpl epoxyItemPrimingRationaleBindingImpl = new EpoxyItemPrimingRationaleBindingImpl(dataBindingComponent, view, (TextView) objArrT17[1]);
                        epoxyItemPrimingRationaleBindingImpl.A = -1L;
                        ((ConstraintLayout) objArrT17[0]).setTag(null);
                        epoxyItemPrimingRationaleBindingImpl.y.setTag(null);
                        epoxyItemPrimingRationaleBindingImpl.E(view);
                        epoxyItemPrimingRationaleBindingImpl.r();
                        return epoxyItemPrimingRationaleBindingImpl;
                    case 49:
                        if ("layout/epoxy_item_progress_stepper_info_description_0".equals(tag)) {
                            return new EpoxyItemProgressStepperInfoDescriptionBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_progress_stepper_info_description is invalid. Received: "));
                    case 50:
                        if ("layout/epoxy_item_progress_stepper_info_step_0".equals(tag)) {
                            return new EpoxyItemProgressStepperInfoStepBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_progress_stepper_info_step is invalid. Received: "));
                }
            }
            if (i3 == 1) {
                switch (i2) {
                    case 51:
                        if (!"layout/epoxy_item_section_title_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_section_title is invalid. Received: "));
                        }
                        Object[] objArrT18 = ViewDataBinding.t(dataBindingComponent, view, 2, null, null);
                        EpoxyItemSectionTitleBindingImpl epoxyItemSectionTitleBindingImpl = new EpoxyItemSectionTitleBindingImpl(dataBindingComponent, view, (TextView) objArrT18[1]);
                        epoxyItemSectionTitleBindingImpl.A = -1L;
                        ((ConstraintLayout) objArrT18[0]).setTag(null);
                        epoxyItemSectionTitleBindingImpl.y.setTag(null);
                        epoxyItemSectionTitleBindingImpl.E(view);
                        epoxyItemSectionTitleBindingImpl.r();
                        return epoxyItemSectionTitleBindingImpl;
                    case 52:
                        if (!"layout/epoxy_item_subtotal_title_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_subtotal_title is invalid. Received: "));
                        }
                        EpoxyItemSubtotalTitleBindingImpl epoxyItemSubtotalTitleBindingImpl = new EpoxyItemSubtotalTitleBindingImpl(dataBindingComponent, view, (TextView) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
                        epoxyItemSubtotalTitleBindingImpl.A = -1L;
                        epoxyItemSubtotalTitleBindingImpl.y.setTag(null);
                        view.setTag(com.woolworths.R.id.dataBinding, epoxyItemSubtotalTitleBindingImpl);
                        epoxyItemSubtotalTitleBindingImpl.r();
                        return epoxyItemSubtotalTitleBindingImpl;
                    case 53:
                        if ("layout/epoxy_item_your_groceries_category_title_0".equals(tag)) {
                            return new EpoxyItemYourGroceriesCategoryTitleBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_your_groceries_category_title is invalid. Received: "));
                    case 54:
                        if ("layout/epoxy_item_your_groceries_count_tile_0".equals(tag)) {
                            return new EpoxyItemYourGroceriesCountTileBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_your_groceries_count_tile is invalid. Received: "));
                    case 55:
                        if ("layout/epoxy_item_your_groceries_fullfilment_status_title_0".equals(tag)) {
                            return new EpoxyItemYourGroceriesFullfilmentStatusTitleBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_your_groceries_fullfilment_status_title is invalid. Received: "));
                    case 56:
                        if ("layout/epoxy_item_your_groceries_horizontal_divider_0".equals(tag)) {
                            return new EpoxyItemYourGroceriesHorizontalDividerBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_your_groceries_horizontal_divider is invalid. Received: "));
                    case 57:
                        if (!"layout/epoxy_item_your_groceries_loading_tile_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_your_groceries_loading_tile is invalid. Received: "));
                        }
                        Object[] objArrT19 = ViewDataBinding.t(dataBindingComponent, view, 2, null, EpoxyItemYourGroceriesLoadingTileBindingImpl.z);
                        EpoxyItemYourGroceriesLoadingTileBindingImpl epoxyItemYourGroceriesLoadingTileBindingImpl = new EpoxyItemYourGroceriesLoadingTileBindingImpl(dataBindingComponent, view, 0);
                        epoxyItemYourGroceriesLoadingTileBindingImpl.y = -1L;
                        ((ConstraintLayout) objArrT19[0]).setTag(null);
                        epoxyItemYourGroceriesLoadingTileBindingImpl.E(view);
                        epoxyItemYourGroceriesLoadingTileBindingImpl.r();
                        return epoxyItemYourGroceriesLoadingTileBindingImpl;
                    case 58:
                        if (!"layout/epoxy_item_your_groceries_skeleton_header_tile_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_your_groceries_skeleton_header_tile is invalid. Received: "));
                        }
                        Object[] objArrT20 = ViewDataBinding.t(dataBindingComponent, view, 9, EpoxyItemYourGroceriesSkeletonHeaderTileBindingImpl.F, EpoxyItemYourGroceriesSkeletonHeaderTileBindingImpl.G);
                        View view8 = (View) objArrT20[8];
                        IncludeHorizontalDividerBinding includeHorizontalDividerBinding6 = (IncludeHorizontalDividerBinding) objArrT20[1];
                        IncludeHorizontalDividerBinding includeHorizontalDividerBinding7 = (IncludeHorizontalDividerBinding) objArrT20[2];
                        IncludeHorizontalDividerBinding includeHorizontalDividerBinding8 = (IncludeHorizontalDividerBinding) objArrT20[3];
                        EpoxyItemYourGroceriesSkeletonHeaderTileBindingImpl epoxyItemYourGroceriesSkeletonHeaderTileBindingImpl = new EpoxyItemYourGroceriesSkeletonHeaderTileBindingImpl(dataBindingComponent, view, view8, includeHorizontalDividerBinding6, includeHorizontalDividerBinding7, includeHorizontalDividerBinding8, (View) objArrT20[5], (View) objArrT20[6]);
                        epoxyItemYourGroceriesSkeletonHeaderTileBindingImpl.E = -1L;
                        IncludeHorizontalDividerBinding includeHorizontalDividerBinding9 = epoxyItemYourGroceriesSkeletonHeaderTileBindingImpl.z;
                        if (includeHorizontalDividerBinding9 != null) {
                            includeHorizontalDividerBinding9.n = epoxyItemYourGroceriesSkeletonHeaderTileBindingImpl;
                        }
                        IncludeHorizontalDividerBinding includeHorizontalDividerBinding10 = epoxyItemYourGroceriesSkeletonHeaderTileBindingImpl.A;
                        if (includeHorizontalDividerBinding10 != null) {
                            includeHorizontalDividerBinding10.n = epoxyItemYourGroceriesSkeletonHeaderTileBindingImpl;
                        }
                        IncludeHorizontalDividerBinding includeHorizontalDividerBinding11 = epoxyItemYourGroceriesSkeletonHeaderTileBindingImpl.B;
                        if (includeHorizontalDividerBinding11 != null) {
                            includeHorizontalDividerBinding11.n = epoxyItemYourGroceriesSkeletonHeaderTileBindingImpl;
                        }
                        ((ConstraintLayout) objArrT20[0]).setTag(null);
                        epoxyItemYourGroceriesSkeletonHeaderTileBindingImpl.E(view);
                        epoxyItemYourGroceriesSkeletonHeaderTileBindingImpl.r();
                        return epoxyItemYourGroceriesSkeletonHeaderTileBindingImpl;
                    case 59:
                        if (!"layout/epoxy_item_your_groceries_skeleton_info_tile_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_your_groceries_skeleton_info_tile is invalid. Received: "));
                        }
                        Object[] objArrT21 = ViewDataBinding.t(dataBindingComponent, view, 7, null, EpoxyItemYourGroceriesSkeletonInfoTileBindingImpl.F);
                        EpoxyItemYourGroceriesSkeletonInfoTileBindingImpl epoxyItemYourGroceriesSkeletonInfoTileBindingImpl = new EpoxyItemYourGroceriesSkeletonInfoTileBindingImpl(dataBindingComponent, view, (View) objArrT21[3], (View) objArrT21[6], (View) objArrT21[5], (View) objArrT21[4], (View) objArrT21[1], (View) objArrT21[2]);
                        epoxyItemYourGroceriesSkeletonInfoTileBindingImpl.E = -1L;
                        ((ConstraintLayout) objArrT21[0]).setTag(null);
                        epoxyItemYourGroceriesSkeletonInfoTileBindingImpl.E(view);
                        epoxyItemYourGroceriesSkeletonInfoTileBindingImpl.r();
                        return epoxyItemYourGroceriesSkeletonInfoTileBindingImpl;
                    case 60:
                        if ("layout/fragment_bay_number_selector_0".equals(tag)) {
                            return new FragmentBayNumberSelectorBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for fragment_bay_number_selector is invalid. Received: "));
                    case 61:
                        if ("layout/fragment_orders_list_0".equals(tag)) {
                            return new FragmentOrdersListBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for fragment_orders_list is invalid. Received: "));
                    case 62:
                        if ("layout/fragment_pickup_eta_selector_0".equals(tag)) {
                            return new FragmentPickupEtaSelectorBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for fragment_pickup_eta_selector is invalid. Received: "));
                    case 63:
                        if (!"layout/include_order_delivered_animation_view_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for include_order_delivered_animation_view is invalid. Received: "));
                        }
                        IncludeOrderDeliveredAnimationViewBindingImpl includeOrderDeliveredAnimationViewBindingImpl = new IncludeOrderDeliveredAnimationViewBindingImpl(dataBindingComponent, view, (LottieAnimationView) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
                        includeOrderDeliveredAnimationViewBindingImpl.z = -1L;
                        includeOrderDeliveredAnimationViewBindingImpl.y.setTag(null);
                        view.setTag(com.woolworths.R.id.dataBinding, includeOrderDeliveredAnimationViewBindingImpl);
                        includeOrderDeliveredAnimationViewBindingImpl.r();
                        return includeOrderDeliveredAnimationViewBindingImpl;
                    case 64:
                        if ("layout/include_price_breakdown_bottom_sheet_0".equals(tag)) {
                            return new IncludePriceBreakdownBottomSheetBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for include_price_breakdown_bottom_sheet is invalid. Received: "));
                    case 65:
                        if ("layout/layout_order_progress_0".equals(tag)) {
                            return new LayoutOrderProgressBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for layout_order_progress is invalid. Received: "));
                    case 66:
                        if ("layout/menu_item_help_0".equals(tag)) {
                            return new MenuItemHelpBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for menu_item_help is invalid. Received: "));
                    case 67:
                        if (!"layout/priming_dialog_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for priming_dialog is invalid. Received: "));
                        }
                        Object[] objArrT22 = ViewDataBinding.t(dataBindingComponent, view, 2, null, PrimingDialogBindingImpl.B);
                        PrimingDialogBindingImpl primingDialogBindingImpl = new PrimingDialogBindingImpl(dataBindingComponent, view, (ComposeView) objArrT22[1]);
                        primingDialogBindingImpl.A = -1L;
                        ((ConstraintLayout) objArrT22[0]).setTag(null);
                        primingDialogBindingImpl.E(view);
                        primingDialogBindingImpl.r();
                        return primingDialogBindingImpl;
                }
            }
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f7634a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f7635a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
