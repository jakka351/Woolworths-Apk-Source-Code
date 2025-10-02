package au.com.woolworths.feature.shop.recipes;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.impl.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.feature.shop.recipes.databinding.ActivityFreshmagContentBindingImpl;
import au.com.woolworths.feature.shop.recipes.databinding.ActivityFreshmagHomeBindingImpl;
import au.com.woolworths.feature.shop.recipes.databinding.ActivityRecipeListBindingImpl;
import au.com.woolworths.feature.shop.recipes.databinding.ClickableRectGroupBindingImpl;
import au.com.woolworths.feature.shop.recipes.databinding.EpoxyItemFreshMagHomeBindingImpl;
import au.com.woolworths.feature.shop.recipes.databinding.EpoxyItemRecipeListPaginationErrorStateBindingImpl;
import au.com.woolworths.feature.shop.recipes.databinding.EpoxyItemRecipeSeeAllCardBindingImpl;
import au.com.woolworths.feature.shop.recipes.databinding.ItemClickableRectBindingImpl;
import au.com.woolworths.feature.shop.recipes.databinding.ItemZoomablePageBindingImpl;
import au.com.woolworths.feature.shop.recipes.databinding.ServesQuantityControlLayoutBindingImpl;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.clickablerect.ClickableRectGroup;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f7999a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = a.b(111, 0, 1, "_all", "actionState");
            sparseArrayB.put(2, "asset");
            sparseArrayB.put(3, "backgroundColor");
            sparseArrayB.put(4, "backingImageLoaderListener");
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
            sparseArrayB.put(20, "containerTitle");
            sparseArrayB.put(21, "contentDescription");
            sparseArrayB.put(22, "cta");
            sparseArrayB.put(23, "ctaText");
            sparseArrayB.put(24, "data");
            sparseArrayB.put(25, "displayExpiryExtended");
            sparseArrayB.put(26, "emptyState");
            sparseArrayB.put(27, "enableBoostAnimationContainerGap");
            sparseArrayB.put(28, "enabled");
            sparseArrayB.put(29, "errorLabelText");
            sparseArrayB.put(30, "errorState");
            sparseArrayB.put(31, "filter");
            sparseArrayB.put(32, "footer");
            sparseArrayB.put(33, "freshMagContent");
            sparseArrayB.put(34, "freshMagHomeListener");
            sparseArrayB.put(35, "groupTitle");
            sparseArrayB.put(36, "handler");
            sparseArrayB.put(37, "header");
            sparseArrayB.put(38, "heightRes");
            sparseArrayB.put(39, "hostScreen");
            sparseArrayB.put(40, "htmlListener");
            sparseArrayB.put(41, "iconResId");
            sparseArrayB.put(42, "imageLoaderListener");
            sparseArrayB.put(43, "imageUrl");
            sparseArrayB.put(44, "importantForAccessibility");
            sparseArrayB.put(45, "index");
            sparseArrayB.put(46, "info");
            sparseArrayB.put(47, "infoSectionItem");
            sparseArrayB.put(48, "inlineMessage");
            sparseArrayB.put(49, "isAccountNotificationBadgeShown");
            sparseArrayB.put(50, "isChecked");
            sparseArrayB.put(51, "isCtaInProgress");
            sparseArrayB.put(52, "isEnabled");
            sparseArrayB.put(53, "isLowerPriceYellow");
            sparseArrayB.put(54, "isMarketplace");
            sparseArrayB.put(55, "isPopup");
            sparseArrayB.put(56, "isRewardStyle");
            sparseArrayB.put(57, "isSelected");
            sparseArrayB.put(58, "isUnlocking");
            sparseArrayB.put(59, "isWatchlisted");
            sparseArrayB.put(60, "item");
            sparseArrayB.put(61, "itemWidthRes");
            sparseArrayB.put(62, AnnotatedPrivateKey.LABEL);
            sparseArrayB.put(63, "labelStyle");
            sparseArrayB.put(64, "linkHandler");
            sparseArrayB.put(65, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            sparseArrayB.put(66, "loadingMessage");
            sparseArrayB.put(67, "lottieAutoPlay");
            sparseArrayB.put(68, "lottieBackgroundColor");
            sparseArrayB.put(69, "lottieLoop");
            sparseArrayB.put(70, "margins");
            sparseArrayB.put(71, "markdownContent");
            sparseArrayB.put(72, "memberPriceInfo");
            sparseArrayB.put(73, "message");
            sparseArrayB.put(74, "offerViewItem");
            sparseArrayB.put(75, "onBannerClick");
            sparseArrayB.put(76, "onClick");
            sparseArrayB.put(77, "onItemClickListener");
            sparseArrayB.put(78, "onPointsBalanceClick");
            sparseArrayB.put(79, "onQueryTextChangeListener");
            sparseArrayB.put(80, "onQueryTextFocusChangeListener");
            sparseArrayB.put(81, "onQueryTextSubmitListener");
            sparseArrayB.put(82, "optionText");
            sparseArrayB.put(83, "paddingBottom");
            sparseArrayB.put(84, "page");
            sparseArrayB.put(85, "pageState");
            sparseArrayB.put(86, "product");
            sparseArrayB.put(87, "productCard");
            sparseArrayB.put(88, "productCardConfig");
            sparseArrayB.put(89, "productConfig");
            sparseArrayB.put(90, "productData");
            sparseArrayB.put(91, "recipeListViewModel");
            sparseArrayB.put(92, "rewardsPointsBalance");
            sparseArrayB.put(93, "rewardsPointsBalanceData");
            sparseArrayB.put(94, "searchQueryHint");
            sparseArrayB.put(95, "section");
            sparseArrayB.put(96, "sectionTitle");
            sparseArrayB.put(97, "seller");
            sparseArrayB.put(98, "serves");
            sparseArrayB.put(99, "servesQuantityClickListener");
            sparseArrayB.put(100, "showAddToListButton");
            sparseArrayB.put(101, "showBoostAnimation");
            sparseArrayB.put(102, "showNewDismissIcon");
            sparseArrayB.put(103, "showTigerDisplayExpiry");
            sparseArrayB.put(104, "showTigerOffersLabel");
            sparseArrayB.put(105, "singleLine");
            sparseArrayB.put(106, "state");
            sparseArrayB.put(107, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(108, "title");
            sparseArrayB.put(109, "viewListener");
            sparseArrayB.put(110, "viewModel");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f8000a;

        static {
            HashMap map = new HashMap(10);
            f8000a = map;
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_freshmag_content, map, "layout/activity_freshmag_content_0", com.woolworths.R.layout.activity_freshmag_home, "layout/activity_freshmag_home_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_recipe_list, map, "layout/activity_recipe_list_0", com.woolworths.R.layout.clickable_rect_group, "layout/clickable_rect_group_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_fresh_mag_home, map, "layout/epoxy_item_fresh_mag_home_0", com.woolworths.R.layout.epoxy_item_recipe_list_pagination_error_state, "layout/epoxy_item_recipe_list_pagination_error_state_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_recipe_see_all_card, map, "layout/epoxy_item_recipe_see_all_card_0", com.woolworths.R.layout.item_clickable_rect, "layout/item_clickable_rect_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.item_zoomable_page, map, "layout/item_zoomable_page_0", com.woolworths.R.layout.serves_quantity_control_layout, "layout/serves_quantity_control_layout_0");
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(10);
        f7999a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.activity_freshmag_content, 1);
        sparseIntArray.put(com.woolworths.R.layout.activity_freshmag_home, 2);
        sparseIntArray.put(com.woolworths.R.layout.activity_recipe_list, 3);
        sparseIntArray.put(com.woolworths.R.layout.clickable_rect_group, 4);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_fresh_mag_home, 5);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_recipe_list_pagination_error_state, 6);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_recipe_see_all_card, 7);
        sparseIntArray.put(com.woolworths.R.layout.item_clickable_rect, 8);
        sparseIntArray.put(com.woolworths.R.layout.item_zoomable_page, 9);
        sparseIntArray.put(com.woolworths.R.layout.serves_quantity_control_layout, 10);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(8);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.base.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.base.shopapp.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.rewards.offers.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.product.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shared.ui.views.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shop.cart.DataBinderMapperImpl());
        arrayList.add(new com.airbnb.epoxy.databinding.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f7999a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            switch (i2) {
                case 1:
                    if ("layout/activity_freshmag_content_0".equals(tag)) {
                        return new ActivityFreshmagContentBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for activity_freshmag_content is invalid. Received: "));
                case 2:
                    if (!"layout/activity_freshmag_home_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for activity_freshmag_home is invalid. Received: "));
                    }
                    Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 6, ActivityFreshmagHomeBindingImpl.F, ActivityFreshmagHomeBindingImpl.G);
                    ActivityFreshmagHomeBindingImpl activityFreshmagHomeBindingImpl = new ActivityFreshmagHomeBindingImpl(dataBindingComponent, view, (IncludeGenericErrorStateBinding) objArrT[2], (ProgressBar) objArrT[1], (EpoxyRecyclerView) objArrT[5], (Toolbar) objArrT[4]);
                    activityFreshmagHomeBindingImpl.E = -1L;
                    IncludeGenericErrorStateBinding includeGenericErrorStateBinding = activityFreshmagHomeBindingImpl.y;
                    if (includeGenericErrorStateBinding != null) {
                        includeGenericErrorStateBinding.n = activityFreshmagHomeBindingImpl;
                    }
                    ((ConstraintLayout) objArrT[0]).setTag(null);
                    activityFreshmagHomeBindingImpl.z.setTag(null);
                    activityFreshmagHomeBindingImpl.E(view);
                    activityFreshmagHomeBindingImpl.r();
                    return activityFreshmagHomeBindingImpl;
                case 3:
                    if ("layout/activity_recipe_list_0".equals(tag)) {
                        return new ActivityRecipeListBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for activity_recipe_list is invalid. Received: "));
                case 4:
                    if (!"layout/clickable_rect_group_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for clickable_rect_group is invalid. Received: "));
                    }
                    ClickableRectGroupBindingImpl clickableRectGroupBindingImpl = new ClickableRectGroupBindingImpl(dataBindingComponent, view, (ImageView) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
                    clickableRectGroupBindingImpl.C = -1L;
                    clickableRectGroupBindingImpl.y.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, clickableRectGroupBindingImpl);
                    clickableRectGroupBindingImpl.r();
                    return clickableRectGroupBindingImpl;
                case 5:
                    if ("layout/epoxy_item_fresh_mag_home_0".equals(tag)) {
                        return new EpoxyItemFreshMagHomeBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_fresh_mag_home is invalid. Received: "));
                case 6:
                    if ("layout/epoxy_item_recipe_list_pagination_error_state_0".equals(tag)) {
                        return new EpoxyItemRecipeListPaginationErrorStateBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_recipe_list_pagination_error_state is invalid. Received: "));
                case 7:
                    if ("layout/epoxy_item_recipe_see_all_card_0".equals(tag)) {
                        return new EpoxyItemRecipeSeeAllCardBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_recipe_see_all_card is invalid. Received: "));
                case 8:
                    if ("layout/item_clickable_rect_0".equals(tag)) {
                        return new ItemClickableRectBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for item_clickable_rect is invalid. Received: "));
                case 9:
                    if (!"layout/item_zoomable_page_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for item_zoomable_page is invalid. Received: "));
                    }
                    Object[] objArrT2 = ViewDataBinding.t(dataBindingComponent, view, 5, null, ItemZoomablePageBindingImpl.H);
                    ClickableRectGroup clickableRectGroup = (ClickableRectGroup) objArrT2[1];
                    ProgressBar progressBar = (ProgressBar) objArrT2[2];
                    ImageView imageView = (ImageView) objArrT2[3];
                    ItemZoomablePageBindingImpl itemZoomablePageBindingImpl = new ItemZoomablePageBindingImpl(dataBindingComponent, view, clickableRectGroup, progressBar, imageView);
                    itemZoomablePageBindingImpl.G = -1L;
                    itemZoomablePageBindingImpl.y.setTag(null);
                    ((ConstraintLayout) objArrT2[0]).setTag(null);
                    itemZoomablePageBindingImpl.z.setTag(null);
                    itemZoomablePageBindingImpl.A.setTag(null);
                    itemZoomablePageBindingImpl.E(view);
                    itemZoomablePageBindingImpl.r();
                    return itemZoomablePageBindingImpl;
                case 10:
                    if ("layout/serves_quantity_control_layout_0".equals(tag)) {
                        return new ServesQuantityControlLayoutBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for serves_quantity_control_layout is invalid. Received: "));
            }
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f7999a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f8000a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
