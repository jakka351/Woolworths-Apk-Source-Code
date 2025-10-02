package au.com.woolworths.android.onesite;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.camera.core.impl.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.legacy.widget.Space;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericInlineErrorStateBinding;
import au.com.woolworths.android.onesite.databinding.ActivityCheckoutBindingImpl;
import au.com.woolworths.android.onesite.databinding.ActivityMainBindingImpl;
import au.com.woolworths.android.onesite.databinding.FragmentCheckoutPayServicesErrorBindingImpl;
import au.com.woolworths.android.onesite.databinding.FragmentErrorDialogBindingImpl;
import au.com.woolworths.android.onesite.databinding.FragmentPayForOrderDigitalBindingImpl;
import au.com.woolworths.android.onesite.databinding.FragmentStepUpBindingImpl;
import au.com.woolworths.android.onesite.databinding.IncludeAddNewCreditCardDigitalBinding;
import au.com.woolworths.android.onesite.databinding.IncludeAddNewCreditCardDigitalBindingImpl;
import au.com.woolworths.android.onesite.databinding.IncludeAddNewGiftCardDigitalBinding;
import au.com.woolworths.android.onesite.databinding.IncludeAddNewGiftCardDigitalBindingImpl;
import au.com.woolworths.android.onesite.databinding.IncludeCheckoutErrorAllRoundedBinding;
import au.com.woolworths.android.onesite.databinding.IncludeCheckoutErrorAllRoundedBindingImpl;
import au.com.woolworths.android.onesite.databinding.IncludeCheckoutErrorNoRoundedBinding;
import au.com.woolworths.android.onesite.databinding.IncludeCheckoutErrorNoRoundedBindingImpl;
import au.com.woolworths.android.onesite.databinding.IncludeCheckoutExpiredErrorBinding;
import au.com.woolworths.android.onesite.databinding.IncludeCheckoutExpiredErrorBindingImpl;
import au.com.woolworths.android.onesite.databinding.IncludeCheckoutWarningBinding;
import au.com.woolworths.android.onesite.databinding.IncludeCheckoutWarningBindingImpl;
import au.com.woolworths.android.onesite.databinding.IncludePaymentDeductionBinding;
import au.com.woolworths.android.onesite.databinding.IncludePaymentDeductionBindingImpl;
import au.com.woolworths.android.onesite.databinding.IncludeShoppingModeAppBarCollapsedBindingImpl;
import au.com.woolworths.android.onesite.databinding.IncludeShoppingModeAppBarExpandedBindingImpl;
import au.com.woolworths.android.onesite.databinding.IncludeShoppingModeDnBannerBindingImpl;
import au.com.woolworths.android.onesite.databinding.IncludeShoppingModeFulfilmentBindingImpl;
import au.com.woolworths.android.onesite.databinding.IncludeShoppingModeFulfilmentNoWindowBindingImpl;
import au.com.woolworths.android.onesite.databinding.IncludeToolbarHomeCollectionModesBindingImpl;
import au.com.woolworths.android.onesite.databinding.ItemAddedGiftCardBindingImpl;
import au.com.woolworths.android.onesite.databinding.ItemExpiredCreditCardBindingImpl;
import au.com.woolworths.android.onesite.databinding.ItemExpiredGiftCardBindingImpl;
import au.com.woolworths.android.onesite.databinding.ItemFeaturedBrandBindingImpl;
import au.com.woolworths.android.onesite.databinding.ItemPaginationLoaderViewBindingImpl;
import au.com.woolworths.android.onesite.databinding.ItemPopularSearchBindingImpl;
import au.com.woolworths.android.onesite.databinding.ItemPopularSearchHeaderBindingImpl;
import au.com.woolworths.android.onesite.databinding.ItemSavedCreditCardBindingImpl;
import au.com.woolworths.android.onesite.databinding.ItemSavedGiftCardBindingImpl;
import au.com.woolworths.android.onesite.databinding.ItemSuggestedSearchBindingImpl;
import au.com.woolworths.android.onesite.databinding.ItemSuggestedSearchHeaderBindingImpl;
import au.com.woolworths.android.onesite.databinding.ToolTipContentWithTitleBindingImpl;
import au.com.woolworths.android.onesite.models.notification.NotificationResult;
import au.com.woolworths.base.shopapp.databinding.EpoxyItemButtonBinding;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.apphosting.datastore.testing.DatastoreTestTrace;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.math.Primes;

/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f4052a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = a.b(263, 0, 1, "_all", UrlHandler.ACTION);
            sparseArrayB.put(2, "actionState");
            sparseArrayB.put(3, "address");
            sparseArrayB.put(4, "amountColorRes");
            sparseArrayB.put(5, "asset");
            sparseArrayB.put(6, "backgroundColor");
            sparseArrayB.put(7, "backingImageLoaderListener");
            sparseArrayB.put(8, "badgeImageUrl");
            sparseArrayB.put(9, "banner");
            sparseArrayB.put(10, "bannerAsset");
            sparseArrayB.put(11, "bannerIcon");
            sparseArrayB.put(12, "bannerState");
            sparseArrayB.put(13, "barcodeData");
            sparseArrayB.put(14, "billingAddress");
            sparseArrayB.put(15, "body");
            sparseArrayB.put(16, "boostAllBannerState");
            sparseArrayB.put(17, "boostAnimationVisibility");
            sparseArrayB.put(18, "boostViewListener");
            sparseArrayB.put(19, "brandLabel");
            sparseArrayB.put(20, "bundleData");
            sparseArrayB.put(21, "button");
            sparseArrayB.put(22, "buttonText");
            sparseArrayB.put(23, "buttonTint");
            sparseArrayB.put(24, "buttonTitle");
            sparseArrayB.put(25, NotificationResult.Notification.CAMPAIGN);
            sparseArrayB.put(26, "canShowWatchlist");
            sparseArrayB.put(27, "cardCaptureHandler");
            sparseArrayB.put(28, "cartButton");
            sparseArrayB.put(29, "cataloguePage");
            sparseArrayB.put(30, "cents");
            sparseArrayB.put(31, "checkboxText");
            sparseArrayB.put(32, "clickHandler");
            sparseArrayB.put(33, "clickHandlers");
            sparseArrayB.put(34, "clickListener");
            sparseArrayB.put(35, "coachMark");
            sparseArrayB.put(36, "collectionMethodOption");
            sparseArrayB.put(37, "collectionMode");
            sparseArrayB.put(38, "collectionModeLabel");
            sparseArrayB.put(39, "collectionModeLocation");
            sparseArrayB.put(40, "color");
            sparseArrayB.put(41, "colorName");
            sparseArrayB.put(42, "condition");
            sparseArrayB.put(43, "containerTitle");
            sparseArrayB.put(44, "content");
            sparseArrayB.put(45, "contentDescription");
            sparseArrayB.put(46, "count");
            sparseArrayB.put(47, "countLabel");
            sparseArrayB.put(48, "cta");
            sparseArrayB.put(49, "ctaText");
            sparseArrayB.put(50, "data");
            sparseArrayB.put(51, "deliveryNowClickHandler");
            sparseArrayB.put(52, "deliveryNowWindow");
            sparseArrayB.put(53, lqlqqlq.mmm006Dm006Dm);
            sparseArrayB.put(54, "descriptionText");
            sparseArrayB.put(55, "directToBootNowWindow");
            sparseArrayB.put(56, "discountItem");
            sparseArrayB.put(57, "dispatchNote");
            sparseArrayB.put(58, "displayExpiryExtended");
            sparseArrayB.put(59, "displayFreeTextClearIcon");
            sparseArrayB.put(60, "displayFreeTextSearchIcon");
            sparseArrayB.put(61, "displayName");
            sparseArrayB.put(62, "dollars");
            sparseArrayB.put(63, "dummyBannerData");
            sparseArrayB.put(64, "dummyBannerVisibility");
            sparseArrayB.put(65, "emptyState");
            sparseArrayB.put(66, "enableBoostAnimationContainerGap");
            sparseArrayB.put(67, "enabled");
            sparseArrayB.put(68, "errorLabelText");
            sparseArrayB.put(69, "errorListener");
            sparseArrayB.put(70, "errorState");
            sparseArrayB.put(71, "errorsHandler");
            sparseArrayB.put(72, "eventHandler");
            sparseArrayB.put(73, "filter");
            sparseArrayB.put(74, "filterMenuItem");
            sparseArrayB.put(75, "filterOption");
            sparseArrayB.put(76, "filterOptionClickListener");
            sparseArrayB.put(77, "footer");
            sparseArrayB.put(78, "freshMagContent");
            sparseArrayB.put(79, "freshMagHomeListener");
            sparseArrayB.put(80, "fulfilmentWindow");
            sparseArrayB.put(81, "fulfilmentWindowState");
            sparseArrayB.put(82, "fulfilmentWindows");
            sparseArrayB.put(83, "fulfilmentWindowsOption");
            sparseArrayB.put(84, "fulfilmentWindowsSlot");
            sparseArrayB.put(85, "groupTitle");
            sparseArrayB.put(86, "handler");
            sparseArrayB.put(87, "handlers");
            sparseArrayB.put(88, "hasHorizontalPadding");
            sparseArrayB.put(89, "hasUnreadMessages");
            sparseArrayB.put(90, "header");
            sparseArrayB.put(91, "headerIsClickable");
            sparseArrayB.put(92, "heightRes");
            sparseArrayB.put(93, "hostScreen");
            sparseArrayB.put(94, "hostViewListener");
            sparseArrayB.put(95, "htmlListener");
            sparseArrayB.put(96, "iconResId");
            sparseArrayB.put(97, "imageItem");
            sparseArrayB.put(98, "imageLoadListener");
            sparseArrayB.put(99, "imageLoaderListener");
            sparseArrayB.put(100, "imageUrl");
            sparseArrayB.put(101, "importantForAccessibility");
            sparseArrayB.put(102, "inMappedStore");
            sparseArrayB.put(103, "index");
            sparseArrayB.put(104, "info");
            sparseArrayB.put(105, "infoIconClickHandler");
            sparseArrayB.put(106, "infoSectionItem");
            sparseArrayB.put(107, "infoView");
            sparseArrayB.put(108, "inlineError");
            sparseArrayB.put(109, "inlineMessage");
            sparseArrayB.put(110, "insetBanner");
            sparseArrayB.put(111, "instoreReminderPopupText");
            sparseArrayB.put(112, "isAccountNotificationBadgeShown");
            sparseArrayB.put(113, "isBeingChangedTo");
            sparseArrayB.put(114, "isButtonEnabled");
            sparseArrayB.put(115, "isChecked");
            sparseArrayB.put(116, "isComposeContentViewEnabled");
            sparseArrayB.put(117, "isCtaInProgress");
            sparseArrayB.put(118, "isEdited");
            sparseArrayB.put(119, "isEnabled");
            sparseArrayB.put(120, "isExpandable");
            sparseArrayB.put(121, "isExpanded");
            sparseArrayB.put(122, "isInSnGSession");
            sparseArrayB.put(123, "isLoading");
            sparseArrayB.put(124, "isLowerPriceYellow");
            sparseArrayB.put(125, "isMarketplace");
            sparseArrayB.put(126, "isNewBarcodeEnabled");
            sparseArrayB.put(127, "isPopup");
            sparseArrayB.put(128, "isRewardStyle");
            sparseArrayB.put(129, "isSearchBarHintVisible");
            sparseArrayB.put(130, "isSearchBarVisible");
            sparseArrayB.put(131, "isSelected");
            sparseArrayB.put(132, "isShoppingListBeingSaved");
            sparseArrayB.put(133, "isToggleInProgress");
            sparseArrayB.put(134, "isUnlocking");
            sparseArrayB.put(135, "isWatchlist");
            sparseArrayB.put(136, "isWatchlisted");
            sparseArrayB.put(137, "item");
            sparseArrayB.put(138, "itemClickListener");
            sparseArrayB.put(139, "itemData");
            sparseArrayB.put(140, "itemState");
            sparseArrayB.put(141, "itemWidthRes");
            sparseArrayB.put(142, AnnotatedPrivateKey.LABEL);
            sparseArrayB.put(143, "labelStyle");
            sparseArrayB.put(144, "lightTheme");
            sparseArrayB.put(145, "linkHandler");
            sparseArrayB.put(146, "listId");
            sparseArrayB.put(147, "listIndex");
            sparseArrayB.put(148, "listViewModel");
            sparseArrayB.put(149, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            sparseArrayB.put(150, "loadingMessage");
            sparseArrayB.put(151, "location");
            sparseArrayB.put(152, "logoUrl");
            sparseArrayB.put(153, "lottieAutoPlay");
            sparseArrayB.put(154, "lottieBackgroundColor");
            sparseArrayB.put(ModuleDescriptor.MODULE_VERSION, "lottieLoop");
            sparseArrayB.put(156, "mainViewModel");
            sparseArrayB.put(157, "margins");
            sparseArrayB.put(158, "markdownContent");
            sparseArrayB.put(159, "marketSellerGroup");
            sparseArrayB.put(160, "marketplace");
            sparseArrayB.put(161, "marketplaceInfo");
            sparseArrayB.put(162, "memberPriceInfo");
            sparseArrayB.put(163, "message");
            sparseArrayB.put(164, "mode");
            sparseArrayB.put(165, "modeConfig");
            sparseArrayB.put(166, "offerViewItem");
            sparseArrayB.put(167, "onBannerClick");
            sparseArrayB.put(168, "onClick");
            sparseArrayB.put(169, "onItemClickListener");
            sparseArrayB.put(170, "onMaxLinesToggleListener");
            sparseArrayB.put(171, "onPointsBalanceClick");
            sparseArrayB.put(172, "onQueryTextChangeListener");
            sparseArrayB.put(173, "onQueryTextFocusChangeListener");
            sparseArrayB.put(174, "onQueryTextSubmitListener");
            sparseArrayB.put(175, "onSelected");
            sparseArrayB.put(176, "option");
            sparseArrayB.put(177, "optionText");
            sparseArrayB.put(178, "order");
            sparseArrayB.put(179, "orderId");
            sparseArrayB.put(SubsamplingScaleImageView.ORIENTATION_180, "orderOverview");
            sparseArrayB.put(181, "orderTotalDetails");
            sparseArrayB.put(182, "packagingMethodOption");
            sparseArrayB.put(183, "paddingBottom");
            sparseArrayB.put(184, "page");
            sparseArrayB.put(185, "pageData");
            sparseArrayB.put(186, "pageItem");
            sparseArrayB.put(187, "pageState");
            sparseArrayB.put(188, "paymentInfo");
            sparseArrayB.put(189, "pickUpInstructionsClickHandler");
            sparseArrayB.put(190, "postcode");
            sparseArrayB.put(191, "previewContent");
            sparseArrayB.put(BERTags.PRIVATE, "primaryButtonClickListener");
            sparseArrayB.put(193, "product");
            sparseArrayB.put(194, "productCard");
            sparseArrayB.put(195, "productCardButtonType");
            sparseArrayB.put(196, "productCardButtonsState");
            sparseArrayB.put(197, "productCardConfig");
            sparseArrayB.put(198, "productConfig");
            sparseArrayB.put(199, "productData");
            sparseArrayB.put(200, "progressStepper");
            sparseArrayB.put(201, "quantity");
            sparseArrayB.put(DatastoreTestTrace.FirestoreV1Action.DATABASE_CONTENTS_BEFORE_ACTION_FIELD_NUMBER, "queryHintRes");
            sparseArrayB.put(DatastoreTestTrace.FirestoreV1Action.MATCHING_DOCUMENTS_FIELD_NUMBER, "queryText");
            sparseArrayB.put(204, "queryTextFocusChangeListener");
            sparseArrayB.put(205, "recipeListViewModel");
            sparseArrayB.put(206, "redemptionSettings");
            sparseArrayB.put(207, "rewardsPointsBalance");
            sparseArrayB.put(208, "rewardsPointsBalanceData");
            sparseArrayB.put(209, "rewardsRegistered");
            sparseArrayB.put(210, "rewardsRegisteredRedeemable");
            sparseArrayB.put(Primes.SMALL_FACTOR_LIMIT, "rewardsUnregistered");
            sparseArrayB.put(212, "searchQueryHint");
            sparseArrayB.put(213, "section");
            sparseArrayB.put(214, "sectionHeader");
            sparseArrayB.put(215, "sectionTitle");
            sparseArrayB.put(216, "seller");
            sparseArrayB.put(217, "sellerName");
            sparseArrayB.put(218, "serves");
            sparseArrayB.put(219, "servesQuantityClickListener");
            sparseArrayB.put(220, "shoppingList");
            sparseArrayB.put(221, "shouldHideToolbar");
            sparseArrayB.put(222, "shouldShowLoadingState");
            sparseArrayB.put(223, "shouldShowNewBadge");
            sparseArrayB.put(BERTags.FLAGS, "shouldShowNotificationDot");
            sparseArrayB.put(225, "shouldShowWebArrow");
            sparseArrayB.put(226, "showAddToListButton");
            sparseArrayB.put(227, "showBoostAnimation");
            sparseArrayB.put(228, "showCheckedItems");
            sparseArrayB.put(229, "showDisabledState");
            sparseArrayB.put(230, "showError");
            sparseArrayB.put(231, "showLoadingView");
            sparseArrayB.put(232, "showNewDismissIcon");
            sparseArrayB.put(233, "showPickOrderCollectedState");
            sparseArrayB.put(234, "showSkeleton");
            sparseArrayB.put(235, "showTigerDisplayExpiry");
            sparseArrayB.put(236, "showTigerOffersLabel");
            sparseArrayB.put(237, "singleLine");
            sparseArrayB.put(238, "sortByViewListener");
            sparseArrayB.put(239, "sortOption");
            sparseArrayB.put(240, "sortOptionClickListener");
            sparseArrayB.put(241, "state");
            sparseArrayB.put(242, "stepContent");
            sparseArrayB.put(243, "stepIndex");
            sparseArrayB.put(244, "stepInfoData");
            sparseArrayB.put(245, "stepsToolTip");
            sparseArrayB.put(246, "store");
            sparseArrayB.put(247, "suburb");
            sparseArrayB.put(248, "swipeRefresh");
            sparseArrayB.put(249, "terms");
            sparseArrayB.put(250, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(251, "textColorAttr");
            sparseArrayB.put(252, "title");
            sparseArrayB.put(253, "toolbarLogoResId");
            sparseArrayB.put(254, "toolbarTitle");
            sparseArrayB.put(255, "topMarginRes");
            sparseArrayB.put(256, "typefaceRes");
            sparseArrayB.put(257, "value");
            sparseArrayB.put(258, "viewListener");
            sparseArrayB.put(259, "viewModel");
            sparseArrayB.put(260, "viewState");
            sparseArrayB.put(261, "vocViewModel");
            sparseArrayB.put(262, "windowSubheader");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f4053a;

        static {
            HashMap map = new HashMap(31);
            f4053a = map;
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_checkout, map, "layout/activity_checkout_0", com.woolworths.R.layout.activity_main, "layout/activity_main_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.fragment_checkout_pay_services_error, map, "layout/fragment_checkout_pay_services_error_0", com.woolworths.R.layout.fragment_error_dialog, "layout/fragment_error_dialog_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.fragment_pay_for_order_digital, map, "layout/fragment_pay_for_order_digital_0", com.woolworths.R.layout.fragment_step_up, "layout/fragment_step_up_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.include_add_new_credit_card_digital, map, "layout/include_add_new_credit_card_digital_0", com.woolworths.R.layout.include_add_new_gift_card_digital, "layout/include_add_new_gift_card_digital_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.include_checkout_error_all_rounded, map, "layout/include_checkout_error_all_rounded_0", com.woolworths.R.layout.include_checkout_error_no_rounded, "layout/include_checkout_error_no_rounded_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.include_checkout_expired_error, map, "layout/include_checkout_expired_error_0", com.woolworths.R.layout.include_checkout_warning, "layout/include_checkout_warning_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.include_payment_deduction, map, "layout/include_payment_deduction_0", com.woolworths.R.layout.include_shopping_mode_app_bar_collapsed, "layout/include_shopping_mode_app_bar_collapsed_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.include_shopping_mode_app_bar_expanded, map, "layout/include_shopping_mode_app_bar_expanded_0", com.woolworths.R.layout.include_shopping_mode_dn_banner, "layout/include_shopping_mode_dn_banner_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.include_shopping_mode_fulfilment, map, "layout/include_shopping_mode_fulfilment_0", com.woolworths.R.layout.include_shopping_mode_fulfilment_no_window, "layout/include_shopping_mode_fulfilment_no_window_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.include_toolbar_home_collection_modes, map, "layout/include_toolbar_home_collection_modes_0", com.woolworths.R.layout.item_added_gift_card, "layout/item_added_gift_card_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.item_expired_credit_card, map, "layout/item_expired_credit_card_0", com.woolworths.R.layout.item_expired_gift_card, "layout/item_expired_gift_card_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.item_featured_brand, map, "layout/item_featured_brand_0", com.woolworths.R.layout.item_pagination_loader_view, "layout/item_pagination_loader_view_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.item_popular_search, map, "layout/item_popular_search_0", com.woolworths.R.layout.item_popular_search_header, "layout/item_popular_search_header_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.item_saved_credit_card, map, "layout/item_saved_credit_card_0", com.woolworths.R.layout.item_saved_gift_card, "layout/item_saved_gift_card_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.item_suggested_search, map, "layout/item_suggested_search_0", com.woolworths.R.layout.item_suggested_search_header, "layout/item_suggested_search_header_0");
            map.put("layout/tool_tip_content_with_title_0", Integer.valueOf(com.woolworths.R.layout.tool_tip_content_with_title));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(31);
        f4052a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.activity_checkout, 1);
        sparseIntArray.put(com.woolworths.R.layout.activity_main, 2);
        sparseIntArray.put(com.woolworths.R.layout.fragment_checkout_pay_services_error, 3);
        sparseIntArray.put(com.woolworths.R.layout.fragment_error_dialog, 4);
        sparseIntArray.put(com.woolworths.R.layout.fragment_pay_for_order_digital, 5);
        sparseIntArray.put(com.woolworths.R.layout.fragment_step_up, 6);
        sparseIntArray.put(com.woolworths.R.layout.include_add_new_credit_card_digital, 7);
        sparseIntArray.put(com.woolworths.R.layout.include_add_new_gift_card_digital, 8);
        sparseIntArray.put(com.woolworths.R.layout.include_checkout_error_all_rounded, 9);
        sparseIntArray.put(com.woolworths.R.layout.include_checkout_error_no_rounded, 10);
        sparseIntArray.put(com.woolworths.R.layout.include_checkout_expired_error, 11);
        sparseIntArray.put(com.woolworths.R.layout.include_checkout_warning, 12);
        sparseIntArray.put(com.woolworths.R.layout.include_payment_deduction, 13);
        sparseIntArray.put(com.woolworths.R.layout.include_shopping_mode_app_bar_collapsed, 14);
        sparseIntArray.put(com.woolworths.R.layout.include_shopping_mode_app_bar_expanded, 15);
        sparseIntArray.put(com.woolworths.R.layout.include_shopping_mode_dn_banner, 16);
        sparseIntArray.put(com.woolworths.R.layout.include_shopping_mode_fulfilment, 17);
        sparseIntArray.put(com.woolworths.R.layout.include_shopping_mode_fulfilment_no_window, 18);
        sparseIntArray.put(com.woolworths.R.layout.include_toolbar_home_collection_modes, 19);
        sparseIntArray.put(com.woolworths.R.layout.item_added_gift_card, 20);
        sparseIntArray.put(com.woolworths.R.layout.item_expired_credit_card, 21);
        sparseIntArray.put(com.woolworths.R.layout.item_expired_gift_card, 22);
        sparseIntArray.put(com.woolworths.R.layout.item_featured_brand, 23);
        sparseIntArray.put(com.woolworths.R.layout.item_pagination_loader_view, 24);
        sparseIntArray.put(com.woolworths.R.layout.item_popular_search, 25);
        sparseIntArray.put(com.woolworths.R.layout.item_popular_search_header, 26);
        sparseIntArray.put(com.woolworths.R.layout.item_saved_credit_card, 27);
        sparseIntArray.put(com.woolworths.R.layout.item_saved_gift_card, 28);
        sparseIntArray.put(com.woolworths.R.layout.item_suggested_search, 29);
        sparseIntArray.put(com.woolworths.R.layout.item_suggested_search_header, 30);
        sparseIntArray.put(com.woolworths.R.layout.tool_tip_content_with_title, 31);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(50);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.base.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.legacy.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.base.shopapp.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.checkbox.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.checkout.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.product.list.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.product.list.legacy.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.rewards.everydayextras.signup.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.shared.feedback.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.shared.instore.wifi.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.shared.receipt.details.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.shop.ask.olive.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.shop.barcode.scanner.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.shop.bundles.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.shop.catalogue.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.shop.delivery.address.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.shop.editorder.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.shop.haveyouforgotten.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.shop.homepage.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.shop.imagegallery.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.shop.login.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.shop.marketplace.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.shop.more.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.shop.myorders.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.shop.notification.preferences.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.shop.onboarding.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.shop.recipes.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.shop.storelocator.legacy.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.shop.voc.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.shop.weblink.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.foundation.rewards.offers.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.foundation.shop.editorder.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.marketing.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.product.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.product.details.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.promotion.banner.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.rewards.base.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shared.ui.views.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shop.addtolist.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shop.buyagain.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shop.cart.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shop.checkout.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shop.deliveryunlimited.signup.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shop.digipay.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shop.lists.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shop.product.navigation.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shop.productcard.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shop.rewards.DataBinderMapperImpl());
        arrayList.add(new com.airbnb.epoxy.databinding.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f4052a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            switch (i2) {
                case 1:
                    if ("layout/activity_checkout_0".equals(tag)) {
                        return new ActivityCheckoutBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for activity_checkout is invalid. Received: "));
                case 2:
                    if ("layout/activity_main_0".equals(tag)) {
                        return new ActivityMainBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for activity_main is invalid. Received: "));
                case 3:
                    if (!"layout/fragment_checkout_pay_services_error_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for fragment_checkout_pay_services_error is invalid. Received: "));
                    }
                    Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, FragmentCheckoutPayServicesErrorBindingImpl.C, FragmentCheckoutPayServicesErrorBindingImpl.D);
                    FragmentCheckoutPayServicesErrorBindingImpl fragmentCheckoutPayServicesErrorBindingImpl = new FragmentCheckoutPayServicesErrorBindingImpl(dataBindingComponent, view, (IncludeGenericErrorStateBinding) objArrT[2], (View) objArrT[1]);
                    fragmentCheckoutPayServicesErrorBindingImpl.B = -1L;
                    IncludeGenericErrorStateBinding includeGenericErrorStateBinding = fragmentCheckoutPayServicesErrorBindingImpl.y;
                    if (includeGenericErrorStateBinding != null) {
                        includeGenericErrorStateBinding.n = fragmentCheckoutPayServicesErrorBindingImpl;
                    }
                    ((ConstraintLayout) objArrT[0]).setTag(null);
                    fragmentCheckoutPayServicesErrorBindingImpl.E(view);
                    fragmentCheckoutPayServicesErrorBindingImpl.r();
                    return fragmentCheckoutPayServicesErrorBindingImpl;
                case 4:
                    if (!"layout/fragment_error_dialog_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for fragment_error_dialog is invalid. Received: "));
                    }
                    Object[] objArrT2 = ViewDataBinding.t(dataBindingComponent, view, 4, null, FragmentErrorDialogBindingImpl.D);
                    FragmentErrorDialogBindingImpl fragmentErrorDialogBindingImpl = new FragmentErrorDialogBindingImpl(dataBindingComponent, view, (Button) objArrT2[3], (ImageView) objArrT2[1], (TextView) objArrT2[2]);
                    fragmentErrorDialogBindingImpl.C = -1L;
                    ((LinearLayout) objArrT2[0]).setTag(null);
                    fragmentErrorDialogBindingImpl.E(view);
                    fragmentErrorDialogBindingImpl.r();
                    return fragmentErrorDialogBindingImpl;
                case 5:
                    if (!"layout/fragment_pay_for_order_digital_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for fragment_pay_for_order_digital is invalid. Received: "));
                    }
                    Object[] objArrT3 = ViewDataBinding.t(dataBindingComponent, view, 50, FragmentPayForOrderDigitalBindingImpl.q0, FragmentPayForOrderDigitalBindingImpl.r0);
                    LinearLayout linearLayout = (LinearLayout) objArrT3[43];
                    LinearLayout linearLayout2 = (LinearLayout) objArrT3[26];
                    LinearLayout linearLayout3 = (LinearLayout) objArrT3[31];
                    LinearLayout linearLayout4 = (LinearLayout) objArrT3[22];
                    LinearLayout linearLayout5 = (LinearLayout) objArrT3[18];
                    Space space = (Space) objArrT3[30];
                    TextView textView = (TextView) objArrT3[32];
                    IncludeAddNewCreditCardDigitalBinding includeAddNewCreditCardDigitalBinding = (IncludeAddNewCreditCardDigitalBinding) objArrT3[10];
                    TextView textView2 = (TextView) objArrT3[23];
                    IncludeAddNewGiftCardDigitalBinding includeAddNewGiftCardDigitalBinding = (IncludeAddNewGiftCardDigitalBinding) objArrT3[8];
                    LinearLayout linearLayout6 = (LinearLayout) objArrT3[4];
                    TextView textView3 = (TextView) objArrT3[36];
                    RecyclerView recyclerView = (RecyclerView) objArrT3[29];
                    LinearLayout linearLayout7 = (LinearLayout) objArrT3[41];
                    TextView textView4 = (TextView) objArrT3[42];
                    View view2 = (View) objArrT3[45];
                    TextView textView5 = (TextView) objArrT3[34];
                    TextView textView6 = (TextView) objArrT3[25];
                    RecyclerView recyclerView2 = (RecyclerView) objArrT3[28];
                    IncludeCheckoutExpiredErrorBinding includeCheckoutExpiredErrorBinding = (IncludeCheckoutExpiredErrorBinding) objArrT3[9];
                    IncludeCheckoutExpiredErrorBinding includeCheckoutExpiredErrorBinding2 = (IncludeCheckoutExpiredErrorBinding) objArrT3[6];
                    RecyclerView recyclerView3 = (RecyclerView) objArrT3[20];
                    RecyclerView recyclerView4 = (RecyclerView) objArrT3[21];
                    LinearLayout linearLayout8 = (LinearLayout) objArrT3[16];
                    IncludeGenericInlineErrorStateBinding includeGenericInlineErrorStateBinding = (IncludeGenericInlineErrorStateBinding) objArrT3[12];
                    TextView textView7 = (TextView) objArrT3[37];
                    TextView textView8 = (TextView) objArrT3[33];
                    TextView textView9 = (TextView) objArrT3[24];
                    TextView textView10 = (TextView) objArrT3[48];
                    View view3 = (View) objArrT3[38];
                    TextView textView11 = (TextView) objArrT3[39];
                    FrameLayout frameLayout = (FrameLayout) objArrT3[35];
                    IncludePaymentDeductionBinding includePaymentDeductionBinding = (IncludePaymentDeductionBinding) objArrT3[11];
                    ImageView imageView = (ImageView) objArrT3[40];
                    LinearLayout linearLayout9 = (LinearLayout) objArrT3[2];
                    FragmentPayForOrderDigitalBindingImpl fragmentPayForOrderDigitalBindingImpl = new FragmentPayForOrderDigitalBindingImpl(dataBindingComponent, view, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, space, textView, includeAddNewCreditCardDigitalBinding, textView2, includeAddNewGiftCardDigitalBinding, linearLayout6, textView3, recyclerView, linearLayout7, textView4, view2, textView5, textView6, recyclerView2, includeCheckoutExpiredErrorBinding, includeCheckoutExpiredErrorBinding2, recyclerView3, recyclerView4, linearLayout8, includeGenericInlineErrorStateBinding, textView7, textView8, textView9, textView10, view3, textView11, frameLayout, includePaymentDeductionBinding, imageView, linearLayout9, (IncludeCheckoutErrorNoRoundedBinding) objArrT3[5], (Button) objArrT3[49], (IncludeCheckoutWarningBinding) objArrT3[7], (TextView) objArrT3[46], (TextView) objArrT3[47], (LinearLayout) objArrT3[1], (NestedScrollView) objArrT3[13]);
                    fragmentPayForOrderDigitalBindingImpl.p0 = -1L;
                    IncludeAddNewCreditCardDigitalBinding includeAddNewCreditCardDigitalBinding2 = fragmentPayForOrderDigitalBindingImpl.F;
                    if (includeAddNewCreditCardDigitalBinding2 != null) {
                        includeAddNewCreditCardDigitalBinding2.n = fragmentPayForOrderDigitalBindingImpl;
                    }
                    IncludeAddNewGiftCardDigitalBinding includeAddNewGiftCardDigitalBinding2 = fragmentPayForOrderDigitalBindingImpl.H;
                    if (includeAddNewGiftCardDigitalBinding2 != null) {
                        includeAddNewGiftCardDigitalBinding2.n = fragmentPayForOrderDigitalBindingImpl;
                    }
                    fragmentPayForOrderDigitalBindingImpl.I.setTag(null);
                    IncludeCheckoutExpiredErrorBinding includeCheckoutExpiredErrorBinding3 = fragmentPayForOrderDigitalBindingImpl.R;
                    if (includeCheckoutExpiredErrorBinding3 != null) {
                        includeCheckoutExpiredErrorBinding3.n = fragmentPayForOrderDigitalBindingImpl;
                    }
                    IncludeCheckoutExpiredErrorBinding includeCheckoutExpiredErrorBinding4 = fragmentPayForOrderDigitalBindingImpl.S;
                    if (includeCheckoutExpiredErrorBinding4 != null) {
                        includeCheckoutExpiredErrorBinding4.n = fragmentPayForOrderDigitalBindingImpl;
                    }
                    IncludeGenericInlineErrorStateBinding includeGenericInlineErrorStateBinding2 = fragmentPayForOrderDigitalBindingImpl.W;
                    if (includeGenericInlineErrorStateBinding2 != null) {
                        includeGenericInlineErrorStateBinding2.n = fragmentPayForOrderDigitalBindingImpl;
                    }
                    ((ConstraintLayout) objArrT3[0]).setTag(null);
                    ((LinearLayout) objArrT3[3]).setTag(null);
                    IncludePaymentDeductionBinding includePaymentDeductionBinding2 = fragmentPayForOrderDigitalBindingImpl.e0;
                    if (includePaymentDeductionBinding2 != null) {
                        includePaymentDeductionBinding2.n = fragmentPayForOrderDigitalBindingImpl;
                    }
                    fragmentPayForOrderDigitalBindingImpl.g0.setTag(null);
                    IncludeCheckoutErrorNoRoundedBinding includeCheckoutErrorNoRoundedBinding = fragmentPayForOrderDigitalBindingImpl.h0;
                    if (includeCheckoutErrorNoRoundedBinding != null) {
                        includeCheckoutErrorNoRoundedBinding.n = fragmentPayForOrderDigitalBindingImpl;
                    }
                    IncludeCheckoutWarningBinding includeCheckoutWarningBinding = fragmentPayForOrderDigitalBindingImpl.j0;
                    if (includeCheckoutWarningBinding != null) {
                        includeCheckoutWarningBinding.n = fragmentPayForOrderDigitalBindingImpl;
                    }
                    fragmentPayForOrderDigitalBindingImpl.m0.setTag(null);
                    fragmentPayForOrderDigitalBindingImpl.E(view);
                    fragmentPayForOrderDigitalBindingImpl.r();
                    return fragmentPayForOrderDigitalBindingImpl;
                case 6:
                    if (!"layout/fragment_step_up_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for fragment_step_up is invalid. Received: "));
                    }
                    Object[] objArrT4 = ViewDataBinding.t(dataBindingComponent, view, 10, FragmentStepUpBindingImpl.G, FragmentStepUpBindingImpl.H);
                    Button button = (Button) objArrT4[8];
                    IncludeCheckoutErrorAllRoundedBinding includeCheckoutErrorAllRoundedBinding = (IncludeCheckoutErrorAllRoundedBinding) objArrT4[1];
                    TextView textView12 = (TextView) objArrT4[5];
                    LinearLayout linearLayout10 = (LinearLayout) objArrT4[6];
                    View view4 = (View) objArrT4[7];
                    FragmentStepUpBindingImpl fragmentStepUpBindingImpl = new FragmentStepUpBindingImpl(dataBindingComponent, view, button, includeCheckoutErrorAllRoundedBinding, textView12, linearLayout10, view4, (Button) objArrT4[9]);
                    fragmentStepUpBindingImpl.F = -1L;
                    IncludeCheckoutErrorAllRoundedBinding includeCheckoutErrorAllRoundedBinding2 = fragmentStepUpBindingImpl.z;
                    if (includeCheckoutErrorAllRoundedBinding2 != null) {
                        includeCheckoutErrorAllRoundedBinding2.n = fragmentStepUpBindingImpl;
                    }
                    ((LinearLayout) objArrT4[0]).setTag(null);
                    fragmentStepUpBindingImpl.E(view);
                    fragmentStepUpBindingImpl.r();
                    return fragmentStepUpBindingImpl;
                case 7:
                    if (!"layout/include_add_new_credit_card_digital_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for include_add_new_credit_card_digital is invalid. Received: "));
                    }
                    Object[] objArrT5 = ViewDataBinding.t(dataBindingComponent, view, 18, IncludeAddNewCreditCardDigitalBindingImpl.P, IncludeAddNewCreditCardDigitalBindingImpl.Q);
                    LinearLayout linearLayout11 = (LinearLayout) objArrT5[12];
                    IncludeCheckoutErrorNoRoundedBinding includeCheckoutErrorNoRoundedBinding2 = (IncludeCheckoutErrorNoRoundedBinding) objArrT5[2];
                    ImageView imageView2 = (ImageView) objArrT5[15];
                    TextView textView13 = (TextView) objArrT5[11];
                    LinearLayout linearLayout12 = (LinearLayout) objArrT5[8];
                    LinearLayout linearLayout13 = (LinearLayout) objArrT5[0];
                    IncludePaymentDeductionBinding includePaymentDeductionBinding3 = (IncludePaymentDeductionBinding) objArrT5[3];
                    LinearLayout linearLayout14 = (LinearLayout) objArrT5[1];
                    ImageView imageView3 = (ImageView) objArrT5[16];
                    LinearLayout linearLayout15 = (LinearLayout) objArrT5[4];
                    IncludeAddNewCreditCardDigitalBindingImpl includeAddNewCreditCardDigitalBindingImpl = new IncludeAddNewCreditCardDigitalBindingImpl(dataBindingComponent, view, linearLayout11, includeCheckoutErrorNoRoundedBinding2, imageView2, textView13, linearLayout12, linearLayout13, includePaymentDeductionBinding3, linearLayout14, imageView3, linearLayout15, (ImageView) objArrT5[17], (ImageView) objArrT5[14], (Button) objArrT5[6], (LinearLayout) objArrT5[9], (AppCompatCheckBox) objArrT5[10], (ImageView) objArrT5[13]);
                    includeAddNewCreditCardDigitalBindingImpl.O = -1L;
                    IncludeCheckoutErrorNoRoundedBinding includeCheckoutErrorNoRoundedBinding3 = includeAddNewCreditCardDigitalBindingImpl.z;
                    if (includeCheckoutErrorNoRoundedBinding3 != null) {
                        includeCheckoutErrorNoRoundedBinding3.n = includeAddNewCreditCardDigitalBindingImpl;
                    }
                    includeAddNewCreditCardDigitalBindingImpl.D.setTag(null);
                    IncludePaymentDeductionBinding includePaymentDeductionBinding4 = includeAddNewCreditCardDigitalBindingImpl.E;
                    if (includePaymentDeductionBinding4 != null) {
                        includePaymentDeductionBinding4.n = includeAddNewCreditCardDigitalBindingImpl;
                    }
                    includeAddNewCreditCardDigitalBindingImpl.F.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, includeAddNewCreditCardDigitalBindingImpl);
                    includeAddNewCreditCardDigitalBindingImpl.r();
                    return includeAddNewCreditCardDigitalBindingImpl;
                case 8:
                    if (!"layout/include_add_new_gift_card_digital_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for include_add_new_gift_card_digital is invalid. Received: "));
                    }
                    Object[] objArrT6 = ViewDataBinding.t(dataBindingComponent, view, 14, IncludeAddNewGiftCardDigitalBindingImpl.N, IncludeAddNewGiftCardDigitalBindingImpl.O);
                    IncludeAddNewGiftCardDigitalBindingImpl includeAddNewGiftCardDigitalBindingImpl = new IncludeAddNewGiftCardDigitalBindingImpl(dataBindingComponent, view, (IncludeCheckoutErrorNoRoundedBinding) objArrT6[2], (ImageView) objArrT6[5], (IncludeCheckoutWarningBinding) objArrT6[1], (LinearLayout) objArrT6[4], (LinearLayout) objArrT6[0], (RecyclerView) objArrT6[3], (EditText) objArrT6[6], (EditText) objArrT6[7], (TextView) objArrT6[13], (TextView) objArrT6[10], (LinearLayout) objArrT6[8], (TextView) objArrT6[9], (EditText) objArrT6[11], (AppCompatCheckBox) objArrT6[12]);
                    includeAddNewGiftCardDigitalBindingImpl.M = -1L;
                    IncludeCheckoutErrorNoRoundedBinding includeCheckoutErrorNoRoundedBinding4 = includeAddNewGiftCardDigitalBindingImpl.y;
                    if (includeCheckoutErrorNoRoundedBinding4 != null) {
                        includeCheckoutErrorNoRoundedBinding4.n = includeAddNewGiftCardDigitalBindingImpl;
                    }
                    IncludeCheckoutWarningBinding includeCheckoutWarningBinding2 = includeAddNewGiftCardDigitalBindingImpl.A;
                    if (includeCheckoutWarningBinding2 != null) {
                        includeCheckoutWarningBinding2.n = includeAddNewGiftCardDigitalBindingImpl;
                    }
                    includeAddNewGiftCardDigitalBindingImpl.C.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, includeAddNewGiftCardDigitalBindingImpl);
                    includeAddNewGiftCardDigitalBindingImpl.r();
                    return includeAddNewGiftCardDigitalBindingImpl;
                case 9:
                    if (!"layout/include_checkout_error_all_rounded_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for include_checkout_error_all_rounded is invalid. Received: "));
                    }
                    Object[] objArrT7 = ViewDataBinding.t(dataBindingComponent, view, 3, null, IncludeCheckoutErrorAllRoundedBindingImpl.B);
                    IncludeCheckoutErrorAllRoundedBindingImpl includeCheckoutErrorAllRoundedBindingImpl = new IncludeCheckoutErrorAllRoundedBindingImpl(view, (LinearLayout) objArrT7[0], (TextView) objArrT7[2], dataBindingComponent);
                    includeCheckoutErrorAllRoundedBindingImpl.A = -1L;
                    includeCheckoutErrorAllRoundedBindingImpl.y.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, includeCheckoutErrorAllRoundedBindingImpl);
                    includeCheckoutErrorAllRoundedBindingImpl.r();
                    return includeCheckoutErrorAllRoundedBindingImpl;
                case 10:
                    if (!"layout/include_checkout_error_no_rounded_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for include_checkout_error_no_rounded is invalid. Received: "));
                    }
                    Object[] objArrT8 = ViewDataBinding.t(dataBindingComponent, view, 3, null, IncludeCheckoutErrorNoRoundedBindingImpl.B);
                    IncludeCheckoutErrorNoRoundedBindingImpl includeCheckoutErrorNoRoundedBindingImpl = new IncludeCheckoutErrorNoRoundedBindingImpl(view, (LinearLayout) objArrT8[0], (TextView) objArrT8[2], dataBindingComponent);
                    includeCheckoutErrorNoRoundedBindingImpl.A = -1L;
                    includeCheckoutErrorNoRoundedBindingImpl.y.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, includeCheckoutErrorNoRoundedBindingImpl);
                    includeCheckoutErrorNoRoundedBindingImpl.r();
                    return includeCheckoutErrorNoRoundedBindingImpl;
                case 11:
                    if (!"layout/include_checkout_expired_error_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for include_checkout_expired_error is invalid. Received: "));
                    }
                    Object[] objArrT9 = ViewDataBinding.t(dataBindingComponent, view, 3, null, IncludeCheckoutExpiredErrorBindingImpl.B);
                    IncludeCheckoutExpiredErrorBindingImpl includeCheckoutExpiredErrorBindingImpl = new IncludeCheckoutExpiredErrorBindingImpl(view, (LinearLayout) objArrT9[0], (TextView) objArrT9[2], dataBindingComponent);
                    includeCheckoutExpiredErrorBindingImpl.A = -1L;
                    includeCheckoutExpiredErrorBindingImpl.z.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, includeCheckoutExpiredErrorBindingImpl);
                    includeCheckoutExpiredErrorBindingImpl.r();
                    return includeCheckoutExpiredErrorBindingImpl;
                case 12:
                    if (!"layout/include_checkout_warning_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for include_checkout_warning is invalid. Received: "));
                    }
                    Object[] objArrT10 = ViewDataBinding.t(dataBindingComponent, view, 3, null, IncludeCheckoutWarningBindingImpl.B);
                    TextView textView14 = (TextView) objArrT10[2];
                    IncludeCheckoutWarningBindingImpl includeCheckoutWarningBindingImpl = new IncludeCheckoutWarningBindingImpl(view, (LinearLayout) objArrT10[0], textView14, dataBindingComponent);
                    includeCheckoutWarningBindingImpl.A = -1L;
                    includeCheckoutWarningBindingImpl.z.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, includeCheckoutWarningBindingImpl);
                    includeCheckoutWarningBindingImpl.r();
                    return includeCheckoutWarningBindingImpl;
                case 13:
                    if (!"layout/include_payment_deduction_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for include_payment_deduction is invalid. Received: "));
                    }
                    Object[] objArrT11 = ViewDataBinding.t(dataBindingComponent, view, 3, null, IncludePaymentDeductionBindingImpl.B);
                    LinearLayout linearLayout16 = (LinearLayout) objArrT11[0];
                    IncludePaymentDeductionBindingImpl includePaymentDeductionBindingImpl = new IncludePaymentDeductionBindingImpl(view, linearLayout16, (TextView) objArrT11[2], dataBindingComponent);
                    includePaymentDeductionBindingImpl.A = -1L;
                    includePaymentDeductionBindingImpl.y.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, includePaymentDeductionBindingImpl);
                    includePaymentDeductionBindingImpl.r();
                    return includePaymentDeductionBindingImpl;
                case 14:
                    if ("layout/include_shopping_mode_app_bar_collapsed_0".equals(tag)) {
                        return new IncludeShoppingModeAppBarCollapsedBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for include_shopping_mode_app_bar_collapsed is invalid. Received: "));
                case 15:
                    if ("layout/include_shopping_mode_app_bar_expanded_0".equals(tag)) {
                        return new IncludeShoppingModeAppBarExpandedBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for include_shopping_mode_app_bar_expanded is invalid. Received: "));
                case 16:
                    if (!"layout/include_shopping_mode_dn_banner_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for include_shopping_mode_dn_banner is invalid. Received: "));
                    }
                    Object[] objArrT12 = ViewDataBinding.t(dataBindingComponent, view, 5, null, IncludeShoppingModeDnBannerBindingImpl.z);
                    IncludeShoppingModeDnBannerBindingImpl includeShoppingModeDnBannerBindingImpl = new IncludeShoppingModeDnBannerBindingImpl(dataBindingComponent, view, 0);
                    includeShoppingModeDnBannerBindingImpl.y = -1L;
                    ((ConstraintLayout) objArrT12[0]).setTag(null);
                    includeShoppingModeDnBannerBindingImpl.E(view);
                    includeShoppingModeDnBannerBindingImpl.r();
                    return includeShoppingModeDnBannerBindingImpl;
                case 17:
                    if (!"layout/include_shopping_mode_fulfilment_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for include_shopping_mode_fulfilment is invalid. Received: "));
                    }
                    Object[] objArrT13 = ViewDataBinding.t(dataBindingComponent, view, 5, IncludeShoppingModeFulfilmentBindingImpl.E, IncludeShoppingModeFulfilmentBindingImpl.F);
                    EpoxyItemButtonBinding epoxyItemButtonBinding = (EpoxyItemButtonBinding) objArrT13[3];
                    TextView textView15 = (TextView) objArrT13[2];
                    TextView textView16 = (TextView) objArrT13[1];
                    IncludeShoppingModeFulfilmentBindingImpl includeShoppingModeFulfilmentBindingImpl = new IncludeShoppingModeFulfilmentBindingImpl(dataBindingComponent, view, epoxyItemButtonBinding, textView15, textView16);
                    includeShoppingModeFulfilmentBindingImpl.D = -1L;
                    EpoxyItemButtonBinding epoxyItemButtonBinding2 = includeShoppingModeFulfilmentBindingImpl.y;
                    if (epoxyItemButtonBinding2 != null) {
                        epoxyItemButtonBinding2.n = includeShoppingModeFulfilmentBindingImpl;
                    }
                    ((ConstraintLayout) objArrT13[0]).setTag(null);
                    includeShoppingModeFulfilmentBindingImpl.z.setTag(null);
                    includeShoppingModeFulfilmentBindingImpl.A.setTag(null);
                    includeShoppingModeFulfilmentBindingImpl.E(view);
                    includeShoppingModeFulfilmentBindingImpl.r();
                    return includeShoppingModeFulfilmentBindingImpl;
                case 18:
                    if ("layout/include_shopping_mode_fulfilment_no_window_0".equals(tag)) {
                        return new IncludeShoppingModeFulfilmentNoWindowBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for include_shopping_mode_fulfilment_no_window is invalid. Received: "));
                case 19:
                    if ("layout/include_toolbar_home_collection_modes_0".equals(tag)) {
                        return new IncludeToolbarHomeCollectionModesBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for include_toolbar_home_collection_modes is invalid. Received: "));
                case 20:
                    if (!"layout/item_added_gift_card_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for item_added_gift_card is invalid. Received: "));
                    }
                    Object[] objArrT14 = ViewDataBinding.t(dataBindingComponent, view, 15, ItemAddedGiftCardBindingImpl.J, ItemAddedGiftCardBindingImpl.K);
                    TextView textView17 = (TextView) objArrT14[6];
                    TextView textView18 = (TextView) objArrT14[5];
                    ConstraintLayout constraintLayout = (ConstraintLayout) objArrT14[2];
                    TextView textView19 = (TextView) objArrT14[8];
                    View view5 = (View) objArrT14[11];
                    LinearLayout linearLayout17 = (LinearLayout) objArrT14[7];
                    IncludeCheckoutErrorNoRoundedBinding includeCheckoutErrorNoRoundedBinding5 = (IncludeCheckoutErrorNoRoundedBinding) objArrT14[1];
                    EditText editText = (EditText) objArrT14[10];
                    ItemAddedGiftCardBindingImpl itemAddedGiftCardBindingImpl = new ItemAddedGiftCardBindingImpl(dataBindingComponent, view, textView17, textView18, constraintLayout, textView19, view5, linearLayout17, includeCheckoutErrorNoRoundedBinding5, editText, (TextView) objArrT14[13], (AppCompatCheckBox) objArrT14[12]);
                    itemAddedGiftCardBindingImpl.I = -1L;
                    IncludeCheckoutErrorNoRoundedBinding includeCheckoutErrorNoRoundedBinding6 = itemAddedGiftCardBindingImpl.E;
                    if (includeCheckoutErrorNoRoundedBinding6 != null) {
                        includeCheckoutErrorNoRoundedBinding6.n = itemAddedGiftCardBindingImpl;
                    }
                    ((LinearLayout) objArrT14[0]).setTag(null);
                    itemAddedGiftCardBindingImpl.E(view);
                    itemAddedGiftCardBindingImpl.r();
                    return itemAddedGiftCardBindingImpl;
                case 21:
                    if (!"layout/item_expired_credit_card_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for item_expired_credit_card is invalid. Received: "));
                    }
                    Object[] objArrT15 = ViewDataBinding.t(dataBindingComponent, view, 20, ItemExpiredCreditCardBindingImpl.S, ItemExpiredCreditCardBindingImpl.T);
                    Button button2 = (Button) objArrT15[15];
                    IncludeCheckoutErrorNoRoundedBinding includeCheckoutErrorNoRoundedBinding7 = (IncludeCheckoutErrorNoRoundedBinding) objArrT15[2];
                    TextView textView20 = (TextView) objArrT15[10];
                    View view6 = (View) objArrT15[13];
                    LinearLayout linearLayout18 = (LinearLayout) objArrT15[14];
                    LinearLayout linearLayout19 = (LinearLayout) objArrT15[1];
                    TextView textView21 = (TextView) objArrT15[8];
                    LinearLayout linearLayout20 = (LinearLayout) objArrT15[3];
                    LinearLayout linearLayout21 = (LinearLayout) objArrT15[12];
                    View view7 = (View) objArrT15[11];
                    LinearLayout linearLayout22 = (LinearLayout) objArrT15[17];
                    ItemExpiredCreditCardBindingImpl itemExpiredCreditCardBindingImpl = new ItemExpiredCreditCardBindingImpl(dataBindingComponent, view, button2, includeCheckoutErrorNoRoundedBinding7, textView20, view6, linearLayout18, linearLayout19, textView21, linearLayout20, linearLayout21, view7, linearLayout22, (Button) objArrT15[19], (TextView) objArrT15[9], (TextView) objArrT15[7], (ImageView) objArrT15[4], (LinearLayout) objArrT15[0], (TextView) objArrT15[6], (Button) objArrT15[16], (View) objArrT15[5]);
                    itemExpiredCreditCardBindingImpl.R = -1L;
                    IncludeCheckoutErrorNoRoundedBinding includeCheckoutErrorNoRoundedBinding8 = itemExpiredCreditCardBindingImpl.z;
                    if (includeCheckoutErrorNoRoundedBinding8 != null) {
                        includeCheckoutErrorNoRoundedBinding8.n = itemExpiredCreditCardBindingImpl;
                    }
                    itemExpiredCreditCardBindingImpl.D.setTag(null);
                    itemExpiredCreditCardBindingImpl.N.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, itemExpiredCreditCardBindingImpl);
                    itemExpiredCreditCardBindingImpl.r();
                    return itemExpiredCreditCardBindingImpl;
                case 22:
                    if (!"layout/item_expired_gift_card_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for item_expired_gift_card is invalid. Received: "));
                    }
                    Object[] objArrT16 = ViewDataBinding.t(dataBindingComponent, view, 9, null, ItemExpiredGiftCardBindingImpl.H);
                    TextView textView22 = (TextView) objArrT16[6];
                    TextView textView23 = (TextView) objArrT16[5];
                    TextView textView24 = (TextView) objArrT16[8];
                    TextView textView25 = (TextView) objArrT16[7];
                    TextView textView26 = (TextView) objArrT16[4];
                    ItemExpiredGiftCardBindingImpl itemExpiredGiftCardBindingImpl = new ItemExpiredGiftCardBindingImpl(dataBindingComponent, view, textView22, textView23, textView24, textView25, textView26, (LinearLayout) objArrT16[0], (TextView) objArrT16[3], (View) objArrT16[2]);
                    itemExpiredGiftCardBindingImpl.G = -1L;
                    itemExpiredGiftCardBindingImpl.D.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, itemExpiredGiftCardBindingImpl);
                    itemExpiredGiftCardBindingImpl.r();
                    return itemExpiredGiftCardBindingImpl;
                case 23:
                    if ("layout/item_featured_brand_0".equals(tag)) {
                        return new ItemFeaturedBrandBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for item_featured_brand is invalid. Received: "));
                case 24:
                    if (!"layout/item_pagination_loader_view_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for item_pagination_loader_view is invalid. Received: "));
                    }
                    Object[] objArrT17 = ViewDataBinding.t(dataBindingComponent, view, 5, null, ItemPaginationLoaderViewBindingImpl.z);
                    ItemPaginationLoaderViewBindingImpl itemPaginationLoaderViewBindingImpl = new ItemPaginationLoaderViewBindingImpl(dataBindingComponent, view, 0);
                    itemPaginationLoaderViewBindingImpl.y = -1L;
                    ((RelativeLayout) objArrT17[0]).setTag(null);
                    itemPaginationLoaderViewBindingImpl.E(view);
                    itemPaginationLoaderViewBindingImpl.r();
                    return itemPaginationLoaderViewBindingImpl;
                case 25:
                    if (!"layout/item_popular_search_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for item_popular_search is invalid. Received: "));
                    }
                    Object[] objArrT18 = ViewDataBinding.t(dataBindingComponent, view, 3, null, ItemPopularSearchBindingImpl.B);
                    ItemPopularSearchBindingImpl itemPopularSearchBindingImpl = new ItemPopularSearchBindingImpl(dataBindingComponent, view, (TextView) objArrT18[2]);
                    itemPopularSearchBindingImpl.A = -1L;
                    ((ConstraintLayout) objArrT18[0]).setTag(null);
                    itemPopularSearchBindingImpl.E(view);
                    itemPopularSearchBindingImpl.r();
                    return itemPopularSearchBindingImpl;
                case 26:
                    if (!"layout/item_popular_search_header_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for item_popular_search_header is invalid. Received: "));
                    }
                    Object[] objArrT19 = ViewDataBinding.t(dataBindingComponent, view, 3, null, ItemPopularSearchHeaderBindingImpl.C);
                    ItemPopularSearchHeaderBindingImpl itemPopularSearchHeaderBindingImpl = new ItemPopularSearchHeaderBindingImpl(view, (Button) objArrT19[2], (TextView) objArrT19[1], dataBindingComponent);
                    itemPopularSearchHeaderBindingImpl.B = -1L;
                    ((ConstraintLayout) objArrT19[0]).setTag(null);
                    itemPopularSearchHeaderBindingImpl.E(view);
                    itemPopularSearchHeaderBindingImpl.r();
                    return itemPopularSearchHeaderBindingImpl;
                case 27:
                    if ("layout/item_saved_credit_card_0".equals(tag)) {
                        return new ItemSavedCreditCardBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for item_saved_credit_card is invalid. Received: "));
                case 28:
                    if ("layout/item_saved_gift_card_0".equals(tag)) {
                        return new ItemSavedGiftCardBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for item_saved_gift_card is invalid. Received: "));
                case 29:
                    if (!"layout/item_suggested_search_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for item_suggested_search is invalid. Received: "));
                    }
                    Object[] objArrT20 = ViewDataBinding.t(dataBindingComponent, view, 3, null, ItemSuggestedSearchBindingImpl.B);
                    ItemSuggestedSearchBindingImpl itemSuggestedSearchBindingImpl = new ItemSuggestedSearchBindingImpl(dataBindingComponent, view, (TextView) objArrT20[2]);
                    itemSuggestedSearchBindingImpl.A = -1L;
                    ((ConstraintLayout) objArrT20[0]).setTag(null);
                    itemSuggestedSearchBindingImpl.E(view);
                    itemSuggestedSearchBindingImpl.r();
                    return itemSuggestedSearchBindingImpl;
                case 30:
                    if (!"layout/item_suggested_search_header_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for item_suggested_search_header is invalid. Received: "));
                    }
                    Object[] objArrT21 = ViewDataBinding.t(dataBindingComponent, view, 3, null, ItemSuggestedSearchHeaderBindingImpl.C);
                    ItemSuggestedSearchHeaderBindingImpl itemSuggestedSearchHeaderBindingImpl = new ItemSuggestedSearchHeaderBindingImpl(view, (Button) objArrT21[2], (TextView) objArrT21[1], dataBindingComponent);
                    itemSuggestedSearchHeaderBindingImpl.B = -1L;
                    ((ConstraintLayout) objArrT21[0]).setTag(null);
                    itemSuggestedSearchHeaderBindingImpl.E(view);
                    itemSuggestedSearchHeaderBindingImpl.r();
                    return itemSuggestedSearchHeaderBindingImpl;
                case 31:
                    if ("layout/tool_tip_content_with_title_0".equals(tag)) {
                        return new ToolTipContentWithTitleBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for tool_tip_content_with_title is invalid. Received: "));
            }
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f4052a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f4053a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
