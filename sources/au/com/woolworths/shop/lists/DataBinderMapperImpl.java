package au.com.woolworths.shop.lists;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.impl.b;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeHorizontalDividerBinding;
import au.com.woolworths.android.onesite.models.notification.NotificationResult;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButton;
import au.com.woolworths.shop.lists.databinding.ActivityPastShopsBindingImpl;
import au.com.woolworths.shop.lists.databinding.ActivityShoppingListBindingImpl;
import au.com.woolworths.shop.lists.databinding.ActivitySngListsBindingImpl;
import au.com.woolworths.shop.lists.databinding.EpoxyItemPastShopsEntryBindingImpl;
import au.com.woolworths.shop.lists.databinding.EpoxyItemPastShopsPaginationErrorStateBindingImpl;
import au.com.woolworths.shop.lists.databinding.EpoxyItemPastShopsPaginationLoadingStateBindingImpl;
import au.com.woolworths.shop.lists.databinding.EpoxyItemShoppingListCheckedBindingImpl;
import au.com.woolworths.shop.lists.databinding.EpoxyItemShoppingListCheckedMenuBindingImpl;
import au.com.woolworths.shop.lists.databinding.EpoxyItemShoppingListHeaderBindingImpl;
import au.com.woolworths.shop.lists.databinding.EpoxyItemShoppingListProductBindingImpl;
import au.com.woolworths.shop.lists.databinding.EpoxyItemShoppingListProductButtonsBindingImpl;
import au.com.woolworths.shop.lists.databinding.EpoxyItemShoppingListProductButtonsUpliftBindingImpl;
import au.com.woolworths.shop.lists.databinding.EpoxyItemShoppingListTextBindingImpl;
import au.com.woolworths.shop.lists.databinding.FragmentListsBindingImpl;
import au.com.woolworths.shop.lists.databinding.FragmentSuggestedListsBindingImpl;
import au.com.woolworths.shop.lists.databinding.IncludeBoostAllBannerBindingImpl;
import au.com.woolworths.shop.lists.databinding.ItemProductListMarketplaceDetailsBindingImpl;
import au.com.woolworths.shop.lists.databinding.ViewListDetailsBindingImpl;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.material.tabs.TabLayout;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes4.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f12213a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = a.b(168, 0, 1, "_all", "actionState");
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
            sparseArrayB.put(20, "cents");
            sparseArrayB.put(21, "clickHandler");
            sparseArrayB.put(22, "clickHandlers");
            sparseArrayB.put(23, "clickListener");
            sparseArrayB.put(24, "coachMark");
            sparseArrayB.put(25, "collectionMethodOption");
            sparseArrayB.put(26, "color");
            sparseArrayB.put(27, "colorName");
            sparseArrayB.put(28, "condition");
            sparseArrayB.put(29, "containerTitle");
            sparseArrayB.put(30, "count");
            sparseArrayB.put(31, "cta");
            sparseArrayB.put(32, "ctaText");
            sparseArrayB.put(33, "data");
            sparseArrayB.put(34, "deliveryNowWindow");
            sparseArrayB.put(35, lqlqqlq.mmm006Dm006Dm);
            sparseArrayB.put(36, "descriptionText");
            sparseArrayB.put(37, "directToBootNowWindow");
            sparseArrayB.put(38, "discountItem");
            sparseArrayB.put(39, "dispatchNote");
            sparseArrayB.put(40, "displayExpiryExtended");
            sparseArrayB.put(41, "displayFreeTextClearIcon");
            sparseArrayB.put(42, "displayFreeTextSearchIcon");
            sparseArrayB.put(43, "dollars");
            sparseArrayB.put(44, "emptyState");
            sparseArrayB.put(45, "enableBoostAnimationContainerGap");
            sparseArrayB.put(46, "enabled");
            sparseArrayB.put(47, "errorLabelText");
            sparseArrayB.put(48, "errorState");
            sparseArrayB.put(49, "eventHandler");
            sparseArrayB.put(50, "filter");
            sparseArrayB.put(51, "footer");
            sparseArrayB.put(52, "fulfilmentWindow");
            sparseArrayB.put(53, "fulfilmentWindows");
            sparseArrayB.put(54, "fulfilmentWindowsOption");
            sparseArrayB.put(55, "fulfilmentWindowsSlot");
            sparseArrayB.put(56, "groupTitle");
            sparseArrayB.put(57, "handler");
            sparseArrayB.put(58, "header");
            sparseArrayB.put(59, "heightRes");
            sparseArrayB.put(60, "hostScreen");
            sparseArrayB.put(61, "hostViewListener");
            sparseArrayB.put(62, "htmlListener");
            sparseArrayB.put(63, "iconResId");
            sparseArrayB.put(64, "imageItem");
            sparseArrayB.put(65, "imageLoaderListener");
            sparseArrayB.put(66, "importantForAccessibility");
            sparseArrayB.put(67, "inMappedStore");
            sparseArrayB.put(68, "index");
            sparseArrayB.put(69, "info");
            sparseArrayB.put(70, "infoSectionItem");
            sparseArrayB.put(71, "infoView");
            sparseArrayB.put(72, "inlineMessage");
            sparseArrayB.put(73, "insetBanner");
            sparseArrayB.put(74, "isAccountNotificationBadgeShown");
            sparseArrayB.put(75, "isButtonEnabled");
            sparseArrayB.put(76, "isChecked");
            sparseArrayB.put(77, "isComposeContentViewEnabled");
            sparseArrayB.put(78, "isCtaInProgress");
            sparseArrayB.put(79, "isEdited");
            sparseArrayB.put(80, "isEnabled");
            sparseArrayB.put(81, "isInSnGSession");
            sparseArrayB.put(82, "isLoading");
            sparseArrayB.put(83, "isLowerPriceYellow");
            sparseArrayB.put(84, "isMarketplace");
            sparseArrayB.put(85, "isPopup");
            sparseArrayB.put(86, "isRewardStyle");
            sparseArrayB.put(87, "isSelected");
            sparseArrayB.put(88, "isShoppingListBeingSaved");
            sparseArrayB.put(89, "isToggleInProgress");
            sparseArrayB.put(90, "isUnlocking");
            sparseArrayB.put(91, "isWatchlist");
            sparseArrayB.put(92, "isWatchlisted");
            sparseArrayB.put(93, "item");
            sparseArrayB.put(94, "itemClickListener");
            sparseArrayB.put(95, "itemState");
            sparseArrayB.put(96, "itemWidthRes");
            sparseArrayB.put(97, AnnotatedPrivateKey.LABEL);
            sparseArrayB.put(98, "labelStyle");
            sparseArrayB.put(99, "lightTheme");
            sparseArrayB.put(100, "linkHandler");
            sparseArrayB.put(101, "listId");
            sparseArrayB.put(102, "listIndex");
            sparseArrayB.put(103, "listViewModel");
            sparseArrayB.put(104, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            sparseArrayB.put(105, "loadingMessage");
            sparseArrayB.put(106, "lottieAutoPlay");
            sparseArrayB.put(107, "lottieBackgroundColor");
            sparseArrayB.put(108, "lottieLoop");
            sparseArrayB.put(109, "margins");
            sparseArrayB.put(110, "markdownContent");
            sparseArrayB.put(111, "marketSellerGroup");
            sparseArrayB.put(112, "marketplace");
            sparseArrayB.put(113, "memberPriceInfo");
            sparseArrayB.put(114, "message");
            sparseArrayB.put(115, "offerViewItem");
            sparseArrayB.put(116, "onBannerClick");
            sparseArrayB.put(117, "onClick");
            sparseArrayB.put(118, "onPointsBalanceClick");
            sparseArrayB.put(119, "onQueryTextChangeListener");
            sparseArrayB.put(120, "onQueryTextFocusChangeListener");
            sparseArrayB.put(121, "onQueryTextSubmitListener");
            sparseArrayB.put(122, "onSelected");
            sparseArrayB.put(123, "optionText");
            sparseArrayB.put(124, "orderTotalDetails");
            sparseArrayB.put(125, "packagingMethodOption");
            sparseArrayB.put(126, "paddingBottom");
            sparseArrayB.put(127, "previewContent");
            sparseArrayB.put(128, "product");
            sparseArrayB.put(129, "productCard");
            sparseArrayB.put(130, "productCardConfig");
            sparseArrayB.put(131, "productConfig");
            sparseArrayB.put(132, "productData");
            sparseArrayB.put(133, "quantity");
            sparseArrayB.put(134, "rewardsPointsBalance");
            sparseArrayB.put(135, "rewardsPointsBalanceData");
            sparseArrayB.put(136, "rewardsRegistered");
            sparseArrayB.put(137, "rewardsRegisteredRedeemable");
            sparseArrayB.put(138, "rewardsUnregistered");
            sparseArrayB.put(139, "searchQueryHint");
            sparseArrayB.put(140, "section");
            sparseArrayB.put(141, "sectionHeader");
            sparseArrayB.put(142, "sectionTitle");
            sparseArrayB.put(143, "seller");
            sparseArrayB.put(144, "sellerName");
            sparseArrayB.put(145, "shoppingList");
            sparseArrayB.put(146, "shouldHideToolbar");
            sparseArrayB.put(147, "shouldShowLoadingState");
            sparseArrayB.put(148, "shouldShowNewBadge");
            sparseArrayB.put(149, "shouldShowNotificationDot");
            sparseArrayB.put(150, "shouldShowWebArrow");
            sparseArrayB.put(151, "showAddToListButton");
            sparseArrayB.put(152, "showBoostAnimation");
            sparseArrayB.put(153, "showCheckedItems");
            sparseArrayB.put(154, "showLoadingView");
            sparseArrayB.put(ModuleDescriptor.MODULE_VERSION, "showNewDismissIcon");
            sparseArrayB.put(156, "showTigerDisplayExpiry");
            sparseArrayB.put(157, "showTigerOffersLabel");
            sparseArrayB.put(158, "singleLine");
            sparseArrayB.put(159, "sortByViewListener");
            sparseArrayB.put(160, "state");
            sparseArrayB.put(161, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(162, "title");
            sparseArrayB.put(163, "viewListener");
            sparseArrayB.put(164, "viewModel");
            sparseArrayB.put(165, "viewState");
            sparseArrayB.put(166, "vocViewModel");
            sparseArrayB.put(167, "windowSubheader");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f12214a;

        static {
            HashMap map = new HashMap(18);
            f12214a = map;
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_past_shops, map, "layout/activity_past_shops_0", com.woolworths.R.layout.activity_shopping_list, "layout/activity_shopping_list_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_sng_lists, map, "layout/activity_sng_lists_0", com.woolworths.R.layout.epoxy_item_past_shops_entry, "layout/epoxy_item_past_shops_entry_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_past_shops_pagination_error_state, map, "layout/epoxy_item_past_shops_pagination_error_state_0", com.woolworths.R.layout.epoxy_item_past_shops_pagination_loading_state, "layout/epoxy_item_past_shops_pagination_loading_state_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_shopping_list_checked, map, "layout/epoxy_item_shopping_list_checked_0", com.woolworths.R.layout.epoxy_item_shopping_list_checked_menu, "layout/epoxy_item_shopping_list_checked_menu_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_shopping_list_header, map, "layout/epoxy_item_shopping_list_header_0", com.woolworths.R.layout.epoxy_item_shopping_list_product, "layout/epoxy_item_shopping_list_product_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_shopping_list_product_buttons, map, "layout/epoxy_item_shopping_list_product_buttons_0", com.woolworths.R.layout.epoxy_item_shopping_list_product_buttons_uplift, "layout/epoxy_item_shopping_list_product_buttons_uplift_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_shopping_list_text, map, "layout/epoxy_item_shopping_list_text_0", com.woolworths.R.layout.fragment_lists, "layout/fragment_lists_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.fragment_suggested_lists, map, "layout/fragment_suggested_lists_0", com.woolworths.R.layout.include_boost_all_banner, "layout/include_boost_all_banner_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.item_product_list_marketplace_details, map, "layout/item_product_list_marketplace_details_0", com.woolworths.R.layout.view_list_details, "layout/view_list_details_0");
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(18);
        f12213a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.activity_past_shops, 1);
        sparseIntArray.put(com.woolworths.R.layout.activity_shopping_list, 2);
        sparseIntArray.put(com.woolworths.R.layout.activity_sng_lists, 3);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_past_shops_entry, 4);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_past_shops_pagination_error_state, 5);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_past_shops_pagination_loading_state, 6);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_shopping_list_checked, 7);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_shopping_list_checked_menu, 8);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_shopping_list_header, 9);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_shopping_list_product, 10);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_shopping_list_product_buttons, 11);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_shopping_list_product_buttons_uplift, 12);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_shopping_list_text, 13);
        sparseIntArray.put(com.woolworths.R.layout.fragment_lists, 14);
        sparseIntArray.put(com.woolworths.R.layout.fragment_suggested_lists, 15);
        sparseIntArray.put(com.woolworths.R.layout.include_boost_all_banner, 16);
        sparseIntArray.put(com.woolworths.R.layout.item_product_list_marketplace_details, 17);
        sparseIntArray.put(com.woolworths.R.layout.view_list_details, 18);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.base.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.base.shopapp.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.rewards.offers.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.shop.notification.preferences.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.product.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shop.addtolist.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shop.buyagain.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shop.cart.DataBinderMapperImpl());
        arrayList.add(new com.airbnb.epoxy.databinding.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f12213a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            switch (i2) {
                case 1:
                    if ("layout/activity_past_shops_0".equals(tag)) {
                        return new ActivityPastShopsBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for activity_past_shops is invalid. Received: "));
                case 2:
                    if ("layout/activity_shopping_list_0".equals(tag)) {
                        return new ActivityShoppingListBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for activity_shopping_list is invalid. Received: "));
                case 3:
                    if (!"layout/activity_sng_lists_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for activity_sng_lists is invalid. Received: "));
                    }
                    Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 6, null, ActivitySngListsBindingImpl.E);
                    ActivitySngListsBindingImpl activitySngListsBindingImpl = new ActivitySngListsBindingImpl(dataBindingComponent, view, (FrameLayout) objArrT[5], (View) objArrT[1], (ProgressBar) objArrT[2], (Toolbar) objArrT[4]);
                    activitySngListsBindingImpl.D = -1L;
                    ((ConstraintLayout) objArrT[0]).setTag(null);
                    activitySngListsBindingImpl.z.setTag(null);
                    activitySngListsBindingImpl.A.setTag(null);
                    activitySngListsBindingImpl.E(view);
                    activitySngListsBindingImpl.r();
                    return activitySngListsBindingImpl;
                case 4:
                    if ("layout/epoxy_item_past_shops_entry_0".equals(tag)) {
                        return new EpoxyItemPastShopsEntryBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_past_shops_entry is invalid. Received: "));
                case 5:
                    if ("layout/epoxy_item_past_shops_pagination_error_state_0".equals(tag)) {
                        return new EpoxyItemPastShopsPaginationErrorStateBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_past_shops_pagination_error_state is invalid. Received: "));
                case 6:
                    if (!"layout/epoxy_item_past_shops_pagination_loading_state_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_past_shops_pagination_loading_state is invalid. Received: "));
                    }
                    Object[] objArrT2 = ViewDataBinding.t(dataBindingComponent, view, 1, null, null);
                    EpoxyItemPastShopsPaginationLoadingStateBindingImpl epoxyItemPastShopsPaginationLoadingStateBindingImpl = new EpoxyItemPastShopsPaginationLoadingStateBindingImpl(dataBindingComponent, view, 0);
                    epoxyItemPastShopsPaginationLoadingStateBindingImpl.y = -1L;
                    ((ConstraintLayout) objArrT2[0]).setTag(null);
                    epoxyItemPastShopsPaginationLoadingStateBindingImpl.E(view);
                    epoxyItemPastShopsPaginationLoadingStateBindingImpl.r();
                    return epoxyItemPastShopsPaginationLoadingStateBindingImpl;
                case 7:
                    if ("layout/epoxy_item_shopping_list_checked_0".equals(tag)) {
                        return new EpoxyItemShoppingListCheckedBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_shopping_list_checked is invalid. Received: "));
                case 8:
                    if ("layout/epoxy_item_shopping_list_checked_menu_0".equals(tag)) {
                        return new EpoxyItemShoppingListCheckedMenuBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_shopping_list_checked_menu is invalid. Received: "));
                case 9:
                    if (!"layout/epoxy_item_shopping_list_header_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_shopping_list_header is invalid. Received: "));
                    }
                    Object[] objArrT3 = ViewDataBinding.t(dataBindingComponent, view, 2, null, null);
                    EpoxyItemShoppingListHeaderBindingImpl epoxyItemShoppingListHeaderBindingImpl = new EpoxyItemShoppingListHeaderBindingImpl(dataBindingComponent, view, (TextView) objArrT3[1]);
                    epoxyItemShoppingListHeaderBindingImpl.A = -1L;
                    ((ConstraintLayout) objArrT3[0]).setTag(null);
                    epoxyItemShoppingListHeaderBindingImpl.y.setTag(null);
                    epoxyItemShoppingListHeaderBindingImpl.E(view);
                    epoxyItemShoppingListHeaderBindingImpl.r();
                    return epoxyItemShoppingListHeaderBindingImpl;
                case 10:
                    if ("layout/epoxy_item_shopping_list_product_0".equals(tag)) {
                        return new EpoxyItemShoppingListProductBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_shopping_list_product is invalid. Received: "));
                case 11:
                    if ("layout/epoxy_item_shopping_list_product_buttons_0".equals(tag)) {
                        return new EpoxyItemShoppingListProductButtonsBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_shopping_list_product_buttons is invalid. Received: "));
                case 12:
                    if ("layout/epoxy_item_shopping_list_product_buttons_uplift_0".equals(tag)) {
                        return new EpoxyItemShoppingListProductButtonsUpliftBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_shopping_list_product_buttons_uplift is invalid. Received: "));
                case 13:
                    if ("layout/epoxy_item_shopping_list_text_0".equals(tag)) {
                        return new EpoxyItemShoppingListTextBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_shopping_list_text is invalid. Received: "));
                case 14:
                    if (!"layout/fragment_lists_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for fragment_lists is invalid. Received: "));
                    }
                    Object[] objArrT4 = ViewDataBinding.t(dataBindingComponent, view, 4, FragmentListsBindingImpl.D, FragmentListsBindingImpl.E);
                    FragmentListsBindingImpl fragmentListsBindingImpl = new FragmentListsBindingImpl(dataBindingComponent, view, (TabLayout) objArrT4[1], (ViewPager2) objArrT4[3], (IncludeHorizontalDividerBinding) objArrT4[2]);
                    fragmentListsBindingImpl.C = -1L;
                    fragmentListsBindingImpl.y.setTag(null);
                    ((ConstraintLayout) objArrT4[0]).setTag(null);
                    IncludeHorizontalDividerBinding includeHorizontalDividerBinding = fragmentListsBindingImpl.A;
                    if (includeHorizontalDividerBinding != null) {
                        includeHorizontalDividerBinding.n = fragmentListsBindingImpl;
                    }
                    fragmentListsBindingImpl.E(view);
                    fragmentListsBindingImpl.r();
                    return fragmentListsBindingImpl;
                case 15:
                    if ("layout/fragment_suggested_lists_0".equals(tag)) {
                        return new FragmentSuggestedListsBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for fragment_suggested_lists is invalid. Received: "));
                case 16:
                    if (!"layout/include_boost_all_banner_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for include_boost_all_banner is invalid. Received: "));
                    }
                    Object[] objArrT5 = ViewDataBinding.t(dataBindingComponent, view, 4, null, null);
                    IncludeBoostAllBannerBindingImpl includeBoostAllBannerBindingImpl = new IncludeBoostAllBannerBindingImpl(dataBindingComponent, view, (LottieAnimationView) objArrT5[3], (LinearLayout) objArrT5[0], (StatefulButton) objArrT5[2], (TextView) objArrT5[1]);
                    includeBoostAllBannerBindingImpl.E = -1L;
                    includeBoostAllBannerBindingImpl.y.setTag(null);
                    includeBoostAllBannerBindingImpl.z.setTag(null);
                    includeBoostAllBannerBindingImpl.A.setTag(null);
                    includeBoostAllBannerBindingImpl.B.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, includeBoostAllBannerBindingImpl);
                    includeBoostAllBannerBindingImpl.r();
                    return includeBoostAllBannerBindingImpl;
                case 17:
                    if ("layout/item_product_list_marketplace_details_0".equals(tag)) {
                        return new ItemProductListMarketplaceDetailsBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for item_product_list_marketplace_details is invalid. Received: "));
                case 18:
                    if (!"layout/view_list_details_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for view_list_details is invalid. Received: "));
                    }
                    Object[] objArrT6 = ViewDataBinding.t(dataBindingComponent, view, 3, null, ViewListDetailsBindingImpl.C);
                    ViewListDetailsBindingImpl viewListDetailsBindingImpl = new ViewListDetailsBindingImpl(dataBindingComponent, view, (ComposeView) objArrT6[1], (ComposeView) objArrT6[2]);
                    viewListDetailsBindingImpl.B = -1L;
                    ((LinearLayout) objArrT6[0]).setTag(null);
                    viewListDetailsBindingImpl.E(view);
                    viewListDetailsBindingImpl.r();
                    return viewListDetailsBindingImpl;
            }
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f12213a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f12214a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
