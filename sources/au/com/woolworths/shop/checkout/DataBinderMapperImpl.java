package au.com.woolworths.shop.checkout;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
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
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeInsetBannerBinding;
import au.com.woolworths.android.onesite.models.notification.NotificationResult;
import au.com.woolworths.shop.checkout.databinding.ActivityFulfilmentWindowsBindingImpl;
import au.com.woolworths.shop.checkout.databinding.ActivityOrderConfirmationBindingImpl;
import au.com.woolworths.shop.checkout.databinding.EpoxyItemCheckoutCampaignBindingImpl;
import au.com.woolworths.shop.checkout.databinding.EpoxyItemCheckoutCampaignHeaderBindingImpl;
import au.com.woolworths.shop.checkout.databinding.EpoxyItemCheckoutCollectionMethodOptionBindingImpl;
import au.com.woolworths.shop.checkout.databinding.EpoxyItemCheckoutFulfilmentMessageBindingImpl;
import au.com.woolworths.shop.checkout.databinding.EpoxyItemCheckoutFulfilmentSlotBindingImpl;
import au.com.woolworths.shop.checkout.databinding.EpoxyItemCheckoutFulfilmentTitleBindingImpl;
import au.com.woolworths.shop.checkout.databinding.EpoxyItemCheckoutFulfilmentWindowsOptionBindingImpl;
import au.com.woolworths.shop.checkout.databinding.EpoxyItemCheckoutMarketProductBindingImpl;
import au.com.woolworths.shop.checkout.databinding.EpoxyItemCheckoutMarketSellerGroupBindingImpl;
import au.com.woolworths.shop.checkout.databinding.EpoxyItemCheckoutOrderAddressBindingImpl;
import au.com.woolworths.shop.checkout.databinding.EpoxyItemCheckoutOrderAddressMarketSellerBindingImpl;
import au.com.woolworths.shop.checkout.databinding.EpoxyItemCheckoutPackagingMethodOptionBindingImpl;
import au.com.woolworths.shop.checkout.databinding.EpoxyItemCheckoutProductBindingImpl;
import au.com.woolworths.shop.checkout.databinding.EpoxyItemCheckoutProductMessageBindingImpl;
import au.com.woolworths.shop.checkout.databinding.EpoxyItemCheckoutProductsHeaderBindingImpl;
import au.com.woolworths.shop.checkout.databinding.EpoxyItemCheckoutPromotionDiscountBindingImpl;
import au.com.woolworths.shop.checkout.databinding.EpoxyItemCheckoutRewardsRegisteredBindingImpl;
import au.com.woolworths.shop.checkout.databinding.EpoxyItemCheckoutRewardsRegisteredRedeemableBindingImpl;
import au.com.woolworths.shop.checkout.databinding.EpoxyItemCheckoutRewardsUnregisteredBindingImpl;
import au.com.woolworths.shop.checkout.databinding.EpoxyItemCheckoutSectionHeaderBindingImpl;
import au.com.woolworths.shop.checkout.databinding.EpoxyItemCheckoutSectionTitleBindingImpl;
import au.com.woolworths.shop.checkout.databinding.EpoxyItemCheckoutSummaryBillingAddressBindingImpl;
import au.com.woolworths.shop.checkout.databinding.FragmentCheckoutContentBindingImpl;
import au.com.woolworths.shop.checkout.databinding.FragmentCheckoutSummaryBindingImpl;
import au.com.woolworths.shop.checkout.databinding.FragmentFulfilmentWindowsBindingImpl;
import au.com.woolworths.shop.checkout.databinding.FragmentFulfilmentWindowsGroupBindingImpl;
import au.com.woolworths.shop.checkout.databinding.IncludeCheckoutAppBarBindingImpl;
import au.com.woolworths.shop.checkout.databinding.IncludeCheckoutDeliveryNowBindingImpl;
import au.com.woolworths.shop.checkout.databinding.IncludeCheckoutDirectToBootNowBindingImpl;
import au.com.woolworths.shop.checkout.databinding.IncludeCheckoutOrderTotalDetailsBindingImpl;
import au.com.woolworths.shop.checkout.databinding.IncludeExtraInfoButtonBindingImpl;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import shop.checkout.ItemCheckoutFulfilmentWindowsBindingImpl;

/* loaded from: classes4.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f10538a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = a.b(127, 0, 1, "_all", "actionState");
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
            sparseArrayB.put(19, "clickHandler");
            sparseArrayB.put(20, "clickHandlers");
            sparseArrayB.put(21, "clickListener");
            sparseArrayB.put(22, "coachMark");
            sparseArrayB.put(23, "collectionMethodOption");
            sparseArrayB.put(24, "containerTitle");
            sparseArrayB.put(25, "cta");
            sparseArrayB.put(26, "ctaText");
            sparseArrayB.put(27, "data");
            sparseArrayB.put(28, "deliveryNowWindow");
            sparseArrayB.put(29, "descriptionText");
            sparseArrayB.put(30, "directToBootNowWindow");
            sparseArrayB.put(31, "discountItem");
            sparseArrayB.put(32, "dispatchNote");
            sparseArrayB.put(33, "displayExpiryExtended");
            sparseArrayB.put(34, "emptyState");
            sparseArrayB.put(35, "enableBoostAnimationContainerGap");
            sparseArrayB.put(36, "enabled");
            sparseArrayB.put(37, "errorState");
            sparseArrayB.put(38, "filter");
            sparseArrayB.put(39, "footer");
            sparseArrayB.put(40, "fulfilmentWindow");
            sparseArrayB.put(41, "fulfilmentWindows");
            sparseArrayB.put(42, "fulfilmentWindowsOption");
            sparseArrayB.put(43, "fulfilmentWindowsSlot");
            sparseArrayB.put(44, "groupTitle");
            sparseArrayB.put(45, "handler");
            sparseArrayB.put(46, "header");
            sparseArrayB.put(47, "heightRes");
            sparseArrayB.put(48, "hostScreen");
            sparseArrayB.put(49, "htmlListener");
            sparseArrayB.put(50, "iconResId");
            sparseArrayB.put(51, "imageLoaderListener");
            sparseArrayB.put(52, "importantForAccessibility");
            sparseArrayB.put(53, "index");
            sparseArrayB.put(54, "info");
            sparseArrayB.put(55, "infoSectionItem");
            sparseArrayB.put(56, "inlineMessage");
            sparseArrayB.put(57, "insetBanner");
            sparseArrayB.put(58, "isAccountNotificationBadgeShown");
            sparseArrayB.put(59, "isButtonEnabled");
            sparseArrayB.put(60, "isChecked");
            sparseArrayB.put(61, "isComposeContentViewEnabled");
            sparseArrayB.put(62, "isCtaInProgress");
            sparseArrayB.put(63, "isEnabled");
            sparseArrayB.put(64, "isLoading");
            sparseArrayB.put(65, "isLowerPriceYellow");
            sparseArrayB.put(66, "isMarketplace");
            sparseArrayB.put(67, "isPopup");
            sparseArrayB.put(68, "isRewardStyle");
            sparseArrayB.put(69, "isSelected");
            sparseArrayB.put(70, "isUnlocking");
            sparseArrayB.put(71, "isWatchlisted");
            sparseArrayB.put(72, "item");
            sparseArrayB.put(73, "itemWidthRes");
            sparseArrayB.put(74, AnnotatedPrivateKey.LABEL);
            sparseArrayB.put(75, "labelStyle");
            sparseArrayB.put(76, "linkHandler");
            sparseArrayB.put(77, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            sparseArrayB.put(78, "loadingMessage");
            sparseArrayB.put(79, "lottieAutoPlay");
            sparseArrayB.put(80, "lottieBackgroundColor");
            sparseArrayB.put(81, "lottieLoop");
            sparseArrayB.put(82, "margins");
            sparseArrayB.put(83, "markdownContent");
            sparseArrayB.put(84, "marketSellerGroup");
            sparseArrayB.put(85, "memberPriceInfo");
            sparseArrayB.put(86, "message");
            sparseArrayB.put(87, "offerViewItem");
            sparseArrayB.put(88, "onBannerClick");
            sparseArrayB.put(89, "onClick");
            sparseArrayB.put(90, "onPointsBalanceClick");
            sparseArrayB.put(91, "onQueryTextChangeListener");
            sparseArrayB.put(92, "onQueryTextFocusChangeListener");
            sparseArrayB.put(93, "onQueryTextSubmitListener");
            sparseArrayB.put(94, "optionText");
            sparseArrayB.put(95, "orderTotalDetails");
            sparseArrayB.put(96, "packagingMethodOption");
            sparseArrayB.put(97, "paddingBottom");
            sparseArrayB.put(98, "product");
            sparseArrayB.put(99, "productCard");
            sparseArrayB.put(100, "productCardConfig");
            sparseArrayB.put(101, "productConfig");
            sparseArrayB.put(102, "productData");
            sparseArrayB.put(103, "rewardsPointsBalance");
            sparseArrayB.put(104, "rewardsPointsBalanceData");
            sparseArrayB.put(105, "rewardsRegistered");
            sparseArrayB.put(106, "rewardsRegisteredRedeemable");
            sparseArrayB.put(107, "rewardsUnregistered");
            sparseArrayB.put(108, "searchQueryHint");
            sparseArrayB.put(109, "section");
            sparseArrayB.put(110, "sectionHeader");
            sparseArrayB.put(111, "sectionTitle");
            sparseArrayB.put(112, "seller");
            sparseArrayB.put(113, "sellerName");
            sparseArrayB.put(114, "showAddToListButton");
            sparseArrayB.put(115, "showBoostAnimation");
            sparseArrayB.put(116, "showNewDismissIcon");
            sparseArrayB.put(117, "showTigerDisplayExpiry");
            sparseArrayB.put(118, "showTigerOffersLabel");
            sparseArrayB.put(119, "singleLine");
            sparseArrayB.put(120, "state");
            sparseArrayB.put(121, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(122, "title");
            sparseArrayB.put(123, "viewListener");
            sparseArrayB.put(124, "viewModel");
            sparseArrayB.put(125, "vocViewModel");
            sparseArrayB.put(126, "windowSubheader");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f10539a;

        static {
            HashMap map = new HashMap(34);
            f10539a = map;
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_fulfilment_windows, map, "layout/activity_fulfilment_windows_0", com.woolworths.R.layout.activity_order_confirmation, "layout/activity_order_confirmation_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_checkout_campaign, map, "layout/epoxy_item_checkout_campaign_0", com.woolworths.R.layout.epoxy_item_checkout_campaign_header, "layout/epoxy_item_checkout_campaign_header_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_checkout_collection_method_option, map, "layout/epoxy_item_checkout_collection_method_option_0", com.woolworths.R.layout.epoxy_item_checkout_fulfilment_message, "layout/epoxy_item_checkout_fulfilment_message_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_checkout_fulfilment_slot, map, "layout/epoxy_item_checkout_fulfilment_slot_0", com.woolworths.R.layout.epoxy_item_checkout_fulfilment_title, "layout/epoxy_item_checkout_fulfilment_title_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_checkout_fulfilment_windows_option, map, "layout/epoxy_item_checkout_fulfilment_windows_option_0", com.woolworths.R.layout.epoxy_item_checkout_market_product, "layout/epoxy_item_checkout_market_product_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_checkout_market_seller_group, map, "layout/epoxy_item_checkout_market_seller_group_0", com.woolworths.R.layout.epoxy_item_checkout_order_address, "layout/epoxy_item_checkout_order_address_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_checkout_order_address_market_seller, map, "layout/epoxy_item_checkout_order_address_market_seller_0", com.woolworths.R.layout.epoxy_item_checkout_packaging_method_option, "layout/epoxy_item_checkout_packaging_method_option_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_checkout_product, map, "layout/epoxy_item_checkout_product_0", com.woolworths.R.layout.epoxy_item_checkout_product_message, "layout/epoxy_item_checkout_product_message_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_checkout_products_header, map, "layout/epoxy_item_checkout_products_header_0", com.woolworths.R.layout.epoxy_item_checkout_promotion_discount, "layout/epoxy_item_checkout_promotion_discount_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_checkout_rewards_registered, map, "layout/epoxy_item_checkout_rewards_registered_0", com.woolworths.R.layout.epoxy_item_checkout_rewards_registered_redeemable, "layout/epoxy_item_checkout_rewards_registered_redeemable_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_checkout_rewards_unregistered, map, "layout/epoxy_item_checkout_rewards_unregistered_0", com.woolworths.R.layout.epoxy_item_checkout_section_header, "layout/epoxy_item_checkout_section_header_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_checkout_section_title, map, "layout/epoxy_item_checkout_section_title_0", com.woolworths.R.layout.epoxy_item_checkout_summary_billing_address, "layout/epoxy_item_checkout_summary_billing_address_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.fragment_checkout_content, map, "layout/fragment_checkout_content_0", com.woolworths.R.layout.fragment_checkout_summary, "layout/fragment_checkout_summary_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.fragment_fulfilment_windows, map, "layout/fragment_fulfilment_windows_0", com.woolworths.R.layout.fragment_fulfilment_windows_group, "layout/fragment_fulfilment_windows_group_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.include_checkout_app_bar, map, "layout/include_checkout_app_bar_0", com.woolworths.R.layout.include_checkout_delivery_now, "layout/include_checkout_delivery_now_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.include_checkout_direct_to_boot_now, map, "layout/include_checkout_direct_to_boot_now_0", com.woolworths.R.layout.include_checkout_order_total_details, "layout/include_checkout_order_total_details_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.include_extra_info_button, map, "layout/include_extra_info_button_0", com.woolworths.R.layout.item_checkout_fulfillment_windows, "layout/item_checkout_fulfillment_windows_0");
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(34);
        f10538a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.activity_fulfilment_windows, 1);
        sparseIntArray.put(com.woolworths.R.layout.activity_order_confirmation, 2);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_checkout_campaign, 3);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_checkout_campaign_header, 4);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_checkout_collection_method_option, 5);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_checkout_fulfilment_message, 6);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_checkout_fulfilment_slot, 7);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_checkout_fulfilment_title, 8);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_checkout_fulfilment_windows_option, 9);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_checkout_market_product, 10);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_checkout_market_seller_group, 11);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_checkout_order_address, 12);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_checkout_order_address_market_seller, 13);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_checkout_packaging_method_option, 14);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_checkout_product, 15);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_checkout_product_message, 16);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_checkout_products_header, 17);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_checkout_promotion_discount, 18);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_checkout_rewards_registered, 19);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_checkout_rewards_registered_redeemable, 20);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_checkout_rewards_unregistered, 21);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_checkout_section_header, 22);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_checkout_section_title, 23);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_checkout_summary_billing_address, 24);
        sparseIntArray.put(com.woolworths.R.layout.fragment_checkout_content, 25);
        sparseIntArray.put(com.woolworths.R.layout.fragment_checkout_summary, 26);
        sparseIntArray.put(com.woolworths.R.layout.fragment_fulfilment_windows, 27);
        sparseIntArray.put(com.woolworths.R.layout.fragment_fulfilment_windows_group, 28);
        sparseIntArray.put(com.woolworths.R.layout.include_checkout_app_bar, 29);
        sparseIntArray.put(com.woolworths.R.layout.include_checkout_delivery_now, 30);
        sparseIntArray.put(com.woolworths.R.layout.include_checkout_direct_to_boot_now, 31);
        sparseIntArray.put(com.woolworths.R.layout.include_checkout_order_total_details, 32);
        sparseIntArray.put(com.woolworths.R.layout.include_extra_info_button, 33);
        sparseIntArray.put(com.woolworths.R.layout.item_checkout_fulfillment_windows, 34);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(9);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.base.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.base.shopapp.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.shop.voc.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.foundation.shop.bottomsheet.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.foundation.shop.editorder.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shared.ui.views.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shop.cart.DataBinderMapperImpl());
        arrayList.add(new com.airbnb.epoxy.databinding.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f10538a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            switch (i2) {
                case 1:
                    if (!"layout/activity_fulfilment_windows_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for activity_fulfilment_windows is invalid. Received: "));
                    }
                    Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, null, ActivityFulfilmentWindowsBindingImpl.A);
                    Toolbar toolbar = (Toolbar) objArrT[2];
                    ActivityFulfilmentWindowsBindingImpl activityFulfilmentWindowsBindingImpl = new ActivityFulfilmentWindowsBindingImpl(dataBindingComponent, view, toolbar);
                    activityFulfilmentWindowsBindingImpl.z = -1L;
                    ((ConstraintLayout) objArrT[0]).setTag(null);
                    activityFulfilmentWindowsBindingImpl.E(view);
                    activityFulfilmentWindowsBindingImpl.r();
                    return activityFulfilmentWindowsBindingImpl;
                case 2:
                    if ("layout/activity_order_confirmation_0".equals(tag)) {
                        return new ActivityOrderConfirmationBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for activity_order_confirmation is invalid. Received: "));
                case 3:
                    if ("layout/epoxy_item_checkout_campaign_0".equals(tag)) {
                        return new EpoxyItemCheckoutCampaignBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_checkout_campaign is invalid. Received: "));
                case 4:
                    if (!"layout/epoxy_item_checkout_campaign_header_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_checkout_campaign_header is invalid. Received: "));
                    }
                    Object[] objArrT2 = ViewDataBinding.t(dataBindingComponent, view, 1, null, null);
                    EpoxyItemCheckoutCampaignHeaderBindingImpl epoxyItemCheckoutCampaignHeaderBindingImpl = new EpoxyItemCheckoutCampaignHeaderBindingImpl(dataBindingComponent, view, 0);
                    epoxyItemCheckoutCampaignHeaderBindingImpl.y = -1L;
                    ((ConstraintLayout) objArrT2[0]).setTag(null);
                    epoxyItemCheckoutCampaignHeaderBindingImpl.E(view);
                    epoxyItemCheckoutCampaignHeaderBindingImpl.r();
                    return epoxyItemCheckoutCampaignHeaderBindingImpl;
                case 5:
                    if ("layout/epoxy_item_checkout_collection_method_option_0".equals(tag)) {
                        return new EpoxyItemCheckoutCollectionMethodOptionBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_checkout_collection_method_option is invalid. Received: "));
                case 6:
                    if (!"layout/epoxy_item_checkout_fulfilment_message_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_checkout_fulfilment_message is invalid. Received: "));
                    }
                    Object[] objArrT3 = ViewDataBinding.t(dataBindingComponent, view, 7, null, EpoxyItemCheckoutFulfilmentMessageBindingImpl.C);
                    TextView textView = (TextView) objArrT3[2];
                    TextView textView2 = (TextView) objArrT3[1];
                    EpoxyItemCheckoutFulfilmentMessageBindingImpl epoxyItemCheckoutFulfilmentMessageBindingImpl = new EpoxyItemCheckoutFulfilmentMessageBindingImpl(dataBindingComponent, view, textView, textView2);
                    epoxyItemCheckoutFulfilmentMessageBindingImpl.B = -1L;
                    ((ConstraintLayout) objArrT3[0]).setTag(null);
                    epoxyItemCheckoutFulfilmentMessageBindingImpl.y.setTag(null);
                    epoxyItemCheckoutFulfilmentMessageBindingImpl.z.setTag(null);
                    epoxyItemCheckoutFulfilmentMessageBindingImpl.E(view);
                    epoxyItemCheckoutFulfilmentMessageBindingImpl.r();
                    return epoxyItemCheckoutFulfilmentMessageBindingImpl;
                case 7:
                    if ("layout/epoxy_item_checkout_fulfilment_slot_0".equals(tag)) {
                        return new EpoxyItemCheckoutFulfilmentSlotBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_checkout_fulfilment_slot is invalid. Received: "));
                case 8:
                    if ("layout/epoxy_item_checkout_fulfilment_title_0".equals(tag)) {
                        return new EpoxyItemCheckoutFulfilmentTitleBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_checkout_fulfilment_title is invalid. Received: "));
                case 9:
                    if ("layout/epoxy_item_checkout_fulfilment_windows_option_0".equals(tag)) {
                        return new EpoxyItemCheckoutFulfilmentWindowsOptionBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_checkout_fulfilment_windows_option is invalid. Received: "));
                case 10:
                    if ("layout/epoxy_item_checkout_market_product_0".equals(tag)) {
                        return new EpoxyItemCheckoutMarketProductBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_checkout_market_product is invalid. Received: "));
                case 11:
                    if (!"layout/epoxy_item_checkout_market_seller_group_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_checkout_market_seller_group is invalid. Received: "));
                    }
                    Object[] objArrT4 = ViewDataBinding.t(dataBindingComponent, view, 3, null, null);
                    EpoxyItemCheckoutMarketSellerGroupBindingImpl epoxyItemCheckoutMarketSellerGroupBindingImpl = new EpoxyItemCheckoutMarketSellerGroupBindingImpl(dataBindingComponent, view, (ConstraintLayout) objArrT4[0], (TextView) objArrT4[2], (TextView) objArrT4[1]);
                    epoxyItemCheckoutMarketSellerGroupBindingImpl.C = -1L;
                    epoxyItemCheckoutMarketSellerGroupBindingImpl.y.setTag(null);
                    epoxyItemCheckoutMarketSellerGroupBindingImpl.z.setTag(null);
                    epoxyItemCheckoutMarketSellerGroupBindingImpl.A.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, epoxyItemCheckoutMarketSellerGroupBindingImpl);
                    epoxyItemCheckoutMarketSellerGroupBindingImpl.r();
                    return epoxyItemCheckoutMarketSellerGroupBindingImpl;
                case 12:
                    if (!"layout/epoxy_item_checkout_order_address_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_checkout_order_address is invalid. Received: "));
                    }
                    Object[] objArrT5 = ViewDataBinding.t(dataBindingComponent, view, 6, EpoxyItemCheckoutOrderAddressBindingImpl.H, null);
                    EpoxyItemCheckoutOrderAddressBindingImpl epoxyItemCheckoutOrderAddressBindingImpl = new EpoxyItemCheckoutOrderAddressBindingImpl(dataBindingComponent, view, (TextView) objArrT5[3], (TextView) objArrT5[4], (ImageView) objArrT5[1], (IncludeInsetBannerBinding) objArrT5[5], (TextView) objArrT5[2]);
                    epoxyItemCheckoutOrderAddressBindingImpl.G = -1L;
                    epoxyItemCheckoutOrderAddressBindingImpl.y.setTag(null);
                    epoxyItemCheckoutOrderAddressBindingImpl.z.setTag(null);
                    epoxyItemCheckoutOrderAddressBindingImpl.A.setTag(null);
                    IncludeInsetBannerBinding includeInsetBannerBinding = epoxyItemCheckoutOrderAddressBindingImpl.B;
                    if (includeInsetBannerBinding != null) {
                        includeInsetBannerBinding.n = epoxyItemCheckoutOrderAddressBindingImpl;
                    }
                    ((ConstraintLayout) objArrT5[0]).setTag(null);
                    epoxyItemCheckoutOrderAddressBindingImpl.C.setTag(null);
                    epoxyItemCheckoutOrderAddressBindingImpl.E(view);
                    epoxyItemCheckoutOrderAddressBindingImpl.r();
                    return epoxyItemCheckoutOrderAddressBindingImpl;
                case 13:
                    if (!"layout/epoxy_item_checkout_order_address_market_seller_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_checkout_order_address_market_seller is invalid. Received: "));
                    }
                    Object[] objArrT6 = ViewDataBinding.t(dataBindingComponent, view, 3, null, null);
                    EpoxyItemCheckoutOrderAddressMarketSellerBindingImpl epoxyItemCheckoutOrderAddressMarketSellerBindingImpl = new EpoxyItemCheckoutOrderAddressMarketSellerBindingImpl(dataBindingComponent, view, (TextView) objArrT6[2], (TextView) objArrT6[1]);
                    epoxyItemCheckoutOrderAddressMarketSellerBindingImpl.B = -1L;
                    epoxyItemCheckoutOrderAddressMarketSellerBindingImpl.y.setTag(null);
                    ((LinearLayout) objArrT6[0]).setTag(null);
                    epoxyItemCheckoutOrderAddressMarketSellerBindingImpl.z.setTag(null);
                    epoxyItemCheckoutOrderAddressMarketSellerBindingImpl.E(view);
                    epoxyItemCheckoutOrderAddressMarketSellerBindingImpl.r();
                    return epoxyItemCheckoutOrderAddressMarketSellerBindingImpl;
                case 14:
                    if ("layout/epoxy_item_checkout_packaging_method_option_0".equals(tag)) {
                        return new EpoxyItemCheckoutPackagingMethodOptionBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_checkout_packaging_method_option is invalid. Received: "));
                case 15:
                    if ("layout/epoxy_item_checkout_product_0".equals(tag)) {
                        return new EpoxyItemCheckoutProductBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_checkout_product is invalid. Received: "));
                case 16:
                    if ("layout/epoxy_item_checkout_product_message_0".equals(tag)) {
                        return new EpoxyItemCheckoutProductMessageBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_checkout_product_message is invalid. Received: "));
                case 17:
                    if (!"layout/epoxy_item_checkout_products_header_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_checkout_products_header is invalid. Received: "));
                    }
                    Object[] objArrT7 = ViewDataBinding.t(dataBindingComponent, view, 3, null, null);
                    EpoxyItemCheckoutProductsHeaderBindingImpl epoxyItemCheckoutProductsHeaderBindingImpl = new EpoxyItemCheckoutProductsHeaderBindingImpl(dataBindingComponent, view, (TextView) objArrT7[2], (LinearLayout) objArrT7[0], (TextView) objArrT7[1]);
                    epoxyItemCheckoutProductsHeaderBindingImpl.D = -1L;
                    epoxyItemCheckoutProductsHeaderBindingImpl.y.setTag(null);
                    epoxyItemCheckoutProductsHeaderBindingImpl.z.setTag(null);
                    epoxyItemCheckoutProductsHeaderBindingImpl.A.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, epoxyItemCheckoutProductsHeaderBindingImpl);
                    epoxyItemCheckoutProductsHeaderBindingImpl.r();
                    return epoxyItemCheckoutProductsHeaderBindingImpl;
                case 18:
                    if (!"layout/epoxy_item_checkout_promotion_discount_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_checkout_promotion_discount is invalid. Received: "));
                    }
                    Object[] objArrT8 = ViewDataBinding.t(dataBindingComponent, view, 3, null, null);
                    EpoxyItemCheckoutPromotionDiscountBindingImpl epoxyItemCheckoutPromotionDiscountBindingImpl = new EpoxyItemCheckoutPromotionDiscountBindingImpl(dataBindingComponent, view, (TextView) objArrT8[2], (TextView) objArrT8[1]);
                    epoxyItemCheckoutPromotionDiscountBindingImpl.B = -1L;
                    ((ConstraintLayout) objArrT8[0]).setTag(null);
                    epoxyItemCheckoutPromotionDiscountBindingImpl.y.setTag(null);
                    epoxyItemCheckoutPromotionDiscountBindingImpl.z.setTag(null);
                    epoxyItemCheckoutPromotionDiscountBindingImpl.E(view);
                    epoxyItemCheckoutPromotionDiscountBindingImpl.r();
                    return epoxyItemCheckoutPromotionDiscountBindingImpl;
                case 19:
                    if ("layout/epoxy_item_checkout_rewards_registered_0".equals(tag)) {
                        return new EpoxyItemCheckoutRewardsRegisteredBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_checkout_rewards_registered is invalid. Received: "));
                case 20:
                    if ("layout/epoxy_item_checkout_rewards_registered_redeemable_0".equals(tag)) {
                        return new EpoxyItemCheckoutRewardsRegisteredRedeemableBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_checkout_rewards_registered_redeemable is invalid. Received: "));
                case 21:
                    if ("layout/epoxy_item_checkout_rewards_unregistered_0".equals(tag)) {
                        return new EpoxyItemCheckoutRewardsUnregisteredBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_checkout_rewards_unregistered is invalid. Received: "));
                case 22:
                    if ("layout/epoxy_item_checkout_section_header_0".equals(tag)) {
                        return new EpoxyItemCheckoutSectionHeaderBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_checkout_section_header is invalid. Received: "));
                case 23:
                    if (!"layout/epoxy_item_checkout_section_title_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_checkout_section_title is invalid. Received: "));
                    }
                    EpoxyItemCheckoutSectionTitleBindingImpl epoxyItemCheckoutSectionTitleBindingImpl = new EpoxyItemCheckoutSectionTitleBindingImpl(dataBindingComponent, view, (TextView) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
                    epoxyItemCheckoutSectionTitleBindingImpl.A = -1L;
                    epoxyItemCheckoutSectionTitleBindingImpl.y.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, epoxyItemCheckoutSectionTitleBindingImpl);
                    epoxyItemCheckoutSectionTitleBindingImpl.r();
                    return epoxyItemCheckoutSectionTitleBindingImpl;
                case 24:
                    if ("layout/epoxy_item_checkout_summary_billing_address_0".equals(tag)) {
                        return new EpoxyItemCheckoutSummaryBillingAddressBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_checkout_summary_billing_address is invalid. Received: "));
                case 25:
                    if ("layout/fragment_checkout_content_0".equals(tag)) {
                        return new FragmentCheckoutContentBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for fragment_checkout_content is invalid. Received: "));
                case 26:
                    if (!"layout/fragment_checkout_summary_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for fragment_checkout_summary is invalid. Received: "));
                    }
                    Object[] objArrT9 = ViewDataBinding.t(dataBindingComponent, view, 1, null, null);
                    FragmentCheckoutSummaryBindingImpl fragmentCheckoutSummaryBindingImpl = new FragmentCheckoutSummaryBindingImpl(dataBindingComponent, view, 0);
                    fragmentCheckoutSummaryBindingImpl.y = -1L;
                    ((ConstraintLayout) objArrT9[0]).setTag(null);
                    fragmentCheckoutSummaryBindingImpl.E(view);
                    fragmentCheckoutSummaryBindingImpl.r();
                    return fragmentCheckoutSummaryBindingImpl;
                case 27:
                    if ("layout/fragment_fulfilment_windows_0".equals(tag)) {
                        return new FragmentFulfilmentWindowsBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for fragment_fulfilment_windows is invalid. Received: "));
                case 28:
                    if (!"layout/fragment_fulfilment_windows_group_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for fragment_fulfilment_windows_group is invalid. Received: "));
                    }
                    FragmentFulfilmentWindowsGroupBindingImpl fragmentFulfilmentWindowsGroupBindingImpl = new FragmentFulfilmentWindowsGroupBindingImpl(dataBindingComponent, view, (EpoxyRecyclerView) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
                    fragmentFulfilmentWindowsGroupBindingImpl.A = -1L;
                    fragmentFulfilmentWindowsGroupBindingImpl.y.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, fragmentFulfilmentWindowsGroupBindingImpl);
                    fragmentFulfilmentWindowsGroupBindingImpl.r();
                    return fragmentFulfilmentWindowsGroupBindingImpl;
                case 29:
                    if (!"layout/include_checkout_app_bar_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for include_checkout_app_bar is invalid. Received: "));
                    }
                    Object[] objArrT10 = ViewDataBinding.t(dataBindingComponent, view, 3, null, IncludeCheckoutAppBarBindingImpl.C);
                    IncludeCheckoutAppBarBindingImpl includeCheckoutAppBarBindingImpl = new IncludeCheckoutAppBarBindingImpl(dataBindingComponent, view, (AppBarLayout) objArrT10[0], (ComposeView) objArrT10[2], (Toolbar) objArrT10[1]);
                    includeCheckoutAppBarBindingImpl.B = -1L;
                    includeCheckoutAppBarBindingImpl.y.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, includeCheckoutAppBarBindingImpl);
                    includeCheckoutAppBarBindingImpl.r();
                    return includeCheckoutAppBarBindingImpl;
                case 30:
                    if ("layout/include_checkout_delivery_now_0".equals(tag)) {
                        return new IncludeCheckoutDeliveryNowBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for include_checkout_delivery_now is invalid. Received: "));
                case 31:
                    if ("layout/include_checkout_direct_to_boot_now_0".equals(tag)) {
                        return new IncludeCheckoutDirectToBootNowBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for include_checkout_direct_to_boot_now is invalid. Received: "));
                case 32:
                    if ("layout/include_checkout_order_total_details_0".equals(tag)) {
                        return new IncludeCheckoutOrderTotalDetailsBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for include_checkout_order_total_details is invalid. Received: "));
                case 33:
                    if (!"layout/include_extra_info_button_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for include_extra_info_button is invalid. Received: "));
                    }
                    Object[] objArrT11 = ViewDataBinding.t(dataBindingComponent, view, 3, null, IncludeExtraInfoButtonBindingImpl.B);
                    IncludeExtraInfoButtonBindingImpl includeExtraInfoButtonBindingImpl = new IncludeExtraInfoButtonBindingImpl(view, (View) objArrT11[2], (TextView) objArrT11[1], dataBindingComponent);
                    includeExtraInfoButtonBindingImpl.A = -1L;
                    ((ConstraintLayout) objArrT11[0]).setTag(null);
                    includeExtraInfoButtonBindingImpl.E(view);
                    includeExtraInfoButtonBindingImpl.r();
                    return includeExtraInfoButtonBindingImpl;
                case 34:
                    if ("layout/item_checkout_fulfillment_windows_0".equals(tag)) {
                        return new ItemCheckoutFulfilmentWindowsBindingImpl(dataBindingComponent, new View[]{view});
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for item_checkout_fulfillment_windows is invalid. Received: "));
            }
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        int i2;
        if (viewArr.length == 0 || (i2 = f10538a.get(i)) <= 0) {
            return null;
        }
        Object tag = viewArr[0].getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i2 != 34) {
            return null;
        }
        if ("layout/item_checkout_fulfillment_windows_0".equals(tag)) {
            return new ItemCheckoutFulfilmentWindowsBindingImpl(dataBindingComponent, viewArr);
        }
        throw new IllegalArgumentException(b.m(tag, "The tag for item_checkout_fulfillment_windows is invalid. Received: "));
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f10539a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
