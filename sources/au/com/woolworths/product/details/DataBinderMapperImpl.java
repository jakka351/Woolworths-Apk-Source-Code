package au.com.woolworths.product.details;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.product.details.databinding.ActivityProductDetailsBindingImpl;
import au.com.woolworths.product.details.databinding.EpoxyItemCollapsibleContentBindingImpl;
import au.com.woolworths.product.details.databinding.EpoxyItemCountryOfOriginAndHealthInfoBindingImpl;
import au.com.woolworths.product.details.databinding.EpoxyItemHealthierListHeaderBindingImpl;
import au.com.woolworths.product.details.databinding.EpoxyItemHealthierProductCardBindingImpl;
import au.com.woolworths.product.details.databinding.EpoxyItemProductBadgeImageBindingImpl;
import au.com.woolworths.product.details.databinding.EpoxyItemProductBannerBindingImpl;
import au.com.woolworths.product.details.databinding.EpoxyItemProductDetailsMarketplaceBindingImpl;
import au.com.woolworths.product.details.databinding.EpoxyItemProductDisclaimerBindingImpl;
import au.com.woolworths.product.details.databinding.EpoxyItemProductHeadingBindingImpl;
import au.com.woolworths.product.details.databinding.EpoxyItemProductImageBindingImpl;
import au.com.woolworths.product.details.databinding.EpoxyItemProductInsetBannerBindingImpl;
import au.com.woolworths.product.details.databinding.EpoxyItemProductNutritionInfoBindingImpl;
import au.com.woolworths.product.details.databinding.FragmentHealthierBottomSheetBindingImpl;
import au.com.woolworths.product.details.databinding.IncludeHealthierProductCardBindingImpl;
import au.com.woolworths.product.details.databinding.IncludeProductDetailsBottomActionLayoutBindingImpl;
import au.com.woolworths.product.details.databinding.IncludeProductDetailsBottomButtonsLayoutBindingImpl;
import au.com.woolworths.product.details.databinding.ItemProductNutritionTableHeaderCellBindingImpl;
import au.com.woolworths.product.details.databinding.ItemProductNutritionTableRowCellBindingImpl;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes4.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f9284a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = au.com.woolworths.android.onesite.a.b(113, 0, 1, "_all", "actionState");
            sparseArrayB.put(2, "asset");
            sparseArrayB.put(3, "backgroundColor");
            sparseArrayB.put(4, "badgeImageUrl");
            sparseArrayB.put(5, "banner");
            sparseArrayB.put(6, "bannerAsset");
            sparseArrayB.put(7, "bannerIcon");
            sparseArrayB.put(8, "bannerState");
            sparseArrayB.put(9, "body");
            sparseArrayB.put(10, "boostAnimationVisibility");
            sparseArrayB.put(11, "boostViewListener");
            sparseArrayB.put(12, "brandLabel");
            sparseArrayB.put(13, "buttonText");
            sparseArrayB.put(14, "buttonTint");
            sparseArrayB.put(15, "canShowWatchlist");
            sparseArrayB.put(16, "clickHandler");
            sparseArrayB.put(17, "clickHandlers");
            sparseArrayB.put(18, "clickListener");
            sparseArrayB.put(19, "coachMark");
            sparseArrayB.put(20, "collectionMode");
            sparseArrayB.put(21, "color");
            sparseArrayB.put(22, "colorName");
            sparseArrayB.put(23, "containerTitle");
            sparseArrayB.put(24, "content");
            sparseArrayB.put(25, "cta");
            sparseArrayB.put(26, "ctaText");
            sparseArrayB.put(27, "data");
            sparseArrayB.put(28, "displayExpiryExtended");
            sparseArrayB.put(29, "emptyState");
            sparseArrayB.put(30, "enableBoostAnimationContainerGap");
            sparseArrayB.put(31, "enabled");
            sparseArrayB.put(32, "errorState");
            sparseArrayB.put(33, "filter");
            sparseArrayB.put(34, "footer");
            sparseArrayB.put(35, "groupTitle");
            sparseArrayB.put(36, "handler");
            sparseArrayB.put(37, "header");
            sparseArrayB.put(38, "heightRes");
            sparseArrayB.put(39, "hostScreen");
            sparseArrayB.put(40, "htmlListener");
            sparseArrayB.put(41, "iconResId");
            sparseArrayB.put(42, "imageLoaderListener");
            sparseArrayB.put(43, "importantForAccessibility");
            sparseArrayB.put(44, "inMappedStore");
            sparseArrayB.put(45, "index");
            sparseArrayB.put(46, "info");
            sparseArrayB.put(47, "infoSectionItem");
            sparseArrayB.put(48, "infoView");
            sparseArrayB.put(49, "inlineMessage");
            sparseArrayB.put(50, "isAccountNotificationBadgeShown");
            sparseArrayB.put(51, "isChecked");
            sparseArrayB.put(52, "isCtaInProgress");
            sparseArrayB.put(53, "isEnabled");
            sparseArrayB.put(54, "isLowerPriceYellow");
            sparseArrayB.put(55, "isMarketplace");
            sparseArrayB.put(56, "isPopup");
            sparseArrayB.put(57, "isRewardStyle");
            sparseArrayB.put(58, "isSelected");
            sparseArrayB.put(59, "isShoppingListBeingSaved");
            sparseArrayB.put(60, "isUnlocking");
            sparseArrayB.put(61, "isWatchlisted");
            sparseArrayB.put(62, "item");
            sparseArrayB.put(63, "itemClickListener");
            sparseArrayB.put(64, "itemWidthRes");
            sparseArrayB.put(65, AnnotatedPrivateKey.LABEL);
            sparseArrayB.put(66, "labelStyle");
            sparseArrayB.put(67, "linkHandler");
            sparseArrayB.put(68, "listIndex");
            sparseArrayB.put(69, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            sparseArrayB.put(70, "loadingMessage");
            sparseArrayB.put(71, "lottieAutoPlay");
            sparseArrayB.put(72, "lottieBackgroundColor");
            sparseArrayB.put(73, "lottieLoop");
            sparseArrayB.put(74, "margins");
            sparseArrayB.put(75, "markdownContent");
            sparseArrayB.put(76, "marketplace");
            sparseArrayB.put(77, "memberPriceInfo");
            sparseArrayB.put(78, "message");
            sparseArrayB.put(79, "offerViewItem");
            sparseArrayB.put(80, "onBannerClick");
            sparseArrayB.put(81, "onClick");
            sparseArrayB.put(82, "onPointsBalanceClick");
            sparseArrayB.put(83, "onQueryTextChangeListener");
            sparseArrayB.put(84, "onQueryTextFocusChangeListener");
            sparseArrayB.put(85, "onQueryTextSubmitListener");
            sparseArrayB.put(86, "onSelected");
            sparseArrayB.put(87, "optionText");
            sparseArrayB.put(88, "paddingBottom");
            sparseArrayB.put(89, "product");
            sparseArrayB.put(90, "productCard");
            sparseArrayB.put(91, "productCardButtonType");
            sparseArrayB.put(92, "productCardConfig");
            sparseArrayB.put(93, "productConfig");
            sparseArrayB.put(94, "productData");
            sparseArrayB.put(95, "rewardsPointsBalance");
            sparseArrayB.put(96, "rewardsPointsBalanceData");
            sparseArrayB.put(97, "searchQueryHint");
            sparseArrayB.put(98, "section");
            sparseArrayB.put(99, "sectionTitle");
            sparseArrayB.put(100, "seller");
            sparseArrayB.put(101, "shoppingList");
            sparseArrayB.put(102, "showAddToListButton");
            sparseArrayB.put(103, "showBoostAnimation");
            sparseArrayB.put(104, "showNewDismissIcon");
            sparseArrayB.put(105, "showTigerDisplayExpiry");
            sparseArrayB.put(106, "showTigerOffersLabel");
            sparseArrayB.put(107, "singleLine");
            sparseArrayB.put(108, "state");
            sparseArrayB.put(109, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(110, "title");
            sparseArrayB.put(111, "viewListener");
            sparseArrayB.put(112, "viewModel");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f9285a;

        static {
            HashMap map = new HashMap(19);
            f9285a = map;
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_product_details, map, "layout/activity_product_details_0", com.woolworths.R.layout.epoxy_item_collapsible_content, "layout/epoxy_item_collapsible_content_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_country_of_origin_and_health_info, map, "layout/epoxy_item_country_of_origin_and_health_info_0", com.woolworths.R.layout.epoxy_item_healthier_list_header, "layout/epoxy_item_healthier_list_header_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_healthier_product_card, map, "layout/epoxy_item_healthier_product_card_0", com.woolworths.R.layout.epoxy_item_product_badge_image, "layout/epoxy_item_product_badge_image_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_product_banner, map, "layout/epoxy_item_product_banner_0", com.woolworths.R.layout.epoxy_item_product_details_marketplace, "layout/epoxy_item_product_details_marketplace_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_product_disclaimer, map, "layout/epoxy_item_product_disclaimer_0", com.woolworths.R.layout.epoxy_item_product_heading, "layout/epoxy_item_product_heading_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_product_image, map, "layout/epoxy_item_product_image_0", com.woolworths.R.layout.epoxy_item_product_inset_banner, "layout/epoxy_item_product_inset_banner_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_product_nutrition_info, map, "layout/epoxy_item_product_nutrition_info_0", com.woolworths.R.layout.fragment_healthier_bottom_sheet, "layout/fragment_healthier_bottom_sheet_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.include_healthier_product_card, map, "layout/include_healthier_product_card_0", com.woolworths.R.layout.include_product_details_bottom_action_layout, "layout/include_product_details_bottom_action_layout_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.include_product_details_bottom_buttons_layout, map, "layout/include_product_details_bottom_buttons_layout_0", com.woolworths.R.layout.item_product_nutrition_table_header_cell, "layout/item_product_nutrition_table_header_cell_0");
            map.put("layout/item_product_nutrition_table_row_cell_0", Integer.valueOf(com.woolworths.R.layout.item_product_nutrition_table_row_cell));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(19);
        f9284a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.activity_product_details, 1);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_collapsible_content, 2);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_country_of_origin_and_health_info, 3);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_healthier_list_header, 4);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_healthier_product_card, 5);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_product_badge_image, 6);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_product_banner, 7);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_product_details_marketplace, 8);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_product_disclaimer, 9);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_product_heading, 10);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_product_image, 11);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_product_inset_banner, 12);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_product_nutrition_info, 13);
        sparseIntArray.put(com.woolworths.R.layout.fragment_healthier_bottom_sheet, 14);
        sparseIntArray.put(com.woolworths.R.layout.include_healthier_product_card, 15);
        sparseIntArray.put(com.woolworths.R.layout.include_product_details_bottom_action_layout, 16);
        sparseIntArray.put(com.woolworths.R.layout.include_product_details_bottom_buttons_layout, 17);
        sparseIntArray.put(com.woolworths.R.layout.item_product_nutrition_table_header_cell, 18);
        sparseIntArray.put(com.woolworths.R.layout.item_product_nutrition_table_row_cell, 19);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(11);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.base.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.base.shopapp.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.rewards.offers.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.foundation.rewards.offers.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.foundation.shop.bottomsheet.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.product.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.promotion.banner.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shop.addtolist.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shop.cart.DataBinderMapperImpl());
        arrayList.add(new com.airbnb.epoxy.databinding.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f9284a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            switch (i2) {
                case 1:
                    if ("layout/activity_product_details_0".equals(tag)) {
                        return new ActivityProductDetailsBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for activity_product_details is invalid. Received: "));
                case 2:
                    if ("layout/epoxy_item_collapsible_content_0".equals(tag)) {
                        return new EpoxyItemCollapsibleContentBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_collapsible_content is invalid. Received: "));
                case 3:
                    if (!"layout/epoxy_item_country_of_origin_and_health_info_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_country_of_origin_and_health_info is invalid. Received: "));
                    }
                    Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 5, null, null);
                    EpoxyItemCountryOfOriginAndHealthInfoBindingImpl epoxyItemCountryOfOriginAndHealthInfoBindingImpl = new EpoxyItemCountryOfOriginAndHealthInfoBindingImpl(dataBindingComponent, view, (FrameLayout) objArrT[1], (ImageView) objArrT[2], (TextView) objArrT[3], (ImageView) objArrT[4]);
                    epoxyItemCountryOfOriginAndHealthInfoBindingImpl.E = -1L;
                    epoxyItemCountryOfOriginAndHealthInfoBindingImpl.y.setTag(null);
                    epoxyItemCountryOfOriginAndHealthInfoBindingImpl.z.setTag(null);
                    epoxyItemCountryOfOriginAndHealthInfoBindingImpl.A.setTag(null);
                    epoxyItemCountryOfOriginAndHealthInfoBindingImpl.B.setTag(null);
                    ((ConstraintLayout) objArrT[0]).setTag(null);
                    epoxyItemCountryOfOriginAndHealthInfoBindingImpl.E(view);
                    epoxyItemCountryOfOriginAndHealthInfoBindingImpl.r();
                    return epoxyItemCountryOfOriginAndHealthInfoBindingImpl;
                case 4:
                    if ("layout/epoxy_item_healthier_list_header_0".equals(tag)) {
                        return new EpoxyItemHealthierListHeaderBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_healthier_list_header is invalid. Received: "));
                case 5:
                    if ("layout/epoxy_item_healthier_product_card_0".equals(tag)) {
                        return new EpoxyItemHealthierProductCardBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_healthier_product_card is invalid. Received: "));
                case 6:
                    if (!"layout/epoxy_item_product_badge_image_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_product_badge_image is invalid. Received: "));
                    }
                    Object[] objArrT2 = ViewDataBinding.t(dataBindingComponent, view, 2, null, null);
                    EpoxyItemProductBadgeImageBindingImpl epoxyItemProductBadgeImageBindingImpl = new EpoxyItemProductBadgeImageBindingImpl(dataBindingComponent, view, (ImageView) objArrT2[1]);
                    epoxyItemProductBadgeImageBindingImpl.A = -1L;
                    epoxyItemProductBadgeImageBindingImpl.y.setTag(null);
                    ((ConstraintLayout) objArrT2[0]).setTag(null);
                    epoxyItemProductBadgeImageBindingImpl.E(view);
                    epoxyItemProductBadgeImageBindingImpl.r();
                    return epoxyItemProductBadgeImageBindingImpl;
                case 7:
                    if ("layout/epoxy_item_product_banner_0".equals(tag)) {
                        return new EpoxyItemProductBannerBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_product_banner is invalid. Received: "));
                case 8:
                    if ("layout/epoxy_item_product_details_marketplace_0".equals(tag)) {
                        return new EpoxyItemProductDetailsMarketplaceBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_product_details_marketplace is invalid. Received: "));
                case 9:
                    if ("layout/epoxy_item_product_disclaimer_0".equals(tag)) {
                        return new EpoxyItemProductDisclaimerBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_product_disclaimer is invalid. Received: "));
                case 10:
                    if ("layout/epoxy_item_product_heading_0".equals(tag)) {
                        return new EpoxyItemProductHeadingBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_product_heading is invalid. Received: "));
                case 11:
                    if ("layout/epoxy_item_product_image_0".equals(tag)) {
                        return new EpoxyItemProductImageBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_product_image is invalid. Received: "));
                case 12:
                    if ("layout/epoxy_item_product_inset_banner_0".equals(tag)) {
                        return new EpoxyItemProductInsetBannerBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_product_inset_banner is invalid. Received: "));
                case 13:
                    if ("layout/epoxy_item_product_nutrition_info_0".equals(tag)) {
                        return new EpoxyItemProductNutritionInfoBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_product_nutrition_info is invalid. Received: "));
                case 14:
                    if ("layout/fragment_healthier_bottom_sheet_0".equals(tag)) {
                        return new FragmentHealthierBottomSheetBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for fragment_healthier_bottom_sheet is invalid. Received: "));
                case 15:
                    if ("layout/include_healthier_product_card_0".equals(tag)) {
                        return new IncludeHealthierProductCardBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for include_healthier_product_card is invalid. Received: "));
                case 16:
                    if ("layout/include_product_details_bottom_action_layout_0".equals(tag)) {
                        return new IncludeProductDetailsBottomActionLayoutBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for include_product_details_bottom_action_layout is invalid. Received: "));
                case 17:
                    if (!"layout/include_product_details_bottom_buttons_layout_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for include_product_details_bottom_buttons_layout is invalid. Received: "));
                    }
                    IncludeProductDetailsBottomButtonsLayoutBindingImpl includeProductDetailsBottomButtonsLayoutBindingImpl = new IncludeProductDetailsBottomButtonsLayoutBindingImpl(dataBindingComponent, view, (ConstraintLayout) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
                    includeProductDetailsBottomButtonsLayoutBindingImpl.z = -1L;
                    includeProductDetailsBottomButtonsLayoutBindingImpl.y.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, includeProductDetailsBottomButtonsLayoutBindingImpl);
                    includeProductDetailsBottomButtonsLayoutBindingImpl.r();
                    return includeProductDetailsBottomButtonsLayoutBindingImpl;
                case 18:
                    if ("layout/item_product_nutrition_table_header_cell_0".equals(tag)) {
                        return new ItemProductNutritionTableHeaderCellBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for item_product_nutrition_table_header_cell is invalid. Received: "));
                case 19:
                    if ("layout/item_product_nutrition_table_row_cell_0".equals(tag)) {
                        return new ItemProductNutritionTableRowCellBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for item_product_nutrition_table_row_cell is invalid. Received: "));
            }
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f9284a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f9285a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
