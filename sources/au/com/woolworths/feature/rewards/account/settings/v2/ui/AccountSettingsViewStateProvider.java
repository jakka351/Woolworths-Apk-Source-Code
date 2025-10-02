package au.com.woolworths.feature.rewards.account.settings.v2.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.base.rewards.account.data.AccountHomeFooter;
import au.com.woolworths.base.rewards.account.data.IconListItemAction;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOption;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOptionAction;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOptionItem;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOptionLogoutItem;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOptionMagicLinkItem;
import au.com.woolworths.feature.rewards.account.data.AccountSettingsAppVersionData;
import au.com.woolworths.feature.rewards.account.data.HomeOptionAction;
import au.com.woolworths.feature.rewards.account.settings.v2.AccountSettingsContract;
import au.com.woolworths.feature.rewards.account.settings.v2.model.AccountMenuSection;
import au.com.woolworths.feature.rewards.account.settings.v2.model.RewardsAccountMenu;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/v2/ui/AccountSettingsViewStateProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsContract$ViewState;", "Companion", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AccountSettingsViewStateProvider implements PreviewParameterProvider<AccountSettingsContract.ViewState> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/v2/ui/AccountSettingsViewStateProvider$Companion;", "", "Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsContract$ViewState;", "Default", "Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsContract$ViewState;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        AccountSettingsContract.ViewState viewState = new AccountSettingsContract.ViewState(false, false, new RewardsAccountMenu(null, CollectionsKt.Q(new AccountMenuSection("Rewards", CollectionsKt.Q(new AccountHomeOptionLogoutItem("logout", "Log out", null, null, false)))), null), new AccountSettingsAppVersionData(2023, "4.2.0", " (9001)"), null, false, false, false);
        AccountSettingsContract.ViewState.a(viewState, true, true, null, null, false, false, false, 252);
        Boolean bool = Boolean.FALSE;
        AccountMenuSection accountMenuSection = new AccountMenuSection("Manage your account", CollectionsKt.Q(new AccountHomeOptionMagicLinkItem("update_account", "Update Account Details", "my-details", bool, bool)));
        AccountHomeOptionAction accountHomeOptionAction = new AccountHomeOptionAction(HomeOptionAction.e, "");
        Boolean bool2 = Boolean.TRUE;
        AccountMenuSection accountMenuSection2 = new AccountMenuSection("Communication preferences", CollectionsKt.R(new AccountHomeOptionItem("push_notification_preferences", "Push Notifications", accountHomeOptionAction, bool2, false, 48), new AccountHomeOptionMagicLinkItem("marketing_communications_preferences", "Email, SMS and Post", "communications", bool, bool)));
        HomeOptionAction homeOptionAction = HomeOptionAction.d;
        AccountSettingsContract.ViewState.a(AccountSettingsContract.ViewState.a(viewState, false, false, new RewardsAccountMenu(null, CollectionsKt.R(accountMenuSection, accountMenuSection2, new AccountMenuSection("Rewards", ArraysKt.F(new AccountHomeOption[]{new AccountHomeOptionItem("about_program", "About the Program", new AccountHomeOptionAction(homeOptionAction, ""), bool2, false, 48), new AccountHomeOptionItem("terms_of_use", "Terms of Use", new AccountHomeOptionAction(homeOptionAction, ""), bool, false, 48), new AccountHomeOptionItem("privacy_policy", "Privacy policy", new AccountHomeOptionAction(homeOptionAction, ""), bool, false, 48), new AccountHomeOptionLogoutItem("logout", "Log out", null, null, false)}))), new AccountHomeFooter("", "We acknowledge the Traditional Owners and Custodians of the Country throughout Australia.", new IconListItemAction("", "Read more"))), null, false, false, false, 251), false, false, null, null, false, false, true, 127);
        AccountSettingsContract.ViewState.a(viewState, false, false, null, FullPageMessage.Error.ConnectionError.f8915a, false, false, false, 239);
        AccountSettingsContract.ViewState.a(viewState, false, false, null, FullPageMessage.Error.ServerError.f8916a, false, false, false, 239);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}
