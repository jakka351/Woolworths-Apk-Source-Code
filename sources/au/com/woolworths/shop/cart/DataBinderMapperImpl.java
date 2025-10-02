package au.com.woolworths.shop.cart;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.camera.core.impl.b;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.shop.cart.databinding.ActivityCartBindingImpl;
import au.com.woolworths.shop.cart.databinding.EpoxyCartItemMarketplaceSellerBindingImpl;
import au.com.woolworths.shop.cart.databinding.EpoxyCartItemPromotionInfoBindingImpl;
import au.com.woolworths.shop.cart.databinding.EpoxyCartItemSectionHeaderLargeBindingImpl;
import au.com.woolworths.shop.cart.databinding.EpoxyCartItemSectionMenuOptionBindingImpl;
import au.com.woolworths.shop.cart.databinding.FragmentAddDeliveryAddPromptBindingImpl;
import au.com.woolworths.shop.cart.databinding.FragmentAddToCartBindingImpl;
import au.com.woolworths.shop.cart.databinding.FragmentSignInPromptBindingImpl;
import au.com.woolworths.views.BottomSheetWithHandle;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes4.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f10299a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = a.b(99, 0, 1, "_all", "actionState");
            sparseArrayB.put(2, "asset");
            sparseArrayB.put(3, "backgroundColor");
            sparseArrayB.put(4, "banner");
            sparseArrayB.put(5, "bannerAsset");
            sparseArrayB.put(6, "bannerIcon");
            sparseArrayB.put(7, "bannerState");
            sparseArrayB.put(8, "body");
            sparseArrayB.put(9, "boostAnimationVisibility");
            sparseArrayB.put(10, "boostViewListener");
            sparseArrayB.put(11, "brandLabel");
            sparseArrayB.put(12, "buttonText");
            sparseArrayB.put(13, "buttonTint");
            sparseArrayB.put(14, "canShowWatchlist");
            sparseArrayB.put(15, "clickHandler");
            sparseArrayB.put(16, "clickHandlers");
            sparseArrayB.put(17, "clickListener");
            sparseArrayB.put(18, "coachMark");
            sparseArrayB.put(19, "containerTitle");
            sparseArrayB.put(20, "cta");
            sparseArrayB.put(21, "ctaText");
            sparseArrayB.put(22, "data");
            sparseArrayB.put(23, "displayExpiryExtended");
            sparseArrayB.put(24, "emptyState");
            sparseArrayB.put(25, "enableBoostAnimationContainerGap");
            sparseArrayB.put(26, "enabled");
            sparseArrayB.put(27, "errorState");
            sparseArrayB.put(28, "filter");
            sparseArrayB.put(29, "footer");
            sparseArrayB.put(30, "groupTitle");
            sparseArrayB.put(31, "handler");
            sparseArrayB.put(32, "header");
            sparseArrayB.put(33, "heightRes");
            sparseArrayB.put(34, "hostScreen");
            sparseArrayB.put(35, "htmlListener");
            sparseArrayB.put(36, "iconResId");
            sparseArrayB.put(37, "imageLoaderListener");
            sparseArrayB.put(38, "importantForAccessibility");
            sparseArrayB.put(39, "index");
            sparseArrayB.put(40, "info");
            sparseArrayB.put(41, "infoSectionItem");
            sparseArrayB.put(42, "inlineMessage");
            sparseArrayB.put(43, "isAccountNotificationBadgeShown");
            sparseArrayB.put(44, "isChecked");
            sparseArrayB.put(45, "isCtaInProgress");
            sparseArrayB.put(46, "isEnabled");
            sparseArrayB.put(47, "isLowerPriceYellow");
            sparseArrayB.put(48, "isMarketplace");
            sparseArrayB.put(49, "isPopup");
            sparseArrayB.put(50, "isRewardStyle");
            sparseArrayB.put(51, "isSelected");
            sparseArrayB.put(52, "isUnlocking");
            sparseArrayB.put(53, "isWatchlisted");
            sparseArrayB.put(54, "item");
            sparseArrayB.put(55, "itemWidthRes");
            sparseArrayB.put(56, AnnotatedPrivateKey.LABEL);
            sparseArrayB.put(57, "labelStyle");
            sparseArrayB.put(58, "linkHandler");
            sparseArrayB.put(59, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            sparseArrayB.put(60, "loadingMessage");
            sparseArrayB.put(61, "lottieAutoPlay");
            sparseArrayB.put(62, "lottieBackgroundColor");
            sparseArrayB.put(63, "lottieLoop");
            sparseArrayB.put(64, "margins");
            sparseArrayB.put(65, "markdownContent");
            sparseArrayB.put(66, "memberPriceInfo");
            sparseArrayB.put(67, "message");
            sparseArrayB.put(68, "offerViewItem");
            sparseArrayB.put(69, "onBannerClick");
            sparseArrayB.put(70, "onClick");
            sparseArrayB.put(71, "onPointsBalanceClick");
            sparseArrayB.put(72, "onQueryTextChangeListener");
            sparseArrayB.put(73, "onQueryTextFocusChangeListener");
            sparseArrayB.put(74, "onQueryTextSubmitListener");
            sparseArrayB.put(75, "optionText");
            sparseArrayB.put(76, "paddingBottom");
            sparseArrayB.put(77, "product");
            sparseArrayB.put(78, "productCard");
            sparseArrayB.put(79, "productCardConfig");
            sparseArrayB.put(80, "productConfig");
            sparseArrayB.put(81, "productData");
            sparseArrayB.put(82, "rewardsPointsBalance");
            sparseArrayB.put(83, "rewardsPointsBalanceData");
            sparseArrayB.put(84, "searchQueryHint");
            sparseArrayB.put(85, "section");
            sparseArrayB.put(86, "sectionTitle");
            sparseArrayB.put(87, "seller");
            sparseArrayB.put(88, "showAddToListButton");
            sparseArrayB.put(89, "showBoostAnimation");
            sparseArrayB.put(90, "showNewDismissIcon");
            sparseArrayB.put(91, "showTigerDisplayExpiry");
            sparseArrayB.put(92, "showTigerOffersLabel");
            sparseArrayB.put(93, "singleLine");
            sparseArrayB.put(94, "state");
            sparseArrayB.put(95, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(96, "title");
            sparseArrayB.put(97, "viewListener");
            sparseArrayB.put(98, "viewModel");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f10300a;

        static {
            HashMap map = new HashMap(8);
            f10300a = map;
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_cart, map, "layout/activity_cart_0", com.woolworths.R.layout.epoxy_cart_item_marketplace_seller, "layout/epoxy_cart_item_marketplace_seller_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_cart_item_promotion_info, map, "layout/epoxy_cart_item_promotion_info_0", com.woolworths.R.layout.epoxy_cart_item_section_header_large, "layout/epoxy_cart_item_section_header_large_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_cart_item_section_menu_option, map, "layout/epoxy_cart_item_section_menu_option_0", com.woolworths.R.layout.fragment_add_delivery_add_prompt, "layout/fragment_add_delivery_add_prompt_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.fragment_add_to_cart, map, "layout/fragment_add_to_cart_0", com.woolworths.R.layout.fragment_sign_in_prompt, "layout/fragment_sign_in_prompt_0");
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(8);
        f10299a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.activity_cart, 1);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_cart_item_marketplace_seller, 2);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_cart_item_promotion_info, 3);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_cart_item_section_header_large, 4);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_cart_item_section_menu_option, 5);
        sparseIntArray.put(com.woolworths.R.layout.fragment_add_delivery_add_prompt, 6);
        sparseIntArray.put(com.woolworths.R.layout.fragment_add_to_cart, 7);
        sparseIntArray.put(com.woolworths.R.layout.fragment_sign_in_prompt, 8);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(8);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.base.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.base.shopapp.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.rewards.offers.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.product.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.promotion.banner.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shared.ui.views.DataBinderMapperImpl());
        arrayList.add(new com.airbnb.epoxy.databinding.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f10299a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            switch (i2) {
                case 1:
                    if ("layout/activity_cart_0".equals(tag)) {
                        return new ActivityCartBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for activity_cart is invalid. Received: "));
                case 2:
                    if (!"layout/epoxy_cart_item_marketplace_seller_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_cart_item_marketplace_seller is invalid. Received: "));
                    }
                    Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, null);
                    EpoxyCartItemMarketplaceSellerBindingImpl epoxyCartItemMarketplaceSellerBindingImpl = new EpoxyCartItemMarketplaceSellerBindingImpl(dataBindingComponent, view, (ConstraintLayout) objArrT[0], (TextView) objArrT[2], (TextView) objArrT[1]);
                    epoxyCartItemMarketplaceSellerBindingImpl.C = -1L;
                    epoxyCartItemMarketplaceSellerBindingImpl.y.setTag(null);
                    epoxyCartItemMarketplaceSellerBindingImpl.z.setTag(null);
                    epoxyCartItemMarketplaceSellerBindingImpl.A.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, epoxyCartItemMarketplaceSellerBindingImpl);
                    epoxyCartItemMarketplaceSellerBindingImpl.r();
                    return epoxyCartItemMarketplaceSellerBindingImpl;
                case 3:
                    if ("layout/epoxy_cart_item_promotion_info_0".equals(tag)) {
                        return new EpoxyCartItemPromotionInfoBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_cart_item_promotion_info is invalid. Received: "));
                case 4:
                    if ("layout/epoxy_cart_item_section_header_large_0".equals(tag)) {
                        return new EpoxyCartItemSectionHeaderLargeBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_cart_item_section_header_large is invalid. Received: "));
                case 5:
                    if ("layout/epoxy_cart_item_section_menu_option_0".equals(tag)) {
                        return new EpoxyCartItemSectionMenuOptionBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_cart_item_section_menu_option is invalid. Received: "));
                case 6:
                    if (!"layout/fragment_add_delivery_add_prompt_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for fragment_add_delivery_add_prompt is invalid. Received: "));
                    }
                    Object[] objArrT2 = ViewDataBinding.t(dataBindingComponent, view, 2, null, FragmentAddDeliveryAddPromptBindingImpl.B);
                    FragmentAddDeliveryAddPromptBindingImpl fragmentAddDeliveryAddPromptBindingImpl = new FragmentAddDeliveryAddPromptBindingImpl(dataBindingComponent, view, (ComposeView) objArrT2[1]);
                    fragmentAddDeliveryAddPromptBindingImpl.A = -1L;
                    ((BottomSheetWithHandle) objArrT2[0]).setTag(null);
                    fragmentAddDeliveryAddPromptBindingImpl.E(view);
                    fragmentAddDeliveryAddPromptBindingImpl.r();
                    return fragmentAddDeliveryAddPromptBindingImpl;
                case 7:
                    if ("layout/fragment_add_to_cart_0".equals(tag)) {
                        return new FragmentAddToCartBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for fragment_add_to_cart is invalid. Received: "));
                case 8:
                    if (!"layout/fragment_sign_in_prompt_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for fragment_sign_in_prompt is invalid. Received: "));
                    }
                    Object[] objArrT3 = ViewDataBinding.t(dataBindingComponent, view, 2, null, FragmentSignInPromptBindingImpl.B);
                    FragmentSignInPromptBindingImpl fragmentSignInPromptBindingImpl = new FragmentSignInPromptBindingImpl(dataBindingComponent, view, (ComposeView) objArrT3[1]);
                    fragmentSignInPromptBindingImpl.A = -1L;
                    ((BottomSheetWithHandle) objArrT3[0]).setTag(null);
                    fragmentSignInPromptBindingImpl.E(view);
                    fragmentSignInPromptBindingImpl.r();
                    return fragmentSignInPromptBindingImpl;
            }
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f10299a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f10300a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
