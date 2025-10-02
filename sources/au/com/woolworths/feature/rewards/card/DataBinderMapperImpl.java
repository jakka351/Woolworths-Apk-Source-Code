package au.com.woolworths.feature.rewards.card;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.camera.core.impl.b;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.feature.rewards.card.databinding.FragmentRewardsCardOutageBottomSheetBindingImpl;
import au.com.woolworths.feature.rewards.card.databinding.FragmentUnlockChristmasFundsBottomSheetBindingImpl;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f5815a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = a.b(64, 0, 1, "_all", "actionState");
            sparseArrayB.put(2, "asset");
            sparseArrayB.put(3, "backgroundColor");
            sparseArrayB.put(4, "banner");
            sparseArrayB.put(5, "bannerState");
            sparseArrayB.put(6, "brandLabel");
            sparseArrayB.put(7, "buttonText");
            sparseArrayB.put(8, "buttonTint");
            sparseArrayB.put(9, "clickHandler");
            sparseArrayB.put(10, "clickHandlers");
            sparseArrayB.put(11, "clickListener");
            sparseArrayB.put(12, "coachMark");
            sparseArrayB.put(13, "ctaText");
            sparseArrayB.put(14, "data");
            sparseArrayB.put(15, "emptyState");
            sparseArrayB.put(16, "enabled");
            sparseArrayB.put(17, "errorState");
            sparseArrayB.put(18, "filter");
            sparseArrayB.put(19, "groupTitle");
            sparseArrayB.put(20, "handler");
            sparseArrayB.put(21, "heightRes");
            sparseArrayB.put(22, "imageLoaderListener");
            sparseArrayB.put(23, "importantForAccessibility");
            sparseArrayB.put(24, "index");
            sparseArrayB.put(25, "infoSectionItem");
            sparseArrayB.put(26, "inlineMessage");
            sparseArrayB.put(27, "isAccountNotificationBadgeShown");
            sparseArrayB.put(28, "isChecked");
            sparseArrayB.put(29, "isCtaInProgress");
            sparseArrayB.put(30, "isEnabled");
            sparseArrayB.put(31, "isLowerPriceYellow");
            sparseArrayB.put(32, "isRewardStyle");
            sparseArrayB.put(33, "isSelected");
            sparseArrayB.put(34, "isUnlocking");
            sparseArrayB.put(35, "item");
            sparseArrayB.put(36, "itemWidthRes");
            sparseArrayB.put(37, AnnotatedPrivateKey.LABEL);
            sparseArrayB.put(38, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            sparseArrayB.put(39, "loadingMessage");
            sparseArrayB.put(40, "lottieAutoPlay");
            sparseArrayB.put(41, "lottieBackgroundColor");
            sparseArrayB.put(42, "lottieLoop");
            sparseArrayB.put(43, "margins");
            sparseArrayB.put(44, "offerViewItem");
            sparseArrayB.put(45, "onBannerClick");
            sparseArrayB.put(46, "onClick");
            sparseArrayB.put(47, "onPointsBalanceClick");
            sparseArrayB.put(48, "onQueryTextChangeListener");
            sparseArrayB.put(49, "onQueryTextFocusChangeListener");
            sparseArrayB.put(50, "onQueryTextSubmitListener");
            sparseArrayB.put(51, "paddingBottom");
            sparseArrayB.put(52, "rewardsPointsBalance");
            sparseArrayB.put(53, "rewardsPointsBalanceData");
            sparseArrayB.put(54, "searchQueryHint");
            sparseArrayB.put(55, "section");
            sparseArrayB.put(56, "sectionTitle");
            sparseArrayB.put(57, "showError");
            sparseArrayB.put(58, "showNewDismissIcon");
            sparseArrayB.put(59, "state");
            sparseArrayB.put(60, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(61, "title");
            sparseArrayB.put(62, "viewListener");
            sparseArrayB.put(63, "viewModel");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f5816a;

        static {
            HashMap map = new HashMap(2);
            f5816a = map;
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.fragment_rewards_card_outage_bottom_sheet, map, "layout/fragment_rewards_card_outage_bottom_sheet_0", com.woolworths.R.layout.fragment_unlock_christmas_funds_bottom_sheet, "layout/fragment_unlock_christmas_funds_bottom_sheet_0");
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(2);
        f5815a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.fragment_rewards_card_outage_bottom_sheet, 1);
        sparseIntArray.put(com.woolworths.R.layout.fragment_unlock_christmas_funds_bottom_sheet, 2);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.base.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.base.wallet.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.rewards.offers.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.foundation.barcode.ui.view.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.rewards.base.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shared.ui.views.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f5815a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i2 == 1) {
            if ("layout/fragment_rewards_card_outage_bottom_sheet_0".equals(tag)) {
                return new FragmentRewardsCardOutageBottomSheetBindingImpl(dataBindingComponent, view);
            }
            throw new IllegalArgumentException(b.m(tag, "The tag for fragment_rewards_card_outage_bottom_sheet is invalid. Received: "));
        }
        if (i2 != 2) {
            return null;
        }
        if ("layout/fragment_unlock_christmas_funds_bottom_sheet_0".equals(tag)) {
            return new FragmentUnlockChristmasFundsBottomSheetBindingImpl(dataBindingComponent, view);
        }
        throw new IllegalArgumentException(b.m(tag, "The tag for fragment_unlock_christmas_funds_bottom_sheet is invalid. Received: "));
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f5815a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f5816a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
