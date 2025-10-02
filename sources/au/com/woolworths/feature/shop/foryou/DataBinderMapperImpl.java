package au.com.woolworths.feature.shop.foryou;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.camera.core.impl.b;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.feature.shop.foryou.databinding.ActivityRewardsSettingsBindingImpl;
import au.com.woolworths.feature.shop.foryou.databinding.EpoxyItemRewardsSettingsBindingImpl;
import au.com.woolworths.feature.shop.foryou.databinding.FragmentRewardsBoostersBindingImpl;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f7131a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = a.b(69, 0, 1, "_all", UrlHandler.ACTION);
            sparseArrayB.put(2, "actionState");
            sparseArrayB.put(3, "asset");
            sparseArrayB.put(4, "backgroundColor");
            sparseArrayB.put(5, "banner");
            sparseArrayB.put(6, "bannerState");
            sparseArrayB.put(7, "brandLabel");
            sparseArrayB.put(8, "buttonText");
            sparseArrayB.put(9, "buttonTint");
            sparseArrayB.put(10, "clickHandler");
            sparseArrayB.put(11, "clickHandlers");
            sparseArrayB.put(12, "clickListener");
            sparseArrayB.put(13, "coachMark");
            sparseArrayB.put(14, "ctaText");
            sparseArrayB.put(15, "data");
            sparseArrayB.put(16, "emptyState");
            sparseArrayB.put(17, "enabled");
            sparseArrayB.put(18, "errorState");
            sparseArrayB.put(19, "filter");
            sparseArrayB.put(20, "groupTitle");
            sparseArrayB.put(21, "handler");
            sparseArrayB.put(22, "heightRes");
            sparseArrayB.put(23, "imageLoaderListener");
            sparseArrayB.put(24, "importantForAccessibility");
            sparseArrayB.put(25, "index");
            sparseArrayB.put(26, "infoSectionItem");
            sparseArrayB.put(27, "inlineMessage");
            sparseArrayB.put(28, "isAccountNotificationBadgeShown");
            sparseArrayB.put(29, "isBeingChangedTo");
            sparseArrayB.put(30, "isChecked");
            sparseArrayB.put(31, "isCtaInProgress");
            sparseArrayB.put(32, "isEnabled");
            sparseArrayB.put(33, "isLowerPriceYellow");
            sparseArrayB.put(34, "isRewardStyle");
            sparseArrayB.put(35, "isSelected");
            sparseArrayB.put(36, "isUnlocking");
            sparseArrayB.put(37, "item");
            sparseArrayB.put(38, "itemWidthRes");
            sparseArrayB.put(39, AnnotatedPrivateKey.LABEL);
            sparseArrayB.put(40, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            sparseArrayB.put(41, "loadingMessage");
            sparseArrayB.put(42, "lottieAutoPlay");
            sparseArrayB.put(43, "lottieBackgroundColor");
            sparseArrayB.put(44, "lottieLoop");
            sparseArrayB.put(45, "margins");
            sparseArrayB.put(46, "message");
            sparseArrayB.put(47, "offerViewItem");
            sparseArrayB.put(48, "onBannerClick");
            sparseArrayB.put(49, "onClick");
            sparseArrayB.put(50, "onPointsBalanceClick");
            sparseArrayB.put(51, "onQueryTextChangeListener");
            sparseArrayB.put(52, "onQueryTextFocusChangeListener");
            sparseArrayB.put(53, "onQueryTextSubmitListener");
            sparseArrayB.put(54, "option");
            sparseArrayB.put(55, "paddingBottom");
            sparseArrayB.put(56, "redemptionSettings");
            sparseArrayB.put(57, "rewardsPointsBalance");
            sparseArrayB.put(58, "rewardsPointsBalanceData");
            sparseArrayB.put(59, "searchQueryHint");
            sparseArrayB.put(60, "section");
            sparseArrayB.put(61, "sectionTitle");
            sparseArrayB.put(62, "showError");
            sparseArrayB.put(63, "showNewDismissIcon");
            sparseArrayB.put(64, "state");
            sparseArrayB.put(65, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(66, "title");
            sparseArrayB.put(67, "viewListener");
            sparseArrayB.put(68, "viewModel");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f7132a;

        static {
            HashMap map = new HashMap(3);
            f7132a = map;
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_rewards_settings, map, "layout/activity_rewards_settings_0", com.woolworths.R.layout.epoxy_item_rewards_settings, "layout/epoxy_item_rewards_settings_0");
            map.put("layout/fragment_rewards_boosters_0", Integer.valueOf(com.woolworths.R.layout.fragment_rewards_boosters));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(3);
        f7131a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.activity_rewards_settings, 1);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_rewards_settings, 2);
        sparseIntArray.put(com.woolworths.R.layout.fragment_rewards_boosters, 3);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.base.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.rewards.card.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.rewards.offers.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.rewards.redemptionsettings.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.rewards.base.DataBinderMapperImpl());
        arrayList.add(new com.airbnb.epoxy.databinding.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f7131a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i2 == 1) {
            if ("layout/activity_rewards_settings_0".equals(tag)) {
                return new ActivityRewardsSettingsBindingImpl(dataBindingComponent, view);
            }
            throw new IllegalArgumentException(b.m(tag, "The tag for activity_rewards_settings is invalid. Received: "));
        }
        if (i2 == 2) {
            if ("layout/epoxy_item_rewards_settings_0".equals(tag)) {
                return new EpoxyItemRewardsSettingsBindingImpl(dataBindingComponent, view);
            }
            throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_rewards_settings is invalid. Received: "));
        }
        if (i2 != 3) {
            return null;
        }
        if ("layout/fragment_rewards_boosters_0".equals(tag)) {
            return new FragmentRewardsBoostersBindingImpl(dataBindingComponent, view);
        }
        throw new IllegalArgumentException(b.m(tag, "The tag for fragment_rewards_boosters is invalid. Received: "));
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f7131a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f7132a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
