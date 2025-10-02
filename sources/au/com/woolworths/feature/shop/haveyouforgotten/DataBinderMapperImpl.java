package au.com.woolworths.feature.shop.haveyouforgotten;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.models.notification.NotificationResult;
import au.com.woolworths.feature.shop.haveyouforgotten.databinding.ActivityHaveYouForgottenBindingImpl;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f7147a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = au.com.woolworths.android.onesite.a.b(187, 0, 1, "_all", "actionState");
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
            sparseArrayB.put(51, "errorState");
            sparseArrayB.put(52, "eventHandler");
            sparseArrayB.put(53, "filter");
            sparseArrayB.put(54, "filterMenuItem");
            sparseArrayB.put(55, "filterOption");
            sparseArrayB.put(56, "filterOptionClickListener");
            sparseArrayB.put(57, "footer");
            sparseArrayB.put(58, "fulfilmentWindow");
            sparseArrayB.put(59, "fulfilmentWindows");
            sparseArrayB.put(60, "fulfilmentWindowsOption");
            sparseArrayB.put(61, "fulfilmentWindowsSlot");
            sparseArrayB.put(62, "groupTitle");
            sparseArrayB.put(63, "handler");
            sparseArrayB.put(64, "header");
            sparseArrayB.put(65, "heightRes");
            sparseArrayB.put(66, "hostScreen");
            sparseArrayB.put(67, "hostViewListener");
            sparseArrayB.put(68, "htmlListener");
            sparseArrayB.put(69, "iconResId");
            sparseArrayB.put(70, "imageItem");
            sparseArrayB.put(71, "imageLoadListener");
            sparseArrayB.put(72, "imageLoaderListener");
            sparseArrayB.put(73, "importantForAccessibility");
            sparseArrayB.put(74, "inMappedStore");
            sparseArrayB.put(75, "index");
            sparseArrayB.put(76, "info");
            sparseArrayB.put(77, "infoSectionItem");
            sparseArrayB.put(78, "infoView");
            sparseArrayB.put(79, "inlineMessage");
            sparseArrayB.put(80, "insetBanner");
            sparseArrayB.put(81, "isAccountNotificationBadgeShown");
            sparseArrayB.put(82, "isButtonEnabled");
            sparseArrayB.put(83, "isChecked");
            sparseArrayB.put(84, "isComposeContentViewEnabled");
            sparseArrayB.put(85, "isCtaInProgress");
            sparseArrayB.put(86, "isEdited");
            sparseArrayB.put(87, "isEnabled");
            sparseArrayB.put(88, "isInSnGSession");
            sparseArrayB.put(89, "isLoading");
            sparseArrayB.put(90, "isLowerPriceYellow");
            sparseArrayB.put(91, "isMarketplace");
            sparseArrayB.put(92, "isPopup");
            sparseArrayB.put(93, "isRewardStyle");
            sparseArrayB.put(94, "isSelected");
            sparseArrayB.put(95, "isShoppingListBeingSaved");
            sparseArrayB.put(96, "isToggleInProgress");
            sparseArrayB.put(97, "isUnlocking");
            sparseArrayB.put(98, "isWatchlist");
            sparseArrayB.put(99, "isWatchlisted");
            sparseArrayB.put(100, "item");
            sparseArrayB.put(101, "itemClickListener");
            sparseArrayB.put(102, "itemState");
            sparseArrayB.put(103, "itemWidthRes");
            sparseArrayB.put(104, AnnotatedPrivateKey.LABEL);
            sparseArrayB.put(105, "labelStyle");
            sparseArrayB.put(106, "lightTheme");
            sparseArrayB.put(107, "linkHandler");
            sparseArrayB.put(108, "listId");
            sparseArrayB.put(109, "listIndex");
            sparseArrayB.put(110, "listViewModel");
            sparseArrayB.put(111, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            sparseArrayB.put(112, "loadingMessage");
            sparseArrayB.put(113, "lottieAutoPlay");
            sparseArrayB.put(114, "lottieBackgroundColor");
            sparseArrayB.put(115, "lottieLoop");
            sparseArrayB.put(116, "margins");
            sparseArrayB.put(117, "markdownContent");
            sparseArrayB.put(118, "marketSellerGroup");
            sparseArrayB.put(119, "marketplace");
            sparseArrayB.put(120, "memberPriceInfo");
            sparseArrayB.put(121, "message");
            sparseArrayB.put(122, "mode");
            sparseArrayB.put(123, "offerViewItem");
            sparseArrayB.put(124, "onBannerClick");
            sparseArrayB.put(125, "onClick");
            sparseArrayB.put(126, "onMaxLinesToggleListener");
            sparseArrayB.put(127, "onPointsBalanceClick");
            sparseArrayB.put(128, "onQueryTextChangeListener");
            sparseArrayB.put(129, "onQueryTextFocusChangeListener");
            sparseArrayB.put(130, "onQueryTextSubmitListener");
            sparseArrayB.put(131, "onSelected");
            sparseArrayB.put(132, "optionText");
            sparseArrayB.put(133, "orderTotalDetails");
            sparseArrayB.put(134, "packagingMethodOption");
            sparseArrayB.put(135, "paddingBottom");
            sparseArrayB.put(136, "pageItem");
            sparseArrayB.put(137, "postcode");
            sparseArrayB.put(138, "previewContent");
            sparseArrayB.put(139, "primaryButtonClickListener");
            sparseArrayB.put(140, "product");
            sparseArrayB.put(141, "productCard");
            sparseArrayB.put(142, "productCardButtonsState");
            sparseArrayB.put(143, "productCardConfig");
            sparseArrayB.put(144, "productConfig");
            sparseArrayB.put(145, "productData");
            sparseArrayB.put(146, "quantity");
            sparseArrayB.put(147, "queryTextFocusChangeListener");
            sparseArrayB.put(148, "rewardsPointsBalance");
            sparseArrayB.put(149, "rewardsPointsBalanceData");
            sparseArrayB.put(150, "rewardsRegistered");
            sparseArrayB.put(151, "rewardsRegisteredRedeemable");
            sparseArrayB.put(152, "rewardsUnregistered");
            sparseArrayB.put(153, "searchQueryHint");
            sparseArrayB.put(154, "section");
            sparseArrayB.put(ModuleDescriptor.MODULE_VERSION, "sectionHeader");
            sparseArrayB.put(156, "sectionTitle");
            sparseArrayB.put(157, "seller");
            sparseArrayB.put(158, "sellerName");
            sparseArrayB.put(159, "shoppingList");
            sparseArrayB.put(160, "shouldHideToolbar");
            sparseArrayB.put(161, "shouldShowLoadingState");
            sparseArrayB.put(162, "shouldShowNewBadge");
            sparseArrayB.put(163, "shouldShowNotificationDot");
            sparseArrayB.put(164, "shouldShowWebArrow");
            sparseArrayB.put(165, "showAddToListButton");
            sparseArrayB.put(166, "showBoostAnimation");
            sparseArrayB.put(167, "showCheckedItems");
            sparseArrayB.put(168, "showDisabledState");
            sparseArrayB.put(169, "showLoadingView");
            sparseArrayB.put(170, "showNewDismissIcon");
            sparseArrayB.put(171, "showTigerDisplayExpiry");
            sparseArrayB.put(172, "showTigerOffersLabel");
            sparseArrayB.put(173, "singleLine");
            sparseArrayB.put(174, "sortByViewListener");
            sparseArrayB.put(175, "sortOption");
            sparseArrayB.put(176, "sortOptionClickListener");
            sparseArrayB.put(177, "state");
            sparseArrayB.put(178, "store");
            sparseArrayB.put(179, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(SubsamplingScaleImageView.ORIENTATION_180, "title");
            sparseArrayB.put(181, "topMarginRes");
            sparseArrayB.put(182, "viewListener");
            sparseArrayB.put(183, "viewModel");
            sparseArrayB.put(184, "viewState");
            sparseArrayB.put(185, "vocViewModel");
            sparseArrayB.put(186, "windowSubheader");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f7148a;

        static {
            HashMap map = new HashMap(1);
            f7148a = map;
            map.put("layout/activity_have_you_forgotten_0", Integer.valueOf(com.woolworths.R.layout.activity_have_you_forgotten));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        f7147a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.activity_have_you_forgotten, 1);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.base.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.base.shopapp.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.product.list.legacy.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.rewards.offers.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.foundation.shop.bottomsheet.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.product.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shop.addtolist.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shop.cart.DataBinderMapperImpl());
        arrayList.add(new com.airbnb.epoxy.databinding.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f7147a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            if (i2 == 1) {
                if (!"layout/activity_have_you_forgotten_0".equals(tag)) {
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for activity_have_you_forgotten is invalid. Received: "));
                }
                Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 6, null, ActivityHaveYouForgottenBindingImpl.D);
                ActivityHaveYouForgottenBindingImpl activityHaveYouForgottenBindingImpl = new ActivityHaveYouForgottenBindingImpl(dataBindingComponent, view, (ComposeView) objArrT[5], (FrameLayout) objArrT[4], (View) objArrT[1], (Toolbar) objArrT[3]);
                activityHaveYouForgottenBindingImpl.C = -1L;
                ((ConstraintLayout) objArrT[0]).setTag(null);
                activityHaveYouForgottenBindingImpl.A.setTag(null);
                activityHaveYouForgottenBindingImpl.E(view);
                activityHaveYouForgottenBindingImpl.r();
                return activityHaveYouForgottenBindingImpl;
            }
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f7147a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f7148a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
