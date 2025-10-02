package au.com.woolworths.shop.deliveryunlimited.signup;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.impl.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeHorizontalDividerBinding;
import au.com.woolworths.android.onesite.models.notification.NotificationResult;
import au.com.woolworths.base.shopapp.databinding.EpoxyItemButtonBinding;
import au.com.woolworths.shop.deliveryunlimited.signup.databinding.ActivityDeliveryUnlimitedConfirmSubscriptionBindingImpl;
import au.com.woolworths.shop.deliveryunlimited.signup.databinding.ActivityDeliveryUnlimitedSelectPlanBindingImpl;
import au.com.woolworths.shop.deliveryunlimited.signup.databinding.ActivityDeliveryUnlimitedSignUpSubscriptionConfirmationBindingImpl;
import au.com.woolworths.shop.deliveryunlimited.signup.databinding.ActivityDeliveryUnlimitedSignupLandingBindingImpl;
import au.com.woolworths.shop.deliveryunlimited.signup.databinding.EpoxyItemDeliveryUnlimitedDividerBindingImpl;
import au.com.woolworths.shop.deliveryunlimited.signup.databinding.EpoxyItemDeliveryUnlimitedPlanBindingImpl;
import au.com.woolworths.shop.deliveryunlimited.signup.databinding.EpoxyItemDeliveryUnlimitedPlanFeatureBindingImpl;
import au.com.woolworths.shop.deliveryunlimited.signup.databinding.EpoxyItemDeliveryUnlimitedPlanTypeTabLayoutBindingImpl;
import au.com.woolworths.shop.deliveryunlimited.signup.databinding.EpoxyItemDeliveryUnlimitedSignUpConfirmationHeadingBindingImpl;
import au.com.woolworths.shop.deliveryunlimited.signup.databinding.EpoxyItemDeliveryUnlimitedSignUpConfirmationLineItemBindingImpl;
import au.com.woolworths.shop.deliveryunlimited.signup.databinding.EpoxyItemDeliveryUnlimitedSignUpInsetBannerBindingImpl;
import au.com.woolworths.shop.deliveryunlimited.signup.databinding.EpoxyItemDeliveryUnlimitedSignUpLandingDisclaimerBindingImpl;
import au.com.woolworths.shop.deliveryunlimited.signup.databinding.EpoxyItemDeliveryUnlimitedSignUpLandingFeatureBindingImpl;
import au.com.woolworths.shop.deliveryunlimited.signup.databinding.EpoxyItemDeliveryUnlimitedSignUpTermsAndConditionsBindingImpl;
import au.com.woolworths.shop.deliveryunlimited.signup.databinding.EpoxyItemDeliveryUnlimitedSignUpTermsAndConditionsOldBindingImpl;
import au.com.woolworths.shop.deliveryunlimited.signup.databinding.EpoxyItemDeliveryUnlimitedSignUpTermsAndConditionsTitleBindingImpl;
import au.com.woolworths.shop.deliveryunlimited.signup.databinding.EpoxyItemDeliveryUnlimitedSpacerWrapperBindingImpl;
import au.com.woolworths.shop.deliveryunlimited.signup.databinding.FragmentAcceptTermsAndConditionBottomSheetOldBindingImpl;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes4.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f10847a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = a.b(144, 0, 1, "_all", "actionState");
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
            sparseArrayB.put(14, "button");
            sparseArrayB.put(15, "buttonText");
            sparseArrayB.put(16, "buttonTint");
            sparseArrayB.put(17, "buttonTitle");
            sparseArrayB.put(18, NotificationResult.Notification.CAMPAIGN);
            sparseArrayB.put(19, "canShowWatchlist");
            sparseArrayB.put(20, "cardCaptureHandler");
            sparseArrayB.put(21, "cents");
            sparseArrayB.put(22, "clickHandler");
            sparseArrayB.put(23, "clickHandlers");
            sparseArrayB.put(24, "clickListener");
            sparseArrayB.put(25, "coachMark");
            sparseArrayB.put(26, "collectionMethodOption");
            sparseArrayB.put(27, "condition");
            sparseArrayB.put(28, "containerTitle");
            sparseArrayB.put(29, "cta");
            sparseArrayB.put(30, "ctaText");
            sparseArrayB.put(31, "data");
            sparseArrayB.put(32, "deliveryNowWindow");
            sparseArrayB.put(33, "descriptionText");
            sparseArrayB.put(34, "directToBootNowWindow");
            sparseArrayB.put(35, "discountItem");
            sparseArrayB.put(36, "dispatchNote");
            sparseArrayB.put(37, "displayExpiryExtended");
            sparseArrayB.put(38, "dollars");
            sparseArrayB.put(39, "emptyState");
            sparseArrayB.put(40, "enableBoostAnimationContainerGap");
            sparseArrayB.put(41, "enabled");
            sparseArrayB.put(42, "errorState");
            sparseArrayB.put(43, "eventHandler");
            sparseArrayB.put(44, "filter");
            sparseArrayB.put(45, "footer");
            sparseArrayB.put(46, "fulfilmentWindow");
            sparseArrayB.put(47, "fulfilmentWindows");
            sparseArrayB.put(48, "fulfilmentWindowsOption");
            sparseArrayB.put(49, "fulfilmentWindowsSlot");
            sparseArrayB.put(50, "groupTitle");
            sparseArrayB.put(51, "handler");
            sparseArrayB.put(52, "header");
            sparseArrayB.put(53, "heightRes");
            sparseArrayB.put(54, "hostScreen");
            sparseArrayB.put(55, "htmlListener");
            sparseArrayB.put(56, "iconResId");
            sparseArrayB.put(57, "imageLoaderListener");
            sparseArrayB.put(58, "importantForAccessibility");
            sparseArrayB.put(59, "index");
            sparseArrayB.put(60, "info");
            sparseArrayB.put(61, "infoSectionItem");
            sparseArrayB.put(62, "inlineMessage");
            sparseArrayB.put(63, "insetBanner");
            sparseArrayB.put(64, "isAccountNotificationBadgeShown");
            sparseArrayB.put(65, "isButtonEnabled");
            sparseArrayB.put(66, "isChecked");
            sparseArrayB.put(67, "isComposeContentViewEnabled");
            sparseArrayB.put(68, "isCtaInProgress");
            sparseArrayB.put(69, "isEnabled");
            sparseArrayB.put(70, "isLoading");
            sparseArrayB.put(71, "isLowerPriceYellow");
            sparseArrayB.put(72, "isMarketplace");
            sparseArrayB.put(73, "isPopup");
            sparseArrayB.put(74, "isRewardStyle");
            sparseArrayB.put(75, "isSelected");
            sparseArrayB.put(76, "isUnlocking");
            sparseArrayB.put(77, "isWatchlisted");
            sparseArrayB.put(78, "item");
            sparseArrayB.put(79, "itemWidthRes");
            sparseArrayB.put(80, AnnotatedPrivateKey.LABEL);
            sparseArrayB.put(81, "labelStyle");
            sparseArrayB.put(82, "lightTheme");
            sparseArrayB.put(83, "linkHandler");
            sparseArrayB.put(84, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            sparseArrayB.put(85, "loadingMessage");
            sparseArrayB.put(86, "lottieAutoPlay");
            sparseArrayB.put(87, "lottieBackgroundColor");
            sparseArrayB.put(88, "lottieLoop");
            sparseArrayB.put(89, "margins");
            sparseArrayB.put(90, "markdownContent");
            sparseArrayB.put(91, "marketSellerGroup");
            sparseArrayB.put(92, "memberPriceInfo");
            sparseArrayB.put(93, "message");
            sparseArrayB.put(94, "offerViewItem");
            sparseArrayB.put(95, "onBannerClick");
            sparseArrayB.put(96, "onClick");
            sparseArrayB.put(97, "onPointsBalanceClick");
            sparseArrayB.put(98, "onQueryTextChangeListener");
            sparseArrayB.put(99, "onQueryTextFocusChangeListener");
            sparseArrayB.put(100, "onQueryTextSubmitListener");
            sparseArrayB.put(101, "optionText");
            sparseArrayB.put(102, "orderTotalDetails");
            sparseArrayB.put(103, "packagingMethodOption");
            sparseArrayB.put(104, "paddingBottom");
            sparseArrayB.put(105, "pageData");
            sparseArrayB.put(106, "paymentInfo");
            sparseArrayB.put(107, "product");
            sparseArrayB.put(108, "productCard");
            sparseArrayB.put(109, "productCardConfig");
            sparseArrayB.put(110, "productConfig");
            sparseArrayB.put(111, "productData");
            sparseArrayB.put(112, "rewardsPointsBalance");
            sparseArrayB.put(113, "rewardsPointsBalanceData");
            sparseArrayB.put(114, "rewardsRegistered");
            sparseArrayB.put(115, "rewardsRegisteredRedeemable");
            sparseArrayB.put(116, "rewardsUnregistered");
            sparseArrayB.put(117, "searchQueryHint");
            sparseArrayB.put(118, "section");
            sparseArrayB.put(119, "sectionHeader");
            sparseArrayB.put(120, "sectionTitle");
            sparseArrayB.put(121, "seller");
            sparseArrayB.put(122, "sellerName");
            sparseArrayB.put(123, "shouldHideToolbar");
            sparseArrayB.put(124, "shouldShowLoadingState");
            sparseArrayB.put(125, "shouldShowNewBadge");
            sparseArrayB.put(126, "shouldShowNotificationDot");
            sparseArrayB.put(127, "shouldShowWebArrow");
            sparseArrayB.put(128, "showAddToListButton");
            sparseArrayB.put(129, "showBoostAnimation");
            sparseArrayB.put(130, "showLoadingView");
            sparseArrayB.put(131, "showNewDismissIcon");
            sparseArrayB.put(132, "showTigerDisplayExpiry");
            sparseArrayB.put(133, "showTigerOffersLabel");
            sparseArrayB.put(134, "singleLine");
            sparseArrayB.put(135, "state");
            sparseArrayB.put(136, "terms");
            sparseArrayB.put(137, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(138, "title");
            sparseArrayB.put(139, "viewListener");
            sparseArrayB.put(140, "viewModel");
            sparseArrayB.put(141, "viewState");
            sparseArrayB.put(142, "vocViewModel");
            sparseArrayB.put(143, "windowSubheader");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f10848a;

        static {
            HashMap map = new HashMap(18);
            f10848a = map;
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_delivery_unlimited_confirm_subscription, map, "layout/activity_delivery_unlimited_confirm_subscription_0", com.woolworths.R.layout.activity_delivery_unlimited_select_plan, "layout/activity_delivery_unlimited_select_plan_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_delivery_unlimited_sign_up_subscription_confirmation, map, "layout/activity_delivery_unlimited_sign_up_subscription_confirmation_0", com.woolworths.R.layout.activity_delivery_unlimited_signup_landing, "layout/activity_delivery_unlimited_signup_landing_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_delivery_unlimited_divider, map, "layout/epoxy_item_delivery_unlimited_divider_0", com.woolworths.R.layout.epoxy_item_delivery_unlimited_plan, "layout/epoxy_item_delivery_unlimited_plan_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_delivery_unlimited_plan_feature, map, "layout/epoxy_item_delivery_unlimited_plan_feature_0", com.woolworths.R.layout.epoxy_item_delivery_unlimited_plan_type_tab_layout, "layout/epoxy_item_delivery_unlimited_plan_type_tab_layout_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_delivery_unlimited_sign_up_confirmation_heading, map, "layout/epoxy_item_delivery_unlimited_sign_up_confirmation_heading_0", com.woolworths.R.layout.epoxy_item_delivery_unlimited_sign_up_confirmation_line_item, "layout/epoxy_item_delivery_unlimited_sign_up_confirmation_line_item_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_delivery_unlimited_sign_up_inset_banner, map, "layout/epoxy_item_delivery_unlimited_sign_up_inset_banner_0", com.woolworths.R.layout.epoxy_item_delivery_unlimited_sign_up_landing_disclaimer, "layout/epoxy_item_delivery_unlimited_sign_up_landing_disclaimer_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_delivery_unlimited_sign_up_landing_feature, map, "layout/epoxy_item_delivery_unlimited_sign_up_landing_feature_0", com.woolworths.R.layout.epoxy_item_delivery_unlimited_sign_up_terms_and_conditions, "layout/epoxy_item_delivery_unlimited_sign_up_terms_and_conditions_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_delivery_unlimited_sign_up_terms_and_conditions_old, map, "layout/epoxy_item_delivery_unlimited_sign_up_terms_and_conditions_old_0", com.woolworths.R.layout.epoxy_item_delivery_unlimited_sign_up_terms_and_conditions_title, "layout/epoxy_item_delivery_unlimited_sign_up_terms_and_conditions_title_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_delivery_unlimited_spacer_wrapper, map, "layout/epoxy_item_delivery_unlimited_spacer_wrapper_0", com.woolworths.R.layout.fragment_accept_terms_and_condition_bottom_sheet_old, "layout/fragment_accept_terms_and_condition_bottom_sheet_old_0");
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(18);
        f10847a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.activity_delivery_unlimited_confirm_subscription, 1);
        sparseIntArray.put(com.woolworths.R.layout.activity_delivery_unlimited_select_plan, 2);
        sparseIntArray.put(com.woolworths.R.layout.activity_delivery_unlimited_sign_up_subscription_confirmation, 3);
        sparseIntArray.put(com.woolworths.R.layout.activity_delivery_unlimited_signup_landing, 4);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_delivery_unlimited_divider, 5);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_delivery_unlimited_plan, 6);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_delivery_unlimited_plan_feature, 7);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_delivery_unlimited_plan_type_tab_layout, 8);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_delivery_unlimited_sign_up_confirmation_heading, 9);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_delivery_unlimited_sign_up_confirmation_line_item, 10);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_delivery_unlimited_sign_up_inset_banner, 11);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_delivery_unlimited_sign_up_landing_disclaimer, 12);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_delivery_unlimited_sign_up_landing_feature, 13);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_delivery_unlimited_sign_up_terms_and_conditions, 14);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_delivery_unlimited_sign_up_terms_and_conditions_old, 15);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_delivery_unlimited_sign_up_terms_and_conditions_title, 16);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_delivery_unlimited_spacer_wrapper, 17);
        sparseIntArray.put(com.woolworths.R.layout.fragment_accept_terms_and_condition_bottom_sheet_old, 18);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(9);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.base.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.legacy.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.base.shopapp.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.rewards.offers.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.product.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shared.ui.views.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shop.digipay.DataBinderMapperImpl());
        arrayList.add(new com.airbnb.epoxy.databinding.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f10847a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            switch (i2) {
                case 1:
                    if ("layout/activity_delivery_unlimited_confirm_subscription_0".equals(tag)) {
                        return new ActivityDeliveryUnlimitedConfirmSubscriptionBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for activity_delivery_unlimited_confirm_subscription is invalid. Received: "));
                case 2:
                    if (!"layout/activity_delivery_unlimited_select_plan_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for activity_delivery_unlimited_select_plan is invalid. Received: "));
                    }
                    Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 8, ActivityDeliveryUnlimitedSelectPlanBindingImpl.I, ActivityDeliveryUnlimitedSelectPlanBindingImpl.J);
                    ActivityDeliveryUnlimitedSelectPlanBindingImpl activityDeliveryUnlimitedSelectPlanBindingImpl = new ActivityDeliveryUnlimitedSelectPlanBindingImpl(dataBindingComponent, view, (EpoxyRecyclerView) objArrT[7], (TextView) objArrT[3], (ConstraintLayout) objArrT[2], (View) objArrT[1], (Toolbar) objArrT[6], (EpoxyItemButtonBinding) objArrT[4]);
                    activityDeliveryUnlimitedSelectPlanBindingImpl.H = -1L;
                    activityDeliveryUnlimitedSelectPlanBindingImpl.z.setTag(null);
                    activityDeliveryUnlimitedSelectPlanBindingImpl.A.setTag(null);
                    ((ConstraintLayout) objArrT[0]).setTag(null);
                    activityDeliveryUnlimitedSelectPlanBindingImpl.B.setTag(null);
                    EpoxyItemButtonBinding epoxyItemButtonBinding = activityDeliveryUnlimitedSelectPlanBindingImpl.D;
                    if (epoxyItemButtonBinding != null) {
                        epoxyItemButtonBinding.n = activityDeliveryUnlimitedSelectPlanBindingImpl;
                    }
                    activityDeliveryUnlimitedSelectPlanBindingImpl.E(view);
                    activityDeliveryUnlimitedSelectPlanBindingImpl.r();
                    return activityDeliveryUnlimitedSelectPlanBindingImpl;
                case 3:
                    if ("layout/activity_delivery_unlimited_sign_up_subscription_confirmation_0".equals(tag)) {
                        return new ActivityDeliveryUnlimitedSignUpSubscriptionConfirmationBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for activity_delivery_unlimited_sign_up_subscription_confirmation is invalid. Received: "));
                case 4:
                    if ("layout/activity_delivery_unlimited_signup_landing_0".equals(tag)) {
                        return new ActivityDeliveryUnlimitedSignupLandingBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for activity_delivery_unlimited_signup_landing is invalid. Received: "));
                case 5:
                    if ("layout/epoxy_item_delivery_unlimited_divider_0".equals(tag)) {
                        return new EpoxyItemDeliveryUnlimitedDividerBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_delivery_unlimited_divider is invalid. Received: "));
                case 6:
                    if ("layout/epoxy_item_delivery_unlimited_plan_0".equals(tag)) {
                        return new EpoxyItemDeliveryUnlimitedPlanBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_delivery_unlimited_plan is invalid. Received: "));
                case 7:
                    if ("layout/epoxy_item_delivery_unlimited_plan_feature_0".equals(tag)) {
                        return new EpoxyItemDeliveryUnlimitedPlanFeatureBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_delivery_unlimited_plan_feature is invalid. Received: "));
                case 8:
                    if (!"layout/epoxy_item_delivery_unlimited_plan_type_tab_layout_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_delivery_unlimited_plan_type_tab_layout is invalid. Received: "));
                    }
                    Object[] objArrT2 = ViewDataBinding.t(dataBindingComponent, view, 3, EpoxyItemDeliveryUnlimitedPlanTypeTabLayoutBindingImpl.B, EpoxyItemDeliveryUnlimitedPlanTypeTabLayoutBindingImpl.C);
                    EpoxyItemDeliveryUnlimitedPlanTypeTabLayoutBindingImpl epoxyItemDeliveryUnlimitedPlanTypeTabLayoutBindingImpl = new EpoxyItemDeliveryUnlimitedPlanTypeTabLayoutBindingImpl(dataBindingComponent, view, (IncludeHorizontalDividerBinding) objArrT2[1], (TabLayout) objArrT2[2]);
                    epoxyItemDeliveryUnlimitedPlanTypeTabLayoutBindingImpl.A = -1L;
                    IncludeHorizontalDividerBinding includeHorizontalDividerBinding = epoxyItemDeliveryUnlimitedPlanTypeTabLayoutBindingImpl.y;
                    if (includeHorizontalDividerBinding != null) {
                        includeHorizontalDividerBinding.n = epoxyItemDeliveryUnlimitedPlanTypeTabLayoutBindingImpl;
                    }
                    ((ConstraintLayout) objArrT2[0]).setTag(null);
                    epoxyItemDeliveryUnlimitedPlanTypeTabLayoutBindingImpl.E(view);
                    epoxyItemDeliveryUnlimitedPlanTypeTabLayoutBindingImpl.r();
                    return epoxyItemDeliveryUnlimitedPlanTypeTabLayoutBindingImpl;
                case 9:
                    if (!"layout/epoxy_item_delivery_unlimited_sign_up_confirmation_heading_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_delivery_unlimited_sign_up_confirmation_heading is invalid. Received: "));
                    }
                    Object[] objArrT3 = ViewDataBinding.t(dataBindingComponent, view, 4, null, EpoxyItemDeliveryUnlimitedSignUpConfirmationHeadingBindingImpl.z);
                    EpoxyItemDeliveryUnlimitedSignUpConfirmationHeadingBindingImpl epoxyItemDeliveryUnlimitedSignUpConfirmationHeadingBindingImpl = new EpoxyItemDeliveryUnlimitedSignUpConfirmationHeadingBindingImpl(dataBindingComponent, view, 0);
                    epoxyItemDeliveryUnlimitedSignUpConfirmationHeadingBindingImpl.y = -1L;
                    ((ConstraintLayout) objArrT3[0]).setTag(null);
                    epoxyItemDeliveryUnlimitedSignUpConfirmationHeadingBindingImpl.E(view);
                    epoxyItemDeliveryUnlimitedSignUpConfirmationHeadingBindingImpl.r();
                    return epoxyItemDeliveryUnlimitedSignUpConfirmationHeadingBindingImpl;
                case 10:
                    if (!"layout/epoxy_item_delivery_unlimited_sign_up_confirmation_line_item_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_delivery_unlimited_sign_up_confirmation_line_item is invalid. Received: "));
                    }
                    Object[] objArrT4 = ViewDataBinding.t(dataBindingComponent, view, 4, null, null);
                    EpoxyItemDeliveryUnlimitedSignUpConfirmationLineItemBindingImpl epoxyItemDeliveryUnlimitedSignUpConfirmationLineItemBindingImpl = new EpoxyItemDeliveryUnlimitedSignUpConfirmationLineItemBindingImpl(view, (ImageView) objArrT4[3], (TextView) objArrT4[2], (TextView) objArrT4[1], dataBindingComponent);
                    epoxyItemDeliveryUnlimitedSignUpConfirmationLineItemBindingImpl.C = -1L;
                    epoxyItemDeliveryUnlimitedSignUpConfirmationLineItemBindingImpl.y.setTag(null);
                    epoxyItemDeliveryUnlimitedSignUpConfirmationLineItemBindingImpl.z.setTag(null);
                    ((ConstraintLayout) objArrT4[0]).setTag(null);
                    epoxyItemDeliveryUnlimitedSignUpConfirmationLineItemBindingImpl.A.setTag(null);
                    epoxyItemDeliveryUnlimitedSignUpConfirmationLineItemBindingImpl.E(view);
                    epoxyItemDeliveryUnlimitedSignUpConfirmationLineItemBindingImpl.r();
                    return epoxyItemDeliveryUnlimitedSignUpConfirmationLineItemBindingImpl;
                case 11:
                    if ("layout/epoxy_item_delivery_unlimited_sign_up_inset_banner_0".equals(tag)) {
                        return new EpoxyItemDeliveryUnlimitedSignUpInsetBannerBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_delivery_unlimited_sign_up_inset_banner is invalid. Received: "));
                case 12:
                    if (!"layout/epoxy_item_delivery_unlimited_sign_up_landing_disclaimer_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_delivery_unlimited_sign_up_landing_disclaimer is invalid. Received: "));
                    }
                    Object[] objArrT5 = ViewDataBinding.t(dataBindingComponent, view, 3, null, null);
                    EpoxyItemDeliveryUnlimitedSignUpLandingDisclaimerBindingImpl epoxyItemDeliveryUnlimitedSignUpLandingDisclaimerBindingImpl = new EpoxyItemDeliveryUnlimitedSignUpLandingDisclaimerBindingImpl(dataBindingComponent, view, (TextView) objArrT5[2], (TextView) objArrT5[1]);
                    epoxyItemDeliveryUnlimitedSignUpLandingDisclaimerBindingImpl.B = -1L;
                    epoxyItemDeliveryUnlimitedSignUpLandingDisclaimerBindingImpl.y.setTag(null);
                    ((LinearLayout) objArrT5[0]).setTag(null);
                    epoxyItemDeliveryUnlimitedSignUpLandingDisclaimerBindingImpl.z.setTag(null);
                    epoxyItemDeliveryUnlimitedSignUpLandingDisclaimerBindingImpl.E(view);
                    epoxyItemDeliveryUnlimitedSignUpLandingDisclaimerBindingImpl.r();
                    return epoxyItemDeliveryUnlimitedSignUpLandingDisclaimerBindingImpl;
                case 13:
                    if ("layout/epoxy_item_delivery_unlimited_sign_up_landing_feature_0".equals(tag)) {
                        return new EpoxyItemDeliveryUnlimitedSignUpLandingFeatureBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_delivery_unlimited_sign_up_landing_feature is invalid. Received: "));
                case 14:
                    if ("layout/epoxy_item_delivery_unlimited_sign_up_terms_and_conditions_0".equals(tag)) {
                        return new EpoxyItemDeliveryUnlimitedSignUpTermsAndConditionsBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_delivery_unlimited_sign_up_terms_and_conditions is invalid. Received: "));
                case 15:
                    if ("layout/epoxy_item_delivery_unlimited_sign_up_terms_and_conditions_old_0".equals(tag)) {
                        return new EpoxyItemDeliveryUnlimitedSignUpTermsAndConditionsOldBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_delivery_unlimited_sign_up_terms_and_conditions_old is invalid. Received: "));
                case 16:
                    if (!"layout/epoxy_item_delivery_unlimited_sign_up_terms_and_conditions_title_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_delivery_unlimited_sign_up_terms_and_conditions_title is invalid. Received: "));
                    }
                    EpoxyItemDeliveryUnlimitedSignUpTermsAndConditionsTitleBindingImpl epoxyItemDeliveryUnlimitedSignUpTermsAndConditionsTitleBindingImpl = new EpoxyItemDeliveryUnlimitedSignUpTermsAndConditionsTitleBindingImpl(dataBindingComponent, view, (TextView) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
                    epoxyItemDeliveryUnlimitedSignUpTermsAndConditionsTitleBindingImpl.A = -1L;
                    epoxyItemDeliveryUnlimitedSignUpTermsAndConditionsTitleBindingImpl.y.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, epoxyItemDeliveryUnlimitedSignUpTermsAndConditionsTitleBindingImpl);
                    epoxyItemDeliveryUnlimitedSignUpTermsAndConditionsTitleBindingImpl.r();
                    return epoxyItemDeliveryUnlimitedSignUpTermsAndConditionsTitleBindingImpl;
                case 17:
                    if ("layout/epoxy_item_delivery_unlimited_spacer_wrapper_0".equals(tag)) {
                        return new EpoxyItemDeliveryUnlimitedSpacerWrapperBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_delivery_unlimited_spacer_wrapper is invalid. Received: "));
                case 18:
                    if (!"layout/fragment_accept_terms_and_condition_bottom_sheet_old_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for fragment_accept_terms_and_condition_bottom_sheet_old is invalid. Received: "));
                    }
                    Object[] objArrT6 = ViewDataBinding.t(dataBindingComponent, view, 3, null, FragmentAcceptTermsAndConditionBottomSheetOldBindingImpl.A);
                    FragmentAcceptTermsAndConditionBottomSheetOldBindingImpl fragmentAcceptTermsAndConditionBottomSheetOldBindingImpl = new FragmentAcceptTermsAndConditionBottomSheetOldBindingImpl(dataBindingComponent, view, (EpoxyRecyclerView) objArrT6[2]);
                    fragmentAcceptTermsAndConditionBottomSheetOldBindingImpl.z = -1L;
                    ((ConstraintLayout) objArrT6[0]).setTag(null);
                    fragmentAcceptTermsAndConditionBottomSheetOldBindingImpl.E(view);
                    fragmentAcceptTermsAndConditionBottomSheetOldBindingImpl.r();
                    return fragmentAcceptTermsAndConditionBottomSheetOldBindingImpl;
            }
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f10847a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f10848a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
