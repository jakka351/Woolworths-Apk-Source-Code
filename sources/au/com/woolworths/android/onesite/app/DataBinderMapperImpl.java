package au.com.woolworths.android.onesite.app;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.models.notification.NotificationResult;
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
    public static final SparseIntArray f4214a = new SparseIntArray(0);

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = au.com.woolworths.android.onesite.a.b(277, 0, 1, "_all", UrlHandler.ACTION);
            sparseArrayB.put(2, "actionListener");
            sparseArrayB.put(3, "actionState");
            sparseArrayB.put(4, "address");
            sparseArrayB.put(5, "allowQuantityUpdate");
            sparseArrayB.put(6, "amountColorRes");
            sparseArrayB.put(7, "asset");
            sparseArrayB.put(8, "backgroundColor");
            sparseArrayB.put(9, "backingImageLoaderListener");
            sparseArrayB.put(10, "badgeImageUrl");
            sparseArrayB.put(11, "banner");
            sparseArrayB.put(12, "bannerAsset");
            sparseArrayB.put(13, "bannerIcon");
            sparseArrayB.put(14, "bannerState");
            sparseArrayB.put(15, "barcodeData");
            sparseArrayB.put(16, "billingAddress");
            sparseArrayB.put(17, "body");
            sparseArrayB.put(18, "boostAllBannerState");
            sparseArrayB.put(19, "boostAnimationVisibility");
            sparseArrayB.put(20, "boostViewListener");
            sparseArrayB.put(21, "brandLabel");
            sparseArrayB.put(22, "bundleData");
            sparseArrayB.put(23, "button");
            sparseArrayB.put(24, "buttonText");
            sparseArrayB.put(25, "buttonTint");
            sparseArrayB.put(26, "buttonTitle");
            sparseArrayB.put(27, NotificationResult.Notification.CAMPAIGN);
            sparseArrayB.put(28, "canShowWatchlist");
            sparseArrayB.put(29, "cardCaptureHandler");
            sparseArrayB.put(30, "cart");
            sparseArrayB.put(31, "cartButton");
            sparseArrayB.put(32, "cataloguePage");
            sparseArrayB.put(33, "cents");
            sparseArrayB.put(34, "checkboxText");
            sparseArrayB.put(35, "clickHandler");
            sparseArrayB.put(36, "clickHandlers");
            sparseArrayB.put(37, "clickListener");
            sparseArrayB.put(38, "coachMark");
            sparseArrayB.put(39, "collectionMethodOption");
            sparseArrayB.put(40, "collectionMode");
            sparseArrayB.put(41, "collectionModeLabel");
            sparseArrayB.put(42, "collectionModeLocation");
            sparseArrayB.put(43, "color");
            sparseArrayB.put(44, "colorName");
            sparseArrayB.put(45, "condition");
            sparseArrayB.put(46, "containerTitle");
            sparseArrayB.put(47, "content");
            sparseArrayB.put(48, "contentDescription");
            sparseArrayB.put(49, "count");
            sparseArrayB.put(50, "countLabel");
            sparseArrayB.put(51, "cta");
            sparseArrayB.put(52, "ctaText");
            sparseArrayB.put(53, "data");
            sparseArrayB.put(54, "deliveryNowClickHandler");
            sparseArrayB.put(55, "deliveryNowWindow");
            sparseArrayB.put(56, lqlqqlq.mmm006Dm006Dm);
            sparseArrayB.put(57, "descriptionText");
            sparseArrayB.put(58, "directToBootNowWindow");
            sparseArrayB.put(59, "discountItem");
            sparseArrayB.put(60, "dispatchNote");
            sparseArrayB.put(61, "displayExpiryExtended");
            sparseArrayB.put(62, "displayFreeTextClearIcon");
            sparseArrayB.put(63, "displayFreeTextSearchIcon");
            sparseArrayB.put(64, "displayName");
            sparseArrayB.put(65, "dollars");
            sparseArrayB.put(66, "dummyBannerData");
            sparseArrayB.put(67, "dummyBannerVisibility");
            sparseArrayB.put(68, "emptyState");
            sparseArrayB.put(69, "enableBoostAnimationContainerGap");
            sparseArrayB.put(70, "enabled");
            sparseArrayB.put(71, "errorBody");
            sparseArrayB.put(72, "errorHeader");
            sparseArrayB.put(73, "errorLabelText");
            sparseArrayB.put(74, "errorListener");
            sparseArrayB.put(75, "errorMessage");
            sparseArrayB.put(76, "errorState");
            sparseArrayB.put(77, "errorsHandler");
            sparseArrayB.put(78, "eventHandler");
            sparseArrayB.put(79, "filter");
            sparseArrayB.put(80, "filterMenuItem");
            sparseArrayB.put(81, "filterOption");
            sparseArrayB.put(82, "filterOptionClickListener");
            sparseArrayB.put(83, "footer");
            sparseArrayB.put(84, "freshMagContent");
            sparseArrayB.put(85, "freshMagHomeListener");
            sparseArrayB.put(86, "fulfilmentWindow");
            sparseArrayB.put(87, "fulfilmentWindowState");
            sparseArrayB.put(88, "fulfilmentWindows");
            sparseArrayB.put(89, "fulfilmentWindowsOption");
            sparseArrayB.put(90, "fulfilmentWindowsSlot");
            sparseArrayB.put(91, "groupTitle");
            sparseArrayB.put(92, "handler");
            sparseArrayB.put(93, "handlers");
            sparseArrayB.put(94, "hasHorizontalPadding");
            sparseArrayB.put(95, "hasItemsToWeigh");
            sparseArrayB.put(96, "hasUnreadMessages");
            sparseArrayB.put(97, "header");
            sparseArrayB.put(98, "headerIsClickable");
            sparseArrayB.put(99, "heightRes");
            sparseArrayB.put(100, "hostScreen");
            sparseArrayB.put(101, "hostViewListener");
            sparseArrayB.put(102, "htmlListener");
            sparseArrayB.put(103, "iconResId");
            sparseArrayB.put(104, "imageItem");
            sparseArrayB.put(105, "imageLoadListener");
            sparseArrayB.put(106, "imageLoaderListener");
            sparseArrayB.put(107, "imageUrl");
            sparseArrayB.put(108, "importantForAccessibility");
            sparseArrayB.put(109, "inMappedStore");
            sparseArrayB.put(110, "index");
            sparseArrayB.put(111, "info");
            sparseArrayB.put(112, "infoBarType");
            sparseArrayB.put(113, "infoIconClickHandler");
            sparseArrayB.put(114, "infoSectionItem");
            sparseArrayB.put(115, "infoView");
            sparseArrayB.put(116, "inlineError");
            sparseArrayB.put(117, "inlineMessage");
            sparseArrayB.put(118, "insetBanner");
            sparseArrayB.put(119, "instoreReminderPopupText");
            sparseArrayB.put(120, "isAccountNotificationBadgeShown");
            sparseArrayB.put(121, "isBeingChangedTo");
            sparseArrayB.put(122, "isButtonEnabled");
            sparseArrayB.put(123, "isChecked");
            sparseArrayB.put(124, "isComposeContentViewEnabled");
            sparseArrayB.put(125, "isCtaInProgress");
            sparseArrayB.put(126, "isEdited");
            sparseArrayB.put(127, "isEnabled");
            sparseArrayB.put(128, "isExpandable");
            sparseArrayB.put(129, "isExpanded");
            sparseArrayB.put(130, "isInSnGSession");
            sparseArrayB.put(131, "isLoading");
            sparseArrayB.put(132, "isLowerPriceYellow");
            sparseArrayB.put(133, "isMarketplace");
            sparseArrayB.put(134, "isNewBarcodeEnabled");
            sparseArrayB.put(135, "isPopup");
            sparseArrayB.put(136, "isRewardStyle");
            sparseArrayB.put(137, "isSearchBarHintVisible");
            sparseArrayB.put(138, "isSearchBarVisible");
            sparseArrayB.put(139, "isSelected");
            sparseArrayB.put(140, "isShoppingListBeingSaved");
            sparseArrayB.put(141, "isToggleInProgress");
            sparseArrayB.put(142, "isUnlocking");
            sparseArrayB.put(143, "isWatchlist");
            sparseArrayB.put(144, "isWatchlisted");
            sparseArrayB.put(145, "item");
            sparseArrayB.put(146, "itemClickListener");
            sparseArrayB.put(147, "itemData");
            sparseArrayB.put(148, "itemState");
            sparseArrayB.put(149, "itemWidthRes");
            sparseArrayB.put(150, AnnotatedPrivateKey.LABEL);
            sparseArrayB.put(151, "labelStyle");
            sparseArrayB.put(152, "lightTheme");
            sparseArrayB.put(153, "linkHandler");
            sparseArrayB.put(154, "listId");
            sparseArrayB.put(ModuleDescriptor.MODULE_VERSION, "listIndex");
            sparseArrayB.put(156, "listViewModel");
            sparseArrayB.put(157, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            sparseArrayB.put(158, "loadingMessage");
            sparseArrayB.put(159, "location");
            sparseArrayB.put(160, "logoUrl");
            sparseArrayB.put(161, "lottieAutoPlay");
            sparseArrayB.put(162, "lottieBackgroundColor");
            sparseArrayB.put(163, "lottieLoop");
            sparseArrayB.put(164, "mainViewModel");
            sparseArrayB.put(165, "margins");
            sparseArrayB.put(166, "markdownContent");
            sparseArrayB.put(167, "marketSellerGroup");
            sparseArrayB.put(168, "marketplace");
            sparseArrayB.put(169, "marketplaceInfo");
            sparseArrayB.put(170, "memberPriceInfo");
            sparseArrayB.put(171, "message");
            sparseArrayB.put(172, "mode");
            sparseArrayB.put(173, "modeConfig");
            sparseArrayB.put(174, "networkState");
            sparseArrayB.put(175, "offerViewItem");
            sparseArrayB.put(176, "onBannerClick");
            sparseArrayB.put(177, "onClick");
            sparseArrayB.put(178, "onItemClickListener");
            sparseArrayB.put(179, "onMaxLinesToggleListener");
            sparseArrayB.put(SubsamplingScaleImageView.ORIENTATION_180, "onPointsBalanceClick");
            sparseArrayB.put(181, "onQueryTextChangeListener");
            sparseArrayB.put(182, "onQueryTextFocusChangeListener");
            sparseArrayB.put(183, "onQueryTextSubmitListener");
            sparseArrayB.put(184, "onSelected");
            sparseArrayB.put(185, "option");
            sparseArrayB.put(186, "optionText");
            sparseArrayB.put(187, "order");
            sparseArrayB.put(188, "orderId");
            sparseArrayB.put(189, "orderOverview");
            sparseArrayB.put(190, "orderTotalDetails");
            sparseArrayB.put(191, "packagingMethodOption");
            sparseArrayB.put(BERTags.PRIVATE, "paddingBottom");
            sparseArrayB.put(193, "page");
            sparseArrayB.put(194, "pageData");
            sparseArrayB.put(195, "pageItem");
            sparseArrayB.put(196, "pageState");
            sparseArrayB.put(197, "paymentInfo");
            sparseArrayB.put(198, "pickUpInstructionsClickHandler");
            sparseArrayB.put(199, "postcode");
            sparseArrayB.put(200, "previewContent");
            sparseArrayB.put(201, "primaryButtonClickListener");
            sparseArrayB.put(DatastoreTestTrace.FirestoreV1Action.DATABASE_CONTENTS_BEFORE_ACTION_FIELD_NUMBER, "product");
            sparseArrayB.put(DatastoreTestTrace.FirestoreV1Action.MATCHING_DOCUMENTS_FIELD_NUMBER, "productCard");
            sparseArrayB.put(204, "productCardButtonType");
            sparseArrayB.put(205, "productCardButtonsState");
            sparseArrayB.put(206, "productCardConfig");
            sparseArrayB.put(207, "productConfig");
            sparseArrayB.put(208, "productData");
            sparseArrayB.put(209, "progressStepper");
            sparseArrayB.put(210, "quantity");
            sparseArrayB.put(Primes.SMALL_FACTOR_LIMIT, "queryHintRes");
            sparseArrayB.put(212, "queryText");
            sparseArrayB.put(213, "queryTextFocusChangeListener");
            sparseArrayB.put(214, "recipeListViewModel");
            sparseArrayB.put(215, "redemptionSettings");
            sparseArrayB.put(216, "rewardsPointsBalance");
            sparseArrayB.put(217, "rewardsPointsBalanceData");
            sparseArrayB.put(218, "rewardsRegistered");
            sparseArrayB.put(219, "rewardsRegisteredRedeemable");
            sparseArrayB.put(220, "rewardsUnregistered");
            sparseArrayB.put(221, "searchQueryHint");
            sparseArrayB.put(222, "section");
            sparseArrayB.put(223, "sectionHeader");
            sparseArrayB.put(BERTags.FLAGS, "sectionTitle");
            sparseArrayB.put(225, "seller");
            sparseArrayB.put(226, "sellerName");
            sparseArrayB.put(227, "serves");
            sparseArrayB.put(228, "servesQuantityClickListener");
            sparseArrayB.put(229, "shoppingList");
            sparseArrayB.put(230, "shouldHideToolbar");
            sparseArrayB.put(231, "shouldShowLoadingState");
            sparseArrayB.put(232, "shouldShowNewBadge");
            sparseArrayB.put(233, "shouldShowNotificationDot");
            sparseArrayB.put(234, "shouldShowWebArrow");
            sparseArrayB.put(235, "show");
            sparseArrayB.put(236, "showAddToListButton");
            sparseArrayB.put(237, "showBoostAnimation");
            sparseArrayB.put(238, "showCheckedItems");
            sparseArrayB.put(239, "showDisabledState");
            sparseArrayB.put(240, "showError");
            sparseArrayB.put(241, "showLoadingView");
            sparseArrayB.put(242, "showNewDismissIcon");
            sparseArrayB.put(243, "showPickOrderCollectedState");
            sparseArrayB.put(244, "showSkeleton");
            sparseArrayB.put(245, "showTigerDisplayExpiry");
            sparseArrayB.put(246, "showTigerOffersLabel");
            sparseArrayB.put(247, "singleLine");
            sparseArrayB.put(248, "sortByViewListener");
            sparseArrayB.put(249, "sortOption");
            sparseArrayB.put(250, "sortOptionClickListener");
            sparseArrayB.put(251, "state");
            sparseArrayB.put(252, "stateObj");
            sparseArrayB.put(253, "stepContent");
            sparseArrayB.put(254, "stepIndex");
            sparseArrayB.put(255, "stepInfoData");
            sparseArrayB.put(256, "stepsToolTip");
            sparseArrayB.put(257, "store");
            sparseArrayB.put(258, "suburb");
            sparseArrayB.put(259, "swipeRefresh");
            sparseArrayB.put(260, "terms");
            sparseArrayB.put(261, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(262, "textColorAttr");
            sparseArrayB.put(263, "title");
            sparseArrayB.put(264, "toolbarLogoResId");
            sparseArrayB.put(265, "toolbarTitle");
            sparseArrayB.put(266, "topLogo");
            sparseArrayB.put(267, "topMarginRes");
            sparseArrayB.put(268, "topTitle");
            sparseArrayB.put(269, "typefaceRes");
            sparseArrayB.put(SubsamplingScaleImageView.ORIENTATION_270, "vModel");
            sparseArrayB.put(271, "value");
            sparseArrayB.put(272, "viewListener");
            sparseArrayB.put(273, "viewModel");
            sparseArrayB.put(274, "viewState");
            sparseArrayB.put(275, "vocViewModel");
            sparseArrayB.put(276, "windowSubheader");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f4215a = new HashMap(0);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(52);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.DataBinderMapperImpl());
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
        arrayList.add(new au.com.woolworths.feature.shop.storelocator.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.shop.storelocator.legacy.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.shop.voc.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.shop.weblink.DataBinderMapperImpl());
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
        arrayList.add(new com.woolworths.scanlibrary.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        if (f4214a.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f4214a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f4215a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
