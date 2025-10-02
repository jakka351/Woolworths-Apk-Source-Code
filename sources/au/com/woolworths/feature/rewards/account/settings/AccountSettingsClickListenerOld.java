package au.com.woolworths.feature.rewards.account.settings;

import au.com.woolworths.base.rewards.account.data.IconListItemAction;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOption;
import au.com.woolworths.foundation.rewards.banner.model.RewardsNotificationBannerApiData;
import au.com.woolworths.sdui.model.action.ActionData;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsClickListenerOld;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface AccountSettingsClickListenerOld {
    void P2(RewardsNotificationBannerApiData rewardsNotificationBannerApiData);

    void R4(AccountHomeOption accountHomeOption);

    void a1(ActionData actionData);

    void a2();

    void a6(IconListItemAction iconListItemAction);

    void h3(RewardsNotificationBannerApiData rewardsNotificationBannerApiData);

    void m0();

    void q4();
}
