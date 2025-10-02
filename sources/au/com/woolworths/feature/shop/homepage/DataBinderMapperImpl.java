package au.com.woolworths.feature.shop.homepage;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.camera.core.impl.b;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.models.notification.NotificationResult;
import au.com.woolworths.feature.shop.homepage.databinding.EpoxyHomepageDividerBindingImpl;
import au.com.woolworths.feature.shop.homepage.databinding.EpoxyItemAddRewardsTileBindingImpl;
import au.com.woolworths.feature.shop.homepage.databinding.EpoxyItemCatalogueTileBindingImpl;
import au.com.woolworths.feature.shop.homepage.databinding.EpoxyItemOrdersTileBindingImpl;
import au.com.woolworths.feature.shop.homepage.databinding.EpoxyItemPriorityMessageTileBindingImpl;
import au.com.woolworths.feature.shop.homepage.databinding.EpoxyItemRegistrationTileBindingImpl;
import au.com.woolworths.feature.shop.homepage.databinding.FragmentHomePageBindingImpl;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.apphosting.datastore.testing.DatastoreTestTrace;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
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
    public static final SparseIntArray f7175a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = a.b(220, 0, 1, "_all", "actionState");
            sparseArrayB.put(2, "address");
            sparseArrayB.put(3, "amountColorRes");
            sparseArrayB.put(4, "asset");
            sparseArrayB.put(5, "backgroundColor");
            sparseArrayB.put(6, "backingImageLoaderListener");
            sparseArrayB.put(7, "banner");
            sparseArrayB.put(8, "bannerAsset");
            sparseArrayB.put(9, "bannerIcon");
            sparseArrayB.put(10, "bannerState");
            sparseArrayB.put(11, "billingAddress");
            sparseArrayB.put(12, "body");
            sparseArrayB.put(13, "boostAllBannerState");
            sparseArrayB.put(14, "boostAnimationVisibility");
            sparseArrayB.put(15, "boostViewListener");
            sparseArrayB.put(16, "brandLabel");
            sparseArrayB.put(17, "buttonText");
            sparseArrayB.put(18, "buttonTint");
            sparseArrayB.put(19, "buttonTitle");
            sparseArrayB.put(20, NotificationResult.Notification.CAMPAIGN);
            sparseArrayB.put(21, "canShowWatchlist");
            sparseArrayB.put(22, "cartButton");
            sparseArrayB.put(23, "cataloguePage");
            sparseArrayB.put(24, "cents");
            sparseArrayB.put(25, "checkboxText");
            sparseArrayB.put(26, "clickHandler");
            sparseArrayB.put(27, "clickHandlers");
            sparseArrayB.put(28, "clickListener");
            sparseArrayB.put(29, "coachMark");
            sparseArrayB.put(30, "collectionMethodOption");
            sparseArrayB.put(31, "color");
            sparseArrayB.put(32, "colorName");
            sparseArrayB.put(33, "condition");
            sparseArrayB.put(34, "containerTitle");
            sparseArrayB.put(35, "contentDescription");
            sparseArrayB.put(36, "count");
            sparseArrayB.put(37, "countLabel");
            sparseArrayB.put(38, "cta");
            sparseArrayB.put(39, "ctaText");
            sparseArrayB.put(40, "data");
            sparseArrayB.put(41, "deliveryNowWindow");
            sparseArrayB.put(42, lqlqqlq.mmm006Dm006Dm);
            sparseArrayB.put(43, "descriptionText");
            sparseArrayB.put(44, "directToBootNowWindow");
            sparseArrayB.put(45, "discountItem");
            sparseArrayB.put(46, "dispatchNote");
            sparseArrayB.put(47, "displayExpiryExtended");
            sparseArrayB.put(48, "displayFreeTextClearIcon");
            sparseArrayB.put(49, "displayFreeTextSearchIcon");
            sparseArrayB.put(50, "displayName");
            sparseArrayB.put(51, "dollars");
            sparseArrayB.put(52, "dummyBannerData");
            sparseArrayB.put(53, "dummyBannerVisibility");
            sparseArrayB.put(54, "emptyState");
            sparseArrayB.put(55, "enableBoostAnimationContainerGap");
            sparseArrayB.put(56, "enabled");
            sparseArrayB.put(57, "errorLabelText");
            sparseArrayB.put(58, "errorState");
            sparseArrayB.put(59, "errorsHandler");
            sparseArrayB.put(60, "eventHandler");
            sparseArrayB.put(61, "filter");
            sparseArrayB.put(62, "filterMenuItem");
            sparseArrayB.put(63, "filterOption");
            sparseArrayB.put(64, "filterOptionClickListener");
            sparseArrayB.put(65, "footer");
            sparseArrayB.put(66, "freshMagContent");
            sparseArrayB.put(67, "freshMagHomeListener");
            sparseArrayB.put(68, "fulfilmentWindow");
            sparseArrayB.put(69, "fulfilmentWindows");
            sparseArrayB.put(70, "fulfilmentWindowsOption");
            sparseArrayB.put(71, "fulfilmentWindowsSlot");
            sparseArrayB.put(72, "groupTitle");
            sparseArrayB.put(73, "handler");
            sparseArrayB.put(74, "header");
            sparseArrayB.put(75, "heightRes");
            sparseArrayB.put(76, "hostScreen");
            sparseArrayB.put(77, "hostViewListener");
            sparseArrayB.put(78, "htmlListener");
            sparseArrayB.put(79, "iconResId");
            sparseArrayB.put(80, "imageItem");
            sparseArrayB.put(81, "imageLoadListener");
            sparseArrayB.put(82, "imageLoaderListener");
            sparseArrayB.put(83, "imageUrl");
            sparseArrayB.put(84, "importantForAccessibility");
            sparseArrayB.put(85, "inMappedStore");
            sparseArrayB.put(86, "index");
            sparseArrayB.put(87, "info");
            sparseArrayB.put(88, "infoIconClickHandler");
            sparseArrayB.put(89, "infoSectionItem");
            sparseArrayB.put(90, "infoView");
            sparseArrayB.put(91, "inlineMessage");
            sparseArrayB.put(92, "insetBanner");
            sparseArrayB.put(93, "isAccountNotificationBadgeShown");
            sparseArrayB.put(94, "isButtonEnabled");
            sparseArrayB.put(95, "isChecked");
            sparseArrayB.put(96, "isComposeContentViewEnabled");
            sparseArrayB.put(97, "isCtaInProgress");
            sparseArrayB.put(98, "isEdited");
            sparseArrayB.put(99, "isEnabled");
            sparseArrayB.put(100, "isInSnGSession");
            sparseArrayB.put(101, "isLoading");
            sparseArrayB.put(102, "isLowerPriceYellow");
            sparseArrayB.put(103, "isMarketplace");
            sparseArrayB.put(104, "isPopup");
            sparseArrayB.put(105, "isRewardStyle");
            sparseArrayB.put(106, "isSelected");
            sparseArrayB.put(107, "isShoppingListBeingSaved");
            sparseArrayB.put(108, "isToggleInProgress");
            sparseArrayB.put(109, "isUnlocking");
            sparseArrayB.put(110, "isWatchlist");
            sparseArrayB.put(111, "isWatchlisted");
            sparseArrayB.put(112, "item");
            sparseArrayB.put(113, "itemClickListener");
            sparseArrayB.put(114, "itemState");
            sparseArrayB.put(115, "itemWidthRes");
            sparseArrayB.put(116, AnnotatedPrivateKey.LABEL);
            sparseArrayB.put(117, "labelStyle");
            sparseArrayB.put(118, "lightTheme");
            sparseArrayB.put(119, "linkHandler");
            sparseArrayB.put(120, "listId");
            sparseArrayB.put(121, "listIndex");
            sparseArrayB.put(122, "listViewModel");
            sparseArrayB.put(123, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            sparseArrayB.put(124, "loadingMessage");
            sparseArrayB.put(125, "lottieAutoPlay");
            sparseArrayB.put(126, "lottieBackgroundColor");
            sparseArrayB.put(127, "lottieLoop");
            sparseArrayB.put(128, "margins");
            sparseArrayB.put(129, "markdownContent");
            sparseArrayB.put(130, "marketSellerGroup");
            sparseArrayB.put(131, "marketplace");
            sparseArrayB.put(132, "memberPriceInfo");
            sparseArrayB.put(133, "message");
            sparseArrayB.put(134, "mode");
            sparseArrayB.put(135, "offerViewItem");
            sparseArrayB.put(136, "onBannerClick");
            sparseArrayB.put(137, "onClick");
            sparseArrayB.put(138, "onItemClickListener");
            sparseArrayB.put(139, "onMaxLinesToggleListener");
            sparseArrayB.put(140, "onPointsBalanceClick");
            sparseArrayB.put(141, "onQueryTextChangeListener");
            sparseArrayB.put(142, "onQueryTextFocusChangeListener");
            sparseArrayB.put(143, "onQueryTextSubmitListener");
            sparseArrayB.put(144, "onSelected");
            sparseArrayB.put(145, "optionText");
            sparseArrayB.put(146, "order");
            sparseArrayB.put(147, "orderId");
            sparseArrayB.put(148, "orderOverview");
            sparseArrayB.put(149, "orderTotalDetails");
            sparseArrayB.put(150, "packagingMethodOption");
            sparseArrayB.put(151, "paddingBottom");
            sparseArrayB.put(152, "page");
            sparseArrayB.put(153, "pageItem");
            sparseArrayB.put(154, "pageState");
            sparseArrayB.put(ModuleDescriptor.MODULE_VERSION, "pickUpInstructionsClickHandler");
            sparseArrayB.put(156, "postcode");
            sparseArrayB.put(157, "previewContent");
            sparseArrayB.put(158, "primaryButtonClickListener");
            sparseArrayB.put(159, "product");
            sparseArrayB.put(160, "productCard");
            sparseArrayB.put(161, "productCardButtonsState");
            sparseArrayB.put(162, "productCardConfig");
            sparseArrayB.put(163, "productConfig");
            sparseArrayB.put(164, "productData");
            sparseArrayB.put(165, "progressStepper");
            sparseArrayB.put(166, "quantity");
            sparseArrayB.put(167, "queryTextFocusChangeListener");
            sparseArrayB.put(168, "recipeListViewModel");
            sparseArrayB.put(169, "rewardsPointsBalance");
            sparseArrayB.put(170, "rewardsPointsBalanceData");
            sparseArrayB.put(171, "rewardsRegistered");
            sparseArrayB.put(172, "rewardsRegisteredRedeemable");
            sparseArrayB.put(173, "rewardsUnregistered");
            sparseArrayB.put(174, "searchQueryHint");
            sparseArrayB.put(175, "section");
            sparseArrayB.put(176, "sectionHeader");
            sparseArrayB.put(177, "sectionTitle");
            sparseArrayB.put(178, "seller");
            sparseArrayB.put(179, "sellerName");
            sparseArrayB.put(SubsamplingScaleImageView.ORIENTATION_180, "serves");
            sparseArrayB.put(181, "servesQuantityClickListener");
            sparseArrayB.put(182, "shoppingList");
            sparseArrayB.put(183, "shouldHideToolbar");
            sparseArrayB.put(184, "shouldShowLoadingState");
            sparseArrayB.put(185, "shouldShowNewBadge");
            sparseArrayB.put(186, "shouldShowNotificationDot");
            sparseArrayB.put(187, "shouldShowWebArrow");
            sparseArrayB.put(188, "showAddToListButton");
            sparseArrayB.put(189, "showBoostAnimation");
            sparseArrayB.put(190, "showCheckedItems");
            sparseArrayB.put(191, "showDisabledState");
            sparseArrayB.put(BERTags.PRIVATE, "showLoadingView");
            sparseArrayB.put(193, "showNewDismissIcon");
            sparseArrayB.put(194, "showPickOrderCollectedState");
            sparseArrayB.put(195, "showSkeleton");
            sparseArrayB.put(196, "showTigerDisplayExpiry");
            sparseArrayB.put(197, "showTigerOffersLabel");
            sparseArrayB.put(198, "singleLine");
            sparseArrayB.put(199, "sortByViewListener");
            sparseArrayB.put(200, "sortOption");
            sparseArrayB.put(201, "sortOptionClickListener");
            sparseArrayB.put(DatastoreTestTrace.FirestoreV1Action.DATABASE_CONTENTS_BEFORE_ACTION_FIELD_NUMBER, "state");
            sparseArrayB.put(DatastoreTestTrace.FirestoreV1Action.MATCHING_DOCUMENTS_FIELD_NUMBER, "stepContent");
            sparseArrayB.put(204, "stepIndex");
            sparseArrayB.put(205, "stepInfoData");
            sparseArrayB.put(206, "stepsToolTip");
            sparseArrayB.put(207, "store");
            sparseArrayB.put(208, "swipeRefresh");
            sparseArrayB.put(209, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(210, "textColorAttr");
            sparseArrayB.put(Primes.SMALL_FACTOR_LIMIT, "title");
            sparseArrayB.put(212, "topMarginRes");
            sparseArrayB.put(213, "typefaceRes");
            sparseArrayB.put(214, "value");
            sparseArrayB.put(215, "viewListener");
            sparseArrayB.put(216, "viewModel");
            sparseArrayB.put(217, "viewState");
            sparseArrayB.put(218, "vocViewModel");
            sparseArrayB.put(219, "windowSubheader");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f7176a;

        static {
            HashMap map = new HashMap(7);
            f7176a = map;
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_homepage_divider, map, "layout/epoxy_homepage_divider_0", com.woolworths.R.layout.epoxy_item_add_rewards_tile, "layout/epoxy_item_add_rewards_tile_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_catalogue_tile, map, "layout/epoxy_item_catalogue_tile_0", com.woolworths.R.layout.epoxy_item_orders_tile, "layout/epoxy_item_orders_tile_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_priority_message_tile, map, "layout/epoxy_item_priority_message_tile_0", com.woolworths.R.layout.epoxy_item_registration_tile, "layout/epoxy_item_registration_tile_0");
            map.put("layout/fragment_home_page_0", Integer.valueOf(com.woolworths.R.layout.fragment_home_page));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(7);
        f7175a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.epoxy_homepage_divider, 1);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_add_rewards_tile, 2);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_catalogue_tile, 3);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_orders_tile, 4);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_priority_message_tile, 5);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_registration_tile, 6);
        sparseIntArray.put(com.woolworths.R.layout.fragment_home_page, 7);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(14);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.base.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.base.shopapp.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.product.list.legacy.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.rewards.offers.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.shop.catalogue.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.shop.myorders.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.shop.recipes.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.foundation.shop.editorder.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.product.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shop.addtolist.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shop.buyagain.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shop.cart.DataBinderMapperImpl());
        arrayList.add(new com.airbnb.epoxy.databinding.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f7175a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        switch (i2) {
            case 1:
                if ("layout/epoxy_homepage_divider_0".equals(tag)) {
                    return new EpoxyHomepageDividerBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_homepage_divider is invalid. Received: "));
            case 2:
                if ("layout/epoxy_item_add_rewards_tile_0".equals(tag)) {
                    return new EpoxyItemAddRewardsTileBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_add_rewards_tile is invalid. Received: "));
            case 3:
                if ("layout/epoxy_item_catalogue_tile_0".equals(tag)) {
                    return new EpoxyItemCatalogueTileBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_catalogue_tile is invalid. Received: "));
            case 4:
                if ("layout/epoxy_item_orders_tile_0".equals(tag)) {
                    return new EpoxyItemOrdersTileBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_orders_tile is invalid. Received: "));
            case 5:
                if ("layout/epoxy_item_priority_message_tile_0".equals(tag)) {
                    return new EpoxyItemPriorityMessageTileBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_priority_message_tile is invalid. Received: "));
            case 6:
                if ("layout/epoxy_item_registration_tile_0".equals(tag)) {
                    return new EpoxyItemRegistrationTileBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_registration_tile is invalid. Received: "));
            case 7:
                if ("layout/fragment_home_page_0".equals(tag)) {
                    return new FragmentHomePageBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(b.m(tag, "The tag for fragment_home_page is invalid. Received: "));
            default:
                return null;
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f7175a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f7176a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
