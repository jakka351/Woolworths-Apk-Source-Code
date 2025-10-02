package au.com.woolworths.shop.addtolist;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.camera.core.impl.b;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.shop.addtolist.databinding.ActivityCreateUpdateShoppingListBindingImpl;
import au.com.woolworths.shop.addtolist.databinding.EpoxyItemAddToListBindingImpl;
import au.com.woolworths.shop.addtolist.databinding.EpoxyItemListsAddBindingImpl;
import au.com.woolworths.shop.addtolist.databinding.FragmentAddToListBottomSheetBindingImpl;
import au.com.woolworths.shop.addtolist.databinding.ItemColorSwatchBindingImpl;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes4.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f10104a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = a.b(107, 0, 1, "_all", "actionState");
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
            sparseArrayB.put(19, "color");
            sparseArrayB.put(20, "colorName");
            sparseArrayB.put(21, "containerTitle");
            sparseArrayB.put(22, "cta");
            sparseArrayB.put(23, "ctaText");
            sparseArrayB.put(24, "data");
            sparseArrayB.put(25, "displayExpiryExtended");
            sparseArrayB.put(26, "emptyState");
            sparseArrayB.put(27, "enableBoostAnimationContainerGap");
            sparseArrayB.put(28, "enabled");
            sparseArrayB.put(29, "errorState");
            sparseArrayB.put(30, "filter");
            sparseArrayB.put(31, "footer");
            sparseArrayB.put(32, "groupTitle");
            sparseArrayB.put(33, "handler");
            sparseArrayB.put(34, "header");
            sparseArrayB.put(35, "heightRes");
            sparseArrayB.put(36, "hostScreen");
            sparseArrayB.put(37, "htmlListener");
            sparseArrayB.put(38, "iconResId");
            sparseArrayB.put(39, "imageLoaderListener");
            sparseArrayB.put(40, "importantForAccessibility");
            sparseArrayB.put(41, "index");
            sparseArrayB.put(42, "info");
            sparseArrayB.put(43, "infoSectionItem");
            sparseArrayB.put(44, "infoView");
            sparseArrayB.put(45, "inlineMessage");
            sparseArrayB.put(46, "isAccountNotificationBadgeShown");
            sparseArrayB.put(47, "isChecked");
            sparseArrayB.put(48, "isCtaInProgress");
            sparseArrayB.put(49, "isEnabled");
            sparseArrayB.put(50, "isLowerPriceYellow");
            sparseArrayB.put(51, "isMarketplace");
            sparseArrayB.put(52, "isPopup");
            sparseArrayB.put(53, "isRewardStyle");
            sparseArrayB.put(54, "isSelected");
            sparseArrayB.put(55, "isShoppingListBeingSaved");
            sparseArrayB.put(56, "isUnlocking");
            sparseArrayB.put(57, "isWatchlisted");
            sparseArrayB.put(58, "item");
            sparseArrayB.put(59, "itemClickListener");
            sparseArrayB.put(60, "itemWidthRes");
            sparseArrayB.put(61, AnnotatedPrivateKey.LABEL);
            sparseArrayB.put(62, "labelStyle");
            sparseArrayB.put(63, "linkHandler");
            sparseArrayB.put(64, "listIndex");
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
            sparseArrayB.put(77, "onPointsBalanceClick");
            sparseArrayB.put(78, "onQueryTextChangeListener");
            sparseArrayB.put(79, "onQueryTextFocusChangeListener");
            sparseArrayB.put(80, "onQueryTextSubmitListener");
            sparseArrayB.put(81, "onSelected");
            sparseArrayB.put(82, "optionText");
            sparseArrayB.put(83, "paddingBottom");
            sparseArrayB.put(84, "product");
            sparseArrayB.put(85, "productCard");
            sparseArrayB.put(86, "productCardConfig");
            sparseArrayB.put(87, "productConfig");
            sparseArrayB.put(88, "productData");
            sparseArrayB.put(89, "rewardsPointsBalance");
            sparseArrayB.put(90, "rewardsPointsBalanceData");
            sparseArrayB.put(91, "searchQueryHint");
            sparseArrayB.put(92, "section");
            sparseArrayB.put(93, "sectionTitle");
            sparseArrayB.put(94, "seller");
            sparseArrayB.put(95, "shoppingList");
            sparseArrayB.put(96, "showAddToListButton");
            sparseArrayB.put(97, "showBoostAnimation");
            sparseArrayB.put(98, "showNewDismissIcon");
            sparseArrayB.put(99, "showTigerDisplayExpiry");
            sparseArrayB.put(100, "showTigerOffersLabel");
            sparseArrayB.put(101, "singleLine");
            sparseArrayB.put(102, "state");
            sparseArrayB.put(103, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(104, "title");
            sparseArrayB.put(105, "viewListener");
            sparseArrayB.put(106, "viewModel");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f10105a;

        static {
            HashMap map = new HashMap(5);
            f10105a = map;
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_create_update_shopping_list, map, "layout/activity_create_update_shopping_list_0", com.woolworths.R.layout.epoxy_item_add_to_list, "layout/epoxy_item_add_to_list_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_lists_add, map, "layout/epoxy_item_lists_add_0", com.woolworths.R.layout.fragment_add_to_list_bottom_sheet, "layout/fragment_add_to_list_bottom_sheet_0");
            map.put("layout/item_color_swatch_0", Integer.valueOf(com.woolworths.R.layout.item_color_swatch));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(5);
        f10104a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.activity_create_update_shopping_list, 1);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_add_to_list, 2);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_lists_add, 3);
        sparseIntArray.put(com.woolworths.R.layout.fragment_add_to_list_bottom_sheet, 4);
        sparseIntArray.put(com.woolworths.R.layout.item_color_swatch, 5);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.base.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.base.shopapp.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.rewards.offers.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.product.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shared.ui.views.DataBinderMapperImpl());
        arrayList.add(new com.airbnb.epoxy.databinding.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f10104a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i2 == 1) {
            if ("layout/activity_create_update_shopping_list_0".equals(tag)) {
                return new ActivityCreateUpdateShoppingListBindingImpl(dataBindingComponent, view);
            }
            throw new IllegalArgumentException(b.m(tag, "The tag for activity_create_update_shopping_list is invalid. Received: "));
        }
        if (i2 == 2) {
            if ("layout/epoxy_item_add_to_list_0".equals(tag)) {
                return new EpoxyItemAddToListBindingImpl(dataBindingComponent, view);
            }
            throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_add_to_list is invalid. Received: "));
        }
        if (i2 == 3) {
            if ("layout/epoxy_item_lists_add_0".equals(tag)) {
                return new EpoxyItemListsAddBindingImpl(dataBindingComponent, view);
            }
            throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_lists_add is invalid. Received: "));
        }
        if (i2 == 4) {
            if ("layout/fragment_add_to_list_bottom_sheet_0".equals(tag)) {
                return new FragmentAddToListBottomSheetBindingImpl(dataBindingComponent, view);
            }
            throw new IllegalArgumentException(b.m(tag, "The tag for fragment_add_to_list_bottom_sheet is invalid. Received: "));
        }
        if (i2 != 5) {
            return null;
        }
        if ("layout/item_color_swatch_0".equals(tag)) {
            return new ItemColorSwatchBindingImpl(dataBindingComponent, view);
        }
        throw new IllegalArgumentException(b.m(tag, "The tag for item_color_swatch is invalid. Received: "));
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f10104a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f10105a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
