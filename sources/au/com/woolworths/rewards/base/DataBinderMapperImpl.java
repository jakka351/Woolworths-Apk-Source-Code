package au.com.woolworths.rewards.base;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.rewards.base.databinding.EpoxyIncludeRewardsEmptyStateBindingImpl;
import au.com.woolworths.rewards.base.databinding.EpoxyIncludeRewardsGenericErrorStateBindingImpl;
import au.com.woolworths.rewards.base.databinding.EpoxyItemHomeTabLoadingIndicatorBindingImpl;
import au.com.woolworths.rewards.base.databinding.IncludeAccountButtonBindingImpl;
import au.com.woolworths.rewards.base.databinding.IncludeBalanceIndicatorBindingImpl;
import au.com.woolworths.rewards.base.databinding.IncludeRewardsEmptyStateFullScreenBindingImpl;
import au.com.woolworths.rewards.base.databinding.IncludeRewardsGenericErrorStateFullScreenBindingImpl;
import au.com.woolworths.rewards.base.databinding.RewardsBalanceCircleIndicatorBindingImpl;
import au.com.woolworths.rewards.base.databinding.RewardsRichCoachMarkBindingImpl;
import au.com.woolworths.rewards.base.databinding.RewardsRichCoachMarkWithImageBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;

/* loaded from: classes4.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f9346a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = au.com.woolworths.android.onesite.a.b(36, 0, 1, "_all", "asset");
            sparseArrayB.put(2, "backgroundColor");
            sparseArrayB.put(3, "bannerState");
            sparseArrayB.put(4, "brandLabel");
            sparseArrayB.put(5, "buttonText");
            sparseArrayB.put(6, "buttonTint");
            sparseArrayB.put(7, "clickHandler");
            sparseArrayB.put(8, "clickHandlers");
            sparseArrayB.put(9, "clickListener");
            sparseArrayB.put(10, "coachMark");
            sparseArrayB.put(11, "data");
            sparseArrayB.put(12, "errorState");
            sparseArrayB.put(13, "heightRes");
            sparseArrayB.put(14, "imageLoaderListener");
            sparseArrayB.put(15, "importantForAccessibility");
            sparseArrayB.put(16, "inlineMessage");
            sparseArrayB.put(17, "isAccountNotificationBadgeShown");
            sparseArrayB.put(18, "isChecked");
            sparseArrayB.put(19, "isEnabled");
            sparseArrayB.put(20, "isLowerPriceYellow");
            sparseArrayB.put(21, "isUnlocking");
            sparseArrayB.put(22, "lottieAutoPlay");
            sparseArrayB.put(23, "lottieBackgroundColor");
            sparseArrayB.put(24, "lottieLoop");
            sparseArrayB.put(25, "margins");
            sparseArrayB.put(26, "onPointsBalanceClick");
            sparseArrayB.put(27, "onQueryTextChangeListener");
            sparseArrayB.put(28, "onQueryTextFocusChangeListener");
            sparseArrayB.put(29, "onQueryTextSubmitListener");
            sparseArrayB.put(30, "rewardsPointsBalance");
            sparseArrayB.put(31, "rewardsPointsBalanceData");
            sparseArrayB.put(32, "searchQueryHint");
            sparseArrayB.put(33, "showNewDismissIcon");
            sparseArrayB.put(34, "state");
            sparseArrayB.put(35, TextBundle.TEXT_ENTRY);
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f9347a;

        static {
            HashMap map = new HashMap(10);
            f9347a = map;
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_include_rewards_empty_state, map, "layout/epoxy_include_rewards_empty_state_0", com.woolworths.R.layout.epoxy_include_rewards_generic_error_state, "layout/epoxy_include_rewards_generic_error_state_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_home_tab_loading_indicator, map, "layout/epoxy_item_home_tab_loading_indicator_0", com.woolworths.R.layout.include_account_button, "layout/include_account_button_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.include_balance_indicator, map, "layout/include_balance_indicator_0", com.woolworths.R.layout.include_rewards_empty_state_full_screen, "layout/include_rewards_empty_state_full_screen_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.include_rewards_generic_error_state_full_screen, map, "layout/include_rewards_generic_error_state_full_screen_0", com.woolworths.R.layout.rewards_balance_circle_indicator, "layout/rewards_balance_circle_indicator_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.rewards_rich_coach_mark, map, "layout/rewards_rich_coach_mark_0", com.woolworths.R.layout.rewards_rich_coach_mark_with_image, "layout/rewards_rich_coach_mark_with_image_0");
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(10);
        f9346a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.epoxy_include_rewards_empty_state, 1);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_include_rewards_generic_error_state, 2);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_home_tab_loading_indicator, 3);
        sparseIntArray.put(com.woolworths.R.layout.include_account_button, 4);
        sparseIntArray.put(com.woolworths.R.layout.include_balance_indicator, 5);
        sparseIntArray.put(com.woolworths.R.layout.include_rewards_empty_state_full_screen, 6);
        sparseIntArray.put(com.woolworths.R.layout.include_rewards_generic_error_state_full_screen, 7);
        sparseIntArray.put(com.woolworths.R.layout.rewards_balance_circle_indicator, 8);
        sparseIntArray.put(com.woolworths.R.layout.rewards_rich_coach_mark, 9);
        sparseIntArray.put(com.woolworths.R.layout.rewards_rich_coach_mark_with_image, 10);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.base.ui.DataBinderMapperImpl());
        arrayList.add(new com.airbnb.epoxy.databinding.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f9346a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            switch (i2) {
                case 1:
                    if ("layout/epoxy_include_rewards_empty_state_0".equals(tag)) {
                        return new EpoxyIncludeRewardsEmptyStateBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_include_rewards_empty_state is invalid. Received: "));
                case 2:
                    if ("layout/epoxy_include_rewards_generic_error_state_0".equals(tag)) {
                        return new EpoxyIncludeRewardsGenericErrorStateBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_include_rewards_generic_error_state is invalid. Received: "));
                case 3:
                    if ("layout/epoxy_item_home_tab_loading_indicator_0".equals(tag)) {
                        return new EpoxyItemHomeTabLoadingIndicatorBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_home_tab_loading_indicator is invalid. Received: "));
                case 4:
                    if ("layout/include_account_button_0".equals(tag)) {
                        return new IncludeAccountButtonBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for include_account_button is invalid. Received: "));
                case 5:
                    if ("layout/include_balance_indicator_0".equals(tag)) {
                        return new IncludeBalanceIndicatorBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for include_balance_indicator is invalid. Received: "));
                case 6:
                    if (!"layout/include_rewards_empty_state_full_screen_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for include_rewards_empty_state_full_screen is invalid. Received: "));
                    }
                    Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, null, null);
                    IncludeRewardsEmptyStateFullScreenBindingImpl includeRewardsEmptyStateFullScreenBindingImpl = new IncludeRewardsEmptyStateFullScreenBindingImpl(view, (ImageView) objArrT[1], (TextView) objArrT[3], (TextView) objArrT[2], dataBindingComponent);
                    includeRewardsEmptyStateFullScreenBindingImpl.C = -1L;
                    ((ConstraintLayout) objArrT[0]).setTag(null);
                    includeRewardsEmptyStateFullScreenBindingImpl.y.setTag(null);
                    includeRewardsEmptyStateFullScreenBindingImpl.z.setTag(null);
                    includeRewardsEmptyStateFullScreenBindingImpl.A.setTag(null);
                    includeRewardsEmptyStateFullScreenBindingImpl.E(view);
                    includeRewardsEmptyStateFullScreenBindingImpl.r();
                    return includeRewardsEmptyStateFullScreenBindingImpl;
                case 7:
                    if ("layout/include_rewards_generic_error_state_full_screen_0".equals(tag)) {
                        return new IncludeRewardsGenericErrorStateFullScreenBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for include_rewards_generic_error_state_full_screen is invalid. Received: "));
                case 8:
                    if (!"layout/rewards_balance_circle_indicator_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for rewards_balance_circle_indicator is invalid. Received: "));
                    }
                    Object[] objArrT2 = ViewDataBinding.t(dataBindingComponent, view, 7, null, RewardsBalanceCircleIndicatorBindingImpl.F);
                    ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) objArrT2[4];
                    TextView textView = (TextView) objArrT2[2];
                    TextView textView2 = (TextView) objArrT2[3];
                    RewardsBalanceCircleIndicatorBindingImpl rewardsBalanceCircleIndicatorBindingImpl = new RewardsBalanceCircleIndicatorBindingImpl(dataBindingComponent, view, contentLoadingProgressBar, textView, textView2, (ImageView) objArrT2[1]);
                    rewardsBalanceCircleIndicatorBindingImpl.E = -1L;
                    ((ConstraintLayout) objArrT2[0]).setTag(null);
                    rewardsBalanceCircleIndicatorBindingImpl.z.setTag(null);
                    rewardsBalanceCircleIndicatorBindingImpl.A.setTag(null);
                    rewardsBalanceCircleIndicatorBindingImpl.B.setTag(null);
                    rewardsBalanceCircleIndicatorBindingImpl.E(view);
                    rewardsBalanceCircleIndicatorBindingImpl.r();
                    return rewardsBalanceCircleIndicatorBindingImpl;
                case 9:
                    if ("layout/rewards_rich_coach_mark_0".equals(tag)) {
                        return new RewardsRichCoachMarkBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for rewards_rich_coach_mark is invalid. Received: "));
                case 10:
                    if ("layout/rewards_rich_coach_mark_with_image_0".equals(tag)) {
                        return new RewardsRichCoachMarkWithImageBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for rewards_rich_coach_mark_with_image is invalid. Received: "));
            }
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f9346a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f9347a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
