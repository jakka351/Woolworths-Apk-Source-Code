package au.com.woolworths.feature.rewards.account.settings.v2;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.rewards.account.data.AccountHomeAndroidAppReviewLinkItem;
import au.com.woolworths.feature.rewards.account.data.AccountHomeAndroidMedalliaItem;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOnboardingItem;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOption;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOptionAction;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOptionCanCloseAccountItem;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOptionChangeCountryItem;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOptionDeleteAccountItem;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOptionDevOptionsItem;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOptionItem;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOptionLogoutItem;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOptionMagicLinkItem;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOptionMandyItem;
import au.com.woolworths.feature.rewards.account.data.AccountHomeSection;
import au.com.woolworths.feature.rewards.account.data.AccountHomeSectionKt;
import au.com.woolworths.feature.rewards.account.data.AccountSettingsAppVersionData;
import au.com.woolworths.feature.rewards.account.data.HomeOptionAction;
import au.com.woolworths.feature.rewards.account.settings.AccountSettingsActionDataOld;
import au.com.woolworths.feature.rewards.account.settings.v2.AccountSettingsContract;
import au.com.woolworths.feature.rewards.account.settings.v2.model.AccountMenuSection;
import au.com.woolworths.feature.rewards.account.settings.v2.model.RewardsAccountMenu;
import au.com.woolworths.feature.shared.feedback.medallia.MedalliaInteractor;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.rewards.base.homepage.AccountNotificationBadgeInteractor;
import au.com.woolworths.rewards.base.homepage.RewardsBannerInteractor;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsViewModel;", "Landroidx/lifecycle/ViewModel;", "Companion", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AccountSettingsViewModel extends ViewModel {
    public final AccountSettingsInteractor e;
    public final RewardsAccountInteractor f;
    public final AccountNotificationBadgeInteractor g;
    public final RewardsBannerInteractor h;
    public final MedalliaInteractor i;
    public final AnalyticsManager j;
    public final MutableStateFlow k;
    public final StateFlow l;
    public final BufferedChannel m;
    public final Flow n;
    public boolean o;
    public String p;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsViewModel$Companion;", "", "", "HOME_OPTION_MAGIC_LINK_EVERYDAY_EXTRA", "Ljava/lang/String;", "IN_STORE_WIFI_ITEM_ID", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[HomeOptionAction.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                HomeOptionAction homeOptionAction = HomeOptionAction.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                HomeOptionAction homeOptionAction2 = HomeOptionAction.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public AccountSettingsViewModel(AccountSettingsInteractor accountSettingsInteractor, RewardsAccountInteractor rewardsAccountInteractor, AccountNotificationBadgeInteractor accountNotificationBadgeInteractor, RewardsBannerInteractor rewardsBannerInteractor, MedalliaInteractor medalliaInteractor, AnalyticsManager analyticsManager) {
        Intrinsics.h(rewardsAccountInteractor, "rewardsAccountInteractor");
        Intrinsics.h(accountNotificationBadgeInteractor, "accountNotificationBadgeInteractor");
        Intrinsics.h(rewardsBannerInteractor, "rewardsBannerInteractor");
        Intrinsics.h(medalliaInteractor, "medalliaInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = accountSettingsInteractor;
        this.f = rewardsAccountInteractor;
        this.g = accountNotificationBadgeInteractor;
        this.h = rewardsBannerInteractor;
        this.i = medalliaInteractor;
        this.j = analyticsManager;
        AccountSettingsRepository accountSettingsRepository = accountSettingsInteractor.f5786a;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new AccountSettingsContract.ViewState(true, false, new RewardsAccountMenu(null, CollectionsKt.Q(new AccountMenuSection("REWARDS", accountSettingsRepository.d)), null), new AccountSettingsAppVersionData(Calendar.getInstance().get(1), ContextExtKt.c(accountSettingsRepository.f5787a), ""), null, false, false, false));
        this.k = mutableStateFlowA;
        this.l = FlowKt.b(mutableStateFlowA);
        BufferedChannel bufferedChannelA = ChannelKt.a(-2, 4, BufferOverflow.e);
        this.m = bufferedChannelA;
        this.n = FlowKt.I(bufferedChannelA);
        r6();
    }

    public static final void p6(AccountSettingsViewModel accountSettingsViewModel, boolean z, boolean z2) {
        BuildersKt.c(ViewModelKt.a(accountSettingsViewModel), null, null, new AccountSettingsViewModel$onLogoutComplete$1(accountSettingsViewModel, null), 3);
        accountSettingsViewModel.h.b();
        accountSettingsViewModel.m.k(new AccountSettingsContract.Action.GoToWelcomeScreen(z2));
        if (z) {
            return;
        }
        Bark.Companion companion = Bark.f8483a;
        Bark.Barker.i(new ReportOwner(ReportOwner.Squad.d), "Logout failed", null, 12);
    }

    public final void R4(AccountHomeOption option) {
        Object value;
        Object value2;
        ArrayList arrayList;
        Object value3;
        Intrinsics.h(option, "option");
        boolean zC = Intrinsics.c(option.getD(), Boolean.TRUE);
        MutableStateFlow mutableStateFlow = this.k;
        if (zC) {
            List list = ((AccountSettingsContract.ViewState) mutableStateFlow.getValue()).c.b;
            if (list != null) {
                List<AccountMenuSection> list2 = list;
                arrayList = new ArrayList(CollectionsKt.s(list2, 10));
                for (AccountMenuSection accountMenuSection : list2) {
                    if (accountMenuSection.b.contains(option)) {
                        List list3 = accountMenuSection.b;
                        AccountHomeOption accountHomeOptionB = option.b();
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list3, 10));
                        for (Object obj : list3) {
                            if (Intrinsics.c(obj, option)) {
                                obj = accountHomeOptionB;
                            }
                            arrayList2.add(obj);
                        }
                        accountMenuSection = new AccountMenuSection(accountMenuSection.f5792a, arrayList2);
                    }
                    arrayList.add(accountMenuSection);
                }
            } else {
                arrayList = null;
            }
            do {
                value3 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value3, AccountSettingsContract.ViewState.a((AccountSettingsContract.ViewState) value3, false, false, RewardsAccountMenu.a(((AccountSettingsContract.ViewState) mutableStateFlow.getValue()).c, arrayList, 5), null, false, false, false, 251)));
        }
        if (Intrinsics.c(option.getD(), Boolean.TRUE)) {
            BuildersKt.c(ViewModelKt.a(this), null, null, new AccountSettingsViewModel$notifyNewBadgeDismissedFor$1(this, option, null), 3);
        }
        t6();
        boolean zC2 = Intrinsics.c(option.getF5710a(), "instore_wifi");
        AnalyticsManager analyticsManager = this.j;
        if (zC2) {
            analyticsManager.c(AccountSettingsActionDataOld.f);
        } else {
            analyticsManager.j(AccountSettingsActionDataOld.e, TrackingMetadata.Companion.a(TrackableValue.o0, option.getB()));
        }
        boolean z = option instanceof AccountHomeAndroidAppReviewLinkItem;
        BufferedChannel bufferedChannel = this.m;
        if (z) {
            bufferedChannel.k(new AccountSettingsContract.Action.OpenAndroidReviewLink(((AccountHomeAndroidAppReviewLinkItem) option).c));
            return;
        }
        if (option instanceof AccountHomeAndroidMedalliaItem) {
            BuildersKt.c(ViewModelKt.a(this), null, null, new AccountSettingsViewModel$onMedalliaItemClick$1(this, (AccountHomeAndroidMedalliaItem) option, null), 3);
            return;
        }
        if (option instanceof AccountHomeOnboardingItem) {
            return;
        }
        if (option instanceof AccountHomeOptionCanCloseAccountItem) {
            AccountHomeOptionCanCloseAccountItem accountHomeOptionCanCloseAccountItem = (AccountHomeOptionCanCloseAccountItem) option;
            bufferedChannel.k(new AccountSettingsContract.Action.OpenCallbackUrl(new Activities.RewardsCallbackUrlActivity.Extras(accountHomeOptionCanCloseAccountItem.b, accountHomeOptionCanCloseAccountItem.c, Activities.RewardsCallbackUrlActivity.CallbackType.d, accountHomeOptionCanCloseAccountItem.d)));
            return;
        }
        if (option instanceof AccountHomeOptionChangeCountryItem) {
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value2, AccountSettingsContract.ViewState.a((AccountSettingsContract.ViewState) value2, false, false, null, null, true, false, false, 223)));
            return;
        }
        if (option instanceof AccountHomeOptionDeleteAccountItem) {
            bufferedChannel.k(AccountSettingsContract.Action.ShowDeleteAccountScreen.f5782a);
            return;
        }
        if (option instanceof AccountHomeOptionDevOptionsItem) {
            bufferedChannel.k(AccountSettingsContract.Action.ShowDeveloperOptions.f5783a);
            return;
        }
        if (option instanceof AccountHomeOptionItem) {
            AccountHomeOptionAction accountHomeOptionAction = ((AccountHomeOptionItem) option).c;
            HomeOptionAction homeOptionAction = accountHomeOptionAction.f5702a;
            String str = accountHomeOptionAction.b;
            int iOrdinal = homeOptionAction.ordinal();
            if (iOrdinal == 0) {
                bufferedChannel.k(new AccountSettingsContract.Action.OpenInAppBrowser(str));
                return;
            } else if (iOrdinal == 1) {
                bufferedChannel.k(new AccountSettingsContract.Action.OpenUrl(str));
                return;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        if (option instanceof AccountHomeOptionLogoutItem) {
            analyticsManager.c(AccountSettingsActionDataOld.g);
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value, AccountSettingsContract.ViewState.a((AccountSettingsContract.ViewState) value, false, false, null, null, false, true, false, 191)));
        } else {
            if (!(option instanceof AccountHomeOptionMagicLinkItem)) {
                if (!(option instanceof AccountHomeOptionMandyItem)) {
                    throw new NoWhenBranchMatchedException();
                }
                AccountHomeOptionMandyItem accountHomeOptionMandyItem = (AccountHomeOptionMandyItem) option;
                bufferedChannel.k(new AccountSettingsContract.Action.OpenMagicLink(accountHomeOptionMandyItem.c, accountHomeOptionMandyItem.b));
                return;
            }
            AccountHomeOptionMagicLinkItem accountHomeOptionMagicLinkItem = (AccountHomeOptionMagicLinkItem) option;
            String str2 = accountHomeOptionMagicLinkItem.f5710a;
            String str3 = accountHomeOptionMagicLinkItem.b;
            String str4 = accountHomeOptionMagicLinkItem.c;
            if (Intrinsics.c(str2, "everyday_extra_option")) {
                bufferedChannel.k(new AccountSettingsContract.Action.OpenMagicLinkInChromeTab(str4, str3));
            } else {
                bufferedChannel.k(new AccountSettingsContract.Action.OpenMagicLink(str4, str3));
            }
        }
    }

    public final void q6(String itemId) {
        ArrayList arrayList;
        Object next;
        Intrinsics.h(itemId, "itemId");
        List list = ((AccountSettingsContract.ViewState) this.k.getValue()).c.b;
        if (list != null) {
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CollectionsKt.h(((AccountMenuSection) it.next()).b, arrayList);
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    if (Intrinsics.c(((AccountHomeOption) next).getF5710a(), itemId)) {
                        break;
                    }
                }
            }
            AccountHomeOption accountHomeOption = (AccountHomeOption) next;
            if (accountHomeOption != null) {
                this.p = null;
                R4(accountHomeOption);
                return;
            }
        }
        this.p = itemId;
    }

    public final void r6() {
        MutableStateFlow mutableStateFlow;
        Object value;
        do {
            mutableStateFlow = this.k;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, AccountSettingsContract.ViewState.a((AccountSettingsContract.ViewState) value, !this.o, true, null, null, false, false, false, 236)));
        BuildersKt.c(ViewModelKt.a(this), null, null, new AccountSettingsViewModel$fetchAccountMenu$2(this, null), 3);
    }

    public final void s6(boolean z) {
        MutableStateFlow mutableStateFlow;
        Object value;
        do {
            mutableStateFlow = this.k;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, AccountSettingsContract.ViewState.a((AccountSettingsContract.ViewState) value, false, false, null, null, false, false, true, 31)));
        BuildersKt.c(ViewModelKt.a(this), null, null, new AccountSettingsViewModel$logout$2(this, z, null), 3);
    }

    public final void t6() {
        List list = ((AccountSettingsContract.ViewState) this.k.getValue()).c.b;
        boolean z = false;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof AccountHomeSection) {
                    arrayList.add(obj);
                }
            }
            if (AccountHomeSectionKt.a(arrayList)) {
                z = true;
            }
        }
        this.g.b.setValue(Boolean.valueOf(z));
    }
}
