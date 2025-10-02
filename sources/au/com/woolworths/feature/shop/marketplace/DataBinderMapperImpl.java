package au.com.woolworths.feature.shop.marketplace;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.impl.b;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.models.notification.NotificationResult;
import au.com.woolworths.feature.shop.marketplace.databinding.ActivityMarketplaceBindingImpl;
import au.com.woolworths.feature.shop.marketplace.databinding.EpoxyItemMarketplaceErrorBindingImpl;
import au.com.woolworths.feature.shop.marketplace.databinding.FragmentMarketplaceBindingImpl;
import au.com.woolworths.feature.shop.marketplace.databinding.FragmentMarketplaceContentBindingImpl;
import au.com.woolworths.feature.shop.marketplace.databinding.FragmentMarketplaceFacetBindingImpl;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f7465a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = a.b(BERTags.PRIVATE, 0, 1, "_all", "actionState");
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
            sparseArrayB.put(51, "errorListener");
            sparseArrayB.put(52, "errorState");
            sparseArrayB.put(53, "eventHandler");
            sparseArrayB.put(54, "filter");
            sparseArrayB.put(55, "filterMenuItem");
            sparseArrayB.put(56, "filterOption");
            sparseArrayB.put(57, "filterOptionClickListener");
            sparseArrayB.put(58, "footer");
            sparseArrayB.put(59, "fulfilmentWindow");
            sparseArrayB.put(60, "fulfilmentWindows");
            sparseArrayB.put(61, "fulfilmentWindowsOption");
            sparseArrayB.put(62, "fulfilmentWindowsSlot");
            sparseArrayB.put(63, "groupTitle");
            sparseArrayB.put(64, "handler");
            sparseArrayB.put(65, "hasHorizontalPadding");
            sparseArrayB.put(66, "header");
            sparseArrayB.put(67, "heightRes");
            sparseArrayB.put(68, "hostScreen");
            sparseArrayB.put(69, "hostViewListener");
            sparseArrayB.put(70, "htmlListener");
            sparseArrayB.put(71, "iconResId");
            sparseArrayB.put(72, "imageItem");
            sparseArrayB.put(73, "imageLoadListener");
            sparseArrayB.put(74, "imageLoaderListener");
            sparseArrayB.put(75, "importantForAccessibility");
            sparseArrayB.put(76, "inMappedStore");
            sparseArrayB.put(77, "index");
            sparseArrayB.put(78, "info");
            sparseArrayB.put(79, "infoSectionItem");
            sparseArrayB.put(80, "infoView");
            sparseArrayB.put(81, "inlineMessage");
            sparseArrayB.put(82, "insetBanner");
            sparseArrayB.put(83, "isAccountNotificationBadgeShown");
            sparseArrayB.put(84, "isButtonEnabled");
            sparseArrayB.put(85, "isChecked");
            sparseArrayB.put(86, "isComposeContentViewEnabled");
            sparseArrayB.put(87, "isCtaInProgress");
            sparseArrayB.put(88, "isEdited");
            sparseArrayB.put(89, "isEnabled");
            sparseArrayB.put(90, "isInSnGSession");
            sparseArrayB.put(91, "isLoading");
            sparseArrayB.put(92, "isLowerPriceYellow");
            sparseArrayB.put(93, "isMarketplace");
            sparseArrayB.put(94, "isPopup");
            sparseArrayB.put(95, "isRewardStyle");
            sparseArrayB.put(96, "isSearchBarHintVisible");
            sparseArrayB.put(97, "isSearchBarVisible");
            sparseArrayB.put(98, "isSelected");
            sparseArrayB.put(99, "isShoppingListBeingSaved");
            sparseArrayB.put(100, "isToggleInProgress");
            sparseArrayB.put(101, "isUnlocking");
            sparseArrayB.put(102, "isWatchlist");
            sparseArrayB.put(103, "isWatchlisted");
            sparseArrayB.put(104, "item");
            sparseArrayB.put(105, "itemClickListener");
            sparseArrayB.put(106, "itemState");
            sparseArrayB.put(107, "itemWidthRes");
            sparseArrayB.put(108, AnnotatedPrivateKey.LABEL);
            sparseArrayB.put(109, "labelStyle");
            sparseArrayB.put(110, "lightTheme");
            sparseArrayB.put(111, "linkHandler");
            sparseArrayB.put(112, "listId");
            sparseArrayB.put(113, "listIndex");
            sparseArrayB.put(114, "listViewModel");
            sparseArrayB.put(115, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            sparseArrayB.put(116, "loadingMessage");
            sparseArrayB.put(117, "lottieAutoPlay");
            sparseArrayB.put(118, "lottieBackgroundColor");
            sparseArrayB.put(119, "lottieLoop");
            sparseArrayB.put(120, "margins");
            sparseArrayB.put(121, "markdownContent");
            sparseArrayB.put(122, "marketSellerGroup");
            sparseArrayB.put(123, "marketplace");
            sparseArrayB.put(124, "memberPriceInfo");
            sparseArrayB.put(125, "message");
            sparseArrayB.put(126, "mode");
            sparseArrayB.put(127, "offerViewItem");
            sparseArrayB.put(128, "onBannerClick");
            sparseArrayB.put(129, "onClick");
            sparseArrayB.put(130, "onMaxLinesToggleListener");
            sparseArrayB.put(131, "onPointsBalanceClick");
            sparseArrayB.put(132, "onQueryTextChangeListener");
            sparseArrayB.put(133, "onQueryTextFocusChangeListener");
            sparseArrayB.put(134, "onQueryTextSubmitListener");
            sparseArrayB.put(135, "onSelected");
            sparseArrayB.put(136, "optionText");
            sparseArrayB.put(137, "orderTotalDetails");
            sparseArrayB.put(138, "packagingMethodOption");
            sparseArrayB.put(139, "paddingBottom");
            sparseArrayB.put(140, "pageItem");
            sparseArrayB.put(141, "postcode");
            sparseArrayB.put(142, "previewContent");
            sparseArrayB.put(143, "primaryButtonClickListener");
            sparseArrayB.put(144, "product");
            sparseArrayB.put(145, "productCard");
            sparseArrayB.put(146, "productCardButtonsState");
            sparseArrayB.put(147, "productCardConfig");
            sparseArrayB.put(148, "productConfig");
            sparseArrayB.put(149, "productData");
            sparseArrayB.put(150, "quantity");
            sparseArrayB.put(151, "queryHintRes");
            sparseArrayB.put(152, "queryTextFocusChangeListener");
            sparseArrayB.put(153, "rewardsPointsBalance");
            sparseArrayB.put(154, "rewardsPointsBalanceData");
            sparseArrayB.put(ModuleDescriptor.MODULE_VERSION, "rewardsRegistered");
            sparseArrayB.put(156, "rewardsRegisteredRedeemable");
            sparseArrayB.put(157, "rewardsUnregistered");
            sparseArrayB.put(158, "searchQueryHint");
            sparseArrayB.put(159, "section");
            sparseArrayB.put(160, "sectionHeader");
            sparseArrayB.put(161, "sectionTitle");
            sparseArrayB.put(162, "seller");
            sparseArrayB.put(163, "sellerName");
            sparseArrayB.put(164, "shoppingList");
            sparseArrayB.put(165, "shouldHideToolbar");
            sparseArrayB.put(166, "shouldShowLoadingState");
            sparseArrayB.put(167, "shouldShowNewBadge");
            sparseArrayB.put(168, "shouldShowNotificationDot");
            sparseArrayB.put(169, "shouldShowWebArrow");
            sparseArrayB.put(170, "showAddToListButton");
            sparseArrayB.put(171, "showBoostAnimation");
            sparseArrayB.put(172, "showCheckedItems");
            sparseArrayB.put(173, "showDisabledState");
            sparseArrayB.put(174, "showLoadingView");
            sparseArrayB.put(175, "showNewDismissIcon");
            sparseArrayB.put(176, "showTigerDisplayExpiry");
            sparseArrayB.put(177, "showTigerOffersLabel");
            sparseArrayB.put(178, "singleLine");
            sparseArrayB.put(179, "sortByViewListener");
            sparseArrayB.put(SubsamplingScaleImageView.ORIENTATION_180, "sortOption");
            sparseArrayB.put(181, "sortOptionClickListener");
            sparseArrayB.put(182, "state");
            sparseArrayB.put(183, "store");
            sparseArrayB.put(184, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(185, "title");
            sparseArrayB.put(186, "topMarginRes");
            sparseArrayB.put(187, "viewListener");
            sparseArrayB.put(188, "viewModel");
            sparseArrayB.put(189, "viewState");
            sparseArrayB.put(190, "vocViewModel");
            sparseArrayB.put(191, "windowSubheader");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f7466a;

        static {
            HashMap map = new HashMap(5);
            f7466a = map;
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_marketplace, map, "layout/activity_marketplace_0", com.woolworths.R.layout.epoxy_item_marketplace_error, "layout/epoxy_item_marketplace_error_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.fragment_marketplace, map, "layout/fragment_marketplace_0", com.woolworths.R.layout.fragment_marketplace_content, "layout/fragment_marketplace_content_0");
            map.put("layout/fragment_marketplace_facet_0", Integer.valueOf(com.woolworths.R.layout.fragment_marketplace_facet));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(5);
        f7465a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.activity_marketplace, 1);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_marketplace_error, 2);
        sparseIntArray.put(com.woolworths.R.layout.fragment_marketplace, 3);
        sparseIntArray.put(com.woolworths.R.layout.fragment_marketplace_content, 4);
        sparseIntArray.put(com.woolworths.R.layout.fragment_marketplace_facet, 5);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(8);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.base.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.base.shopapp.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.product.list.legacy.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.product.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.promotion.banner.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shop.cart.DataBinderMapperImpl());
        arrayList.add(new com.airbnb.epoxy.databinding.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f7465a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            if (i2 == 1) {
                if (!"layout/activity_marketplace_0".equals(tag)) {
                    throw new IllegalArgumentException(b.m(tag, "The tag for activity_marketplace is invalid. Received: "));
                }
                Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, ActivityMarketplaceBindingImpl.B);
                ActivityMarketplaceBindingImpl activityMarketplaceBindingImpl = new ActivityMarketplaceBindingImpl(dataBindingComponent, view, (FrameLayout) objArrT[2], (Toolbar) objArrT[1]);
                activityMarketplaceBindingImpl.A = -1L;
                ((CoordinatorLayout) objArrT[0]).setTag(null);
                activityMarketplaceBindingImpl.E(view);
                activityMarketplaceBindingImpl.r();
                return activityMarketplaceBindingImpl;
            }
            if (i2 == 2) {
                if ("layout/epoxy_item_marketplace_error_0".equals(tag)) {
                    return new EpoxyItemMarketplaceErrorBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_marketplace_error is invalid. Received: "));
            }
            if (i2 == 3) {
                if ("layout/fragment_marketplace_0".equals(tag)) {
                    return new FragmentMarketplaceBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(b.m(tag, "The tag for fragment_marketplace is invalid. Received: "));
            }
            if (i2 == 4) {
                if ("layout/fragment_marketplace_content_0".equals(tag)) {
                    return new FragmentMarketplaceContentBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(b.m(tag, "The tag for fragment_marketplace_content is invalid. Received: "));
            }
            if (i2 == 5) {
                if ("layout/fragment_marketplace_facet_0".equals(tag)) {
                    return new FragmentMarketplaceFacetBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(b.m(tag, "The tag for fragment_marketplace_facet is invalid. Received: "));
            }
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f7465a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f7466a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
