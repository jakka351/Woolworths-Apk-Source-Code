package au.com.woolworths.shop.product.navigation;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.impl.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.shop.product.navigation.databinding.ActivitySubCategoryBindingImpl;
import au.com.woolworths.shop.product.navigation.databinding.EpoxyItemProductCategoryBindingImpl;
import au.com.woolworths.shop.product.navigation.databinding.EpoxyItemProductCategoryHeaderBindingImpl;
import au.com.woolworths.shop.product.navigation.databinding.EpoxyItemSpecialsByCategoryBindingImpl;
import au.com.woolworths.shop.product.navigation.databinding.EpoxyItemSubCategoryBindingImpl;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes4.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f12635a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = a.b(118, 0, 1, "_all", "actionState");
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
            sparseArrayB.put(77, "marketplaceInfo");
            sparseArrayB.put(78, "memberPriceInfo");
            sparseArrayB.put(79, "message");
            sparseArrayB.put(80, "offerViewItem");
            sparseArrayB.put(81, "onBannerClick");
            sparseArrayB.put(82, "onClick");
            sparseArrayB.put(83, "onMaxLinesToggleListener");
            sparseArrayB.put(84, "onPointsBalanceClick");
            sparseArrayB.put(85, "onQueryTextChangeListener");
            sparseArrayB.put(86, "onQueryTextFocusChangeListener");
            sparseArrayB.put(87, "onQueryTextSubmitListener");
            sparseArrayB.put(88, "onSelected");
            sparseArrayB.put(89, "optionText");
            sparseArrayB.put(90, "paddingBottom");
            sparseArrayB.put(91, "pageItem");
            sparseArrayB.put(92, "postcode");
            sparseArrayB.put(93, "primaryButtonClickListener");
            sparseArrayB.put(94, "product");
            sparseArrayB.put(95, "productCard");
            sparseArrayB.put(96, "productCardConfig");
            sparseArrayB.put(97, "productConfig");
            sparseArrayB.put(98, "productData");
            sparseArrayB.put(99, "rewardsPointsBalance");
            sparseArrayB.put(100, "rewardsPointsBalanceData");
            sparseArrayB.put(101, "searchQueryHint");
            sparseArrayB.put(102, "section");
            sparseArrayB.put(103, "sectionTitle");
            sparseArrayB.put(104, "seller");
            sparseArrayB.put(105, "shoppingList");
            sparseArrayB.put(106, "showAddToListButton");
            sparseArrayB.put(107, "showBoostAnimation");
            sparseArrayB.put(108, "showNewDismissIcon");
            sparseArrayB.put(109, "showTigerDisplayExpiry");
            sparseArrayB.put(110, "showTigerOffersLabel");
            sparseArrayB.put(111, "singleLine");
            sparseArrayB.put(112, "state");
            sparseArrayB.put(113, "store");
            sparseArrayB.put(114, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(115, "title");
            sparseArrayB.put(116, "viewListener");
            sparseArrayB.put(117, "viewModel");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f12636a;

        static {
            HashMap map = new HashMap(5);
            f12636a = map;
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_sub_category, map, "layout/activity_sub_category_0", com.woolworths.R.layout.epoxy_item_product_category, "layout/epoxy_item_product_category_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_product_category_header, map, "layout/epoxy_item_product_category_header_0", com.woolworths.R.layout.epoxy_item_specials_by_category, "layout/epoxy_item_specials_by_category_0");
            map.put("layout/epoxy_item_sub_category_0", Integer.valueOf(com.woolworths.R.layout.epoxy_item_sub_category));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(5);
        f12635a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.activity_sub_category, 1);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_product_category, 2);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_product_category_header, 3);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_specials_by_category, 4);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_sub_category, 5);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(6);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.base.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.base.shopapp.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.product.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shop.cart.DataBinderMapperImpl());
        arrayList.add(new com.airbnb.epoxy.databinding.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f12635a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            if (i2 == 1) {
                if (!"layout/activity_sub_category_0".equals(tag)) {
                    throw new IllegalArgumentException(b.m(tag, "The tag for activity_sub_category is invalid. Received: "));
                }
                Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 5, ActivitySubCategoryBindingImpl.E, ActivitySubCategoryBindingImpl.F);
                ActivitySubCategoryBindingImpl activitySubCategoryBindingImpl = new ActivitySubCategoryBindingImpl(dataBindingComponent, view, (IncludeGenericErrorStateBinding) objArrT[3], (EpoxyRecyclerView) objArrT[1], (ContentLoadingProgressBar) objArrT[2], (Toolbar) objArrT[4]);
                activitySubCategoryBindingImpl.D = -1L;
                IncludeGenericErrorStateBinding includeGenericErrorStateBinding = activitySubCategoryBindingImpl.y;
                if (includeGenericErrorStateBinding != null) {
                    includeGenericErrorStateBinding.n = activitySubCategoryBindingImpl;
                }
                ((ConstraintLayout) objArrT[0]).setTag(null);
                activitySubCategoryBindingImpl.z.setTag(null);
                activitySubCategoryBindingImpl.A.setTag(null);
                activitySubCategoryBindingImpl.E(view);
                activitySubCategoryBindingImpl.r();
                return activitySubCategoryBindingImpl;
            }
            if (i2 == 2) {
                if ("layout/epoxy_item_product_category_0".equals(tag)) {
                    return new EpoxyItemProductCategoryBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_product_category is invalid. Received: "));
            }
            if (i2 == 3) {
                if ("layout/epoxy_item_product_category_header_0".equals(tag)) {
                    return new EpoxyItemProductCategoryHeaderBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_product_category_header is invalid. Received: "));
            }
            if (i2 == 4) {
                if ("layout/epoxy_item_specials_by_category_0".equals(tag)) {
                    return new EpoxyItemSpecialsByCategoryBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_specials_by_category is invalid. Received: "));
            }
            if (i2 == 5) {
                if ("layout/epoxy_item_sub_category_0".equals(tag)) {
                    return new EpoxyItemSubCategoryBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_sub_category is invalid. Received: "));
            }
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f12635a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f12636a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
