package au.com.woolworths.feature.shop.catalogue;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.impl.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericInlineErrorStateBinding;
import au.com.woolworths.feature.shop.catalogue.databinding.ActivityCatalogueDetailsBindingImpl;
import au.com.woolworths.feature.shop.catalogue.databinding.ActivityCatalogueHomeBindingImpl;
import au.com.woolworths.feature.shop.catalogue.databinding.ActivityCatalogueIntroBindingImpl;
import au.com.woolworths.feature.shop.catalogue.databinding.ActivityCatalogueProductListBindingImpl;
import au.com.woolworths.feature.shop.catalogue.databinding.ActivityCatalogueStoreSelectorBindingImpl;
import au.com.woolworths.feature.shop.catalogue.databinding.ActivityTermsAndConditionsBindingImpl;
import au.com.woolworths.feature.shop.catalogue.databinding.IncludeCartButtonBindingImpl;
import au.com.woolworths.feature.shop.catalogue.databinding.IncludeCatalogueHomeSneakPeekBindingImpl;
import au.com.woolworths.feature.shop.catalogue.databinding.ItemCatalogueAdditionalProductDetailsBindingImpl;
import au.com.woolworths.feature.shop.catalogue.databinding.ItemCatalogueDetailsBindingImpl;
import au.com.woolworths.feature.shop.catalogue.databinding.ItemCatalogueHeroProductDetailsBindingImpl;
import au.com.woolworths.feature.shop.catalogue.databinding.ItemCataloguePageImageBindingImpl;
import au.com.woolworths.feature.shop.catalogue.databinding.ItemCataloguePageTileBindingImpl;
import au.com.woolworths.feature.shop.catalogue.databinding.ItemCatalogueProductDescriptionBindingImpl;
import au.com.woolworths.feature.shop.catalogue.databinding.ItemCatalogueStoreBindingImpl;
import au.com.woolworths.feature.shop.catalogue.details.CataloguePageView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f6781a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = a.b(117, 0, 1, "_all", "actionState");
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
            sparseArrayB.put(15, "cartButton");
            sparseArrayB.put(16, "cataloguePage");
            sparseArrayB.put(17, "clickHandler");
            sparseArrayB.put(18, "clickHandlers");
            sparseArrayB.put(19, "clickListener");
            sparseArrayB.put(20, "coachMark");
            sparseArrayB.put(21, "color");
            sparseArrayB.put(22, "colorName");
            sparseArrayB.put(23, "containerTitle");
            sparseArrayB.put(24, "cta");
            sparseArrayB.put(25, "ctaText");
            sparseArrayB.put(26, "data");
            sparseArrayB.put(27, "displayExpiryExtended");
            sparseArrayB.put(28, "displayName");
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
            sparseArrayB.put(42, "imageLoadListener");
            sparseArrayB.put(43, "imageLoaderListener");
            sparseArrayB.put(44, "importantForAccessibility");
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
            sparseArrayB.put(64, "itemState");
            sparseArrayB.put(65, "itemWidthRes");
            sparseArrayB.put(66, AnnotatedPrivateKey.LABEL);
            sparseArrayB.put(67, "labelStyle");
            sparseArrayB.put(68, "linkHandler");
            sparseArrayB.put(69, "listIndex");
            sparseArrayB.put(70, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            sparseArrayB.put(71, "loadingMessage");
            sparseArrayB.put(72, "lottieAutoPlay");
            sparseArrayB.put(73, "lottieBackgroundColor");
            sparseArrayB.put(74, "lottieLoop");
            sparseArrayB.put(75, "margins");
            sparseArrayB.put(76, "markdownContent");
            sparseArrayB.put(77, "memberPriceInfo");
            sparseArrayB.put(78, "message");
            sparseArrayB.put(79, "offerViewItem");
            sparseArrayB.put(80, "onBannerClick");
            sparseArrayB.put(81, "onClick");
            sparseArrayB.put(82, "onMaxLinesToggleListener");
            sparseArrayB.put(83, "onPointsBalanceClick");
            sparseArrayB.put(84, "onQueryTextChangeListener");
            sparseArrayB.put(85, "onQueryTextFocusChangeListener");
            sparseArrayB.put(86, "onQueryTextSubmitListener");
            sparseArrayB.put(87, "onSelected");
            sparseArrayB.put(88, "optionText");
            sparseArrayB.put(89, "paddingBottom");
            sparseArrayB.put(90, "pageItem");
            sparseArrayB.put(91, "postcode");
            sparseArrayB.put(92, "primaryButtonClickListener");
            sparseArrayB.put(93, "product");
            sparseArrayB.put(94, "productCard");
            sparseArrayB.put(95, "productCardConfig");
            sparseArrayB.put(96, "productConfig");
            sparseArrayB.put(97, "productData");
            sparseArrayB.put(98, "rewardsPointsBalance");
            sparseArrayB.put(99, "rewardsPointsBalanceData");
            sparseArrayB.put(100, "searchQueryHint");
            sparseArrayB.put(101, "section");
            sparseArrayB.put(102, "sectionTitle");
            sparseArrayB.put(103, "seller");
            sparseArrayB.put(104, "shoppingList");
            sparseArrayB.put(105, "showAddToListButton");
            sparseArrayB.put(106, "showBoostAnimation");
            sparseArrayB.put(107, "showNewDismissIcon");
            sparseArrayB.put(108, "showTigerDisplayExpiry");
            sparseArrayB.put(109, "showTigerOffersLabel");
            sparseArrayB.put(110, "singleLine");
            sparseArrayB.put(111, "state");
            sparseArrayB.put(112, "store");
            sparseArrayB.put(113, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(114, "title");
            sparseArrayB.put(115, "viewListener");
            sparseArrayB.put(116, "viewModel");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f6782a;

        static {
            HashMap map = new HashMap(15);
            f6782a = map;
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_catalogue_details, map, "layout/activity_catalogue_details_0", com.woolworths.R.layout.activity_catalogue_home, "layout/activity_catalogue_home_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_catalogue_intro, map, "layout/activity_catalogue_intro_0", com.woolworths.R.layout.activity_catalogue_product_list, "layout/activity_catalogue_product_list_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_catalogue_store_selector, map, "layout/activity_catalogue_store_selector_0", com.woolworths.R.layout.activity_terms_and_conditions, "layout/activity_terms_and_conditions_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.include_cart_button, map, "layout/include_cart_button_0", com.woolworths.R.layout.include_catalogue_home_sneak_peek, "layout/include_catalogue_home_sneak_peek_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.item_catalogue_additional_product_details, map, "layout/item_catalogue_additional_product_details_0", com.woolworths.R.layout.item_catalogue_details, "layout/item_catalogue_details_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.item_catalogue_hero_product_details, map, "layout/item_catalogue_hero_product_details_0", com.woolworths.R.layout.item_catalogue_page_image, "layout/item_catalogue_page_image_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.item_catalogue_page_tile, map, "layout/item_catalogue_page_tile_0", com.woolworths.R.layout.item_catalogue_product_description, "layout/item_catalogue_product_description_0");
            map.put("layout/item_catalogue_store_0", Integer.valueOf(com.woolworths.R.layout.item_catalogue_store));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(15);
        f6781a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.activity_catalogue_details, 1);
        sparseIntArray.put(com.woolworths.R.layout.activity_catalogue_home, 2);
        sparseIntArray.put(com.woolworths.R.layout.activity_catalogue_intro, 3);
        sparseIntArray.put(com.woolworths.R.layout.activity_catalogue_product_list, 4);
        sparseIntArray.put(com.woolworths.R.layout.activity_catalogue_store_selector, 5);
        sparseIntArray.put(com.woolworths.R.layout.activity_terms_and_conditions, 6);
        sparseIntArray.put(com.woolworths.R.layout.include_cart_button, 7);
        sparseIntArray.put(com.woolworths.R.layout.include_catalogue_home_sneak_peek, 8);
        sparseIntArray.put(com.woolworths.R.layout.item_catalogue_additional_product_details, 9);
        sparseIntArray.put(com.woolworths.R.layout.item_catalogue_details, 10);
        sparseIntArray.put(com.woolworths.R.layout.item_catalogue_hero_product_details, 11);
        sparseIntArray.put(com.woolworths.R.layout.item_catalogue_page_image, 12);
        sparseIntArray.put(com.woolworths.R.layout.item_catalogue_page_tile, 13);
        sparseIntArray.put(com.woolworths.R.layout.item_catalogue_product_description, 14);
        sparseIntArray.put(com.woolworths.R.layout.item_catalogue_store, 15);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(6);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.base.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.base.shopapp.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.product.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shop.addtolist.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shop.cart.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f6781a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            switch (i2) {
                case 1:
                    if ("layout/activity_catalogue_details_0".equals(tag)) {
                        return new ActivityCatalogueDetailsBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for activity_catalogue_details is invalid. Received: "));
                case 2:
                    if (!"layout/activity_catalogue_home_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for activity_catalogue_home is invalid. Received: "));
                    }
                    Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 6, ActivityCatalogueHomeBindingImpl.E, ActivityCatalogueHomeBindingImpl.F);
                    IncludeGenericErrorStateBinding includeGenericErrorStateBinding = (IncludeGenericErrorStateBinding) objArrT[1];
                    ActivityCatalogueHomeBindingImpl activityCatalogueHomeBindingImpl = new ActivityCatalogueHomeBindingImpl(view, (ProgressBar) objArrT[5], (Toolbar) objArrT[3], dataBindingComponent, (RecyclerView) objArrT[4], includeGenericErrorStateBinding);
                    activityCatalogueHomeBindingImpl.D = -1L;
                    IncludeGenericErrorStateBinding includeGenericErrorStateBinding2 = activityCatalogueHomeBindingImpl.y;
                    if (includeGenericErrorStateBinding2 != null) {
                        includeGenericErrorStateBinding2.n = activityCatalogueHomeBindingImpl;
                    }
                    ((ConstraintLayout) objArrT[0]).setTag(null);
                    activityCatalogueHomeBindingImpl.E(view);
                    activityCatalogueHomeBindingImpl.r();
                    return activityCatalogueHomeBindingImpl;
                case 3:
                    if ("layout/activity_catalogue_intro_0".equals(tag)) {
                        return new ActivityCatalogueIntroBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for activity_catalogue_intro is invalid. Received: "));
                case 4:
                    if (!"layout/activity_catalogue_product_list_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for activity_catalogue_product_list is invalid. Received: "));
                    }
                    Object[] objArrT2 = ViewDataBinding.t(dataBindingComponent, view, 7, ActivityCatalogueProductListBindingImpl.F, ActivityCatalogueProductListBindingImpl.G);
                    ActivityCatalogueProductListBindingImpl activityCatalogueProductListBindingImpl = new ActivityCatalogueProductListBindingImpl(dataBindingComponent, view, (RecyclerView) objArrT2[6], (IncludeGenericErrorStateBinding) objArrT2[3], (IncludeGenericInlineErrorStateBinding) objArrT2[2], (ProgressBar) objArrT2[1], (Toolbar) objArrT2[5]);
                    activityCatalogueProductListBindingImpl.E = -1L;
                    IncludeGenericErrorStateBinding includeGenericErrorStateBinding3 = activityCatalogueProductListBindingImpl.z;
                    if (includeGenericErrorStateBinding3 != null) {
                        includeGenericErrorStateBinding3.n = activityCatalogueProductListBindingImpl;
                    }
                    IncludeGenericInlineErrorStateBinding includeGenericInlineErrorStateBinding = activityCatalogueProductListBindingImpl.A;
                    if (includeGenericInlineErrorStateBinding != null) {
                        includeGenericInlineErrorStateBinding.n = activityCatalogueProductListBindingImpl;
                    }
                    ((ConstraintLayout) objArrT2[0]).setTag(null);
                    activityCatalogueProductListBindingImpl.B.setTag(null);
                    activityCatalogueProductListBindingImpl.E(view);
                    activityCatalogueProductListBindingImpl.r();
                    return activityCatalogueProductListBindingImpl;
                case 5:
                    if ("layout/activity_catalogue_store_selector_0".equals(tag)) {
                        return new ActivityCatalogueStoreSelectorBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for activity_catalogue_store_selector is invalid. Received: "));
                case 6:
                    if (!"layout/activity_terms_and_conditions_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for activity_terms_and_conditions is invalid. Received: "));
                    }
                    Object[] objArrT3 = ViewDataBinding.t(dataBindingComponent, view, 4, null, ActivityTermsAndConditionsBindingImpl.C);
                    ActivityTermsAndConditionsBindingImpl activityTermsAndConditionsBindingImpl = new ActivityTermsAndConditionsBindingImpl(dataBindingComponent, view, (RecyclerView) objArrT3[3], (Toolbar) objArrT3[2]);
                    activityTermsAndConditionsBindingImpl.B = -1L;
                    ((ConstraintLayout) objArrT3[0]).setTag(null);
                    activityTermsAndConditionsBindingImpl.E(view);
                    activityTermsAndConditionsBindingImpl.r();
                    return activityTermsAndConditionsBindingImpl;
                case 7:
                    if ("layout/include_cart_button_0".equals(tag)) {
                        return new IncludeCartButtonBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for include_cart_button is invalid. Received: "));
                case 8:
                    if (!"layout/include_catalogue_home_sneak_peek_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for include_catalogue_home_sneak_peek is invalid. Received: "));
                    }
                    Object[] objArrT4 = ViewDataBinding.t(dataBindingComponent, view, 6, null, IncludeCatalogueHomeSneakPeekBindingImpl.E);
                    ConstraintLayout constraintLayout = (ConstraintLayout) objArrT4[0];
                    TextView textView = (TextView) objArrT4[4];
                    TextView textView2 = (TextView) objArrT4[3];
                    TextView textView3 = (TextView) objArrT4[2];
                    IncludeCatalogueHomeSneakPeekBindingImpl includeCatalogueHomeSneakPeekBindingImpl = new IncludeCatalogueHomeSneakPeekBindingImpl(dataBindingComponent, view, constraintLayout, textView, textView2, textView3);
                    includeCatalogueHomeSneakPeekBindingImpl.D = -1L;
                    includeCatalogueHomeSneakPeekBindingImpl.y.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, includeCatalogueHomeSneakPeekBindingImpl);
                    includeCatalogueHomeSneakPeekBindingImpl.r();
                    return includeCatalogueHomeSneakPeekBindingImpl;
                case 9:
                    if ("layout/item_catalogue_additional_product_details_0".equals(tag)) {
                        return new ItemCatalogueAdditionalProductDetailsBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for item_catalogue_additional_product_details is invalid. Received: "));
                case 10:
                    if (!"layout/item_catalogue_details_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for item_catalogue_details is invalid. Received: "));
                    }
                    Object[] objArrT5 = ViewDataBinding.t(dataBindingComponent, view, 4, null, ItemCatalogueDetailsBindingImpl.E);
                    ItemCatalogueDetailsBindingImpl itemCatalogueDetailsBindingImpl = new ItemCatalogueDetailsBindingImpl(dataBindingComponent, view, (CataloguePageView) objArrT5[1], (ProgressBar) objArrT5[2], (ImageView) objArrT5[3]);
                    itemCatalogueDetailsBindingImpl.D = -1L;
                    itemCatalogueDetailsBindingImpl.y.setTag(null);
                    ((ConstraintLayout) objArrT5[0]).setTag(null);
                    itemCatalogueDetailsBindingImpl.E(view);
                    itemCatalogueDetailsBindingImpl.r();
                    return itemCatalogueDetailsBindingImpl;
                case 11:
                    if ("layout/item_catalogue_hero_product_details_0".equals(tag)) {
                        return new ItemCatalogueHeroProductDetailsBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for item_catalogue_hero_product_details is invalid. Received: "));
                case 12:
                    if (!"layout/item_catalogue_page_image_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for item_catalogue_page_image is invalid. Received: "));
                    }
                    ItemCataloguePageImageBindingImpl itemCataloguePageImageBindingImpl = new ItemCataloguePageImageBindingImpl(dataBindingComponent, view, (ImageView) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
                    itemCataloguePageImageBindingImpl.C = -1L;
                    itemCataloguePageImageBindingImpl.y.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, itemCataloguePageImageBindingImpl);
                    itemCataloguePageImageBindingImpl.r();
                    return itemCataloguePageImageBindingImpl;
                case 13:
                    if ("layout/item_catalogue_page_tile_0".equals(tag)) {
                        return new ItemCataloguePageTileBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for item_catalogue_page_tile is invalid. Received: "));
                case 14:
                    if (!"layout/item_catalogue_product_description_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for item_catalogue_product_description is invalid. Received: "));
                    }
                    Object[] objArrT6 = ViewDataBinding.t(dataBindingComponent, view, 3, null, ItemCatalogueProductDescriptionBindingImpl.E);
                    ItemCatalogueProductDescriptionBindingImpl itemCatalogueProductDescriptionBindingImpl = new ItemCatalogueProductDescriptionBindingImpl(view, (Button) objArrT6[2], (TextView) objArrT6[1], dataBindingComponent);
                    itemCatalogueProductDescriptionBindingImpl.D = -1L;
                    ((ConstraintLayout) objArrT6[0]).setTag(null);
                    itemCatalogueProductDescriptionBindingImpl.y.setTag(null);
                    itemCatalogueProductDescriptionBindingImpl.E(view);
                    itemCatalogueProductDescriptionBindingImpl.r();
                    return itemCatalogueProductDescriptionBindingImpl;
                case 15:
                    if ("layout/item_catalogue_store_0".equals(tag)) {
                        return new ItemCatalogueStoreBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for item_catalogue_store is invalid. Received: "));
            }
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f6781a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f6782a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
