package androidx.navigation.compose;

import android.content.Intent;
import android.os.Bundle;
import android.text.style.URLSpan;
import android.widget.TextView;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.state.ToggleableState;
import androidx.navigation.NavBackStackEntry;
import au.com.woolworths.android.onesite.deeplink.DeepLinkConfig;
import au.com.woolworths.android.onesite.deeplink.ShopAppDeepLinkDispatchDefinition;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerClickListener;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.base.rewards.account.data.IconListItemAction;
import au.com.woolworths.base.rewards.account.data.PreferenceToggleData;
import au.com.woolworths.base.rewards.account.ui.AccountHomeFooterItemKt;
import au.com.woolworths.design.core.ui.component.stable.CheckBoxState;
import au.com.woolworths.design.core.ui.foundation.elevation.CoreElevation;
import au.com.woolworths.feature.product.list.ProductListClickHandler;
import au.com.woolworths.feature.product.list.ProductsDisplayMode;
import au.com.woolworths.feature.product.list.data.IngredientCardApiData;
import au.com.woolworths.feature.product.list.data.ProductListChip;
import au.com.woolworths.feature.product.list.legacy.ui.ProductListOptionsItem;
import au.com.woolworths.feature.product.list.legacy.ui.ProductListOptionsSortOptionItem;
import au.com.woolworths.feature.product.list.ui.FilterMenuItem;
import au.com.woolworths.feature.product.list.ui.ProductListOptionsItem;
import au.com.woolworths.feature.product.list.ui.ProductListOptionsSortOptionItem;
import au.com.woolworths.feature.rewards.account.data.AccountHomeAndroidAppReviewLinkItem;
import au.com.woolworths.feature.rewards.account.data.AccountHomeAndroidMedalliaItem;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOption;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOptionCanCloseAccountItem;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOptionItem;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOptionMagicLinkItem;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOptionMandyItem;
import au.com.woolworths.feature.rewards.account.settings.AccountSettingsClickListenerOld;
import au.com.woolworths.feature.rewards.account.settings.AccountSettingsControllerOld;
import au.com.woolworths.rewards.base.data.RewardsWebLink;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CheckBoxState checkBoxState;
        switch (this.d) {
            case 0:
                ((DialogNavigator) this.e).i((NavBackStackEntry) this.f, false);
                return Unit.f24250a;
            case 1:
                Bundle bundle = (Bundle) this.e;
                DeepLinkConfig deepLinkConfig = (DeepLinkConfig) this.f;
                if (!ShopAppDeepLinkDispatchDefinition.d(bundle)) {
                    Activities.RewardsSetupMoreActivity.RewardsSetupEntryPoint rewardsSetupEntryPoint = Activities.RewardsSetupMoreActivity.RewardsSetupEntryPoint.d;
                    DeepLinkConfig deepLinkConfig2 = (DeepLinkConfig) bundle.getParcelable("ShopAppDeepLink.Extras.config");
                    return Activities.RewardsSetupMoreActivity.f4522a.b(rewardsSetupEntryPoint, deepLinkConfig2 != null ? deepLinkConfig2.j : false);
                }
                if (deepLinkConfig == null || !deepLinkConfig.l) {
                    return ActivityNavigatorKt.a(Activities.RewardsActivityLegacy.f4514a, ApplicationType.e);
                }
                Intent intentA = ActivityNavigatorKt.a(Activities.ShopRewardsActivity.f4534a, ApplicationType.e);
                intentA.putExtra("EXTRA_OFFER_INFO", new Activities.ShopRewardsActivity.Extras(null));
                return intentA;
            case 2:
                ((URLSpan) this.f).onClick((TextView) this.e);
                return Unit.f24250a;
            case 3:
                InsetBannerClickListener insetBannerClickListener = (InsetBannerClickListener) this.e;
                InsetBanner insetBanner = (InsetBanner) this.f;
                if (insetBannerClickListener != null) {
                    insetBannerClickListener.onActionClicked(insetBanner);
                }
                return Unit.f24250a;
            case 4:
                return AccountHomeFooterItemKt.AccountHomeFooterItem$lambda$7$lambda$6$lambda$4$lambda$3$lambda$2((Function1) this.e, (IconListItemAction) this.f);
            case 5:
                LazyListState lazyListState = (LazyListState) this.e;
                CoreElevation coreElevation = (CoreElevation) this.f;
                if (lazyListState.h() != 0 || Float.compare(lazyListState.i(), coreElevation.f4875a) >= 0) {
                    return coreElevation;
                }
                return new CoreElevation(coreElevation.b, lazyListState.i(), coreElevation.c);
            case 6:
                Function1 function1 = (Function1) this.e;
                CheckBoxState checkBoxState2 = (CheckBoxState) this.f;
                if (function1 != null) {
                    int iOrdinal = checkBoxState2.ordinal();
                    if (iOrdinal == 0) {
                        checkBoxState = CheckBoxState.e;
                    } else if (iOrdinal == 1) {
                        checkBoxState = CheckBoxState.d;
                    } else {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        checkBoxState = CheckBoxState.e;
                    }
                    function1.invoke(checkBoxState);
                }
                return Unit.f24250a;
            case 7:
                Function3 function3 = (Function3) this.e;
                ProductListChip productListChip = (ProductListChip) this.f;
                function3.invoke(productListChip.getId(), productListChip.getText().getText(), Boolean.valueOf(!productListChip.isSelected()));
                return Unit.f24250a;
            case 8:
                ((Function1) this.e).invoke((ProductsDisplayMode) this.f);
                return Unit.f24250a;
            case 9:
                ((Function1) this.e).invoke(((ProductListOptionsItem.FilterOptionItem) this.f).f5393a);
                return Unit.f24250a;
            case 10:
                ((Function1) this.e).invoke(((ProductListOptionsSortOptionItem.SortOptionItem) ((ProductListOptionsSortOptionItem) this.f)).f5398a.getId());
                return Unit.f24250a;
            case 11:
                Function2 function2 = (Function2) this.e;
                FilterMenuItem filterMenuItem = (FilterMenuItem) this.f;
                ToggleableState toggleableState = filterMenuItem.i;
                ToggleableState toggleableState2 = ToggleableState.e;
                if (toggleableState == toggleableState2) {
                    toggleableState2 = ToggleableState.d;
                }
                function2.invoke(filterMenuItem, toggleableState2);
                return Unit.f24250a;
            case 12:
                ((Function1) this.e).invoke(((FilterMenuItem) this.f).k);
                return Unit.f24250a;
            case 13:
                ((ProductListClickHandler) this.e).o2((IngredientCardApiData) this.f);
                return Unit.f24250a;
            case 14:
                Function3 function32 = (Function3) this.e;
                au.com.woolworths.feature.product.list.legacy.data.ProductListChip productListChip2 = (au.com.woolworths.feature.product.list.legacy.data.ProductListChip) this.f;
                function32.invoke(productListChip2.f5364a, productListChip2.c.f5353a, Boolean.valueOf(!productListChip2.b));
                return Unit.f24250a;
            case 15:
                ((Function1) this.e).invoke((au.com.woolworths.feature.product.list.legacy.ProductsDisplayMode) this.f);
                return Unit.f24250a;
            case 16:
                ((Function1) this.e).invoke(((ProductListOptionsItem.FilterOptionItem) this.f).f5379a);
                return Unit.f24250a;
            case 17:
                ((Function1) this.e).invoke(((ProductListOptionsSortOptionItem.SortOptionItem) ((au.com.woolworths.feature.product.list.legacy.ui.ProductListOptionsSortOptionItem) this.f)).f5384a.d);
                return Unit.f24250a;
            case 18:
                Function2 function22 = (Function2) this.e;
                au.com.woolworths.feature.product.list.legacy.ui.FilterMenuItem filterMenuItem2 = (au.com.woolworths.feature.product.list.legacy.ui.FilterMenuItem) this.f;
                ToggleableState toggleableState3 = filterMenuItem2.i;
                ToggleableState toggleableState4 = ToggleableState.e;
                if (toggleableState3 == toggleableState4) {
                    toggleableState4 = ToggleableState.d;
                }
                function22.invoke(filterMenuItem2, toggleableState4);
                return Unit.f24250a;
            case 19:
                ((Function1) this.e).invoke(((au.com.woolworths.feature.product.list.legacy.ui.FilterMenuItem) this.f).k);
                return Unit.f24250a;
            case 20:
                ((au.com.woolworths.feature.product.list.legacy.ProductListClickHandler) this.e).p4((au.com.woolworths.feature.product.list.legacy.data.IngredientCardApiData) this.f);
                return Unit.f24250a;
            case 21:
                ((Function1) this.e).invoke((RewardsWebLink) this.f);
                return Unit.f24250a;
            case 22:
                ((Function2) this.e).invoke((PreferenceToggleData) this.f, Boolean.valueOf(!r1.getValue()));
                return Unit.f24250a;
            case 23:
                return AccountSettingsControllerOld.buildAccountHomeOptions$lambda$25$lambda$13$lambda$12((AccountSettingsClickListenerOld) this.e, (AccountHomeOptionItem) this.f);
            case 24:
                return AccountSettingsControllerOld.buildAccountHomeOptions$lambda$25$lambda$15$lambda$14((AccountSettingsClickListenerOld) this.e, (AccountHomeOptionMagicLinkItem) this.f);
            case 25:
                return AccountSettingsControllerOld.buildAccountHomeOptions$lambda$25$lambda$17$lambda$16((AccountSettingsClickListenerOld) this.e, (AccountHomeOptionMandyItem) this.f);
            case 26:
                return AccountSettingsControllerOld.buildAccountHomeOptions$lambda$25$lambda$19$lambda$18((AccountSettingsClickListenerOld) this.e, (AccountHomeAndroidAppReviewLinkItem) this.f);
            case 27:
                return AccountSettingsControllerOld.buildAccountHomeOptions$lambda$25$lambda$21$lambda$20((AccountSettingsClickListenerOld) this.e, (AccountHomeAndroidMedalliaItem) this.f);
            case 28:
                return AccountSettingsControllerOld.buildAccountHomeOptions$lambda$25$lambda$24$lambda$23((AccountSettingsClickListenerOld) this.e, (AccountHomeOptionCanCloseAccountItem) this.f);
            default:
                Function1 function12 = (Function1) this.e;
                AccountHomeOption accountHomeOption = (AccountHomeOption) this.f;
                if (function12 != null) {
                    function12.invoke(accountHomeOption);
                }
                return Unit.f24250a;
        }
    }
}
