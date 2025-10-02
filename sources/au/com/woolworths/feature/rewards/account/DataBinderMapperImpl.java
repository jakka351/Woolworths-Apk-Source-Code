package au.com.woolworths.feature.rewards.account;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.impl.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.feature.rewards.account.databinding.ActivityAccountSettingsBindingImpl;
import au.com.woolworths.feature.rewards.account.databinding.ActivityRewardsAuthenicationBindingImpl;
import au.com.woolworths.feature.rewards.account.databinding.ActivityRewardsCallbackUrlBindingImpl;
import au.com.woolworths.feature.rewards.account.databinding.ActivityRewardsMagicLinkBindingImpl;
import au.com.woolworths.feature.rewards.account.databinding.ActivityRewardsPreferenceDetailsBindingImpl;
import au.com.woolworths.feature.rewards.account.databinding.EpoxyItemAccountHomeErrorOptionBindingImpl;
import au.com.woolworths.feature.rewards.account.databinding.EpoxyItemAccountHomeLoadingOptionBindingImpl;
import au.com.woolworths.feature.rewards.account.databinding.EpoxyItemAccountHomeLoadingSectionBindingImpl;
import au.com.woolworths.feature.rewards.account.databinding.EpoxyItemAccountHomeLogoutBindingImpl;
import au.com.woolworths.feature.rewards.account.databinding.EpoxyItemAccountHomeOptionBindingImpl;
import au.com.woolworths.feature.rewards.account.databinding.EpoxyItemAccountHomeSectionBindingImpl;
import au.com.woolworths.feature.rewards.account.databinding.EpoxyItemAccountSettingsAppVersionBindingImpl;
import au.com.woolworths.feature.rewards.account.databinding.EpoxyItemPreferenceDetailsFooterBindingImpl;
import au.com.woolworths.feature.rewards.account.databinding.EpoxyItemPreferenceDetailsHeaderBindingImpl;
import au.com.woolworths.feature.rewards.account.databinding.EpoxyItemPreferenceDetailsTextBindingImpl;
import au.com.woolworths.feature.rewards.account.databinding.EpoxyItemPreferenceDetailsToggleBindingImpl;
import au.com.woolworths.feature.rewards.account.databinding.EpoxyItemPreferenceDetailsToggleGroupBindingImpl;
import au.com.woolworths.feature.rewards.account.databinding.EpoxyItemPreferenceDetailsToggleGroupFooterBindingImpl;
import au.com.woolworths.feature.rewards.account.databinding.EpoxyItemPreferenceDetailsToggleGroupHeaderBindingImpl;
import au.com.woolworths.feature.rewards.account.databinding.FragmentRewardsAccountDynamicBindingImpl;
import au.com.woolworths.feature.rewards.account.databinding.FragmentRewardsPreferenceDetailsBindingImpl;
import au.com.woolworths.rewards.base.databinding.IncludeRewardsGenericErrorStateFullScreenBinding;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f5644a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = a.b(59, 0, 1, "_all", "actionState");
            sparseArrayB.put(2, "asset");
            sparseArrayB.put(3, "backgroundColor");
            sparseArrayB.put(4, "bannerState");
            sparseArrayB.put(5, "brandLabel");
            sparseArrayB.put(6, "buttonText");
            sparseArrayB.put(7, "buttonTint");
            sparseArrayB.put(8, "clickHandler");
            sparseArrayB.put(9, "clickHandlers");
            sparseArrayB.put(10, "clickListener");
            sparseArrayB.put(11, "coachMark");
            sparseArrayB.put(12, "data");
            sparseArrayB.put(13, "enabled");
            sparseArrayB.put(14, "errorState");
            sparseArrayB.put(15, "handler");
            sparseArrayB.put(16, "heightRes");
            sparseArrayB.put(17, "imageLoaderListener");
            sparseArrayB.put(18, "importantForAccessibility");
            sparseArrayB.put(19, "index");
            sparseArrayB.put(20, "infoSectionItem");
            sparseArrayB.put(21, "inlineMessage");
            sparseArrayB.put(22, "isAccountNotificationBadgeShown");
            sparseArrayB.put(23, "isChecked");
            sparseArrayB.put(24, "isEnabled");
            sparseArrayB.put(25, "isLoading");
            sparseArrayB.put(26, "isLowerPriceYellow");
            sparseArrayB.put(27, "isRewardStyle");
            sparseArrayB.put(28, "isUnlocking");
            sparseArrayB.put(29, "itemWidthRes");
            sparseArrayB.put(30, AnnotatedPrivateKey.LABEL);
            sparseArrayB.put(31, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            sparseArrayB.put(32, "loadingMessage");
            sparseArrayB.put(33, "lottieAutoPlay");
            sparseArrayB.put(34, "lottieBackgroundColor");
            sparseArrayB.put(35, "lottieLoop");
            sparseArrayB.put(36, "margins");
            sparseArrayB.put(37, "onClick");
            sparseArrayB.put(38, "onPointsBalanceClick");
            sparseArrayB.put(39, "onQueryTextChangeListener");
            sparseArrayB.put(40, "onQueryTextFocusChangeListener");
            sparseArrayB.put(41, "onQueryTextSubmitListener");
            sparseArrayB.put(42, "rewardsPointsBalance");
            sparseArrayB.put(43, "rewardsPointsBalanceData");
            sparseArrayB.put(44, "searchQueryHint");
            sparseArrayB.put(45, "section");
            sparseArrayB.put(46, "sectionTitle");
            sparseArrayB.put(47, "shouldHideToolbar");
            sparseArrayB.put(48, "shouldShowLoadingState");
            sparseArrayB.put(49, "shouldShowNewBadge");
            sparseArrayB.put(50, "shouldShowNotificationDot");
            sparseArrayB.put(51, "shouldShowWebArrow");
            sparseArrayB.put(52, "showNewDismissIcon");
            sparseArrayB.put(53, "state");
            sparseArrayB.put(54, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(55, "title");
            sparseArrayB.put(56, "viewListener");
            sparseArrayB.put(57, "viewModel");
            sparseArrayB.put(58, "viewState");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f5645a;

        static {
            HashMap map = new HashMap(21);
            f5645a = map;
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_account_settings, map, "layout/activity_account_settings_0", com.woolworths.R.layout.activity_rewards_authenication, "layout/activity_rewards_authenication_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_rewards_callback_url, map, "layout/activity_rewards_callback_url_0", com.woolworths.R.layout.activity_rewards_magic_link, "layout/activity_rewards_magic_link_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_rewards_preference_details, map, "layout/activity_rewards_preference_details_0", com.woolworths.R.layout.epoxy_item_account_home_error_option, "layout/epoxy_item_account_home_error_option_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_account_home_loading_option, map, "layout/epoxy_item_account_home_loading_option_0", com.woolworths.R.layout.epoxy_item_account_home_loading_section, "layout/epoxy_item_account_home_loading_section_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_account_home_logout, map, "layout/epoxy_item_account_home_logout_0", com.woolworths.R.layout.epoxy_item_account_home_option, "layout/epoxy_item_account_home_option_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_account_home_section, map, "layout/epoxy_item_account_home_section_0", com.woolworths.R.layout.epoxy_item_account_settings_app_version, "layout/epoxy_item_account_settings_app_version_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_preference_details_footer, map, "layout/epoxy_item_preference_details_footer_0", com.woolworths.R.layout.epoxy_item_preference_details_header, "layout/epoxy_item_preference_details_header_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_preference_details_text, map, "layout/epoxy_item_preference_details_text_0", com.woolworths.R.layout.epoxy_item_preference_details_toggle, "layout/epoxy_item_preference_details_toggle_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_preference_details_toggle_group, map, "layout/epoxy_item_preference_details_toggle_group_0", com.woolworths.R.layout.epoxy_item_preference_details_toggle_group_footer, "layout/epoxy_item_preference_details_toggle_group_footer_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_preference_details_toggle_group_header, map, "layout/epoxy_item_preference_details_toggle_group_header_0", com.woolworths.R.layout.fragment_rewards_account_dynamic, "layout/fragment_rewards_account_dynamic_0");
            map.put("layout/fragment_rewards_preference_details_0", Integer.valueOf(com.woolworths.R.layout.fragment_rewards_preference_details));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(21);
        f5644a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.activity_account_settings, 1);
        sparseIntArray.put(com.woolworths.R.layout.activity_rewards_authenication, 2);
        sparseIntArray.put(com.woolworths.R.layout.activity_rewards_callback_url, 3);
        sparseIntArray.put(com.woolworths.R.layout.activity_rewards_magic_link, 4);
        sparseIntArray.put(com.woolworths.R.layout.activity_rewards_preference_details, 5);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_account_home_error_option, 6);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_account_home_loading_option, 7);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_account_home_loading_section, 8);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_account_home_logout, 9);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_account_home_option, 10);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_account_home_section, 11);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_account_settings_app_version, 12);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_preference_details_footer, 13);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_preference_details_header, 14);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_preference_details_text, 15);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_preference_details_toggle, 16);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_preference_details_toggle_group, 17);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_preference_details_toggle_group_footer, 18);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_preference_details_toggle_group_header, 19);
        sparseIntArray.put(com.woolworths.R.layout.fragment_rewards_account_dynamic, 20);
        sparseIntArray.put(com.woolworths.R.layout.fragment_rewards_preference_details, 21);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.base.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.shared.feedback.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.shared.web.file.uploader.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.rewards.base.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shared.ui.views.DataBinderMapperImpl());
        arrayList.add(new com.airbnb.epoxy.databinding.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f5644a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            switch (i2) {
                case 1:
                    if (!"layout/activity_account_settings_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for activity_account_settings is invalid. Received: "));
                    }
                    ActivityAccountSettingsBindingImpl activityAccountSettingsBindingImpl = new ActivityAccountSettingsBindingImpl(dataBindingComponent, view, (FragmentContainerView) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
                    activityAccountSettingsBindingImpl.z = -1L;
                    activityAccountSettingsBindingImpl.y.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, activityAccountSettingsBindingImpl);
                    activityAccountSettingsBindingImpl.r();
                    return activityAccountSettingsBindingImpl;
                case 2:
                    if (!"layout/activity_rewards_authenication_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for activity_rewards_authenication is invalid. Received: "));
                    }
                    Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 6, ActivityRewardsAuthenicationBindingImpl.E, ActivityRewardsAuthenicationBindingImpl.F);
                    ActivityRewardsAuthenicationBindingImpl activityRewardsAuthenicationBindingImpl = new ActivityRewardsAuthenicationBindingImpl(dataBindingComponent, view, (ContentLoadingProgressBar) objArrT[1], (IncludeGenericErrorStateBinding) objArrT[3], (Toolbar) objArrT[5], (WebView) objArrT[2]);
                    activityRewardsAuthenicationBindingImpl.D = -1L;
                    activityRewardsAuthenicationBindingImpl.y.setTag(null);
                    IncludeGenericErrorStateBinding includeGenericErrorStateBinding = activityRewardsAuthenicationBindingImpl.z;
                    if (includeGenericErrorStateBinding != null) {
                        includeGenericErrorStateBinding.n = activityRewardsAuthenicationBindingImpl;
                    }
                    ((ConstraintLayout) objArrT[0]).setTag(null);
                    activityRewardsAuthenicationBindingImpl.B.setTag(null);
                    activityRewardsAuthenicationBindingImpl.E(view);
                    activityRewardsAuthenicationBindingImpl.r();
                    return activityRewardsAuthenicationBindingImpl;
                case 3:
                    if ("layout/activity_rewards_callback_url_0".equals(tag)) {
                        return new ActivityRewardsCallbackUrlBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for activity_rewards_callback_url is invalid. Received: "));
                case 4:
                    if ("layout/activity_rewards_magic_link_0".equals(tag)) {
                        return new ActivityRewardsMagicLinkBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for activity_rewards_magic_link is invalid. Received: "));
                case 5:
                    if (!"layout/activity_rewards_preference_details_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for activity_rewards_preference_details is invalid. Received: "));
                    }
                    ActivityRewardsPreferenceDetailsBindingImpl activityRewardsPreferenceDetailsBindingImpl = new ActivityRewardsPreferenceDetailsBindingImpl(dataBindingComponent, view, (FragmentContainerView) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
                    activityRewardsPreferenceDetailsBindingImpl.z = -1L;
                    activityRewardsPreferenceDetailsBindingImpl.y.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, activityRewardsPreferenceDetailsBindingImpl);
                    activityRewardsPreferenceDetailsBindingImpl.r();
                    return activityRewardsPreferenceDetailsBindingImpl;
                case 6:
                    if ("layout/epoxy_item_account_home_error_option_0".equals(tag)) {
                        return new EpoxyItemAccountHomeErrorOptionBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_account_home_error_option is invalid. Received: "));
                case 7:
                    if (!"layout/epoxy_item_account_home_loading_option_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_account_home_loading_option is invalid. Received: "));
                    }
                    Object[] objArrT2 = ViewDataBinding.t(dataBindingComponent, view, 2, null, EpoxyItemAccountHomeLoadingOptionBindingImpl.z);
                    EpoxyItemAccountHomeLoadingOptionBindingImpl epoxyItemAccountHomeLoadingOptionBindingImpl = new EpoxyItemAccountHomeLoadingOptionBindingImpl(dataBindingComponent, view, 0);
                    epoxyItemAccountHomeLoadingOptionBindingImpl.y = -1L;
                    ((ConstraintLayout) objArrT2[0]).setTag(null);
                    epoxyItemAccountHomeLoadingOptionBindingImpl.E(view);
                    epoxyItemAccountHomeLoadingOptionBindingImpl.r();
                    return epoxyItemAccountHomeLoadingOptionBindingImpl;
                case 8:
                    if (!"layout/epoxy_item_account_home_loading_section_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_account_home_loading_section is invalid. Received: "));
                    }
                    Object[] objArrT3 = ViewDataBinding.t(dataBindingComponent, view, 2, null, EpoxyItemAccountHomeLoadingSectionBindingImpl.z);
                    EpoxyItemAccountHomeLoadingSectionBindingImpl epoxyItemAccountHomeLoadingSectionBindingImpl = new EpoxyItemAccountHomeLoadingSectionBindingImpl(dataBindingComponent, view, 0);
                    epoxyItemAccountHomeLoadingSectionBindingImpl.y = -1L;
                    ((ConstraintLayout) objArrT3[0]).setTag(null);
                    epoxyItemAccountHomeLoadingSectionBindingImpl.E(view);
                    epoxyItemAccountHomeLoadingSectionBindingImpl.r();
                    return epoxyItemAccountHomeLoadingSectionBindingImpl;
                case 9:
                    if ("layout/epoxy_item_account_home_logout_0".equals(tag)) {
                        return new EpoxyItemAccountHomeLogoutBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_account_home_logout is invalid. Received: "));
                case 10:
                    if ("layout/epoxy_item_account_home_option_0".equals(tag)) {
                        return new EpoxyItemAccountHomeOptionBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_account_home_option is invalid. Received: "));
                case 11:
                    if ("layout/epoxy_item_account_home_section_0".equals(tag)) {
                        return new EpoxyItemAccountHomeSectionBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_account_home_section is invalid. Received: "));
                case 12:
                    if ("layout/epoxy_item_account_settings_app_version_0".equals(tag)) {
                        return new EpoxyItemAccountSettingsAppVersionBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_account_settings_app_version is invalid. Received: "));
                case 13:
                    if ("layout/epoxy_item_preference_details_footer_0".equals(tag)) {
                        return new EpoxyItemPreferenceDetailsFooterBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_preference_details_footer is invalid. Received: "));
                case 14:
                    if (!"layout/epoxy_item_preference_details_header_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_preference_details_header is invalid. Received: "));
                    }
                    Object[] objArrT4 = ViewDataBinding.t(dataBindingComponent, view, 5, null, null);
                    EpoxyItemPreferenceDetailsHeaderBindingImpl epoxyItemPreferenceDetailsHeaderBindingImpl = new EpoxyItemPreferenceDetailsHeaderBindingImpl(view, (ImageView) objArrT4[1], (TextView) objArrT4[4], (TextView) objArrT4[3], (TextView) objArrT4[2], dataBindingComponent);
                    epoxyItemPreferenceDetailsHeaderBindingImpl.D = -1L;
                    epoxyItemPreferenceDetailsHeaderBindingImpl.y.setTag(null);
                    epoxyItemPreferenceDetailsHeaderBindingImpl.z.setTag(null);
                    epoxyItemPreferenceDetailsHeaderBindingImpl.A.setTag(null);
                    epoxyItemPreferenceDetailsHeaderBindingImpl.B.setTag(null);
                    ((ConstraintLayout) objArrT4[0]).setTag(null);
                    epoxyItemPreferenceDetailsHeaderBindingImpl.E(view);
                    epoxyItemPreferenceDetailsHeaderBindingImpl.r();
                    return epoxyItemPreferenceDetailsHeaderBindingImpl;
                case 15:
                    if ("layout/epoxy_item_preference_details_text_0".equals(tag)) {
                        return new EpoxyItemPreferenceDetailsTextBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_preference_details_text is invalid. Received: "));
                case 16:
                    if ("layout/epoxy_item_preference_details_toggle_0".equals(tag)) {
                        return new EpoxyItemPreferenceDetailsToggleBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_preference_details_toggle is invalid. Received: "));
                case 17:
                    if (!"layout/epoxy_item_preference_details_toggle_group_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_preference_details_toggle_group is invalid. Received: "));
                    }
                    EpoxyItemPreferenceDetailsToggleGroupBindingImpl epoxyItemPreferenceDetailsToggleGroupBindingImpl = new EpoxyItemPreferenceDetailsToggleGroupBindingImpl(dataBindingComponent, view, (LinearLayout) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
                    epoxyItemPreferenceDetailsToggleGroupBindingImpl.z = -1L;
                    epoxyItemPreferenceDetailsToggleGroupBindingImpl.y.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, epoxyItemPreferenceDetailsToggleGroupBindingImpl);
                    epoxyItemPreferenceDetailsToggleGroupBindingImpl.r();
                    return epoxyItemPreferenceDetailsToggleGroupBindingImpl;
                case 18:
                    if (!"layout/epoxy_item_preference_details_toggle_group_footer_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_preference_details_toggle_group_footer is invalid. Received: "));
                    }
                    EpoxyItemPreferenceDetailsToggleGroupFooterBindingImpl epoxyItemPreferenceDetailsToggleGroupFooterBindingImpl = new EpoxyItemPreferenceDetailsToggleGroupFooterBindingImpl(dataBindingComponent, view, (TextView) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
                    epoxyItemPreferenceDetailsToggleGroupFooterBindingImpl.A = -1L;
                    epoxyItemPreferenceDetailsToggleGroupFooterBindingImpl.y.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, epoxyItemPreferenceDetailsToggleGroupFooterBindingImpl);
                    epoxyItemPreferenceDetailsToggleGroupFooterBindingImpl.r();
                    return epoxyItemPreferenceDetailsToggleGroupFooterBindingImpl;
                case 19:
                    if ("layout/epoxy_item_preference_details_toggle_group_header_0".equals(tag)) {
                        return new EpoxyItemPreferenceDetailsToggleGroupHeaderBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_preference_details_toggle_group_header is invalid. Received: "));
                case 20:
                    if ("layout/fragment_rewards_account_dynamic_0".equals(tag)) {
                        return new FragmentRewardsAccountDynamicBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for fragment_rewards_account_dynamic is invalid. Received: "));
                case 21:
                    if (!"layout/fragment_rewards_preference_details_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for fragment_rewards_preference_details is invalid. Received: "));
                    }
                    Object[] objArrT5 = ViewDataBinding.t(dataBindingComponent, view, 8, FragmentRewardsPreferenceDetailsBindingImpl.J, FragmentRewardsPreferenceDetailsBindingImpl.K);
                    FragmentRewardsPreferenceDetailsBindingImpl fragmentRewardsPreferenceDetailsBindingImpl = new FragmentRewardsPreferenceDetailsBindingImpl(dataBindingComponent, view, (AppBarLayout) objArrT5[3], (CoordinatorLayout) objArrT5[2], (IncludeRewardsGenericErrorStateFullScreenBinding) objArrT5[6], (ImageView) objArrT5[1], (ContentLoadingProgressBar) objArrT5[5], (EpoxyRecyclerView) objArrT5[7], (Toolbar) objArrT5[4]);
                    fragmentRewardsPreferenceDetailsBindingImpl.I = -1L;
                    fragmentRewardsPreferenceDetailsBindingImpl.y.setTag(null);
                    fragmentRewardsPreferenceDetailsBindingImpl.z.setTag(null);
                    IncludeRewardsGenericErrorStateFullScreenBinding includeRewardsGenericErrorStateFullScreenBinding = fragmentRewardsPreferenceDetailsBindingImpl.A;
                    if (includeRewardsGenericErrorStateFullScreenBinding != null) {
                        includeRewardsGenericErrorStateFullScreenBinding.n = fragmentRewardsPreferenceDetailsBindingImpl;
                    }
                    fragmentRewardsPreferenceDetailsBindingImpl.B.setTag(null);
                    ((LinearLayout) objArrT5[0]).setTag(null);
                    fragmentRewardsPreferenceDetailsBindingImpl.C.setTag(null);
                    fragmentRewardsPreferenceDetailsBindingImpl.E.setTag(null);
                    fragmentRewardsPreferenceDetailsBindingImpl.E(view);
                    fragmentRewardsPreferenceDetailsBindingImpl.r();
                    return fragmentRewardsPreferenceDetailsBindingImpl;
            }
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f5644a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f5645a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
