package au.com.woolworths.feature.shop.notification.preferences;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.impl.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeBrandLabelBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.feature.shop.notification.preferences.databinding.ActivityShopNotificationPreferencesBindingImpl;
import au.com.woolworths.feature.shop.notification.preferences.databinding.EpoxyItemPreferenceNotificationTogglePreviewBindingImpl;
import au.com.woolworths.feature.shop.notification.preferences.databinding.EpoxyItemPreferenceTextBindingImpl;
import au.com.woolworths.feature.shop.notification.preferences.databinding.EpoxyItemPreferenceToggleBindingImpl;
import au.com.woolworths.feature.shop.notification.preferences.databinding.EpoxyItemPreferenceToggleGroupFooterBindingImpl;
import au.com.woolworths.feature.shop.notification.preferences.databinding.EpoxyItemPreferenceToggleGroupHeaderBindingImpl;
import au.com.woolworths.feature.shop.notification.preferences.databinding.FragmentShopNotificationPreferencesDetailsBindingImpl;
import com.airbnb.epoxy.EpoxyRecyclerView;
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
    public static final SparseIntArray f7888a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = a.b(103, 0, 1, "_all", "actionState");
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
            sparseArrayB.put(23, lqlqqlq.mmm006Dm006Dm);
            sparseArrayB.put(24, "displayExpiryExtended");
            sparseArrayB.put(25, "emptyState");
            sparseArrayB.put(26, "enableBoostAnimationContainerGap");
            sparseArrayB.put(27, "enabled");
            sparseArrayB.put(28, "errorState");
            sparseArrayB.put(29, "filter");
            sparseArrayB.put(30, "footer");
            sparseArrayB.put(31, "groupTitle");
            sparseArrayB.put(32, "handler");
            sparseArrayB.put(33, "header");
            sparseArrayB.put(34, "heightRes");
            sparseArrayB.put(35, "hostScreen");
            sparseArrayB.put(36, "htmlListener");
            sparseArrayB.put(37, "iconResId");
            sparseArrayB.put(38, "imageItem");
            sparseArrayB.put(39, "imageLoaderListener");
            sparseArrayB.put(40, "importantForAccessibility");
            sparseArrayB.put(41, "index");
            sparseArrayB.put(42, "info");
            sparseArrayB.put(43, "infoSectionItem");
            sparseArrayB.put(44, "inlineMessage");
            sparseArrayB.put(45, "isAccountNotificationBadgeShown");
            sparseArrayB.put(46, "isChecked");
            sparseArrayB.put(47, "isCtaInProgress");
            sparseArrayB.put(48, "isEnabled");
            sparseArrayB.put(49, "isLowerPriceYellow");
            sparseArrayB.put(50, "isMarketplace");
            sparseArrayB.put(51, "isPopup");
            sparseArrayB.put(52, "isRewardStyle");
            sparseArrayB.put(53, "isSelected");
            sparseArrayB.put(54, "isToggleInProgress");
            sparseArrayB.put(55, "isUnlocking");
            sparseArrayB.put(56, "isWatchlisted");
            sparseArrayB.put(57, "item");
            sparseArrayB.put(58, "itemWidthRes");
            sparseArrayB.put(59, AnnotatedPrivateKey.LABEL);
            sparseArrayB.put(60, "labelStyle");
            sparseArrayB.put(61, "linkHandler");
            sparseArrayB.put(62, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            sparseArrayB.put(63, "loadingMessage");
            sparseArrayB.put(64, "lottieAutoPlay");
            sparseArrayB.put(65, "lottieBackgroundColor");
            sparseArrayB.put(66, "lottieLoop");
            sparseArrayB.put(67, "margins");
            sparseArrayB.put(68, "markdownContent");
            sparseArrayB.put(69, "memberPriceInfo");
            sparseArrayB.put(70, "message");
            sparseArrayB.put(71, "offerViewItem");
            sparseArrayB.put(72, "onBannerClick");
            sparseArrayB.put(73, "onClick");
            sparseArrayB.put(74, "onPointsBalanceClick");
            sparseArrayB.put(75, "onQueryTextChangeListener");
            sparseArrayB.put(76, "onQueryTextFocusChangeListener");
            sparseArrayB.put(77, "onQueryTextSubmitListener");
            sparseArrayB.put(78, "optionText");
            sparseArrayB.put(79, "paddingBottom");
            sparseArrayB.put(80, "previewContent");
            sparseArrayB.put(81, "product");
            sparseArrayB.put(82, "productCard");
            sparseArrayB.put(83, "productCardConfig");
            sparseArrayB.put(84, "productConfig");
            sparseArrayB.put(85, "productData");
            sparseArrayB.put(86, "rewardsPointsBalance");
            sparseArrayB.put(87, "rewardsPointsBalanceData");
            sparseArrayB.put(88, "searchQueryHint");
            sparseArrayB.put(89, "section");
            sparseArrayB.put(90, "sectionTitle");
            sparseArrayB.put(91, "seller");
            sparseArrayB.put(92, "showAddToListButton");
            sparseArrayB.put(93, "showBoostAnimation");
            sparseArrayB.put(94, "showNewDismissIcon");
            sparseArrayB.put(95, "showTigerDisplayExpiry");
            sparseArrayB.put(96, "showTigerOffersLabel");
            sparseArrayB.put(97, "singleLine");
            sparseArrayB.put(98, "state");
            sparseArrayB.put(99, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(100, "title");
            sparseArrayB.put(101, "viewListener");
            sparseArrayB.put(102, "viewModel");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f7889a;

        static {
            HashMap map = new HashMap(7);
            f7889a = map;
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_shop_notification_preferences, map, "layout/activity_shop_notification_preferences_0", com.woolworths.R.layout.epoxy_item_preference_notification_toggle_preview, "layout/epoxy_item_preference_notification_toggle_preview_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_preference_text, map, "layout/epoxy_item_preference_text_0", com.woolworths.R.layout.epoxy_item_preference_toggle, "layout/epoxy_item_preference_toggle_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_preference_toggle_group_footer, map, "layout/epoxy_item_preference_toggle_group_footer_0", com.woolworths.R.layout.epoxy_item_preference_toggle_group_header, "layout/epoxy_item_preference_toggle_group_header_0");
            map.put("layout/fragment_shop_notification_preferences_details_0", Integer.valueOf(com.woolworths.R.layout.fragment_shop_notification_preferences_details));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(7);
        f7888a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.activity_shop_notification_preferences, 1);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_preference_notification_toggle_preview, 2);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_preference_text, 3);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_preference_toggle, 4);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_preference_toggle_group_footer, 5);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_preference_toggle_group_header, 6);
        sparseIntArray.put(com.woolworths.R.layout.fragment_shop_notification_preferences_details, 7);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.base.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.base.shopapp.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.shop.login.DataBinderMapperImpl());
        arrayList.add(new com.airbnb.epoxy.databinding.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f7888a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            switch (i2) {
                case 1:
                    if (!"layout/activity_shop_notification_preferences_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for activity_shop_notification_preferences is invalid. Received: "));
                    }
                    Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, null, ActivityShopNotificationPreferencesBindingImpl.A);
                    ActivityShopNotificationPreferencesBindingImpl activityShopNotificationPreferencesBindingImpl = new ActivityShopNotificationPreferencesBindingImpl(dataBindingComponent, view, (Toolbar) objArrT[2]);
                    activityShopNotificationPreferencesBindingImpl.z = -1L;
                    ((ConstraintLayout) objArrT[0]).setTag(null);
                    activityShopNotificationPreferencesBindingImpl.E(view);
                    activityShopNotificationPreferencesBindingImpl.r();
                    return activityShopNotificationPreferencesBindingImpl;
                case 2:
                    if (!"layout/epoxy_item_preference_notification_toggle_preview_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_preference_notification_toggle_preview is invalid. Received: "));
                    }
                    Object[] objArrT2 = ViewDataBinding.t(dataBindingComponent, view, 4, EpoxyItemPreferenceNotificationTogglePreviewBindingImpl.E, null);
                    EpoxyItemPreferenceNotificationTogglePreviewBindingImpl epoxyItemPreferenceNotificationTogglePreviewBindingImpl = new EpoxyItemPreferenceNotificationTogglePreviewBindingImpl(dataBindingComponent, view, (IncludeBrandLabelBinding) objArrT2[3], (TextView) objArrT2[2], (ImageView) objArrT2[1]);
                    epoxyItemPreferenceNotificationTogglePreviewBindingImpl.D = -1L;
                    IncludeBrandLabelBinding includeBrandLabelBinding = epoxyItemPreferenceNotificationTogglePreviewBindingImpl.y;
                    if (includeBrandLabelBinding != null) {
                        includeBrandLabelBinding.n = epoxyItemPreferenceNotificationTogglePreviewBindingImpl;
                    }
                    epoxyItemPreferenceNotificationTogglePreviewBindingImpl.z.setTag(null);
                    ((ConstraintLayout) objArrT2[0]).setTag(null);
                    epoxyItemPreferenceNotificationTogglePreviewBindingImpl.A.setTag(null);
                    epoxyItemPreferenceNotificationTogglePreviewBindingImpl.E(view);
                    epoxyItemPreferenceNotificationTogglePreviewBindingImpl.r();
                    return epoxyItemPreferenceNotificationTogglePreviewBindingImpl;
                case 3:
                    if ("layout/epoxy_item_preference_text_0".equals(tag)) {
                        return new EpoxyItemPreferenceTextBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_preference_text is invalid. Received: "));
                case 4:
                    if ("layout/epoxy_item_preference_toggle_0".equals(tag)) {
                        return new EpoxyItemPreferenceToggleBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_preference_toggle is invalid. Received: "));
                case 5:
                    if (!"layout/epoxy_item_preference_toggle_group_footer_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_preference_toggle_group_footer is invalid. Received: "));
                    }
                    Object[] objArrT3 = ViewDataBinding.t(dataBindingComponent, view, 2, null, null);
                    EpoxyItemPreferenceToggleGroupFooterBindingImpl epoxyItemPreferenceToggleGroupFooterBindingImpl = new EpoxyItemPreferenceToggleGroupFooterBindingImpl(dataBindingComponent, view, (TextView) objArrT3[1]);
                    epoxyItemPreferenceToggleGroupFooterBindingImpl.A = -1L;
                    epoxyItemPreferenceToggleGroupFooterBindingImpl.y.setTag(null);
                    ((ConstraintLayout) objArrT3[0]).setTag(null);
                    epoxyItemPreferenceToggleGroupFooterBindingImpl.E(view);
                    epoxyItemPreferenceToggleGroupFooterBindingImpl.r();
                    return epoxyItemPreferenceToggleGroupFooterBindingImpl;
                case 6:
                    if (!"layout/epoxy_item_preference_toggle_group_header_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_preference_toggle_group_header is invalid. Received: "));
                    }
                    Object[] objArrT4 = ViewDataBinding.t(dataBindingComponent, view, 3, null, null);
                    EpoxyItemPreferenceToggleGroupHeaderBindingImpl epoxyItemPreferenceToggleGroupHeaderBindingImpl = new EpoxyItemPreferenceToggleGroupHeaderBindingImpl(dataBindingComponent, view, (TextView) objArrT4[2], (TextView) objArrT4[1]);
                    epoxyItemPreferenceToggleGroupHeaderBindingImpl.D = -1L;
                    epoxyItemPreferenceToggleGroupHeaderBindingImpl.y.setTag(null);
                    epoxyItemPreferenceToggleGroupHeaderBindingImpl.z.setTag(null);
                    ((ConstraintLayout) objArrT4[0]).setTag(null);
                    epoxyItemPreferenceToggleGroupHeaderBindingImpl.E(view);
                    epoxyItemPreferenceToggleGroupHeaderBindingImpl.r();
                    return epoxyItemPreferenceToggleGroupHeaderBindingImpl;
                case 7:
                    if (!"layout/fragment_shop_notification_preferences_details_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for fragment_shop_notification_preferences_details is invalid. Received: "));
                    }
                    Object[] objArrT5 = ViewDataBinding.t(dataBindingComponent, view, 4, FragmentShopNotificationPreferencesDetailsBindingImpl.F, null);
                    FragmentShopNotificationPreferencesDetailsBindingImpl fragmentShopNotificationPreferencesDetailsBindingImpl = new FragmentShopNotificationPreferencesDetailsBindingImpl(dataBindingComponent, view, (ConstraintLayout) objArrT5[0], (IncludeGenericErrorStateBinding) objArrT5[3], (ContentLoadingProgressBar) objArrT5[2], (EpoxyRecyclerView) objArrT5[1]);
                    fragmentShopNotificationPreferencesDetailsBindingImpl.E = -1L;
                    fragmentShopNotificationPreferencesDetailsBindingImpl.y.setTag(null);
                    IncludeGenericErrorStateBinding includeGenericErrorStateBinding = fragmentShopNotificationPreferencesDetailsBindingImpl.z;
                    if (includeGenericErrorStateBinding != null) {
                        includeGenericErrorStateBinding.n = fragmentShopNotificationPreferencesDetailsBindingImpl;
                    }
                    fragmentShopNotificationPreferencesDetailsBindingImpl.A.setTag(null);
                    fragmentShopNotificationPreferencesDetailsBindingImpl.B.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, fragmentShopNotificationPreferencesDetailsBindingImpl);
                    fragmentShopNotificationPreferencesDetailsBindingImpl.r();
                    return fragmentShopNotificationPreferencesDetailsBindingImpl;
            }
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f7888a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f7889a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
