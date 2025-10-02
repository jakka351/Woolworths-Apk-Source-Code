package com.woolworths.scanlibrary;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.impl.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.foundation.barcode.ui.BarcodeView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;
import com.woolworths.scanlibrary.databinding.ActivityAddPaymentSetupBindingImpl;
import com.woolworths.scanlibrary.databinding.ActivityAvailableStoreListBindingImpl;
import com.woolworths.scanlibrary.databinding.ActivityAvailableStoresBindingImpl;
import com.woolworths.scanlibrary.databinding.ActivityCheckOutSngBindingImpl;
import com.woolworths.scanlibrary.databinding.ActivityContactUsBindingImpl;
import com.woolworths.scanlibrary.databinding.ActivityExitScanCodeBindingImpl;
import com.woolworths.scanlibrary.databinding.ActivityHomeBindingImpl;
import com.woolworths.scanlibrary.databinding.ActivityManualAddItemProcessBindingImpl;
import com.woolworths.scanlibrary.databinding.ActivityMessageBindingImpl;
import com.woolworths.scanlibrary.databinding.ActivityMyAccountBindingImpl;
import com.woolworths.scanlibrary.databinding.ActivityOnBoardingBindingImpl;
import com.woolworths.scanlibrary.databinding.ActivityOnboardingAddCardBindingImpl;
import com.woolworths.scanlibrary.databinding.ActivityParkingVoucherBindingImpl;
import com.woolworths.scanlibrary.databinding.ActivityProductInfoBindingImpl;
import com.woolworths.scanlibrary.databinding.ActivityReceiptBindingImpl;
import com.woolworths.scanlibrary.databinding.ActivityScannerBindingImpl;
import com.woolworths.scanlibrary.databinding.ActivitySearchSngBindingImpl;
import com.woolworths.scanlibrary.databinding.ActivitySetupCompleteBindingImpl;
import com.woolworths.scanlibrary.databinding.ActivityShoppingCartBindingImpl;
import com.woolworths.scanlibrary.databinding.ActivitySngLandingEntryBindingImpl;
import com.woolworths.scanlibrary.databinding.ActivitySngRewardsSetupBindingImpl;
import com.woolworths.scanlibrary.databinding.ActivityTapOnBindingImpl;
import com.woolworths.scanlibrary.databinding.ActivityTermsConditionsSngBindingImpl;
import com.woolworths.scanlibrary.databinding.ActivityTransactionListBindingImpl;
import com.woolworths.scanlibrary.databinding.ActivityUpdateCreditCardBindingImpl;
import com.woolworths.scanlibrary.databinding.ActivityUseMetroWifiBindingImpl;
import com.woolworths.scanlibrary.databinding.ActivityWeightedArticleSelectionBindingImpl;
import com.woolworths.scanlibrary.databinding.ContentWeightedArticleSelectionBinding;
import com.woolworths.scanlibrary.databinding.ContentWeightedArticleSelectionBindingImpl;
import com.woolworths.scanlibrary.databinding.CustomCartViewBindingImpl;
import com.woolworths.scanlibrary.databinding.CustomInstrumentListsViewBindingImpl;
import com.woolworths.scanlibrary.databinding.CustomPaymentInstrumentViewBindingImpl;
import com.woolworths.scanlibrary.databinding.CustomShoppingListQuickViewBindingImpl;
import com.woolworths.scanlibrary.databinding.CustomViewImageListBindingImpl;
import com.woolworths.scanlibrary.databinding.DialogItemQuantityPickerBindingImpl;
import com.woolworths.scanlibrary.databinding.DialogScanResultViewBinding;
import com.woolworths.scanlibrary.databinding.DialogScanResultViewBindingImpl;
import com.woolworths.scanlibrary.databinding.EpoxySngViewLandingContentBindingImpl;
import com.woolworths.scanlibrary.databinding.EpoxySngViewLandingLogoBindingImpl;
import com.woolworths.scanlibrary.databinding.EpoxySngViewLandingTitleBindingImpl;
import com.woolworths.scanlibrary.databinding.EpoxyViewAvailableStoreInfoBindingImpl;
import com.woolworths.scanlibrary.databinding.FragmentHomeBindingImpl;
import com.woolworths.scanlibrary.databinding.FragmentInstrumentListBindingImpl;
import com.woolworths.scanlibrary.databinding.FragmentMessageSingleActionBindingImpl;
import com.woolworths.scanlibrary.databinding.FragmentPostScanViewBindingImpl;
import com.woolworths.scanlibrary.databinding.FragmentShoppingCartBindingImpl;
import com.woolworths.scanlibrary.databinding.FragmentStepupDialogBindingImpl;
import com.woolworths.scanlibrary.databinding.FragmentTapOnBindingImpl;
import com.woolworths.scanlibrary.databinding.FragmentTenderPayBindingImpl;
import com.woolworths.scanlibrary.databinding.IncludeNoSngStoreBinding;
import com.woolworths.scanlibrary.databinding.IncludeNoSngStoreBindingImpl;
import com.woolworths.scanlibrary.databinding.IncludeSngGenericErrorStateBindingImpl;
import com.woolworths.scanlibrary.databinding.IncludeSngNetworkErrorBinding;
import com.woolworths.scanlibrary.databinding.IncludeSngNetworkErrorBindingImpl;
import com.woolworths.scanlibrary.databinding.ItemOnboardingBindingImpl;
import com.woolworths.scanlibrary.databinding.ItemOnboardingRefreshBindingImpl;
import com.woolworths.scanlibrary.databinding.ItemSearchResultSngBindingImpl;
import com.woolworths.scanlibrary.databinding.LayoutDarkToolbarBinding;
import com.woolworths.scanlibrary.databinding.LayoutDarkToolbarBindingImpl;
import com.woolworths.scanlibrary.databinding.LayoutDarkToolbarProgressBindingImpl;
import com.woolworths.scanlibrary.databinding.LayoutInstrumentListBindingImpl;
import com.woolworths.scanlibrary.databinding.LayoutNavigationDrawerBinding;
import com.woolworths.scanlibrary.databinding.LayoutNavigationDrawerBindingImpl;
import com.woolworths.scanlibrary.databinding.LayoutToolbarBinding;
import com.woolworths.scanlibrary.databinding.LayoutToolbarBindingImpl;
import com.woolworths.scanlibrary.databinding.LayoutWowToolbarBinding;
import com.woolworths.scanlibrary.databinding.LayoutWowToolbarBindingImpl;
import com.woolworths.scanlibrary.databinding.NetworkStateItemBindingImpl;
import com.woolworths.scanlibrary.databinding.PostScanViewInterventionItemBindingImpl;
import com.woolworths.scanlibrary.databinding.PostScanViewSimpleItemBindingImpl;
import com.woolworths.scanlibrary.databinding.PostScanViewUnknownItemBindingImpl;
import com.woolworths.scanlibrary.databinding.PostScanViewWeightRequiredItemBindingImpl;
import com.woolworths.scanlibrary.databinding.PostScanViewWeightedItemBindingImpl;
import com.woolworths.scanlibrary.databinding.ReceiptDashedDividerBindingImpl;
import com.woolworths.scanlibrary.databinding.ReceiptDatetimeBindingImpl;
import com.woolworths.scanlibrary.databinding.ReceiptDiscountBindingImpl;
import com.woolworths.scanlibrary.databinding.ReceiptGeneralVoucherBindingImpl;
import com.woolworths.scanlibrary.databinding.ReceiptItemBindingImpl;
import com.woolworths.scanlibrary.databinding.ReceiptItemPromotionBindingImpl;
import com.woolworths.scanlibrary.databinding.ReceiptParkingVoucherBindingImpl;
import com.woolworths.scanlibrary.databinding.ReceiptPosbarcodeBindingImpl;
import com.woolworths.scanlibrary.databinding.ReceiptTitleBindingImpl;
import com.woolworths.scanlibrary.databinding.ReceiptTotalDiscountBindingImpl;
import com.woolworths.scanlibrary.databinding.ReceiptTotalPaymentBindingImpl;
import com.woolworths.scanlibrary.databinding.ReceiptTotalSavingsBindingImpl;
import com.woolworths.scanlibrary.databinding.ShelfLabelScanBlockBottomSheetBindingImpl;
import com.woolworths.scanlibrary.databinding.ViewAcceptedCreditcardsBindingImpl;
import com.woolworths.scanlibrary.databinding.ViewAddCreditcardBindingImpl;
import com.woolworths.scanlibrary.databinding.ViewAddcardErrorBinding;
import com.woolworths.scanlibrary.databinding.ViewAddcardErrorBindingImpl;
import com.woolworths.scanlibrary.databinding.ViewAvailableStoreItemBindingImpl;
import com.woolworths.scanlibrary.databinding.ViewCartInterventionRequiredItemBindingImpl;
import com.woolworths.scanlibrary.databinding.ViewCartProudctImageBindingImpl;
import com.woolworths.scanlibrary.databinding.ViewCartSimpleItemBindingImpl;
import com.woolworths.scanlibrary.databinding.ViewCartUnknownItemBindingImpl;
import com.woolworths.scanlibrary.databinding.ViewCartWeightRequiredItemBindingImpl;
import com.woolworths.scanlibrary.databinding.ViewCheckedShoppingItemRowBindingImpl;
import com.woolworths.scanlibrary.databinding.ViewDotIndicatorBindingImpl;
import com.woolworths.scanlibrary.databinding.ViewHeaderDrawerBindingImpl;
import com.woolworths.scanlibrary.databinding.ViewInterventionProductInfoBindingImpl;
import com.woolworths.scanlibrary.databinding.ViewPaymentErrorBindingImpl;
import com.woolworths.scanlibrary.databinding.ViewSimpleProductInfoBindingImpl;
import com.woolworths.scanlibrary.databinding.ViewStateItemBindingImpl;
import com.woolworths.scanlibrary.databinding.ViewUpdateCreditcardBindingImpl;
import com.woolworths.scanlibrary.databinding.ViewWeightRequiredProductInfoBindingImpl;
import com.woolworths.scanlibrary.databinding.ViewWeightedItemProductInfoBindingImpl;
import com.woolworths.scanlibrary.util.widget.AddCreditCardView;
import com.woolworths.scanlibrary.util.widget.DotIndicatorView;
import com.woolworths.scanlibrary.util.widget.InstrumentListView;
import com.woolworths.scanlibrary.util.widget.OverlayWithHoleImageView;
import com.woolworths.scanlibrary.util.widget.PriceView;
import com.woolworths.scanlibrary.util.widget.ProductBadgeView;
import com.woolworths.scanlibrary.util.widget.ProductImageView;
import com.woolworths.scanlibrary.util.widget.ProductSearchView;
import com.woolworths.scanlibrary.util.widget.SquareImageView;
import com.woolworths.scanlibrary.util.widget.UpdateCreditCardExpirationView;
import com.woolworths.scanlibrary.util.widget.WeightedListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes7.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f21132a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = a.b(124, 0, 1, "_all", "actionListener");
            sparseArrayB.put(2, "actionState");
            sparseArrayB.put(3, "allowQuantityUpdate");
            sparseArrayB.put(4, "asset");
            sparseArrayB.put(5, "backgroundColor");
            sparseArrayB.put(6, "banner");
            sparseArrayB.put(7, "bannerAsset");
            sparseArrayB.put(8, "bannerIcon");
            sparseArrayB.put(9, "bannerState");
            sparseArrayB.put(10, "body");
            sparseArrayB.put(11, "boostAnimationVisibility");
            sparseArrayB.put(12, "boostViewListener");
            sparseArrayB.put(13, "brandLabel");
            sparseArrayB.put(14, "buttonText");
            sparseArrayB.put(15, "buttonTint");
            sparseArrayB.put(16, "canShowWatchlist");
            sparseArrayB.put(17, "cart");
            sparseArrayB.put(18, "clickHandler");
            sparseArrayB.put(19, "clickHandlers");
            sparseArrayB.put(20, "clickListener");
            sparseArrayB.put(21, "coachMark");
            sparseArrayB.put(22, "containerTitle");
            sparseArrayB.put(23, "cta");
            sparseArrayB.put(24, "ctaText");
            sparseArrayB.put(25, "data");
            sparseArrayB.put(26, "displayExpiryExtended");
            sparseArrayB.put(27, "emptyState");
            sparseArrayB.put(28, "enableBoostAnimationContainerGap");
            sparseArrayB.put(29, "enabled");
            sparseArrayB.put(30, "errorBody");
            sparseArrayB.put(31, "errorHeader");
            sparseArrayB.put(32, "errorMessage");
            sparseArrayB.put(33, "errorState");
            sparseArrayB.put(34, "filter");
            sparseArrayB.put(35, "footer");
            sparseArrayB.put(36, "groupTitle");
            sparseArrayB.put(37, "handler");
            sparseArrayB.put(38, "handlers");
            sparseArrayB.put(39, "hasItemsToWeigh");
            sparseArrayB.put(40, "header");
            sparseArrayB.put(41, "heightRes");
            sparseArrayB.put(42, "hostScreen");
            sparseArrayB.put(43, "htmlListener");
            sparseArrayB.put(44, "iconResId");
            sparseArrayB.put(45, "imageLoaderListener");
            sparseArrayB.put(46, "importantForAccessibility");
            sparseArrayB.put(47, "index");
            sparseArrayB.put(48, "info");
            sparseArrayB.put(49, "infoBarType");
            sparseArrayB.put(50, "infoSectionItem");
            sparseArrayB.put(51, "inlineMessage");
            sparseArrayB.put(52, "isAccountNotificationBadgeShown");
            sparseArrayB.put(53, "isChecked");
            sparseArrayB.put(54, "isCtaInProgress");
            sparseArrayB.put(55, "isEnabled");
            sparseArrayB.put(56, "isLoading");
            sparseArrayB.put(57, "isLowerPriceYellow");
            sparseArrayB.put(58, "isMarketplace");
            sparseArrayB.put(59, "isPopup");
            sparseArrayB.put(60, "isRewardStyle");
            sparseArrayB.put(61, "isSelected");
            sparseArrayB.put(62, "isUnlocking");
            sparseArrayB.put(63, "isWatchlisted");
            sparseArrayB.put(64, "item");
            sparseArrayB.put(65, "itemState");
            sparseArrayB.put(66, "itemWidthRes");
            sparseArrayB.put(67, AnnotatedPrivateKey.LABEL);
            sparseArrayB.put(68, "labelStyle");
            sparseArrayB.put(69, "linkHandler");
            sparseArrayB.put(70, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            sparseArrayB.put(71, "loadingMessage");
            sparseArrayB.put(72, "lottieAutoPlay");
            sparseArrayB.put(73, "lottieBackgroundColor");
            sparseArrayB.put(74, "lottieLoop");
            sparseArrayB.put(75, "margins");
            sparseArrayB.put(76, "markdownContent");
            sparseArrayB.put(77, "memberPriceInfo");
            sparseArrayB.put(78, "message");
            sparseArrayB.put(79, "networkState");
            sparseArrayB.put(80, "offerViewItem");
            sparseArrayB.put(81, "onBannerClick");
            sparseArrayB.put(82, "onClick");
            sparseArrayB.put(83, "onPointsBalanceClick");
            sparseArrayB.put(84, "onQueryTextChangeListener");
            sparseArrayB.put(85, "onQueryTextFocusChangeListener");
            sparseArrayB.put(86, "onQueryTextSubmitListener");
            sparseArrayB.put(87, "optionText");
            sparseArrayB.put(88, "paddingBottom");
            sparseArrayB.put(89, "product");
            sparseArrayB.put(90, "productCard");
            sparseArrayB.put(91, "productCardConfig");
            sparseArrayB.put(92, "productConfig");
            sparseArrayB.put(93, "productData");
            sparseArrayB.put(94, "rewardsPointsBalance");
            sparseArrayB.put(95, "rewardsPointsBalanceData");
            sparseArrayB.put(96, "searchQueryHint");
            sparseArrayB.put(97, "section");
            sparseArrayB.put(98, "sectionTitle");
            sparseArrayB.put(99, "seller");
            sparseArrayB.put(100, "shouldHideToolbar");
            sparseArrayB.put(101, "shouldShowLoadingState");
            sparseArrayB.put(102, "shouldShowNewBadge");
            sparseArrayB.put(103, "shouldShowNotificationDot");
            sparseArrayB.put(104, "shouldShowWebArrow");
            sparseArrayB.put(105, "show");
            sparseArrayB.put(106, "showAddToListButton");
            sparseArrayB.put(107, "showBoostAnimation");
            sparseArrayB.put(108, "showError");
            sparseArrayB.put(109, "showNewDismissIcon");
            sparseArrayB.put(110, "showTigerDisplayExpiry");
            sparseArrayB.put(111, "showTigerOffersLabel");
            sparseArrayB.put(112, "singleLine");
            sparseArrayB.put(113, "state");
            sparseArrayB.put(114, "stateObj");
            sparseArrayB.put(115, "store");
            sparseArrayB.put(116, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(117, "title");
            sparseArrayB.put(118, "topLogo");
            sparseArrayB.put(119, "topTitle");
            sparseArrayB.put(120, "vModel");
            sparseArrayB.put(121, "viewListener");
            sparseArrayB.put(122, "viewModel");
            sparseArrayB.put(123, "viewState");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f21133a;

        static {
            HashMap map = new HashMap(97);
            f21133a = map;
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_add_payment_setup, map, "layout/activity_add_payment_setup_0", com.woolworths.R.layout.activity_available_store_list, "layout/activity_available_store_list_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_available_stores, map, "layout/activity_available_stores_0", com.woolworths.R.layout.activity_check_out_sng, "layout/activity_check_out_sng_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_contact_us, map, "layout/activity_contact_us_0", com.woolworths.R.layout.activity_exit_scan_code, "layout/activity_exit_scan_code_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_home, map, "layout/activity_home_0", com.woolworths.R.layout.activity_manual_add_item_process, "layout/activity_manual_add_item_process_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_message, map, "layout/activity_message_0", com.woolworths.R.layout.activity_my_account, "layout/activity_my_account_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_on_boarding, map, "layout/activity_on_boarding_0", com.woolworths.R.layout.activity_onboarding_add_card, "layout/activity_onboarding_add_card_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_parking_voucher, map, "layout/activity_parking_voucher_0", com.woolworths.R.layout.activity_product_info, "layout/activity_product_info_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_receipt, map, "layout/activity_receipt_0", com.woolworths.R.layout.activity_scanner, "layout/activity_scanner_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_search_sng, map, "layout/activity_search_sng_0", com.woolworths.R.layout.activity_setup_complete, "layout/activity_setup_complete_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_shopping_cart, map, "layout/activity_shopping_cart_0", com.woolworths.R.layout.activity_sng_landing_entry, "layout/activity_sng_landing_entry_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_sng_rewards_setup, map, "layout/activity_sng_rewards_setup_0", com.woolworths.R.layout.activity_tap_on, "layout/activity_tap_on_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_terms_conditions_sng, map, "layout/activity_terms_conditions_sng_0", com.woolworths.R.layout.activity_transaction_list, "layout/activity_transaction_list_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_update_credit_card, map, "layout/activity_update_credit_card_0", com.woolworths.R.layout.activity_use_metro_wifi, "layout/activity_use_metro_wifi_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_weighted_article_selection, map, "layout/activity_weighted_article_selection_0", com.woolworths.R.layout.content_weighted_article_selection, "layout/content_weighted_article_selection_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.custom_cart_view, map, "layout/custom_cart_view_0", com.woolworths.R.layout.custom_instrument_lists_view, "layout/custom_instrument_lists_view_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.custom_payment_instrument_view, map, "layout/custom_payment_instrument_view_0", com.woolworths.R.layout.custom_shopping_list_quick_view, "layout/custom_shopping_list_quick_view_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.custom_view_image_list, map, "layout/custom_view_image_list_0", com.woolworths.R.layout.dialog_item_quantity_picker, "layout/dialog_item_quantity_picker_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.dialog_scan_result_view, map, "layout/dialog_scan_result_view_0", com.woolworths.R.layout.epoxy_sng_view_landing_content, "layout/epoxy_sng_view_landing_content_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_sng_view_landing_logo, map, "layout/epoxy_sng_view_landing_logo_0", com.woolworths.R.layout.epoxy_sng_view_landing_title, "layout/epoxy_sng_view_landing_title_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_view_available_store_info, map, "layout/epoxy_view_available_store_info_0", com.woolworths.R.layout.fragment_home, "layout/fragment_home_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.fragment_instrument_list, map, "layout/fragment_instrument_list_0", com.woolworths.R.layout.fragment_message_single_action, "layout/fragment_message_single_action_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.fragment_post_scan_view, map, "layout/fragment_post_scan_view_0", com.woolworths.R.layout.fragment_shopping_cart, "layout/fragment_shopping_cart_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.fragment_stepup_dialog, map, "layout/fragment_stepup_dialog_0", com.woolworths.R.layout.fragment_tap_on, "layout/fragment_tap_on_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.fragment_tender_pay, map, "layout/fragment_tender_pay_0", com.woolworths.R.layout.include_no_sng_store, "layout/include_no_sng_store_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.include_sng_generic_error_state, map, "layout/include_sng_generic_error_state_0", com.woolworths.R.layout.include_sng_network_error, "layout/include_sng_network_error_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.item_onboarding, map, "layout/item_onboarding_0", com.woolworths.R.layout.item_onboarding_refresh, "layout/item_onboarding_refresh_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.item_search_result_sng, map, "layout/item_search_result_sng_0", com.woolworths.R.layout.layout_dark_toolbar, "layout/layout_dark_toolbar_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.layout_dark_toolbar_progress, map, "layout/layout_dark_toolbar_progress_0", com.woolworths.R.layout.layout_instrument_list, "layout/layout_instrument_list_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.layout_navigation_drawer, map, "layout/layout_navigation_drawer_0", com.woolworths.R.layout.layout_toolbar, "layout/layout_toolbar_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.layout_wow_toolbar, map, "layout/layout_wow_toolbar_0", com.woolworths.R.layout.network_state_item, "layout/network_state_item_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.post_scan_view_intervention_item, map, "layout/post_scan_view_intervention_item_0", com.woolworths.R.layout.post_scan_view_simple_item, "layout/post_scan_view_simple_item_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.post_scan_view_unknown_item, map, "layout/post_scan_view_unknown_item_0", com.woolworths.R.layout.post_scan_view_weight_required_item, "layout/post_scan_view_weight_required_item_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.post_scan_view_weighted_item, map, "layout/post_scan_view_weighted_item_0", com.woolworths.R.layout.receipt_dashed_divider, "layout/receipt_dashed_divider_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.receipt_datetime, map, "layout/receipt_datetime_0", com.woolworths.R.layout.receipt_discount, "layout/receipt_discount_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.receipt_general_voucher, map, "layout/receipt_general_voucher_0", com.woolworths.R.layout.receipt_item, "layout/receipt_item_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.receipt_item_promotion, map, "layout/receipt_item_promotion_0", com.woolworths.R.layout.receipt_parking_voucher, "layout/receipt_parking_voucher_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.receipt_posbarcode, map, "layout/receipt_posbarcode_0", com.woolworths.R.layout.receipt_title, "layout/receipt_title_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.receipt_total_discount, map, "layout/receipt_total_discount_0", com.woolworths.R.layout.receipt_total_payment, "layout/receipt_total_payment_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.receipt_total_savings, map, "layout/receipt_total_savings_0", com.woolworths.R.layout.shelf_label_scan_block_bottom_sheet, "layout/shelf_label_scan_block_bottom_sheet_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.view_accepted_creditcards, map, "layout/view_accepted_creditcards_0", com.woolworths.R.layout.view_add_creditcard, "layout/view_add_creditcard_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.view_addcard_error, map, "layout/view_addcard_error_0", com.woolworths.R.layout.view_available_store_item, "layout/view_available_store_item_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.view_cart_intervention_required_item, map, "layout/view_cart_intervention_required_item_0", com.woolworths.R.layout.view_cart_proudct_image, "layout/view_cart_proudct_image_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.view_cart_simple_item, map, "layout/view_cart_simple_item_0", com.woolworths.R.layout.view_cart_unknown_item, "layout/view_cart_unknown_item_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.view_cart_weight_required_item, map, "layout/view_cart_weight_required_item_0", com.woolworths.R.layout.view_checked_shopping_item_row, "layout/view_checked_shopping_item_row_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.view_dot_indicator, map, "layout/view_dot_indicator_0", com.woolworths.R.layout.view_header_drawer, "layout/view_header_drawer_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.view_intervention_product_info, map, "layout/view_intervention_product_info_0", com.woolworths.R.layout.view_payment_error, "layout/view_payment_error_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.view_simple_product_info, map, "layout/view_simple_product_info_0", com.woolworths.R.layout.view_state_item, "layout/view_state_item_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.view_update_creditcard, map, "layout/view_update_creditcard_0", com.woolworths.R.layout.view_weight_required_product_info, "layout/view_weight_required_product_info_0");
            map.put("layout/view_weighted_item_product_info_0", Integer.valueOf(com.woolworths.R.layout.view_weighted_item_product_info));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(97);
        f21132a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.activity_add_payment_setup, 1);
        sparseIntArray.put(com.woolworths.R.layout.activity_available_store_list, 2);
        sparseIntArray.put(com.woolworths.R.layout.activity_available_stores, 3);
        sparseIntArray.put(com.woolworths.R.layout.activity_check_out_sng, 4);
        sparseIntArray.put(com.woolworths.R.layout.activity_contact_us, 5);
        sparseIntArray.put(com.woolworths.R.layout.activity_exit_scan_code, 6);
        sparseIntArray.put(com.woolworths.R.layout.activity_home, 7);
        sparseIntArray.put(com.woolworths.R.layout.activity_manual_add_item_process, 8);
        sparseIntArray.put(com.woolworths.R.layout.activity_message, 9);
        sparseIntArray.put(com.woolworths.R.layout.activity_my_account, 10);
        sparseIntArray.put(com.woolworths.R.layout.activity_on_boarding, 11);
        sparseIntArray.put(com.woolworths.R.layout.activity_onboarding_add_card, 12);
        sparseIntArray.put(com.woolworths.R.layout.activity_parking_voucher, 13);
        sparseIntArray.put(com.woolworths.R.layout.activity_product_info, 14);
        sparseIntArray.put(com.woolworths.R.layout.activity_receipt, 15);
        sparseIntArray.put(com.woolworths.R.layout.activity_scanner, 16);
        sparseIntArray.put(com.woolworths.R.layout.activity_search_sng, 17);
        sparseIntArray.put(com.woolworths.R.layout.activity_setup_complete, 18);
        sparseIntArray.put(com.woolworths.R.layout.activity_shopping_cart, 19);
        sparseIntArray.put(com.woolworths.R.layout.activity_sng_landing_entry, 20);
        sparseIntArray.put(com.woolworths.R.layout.activity_sng_rewards_setup, 21);
        sparseIntArray.put(com.woolworths.R.layout.activity_tap_on, 22);
        sparseIntArray.put(com.woolworths.R.layout.activity_terms_conditions_sng, 23);
        sparseIntArray.put(com.woolworths.R.layout.activity_transaction_list, 24);
        sparseIntArray.put(com.woolworths.R.layout.activity_update_credit_card, 25);
        sparseIntArray.put(com.woolworths.R.layout.activity_use_metro_wifi, 26);
        sparseIntArray.put(com.woolworths.R.layout.activity_weighted_article_selection, 27);
        sparseIntArray.put(com.woolworths.R.layout.content_weighted_article_selection, 28);
        sparseIntArray.put(com.woolworths.R.layout.custom_cart_view, 29);
        sparseIntArray.put(com.woolworths.R.layout.custom_instrument_lists_view, 30);
        sparseIntArray.put(com.woolworths.R.layout.custom_payment_instrument_view, 31);
        sparseIntArray.put(com.woolworths.R.layout.custom_shopping_list_quick_view, 32);
        sparseIntArray.put(com.woolworths.R.layout.custom_view_image_list, 33);
        sparseIntArray.put(com.woolworths.R.layout.dialog_item_quantity_picker, 34);
        sparseIntArray.put(com.woolworths.R.layout.dialog_scan_result_view, 35);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_sng_view_landing_content, 36);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_sng_view_landing_logo, 37);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_sng_view_landing_title, 38);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_view_available_store_info, 39);
        sparseIntArray.put(com.woolworths.R.layout.fragment_home, 40);
        sparseIntArray.put(com.woolworths.R.layout.fragment_instrument_list, 41);
        sparseIntArray.put(com.woolworths.R.layout.fragment_message_single_action, 42);
        sparseIntArray.put(com.woolworths.R.layout.fragment_post_scan_view, 43);
        sparseIntArray.put(com.woolworths.R.layout.fragment_shopping_cart, 44);
        sparseIntArray.put(com.woolworths.R.layout.fragment_stepup_dialog, 45);
        sparseIntArray.put(com.woolworths.R.layout.fragment_tap_on, 46);
        sparseIntArray.put(com.woolworths.R.layout.fragment_tender_pay, 47);
        sparseIntArray.put(com.woolworths.R.layout.include_no_sng_store, 48);
        sparseIntArray.put(com.woolworths.R.layout.include_sng_generic_error_state, 49);
        sparseIntArray.put(com.woolworths.R.layout.include_sng_network_error, 50);
        sparseIntArray.put(com.woolworths.R.layout.item_onboarding, 51);
        sparseIntArray.put(com.woolworths.R.layout.item_onboarding_refresh, 52);
        sparseIntArray.put(com.woolworths.R.layout.item_search_result_sng, 53);
        sparseIntArray.put(com.woolworths.R.layout.layout_dark_toolbar, 54);
        sparseIntArray.put(com.woolworths.R.layout.layout_dark_toolbar_progress, 55);
        sparseIntArray.put(com.woolworths.R.layout.layout_instrument_list, 56);
        sparseIntArray.put(com.woolworths.R.layout.layout_navigation_drawer, 57);
        sparseIntArray.put(com.woolworths.R.layout.layout_toolbar, 58);
        sparseIntArray.put(com.woolworths.R.layout.layout_wow_toolbar, 59);
        sparseIntArray.put(com.woolworths.R.layout.network_state_item, 60);
        sparseIntArray.put(com.woolworths.R.layout.post_scan_view_intervention_item, 61);
        sparseIntArray.put(com.woolworths.R.layout.post_scan_view_simple_item, 62);
        sparseIntArray.put(com.woolworths.R.layout.post_scan_view_unknown_item, 63);
        sparseIntArray.put(com.woolworths.R.layout.post_scan_view_weight_required_item, 64);
        sparseIntArray.put(com.woolworths.R.layout.post_scan_view_weighted_item, 65);
        sparseIntArray.put(com.woolworths.R.layout.receipt_dashed_divider, 66);
        sparseIntArray.put(com.woolworths.R.layout.receipt_datetime, 67);
        sparseIntArray.put(com.woolworths.R.layout.receipt_discount, 68);
        sparseIntArray.put(com.woolworths.R.layout.receipt_general_voucher, 69);
        sparseIntArray.put(com.woolworths.R.layout.receipt_item, 70);
        sparseIntArray.put(com.woolworths.R.layout.receipt_item_promotion, 71);
        sparseIntArray.put(com.woolworths.R.layout.receipt_parking_voucher, 72);
        sparseIntArray.put(com.woolworths.R.layout.receipt_posbarcode, 73);
        sparseIntArray.put(com.woolworths.R.layout.receipt_title, 74);
        sparseIntArray.put(com.woolworths.R.layout.receipt_total_discount, 75);
        sparseIntArray.put(com.woolworths.R.layout.receipt_total_payment, 76);
        sparseIntArray.put(com.woolworths.R.layout.receipt_total_savings, 77);
        sparseIntArray.put(com.woolworths.R.layout.shelf_label_scan_block_bottom_sheet, 78);
        sparseIntArray.put(com.woolworths.R.layout.view_accepted_creditcards, 79);
        sparseIntArray.put(com.woolworths.R.layout.view_add_creditcard, 80);
        sparseIntArray.put(com.woolworths.R.layout.view_addcard_error, 81);
        sparseIntArray.put(com.woolworths.R.layout.view_available_store_item, 82);
        sparseIntArray.put(com.woolworths.R.layout.view_cart_intervention_required_item, 83);
        sparseIntArray.put(com.woolworths.R.layout.view_cart_proudct_image, 84);
        sparseIntArray.put(com.woolworths.R.layout.view_cart_simple_item, 85);
        sparseIntArray.put(com.woolworths.R.layout.view_cart_unknown_item, 86);
        sparseIntArray.put(com.woolworths.R.layout.view_cart_weight_required_item, 87);
        sparseIntArray.put(com.woolworths.R.layout.view_checked_shopping_item_row, 88);
        sparseIntArray.put(com.woolworths.R.layout.view_dot_indicator, 89);
        sparseIntArray.put(com.woolworths.R.layout.view_header_drawer, 90);
        sparseIntArray.put(com.woolworths.R.layout.view_intervention_product_info, 91);
        sparseIntArray.put(com.woolworths.R.layout.view_payment_error, 92);
        sparseIntArray.put(com.woolworths.R.layout.view_simple_product_info, 93);
        sparseIntArray.put(com.woolworths.R.layout.view_state_item, 94);
        sparseIntArray.put(com.woolworths.R.layout.view_update_creditcard, 95);
        sparseIntArray.put(com.woolworths.R.layout.view_weight_required_product_info, 96);
        sparseIntArray.put(com.woolworths.R.layout.view_weighted_item_product_info, 97);
    }

    public static ViewDataBinding e(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        switch (i) {
            case 1:
                if ("layout/activity_add_payment_setup_0".equals(obj)) {
                    return new ActivityAddPaymentSetupBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(b.m(obj, "The tag for activity_add_payment_setup is invalid. Received: "));
            case 2:
                if (!"layout/activity_available_store_list_0".equals(obj)) {
                    throw new IllegalArgumentException(b.m(obj, "The tag for activity_available_store_list is invalid. Received: "));
                }
                Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 7, ActivityAvailableStoreListBindingImpl.G, ActivityAvailableStoreListBindingImpl.H);
                ActivityAvailableStoreListBindingImpl activityAvailableStoreListBindingImpl = new ActivityAvailableStoreListBindingImpl(dataBindingComponent, view, (View) objArrT[6], (LayoutWowToolbarBinding) objArrT[2], (IncludeSngNetworkErrorBinding) objArrT[4], (IncludeNoSngStoreBinding) objArrT[3], (EpoxyRecyclerView) objArrT[1], (TabLayout) objArrT[5]);
                activityAvailableStoreListBindingImpl.F = -1L;
                LayoutWowToolbarBinding layoutWowToolbarBinding = activityAvailableStoreListBindingImpl.z;
                if (layoutWowToolbarBinding != null) {
                    layoutWowToolbarBinding.n = activityAvailableStoreListBindingImpl;
                }
                ((ConstraintLayout) objArrT[0]).setTag(null);
                IncludeSngNetworkErrorBinding includeSngNetworkErrorBinding = activityAvailableStoreListBindingImpl.A;
                if (includeSngNetworkErrorBinding != null) {
                    includeSngNetworkErrorBinding.n = activityAvailableStoreListBindingImpl;
                }
                IncludeNoSngStoreBinding includeNoSngStoreBinding = activityAvailableStoreListBindingImpl.B;
                if (includeNoSngStoreBinding != null) {
                    includeNoSngStoreBinding.n = activityAvailableStoreListBindingImpl;
                }
                activityAvailableStoreListBindingImpl.C.setTag(null);
                activityAvailableStoreListBindingImpl.E(view);
                activityAvailableStoreListBindingImpl.r();
                return activityAvailableStoreListBindingImpl;
            case 3:
                if (!"layout/activity_available_stores_0".equals(obj)) {
                    throw new IllegalArgumentException(b.m(obj, "The tag for activity_available_stores is invalid. Received: "));
                }
                Object[] objArrT2 = ViewDataBinding.t(dataBindingComponent, view, 6, ActivityAvailableStoresBindingImpl.G, ActivityAvailableStoresBindingImpl.H);
                ActivityAvailableStoresBindingImpl activityAvailableStoresBindingImpl = new ActivityAvailableStoresBindingImpl(dataBindingComponent, view, (RecyclerView) objArrT2[2], (RecyclerView) objArrT2[3], (ImageView) objArrT2[4], (LayoutDarkToolbarBinding) objArrT2[1], (ConstraintLayout) objArrT2[0], (TextView) objArrT2[5]);
                activityAvailableStoresBindingImpl.F = -1L;
                LayoutDarkToolbarBinding layoutDarkToolbarBinding = activityAvailableStoresBindingImpl.B;
                if (layoutDarkToolbarBinding != null) {
                    layoutDarkToolbarBinding.n = activityAvailableStoresBindingImpl;
                }
                activityAvailableStoresBindingImpl.C.setTag(null);
                activityAvailableStoresBindingImpl.E(view);
                activityAvailableStoresBindingImpl.r();
                return activityAvailableStoresBindingImpl;
            case 4:
                if (!"layout/activity_check_out_sng_0".equals(obj)) {
                    throw new IllegalArgumentException(b.m(obj, "The tag for activity_check_out_sng is invalid. Received: "));
                }
                Object[] objArrT3 = ViewDataBinding.t(dataBindingComponent, view, 2, null, ActivityCheckOutSngBindingImpl.B);
                ActivityCheckOutSngBindingImpl activityCheckOutSngBindingImpl = new ActivityCheckOutSngBindingImpl(dataBindingComponent, view, (LinearLayout) objArrT3[0], (FrameLayout) objArrT3[1]);
                activityCheckOutSngBindingImpl.A = -1L;
                activityCheckOutSngBindingImpl.y.setTag(null);
                activityCheckOutSngBindingImpl.E(view);
                activityCheckOutSngBindingImpl.r();
                return activityCheckOutSngBindingImpl;
            case 5:
                if (!"layout/activity_contact_us_0".equals(obj)) {
                    throw new IllegalArgumentException(b.m(obj, "The tag for activity_contact_us is invalid. Received: "));
                }
                Object[] objArrT4 = ViewDataBinding.t(dataBindingComponent, view, 4, ActivityContactUsBindingImpl.C, ActivityContactUsBindingImpl.D);
                ActivityContactUsBindingImpl activityContactUsBindingImpl = new ActivityContactUsBindingImpl(dataBindingComponent, view, (LayoutDarkToolbarBinding) objArrT4[1], (ProgressBar) objArrT4[3], (WebView) objArrT4[2]);
                activityContactUsBindingImpl.B = -1L;
                LayoutDarkToolbarBinding layoutDarkToolbarBinding2 = activityContactUsBindingImpl.y;
                if (layoutDarkToolbarBinding2 != null) {
                    layoutDarkToolbarBinding2.n = activityContactUsBindingImpl;
                }
                ((ConstraintLayout) objArrT4[0]).setTag(null);
                activityContactUsBindingImpl.E(view);
                activityContactUsBindingImpl.r();
                return activityContactUsBindingImpl;
            case 6:
                if ("layout/activity_exit_scan_code_0".equals(obj)) {
                    return new ActivityExitScanCodeBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(b.m(obj, "The tag for activity_exit_scan_code is invalid. Received: "));
            case 7:
                if (!"layout/activity_home_0".equals(obj)) {
                    throw new IllegalArgumentException(b.m(obj, "The tag for activity_home is invalid. Received: "));
                }
                Object[] objArrT5 = ViewDataBinding.t(dataBindingComponent, view, 6, ActivityHomeBindingImpl.F, ActivityHomeBindingImpl.G);
                ActivityHomeBindingImpl activityHomeBindingImpl = new ActivityHomeBindingImpl(dataBindingComponent, view, (FrameLayout) objArrT5[5], (LayoutNavigationDrawerBinding) objArrT5[4], (LayoutToolbarBinding) objArrT5[3], (RelativeLayout) objArrT5[1], (DrawerLayout) objArrT5[0], (View) objArrT5[2]);
                activityHomeBindingImpl.E = -1L;
                LayoutNavigationDrawerBinding layoutNavigationDrawerBinding = activityHomeBindingImpl.z;
                if (layoutNavigationDrawerBinding != null) {
                    layoutNavigationDrawerBinding.n = activityHomeBindingImpl;
                }
                LayoutToolbarBinding layoutToolbarBinding = activityHomeBindingImpl.A;
                if (layoutToolbarBinding != null) {
                    layoutToolbarBinding.n = activityHomeBindingImpl;
                }
                activityHomeBindingImpl.B.setTag(null);
                activityHomeBindingImpl.C.setTag(null);
                activityHomeBindingImpl.E(view);
                activityHomeBindingImpl.r();
                return activityHomeBindingImpl;
            case 8:
                if ("layout/activity_manual_add_item_process_0".equals(obj)) {
                    return new ActivityManualAddItemProcessBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(b.m(obj, "The tag for activity_manual_add_item_process is invalid. Received: "));
            case 9:
                if (!"layout/activity_message_0".equals(obj)) {
                    throw new IllegalArgumentException(b.m(obj, "The tag for activity_message is invalid. Received: "));
                }
                Object[] objArrT6 = ViewDataBinding.t(dataBindingComponent, view, 3, ActivityMessageBindingImpl.B, ActivityMessageBindingImpl.C);
                ActivityMessageBindingImpl activityMessageBindingImpl = new ActivityMessageBindingImpl(dataBindingComponent, view, (FrameLayout) objArrT6[2], (LayoutWowToolbarBinding) objArrT6[1]);
                activityMessageBindingImpl.A = -1L;
                LayoutWowToolbarBinding layoutWowToolbarBinding2 = activityMessageBindingImpl.z;
                if (layoutWowToolbarBinding2 != null) {
                    layoutWowToolbarBinding2.n = activityMessageBindingImpl;
                }
                ((RelativeLayout) objArrT6[0]).setTag(null);
                activityMessageBindingImpl.E(view);
                activityMessageBindingImpl.r();
                return activityMessageBindingImpl;
            case 10:
                if (!"layout/activity_my_account_0".equals(obj)) {
                    throw new IllegalArgumentException(b.m(obj, "The tag for activity_my_account is invalid. Received: "));
                }
                Object[] objArrT7 = ViewDataBinding.t(dataBindingComponent, view, 15, ActivityMyAccountBindingImpl.I, ActivityMyAccountBindingImpl.J);
                LayoutDarkToolbarBinding layoutDarkToolbarBinding3 = (LayoutDarkToolbarBinding) objArrT7[2];
                TextView textView = (TextView) objArrT7[10];
                TextView textView2 = (TextView) objArrT7[11];
                FrameLayout frameLayout = (FrameLayout) objArrT7[14];
                ActivityMyAccountBindingImpl activityMyAccountBindingImpl = new ActivityMyAccountBindingImpl(dataBindingComponent, view, layoutDarkToolbarBinding3, textView, textView2, frameLayout, (View) objArrT7[6], (TextView) objArrT7[13], (TextView) objArrT7[5], (TextView) objArrT7[4], (TextView) objArrT7[9]);
                activityMyAccountBindingImpl.H = -1L;
                LayoutDarkToolbarBinding layoutDarkToolbarBinding4 = activityMyAccountBindingImpl.y;
                if (layoutDarkToolbarBinding4 != null) {
                    layoutDarkToolbarBinding4.n = activityMyAccountBindingImpl;
                }
                ((LinearLayout) objArrT7[0]).setTag(null);
                ((ConstraintLayout) objArrT7[1]).setTag(null);
                activityMyAccountBindingImpl.E(view);
                activityMyAccountBindingImpl.r();
                return activityMyAccountBindingImpl;
            case 11:
                if (!"layout/activity_on_boarding_0".equals(obj)) {
                    throw new IllegalArgumentException(b.m(obj, "The tag for activity_on_boarding is invalid. Received: "));
                }
                Object[] objArrT8 = ViewDataBinding.t(dataBindingComponent, view, 4, null, ActivityOnBoardingBindingImpl.D);
                ActivityOnBoardingBindingImpl activityOnBoardingBindingImpl = new ActivityOnBoardingBindingImpl(dataBindingComponent, view, (ImageView) objArrT8[3], (DotIndicatorView) objArrT8[2], (ConstraintLayout) objArrT8[0], (ViewPager2) objArrT8[1]);
                activityOnBoardingBindingImpl.C = -1L;
                activityOnBoardingBindingImpl.A.setTag(null);
                activityOnBoardingBindingImpl.E(view);
                activityOnBoardingBindingImpl.r();
                return activityOnBoardingBindingImpl;
            case 12:
                if (!"layout/activity_onboarding_add_card_0".equals(obj)) {
                    throw new IllegalArgumentException(b.m(obj, "The tag for activity_onboarding_add_card is invalid. Received: "));
                }
                Object[] objArrT9 = ViewDataBinding.t(dataBindingComponent, view, 10, ActivityOnboardingAddCardBindingImpl.E, ActivityOnboardingAddCardBindingImpl.F);
                AddCreditCardView addCreditCardView = (AddCreditCardView) objArrT9[9];
                TextView textView3 = (TextView) objArrT9[8];
                RelativeLayout relativeLayout = (RelativeLayout) objArrT9[4];
                ViewAddcardErrorBinding viewAddcardErrorBinding = (ViewAddcardErrorBinding) objArrT9[3];
                LayoutDarkToolbarBinding layoutDarkToolbarBinding5 = (LayoutDarkToolbarBinding) objArrT9[2];
                ActivityOnboardingAddCardBindingImpl activityOnboardingAddCardBindingImpl = new ActivityOnboardingAddCardBindingImpl(dataBindingComponent, view, addCreditCardView, textView3, relativeLayout, viewAddcardErrorBinding, layoutDarkToolbarBinding5);
                activityOnboardingAddCardBindingImpl.D = -1L;
                ((LinearLayout) objArrT9[0]).setTag(null);
                ((LinearLayout) objArrT9[1]).setTag(null);
                ViewAddcardErrorBinding viewAddcardErrorBinding2 = activityOnboardingAddCardBindingImpl.B;
                if (viewAddcardErrorBinding2 != null) {
                    viewAddcardErrorBinding2.n = activityOnboardingAddCardBindingImpl;
                }
                LayoutDarkToolbarBinding layoutDarkToolbarBinding6 = activityOnboardingAddCardBindingImpl.C;
                if (layoutDarkToolbarBinding6 != null) {
                    layoutDarkToolbarBinding6.n = activityOnboardingAddCardBindingImpl;
                }
                activityOnboardingAddCardBindingImpl.E(view);
                activityOnboardingAddCardBindingImpl.r();
                return activityOnboardingAddCardBindingImpl;
            case 13:
                if (!"layout/activity_parking_voucher_0".equals(obj)) {
                    throw new IllegalArgumentException(b.m(obj, "The tag for activity_parking_voucher is invalid. Received: "));
                }
                Object[] objArrT10 = ViewDataBinding.t(dataBindingComponent, view, 9, null, ActivityParkingVoucherBindingImpl.D);
                Button button = (Button) objArrT10[4];
                BarcodeView barcodeView = (BarcodeView) objArrT10[2];
                ConstraintLayout constraintLayout = (ConstraintLayout) objArrT10[0];
                ActivityParkingVoucherBindingImpl activityParkingVoucherBindingImpl = new ActivityParkingVoucherBindingImpl(dataBindingComponent, view, button, barcodeView, constraintLayout, (TextView) objArrT10[3]);
                activityParkingVoucherBindingImpl.C = -1L;
                activityParkingVoucherBindingImpl.A.setTag(null);
                activityParkingVoucherBindingImpl.E(view);
                activityParkingVoucherBindingImpl.r();
                return activityParkingVoucherBindingImpl;
            case 14:
                if (!"layout/activity_product_info_0".equals(obj)) {
                    throw new IllegalArgumentException(b.m(obj, "The tag for activity_product_info is invalid. Received: "));
                }
                Object[] objArrT11 = ViewDataBinding.t(dataBindingComponent, view, 5, ActivityProductInfoBindingImpl.D, ActivityProductInfoBindingImpl.E);
                ActivityProductInfoBindingImpl activityProductInfoBindingImpl = new ActivityProductInfoBindingImpl(dataBindingComponent, view, (Button) objArrT11[4], (CoordinatorLayout) objArrT11[0], (FrameLayout) objArrT11[3], (LayoutDarkToolbarBinding) objArrT11[2]);
                activityProductInfoBindingImpl.C = -1L;
                activityProductInfoBindingImpl.z.setTag(null);
                LayoutDarkToolbarBinding layoutDarkToolbarBinding7 = activityProductInfoBindingImpl.B;
                if (layoutDarkToolbarBinding7 != null) {
                    layoutDarkToolbarBinding7.n = activityProductInfoBindingImpl;
                }
                ((LinearLayout) objArrT11[1]).setTag(null);
                activityProductInfoBindingImpl.E(view);
                activityProductInfoBindingImpl.r();
                return activityProductInfoBindingImpl;
            case 15:
                if (!"layout/activity_receipt_0".equals(obj)) {
                    throw new IllegalArgumentException(b.m(obj, "The tag for activity_receipt is invalid. Received: "));
                }
                Object[] objArrT12 = ViewDataBinding.t(dataBindingComponent, view, 4, ActivityReceiptBindingImpl.C, ActivityReceiptBindingImpl.D);
                ActivityReceiptBindingImpl activityReceiptBindingImpl = new ActivityReceiptBindingImpl(dataBindingComponent, view, (Button) objArrT12[3], (RecyclerView) objArrT12[2], (LayoutDarkToolbarBinding) objArrT12[1]);
                activityReceiptBindingImpl.B = -1L;
                ((ConstraintLayout) objArrT12[0]).setTag(null);
                LayoutDarkToolbarBinding layoutDarkToolbarBinding8 = activityReceiptBindingImpl.A;
                if (layoutDarkToolbarBinding8 != null) {
                    layoutDarkToolbarBinding8.n = activityReceiptBindingImpl;
                }
                activityReceiptBindingImpl.E(view);
                activityReceiptBindingImpl.r();
                return activityReceiptBindingImpl;
            case 16:
                if (!"layout/activity_scanner_0".equals(obj)) {
                    throw new IllegalArgumentException(b.m(obj, "The tag for activity_scanner is invalid. Received: "));
                }
                Object[] objArrT13 = ViewDataBinding.t(dataBindingComponent, view, 12, null, ActivityScannerBindingImpl.J);
                OverlayWithHoleImageView overlayWithHoleImageView = (OverlayWithHoleImageView) objArrT13[1];
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArrT13[2];
                ImageView imageView = (ImageView) objArrT13[3];
                ProgressBar progressBar = (ProgressBar) objArrT13[4];
                View view2 = (View) objArrT13[10];
                ActivityScannerBindingImpl activityScannerBindingImpl = new ActivityScannerBindingImpl(dataBindingComponent, view, overlayWithHoleImageView, coordinatorLayout, imageView, progressBar, view2, (RelativeLayout) objArrT13[0], (Toolbar) objArrT13[7], (TextView) objArrT13[8], (WeightedListView) objArrT13[9]);
                activityScannerBindingImpl.I = -1L;
                activityScannerBindingImpl.D.setTag(null);
                activityScannerBindingImpl.E(view);
                activityScannerBindingImpl.r();
                return activityScannerBindingImpl;
            case 17:
                if (!"layout/activity_search_sng_0".equals(obj)) {
                    throw new IllegalArgumentException(b.m(obj, "The tag for activity_search_sng is invalid. Received: "));
                }
                Object[] objArrT14 = ViewDataBinding.t(dataBindingComponent, view, 9, null, ActivitySearchSngBindingImpl.H);
                ImageView imageView2 = (ImageView) objArrT14[3];
                ImageView imageView3 = (ImageView) objArrT14[7];
                ActivitySearchSngBindingImpl activitySearchSngBindingImpl = new ActivitySearchSngBindingImpl(dataBindingComponent, view, imageView2, imageView3, (TextView) objArrT14[8], (ConstraintLayout) objArrT14[0], (ProductSearchView) objArrT14[5], (RecyclerView) objArrT14[6], (Toolbar) objArrT14[2], (TextView) objArrT14[4]);
                activitySearchSngBindingImpl.G = -1L;
                activitySearchSngBindingImpl.B.setTag(null);
                activitySearchSngBindingImpl.E(view);
                activitySearchSngBindingImpl.r();
                return activitySearchSngBindingImpl;
            case 18:
                if ("layout/activity_setup_complete_0".equals(obj)) {
                    return new ActivitySetupCompleteBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(b.m(obj, "The tag for activity_setup_complete is invalid. Received: "));
            case 19:
                if (!"layout/activity_shopping_cart_0".equals(obj)) {
                    throw new IllegalArgumentException(b.m(obj, "The tag for activity_shopping_cart is invalid. Received: "));
                }
                Object[] objArrT15 = ViewDataBinding.t(dataBindingComponent, view, 5, ActivityShoppingCartBindingImpl.E, ActivityShoppingCartBindingImpl.F);
                ActivityShoppingCartBindingImpl activityShoppingCartBindingImpl = new ActivityShoppingCartBindingImpl(dataBindingComponent, view, (FrameLayout) objArrT15[4], (LayoutNavigationDrawerBinding) objArrT15[3], (LayoutDarkToolbarBinding) objArrT15[2], (RelativeLayout) objArrT15[1], (DrawerLayout) objArrT15[0]);
                activityShoppingCartBindingImpl.D = -1L;
                LayoutNavigationDrawerBinding layoutNavigationDrawerBinding2 = activityShoppingCartBindingImpl.z;
                if (layoutNavigationDrawerBinding2 != null) {
                    layoutNavigationDrawerBinding2.n = activityShoppingCartBindingImpl;
                }
                LayoutDarkToolbarBinding layoutDarkToolbarBinding9 = activityShoppingCartBindingImpl.A;
                if (layoutDarkToolbarBinding9 != null) {
                    layoutDarkToolbarBinding9.n = activityShoppingCartBindingImpl;
                }
                activityShoppingCartBindingImpl.B.setTag(null);
                activityShoppingCartBindingImpl.C.setTag(null);
                activityShoppingCartBindingImpl.E(view);
                activityShoppingCartBindingImpl.r();
                return activityShoppingCartBindingImpl;
            case 20:
                if ("layout/activity_sng_landing_entry_0".equals(obj)) {
                    return new ActivitySngLandingEntryBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(b.m(obj, "The tag for activity_sng_landing_entry is invalid. Received: "));
            case 21:
                if ("layout/activity_sng_rewards_setup_0".equals(obj)) {
                    return new ActivitySngRewardsSetupBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(b.m(obj, "The tag for activity_sng_rewards_setup is invalid. Received: "));
            case 22:
                if (!"layout/activity_tap_on_0".equals(obj)) {
                    throw new IllegalArgumentException(b.m(obj, "The tag for activity_tap_on is invalid. Received: "));
                }
                Object[] objArrT16 = ViewDataBinding.t(dataBindingComponent, view, 7, ActivityTapOnBindingImpl.G, ActivityTapOnBindingImpl.H);
                ActivityTapOnBindingImpl activityTapOnBindingImpl = new ActivityTapOnBindingImpl(dataBindingComponent, view, (FrameLayout) objArrT16[6], (View) objArrT16[2], (LayoutNavigationDrawerBinding) objArrT16[3], (FrameLayout) objArrT16[1], (DrawerLayout) objArrT16[0], (Toolbar) objArrT16[4], (TextView) objArrT16[5]);
                activityTapOnBindingImpl.F = -1L;
                LayoutNavigationDrawerBinding layoutNavigationDrawerBinding3 = activityTapOnBindingImpl.A;
                if (layoutNavigationDrawerBinding3 != null) {
                    layoutNavigationDrawerBinding3.n = activityTapOnBindingImpl;
                }
                activityTapOnBindingImpl.B.setTag(null);
                activityTapOnBindingImpl.C.setTag(null);
                activityTapOnBindingImpl.E(view);
                activityTapOnBindingImpl.r();
                return activityTapOnBindingImpl;
            case 23:
                if (!"layout/activity_terms_conditions_sng_0".equals(obj)) {
                    throw new IllegalArgumentException(b.m(obj, "The tag for activity_terms_conditions_sng is invalid. Received: "));
                }
                Object[] objArrT17 = ViewDataBinding.t(dataBindingComponent, view, 9, ActivityTermsConditionsSngBindingImpl.F, ActivityTermsConditionsSngBindingImpl.G);
                Button button2 = (Button) objArrT17[7];
                CheckBox checkBox = (CheckBox) objArrT17[5];
                CheckBox checkBox2 = (CheckBox) objArrT17[3];
                LayoutDarkToolbarBinding layoutDarkToolbarBinding10 = (LayoutDarkToolbarBinding) objArrT17[1];
                TextView textView4 = (TextView) objArrT17[6];
                ActivityTermsConditionsSngBindingImpl activityTermsConditionsSngBindingImpl = new ActivityTermsConditionsSngBindingImpl(dataBindingComponent, view, button2, checkBox, checkBox2, layoutDarkToolbarBinding10, textView4, (WebView) objArrT17[8]);
                activityTermsConditionsSngBindingImpl.E = -1L;
                LayoutDarkToolbarBinding layoutDarkToolbarBinding11 = activityTermsConditionsSngBindingImpl.B;
                if (layoutDarkToolbarBinding11 != null) {
                    layoutDarkToolbarBinding11.n = activityTermsConditionsSngBindingImpl;
                }
                ((RelativeLayout) objArrT17[0]).setTag(null);
                activityTermsConditionsSngBindingImpl.E(view);
                activityTermsConditionsSngBindingImpl.r();
                return activityTermsConditionsSngBindingImpl;
            case 24:
                if (!"layout/activity_transaction_list_0".equals(obj)) {
                    throw new IllegalArgumentException(b.m(obj, "The tag for activity_transaction_list is invalid. Received: "));
                }
                Object[] objArrT18 = ViewDataBinding.t(dataBindingComponent, view, 6, ActivityTransactionListBindingImpl.C, ActivityTransactionListBindingImpl.D);
                ActivityTransactionListBindingImpl activityTransactionListBindingImpl = new ActivityTransactionListBindingImpl(dataBindingComponent, view, (RelativeLayout) objArrT18[3], (LayoutDarkToolbarBinding) objArrT18[1], (RecyclerView) objArrT18[2]);
                activityTransactionListBindingImpl.B = -1L;
                LayoutDarkToolbarBinding layoutDarkToolbarBinding12 = activityTransactionListBindingImpl.z;
                if (layoutDarkToolbarBinding12 != null) {
                    layoutDarkToolbarBinding12.n = activityTransactionListBindingImpl;
                }
                ((ConstraintLayout) objArrT18[0]).setTag(null);
                activityTransactionListBindingImpl.E(view);
                activityTransactionListBindingImpl.r();
                return activityTransactionListBindingImpl;
            case 25:
                if (!"layout/activity_update_credit_card_0".equals(obj)) {
                    throw new IllegalArgumentException(b.m(obj, "The tag for activity_update_credit_card is invalid. Received: "));
                }
                Object[] objArrT19 = ViewDataBinding.t(dataBindingComponent, view, 12, ActivityUpdateCreditCardBindingImpl.J, ActivityUpdateCreditCardBindingImpl.K);
                View view3 = (View) objArrT19[10];
                ImageView imageView4 = (ImageView) objArrT19[9];
                LinearLayout linearLayout = (LinearLayout) objArrT19[0];
                ScrollView scrollView = (ScrollView) objArrT19[6];
                ViewAddcardErrorBinding viewAddcardErrorBinding3 = (ViewAddcardErrorBinding) objArrT19[5];
                ActivityUpdateCreditCardBindingImpl activityUpdateCreditCardBindingImpl = new ActivityUpdateCreditCardBindingImpl(dataBindingComponent, view, view3, imageView4, linearLayout, scrollView, viewAddcardErrorBinding3, (LayoutDarkToolbarBinding) objArrT19[4], (TextView) objArrT19[3], (TextView) objArrT19[2], (UpdateCreditCardExpirationView) objArrT19[11]);
                activityUpdateCreditCardBindingImpl.I = -1L;
                ((LinearLayout) objArrT19[1]).setTag(null);
                activityUpdateCreditCardBindingImpl.A.setTag(null);
                ViewAddcardErrorBinding viewAddcardErrorBinding4 = activityUpdateCreditCardBindingImpl.C;
                if (viewAddcardErrorBinding4 != null) {
                    viewAddcardErrorBinding4.n = activityUpdateCreditCardBindingImpl;
                }
                LayoutDarkToolbarBinding layoutDarkToolbarBinding13 = activityUpdateCreditCardBindingImpl.D;
                if (layoutDarkToolbarBinding13 != null) {
                    layoutDarkToolbarBinding13.n = activityUpdateCreditCardBindingImpl;
                }
                activityUpdateCreditCardBindingImpl.E.setTag(null);
                activityUpdateCreditCardBindingImpl.F.setTag(null);
                activityUpdateCreditCardBindingImpl.E(view);
                activityUpdateCreditCardBindingImpl.r();
                return activityUpdateCreditCardBindingImpl;
            case 26:
                if (!"layout/activity_use_metro_wifi_0".equals(obj)) {
                    throw new IllegalArgumentException(b.m(obj, "The tag for activity_use_metro_wifi is invalid. Received: "));
                }
                Object[] objArrT20 = ViewDataBinding.t(dataBindingComponent, view, 7, ActivityUseMetroWifiBindingImpl.D, ActivityUseMetroWifiBindingImpl.E);
                LayoutDarkToolbarBinding layoutDarkToolbarBinding14 = (LayoutDarkToolbarBinding) objArrT20[1];
                Button button3 = (Button) objArrT20[5];
                Button button4 = (Button) objArrT20[6];
                ActivityUseMetroWifiBindingImpl activityUseMetroWifiBindingImpl = new ActivityUseMetroWifiBindingImpl(dataBindingComponent, view, layoutDarkToolbarBinding14, button3, button4, (TextView) objArrT20[4]);
                activityUseMetroWifiBindingImpl.C = -1L;
                LayoutDarkToolbarBinding layoutDarkToolbarBinding15 = activityUseMetroWifiBindingImpl.y;
                if (layoutDarkToolbarBinding15 != null) {
                    layoutDarkToolbarBinding15.n = activityUseMetroWifiBindingImpl;
                }
                ((ConstraintLayout) objArrT20[0]).setTag(null);
                activityUseMetroWifiBindingImpl.E(view);
                activityUseMetroWifiBindingImpl.r();
                return activityUseMetroWifiBindingImpl;
            case 27:
                if (!"layout/activity_weighted_article_selection_0".equals(obj)) {
                    throw new IllegalArgumentException(b.m(obj, "The tag for activity_weighted_article_selection is invalid. Received: "));
                }
                Object[] objArrT21 = ViewDataBinding.t(dataBindingComponent, view, 3, ActivityWeightedArticleSelectionBindingImpl.B, null);
                ActivityWeightedArticleSelectionBindingImpl activityWeightedArticleSelectionBindingImpl = new ActivityWeightedArticleSelectionBindingImpl(dataBindingComponent, view, (ContentWeightedArticleSelectionBinding) objArrT21[2], (LayoutDarkToolbarBinding) objArrT21[1]);
                activityWeightedArticleSelectionBindingImpl.A = -1L;
                ContentWeightedArticleSelectionBinding contentWeightedArticleSelectionBinding = activityWeightedArticleSelectionBindingImpl.y;
                if (contentWeightedArticleSelectionBinding != null) {
                    contentWeightedArticleSelectionBinding.n = activityWeightedArticleSelectionBindingImpl;
                }
                LayoutDarkToolbarBinding layoutDarkToolbarBinding16 = activityWeightedArticleSelectionBindingImpl.z;
                if (layoutDarkToolbarBinding16 != null) {
                    layoutDarkToolbarBinding16.n = activityWeightedArticleSelectionBindingImpl;
                }
                ((CoordinatorLayout) objArrT21[0]).setTag(null);
                activityWeightedArticleSelectionBindingImpl.E(view);
                activityWeightedArticleSelectionBindingImpl.r();
                return activityWeightedArticleSelectionBindingImpl;
            case 28:
                if (!"layout/content_weighted_article_selection_0".equals(obj)) {
                    throw new IllegalArgumentException(b.m(obj, "The tag for content_weighted_article_selection is invalid. Received: "));
                }
                Object[] objArrT22 = ViewDataBinding.t(dataBindingComponent, view, 8, null, ContentWeightedArticleSelectionBindingImpl.E);
                Button button5 = (Button) objArrT22[7];
                ContentWeightedArticleSelectionBindingImpl contentWeightedArticleSelectionBindingImpl = new ContentWeightedArticleSelectionBindingImpl(dataBindingComponent, view, button5, (LinearLayout) objArrT22[3], (RecyclerView) objArrT22[2], (CoordinatorLayout) objArrT22[0], (TextView) objArrT22[1]);
                contentWeightedArticleSelectionBindingImpl.D = -1L;
                contentWeightedArticleSelectionBindingImpl.B.setTag(null);
                contentWeightedArticleSelectionBindingImpl.E(view);
                contentWeightedArticleSelectionBindingImpl.r();
                return contentWeightedArticleSelectionBindingImpl;
            case 29:
                if (!"layout/custom_cart_view_0".equals(obj)) {
                    throw new IllegalArgumentException(b.m(obj, "The tag for custom_cart_view is invalid. Received: "));
                }
                Object[] objArrT23 = ViewDataBinding.t(dataBindingComponent, view, 3, null, CustomCartViewBindingImpl.B);
                CustomCartViewBindingImpl customCartViewBindingImpl = new CustomCartViewBindingImpl(dataBindingComponent, view, (TextView) objArrT23[2]);
                customCartViewBindingImpl.A = -1L;
                ((RelativeLayout) objArrT23[0]).setTag(null);
                customCartViewBindingImpl.E(view);
                customCartViewBindingImpl.r();
                return customCartViewBindingImpl;
            case 30:
                if (!"layout/custom_instrument_lists_view_0".equals(obj)) {
                    throw new IllegalArgumentException(b.m(obj, "The tag for custom_instrument_lists_view is invalid. Received: "));
                }
                Object[] objArrT24 = ViewDataBinding.t(dataBindingComponent, view, 2, null, CustomInstrumentListsViewBindingImpl.B);
                CustomInstrumentListsViewBindingImpl customInstrumentListsViewBindingImpl = new CustomInstrumentListsViewBindingImpl(dataBindingComponent, view, (RecyclerView) objArrT24[1]);
                customInstrumentListsViewBindingImpl.A = -1L;
                ((ConstraintLayout) objArrT24[0]).setTag(null);
                customInstrumentListsViewBindingImpl.E(view);
                customInstrumentListsViewBindingImpl.r();
                return customInstrumentListsViewBindingImpl;
            case 31:
                if (!"layout/custom_payment_instrument_view_0".equals(obj)) {
                    throw new IllegalArgumentException(b.m(obj, "The tag for custom_payment_instrument_view is invalid. Received: "));
                }
                Object[] objArrT25 = ViewDataBinding.t(dataBindingComponent, view, 7, null, CustomPaymentInstrumentViewBindingImpl.G);
                CustomPaymentInstrumentViewBindingImpl customPaymentInstrumentViewBindingImpl = new CustomPaymentInstrumentViewBindingImpl(dataBindingComponent, view, (TextView) objArrT25[3], (ImageView) objArrT25[4], (ImageView) objArrT25[1], (TextView) objArrT25[2], (ImageView) objArrT25[5], (RadioButton) objArrT25[6]);
                customPaymentInstrumentViewBindingImpl.F = -1L;
                ((RelativeLayout) objArrT25[0]).setTag(null);
                customPaymentInstrumentViewBindingImpl.E(view);
                customPaymentInstrumentViewBindingImpl.r();
                return customPaymentInstrumentViewBindingImpl;
            case 32:
                if (!"layout/custom_shopping_list_quick_view_0".equals(obj)) {
                    throw new IllegalArgumentException(b.m(obj, "The tag for custom_shopping_list_quick_view is invalid. Received: "));
                }
                Object[] objArrT26 = ViewDataBinding.t(dataBindingComponent, view, 3, null, CustomShoppingListQuickViewBindingImpl.A);
                ConstraintLayout constraintLayout2 = (ConstraintLayout) objArrT26[0];
                CustomShoppingListQuickViewBindingImpl customShoppingListQuickViewBindingImpl = new CustomShoppingListQuickViewBindingImpl(dataBindingComponent, view, constraintLayout2);
                customShoppingListQuickViewBindingImpl.z = -1L;
                customShoppingListQuickViewBindingImpl.y.setTag(null);
                customShoppingListQuickViewBindingImpl.E(view);
                customShoppingListQuickViewBindingImpl.r();
                return customShoppingListQuickViewBindingImpl;
            case 33:
                if (!"layout/custom_view_image_list_0".equals(obj)) {
                    throw new IllegalArgumentException(b.m(obj, "The tag for custom_view_image_list is invalid. Received: "));
                }
                Object[] objArrT27 = ViewDataBinding.t(dataBindingComponent, view, 3, null, CustomViewImageListBindingImpl.C);
                CustomViewImageListBindingImpl customViewImageListBindingImpl = new CustomViewImageListBindingImpl(dataBindingComponent, view, (RecyclerView) objArrT27[2], (TextView) objArrT27[1]);
                customViewImageListBindingImpl.B = -1L;
                ((RelativeLayout) objArrT27[0]).setTag(null);
                customViewImageListBindingImpl.E(view);
                customViewImageListBindingImpl.r();
                return customViewImageListBindingImpl;
            case 34:
                if (!"layout/dialog_item_quantity_picker_0".equals(obj)) {
                    throw new IllegalArgumentException(b.m(obj, "The tag for dialog_item_quantity_picker is invalid. Received: "));
                }
                Object[] objArrT28 = ViewDataBinding.t(dataBindingComponent, view, 4, null, DialogItemQuantityPickerBindingImpl.D);
                DialogItemQuantityPickerBindingImpl dialogItemQuantityPickerBindingImpl = new DialogItemQuantityPickerBindingImpl(dataBindingComponent, view, (Button) objArrT28[3], (Button) objArrT28[2], (NumberPicker) objArrT28[1]);
                dialogItemQuantityPickerBindingImpl.C = -1L;
                ((LinearLayout) objArrT28[0]).setTag(null);
                dialogItemQuantityPickerBindingImpl.E(view);
                dialogItemQuantityPickerBindingImpl.r();
                return dialogItemQuantityPickerBindingImpl;
            case 35:
                if (!"layout/dialog_scan_result_view_0".equals(obj)) {
                    throw new IllegalArgumentException(b.m(obj, "The tag for dialog_scan_result_view is invalid. Received: "));
                }
                Object[] objArrT29 = ViewDataBinding.t(dataBindingComponent, view, 9, null, DialogScanResultViewBindingImpl.D);
                DialogScanResultViewBindingImpl dialogScanResultViewBindingImpl = new DialogScanResultViewBindingImpl(view, (Button) objArrT29[4], (ImageView) objArrT29[1], (TextView) objArrT29[3], (TextView) objArrT29[2], dataBindingComponent);
                dialogScanResultViewBindingImpl.C = -1L;
                ((ConstraintLayout) objArrT29[0]).setTag(null);
                dialogScanResultViewBindingImpl.E(view);
                dialogScanResultViewBindingImpl.r();
                return dialogScanResultViewBindingImpl;
            case 36:
                if (!"layout/epoxy_sng_view_landing_content_0".equals(obj)) {
                    throw new IllegalArgumentException(b.m(obj, "The tag for epoxy_sng_view_landing_content is invalid. Received: "));
                }
                Object[] objArrT30 = ViewDataBinding.t(dataBindingComponent, view, 5, null, null);
                EpoxySngViewLandingContentBindingImpl epoxySngViewLandingContentBindingImpl = new EpoxySngViewLandingContentBindingImpl(view, (ImageView) objArrT30[1], (TextView) objArrT30[3], (TextView) objArrT30[4], (TextView) objArrT30[2], dataBindingComponent);
                epoxySngViewLandingContentBindingImpl.E = -1L;
                epoxySngViewLandingContentBindingImpl.y.setTag(null);
                epoxySngViewLandingContentBindingImpl.z.setTag(null);
                epoxySngViewLandingContentBindingImpl.A.setTag(null);
                ((ConstraintLayout) objArrT30[0]).setTag(null);
                epoxySngViewLandingContentBindingImpl.B.setTag(null);
                epoxySngViewLandingContentBindingImpl.E(view);
                epoxySngViewLandingContentBindingImpl.r();
                return epoxySngViewLandingContentBindingImpl;
            case 37:
                if (!"layout/epoxy_sng_view_landing_logo_0".equals(obj)) {
                    throw new IllegalArgumentException(b.m(obj, "The tag for epoxy_sng_view_landing_logo is invalid. Received: "));
                }
                Object[] objArrT31 = ViewDataBinding.t(dataBindingComponent, view, 2, null, null);
                EpoxySngViewLandingLogoBindingImpl epoxySngViewLandingLogoBindingImpl = new EpoxySngViewLandingLogoBindingImpl(dataBindingComponent, view, (ImageView) objArrT31[1]);
                epoxySngViewLandingLogoBindingImpl.A = -1L;
                ((ConstraintLayout) objArrT31[0]).setTag(null);
                epoxySngViewLandingLogoBindingImpl.y.setTag(null);
                epoxySngViewLandingLogoBindingImpl.E(view);
                epoxySngViewLandingLogoBindingImpl.r();
                return epoxySngViewLandingLogoBindingImpl;
            case 38:
                if (!"layout/epoxy_sng_view_landing_title_0".equals(obj)) {
                    throw new IllegalArgumentException(b.m(obj, "The tag for epoxy_sng_view_landing_title is invalid. Received: "));
                }
                Object[] objArrT32 = ViewDataBinding.t(dataBindingComponent, view, 3, null, null);
                EpoxySngViewLandingTitleBindingImpl epoxySngViewLandingTitleBindingImpl = new EpoxySngViewLandingTitleBindingImpl(dataBindingComponent, view, (TextView) objArrT32[2], (TextView) objArrT32[1]);
                epoxySngViewLandingTitleBindingImpl.B = -1L;
                epoxySngViewLandingTitleBindingImpl.y.setTag(null);
                ((ConstraintLayout) objArrT32[0]).setTag(null);
                epoxySngViewLandingTitleBindingImpl.z.setTag(null);
                epoxySngViewLandingTitleBindingImpl.E(view);
                epoxySngViewLandingTitleBindingImpl.r();
                return epoxySngViewLandingTitleBindingImpl;
            case 39:
                if ("layout/epoxy_view_available_store_info_0".equals(obj)) {
                    return new EpoxyViewAvailableStoreInfoBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(b.m(obj, "The tag for epoxy_view_available_store_info is invalid. Received: "));
            case 40:
                if (!"layout/fragment_home_0".equals(obj)) {
                    throw new IllegalArgumentException(b.m(obj, "The tag for fragment_home is invalid. Received: "));
                }
                Object[] objArrT33 = ViewDataBinding.t(dataBindingComponent, view, 7, null, FragmentHomeBindingImpl.F);
                Button button6 = (Button) objArrT33[6];
                Button button7 = (Button) objArrT33[5];
                AppCompatTextView appCompatTextView = (AppCompatTextView) objArrT33[3];
                CoordinatorLayout coordinatorLayout2 = (CoordinatorLayout) objArrT33[0];
                FragmentHomeBindingImpl fragmentHomeBindingImpl = new FragmentHomeBindingImpl(dataBindingComponent, view, button6, button7, appCompatTextView, coordinatorLayout2, (TextView) objArrT33[4]);
                fragmentHomeBindingImpl.E = -1L;
                fragmentHomeBindingImpl.B.setTag(null);
                fragmentHomeBindingImpl.E(view);
                fragmentHomeBindingImpl.r();
                return fragmentHomeBindingImpl;
            case 41:
                if (!"layout/fragment_instrument_list_0".equals(obj)) {
                    throw new IllegalArgumentException(b.m(obj, "The tag for fragment_instrument_list is invalid. Received: "));
                }
                Object[] objArrT34 = ViewDataBinding.t(dataBindingComponent, view, 4, null, FragmentInstrumentListBindingImpl.C);
                FragmentInstrumentListBindingImpl fragmentInstrumentListBindingImpl = new FragmentInstrumentListBindingImpl(dataBindingComponent, view, (TextView) objArrT34[3], (InstrumentListView) objArrT34[1], (LinearLayout) objArrT34[2]);
                fragmentInstrumentListBindingImpl.B = -1L;
                ((ConstraintLayout) objArrT34[0]).setTag(null);
                fragmentInstrumentListBindingImpl.E(view);
                fragmentInstrumentListBindingImpl.r();
                return fragmentInstrumentListBindingImpl;
            case 42:
                if (!"layout/fragment_message_single_action_0".equals(obj)) {
                    throw new IllegalArgumentException(b.m(obj, "The tag for fragment_message_single_action is invalid. Received: "));
                }
                Object[] objArrT35 = ViewDataBinding.t(dataBindingComponent, view, 5, null, FragmentMessageSingleActionBindingImpl.F);
                FragmentMessageSingleActionBindingImpl fragmentMessageSingleActionBindingImpl = new FragmentMessageSingleActionBindingImpl(dataBindingComponent, view, (Button) objArrT35[4], (ImageView) objArrT35[1], (ConstraintLayout) objArrT35[0], (TextView) objArrT35[2], (TextView) objArrT35[3]);
                fragmentMessageSingleActionBindingImpl.E = -1L;
                fragmentMessageSingleActionBindingImpl.A.setTag(null);
                fragmentMessageSingleActionBindingImpl.E(view);
                fragmentMessageSingleActionBindingImpl.r();
                return fragmentMessageSingleActionBindingImpl;
            case 43:
                if (!"layout/fragment_post_scan_view_0".equals(obj)) {
                    throw new IllegalArgumentException(b.m(obj, "The tag for fragment_post_scan_view is invalid. Received: "));
                }
                Object[] objArrT36 = ViewDataBinding.t(dataBindingComponent, view, 4, null, FragmentPostScanViewBindingImpl.E);
                FragmentPostScanViewBindingImpl fragmentPostScanViewBindingImpl = new FragmentPostScanViewBindingImpl(dataBindingComponent, view, (Button) objArrT36[3], (Button) objArrT36[2], (RelativeLayout) objArrT36[1], (CoordinatorLayout) objArrT36[0]);
                fragmentPostScanViewBindingImpl.D = -1L;
                fragmentPostScanViewBindingImpl.B.setTag(null);
                fragmentPostScanViewBindingImpl.E(view);
                fragmentPostScanViewBindingImpl.r();
                return fragmentPostScanViewBindingImpl;
            case 44:
                if (!"layout/fragment_shopping_cart_0".equals(obj)) {
                    throw new IllegalArgumentException(b.m(obj, "The tag for fragment_shopping_cart is invalid. Received: "));
                }
                Object[] objArrT37 = ViewDataBinding.t(dataBindingComponent, view, 9, null, FragmentShoppingCartBindingImpl.G);
                Button button8 = (Button) objArrT37[8];
                RelativeLayout relativeLayout2 = (RelativeLayout) objArrT37[2];
                Button button9 = (Button) objArrT37[5];
                CoordinatorLayout coordinatorLayout3 = (CoordinatorLayout) objArrT37[0];
                Button button10 = (Button) objArrT37[7];
                FragmentShoppingCartBindingImpl fragmentShoppingCartBindingImpl = new FragmentShoppingCartBindingImpl(dataBindingComponent, view, button8, relativeLayout2, button9, coordinatorLayout3, button10, (RecyclerView) objArrT37[1]);
                fragmentShoppingCartBindingImpl.F = -1L;
                fragmentShoppingCartBindingImpl.B.setTag(null);
                fragmentShoppingCartBindingImpl.E(view);
                fragmentShoppingCartBindingImpl.r();
                return fragmentShoppingCartBindingImpl;
            case 45:
                if ("layout/fragment_stepup_dialog_0".equals(obj)) {
                    return new FragmentStepupDialogBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(b.m(obj, "The tag for fragment_stepup_dialog is invalid. Received: "));
            case 46:
                if (!"layout/fragment_tap_on_0".equals(obj)) {
                    throw new IllegalArgumentException(b.m(obj, "The tag for fragment_tap_on is invalid. Received: "));
                }
                Object[] objArrT38 = ViewDataBinding.t(dataBindingComponent, view, 7, FragmentTapOnBindingImpl.H, FragmentTapOnBindingImpl.I);
                FragmentTapOnBindingImpl fragmentTapOnBindingImpl = new FragmentTapOnBindingImpl(dataBindingComponent, view, (ImageView) objArrT38[1], (DialogScanResultViewBinding) objArrT38[5], (FrameLayout) objArrT38[4], (TextView) objArrT38[3], (ConstraintLayout) objArrT38[0], (TextView) objArrT38[6], (TextView) objArrT38[2]);
                fragmentTapOnBindingImpl.G = -1L;
                fragmentTapOnBindingImpl.y.setTag(null);
                DialogScanResultViewBinding dialogScanResultViewBinding = fragmentTapOnBindingImpl.z;
                if (dialogScanResultViewBinding != null) {
                    dialogScanResultViewBinding.n = fragmentTapOnBindingImpl;
                }
                fragmentTapOnBindingImpl.A.setTag(null);
                fragmentTapOnBindingImpl.B.setTag(null);
                fragmentTapOnBindingImpl.C.setTag(null);
                fragmentTapOnBindingImpl.E.setTag(null);
                fragmentTapOnBindingImpl.E(view);
                fragmentTapOnBindingImpl.r();
                return fragmentTapOnBindingImpl;
            case 47:
                if ("layout/fragment_tender_pay_0".equals(obj)) {
                    return new FragmentTenderPayBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(b.m(obj, "The tag for fragment_tender_pay is invalid. Received: "));
            case 48:
                if ("layout/include_no_sng_store_0".equals(obj)) {
                    return new IncludeNoSngStoreBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(b.m(obj, "The tag for include_no_sng_store is invalid. Received: "));
            case 49:
                if ("layout/include_sng_generic_error_state_0".equals(obj)) {
                    return new IncludeSngGenericErrorStateBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(b.m(obj, "The tag for include_sng_generic_error_state is invalid. Received: "));
            case 50:
                if ("layout/include_sng_network_error_0".equals(obj)) {
                    return new IncludeSngNetworkErrorBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(b.m(obj, "The tag for include_sng_network_error is invalid. Received: "));
            default:
                return null;
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(8);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.base.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.base.shopapp.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.rewards.account.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.shared.feedback.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.foundation.barcode.ui.view.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.product.DataBinderMapperImpl());
        arrayList.add(new com.airbnb.epoxy.databinding.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f21132a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            int i3 = (i2 - 1) / 50;
            if (i3 == 0) {
                return e(dataBindingComponent, view, i2, tag);
            }
            if (i3 == 1) {
                switch (i2) {
                    case 51:
                        if (!"layout/item_onboarding_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for item_onboarding is invalid. Received: "));
                        }
                        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 9, null, ItemOnboardingBindingImpl.G);
                        AppCompatButton appCompatButton = (AppCompatButton) objArrT[4];
                        ItemOnboardingBindingImpl itemOnboardingBindingImpl = new ItemOnboardingBindingImpl(dataBindingComponent, view, appCompatButton, (ImageView) objArrT[2], (ConstraintLayout) objArrT[0], (TextView) objArrT[3], (TextView) objArrT[1]);
                        itemOnboardingBindingImpl.F = -1L;
                        itemOnboardingBindingImpl.y.setTag(null);
                        itemOnboardingBindingImpl.z.setTag(null);
                        itemOnboardingBindingImpl.A.setTag(null);
                        itemOnboardingBindingImpl.B.setTag(null);
                        itemOnboardingBindingImpl.C.setTag(null);
                        itemOnboardingBindingImpl.E(view);
                        itemOnboardingBindingImpl.r();
                        return itemOnboardingBindingImpl;
                    case 52:
                        if (!"layout/item_onboarding_refresh_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for item_onboarding_refresh is invalid. Received: "));
                        }
                        Object[] objArrT2 = ViewDataBinding.t(dataBindingComponent, view, 7, null, ItemOnboardingRefreshBindingImpl.H);
                        Button button = (Button) objArrT2[4];
                        ItemOnboardingRefreshBindingImpl itemOnboardingRefreshBindingImpl = new ItemOnboardingRefreshBindingImpl(dataBindingComponent, view, button, (ImageView) objArrT2[2], (ImageView) objArrT2[5], (ConstraintLayout) objArrT2[0], (TextView) objArrT2[3], (TextView) objArrT2[1]);
                        itemOnboardingRefreshBindingImpl.G = -1L;
                        itemOnboardingRefreshBindingImpl.y.setTag(null);
                        itemOnboardingRefreshBindingImpl.z.setTag(null);
                        itemOnboardingRefreshBindingImpl.A.setTag(null);
                        itemOnboardingRefreshBindingImpl.B.setTag(null);
                        itemOnboardingRefreshBindingImpl.C.setTag(null);
                        itemOnboardingRefreshBindingImpl.D.setTag(null);
                        itemOnboardingRefreshBindingImpl.E(view);
                        itemOnboardingRefreshBindingImpl.r();
                        return itemOnboardingRefreshBindingImpl;
                    case 53:
                        if (!"layout/item_search_result_sng_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for item_search_result_sng is invalid. Received: "));
                        }
                        Object[] objArrT3 = ViewDataBinding.t(dataBindingComponent, view, 6, null, ItemSearchResultSngBindingImpl.F);
                        ItemSearchResultSngBindingImpl itemSearchResultSngBindingImpl = new ItemSearchResultSngBindingImpl(dataBindingComponent, view, (PriceView) objArrT3[4], (SquareImageView) objArrT3[2], (TextView) objArrT3[1], (ConstraintLayout) objArrT3[0], (TextView) objArrT3[3]);
                        itemSearchResultSngBindingImpl.E = -1L;
                        itemSearchResultSngBindingImpl.y.setTag(null);
                        itemSearchResultSngBindingImpl.z.setTag(null);
                        itemSearchResultSngBindingImpl.A.setTag(null);
                        itemSearchResultSngBindingImpl.B.setTag(null);
                        itemSearchResultSngBindingImpl.C.setTag(null);
                        itemSearchResultSngBindingImpl.E(view);
                        itemSearchResultSngBindingImpl.r();
                        return itemSearchResultSngBindingImpl;
                    case 54:
                        if ("layout/layout_dark_toolbar_0".equals(tag)) {
                            return new LayoutDarkToolbarBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for layout_dark_toolbar is invalid. Received: "));
                    case 55:
                        if ("layout/layout_dark_toolbar_progress_0".equals(tag)) {
                            return new LayoutDarkToolbarProgressBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for layout_dark_toolbar_progress is invalid. Received: "));
                    case 56:
                        if ("layout/layout_instrument_list_0".equals(tag)) {
                            return new LayoutInstrumentListBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for layout_instrument_list is invalid. Received: "));
                    case 57:
                        if (!"layout/layout_navigation_drawer_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for layout_navigation_drawer is invalid. Received: "));
                        }
                        Object[] objArrT4 = ViewDataBinding.t(dataBindingComponent, view, 3, null, LayoutNavigationDrawerBindingImpl.C);
                        LayoutNavigationDrawerBindingImpl layoutNavigationDrawerBindingImpl = new LayoutNavigationDrawerBindingImpl(dataBindingComponent, view, (TextView) objArrT4[2], (TextView) objArrT4[1], (NavigationView) objArrT4[0]);
                        layoutNavigationDrawerBindingImpl.B = -1L;
                        layoutNavigationDrawerBindingImpl.A.setTag(null);
                        layoutNavigationDrawerBindingImpl.E(view);
                        layoutNavigationDrawerBindingImpl.r();
                        return layoutNavigationDrawerBindingImpl;
                    case 58:
                        if ("layout/layout_toolbar_0".equals(tag)) {
                            return new LayoutToolbarBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for layout_toolbar is invalid. Received: "));
                    case 59:
                        if (!"layout/layout_wow_toolbar_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for layout_wow_toolbar is invalid. Received: "));
                        }
                        Object[] objArrT5 = ViewDataBinding.t(dataBindingComponent, view, 3, null, LayoutWowToolbarBindingImpl.B);
                        LayoutWowToolbarBindingImpl layoutWowToolbarBindingImpl = new LayoutWowToolbarBindingImpl(dataBindingComponent, view, (Toolbar) objArrT5[1], (TextView) objArrT5[2]);
                        layoutWowToolbarBindingImpl.A = -1L;
                        ((AppBarLayout) objArrT5[0]).setTag(null);
                        layoutWowToolbarBindingImpl.E(view);
                        layoutWowToolbarBindingImpl.r();
                        return layoutWowToolbarBindingImpl;
                    case 60:
                        if ("layout/network_state_item_0".equals(tag)) {
                            return new NetworkStateItemBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for network_state_item is invalid. Received: "));
                    case 61:
                        if (!"layout/post_scan_view_intervention_item_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for post_scan_view_intervention_item is invalid. Received: "));
                        }
                        Object[] objArrT6 = ViewDataBinding.t(dataBindingComponent, view, 12, null, PostScanViewInterventionItemBindingImpl.K);
                        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT6[0];
                        SquareImageView squareImageView = (SquareImageView) objArrT6[2];
                        PriceView priceView = (PriceView) objArrT6[6];
                        TextView textView = (TextView) objArrT6[4];
                        TextView textView2 = (TextView) objArrT6[5];
                        TextView textView3 = (TextView) objArrT6[11];
                        TextView textView4 = (TextView) objArrT6[9];
                        TextView textView5 = (TextView) objArrT6[1];
                        TextView textView6 = (TextView) objArrT6[3];
                        PostScanViewInterventionItemBindingImpl postScanViewInterventionItemBindingImpl = new PostScanViewInterventionItemBindingImpl(dataBindingComponent, view, constraintLayout, squareImageView, priceView, textView, textView2, textView3, textView4, textView5, textView6);
                        postScanViewInterventionItemBindingImpl.J = -1L;
                        postScanViewInterventionItemBindingImpl.y.setTag(null);
                        postScanViewInterventionItemBindingImpl.z.setTag(null);
                        postScanViewInterventionItemBindingImpl.A.setTag(null);
                        postScanViewInterventionItemBindingImpl.B.setTag(null);
                        postScanViewInterventionItemBindingImpl.C.setTag(null);
                        postScanViewInterventionItemBindingImpl.F.setTag(null);
                        postScanViewInterventionItemBindingImpl.G.setTag(null);
                        postScanViewInterventionItemBindingImpl.E(view);
                        postScanViewInterventionItemBindingImpl.r();
                        return postScanViewInterventionItemBindingImpl;
                    case 62:
                        if (!"layout/post_scan_view_simple_item_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for post_scan_view_simple_item is invalid. Received: "));
                        }
                        Object[] objArrT7 = ViewDataBinding.t(dataBindingComponent, view, 13, null, PostScanViewSimpleItemBindingImpl.N);
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArrT7[0];
                        SquareImageView squareImageView2 = (SquareImageView) objArrT7[2];
                        ImageView imageView = (ImageView) objArrT7[3];
                        PriceView priceView2 = (PriceView) objArrT7[7];
                        TextView textView7 = (TextView) objArrT7[5];
                        TextView textView8 = (TextView) objArrT7[6];
                        TextView textView9 = (TextView) objArrT7[12];
                        TextView textView10 = (TextView) objArrT7[11];
                        TextView textView11 = (TextView) objArrT7[1];
                        TextView textView12 = (TextView) objArrT7[4];
                        TextView textView13 = (TextView) objArrT7[8];
                        PostScanViewSimpleItemBindingImpl postScanViewSimpleItemBindingImpl = new PostScanViewSimpleItemBindingImpl(dataBindingComponent, view, constraintLayout2, squareImageView2, imageView, priceView2, textView7, textView8, textView9, textView10, textView11, textView12, textView13);
                        postScanViewSimpleItemBindingImpl.M = -1L;
                        postScanViewSimpleItemBindingImpl.y.setTag(null);
                        postScanViewSimpleItemBindingImpl.z.setTag(null);
                        postScanViewSimpleItemBindingImpl.A.setTag(null);
                        postScanViewSimpleItemBindingImpl.B.setTag(null);
                        postScanViewSimpleItemBindingImpl.C.setTag(null);
                        postScanViewSimpleItemBindingImpl.D.setTag(null);
                        postScanViewSimpleItemBindingImpl.G.setTag(null);
                        postScanViewSimpleItemBindingImpl.H.setTag(null);
                        postScanViewSimpleItemBindingImpl.I.setTag(null);
                        postScanViewSimpleItemBindingImpl.E(view);
                        postScanViewSimpleItemBindingImpl.r();
                        return postScanViewSimpleItemBindingImpl;
                    case 63:
                        if (!"layout/post_scan_view_unknown_item_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for post_scan_view_unknown_item is invalid. Received: "));
                        }
                        Object[] objArrT8 = ViewDataBinding.t(dataBindingComponent, view, 7, null, PostScanViewUnknownItemBindingImpl.C);
                        TextView textView14 = (TextView) objArrT8[6];
                        TextView textView15 = (TextView) objArrT8[1];
                        PostScanViewUnknownItemBindingImpl postScanViewUnknownItemBindingImpl = new PostScanViewUnknownItemBindingImpl(dataBindingComponent, view, textView14, textView15);
                        postScanViewUnknownItemBindingImpl.B = -1L;
                        ((RelativeLayout) objArrT8[0]).setTag(null);
                        postScanViewUnknownItemBindingImpl.z.setTag(null);
                        postScanViewUnknownItemBindingImpl.E(view);
                        postScanViewUnknownItemBindingImpl.r();
                        return postScanViewUnknownItemBindingImpl;
                    case 64:
                        if (!"layout/post_scan_view_weight_required_item_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for post_scan_view_weight_required_item is invalid. Received: "));
                        }
                        Object[] objArrT9 = ViewDataBinding.t(dataBindingComponent, view, 10, null, PostScanViewWeightRequiredItemBindingImpl.I);
                        ConstraintLayout constraintLayout3 = (ConstraintLayout) objArrT9[0];
                        SquareImageView squareImageView3 = (SquareImageView) objArrT9[3];
                        ImageView imageView2 = (ImageView) objArrT9[4];
                        TextView textView16 = (TextView) objArrT9[9];
                        TextView textView17 = (TextView) objArrT9[8];
                        PriceView priceView3 = (PriceView) objArrT9[5];
                        TextView textView18 = (TextView) objArrT9[1];
                        TextView textView19 = (TextView) objArrT9[2];
                        PostScanViewWeightRequiredItemBindingImpl postScanViewWeightRequiredItemBindingImpl = new PostScanViewWeightRequiredItemBindingImpl(dataBindingComponent, view, constraintLayout3, squareImageView3, imageView2, textView16, textView17, priceView3, textView18, textView19);
                        postScanViewWeightRequiredItemBindingImpl.H = -1L;
                        postScanViewWeightRequiredItemBindingImpl.y.setTag(null);
                        postScanViewWeightRequiredItemBindingImpl.z.setTag(null);
                        postScanViewWeightRequiredItemBindingImpl.A.setTag(null);
                        postScanViewWeightRequiredItemBindingImpl.D.setTag(null);
                        postScanViewWeightRequiredItemBindingImpl.E.setTag(null);
                        postScanViewWeightRequiredItemBindingImpl.F.setTag(null);
                        view.setTag(com.woolworths.R.id.dataBinding, postScanViewWeightRequiredItemBindingImpl);
                        postScanViewWeightRequiredItemBindingImpl.r();
                        return postScanViewWeightRequiredItemBindingImpl;
                    case 65:
                        if (!"layout/post_scan_view_weighted_item_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for post_scan_view_weighted_item is invalid. Received: "));
                        }
                        Object[] objArrT10 = ViewDataBinding.t(dataBindingComponent, view, 12, null, PostScanViewWeightedItemBindingImpl.L);
                        ConstraintLayout constraintLayout4 = (ConstraintLayout) objArrT10[0];
                        SquareImageView squareImageView4 = (SquareImageView) objArrT10[3];
                        ImageView imageView3 = (ImageView) objArrT10[4];
                        TextView textView20 = (TextView) objArrT10[6];
                        TextView textView21 = (TextView) objArrT10[5];
                        TextView textView22 = (TextView) objArrT10[11];
                        TextView textView23 = (TextView) objArrT10[10];
                        PriceView priceView4 = (PriceView) objArrT10[7];
                        TextView textView24 = (TextView) objArrT10[1];
                        TextView textView25 = (TextView) objArrT10[2];
                        PostScanViewWeightedItemBindingImpl postScanViewWeightedItemBindingImpl = new PostScanViewWeightedItemBindingImpl(dataBindingComponent, view, constraintLayout4, squareImageView4, imageView3, textView20, textView21, textView22, textView23, priceView4, textView24, textView25);
                        postScanViewWeightedItemBindingImpl.K = -1L;
                        postScanViewWeightedItemBindingImpl.y.setTag(null);
                        postScanViewWeightedItemBindingImpl.z.setTag(null);
                        postScanViewWeightedItemBindingImpl.A.setTag(null);
                        postScanViewWeightedItemBindingImpl.B.setTag(null);
                        postScanViewWeightedItemBindingImpl.C.setTag(null);
                        postScanViewWeightedItemBindingImpl.F.setTag(null);
                        postScanViewWeightedItemBindingImpl.G.setTag(null);
                        postScanViewWeightedItemBindingImpl.H.setTag(null);
                        view.setTag(com.woolworths.R.id.dataBinding, postScanViewWeightedItemBindingImpl);
                        postScanViewWeightedItemBindingImpl.r();
                        return postScanViewWeightedItemBindingImpl;
                    case 66:
                        if (!"layout/receipt_dashed_divider_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for receipt_dashed_divider is invalid. Received: "));
                        }
                        Object[] objArrT11 = ViewDataBinding.t(dataBindingComponent, view, 2, null, ReceiptDashedDividerBindingImpl.A);
                        ReceiptDashedDividerBindingImpl receiptDashedDividerBindingImpl = new ReceiptDashedDividerBindingImpl(dataBindingComponent, view, (View) objArrT11[1]);
                        receiptDashedDividerBindingImpl.z = -1L;
                        ((ConstraintLayout) objArrT11[0]).setTag(null);
                        receiptDashedDividerBindingImpl.E(view);
                        receiptDashedDividerBindingImpl.r();
                        return receiptDashedDividerBindingImpl;
                    case 67:
                        if (!"layout/receipt_datetime_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for receipt_datetime is invalid. Received: "));
                        }
                        Object[] objArrT12 = ViewDataBinding.t(dataBindingComponent, view, 4, null, ReceiptDatetimeBindingImpl.C);
                        ReceiptDatetimeBindingImpl receiptDatetimeBindingImpl = new ReceiptDatetimeBindingImpl(dataBindingComponent, view, (View) objArrT12[1], (TextView) objArrT12[2], (TextView) objArrT12[3]);
                        receiptDatetimeBindingImpl.B = -1L;
                        ((ConstraintLayout) objArrT12[0]).setTag(null);
                        receiptDatetimeBindingImpl.E(view);
                        receiptDatetimeBindingImpl.r();
                        return receiptDatetimeBindingImpl;
                    case 68:
                        if (!"layout/receipt_discount_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for receipt_discount is invalid. Received: "));
                        }
                        Object[] objArrT13 = ViewDataBinding.t(dataBindingComponent, view, 3, null, ReceiptDiscountBindingImpl.C);
                        ReceiptDiscountBindingImpl receiptDiscountBindingImpl = new ReceiptDiscountBindingImpl(dataBindingComponent, view, (TextView) objArrT13[2], (TextView) objArrT13[1]);
                        receiptDiscountBindingImpl.B = -1L;
                        ((ConstraintLayout) objArrT13[0]).setTag(null);
                        receiptDiscountBindingImpl.E(view);
                        receiptDiscountBindingImpl.r();
                        return receiptDiscountBindingImpl;
                    case 69:
                        if (!"layout/receipt_general_voucher_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for receipt_general_voucher is invalid. Received: "));
                        }
                        Object[] objArrT14 = ViewDataBinding.t(dataBindingComponent, view, 2, null, ReceiptGeneralVoucherBindingImpl.B);
                        ReceiptGeneralVoucherBindingImpl receiptGeneralVoucherBindingImpl = new ReceiptGeneralVoucherBindingImpl(dataBindingComponent, view, (TextView) objArrT14[1]);
                        receiptGeneralVoucherBindingImpl.A = -1L;
                        ((ConstraintLayout) objArrT14[0]).setTag(null);
                        receiptGeneralVoucherBindingImpl.E(view);
                        receiptGeneralVoucherBindingImpl.r();
                        return receiptGeneralVoucherBindingImpl;
                    case 70:
                        if (!"layout/receipt_item_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for receipt_item is invalid. Received: "));
                        }
                        Object[] objArrT15 = ViewDataBinding.t(dataBindingComponent, view, 4, null, ReceiptItemBindingImpl.D);
                        ReceiptItemBindingImpl receiptItemBindingImpl = new ReceiptItemBindingImpl(dataBindingComponent, view, (TextView) objArrT15[2], (TextView) objArrT15[1], (TextView) objArrT15[3]);
                        receiptItemBindingImpl.C = -1L;
                        ((ConstraintLayout) objArrT15[0]).setTag(null);
                        receiptItemBindingImpl.E(view);
                        receiptItemBindingImpl.r();
                        return receiptItemBindingImpl;
                    case 71:
                        if (!"layout/receipt_item_promotion_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for receipt_item_promotion is invalid. Received: "));
                        }
                        Object[] objArrT16 = ViewDataBinding.t(dataBindingComponent, view, 3, null, ReceiptItemPromotionBindingImpl.C);
                        ReceiptItemPromotionBindingImpl receiptItemPromotionBindingImpl = new ReceiptItemPromotionBindingImpl(dataBindingComponent, view, (TextView) objArrT16[1], (TextView) objArrT16[2]);
                        receiptItemPromotionBindingImpl.B = -1L;
                        ((ConstraintLayout) objArrT16[0]).setTag(null);
                        receiptItemPromotionBindingImpl.E(view);
                        receiptItemPromotionBindingImpl.r();
                        return receiptItemPromotionBindingImpl;
                    case 72:
                        if (!"layout/receipt_parking_voucher_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for receipt_parking_voucher is invalid. Received: "));
                        }
                        Object[] objArrT17 = ViewDataBinding.t(dataBindingComponent, view, 6, null, ReceiptParkingVoucherBindingImpl.D);
                        BarcodeView barcodeView = (BarcodeView) objArrT17[4];
                        ConstraintLayout constraintLayout5 = (ConstraintLayout) objArrT17[0];
                        TextView textView26 = (TextView) objArrT17[5];
                        ReceiptParkingVoucherBindingImpl receiptParkingVoucherBindingImpl = new ReceiptParkingVoucherBindingImpl(dataBindingComponent, view, barcodeView, constraintLayout5, textView26);
                        receiptParkingVoucherBindingImpl.C = -1L;
                        receiptParkingVoucherBindingImpl.z.setTag(null);
                        view.setTag(com.woolworths.R.id.dataBinding, receiptParkingVoucherBindingImpl);
                        receiptParkingVoucherBindingImpl.r();
                        return receiptParkingVoucherBindingImpl;
                    case 73:
                        if (!"layout/receipt_posbarcode_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for receipt_posbarcode is invalid. Received: "));
                        }
                        Object[] objArrT18 = ViewDataBinding.t(dataBindingComponent, view, 9, null, ReceiptPosbarcodeBindingImpl.G);
                        BarcodeView barcodeView2 = (BarcodeView) objArrT18[5];
                        ReceiptPosbarcodeBindingImpl receiptPosbarcodeBindingImpl = new ReceiptPosbarcodeBindingImpl(dataBindingComponent, view, barcodeView2, (TextView) objArrT18[6], (TextView) objArrT18[2], (TextView) objArrT18[1], (TextView) objArrT18[7], (TextView) objArrT18[8]);
                        receiptPosbarcodeBindingImpl.F = -1L;
                        ((ConstraintLayout) objArrT18[0]).setTag(null);
                        receiptPosbarcodeBindingImpl.E(view);
                        receiptPosbarcodeBindingImpl.r();
                        return receiptPosbarcodeBindingImpl;
                    case 74:
                        if (!"layout/receipt_title_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for receipt_title is invalid. Received: "));
                        }
                        Object[] objArrT19 = ViewDataBinding.t(dataBindingComponent, view, 4, null, ReceiptTitleBindingImpl.C);
                        TextView textView27 = (TextView) objArrT19[3];
                        TextView textView28 = (TextView) objArrT19[1];
                        ReceiptTitleBindingImpl receiptTitleBindingImpl = new ReceiptTitleBindingImpl(dataBindingComponent, view, textView27, textView28);
                        receiptTitleBindingImpl.B = -1L;
                        ((ConstraintLayout) objArrT19[0]).setTag(null);
                        receiptTitleBindingImpl.E(view);
                        receiptTitleBindingImpl.r();
                        return receiptTitleBindingImpl;
                    case 75:
                        if (!"layout/receipt_total_discount_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for receipt_total_discount is invalid. Received: "));
                        }
                        Object[] objArrT20 = ViewDataBinding.t(dataBindingComponent, view, 3, null, ReceiptTotalDiscountBindingImpl.B);
                        ReceiptTotalDiscountBindingImpl receiptTotalDiscountBindingImpl = new ReceiptTotalDiscountBindingImpl(dataBindingComponent, view, (TextView) objArrT20[1]);
                        receiptTotalDiscountBindingImpl.A = -1L;
                        ((ConstraintLayout) objArrT20[0]).setTag(null);
                        receiptTotalDiscountBindingImpl.E(view);
                        receiptTotalDiscountBindingImpl.r();
                        return receiptTotalDiscountBindingImpl;
                    case 76:
                        if (!"layout/receipt_total_payment_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for receipt_total_payment is invalid. Received: "));
                        }
                        Object[] objArrT21 = ViewDataBinding.t(dataBindingComponent, view, 8, null, ReceiptTotalPaymentBindingImpl.F);
                        ReceiptTotalPaymentBindingImpl receiptTotalPaymentBindingImpl = new ReceiptTotalPaymentBindingImpl(dataBindingComponent, view, (TextView) objArrT21[3], (TextView) objArrT21[4], (TextView) objArrT21[1], (TextView) objArrT21[2], (TextView) objArrT21[7]);
                        receiptTotalPaymentBindingImpl.E = -1L;
                        ((ConstraintLayout) objArrT21[0]).setTag(null);
                        receiptTotalPaymentBindingImpl.E(view);
                        receiptTotalPaymentBindingImpl.r();
                        return receiptTotalPaymentBindingImpl;
                    case 77:
                        if (!"layout/receipt_total_savings_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for receipt_total_savings is invalid. Received: "));
                        }
                        Object[] objArrT22 = ViewDataBinding.t(dataBindingComponent, view, 4, null, ReceiptTotalSavingsBindingImpl.B);
                        ReceiptTotalSavingsBindingImpl receiptTotalSavingsBindingImpl = new ReceiptTotalSavingsBindingImpl(dataBindingComponent, view, (TextView) objArrT22[3]);
                        receiptTotalSavingsBindingImpl.A = -1L;
                        ((ConstraintLayout) objArrT22[0]).setTag(null);
                        receiptTotalSavingsBindingImpl.E(view);
                        receiptTotalSavingsBindingImpl.r();
                        return receiptTotalSavingsBindingImpl;
                    case 78:
                        if (!"layout/shelf_label_scan_block_bottom_sheet_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for shelf_label_scan_block_bottom_sheet is invalid. Received: "));
                        }
                        Object[] objArrT23 = ViewDataBinding.t(dataBindingComponent, view, 4, null, ShelfLabelScanBlockBottomSheetBindingImpl.A);
                        View view2 = (View) objArrT23[1];
                        ShelfLabelScanBlockBottomSheetBindingImpl shelfLabelScanBlockBottomSheetBindingImpl = new ShelfLabelScanBlockBottomSheetBindingImpl(dataBindingComponent, view, view2);
                        shelfLabelScanBlockBottomSheetBindingImpl.z = -1L;
                        ((ConstraintLayout) objArrT23[0]).setTag(null);
                        shelfLabelScanBlockBottomSheetBindingImpl.E(view);
                        shelfLabelScanBlockBottomSheetBindingImpl.r();
                        return shelfLabelScanBlockBottomSheetBindingImpl;
                    case 79:
                        if (!"layout/view_accepted_creditcards_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for view_accepted_creditcards is invalid. Received: "));
                        }
                        Object[] objArrT24 = ViewDataBinding.t(dataBindingComponent, view, 6, null, null);
                        ViewAcceptedCreditcardsBindingImpl viewAcceptedCreditcardsBindingImpl = new ViewAcceptedCreditcardsBindingImpl(dataBindingComponent, view, (LinearLayout) objArrT24[0], (ImageView) objArrT24[3], (ImageView) objArrT24[4], (ImageView) objArrT24[5], (ImageView) objArrT24[2], (ImageView) objArrT24[1]);
                        viewAcceptedCreditcardsBindingImpl.F = -1L;
                        viewAcceptedCreditcardsBindingImpl.y.setTag(null);
                        viewAcceptedCreditcardsBindingImpl.z.setTag(null);
                        viewAcceptedCreditcardsBindingImpl.A.setTag(null);
                        viewAcceptedCreditcardsBindingImpl.B.setTag(null);
                        viewAcceptedCreditcardsBindingImpl.C.setTag(null);
                        viewAcceptedCreditcardsBindingImpl.D.setTag(null);
                        view.setTag(com.woolworths.R.id.dataBinding, viewAcceptedCreditcardsBindingImpl);
                        viewAcceptedCreditcardsBindingImpl.r();
                        return viewAcceptedCreditcardsBindingImpl;
                    case 80:
                        if ("layout/view_add_creditcard_0".equals(tag)) {
                            return new ViewAddCreditcardBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for view_add_creditcard is invalid. Received: "));
                    case 81:
                        if (!"layout/view_addcard_error_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for view_addcard_error is invalid. Received: "));
                        }
                        Object[] objArrT25 = ViewDataBinding.t(dataBindingComponent, view, 3, null, ViewAddcardErrorBindingImpl.D);
                        ViewAddcardErrorBindingImpl viewAddcardErrorBindingImpl = new ViewAddcardErrorBindingImpl(view, (LinearLayout) objArrT25[0], (TextView) objArrT25[1], dataBindingComponent);
                        viewAddcardErrorBindingImpl.C = -1L;
                        viewAddcardErrorBindingImpl.y.setTag(null);
                        viewAddcardErrorBindingImpl.z.setTag(null);
                        view.setTag(com.woolworths.R.id.dataBinding, viewAddcardErrorBindingImpl);
                        viewAddcardErrorBindingImpl.r();
                        return viewAddcardErrorBindingImpl;
                    case 82:
                        if (!"layout/view_available_store_item_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for view_available_store_item is invalid. Received: "));
                        }
                        Object[] objArrT26 = ViewDataBinding.t(dataBindingComponent, view, 4, null, null);
                        ViewAvailableStoreItemBindingImpl viewAvailableStoreItemBindingImpl = new ViewAvailableStoreItemBindingImpl(dataBindingComponent, view, (ConstraintLayout) objArrT26[0], (TextView) objArrT26[3], (TextView) objArrT26[2], (TextView) objArrT26[1]);
                        viewAvailableStoreItemBindingImpl.D = -1L;
                        viewAvailableStoreItemBindingImpl.y.setTag(null);
                        viewAvailableStoreItemBindingImpl.z.setTag(null);
                        viewAvailableStoreItemBindingImpl.A.setTag(null);
                        viewAvailableStoreItemBindingImpl.B.setTag(null);
                        view.setTag(com.woolworths.R.id.dataBinding, viewAvailableStoreItemBindingImpl);
                        viewAvailableStoreItemBindingImpl.r();
                        return viewAvailableStoreItemBindingImpl;
                    case 83:
                        if (!"layout/view_cart_intervention_required_item_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for view_cart_intervention_required_item is invalid. Received: "));
                        }
                        Object[] objArrT27 = ViewDataBinding.t(dataBindingComponent, view, 6, null, ViewCartInterventionRequiredItemBindingImpl.E);
                        ProductImageView productImageView = (ProductImageView) objArrT27[1];
                        TextView textView29 = (TextView) objArrT27[5];
                        PriceView priceView5 = (PriceView) objArrT27[2];
                        TextView textView30 = (TextView) objArrT27[3];
                        ViewCartInterventionRequiredItemBindingImpl viewCartInterventionRequiredItemBindingImpl = new ViewCartInterventionRequiredItemBindingImpl(dataBindingComponent, view, productImageView, textView29, priceView5, textView30);
                        viewCartInterventionRequiredItemBindingImpl.D = -1L;
                        ((ConstraintLayout) objArrT27[0]).setTag(null);
                        viewCartInterventionRequiredItemBindingImpl.E(view);
                        viewCartInterventionRequiredItemBindingImpl.r();
                        return viewCartInterventionRequiredItemBindingImpl;
                    case 84:
                        if (!"layout/view_cart_proudct_image_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for view_cart_proudct_image is invalid. Received: "));
                        }
                        Object[] objArrT28 = ViewDataBinding.t(dataBindingComponent, view, 3, null, ViewCartProudctImageBindingImpl.C);
                        ViewCartProudctImageBindingImpl viewCartProudctImageBindingImpl = new ViewCartProudctImageBindingImpl(dataBindingComponent, view, (SquareImageView) objArrT28[1], (TextView) objArrT28[2]);
                        viewCartProudctImageBindingImpl.B = -1L;
                        ((RelativeLayout) objArrT28[0]).setTag(null);
                        viewCartProudctImageBindingImpl.E(view);
                        viewCartProudctImageBindingImpl.r();
                        return viewCartProudctImageBindingImpl;
                    case 85:
                        if (!"layout/view_cart_simple_item_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for view_cart_simple_item is invalid. Received: "));
                        }
                        Object[] objArrT29 = ViewDataBinding.t(dataBindingComponent, view, 7, null, ViewCartSimpleItemBindingImpl.F);
                        ProductImageView productImageView2 = (ProductImageView) objArrT29[1];
                        ImageView imageView4 = (ImageView) objArrT29[2];
                        TextView textView31 = (TextView) objArrT29[4];
                        PriceView priceView6 = (PriceView) objArrT29[3];
                        TextView textView32 = (TextView) objArrT29[5];
                        ViewCartSimpleItemBindingImpl viewCartSimpleItemBindingImpl = new ViewCartSimpleItemBindingImpl(dataBindingComponent, view, productImageView2, imageView4, textView31, priceView6, textView32);
                        viewCartSimpleItemBindingImpl.E = -1L;
                        ((ConstraintLayout) objArrT29[0]).setTag(null);
                        viewCartSimpleItemBindingImpl.E(view);
                        viewCartSimpleItemBindingImpl.r();
                        return viewCartSimpleItemBindingImpl;
                    case 86:
                        if (!"layout/view_cart_unknown_item_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for view_cart_unknown_item is invalid. Received: "));
                        }
                        Object[] objArrT30 = ViewDataBinding.t(dataBindingComponent, view, 3, null, ViewCartUnknownItemBindingImpl.z);
                        ViewCartUnknownItemBindingImpl viewCartUnknownItemBindingImpl = new ViewCartUnknownItemBindingImpl(dataBindingComponent, view, 0);
                        viewCartUnknownItemBindingImpl.y = -1L;
                        ((ConstraintLayout) objArrT30[0]).setTag(null);
                        viewCartUnknownItemBindingImpl.E(view);
                        viewCartUnknownItemBindingImpl.r();
                        return viewCartUnknownItemBindingImpl;
                    case 87:
                        if (!"layout/view_cart_weight_required_item_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for view_cart_weight_required_item is invalid. Received: "));
                        }
                        Object[] objArrT31 = ViewDataBinding.t(dataBindingComponent, view, 6, null, ViewCartWeightRequiredItemBindingImpl.E);
                        ProductImageView productImageView3 = (ProductImageView) objArrT31[1];
                        ImageView imageView5 = (ImageView) objArrT31[2];
                        PriceView priceView7 = (PriceView) objArrT31[5];
                        TextView textView33 = (TextView) objArrT31[3];
                        ViewCartWeightRequiredItemBindingImpl viewCartWeightRequiredItemBindingImpl = new ViewCartWeightRequiredItemBindingImpl(dataBindingComponent, view, productImageView3, imageView5, priceView7, textView33);
                        viewCartWeightRequiredItemBindingImpl.D = -1L;
                        ((ConstraintLayout) objArrT31[0]).setTag(null);
                        viewCartWeightRequiredItemBindingImpl.E(view);
                        viewCartWeightRequiredItemBindingImpl.r();
                        return viewCartWeightRequiredItemBindingImpl;
                    case 88:
                        if (!"layout/view_checked_shopping_item_row_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for view_checked_shopping_item_row is invalid. Received: "));
                        }
                        Object[] objArrT32 = ViewDataBinding.t(dataBindingComponent, view, 6, null, ViewCheckedShoppingItemRowBindingImpl.A);
                        ConstraintLayout constraintLayout6 = (ConstraintLayout) objArrT32[0];
                        ViewCheckedShoppingItemRowBindingImpl viewCheckedShoppingItemRowBindingImpl = new ViewCheckedShoppingItemRowBindingImpl(dataBindingComponent, view, constraintLayout6);
                        viewCheckedShoppingItemRowBindingImpl.z = -1L;
                        viewCheckedShoppingItemRowBindingImpl.y.setTag(null);
                        view.setTag(com.woolworths.R.id.dataBinding, viewCheckedShoppingItemRowBindingImpl);
                        viewCheckedShoppingItemRowBindingImpl.r();
                        return viewCheckedShoppingItemRowBindingImpl;
                    case 89:
                        if (!"layout/view_dot_indicator_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for view_dot_indicator is invalid. Received: "));
                        }
                        ViewDotIndicatorBindingImpl viewDotIndicatorBindingImpl = new ViewDotIndicatorBindingImpl(dataBindingComponent, view, (LinearLayout) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
                        viewDotIndicatorBindingImpl.A = -1L;
                        viewDotIndicatorBindingImpl.y.setTag(null);
                        view.setTag(com.woolworths.R.id.dataBinding, viewDotIndicatorBindingImpl);
                        viewDotIndicatorBindingImpl.r();
                        return viewDotIndicatorBindingImpl;
                    case 90:
                        if (!"layout/view_header_drawer_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for view_header_drawer is invalid. Received: "));
                        }
                        Object[] objArrT33 = ViewDataBinding.t(dataBindingComponent, view, 4, null, ViewHeaderDrawerBindingImpl.z);
                        ViewHeaderDrawerBindingImpl viewHeaderDrawerBindingImpl = new ViewHeaderDrawerBindingImpl(dataBindingComponent, view, 0);
                        viewHeaderDrawerBindingImpl.y = -1L;
                        ((ConstraintLayout) objArrT33[0]).setTag(null);
                        viewHeaderDrawerBindingImpl.E(view);
                        viewHeaderDrawerBindingImpl.r();
                        return viewHeaderDrawerBindingImpl;
                    case 91:
                        if (!"layout/view_intervention_product_info_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for view_intervention_product_info is invalid. Received: "));
                        }
                        Object[] objArrT34 = ViewDataBinding.t(dataBindingComponent, view, 11, null, ViewInterventionProductInfoBindingImpl.J);
                        ProductBadgeView productBadgeView = (ProductBadgeView) objArrT34[8];
                        SquareImageView squareImageView5 = (SquareImageView) objArrT34[1];
                        PriceView priceView8 = (PriceView) objArrT34[5];
                        TextView textView34 = (TextView) objArrT34[3];
                        TextView textView35 = (TextView) objArrT34[4];
                        TextView textView36 = (TextView) objArrT34[10];
                        TextView textView37 = (TextView) objArrT34[9];
                        ViewInterventionProductInfoBindingImpl viewInterventionProductInfoBindingImpl = new ViewInterventionProductInfoBindingImpl(dataBindingComponent, view, productBadgeView, squareImageView5, priceView8, textView34, textView35, textView36, textView37, (TextView) objArrT34[2]);
                        viewInterventionProductInfoBindingImpl.I = -1L;
                        viewInterventionProductInfoBindingImpl.z.setTag(null);
                        viewInterventionProductInfoBindingImpl.A.setTag(null);
                        viewInterventionProductInfoBindingImpl.B.setTag(null);
                        viewInterventionProductInfoBindingImpl.C.setTag(null);
                        ((ConstraintLayout) objArrT34[0]).setTag(null);
                        viewInterventionProductInfoBindingImpl.F.setTag(null);
                        viewInterventionProductInfoBindingImpl.E(view);
                        viewInterventionProductInfoBindingImpl.r();
                        return viewInterventionProductInfoBindingImpl;
                    case 92:
                        if (!"layout/view_payment_error_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for view_payment_error is invalid. Received: "));
                        }
                        Object[] objArrT35 = ViewDataBinding.t(dataBindingComponent, view, 4, null, null);
                        ViewPaymentErrorBindingImpl viewPaymentErrorBindingImpl = new ViewPaymentErrorBindingImpl(dataBindingComponent, view, (ImageView) objArrT35[1], (RelativeLayout) objArrT35[0], (TextView) objArrT35[3], (TextView) objArrT35[2]);
                        viewPaymentErrorBindingImpl.G = -1L;
                        viewPaymentErrorBindingImpl.y.setTag(null);
                        viewPaymentErrorBindingImpl.z.setTag(null);
                        viewPaymentErrorBindingImpl.A.setTag(null);
                        viewPaymentErrorBindingImpl.B.setTag(null);
                        view.setTag(com.woolworths.R.id.dataBinding, viewPaymentErrorBindingImpl);
                        viewPaymentErrorBindingImpl.r();
                        return viewPaymentErrorBindingImpl;
                    case 93:
                        if (!"layout/view_simple_product_info_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for view_simple_product_info is invalid. Received: "));
                        }
                        Object[] objArrT36 = ViewDataBinding.t(dataBindingComponent, view, 13, null, ViewSimpleProductInfoBindingImpl.M);
                        ProductBadgeView productBadgeView2 = (ProductBadgeView) objArrT36[10];
                        SquareImageView squareImageView6 = (SquareImageView) objArrT36[1];
                        ImageView imageView6 = (ImageView) objArrT36[2];
                        PriceView priceView9 = (PriceView) objArrT36[6];
                        TextView textView38 = (TextView) objArrT36[4];
                        TextView textView39 = (TextView) objArrT36[5];
                        TextView textView40 = (TextView) objArrT36[12];
                        TextView textView41 = (TextView) objArrT36[11];
                        ConstraintLayout constraintLayout7 = (ConstraintLayout) objArrT36[0];
                        ViewSimpleProductInfoBindingImpl viewSimpleProductInfoBindingImpl = new ViewSimpleProductInfoBindingImpl(dataBindingComponent, view, productBadgeView2, squareImageView6, imageView6, priceView9, textView38, textView39, textView40, textView41, constraintLayout7, (TextView) objArrT36[3], (TextView) objArrT36[7]);
                        viewSimpleProductInfoBindingImpl.L = -1L;
                        viewSimpleProductInfoBindingImpl.z.setTag(null);
                        viewSimpleProductInfoBindingImpl.A.setTag(null);
                        viewSimpleProductInfoBindingImpl.B.setTag(null);
                        viewSimpleProductInfoBindingImpl.C.setTag(null);
                        viewSimpleProductInfoBindingImpl.D.setTag(null);
                        viewSimpleProductInfoBindingImpl.G.setTag(null);
                        viewSimpleProductInfoBindingImpl.H.setTag(null);
                        viewSimpleProductInfoBindingImpl.I.setTag(null);
                        view.setTag(com.woolworths.R.id.dataBinding, viewSimpleProductInfoBindingImpl);
                        viewSimpleProductInfoBindingImpl.r();
                        return viewSimpleProductInfoBindingImpl;
                    case 94:
                        if (!"layout/view_state_item_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for view_state_item is invalid. Received: "));
                        }
                        Object[] objArrT37 = ViewDataBinding.t(dataBindingComponent, view, 2, null, null);
                        ViewStateItemBindingImpl viewStateItemBindingImpl = new ViewStateItemBindingImpl(dataBindingComponent, view, (ConstraintLayout) objArrT37[0], (TextView) objArrT37[1]);
                        viewStateItemBindingImpl.B = -1L;
                        viewStateItemBindingImpl.y.setTag(null);
                        viewStateItemBindingImpl.z.setTag(null);
                        view.setTag(com.woolworths.R.id.dataBinding, viewStateItemBindingImpl);
                        viewStateItemBindingImpl.r();
                        return viewStateItemBindingImpl;
                    case 95:
                        if ("layout/view_update_creditcard_0".equals(tag)) {
                            return new ViewUpdateCreditcardBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(b.m(tag, "The tag for view_update_creditcard is invalid. Received: "));
                    case 96:
                        if (!"layout/view_weight_required_product_info_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for view_weight_required_product_info is invalid. Received: "));
                        }
                        Object[] objArrT38 = ViewDataBinding.t(dataBindingComponent, view, 10, null, ViewWeightRequiredProductInfoBindingImpl.H);
                        ProductBadgeView productBadgeView3 = (ProductBadgeView) objArrT38[7];
                        SquareImageView squareImageView7 = (SquareImageView) objArrT38[1];
                        ImageView imageView7 = (ImageView) objArrT38[2];
                        PriceView priceView10 = (PriceView) objArrT38[4];
                        TextView textView42 = (TextView) objArrT38[9];
                        TextView textView43 = (TextView) objArrT38[8];
                        ViewWeightRequiredProductInfoBindingImpl viewWeightRequiredProductInfoBindingImpl = new ViewWeightRequiredProductInfoBindingImpl(dataBindingComponent, view, productBadgeView3, squareImageView7, imageView7, priceView10, textView42, textView43, (TextView) objArrT38[3]);
                        viewWeightRequiredProductInfoBindingImpl.G = -1L;
                        viewWeightRequiredProductInfoBindingImpl.z.setTag(null);
                        viewWeightRequiredProductInfoBindingImpl.A.setTag(null);
                        viewWeightRequiredProductInfoBindingImpl.B.setTag(null);
                        ((ConstraintLayout) objArrT38[0]).setTag(null);
                        viewWeightRequiredProductInfoBindingImpl.E.setTag(null);
                        viewWeightRequiredProductInfoBindingImpl.E(view);
                        viewWeightRequiredProductInfoBindingImpl.r();
                        return viewWeightRequiredProductInfoBindingImpl;
                    case 97:
                        if (!"layout/view_weighted_item_product_info_0".equals(tag)) {
                            throw new IllegalArgumentException(b.m(tag, "The tag for view_weighted_item_product_info is invalid. Received: "));
                        }
                        Object[] objArrT39 = ViewDataBinding.t(dataBindingComponent, view, 13, null, ViewWeightedItemProductInfoBindingImpl.K);
                        ProductBadgeView productBadgeView4 = (ProductBadgeView) objArrT39[10];
                        SquareImageView squareImageView8 = (SquareImageView) objArrT39[1];
                        ImageView imageView8 = (ImageView) objArrT39[2];
                        PriceView priceView11 = (PriceView) objArrT39[4];
                        TextView textView44 = (TextView) objArrT39[7];
                        TextView textView45 = (TextView) objArrT39[5];
                        TextView textView46 = (TextView) objArrT39[6];
                        TextView textView47 = (TextView) objArrT39[12];
                        TextView textView48 = (TextView) objArrT39[11];
                        ViewWeightedItemProductInfoBindingImpl viewWeightedItemProductInfoBindingImpl = new ViewWeightedItemProductInfoBindingImpl(dataBindingComponent, view, productBadgeView4, squareImageView8, imageView8, priceView11, textView44, textView45, textView46, textView47, textView48, (TextView) objArrT39[3]);
                        viewWeightedItemProductInfoBindingImpl.J = -1L;
                        viewWeightedItemProductInfoBindingImpl.z.setTag(null);
                        viewWeightedItemProductInfoBindingImpl.A.setTag(null);
                        viewWeightedItemProductInfoBindingImpl.B.setTag(null);
                        viewWeightedItemProductInfoBindingImpl.C.setTag(null);
                        viewWeightedItemProductInfoBindingImpl.D.setTag(null);
                        viewWeightedItemProductInfoBindingImpl.E.setTag(null);
                        ((ConstraintLayout) objArrT39[0]).setTag(null);
                        viewWeightedItemProductInfoBindingImpl.H.setTag(null);
                        viewWeightedItemProductInfoBindingImpl.E(view);
                        viewWeightedItemProductInfoBindingImpl.r();
                        return viewWeightedItemProductInfoBindingImpl;
                }
            }
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f21132a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f21133a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
