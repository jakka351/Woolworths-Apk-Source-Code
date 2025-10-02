package au.com.woolworths.feature.shop.more;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.more.databinding.EpoxyItemDeliveryUnlimitedBindingImpl;
import au.com.woolworths.feature.shop.more.databinding.EpoxyItemDeliveryUnlimitedUnavailableBindingImpl;
import au.com.woolworths.feature.shop.more.databinding.EpoxyItemMoreAppVersionBindingImpl;
import au.com.woolworths.feature.shop.more.databinding.EpoxyItemMoreChatToUsBindingImpl;
import au.com.woolworths.feature.shop.more.databinding.EpoxyItemMoreDeleteAccountBindingImpl;
import au.com.woolworths.feature.shop.more.databinding.EpoxyItemMoreExplainingValueBindingImpl;
import au.com.woolworths.feature.shop.more.databinding.EpoxyItemMoreFoodTrackerBindingImpl;
import au.com.woolworths.feature.shop.more.databinding.EpoxyItemMoreLoginSignupBindingImpl;
import au.com.woolworths.feature.shop.more.databinding.EpoxyItemMoreNotificationsBindingImpl;
import au.com.woolworths.feature.shop.more.databinding.EpoxyItemMoreOnlineShoppingBindingImpl;
import au.com.woolworths.feature.shop.more.databinding.EpoxyItemMoreReceiptPreferencesBindingImpl;
import au.com.woolworths.feature.shop.more.databinding.EpoxyItemMoreRewardsCardBindingImpl;
import au.com.woolworths.feature.shop.more.databinding.EpoxyItemMoreRewardsCardOldBindingImpl;
import au.com.woolworths.feature.shop.more.databinding.EpoxyItemMoreTileBindingImpl;
import au.com.woolworths.feature.shop.more.databinding.EpoxyItemMoreUsernameBindingImpl;
import au.com.woolworths.feature.shop.more.databinding.EpoxyItemMoreWifiBindingImpl;
import au.com.woolworths.feature.shop.more.databinding.FragmentMoreBindingImpl;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f7552a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = au.com.woolworths.android.onesite.a.b(130, 0, 1, "_all", "actionState");
            sparseArrayB.put(2, "asset");
            sparseArrayB.put(3, "backgroundColor");
            sparseArrayB.put(4, "banner");
            sparseArrayB.put(5, "bannerAsset");
            sparseArrayB.put(6, "bannerIcon");
            sparseArrayB.put(7, "bannerState");
            sparseArrayB.put(8, "barcodeData");
            sparseArrayB.put(9, "body");
            sparseArrayB.put(10, "boostAnimationVisibility");
            sparseArrayB.put(11, "boostViewListener");
            sparseArrayB.put(12, "brandLabel");
            sparseArrayB.put(13, "buttonText");
            sparseArrayB.put(14, "buttonTint");
            sparseArrayB.put(15, "canShowWatchlist");
            sparseArrayB.put(16, "cartButton");
            sparseArrayB.put(17, "cataloguePage");
            sparseArrayB.put(18, "clickHandler");
            sparseArrayB.put(19, "clickHandlers");
            sparseArrayB.put(20, "clickListener");
            sparseArrayB.put(21, "coachMark");
            sparseArrayB.put(22, "color");
            sparseArrayB.put(23, "colorName");
            sparseArrayB.put(24, "containerTitle");
            sparseArrayB.put(25, "cta");
            sparseArrayB.put(26, "ctaText");
            sparseArrayB.put(27, "data");
            sparseArrayB.put(28, lqlqqlq.mmm006Dm006Dm);
            sparseArrayB.put(29, "displayExpiryExtended");
            sparseArrayB.put(30, "displayName");
            sparseArrayB.put(31, "emptyState");
            sparseArrayB.put(32, "enableBoostAnimationContainerGap");
            sparseArrayB.put(33, "enabled");
            sparseArrayB.put(34, "errorState");
            sparseArrayB.put(35, "filter");
            sparseArrayB.put(36, "footer");
            sparseArrayB.put(37, "groupTitle");
            sparseArrayB.put(38, "handler");
            sparseArrayB.put(39, "hasUnreadMessages");
            sparseArrayB.put(40, "header");
            sparseArrayB.put(41, "headerIsClickable");
            sparseArrayB.put(42, "heightRes");
            sparseArrayB.put(43, "hostScreen");
            sparseArrayB.put(44, "htmlListener");
            sparseArrayB.put(45, "iconResId");
            sparseArrayB.put(46, "imageItem");
            sparseArrayB.put(47, "imageLoadListener");
            sparseArrayB.put(48, "imageLoaderListener");
            sparseArrayB.put(49, "importantForAccessibility");
            sparseArrayB.put(50, "index");
            sparseArrayB.put(51, "info");
            sparseArrayB.put(52, "infoSectionItem");
            sparseArrayB.put(53, "infoView");
            sparseArrayB.put(54, "inlineMessage");
            sparseArrayB.put(55, "isAccountNotificationBadgeShown");
            sparseArrayB.put(56, "isChecked");
            sparseArrayB.put(57, "isCtaInProgress");
            sparseArrayB.put(58, "isEnabled");
            sparseArrayB.put(59, "isExpandable");
            sparseArrayB.put(60, "isExpanded");
            sparseArrayB.put(61, "isLowerPriceYellow");
            sparseArrayB.put(62, "isMarketplace");
            sparseArrayB.put(63, "isNewBarcodeEnabled");
            sparseArrayB.put(64, "isPopup");
            sparseArrayB.put(65, "isRewardStyle");
            sparseArrayB.put(66, "isSelected");
            sparseArrayB.put(67, "isShoppingListBeingSaved");
            sparseArrayB.put(68, "isToggleInProgress");
            sparseArrayB.put(69, "isUnlocking");
            sparseArrayB.put(70, "isWatchlisted");
            sparseArrayB.put(71, "item");
            sparseArrayB.put(72, "itemClickListener");
            sparseArrayB.put(73, "itemData");
            sparseArrayB.put(74, "itemState");
            sparseArrayB.put(75, "itemWidthRes");
            sparseArrayB.put(76, AnnotatedPrivateKey.LABEL);
            sparseArrayB.put(77, "labelStyle");
            sparseArrayB.put(78, "linkHandler");
            sparseArrayB.put(79, "listIndex");
            sparseArrayB.put(80, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            sparseArrayB.put(81, "loadingMessage");
            sparseArrayB.put(82, "logoUrl");
            sparseArrayB.put(83, "lottieAutoPlay");
            sparseArrayB.put(84, "lottieBackgroundColor");
            sparseArrayB.put(85, "lottieLoop");
            sparseArrayB.put(86, "margins");
            sparseArrayB.put(87, "markdownContent");
            sparseArrayB.put(88, "memberPriceInfo");
            sparseArrayB.put(89, "message");
            sparseArrayB.put(90, "offerViewItem");
            sparseArrayB.put(91, "onBannerClick");
            sparseArrayB.put(92, "onClick");
            sparseArrayB.put(93, "onMaxLinesToggleListener");
            sparseArrayB.put(94, "onPointsBalanceClick");
            sparseArrayB.put(95, "onQueryTextChangeListener");
            sparseArrayB.put(96, "onQueryTextFocusChangeListener");
            sparseArrayB.put(97, "onQueryTextSubmitListener");
            sparseArrayB.put(98, "onSelected");
            sparseArrayB.put(99, "optionText");
            sparseArrayB.put(100, "paddingBottom");
            sparseArrayB.put(101, "pageItem");
            sparseArrayB.put(102, "postcode");
            sparseArrayB.put(103, "previewContent");
            sparseArrayB.put(104, "primaryButtonClickListener");
            sparseArrayB.put(105, "product");
            sparseArrayB.put(106, "productCard");
            sparseArrayB.put(107, "productCardConfig");
            sparseArrayB.put(108, "productConfig");
            sparseArrayB.put(109, "productData");
            sparseArrayB.put(110, "rewardsPointsBalance");
            sparseArrayB.put(111, "rewardsPointsBalanceData");
            sparseArrayB.put(112, "searchQueryHint");
            sparseArrayB.put(113, "section");
            sparseArrayB.put(114, "sectionTitle");
            sparseArrayB.put(115, "seller");
            sparseArrayB.put(116, "shoppingList");
            sparseArrayB.put(117, "showAddToListButton");
            sparseArrayB.put(118, "showBoostAnimation");
            sparseArrayB.put(119, "showError");
            sparseArrayB.put(120, "showNewDismissIcon");
            sparseArrayB.put(121, "showTigerDisplayExpiry");
            sparseArrayB.put(122, "showTigerOffersLabel");
            sparseArrayB.put(123, "singleLine");
            sparseArrayB.put(124, "state");
            sparseArrayB.put(125, "store");
            sparseArrayB.put(126, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(127, "title");
            sparseArrayB.put(128, "viewListener");
            sparseArrayB.put(129, "viewModel");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f7553a;

        static {
            HashMap map = new HashMap(17);
            f7553a = map;
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_delivery_unlimited, map, "layout/epoxy_item_delivery_unlimited_0", com.woolworths.R.layout.epoxy_item_delivery_unlimited_unavailable, "layout/epoxy_item_delivery_unlimited_unavailable_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_more_app_version, map, "layout/epoxy_item_more_app_version_0", com.woolworths.R.layout.epoxy_item_more_chat_to_us, "layout/epoxy_item_more_chat_to_us_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_more_delete_account, map, "layout/epoxy_item_more_delete_account_0", com.woolworths.R.layout.epoxy_item_more_explaining_value, "layout/epoxy_item_more_explaining_value_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_more_food_tracker, map, "layout/epoxy_item_more_food_tracker_0", com.woolworths.R.layout.epoxy_item_more_login_signup, "layout/epoxy_item_more_login_signup_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_more_notifications, map, "layout/epoxy_item_more_notifications_0", com.woolworths.R.layout.epoxy_item_more_online_shopping, "layout/epoxy_item_more_online_shopping_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_more_receipt_preferences, map, "layout/epoxy_item_more_receipt_preferences_0", com.woolworths.R.layout.epoxy_item_more_rewards_card, "layout/epoxy_item_more_rewards_card_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_more_rewards_card_old, map, "layout/epoxy_item_more_rewards_card_old_0", com.woolworths.R.layout.epoxy_item_more_tile, "layout/epoxy_item_more_tile_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_more_username, map, "layout/epoxy_item_more_username_0", com.woolworths.R.layout.epoxy_item_more_wifi, "layout/epoxy_item_more_wifi_0");
            map.put("layout/fragment_more_0", Integer.valueOf(com.woolworths.R.layout.fragment_more));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(17);
        f7552a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_delivery_unlimited, 1);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_delivery_unlimited_unavailable, 2);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_more_app_version, 3);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_more_chat_to_us, 4);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_more_delete_account, 5);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_more_explaining_value, 6);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_more_food_tracker, 7);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_more_login_signup, 8);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_more_notifications, 9);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_more_online_shopping, 10);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_more_receipt_preferences, 11);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_more_rewards_card, 12);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_more_rewards_card_old, 13);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_more_tile, 14);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_more_username, 15);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_more_wifi, 16);
        sparseIntArray.put(com.woolworths.R.layout.fragment_more, 17);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(8);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.base.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.base.shopapp.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.shop.ask.olive.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.shop.notification.preferences.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.shop.weblink.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.product.DataBinderMapperImpl());
        arrayList.add(new com.airbnb.epoxy.databinding.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f7552a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            switch (i2) {
                case 1:
                    if ("layout/epoxy_item_delivery_unlimited_0".equals(tag)) {
                        return new EpoxyItemDeliveryUnlimitedBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_delivery_unlimited is invalid. Received: "));
                case 2:
                    if ("layout/epoxy_item_delivery_unlimited_unavailable_0".equals(tag)) {
                        return new EpoxyItemDeliveryUnlimitedUnavailableBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_delivery_unlimited_unavailable is invalid. Received: "));
                case 3:
                    if (!"layout/epoxy_item_more_app_version_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_more_app_version is invalid. Received: "));
                    }
                    Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, EpoxyItemMoreAppVersionBindingImpl.B);
                    TextView textView = (TextView) objArrT[1];
                    EpoxyItemMoreAppVersionBindingImpl epoxyItemMoreAppVersionBindingImpl = new EpoxyItemMoreAppVersionBindingImpl(dataBindingComponent, view, textView);
                    epoxyItemMoreAppVersionBindingImpl.A = -1L;
                    epoxyItemMoreAppVersionBindingImpl.y.setTag(null);
                    ((ConstraintLayout) objArrT[0]).setTag(null);
                    epoxyItemMoreAppVersionBindingImpl.E(view);
                    epoxyItemMoreAppVersionBindingImpl.r();
                    return epoxyItemMoreAppVersionBindingImpl;
                case 4:
                    if ("layout/epoxy_item_more_chat_to_us_0".equals(tag)) {
                        return new EpoxyItemMoreChatToUsBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_more_chat_to_us is invalid. Received: "));
                case 5:
                    if ("layout/epoxy_item_more_delete_account_0".equals(tag)) {
                        return new EpoxyItemMoreDeleteAccountBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_more_delete_account is invalid. Received: "));
                case 6:
                    if ("layout/epoxy_item_more_explaining_value_0".equals(tag)) {
                        return new EpoxyItemMoreExplainingValueBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_more_explaining_value is invalid. Received: "));
                case 7:
                    if ("layout/epoxy_item_more_food_tracker_0".equals(tag)) {
                        return new EpoxyItemMoreFoodTrackerBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_more_food_tracker is invalid. Received: "));
                case 8:
                    if ("layout/epoxy_item_more_login_signup_0".equals(tag)) {
                        return new EpoxyItemMoreLoginSignupBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_more_login_signup is invalid. Received: "));
                case 9:
                    if ("layout/epoxy_item_more_notifications_0".equals(tag)) {
                        return new EpoxyItemMoreNotificationsBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_more_notifications is invalid. Received: "));
                case 10:
                    if ("layout/epoxy_item_more_online_shopping_0".equals(tag)) {
                        return new EpoxyItemMoreOnlineShoppingBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_more_online_shopping is invalid. Received: "));
                case 11:
                    if ("layout/epoxy_item_more_receipt_preferences_0".equals(tag)) {
                        return new EpoxyItemMoreReceiptPreferencesBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_more_receipt_preferences is invalid. Received: "));
                case 12:
                    if ("layout/epoxy_item_more_rewards_card_0".equals(tag)) {
                        return new EpoxyItemMoreRewardsCardBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_more_rewards_card is invalid. Received: "));
                case 13:
                    if ("layout/epoxy_item_more_rewards_card_old_0".equals(tag)) {
                        return new EpoxyItemMoreRewardsCardOldBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_more_rewards_card_old is invalid. Received: "));
                case 14:
                    if ("layout/epoxy_item_more_tile_0".equals(tag)) {
                        return new EpoxyItemMoreTileBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_more_tile is invalid. Received: "));
                case 15:
                    if (!"layout/epoxy_item_more_username_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_more_username is invalid. Received: "));
                    }
                    Object[] objArrT2 = ViewDataBinding.t(dataBindingComponent, view, 2, null, null);
                    EpoxyItemMoreUsernameBindingImpl epoxyItemMoreUsernameBindingImpl = new EpoxyItemMoreUsernameBindingImpl(dataBindingComponent, view, (TextView) objArrT2[1]);
                    epoxyItemMoreUsernameBindingImpl.A = -1L;
                    ((ConstraintLayout) objArrT2[0]).setTag(null);
                    epoxyItemMoreUsernameBindingImpl.y.setTag(null);
                    epoxyItemMoreUsernameBindingImpl.E(view);
                    epoxyItemMoreUsernameBindingImpl.r();
                    return epoxyItemMoreUsernameBindingImpl;
                case 16:
                    if ("layout/epoxy_item_more_wifi_0".equals(tag)) {
                        return new EpoxyItemMoreWifiBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_more_wifi is invalid. Received: "));
                case 17:
                    if ("layout/fragment_more_0".equals(tag)) {
                        return new FragmentMoreBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for fragment_more is invalid. Received: "));
            }
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f7552a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f7553a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
