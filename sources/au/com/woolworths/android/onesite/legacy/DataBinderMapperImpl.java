package au.com.woolworths.android.onesite.legacy;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.impl.b;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.legacy.databinding.ActivityAddFullDeliveryAddressBySearchBindingImpl;
import au.com.woolworths.android.onesite.legacy.databinding.ActivityCollectionModeSetupBindingImpl;
import au.com.woolworths.android.onesite.legacy.databinding.ActivityManageFullDeliveryAddressesBindingImpl;
import au.com.woolworths.android.onesite.legacy.databinding.ActivityRewardsChooserMoreBindingImpl;
import au.com.woolworths.android.onesite.legacy.databinding.ActivitySearchBindingImpl;
import au.com.woolworths.android.onesite.legacy.databinding.ActivityWebViewBindingImpl;
import au.com.woolworths.android.onesite.legacy.databinding.EpoxyItemCollectionModeVariantConditionBindingImpl;
import au.com.woolworths.android.onesite.legacy.databinding.EpoxyItemCollectionModeVariantDividerBindingImpl;
import au.com.woolworths.android.onesite.legacy.databinding.EpoxyItemCollectionModeVariantFootnoteBindingImpl;
import au.com.woolworths.android.onesite.legacy.databinding.EpoxyItemDeliveryAddressSearchResultBindingImpl;
import au.com.woolworths.android.onesite.legacy.databinding.EpoxyItemDeliveryAddressSearchResultFooterBindingImpl;
import au.com.woolworths.android.onesite.legacy.databinding.EpoxyItemDeliveryAddressSearchResultHeaderBindingImpl;
import au.com.woolworths.android.onesite.legacy.databinding.FragmentRewardsSetupBindingImpl;
import au.com.woolworths.android.onesite.legacy.databinding.IncludeConnectionErrorBindingImpl;
import au.com.woolworths.android.onesite.legacy.databinding.IncludeOnboardingStepperViewBindingImpl;
import au.com.woolworths.android.onesite.legacy.databinding.IncludeRewardsToolbarBinding;
import au.com.woolworths.android.onesite.legacy.databinding.IncludeRewardsToolbarBindingImpl;
import au.com.woolworths.android.onesite.legacy.databinding.IncludeSearchSuggestionBindingImpl;
import au.com.woolworths.android.onesite.legacy.databinding.IncludeUnableToLoadBindingImpl;
import au.com.woolworths.android.onesite.legacy.databinding.ItemPreviouslyUsedAddressBindingImpl;
import au.com.woolworths.android.onesite.legacy.databinding.ItemSearchResultBindingImpl;
import au.com.woolworths.android.onesite.legacy.databinding.LayoutCheckedPriceViewBindingImpl;
import au.com.woolworths.android.onesite.models.notification.NotificationResult;
import au.com.woolworths.android.onesite.modules.customviews.ObservableWebView;
import au.com.woolworths.views.CheckableConstraintLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f4264a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = a.b(139, 0, 1, "_all", "actionState");
            sparseArrayB.put(2, "address");
            sparseArrayB.put(3, "asset");
            sparseArrayB.put(4, "backgroundColor");
            sparseArrayB.put(5, "banner");
            sparseArrayB.put(6, "bannerAsset");
            sparseArrayB.put(7, "bannerIcon");
            sparseArrayB.put(8, "bannerState");
            sparseArrayB.put(9, "billingAddress");
            sparseArrayB.put(10, "body");
            sparseArrayB.put(11, "boostAnimationVisibility");
            sparseArrayB.put(12, "boostViewListener");
            sparseArrayB.put(13, "brandLabel");
            sparseArrayB.put(14, "buttonText");
            sparseArrayB.put(15, "buttonTint");
            sparseArrayB.put(16, "buttonTitle");
            sparseArrayB.put(17, NotificationResult.Notification.CAMPAIGN);
            sparseArrayB.put(18, "canShowWatchlist");
            sparseArrayB.put(19, "cents");
            sparseArrayB.put(20, "clickHandler");
            sparseArrayB.put(21, "clickHandlers");
            sparseArrayB.put(22, "clickListener");
            sparseArrayB.put(23, "coachMark");
            sparseArrayB.put(24, "collectionMethodOption");
            sparseArrayB.put(25, "condition");
            sparseArrayB.put(26, "containerTitle");
            sparseArrayB.put(27, "cta");
            sparseArrayB.put(28, "ctaText");
            sparseArrayB.put(29, "data");
            sparseArrayB.put(30, "deliveryNowWindow");
            sparseArrayB.put(31, "descriptionText");
            sparseArrayB.put(32, "directToBootNowWindow");
            sparseArrayB.put(33, "discountItem");
            sparseArrayB.put(34, "dispatchNote");
            sparseArrayB.put(35, "displayExpiryExtended");
            sparseArrayB.put(36, "dollars");
            sparseArrayB.put(37, "emptyState");
            sparseArrayB.put(38, "enableBoostAnimationContainerGap");
            sparseArrayB.put(39, "enabled");
            sparseArrayB.put(40, "errorState");
            sparseArrayB.put(41, "eventHandler");
            sparseArrayB.put(42, "filter");
            sparseArrayB.put(43, "footer");
            sparseArrayB.put(44, "fulfilmentWindow");
            sparseArrayB.put(45, "fulfilmentWindows");
            sparseArrayB.put(46, "fulfilmentWindowsOption");
            sparseArrayB.put(47, "fulfilmentWindowsSlot");
            sparseArrayB.put(48, "groupTitle");
            sparseArrayB.put(49, "handler");
            sparseArrayB.put(50, "header");
            sparseArrayB.put(51, "heightRes");
            sparseArrayB.put(52, "hostScreen");
            sparseArrayB.put(53, "htmlListener");
            sparseArrayB.put(54, "iconResId");
            sparseArrayB.put(55, "imageLoaderListener");
            sparseArrayB.put(56, "importantForAccessibility");
            sparseArrayB.put(57, "index");
            sparseArrayB.put(58, "info");
            sparseArrayB.put(59, "infoSectionItem");
            sparseArrayB.put(60, "inlineMessage");
            sparseArrayB.put(61, "insetBanner");
            sparseArrayB.put(62, "isAccountNotificationBadgeShown");
            sparseArrayB.put(63, "isButtonEnabled");
            sparseArrayB.put(64, "isChecked");
            sparseArrayB.put(65, "isComposeContentViewEnabled");
            sparseArrayB.put(66, "isCtaInProgress");
            sparseArrayB.put(67, "isEnabled");
            sparseArrayB.put(68, "isLoading");
            sparseArrayB.put(69, "isLowerPriceYellow");
            sparseArrayB.put(70, "isMarketplace");
            sparseArrayB.put(71, "isPopup");
            sparseArrayB.put(72, "isRewardStyle");
            sparseArrayB.put(73, "isSelected");
            sparseArrayB.put(74, "isUnlocking");
            sparseArrayB.put(75, "isWatchlisted");
            sparseArrayB.put(76, "item");
            sparseArrayB.put(77, "itemWidthRes");
            sparseArrayB.put(78, AnnotatedPrivateKey.LABEL);
            sparseArrayB.put(79, "labelStyle");
            sparseArrayB.put(80, "lightTheme");
            sparseArrayB.put(81, "linkHandler");
            sparseArrayB.put(82, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            sparseArrayB.put(83, "loadingMessage");
            sparseArrayB.put(84, "lottieAutoPlay");
            sparseArrayB.put(85, "lottieBackgroundColor");
            sparseArrayB.put(86, "lottieLoop");
            sparseArrayB.put(87, "margins");
            sparseArrayB.put(88, "markdownContent");
            sparseArrayB.put(89, "marketSellerGroup");
            sparseArrayB.put(90, "memberPriceInfo");
            sparseArrayB.put(91, "message");
            sparseArrayB.put(92, "offerViewItem");
            sparseArrayB.put(93, "onBannerClick");
            sparseArrayB.put(94, "onClick");
            sparseArrayB.put(95, "onPointsBalanceClick");
            sparseArrayB.put(96, "onQueryTextChangeListener");
            sparseArrayB.put(97, "onQueryTextFocusChangeListener");
            sparseArrayB.put(98, "onQueryTextSubmitListener");
            sparseArrayB.put(99, "optionText");
            sparseArrayB.put(100, "orderTotalDetails");
            sparseArrayB.put(101, "packagingMethodOption");
            sparseArrayB.put(102, "paddingBottom");
            sparseArrayB.put(103, "product");
            sparseArrayB.put(104, "productCard");
            sparseArrayB.put(105, "productCardConfig");
            sparseArrayB.put(106, "productConfig");
            sparseArrayB.put(107, "productData");
            sparseArrayB.put(108, "rewardsPointsBalance");
            sparseArrayB.put(109, "rewardsPointsBalanceData");
            sparseArrayB.put(110, "rewardsRegistered");
            sparseArrayB.put(111, "rewardsRegisteredRedeemable");
            sparseArrayB.put(112, "rewardsUnregistered");
            sparseArrayB.put(113, "searchQueryHint");
            sparseArrayB.put(114, "section");
            sparseArrayB.put(115, "sectionHeader");
            sparseArrayB.put(116, "sectionTitle");
            sparseArrayB.put(117, "seller");
            sparseArrayB.put(118, "sellerName");
            sparseArrayB.put(119, "shouldHideToolbar");
            sparseArrayB.put(120, "shouldShowLoadingState");
            sparseArrayB.put(121, "shouldShowNewBadge");
            sparseArrayB.put(122, "shouldShowNotificationDot");
            sparseArrayB.put(123, "shouldShowWebArrow");
            sparseArrayB.put(124, "showAddToListButton");
            sparseArrayB.put(125, "showBoostAnimation");
            sparseArrayB.put(126, "showLoadingView");
            sparseArrayB.put(127, "showNewDismissIcon");
            sparseArrayB.put(128, "showTigerDisplayExpiry");
            sparseArrayB.put(129, "showTigerOffersLabel");
            sparseArrayB.put(130, "singleLine");
            sparseArrayB.put(131, "state");
            sparseArrayB.put(132, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(133, "title");
            sparseArrayB.put(134, "viewListener");
            sparseArrayB.put(135, "viewModel");
            sparseArrayB.put(136, "viewState");
            sparseArrayB.put(137, "vocViewModel");
            sparseArrayB.put(138, "windowSubheader");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f4265a;

        static {
            HashMap map = new HashMap(21);
            f4265a = map;
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_add_full_delivery_address_by_search, map, "layout/activity_add_full_delivery_address_by_search_0", com.woolworths.R.layout.activity_collection_mode_setup, "layout/activity_collection_mode_setup_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_manage_full_delivery_addresses, map, "layout/activity_manage_full_delivery_addresses_0", com.woolworths.R.layout.activity_rewards_chooser_more, "layout/activity_rewards_chooser_more_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_search, map, "layout/activity_search_0", com.woolworths.R.layout.activity_web_view, "layout/activity_web_view_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_collection_mode_variant_condition, map, "layout/epoxy_item_collection_mode_variant_condition_0", com.woolworths.R.layout.epoxy_item_collection_mode_variant_divider, "layout/epoxy_item_collection_mode_variant_divider_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_collection_mode_variant_footnote, map, "layout/epoxy_item_collection_mode_variant_footnote_0", com.woolworths.R.layout.epoxy_item_delivery_address_search_result, "layout/epoxy_item_delivery_address_search_result_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_delivery_address_search_result_footer, map, "layout/epoxy_item_delivery_address_search_result_footer_0", com.woolworths.R.layout.epoxy_item_delivery_address_search_result_header, "layout/epoxy_item_delivery_address_search_result_header_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.fragment_rewards_setup, map, "layout/fragment_rewards_setup_0", com.woolworths.R.layout.include_connection_error, "layout/include_connection_error_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.include_onboarding_stepper_view, map, "layout/include_onboarding_stepper_view_0", com.woolworths.R.layout.include_rewards_toolbar, "layout/include_rewards_toolbar_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.include_search_suggestion, map, "layout/include_search_suggestion_0", com.woolworths.R.layout.include_unable_to_load, "layout/include_unable_to_load_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.item_previously_used_address, map, "layout/item_previously_used_address_0", com.woolworths.R.layout.item_search_result, "layout/item_search_result_0");
            map.put("layout/layout_checked_price_view_0", Integer.valueOf(com.woolworths.R.layout.layout_checked_price_view));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(21);
        f4264a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.activity_add_full_delivery_address_by_search, 1);
        sparseIntArray.put(com.woolworths.R.layout.activity_collection_mode_setup, 2);
        sparseIntArray.put(com.woolworths.R.layout.activity_manage_full_delivery_addresses, 3);
        sparseIntArray.put(com.woolworths.R.layout.activity_rewards_chooser_more, 4);
        sparseIntArray.put(com.woolworths.R.layout.activity_search, 5);
        sparseIntArray.put(com.woolworths.R.layout.activity_web_view, 6);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_collection_mode_variant_condition, 7);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_collection_mode_variant_divider, 8);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_collection_mode_variant_footnote, 9);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_delivery_address_search_result, 10);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_delivery_address_search_result_footer, 11);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_delivery_address_search_result_header, 12);
        sparseIntArray.put(com.woolworths.R.layout.fragment_rewards_setup, 13);
        sparseIntArray.put(com.woolworths.R.layout.include_connection_error, 14);
        sparseIntArray.put(com.woolworths.R.layout.include_onboarding_stepper_view, 15);
        sparseIntArray.put(com.woolworths.R.layout.include_rewards_toolbar, 16);
        sparseIntArray.put(com.woolworths.R.layout.include_search_suggestion, 17);
        sparseIntArray.put(com.woolworths.R.layout.include_unable_to_load, 18);
        sparseIntArray.put(com.woolworths.R.layout.item_previously_used_address, 19);
        sparseIntArray.put(com.woolworths.R.layout.item_search_result, 20);
        sparseIntArray.put(com.woolworths.R.layout.layout_checked_price_view, 21);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(12);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.base.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.base.shopapp.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.checkout.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.rewards.account.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.rewards.offers.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.shop.delivery.address.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.foundation.shop.editorder.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.product.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shared.ui.views.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shop.checkout.DataBinderMapperImpl());
        arrayList.add(new com.airbnb.epoxy.databinding.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f4264a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            switch (i2) {
                case 1:
                    if ("layout/activity_add_full_delivery_address_by_search_0".equals(tag)) {
                        return new ActivityAddFullDeliveryAddressBySearchBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for activity_add_full_delivery_address_by_search is invalid. Received: "));
                case 2:
                    if ("layout/activity_collection_mode_setup_0".equals(tag)) {
                        return new ActivityCollectionModeSetupBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for activity_collection_mode_setup is invalid. Received: "));
                case 3:
                    if ("layout/activity_manage_full_delivery_addresses_0".equals(tag)) {
                        return new ActivityManageFullDeliveryAddressesBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for activity_manage_full_delivery_addresses is invalid. Received: "));
                case 4:
                    if (!"layout/activity_rewards_chooser_more_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for activity_rewards_chooser_more is invalid. Received: "));
                    }
                    Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, ActivityRewardsChooserMoreBindingImpl.D, ActivityRewardsChooserMoreBindingImpl.E);
                    ActivityRewardsChooserMoreBindingImpl activityRewardsChooserMoreBindingImpl = new ActivityRewardsChooserMoreBindingImpl(dataBindingComponent, view, (IncludeRewardsToolbarBinding) objArrT[2], (AppBarLayout) objArrT[1], (FrameLayout) objArrT[3]);
                    activityRewardsChooserMoreBindingImpl.C = -1L;
                    IncludeRewardsToolbarBinding includeRewardsToolbarBinding = activityRewardsChooserMoreBindingImpl.y;
                    if (includeRewardsToolbarBinding != null) {
                        includeRewardsToolbarBinding.n = activityRewardsChooserMoreBindingImpl;
                    }
                    ((ConstraintLayout) objArrT[0]).setTag(null);
                    activityRewardsChooserMoreBindingImpl.z.setTag(null);
                    activityRewardsChooserMoreBindingImpl.E(view);
                    activityRewardsChooserMoreBindingImpl.r();
                    return activityRewardsChooserMoreBindingImpl;
                case 5:
                    if ("layout/activity_search_0".equals(tag)) {
                        return new ActivitySearchBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for activity_search is invalid. Received: "));
                case 6:
                    if (!"layout/activity_web_view_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for activity_web_view is invalid. Received: "));
                    }
                    Object[] objArrT2 = ViewDataBinding.t(dataBindingComponent, view, 6, null, ActivityWebViewBindingImpl.E);
                    View view2 = (View) objArrT2[3];
                    ActivityWebViewBindingImpl activityWebViewBindingImpl = new ActivityWebViewBindingImpl(dataBindingComponent, view, view2, (ObservableWebView) objArrT2[5], (Toolbar) objArrT2[1], (Toolbar) objArrT2[2]);
                    activityWebViewBindingImpl.D = -1L;
                    ((ConstraintLayout) objArrT2[0]).setTag(null);
                    activityWebViewBindingImpl.A.setTag(null);
                    activityWebViewBindingImpl.B.setTag(null);
                    activityWebViewBindingImpl.E(view);
                    activityWebViewBindingImpl.r();
                    return activityWebViewBindingImpl;
                case 7:
                    if (!"layout/epoxy_item_collection_mode_variant_condition_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_collection_mode_variant_condition is invalid. Received: "));
                    }
                    Object[] objArrT3 = ViewDataBinding.t(dataBindingComponent, view, 3, null, EpoxyItemCollectionModeVariantConditionBindingImpl.E);
                    CheckableConstraintLayout checkableConstraintLayout = (CheckableConstraintLayout) objArrT3[0];
                    EpoxyItemCollectionModeVariantConditionBindingImpl epoxyItemCollectionModeVariantConditionBindingImpl = new EpoxyItemCollectionModeVariantConditionBindingImpl(dataBindingComponent, view, checkableConstraintLayout, (CheckedTextView) objArrT3[1]);
                    epoxyItemCollectionModeVariantConditionBindingImpl.D = -1L;
                    epoxyItemCollectionModeVariantConditionBindingImpl.y.setTag(null);
                    epoxyItemCollectionModeVariantConditionBindingImpl.z.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, epoxyItemCollectionModeVariantConditionBindingImpl);
                    epoxyItemCollectionModeVariantConditionBindingImpl.r();
                    return epoxyItemCollectionModeVariantConditionBindingImpl;
                case 8:
                    if ("layout/epoxy_item_collection_mode_variant_divider_0".equals(tag)) {
                        return new EpoxyItemCollectionModeVariantDividerBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_collection_mode_variant_divider is invalid. Received: "));
                case 9:
                    if ("layout/epoxy_item_collection_mode_variant_footnote_0".equals(tag)) {
                        return new EpoxyItemCollectionModeVariantFootnoteBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_collection_mode_variant_footnote is invalid. Received: "));
                case 10:
                    if ("layout/epoxy_item_delivery_address_search_result_0".equals(tag)) {
                        return new EpoxyItemDeliveryAddressSearchResultBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_delivery_address_search_result is invalid. Received: "));
                case 11:
                    if ("layout/epoxy_item_delivery_address_search_result_footer_0".equals(tag)) {
                        return new EpoxyItemDeliveryAddressSearchResultFooterBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_delivery_address_search_result_footer is invalid. Received: "));
                case 12:
                    if (!"layout/epoxy_item_delivery_address_search_result_header_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_delivery_address_search_result_header is invalid. Received: "));
                    }
                    EpoxyItemDeliveryAddressSearchResultHeaderBindingImpl epoxyItemDeliveryAddressSearchResultHeaderBindingImpl = new EpoxyItemDeliveryAddressSearchResultHeaderBindingImpl(dataBindingComponent, view, (TextView) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
                    epoxyItemDeliveryAddressSearchResultHeaderBindingImpl.z = -1L;
                    epoxyItemDeliveryAddressSearchResultHeaderBindingImpl.y.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, epoxyItemDeliveryAddressSearchResultHeaderBindingImpl);
                    epoxyItemDeliveryAddressSearchResultHeaderBindingImpl.r();
                    return epoxyItemDeliveryAddressSearchResultHeaderBindingImpl;
                case 13:
                    if ("layout/fragment_rewards_setup_0".equals(tag)) {
                        return new FragmentRewardsSetupBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for fragment_rewards_setup is invalid. Received: "));
                case 14:
                    if (!"layout/include_connection_error_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for include_connection_error is invalid. Received: "));
                    }
                    Object[] objArrT4 = ViewDataBinding.t(dataBindingComponent, view, 3, null, IncludeConnectionErrorBindingImpl.B);
                    LinearLayout linearLayout = (LinearLayout) objArrT4[0];
                    IncludeConnectionErrorBindingImpl includeConnectionErrorBindingImpl = new IncludeConnectionErrorBindingImpl(view, linearLayout, (TextView) objArrT4[2], dataBindingComponent);
                    includeConnectionErrorBindingImpl.A = -1L;
                    includeConnectionErrorBindingImpl.y.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, includeConnectionErrorBindingImpl);
                    includeConnectionErrorBindingImpl.r();
                    return includeConnectionErrorBindingImpl;
                case 15:
                    if (!"layout/include_onboarding_stepper_view_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for include_onboarding_stepper_view is invalid. Received: "));
                    }
                    Object[] objArrT5 = ViewDataBinding.t(dataBindingComponent, view, 9, null, IncludeOnboardingStepperViewBindingImpl.G);
                    IncludeOnboardingStepperViewBindingImpl includeOnboardingStepperViewBindingImpl = new IncludeOnboardingStepperViewBindingImpl(dataBindingComponent, view, (ImageView) objArrT5[1], (TextView) objArrT5[2], (ImageView) objArrT5[4], (TextView) objArrT5[5], (ImageView) objArrT5[7], (TextView) objArrT5[8]);
                    includeOnboardingStepperViewBindingImpl.F = -1L;
                    ((ConstraintLayout) objArrT5[0]).setTag(null);
                    includeOnboardingStepperViewBindingImpl.E(view);
                    includeOnboardingStepperViewBindingImpl.r();
                    return includeOnboardingStepperViewBindingImpl;
                case 16:
                    if (!"layout/include_rewards_toolbar_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for include_rewards_toolbar is invalid. Received: "));
                    }
                    Object[] objArrT6 = ViewDataBinding.t(dataBindingComponent, view, 2, null, IncludeRewardsToolbarBindingImpl.A);
                    IncludeRewardsToolbarBindingImpl includeRewardsToolbarBindingImpl = new IncludeRewardsToolbarBindingImpl(dataBindingComponent, view, (Toolbar) objArrT6[0]);
                    includeRewardsToolbarBindingImpl.z = -1L;
                    includeRewardsToolbarBindingImpl.y.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, includeRewardsToolbarBindingImpl);
                    includeRewardsToolbarBindingImpl.r();
                    return includeRewardsToolbarBindingImpl;
                case 17:
                    if (!"layout/include_search_suggestion_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for include_search_suggestion is invalid. Received: "));
                    }
                    Object[] objArrT7 = ViewDataBinding.t(dataBindingComponent, view, 4, null, IncludeSearchSuggestionBindingImpl.C);
                    IncludeSearchSuggestionBindingImpl includeSearchSuggestionBindingImpl = new IncludeSearchSuggestionBindingImpl(dataBindingComponent, view, (RecyclerView) objArrT7[3], (ComposeView) objArrT7[2], (ComposeView) objArrT7[1]);
                    includeSearchSuggestionBindingImpl.B = -1L;
                    ((ConstraintLayout) objArrT7[0]).setTag(null);
                    includeSearchSuggestionBindingImpl.E(view);
                    includeSearchSuggestionBindingImpl.r();
                    return includeSearchSuggestionBindingImpl;
                case 18:
                    if (!"layout/include_unable_to_load_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for include_unable_to_load is invalid. Received: "));
                    }
                    Object[] objArrT8 = ViewDataBinding.t(dataBindingComponent, view, 3, null, IncludeUnableToLoadBindingImpl.B);
                    LinearLayout linearLayout2 = (LinearLayout) objArrT8[0];
                    IncludeUnableToLoadBindingImpl includeUnableToLoadBindingImpl = new IncludeUnableToLoadBindingImpl(view, linearLayout2, (TextView) objArrT8[2], dataBindingComponent);
                    includeUnableToLoadBindingImpl.A = -1L;
                    includeUnableToLoadBindingImpl.y.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, includeUnableToLoadBindingImpl);
                    includeUnableToLoadBindingImpl.r();
                    return includeUnableToLoadBindingImpl;
                case 19:
                    if ("layout/item_previously_used_address_0".equals(tag)) {
                        return new ItemPreviouslyUsedAddressBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for item_previously_used_address is invalid. Received: "));
                case 20:
                    if ("layout/item_search_result_0".equals(tag)) {
                        return new ItemSearchResultBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for item_search_result is invalid. Received: "));
                case 21:
                    if ("layout/layout_checked_price_view_0".equals(tag)) {
                        return new LayoutCheckedPriceViewBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for layout_checked_price_view is invalid. Received: "));
            }
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f4264a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f4265a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
