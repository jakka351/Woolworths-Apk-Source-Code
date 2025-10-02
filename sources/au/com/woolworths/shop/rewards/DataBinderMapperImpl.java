package au.com.woolworths.shop.rewards;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.rewards.databinding.ActivityRewardsBindingImpl;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes4.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f12883a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = au.com.woolworths.android.onesite.a.b(76, 0, 1, "_all", UrlHandler.ACTION);
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
            sparseArrayB.put(33, "isLoading");
            sparseArrayB.put(34, "isLowerPriceYellow");
            sparseArrayB.put(35, "isRewardStyle");
            sparseArrayB.put(36, "isSelected");
            sparseArrayB.put(37, "isUnlocking");
            sparseArrayB.put(38, "item");
            sparseArrayB.put(39, "itemWidthRes");
            sparseArrayB.put(40, AnnotatedPrivateKey.LABEL);
            sparseArrayB.put(41, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            sparseArrayB.put(42, "loadingMessage");
            sparseArrayB.put(43, "lottieAutoPlay");
            sparseArrayB.put(44, "lottieBackgroundColor");
            sparseArrayB.put(45, "lottieLoop");
            sparseArrayB.put(46, "margins");
            sparseArrayB.put(47, "message");
            sparseArrayB.put(48, "offerViewItem");
            sparseArrayB.put(49, "onBannerClick");
            sparseArrayB.put(50, "onClick");
            sparseArrayB.put(51, "onPointsBalanceClick");
            sparseArrayB.put(52, "onQueryTextChangeListener");
            sparseArrayB.put(53, "onQueryTextFocusChangeListener");
            sparseArrayB.put(54, "onQueryTextSubmitListener");
            sparseArrayB.put(55, "option");
            sparseArrayB.put(56, "paddingBottom");
            sparseArrayB.put(57, "redemptionSettings");
            sparseArrayB.put(58, "rewardsPointsBalance");
            sparseArrayB.put(59, "rewardsPointsBalanceData");
            sparseArrayB.put(60, "searchQueryHint");
            sparseArrayB.put(61, "section");
            sparseArrayB.put(62, "sectionTitle");
            sparseArrayB.put(63, "shouldHideToolbar");
            sparseArrayB.put(64, "shouldShowLoadingState");
            sparseArrayB.put(65, "shouldShowNewBadge");
            sparseArrayB.put(66, "shouldShowNotificationDot");
            sparseArrayB.put(67, "shouldShowWebArrow");
            sparseArrayB.put(68, "showError");
            sparseArrayB.put(69, "showNewDismissIcon");
            sparseArrayB.put(70, "state");
            sparseArrayB.put(71, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(72, "title");
            sparseArrayB.put(73, "viewListener");
            sparseArrayB.put(74, "viewModel");
            sparseArrayB.put(75, "viewState");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f12884a;

        static {
            HashMap map = new HashMap(1);
            f12884a = map;
            map.put("layout/activity_rewards_0", Integer.valueOf(com.woolworths.R.layout.activity_rewards));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        f12883a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.activity_rewards, 1);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.base.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.base.shopapp.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.rewards.account.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.rewards.offers.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.shop.foryou.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.rewards.base.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f12883a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i2 != 1) {
            return null;
        }
        if ("layout/activity_rewards_0".equals(tag)) {
            return new ActivityRewardsBindingImpl(dataBindingComponent, view);
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for activity_rewards is invalid. Received: "));
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f12883a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f12884a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
