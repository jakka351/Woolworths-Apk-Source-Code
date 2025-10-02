package au.com.woolworths.feature.rewards.redemptionsettings;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.rewards.redemptionsettings.databinding.ActivityRewardsRedemptionSettingsBindingImpl;
import au.com.woolworths.feature.rewards.redemptionsettings.databinding.EpoxyItemRedemptionActionBindingImpl;
import au.com.woolworths.feature.rewards.redemptionsettings.databinding.EpoxyItemRedemptionActionsListTitleBindingImpl;
import au.com.woolworths.feature.rewards.redemptionsettings.databinding.EpoxyItemRedemptionSettingsBindingImpl;
import au.com.woolworths.feature.rewards.redemptionsettings.databinding.FragmentRedemptionSettingsBindingImpl;
import au.com.woolworths.feature.rewards.redemptionsettings.databinding.FragmentRedemptionSettingsBottomSheetBindingImpl;
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
    public static final SparseIntArray f6422a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = au.com.woolworths.android.onesite.a.b(53, 0, 1, "_all", UrlHandler.ACTION);
            sparseArrayB.put(2, "actionState");
            sparseArrayB.put(3, "asset");
            sparseArrayB.put(4, "backgroundColor");
            sparseArrayB.put(5, "bannerState");
            sparseArrayB.put(6, "brandLabel");
            sparseArrayB.put(7, "buttonText");
            sparseArrayB.put(8, "buttonTint");
            sparseArrayB.put(9, "clickHandler");
            sparseArrayB.put(10, "clickHandlers");
            sparseArrayB.put(11, "clickListener");
            sparseArrayB.put(12, "coachMark");
            sparseArrayB.put(13, "data");
            sparseArrayB.put(14, "enabled");
            sparseArrayB.put(15, "errorState");
            sparseArrayB.put(16, "handler");
            sparseArrayB.put(17, "heightRes");
            sparseArrayB.put(18, "imageLoaderListener");
            sparseArrayB.put(19, "importantForAccessibility");
            sparseArrayB.put(20, "index");
            sparseArrayB.put(21, "infoSectionItem");
            sparseArrayB.put(22, "inlineMessage");
            sparseArrayB.put(23, "isAccountNotificationBadgeShown");
            sparseArrayB.put(24, "isBeingChangedTo");
            sparseArrayB.put(25, "isChecked");
            sparseArrayB.put(26, "isEnabled");
            sparseArrayB.put(27, "isLowerPriceYellow");
            sparseArrayB.put(28, "isRewardStyle");
            sparseArrayB.put(29, "isUnlocking");
            sparseArrayB.put(30, "itemWidthRes");
            sparseArrayB.put(31, AnnotatedPrivateKey.LABEL);
            sparseArrayB.put(32, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            sparseArrayB.put(33, "loadingMessage");
            sparseArrayB.put(34, "lottieAutoPlay");
            sparseArrayB.put(35, "lottieBackgroundColor");
            sparseArrayB.put(36, "lottieLoop");
            sparseArrayB.put(37, "margins");
            sparseArrayB.put(38, "onPointsBalanceClick");
            sparseArrayB.put(39, "onQueryTextChangeListener");
            sparseArrayB.put(40, "onQueryTextFocusChangeListener");
            sparseArrayB.put(41, "onQueryTextSubmitListener");
            sparseArrayB.put(42, "redemptionSettings");
            sparseArrayB.put(43, "rewardsPointsBalance");
            sparseArrayB.put(44, "rewardsPointsBalanceData");
            sparseArrayB.put(45, "searchQueryHint");
            sparseArrayB.put(46, "sectionTitle");
            sparseArrayB.put(47, "showNewDismissIcon");
            sparseArrayB.put(48, "state");
            sparseArrayB.put(49, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(50, "title");
            sparseArrayB.put(51, "viewListener");
            sparseArrayB.put(52, "viewModel");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f6423a;

        static {
            HashMap map = new HashMap(6);
            f6423a = map;
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_rewards_redemption_settings, map, "layout/activity_rewards_redemption_settings_0", com.woolworths.R.layout.epoxy_item_redemption_action, "layout/epoxy_item_redemption_action_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_redemption_actions_list_title, map, "layout/epoxy_item_redemption_actions_list_title_0", com.woolworths.R.layout.epoxy_item_redemption_settings, "layout/epoxy_item_redemption_settings_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.fragment_redemption_settings, map, "layout/fragment_redemption_settings_0", com.woolworths.R.layout.fragment_redemption_settings_bottom_sheet, "layout/fragment_redemption_settings_bottom_sheet_0");
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(6);
        f6422a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.activity_rewards_redemption_settings, 1);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_redemption_action, 2);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_redemption_actions_list_title, 3);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_redemption_settings, 4);
        sparseIntArray.put(com.woolworths.R.layout.fragment_redemption_settings, 5);
        sparseIntArray.put(com.woolworths.R.layout.fragment_redemption_settings_bottom_sheet, 6);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.base.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.rewards.base.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shared.ui.views.DataBinderMapperImpl());
        arrayList.add(new com.airbnb.epoxy.databinding.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f6422a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            switch (i2) {
                case 1:
                    if (!"layout/activity_rewards_redemption_settings_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for activity_rewards_redemption_settings is invalid. Received: "));
                    }
                    Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, null, ActivityRewardsRedemptionSettingsBindingImpl.B);
                    ActivityRewardsRedemptionSettingsBindingImpl activityRewardsRedemptionSettingsBindingImpl = new ActivityRewardsRedemptionSettingsBindingImpl(dataBindingComponent, view, (FrameLayout) objArrT[3], (Toolbar) objArrT[2]);
                    activityRewardsRedemptionSettingsBindingImpl.A = -1L;
                    ((CoordinatorLayout) objArrT[0]).setTag(null);
                    activityRewardsRedemptionSettingsBindingImpl.E(view);
                    activityRewardsRedemptionSettingsBindingImpl.r();
                    return activityRewardsRedemptionSettingsBindingImpl;
                case 2:
                    if ("layout/epoxy_item_redemption_action_0".equals(tag)) {
                        return new EpoxyItemRedemptionActionBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_redemption_action is invalid. Received: "));
                case 3:
                    if ("layout/epoxy_item_redemption_actions_list_title_0".equals(tag)) {
                        return new EpoxyItemRedemptionActionsListTitleBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_redemption_actions_list_title is invalid. Received: "));
                case 4:
                    if ("layout/epoxy_item_redemption_settings_0".equals(tag)) {
                        return new EpoxyItemRedemptionSettingsBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_redemption_settings is invalid. Received: "));
                case 5:
                    if ("layout/fragment_redemption_settings_0".equals(tag)) {
                        return new FragmentRedemptionSettingsBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for fragment_redemption_settings is invalid. Received: "));
                case 6:
                    if (!"layout/fragment_redemption_settings_bottom_sheet_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for fragment_redemption_settings_bottom_sheet is invalid. Received: "));
                    }
                    Object[] objArrT2 = ViewDataBinding.t(dataBindingComponent, view, 4, null, FragmentRedemptionSettingsBottomSheetBindingImpl.C);
                    TextView textView = (TextView) objArrT2[1];
                    FragmentRedemptionSettingsBottomSheetBindingImpl fragmentRedemptionSettingsBottomSheetBindingImpl = new FragmentRedemptionSettingsBottomSheetBindingImpl(dataBindingComponent, view, textView);
                    fragmentRedemptionSettingsBottomSheetBindingImpl.B = -1L;
                    fragmentRedemptionSettingsBottomSheetBindingImpl.y.setTag(null);
                    ((ConstraintLayout) objArrT2[0]).setTag(null);
                    fragmentRedemptionSettingsBottomSheetBindingImpl.E(view);
                    fragmentRedemptionSettingsBottomSheetBindingImpl.r();
                    return fragmentRedemptionSettingsBottomSheetBindingImpl;
            }
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f6422a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f6423a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
