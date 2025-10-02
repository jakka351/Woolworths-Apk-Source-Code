package au.com.woolworths.shop.buyagain;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.impl.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.android.onesite.models.notification.NotificationResult;
import au.com.woolworths.shop.buyagain.databinding.EpoxyItemBuyAgainProductBindingImpl;
import au.com.woolworths.shop.buyagain.databinding.EpoxyItemPaginationLoadingBindingImpl;
import au.com.woolworths.shop.buyagain.databinding.EpoxyItemProductListSkeletonBindingImpl;
import au.com.woolworths.shop.buyagain.databinding.FragmentBuyAgainBindingImpl;
import au.com.woolworths.shop.buyagain.databinding.FragmentBuyAgainQuantitySelectorBindingImpl;
import au.com.woolworths.shop.buyagain.databinding.LayoutBuyAgainHeaderBinding;
import au.com.woolworths.shop.buyagain.databinding.LayoutBuyAgainHeaderBindingImpl;
import au.com.woolworths.shop.buyagain.ui.legacy.footer.BuyAgainFooterView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes4.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f10248a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = a.b(149, 0, 1, "_all", "actionState");
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
            sparseArrayB.put(25, "color");
            sparseArrayB.put(26, "colorName");
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
            sparseArrayB.put(59, "inMappedStore");
            sparseArrayB.put(60, "index");
            sparseArrayB.put(61, "info");
            sparseArrayB.put(62, "infoSectionItem");
            sparseArrayB.put(63, "infoView");
            sparseArrayB.put(64, "inlineMessage");
            sparseArrayB.put(65, "insetBanner");
            sparseArrayB.put(66, "isAccountNotificationBadgeShown");
            sparseArrayB.put(67, "isButtonEnabled");
            sparseArrayB.put(68, "isChecked");
            sparseArrayB.put(69, "isComposeContentViewEnabled");
            sparseArrayB.put(70, "isCtaInProgress");
            sparseArrayB.put(71, "isEnabled");
            sparseArrayB.put(72, "isLoading");
            sparseArrayB.put(73, "isLowerPriceYellow");
            sparseArrayB.put(74, "isMarketplace");
            sparseArrayB.put(75, "isPopup");
            sparseArrayB.put(76, "isRewardStyle");
            sparseArrayB.put(77, "isSelected");
            sparseArrayB.put(78, "isShoppingListBeingSaved");
            sparseArrayB.put(79, "isUnlocking");
            sparseArrayB.put(80, "isWatchlisted");
            sparseArrayB.put(81, "item");
            sparseArrayB.put(82, "itemClickListener");
            sparseArrayB.put(83, "itemWidthRes");
            sparseArrayB.put(84, AnnotatedPrivateKey.LABEL);
            sparseArrayB.put(85, "labelStyle");
            sparseArrayB.put(86, "lightTheme");
            sparseArrayB.put(87, "linkHandler");
            sparseArrayB.put(88, "listIndex");
            sparseArrayB.put(89, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            sparseArrayB.put(90, "loadingMessage");
            sparseArrayB.put(91, "lottieAutoPlay");
            sparseArrayB.put(92, "lottieBackgroundColor");
            sparseArrayB.put(93, "lottieLoop");
            sparseArrayB.put(94, "margins");
            sparseArrayB.put(95, "markdownContent");
            sparseArrayB.put(96, "marketSellerGroup");
            sparseArrayB.put(97, "memberPriceInfo");
            sparseArrayB.put(98, "message");
            sparseArrayB.put(99, "offerViewItem");
            sparseArrayB.put(100, "onBannerClick");
            sparseArrayB.put(101, "onClick");
            sparseArrayB.put(102, "onPointsBalanceClick");
            sparseArrayB.put(103, "onQueryTextChangeListener");
            sparseArrayB.put(104, "onQueryTextFocusChangeListener");
            sparseArrayB.put(105, "onQueryTextSubmitListener");
            sparseArrayB.put(106, "onSelected");
            sparseArrayB.put(107, "optionText");
            sparseArrayB.put(108, "orderTotalDetails");
            sparseArrayB.put(109, "packagingMethodOption");
            sparseArrayB.put(110, "paddingBottom");
            sparseArrayB.put(111, "product");
            sparseArrayB.put(112, "productCard");
            sparseArrayB.put(113, "productCardConfig");
            sparseArrayB.put(114, "productConfig");
            sparseArrayB.put(115, "productData");
            sparseArrayB.put(116, "quantity");
            sparseArrayB.put(117, "rewardsPointsBalance");
            sparseArrayB.put(118, "rewardsPointsBalanceData");
            sparseArrayB.put(119, "rewardsRegistered");
            sparseArrayB.put(120, "rewardsRegisteredRedeemable");
            sparseArrayB.put(121, "rewardsUnregistered");
            sparseArrayB.put(122, "searchQueryHint");
            sparseArrayB.put(123, "section");
            sparseArrayB.put(124, "sectionHeader");
            sparseArrayB.put(125, "sectionTitle");
            sparseArrayB.put(126, "seller");
            sparseArrayB.put(127, "sellerName");
            sparseArrayB.put(128, "shoppingList");
            sparseArrayB.put(129, "shouldHideToolbar");
            sparseArrayB.put(130, "shouldShowLoadingState");
            sparseArrayB.put(131, "shouldShowNewBadge");
            sparseArrayB.put(132, "shouldShowNotificationDot");
            sparseArrayB.put(133, "shouldShowWebArrow");
            sparseArrayB.put(134, "showAddToListButton");
            sparseArrayB.put(135, "showBoostAnimation");
            sparseArrayB.put(136, "showLoadingView");
            sparseArrayB.put(137, "showNewDismissIcon");
            sparseArrayB.put(138, "showTigerDisplayExpiry");
            sparseArrayB.put(139, "showTigerOffersLabel");
            sparseArrayB.put(140, "singleLine");
            sparseArrayB.put(141, "state");
            sparseArrayB.put(142, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(143, "title");
            sparseArrayB.put(144, "viewListener");
            sparseArrayB.put(145, "viewModel");
            sparseArrayB.put(146, "viewState");
            sparseArrayB.put(147, "vocViewModel");
            sparseArrayB.put(148, "windowSubheader");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f10249a;

        static {
            HashMap map = new HashMap(6);
            f10249a = map;
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_buy_again_product, map, "layout/epoxy_item_buy_again_product_0", com.woolworths.R.layout.epoxy_item_pagination_loading, "layout/epoxy_item_pagination_loading_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_product_list_skeleton, map, "layout/epoxy_item_product_list_skeleton_0", com.woolworths.R.layout.fragment_buy_again, "layout/fragment_buy_again_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.fragment_buy_again_quantity_selector, map, "layout/fragment_buy_again_quantity_selector_0", com.woolworths.R.layout.layout_buy_again_header, "layout/layout_buy_again_header_0");
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(6);
        f10248a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_buy_again_product, 1);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_pagination_loading, 2);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_product_list_skeleton, 3);
        sparseIntArray.put(com.woolworths.R.layout.fragment_buy_again, 4);
        sparseIntArray.put(com.woolworths.R.layout.fragment_buy_again_quantity_selector, 5);
        sparseIntArray.put(com.woolworths.R.layout.layout_buy_again_header, 6);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(11);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.base.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.legacy.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.base.shopapp.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.rewards.offers.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.product.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shared.ui.views.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shop.addtolist.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shop.cart.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shop.product.ui.DataBinderMapperImpl());
        arrayList.add(new com.airbnb.epoxy.databinding.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f10248a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            switch (i2) {
                case 1:
                    if ("layout/epoxy_item_buy_again_product_0".equals(tag)) {
                        return new EpoxyItemBuyAgainProductBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_buy_again_product is invalid. Received: "));
                case 2:
                    if (!"layout/epoxy_item_pagination_loading_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_pagination_loading is invalid. Received: "));
                    }
                    Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 1, null, null);
                    EpoxyItemPaginationLoadingBindingImpl epoxyItemPaginationLoadingBindingImpl = new EpoxyItemPaginationLoadingBindingImpl(dataBindingComponent, view, 0);
                    epoxyItemPaginationLoadingBindingImpl.y = -1L;
                    ((ConstraintLayout) objArrT[0]).setTag(null);
                    epoxyItemPaginationLoadingBindingImpl.E(view);
                    epoxyItemPaginationLoadingBindingImpl.r();
                    return epoxyItemPaginationLoadingBindingImpl;
                case 3:
                    if (!"layout/epoxy_item_product_list_skeleton_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_product_list_skeleton is invalid. Received: "));
                    }
                    Object[] objArrT2 = ViewDataBinding.t(dataBindingComponent, view, 5, null, EpoxyItemProductListSkeletonBindingImpl.D);
                    EpoxyItemProductListSkeletonBindingImpl epoxyItemProductListSkeletonBindingImpl = new EpoxyItemProductListSkeletonBindingImpl(dataBindingComponent, view, (View) objArrT2[1], (View) objArrT2[4], (View) objArrT2[3], (View) objArrT2[2]);
                    epoxyItemProductListSkeletonBindingImpl.C = -1L;
                    ((ConstraintLayout) objArrT2[0]).setTag(null);
                    epoxyItemProductListSkeletonBindingImpl.E(view);
                    epoxyItemProductListSkeletonBindingImpl.r();
                    return epoxyItemProductListSkeletonBindingImpl;
                case 4:
                    if (!"layout/fragment_buy_again_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for fragment_buy_again is invalid. Received: "));
                    }
                    Object[] objArrT3 = ViewDataBinding.t(dataBindingComponent, view, 8, FragmentBuyAgainBindingImpl.F, FragmentBuyAgainBindingImpl.G);
                    FragmentBuyAgainBindingImpl fragmentBuyAgainBindingImpl = new FragmentBuyAgainBindingImpl(dataBindingComponent, view, (LayoutBuyAgainHeaderBinding) objArrT3[3], (IncludeGenericErrorStateBinding) objArrT3[4], (BuyAgainFooterView) objArrT3[2], (EpoxyRecyclerView) objArrT3[7], (Toolbar) objArrT3[6]);
                    fragmentBuyAgainBindingImpl.E = -1L;
                    LayoutBuyAgainHeaderBinding layoutBuyAgainHeaderBinding = fragmentBuyAgainBindingImpl.y;
                    if (layoutBuyAgainHeaderBinding != null) {
                        layoutBuyAgainHeaderBinding.n = fragmentBuyAgainBindingImpl;
                    }
                    IncludeGenericErrorStateBinding includeGenericErrorStateBinding = fragmentBuyAgainBindingImpl.z;
                    if (includeGenericErrorStateBinding != null) {
                        includeGenericErrorStateBinding.n = fragmentBuyAgainBindingImpl;
                    }
                    fragmentBuyAgainBindingImpl.A.setTag(null);
                    ((ConstraintLayout) objArrT3[0]).setTag(null);
                    ((AppBarLayout) objArrT3[1]).setTag(null);
                    fragmentBuyAgainBindingImpl.E(view);
                    fragmentBuyAgainBindingImpl.r();
                    return fragmentBuyAgainBindingImpl;
                case 5:
                    if ("layout/fragment_buy_again_quantity_selector_0".equals(tag)) {
                        return new FragmentBuyAgainQuantitySelectorBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for fragment_buy_again_quantity_selector is invalid. Received: "));
                case 6:
                    if (!"layout/layout_buy_again_header_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for layout_buy_again_header is invalid. Received: "));
                    }
                    Object[] objArrT4 = ViewDataBinding.t(dataBindingComponent, view, 2, null, null);
                    LayoutBuyAgainHeaderBindingImpl layoutBuyAgainHeaderBindingImpl = new LayoutBuyAgainHeaderBindingImpl(dataBindingComponent, view, (TextView) objArrT4[1]);
                    layoutBuyAgainHeaderBindingImpl.A = -1L;
                    ((ConstraintLayout) objArrT4[0]).setTag(null);
                    layoutBuyAgainHeaderBindingImpl.y.setTag(null);
                    layoutBuyAgainHeaderBindingImpl.E(view);
                    layoutBuyAgainHeaderBindingImpl.r();
                    return layoutBuyAgainHeaderBindingImpl;
            }
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f10248a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f10249a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
