package au.com.woolworths.feature.rewards.account.settings;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.analytics.rewards.account.AccountAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.extensions.LiveDataExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.modules.rewards.RewardsPointsBalance;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.base.rewards.account.data.AccountHomeFooter;
import au.com.woolworths.base.rewards.account.data.IconListItemAction;
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
import au.com.woolworths.feature.rewards.account.data.AccountHomeOptionLoading;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOptionLogoutItem;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOptionMagicLinkItem;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOptionMandyItem;
import au.com.woolworths.feature.rewards.account.data.AccountHomeSection;
import au.com.woolworths.feature.rewards.account.data.AccountHomeSectionKt;
import au.com.woolworths.feature.rewards.account.data.AccountHomeSectionLoading;
import au.com.woolworths.feature.rewards.account.data.AccountSettingsAppVersionData;
import au.com.woolworths.feature.rewards.account.data.AccountSettingsChangeCountry;
import au.com.woolworths.feature.rewards.account.data.AccountSettingsLogoutData;
import au.com.woolworths.feature.rewards.account.data.DefaultAccountSettings;
import au.com.woolworths.feature.rewards.account.data.HomeOptionAction;
import au.com.woolworths.feature.rewards.account.data.LocalAction;
import au.com.woolworths.feature.rewards.account.settings.AccountSettingsContractOld;
import au.com.woolworths.feature.shared.feedback.medallia.MedalliaInteractor;
import au.com.woolworths.foundation.force.upgrade.impl.AppConfigClientImpl;
import au.com.woolworths.foundation.rewards.banner.model.RewardsNotificationBannerApiData;
import au.com.woolworths.rewards.base.RewardsBaseFeature;
import au.com.woolworths.rewards.base.homepage.AccountNotificationBadgeInteractor;
import au.com.woolworths.rewards.base.homepage.CacheType;
import au.com.woolworths.rewards.base.homepage.RewardsBannerInteractor;
import au.com.woolworths.rewards.base.points.RewardsPointsBalanceInteractor;
import au.com.woolworths.sdui.model.action.ActionData;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsViewModelOld;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsClickListenerOld;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "Companion", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AccountSettingsViewModelOld extends ViewModel implements AccountSettingsClickListenerOld, FullPageErrorStateClickHandler {
    public final RewardsAccountInteractor e;
    public final AccountSettingsInteractorOld f;
    public final RewardsPointsBalanceInteractor g;
    public final AnalyticsManager h;
    public final FeatureToggleManager i;
    public final MedalliaInteractor j;
    public final AccountNotificationBadgeInteractor k;
    public final RewardsBannerInteractor l;
    public final AppConfigClientImpl m;
    public final MutableLiveData n;
    public final SharedFlowImpl o;
    public final MutableLiveData p;
    public final Flow q;
    public String r;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsViewModelOld$Companion;", "", "", "HOME_OPTION_MAGIC_LINK_EVERYDAY_EXTRA", "Ljava/lang/String;", "IN_STORE_WIFI_ITEM_ID", "MY_ORDERS_ITEM_ID", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5771a;

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
            int[] iArr2 = new int[LocalAction.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                LocalAction.Companion companion = LocalAction.e;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f5771a = iArr2;
        }
    }

    public AccountSettingsViewModelOld(RewardsAccountInteractor accountInteractor, AccountSettingsInteractorOld accountSettingsInteractor, RewardsPointsBalanceInteractor rewardsPointsBalanceInteractor, AnalyticsManager analyticsManager, FeatureToggleManager featureToggleManager, MedalliaInteractor medalliaInteractor, AccountNotificationBadgeInteractor accountNotificationBadgeInteractor, RewardsBannerInteractor rewardsBannerInteractor, AppConfigClientImpl appConfigClientImpl) {
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(accountSettingsInteractor, "accountSettingsInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(medalliaInteractor, "medalliaInteractor");
        Intrinsics.h(accountNotificationBadgeInteractor, "accountNotificationBadgeInteractor");
        Intrinsics.h(rewardsBannerInteractor, "rewardsBannerInteractor");
        this.e = accountInteractor;
        this.f = accountSettingsInteractor;
        this.g = rewardsPointsBalanceInteractor;
        this.h = analyticsManager;
        this.i = featureToggleManager;
        this.j = medalliaInteractor;
        this.k = accountNotificationBadgeInteractor;
        this.l = rewardsBannerInteractor;
        this.m = appConfigClientImpl;
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.n = mutableLiveData;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.o = sharedFlowImplB;
        this.p = mutableLiveData;
        this.q = FlowKt.a(sharedFlowImplB);
        AccountSettingsRepositoryOld accountSettingsRepositoryOld = accountSettingsInteractor.f5770a;
        mutableLiveData.m(new AccountSettingsContractOld.ViewState(null, EmptyList.d, ArraysKt.F(new Object[]{AccountSettingsChangeCountry.f5715a, AccountSettingsLogoutData.f5716a, null}), new AccountSettingsAppVersionData(Calendar.getInstance().get(1), ContextExtKt.c(accountSettingsRepositoryOld.d), ""), null, false, false));
        BuildersKt.c(ViewModelKt.a(this), null, null, new AccountSettingsViewModelOld$listenToPointsBalanceChanges$1(this, null), 3);
        p6(true);
    }

    public static ArrayList t6(List list, AccountHomeOption accountHomeOption, AccountHomeOption accountHomeOption2) {
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        for (Object obj : list) {
            if (Intrinsics.c(obj, accountHomeOption)) {
                obj = accountHomeOption2;
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static void v6(AccountSettingsViewModelOld accountSettingsViewModelOld, MutableLiveData mutableLiveData, RewardsPointsBalance rewardsPointsBalance, List list, AccountHomeFooter accountHomeFooter, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            rewardsPointsBalance = ((AccountSettingsContractOld.ViewState) LiveDataExtKt.a(mutableLiveData)).f5768a;
        }
        RewardsPointsBalance rewardsPointsBalance2 = rewardsPointsBalance;
        if ((i & 2) != 0) {
            list = ((AccountSettingsContractOld.ViewState) LiveDataExtKt.a(mutableLiveData)).b;
        }
        List list2 = list;
        List list3 = ((AccountSettingsContractOld.ViewState) LiveDataExtKt.a(mutableLiveData)).c;
        AccountSettingsAppVersionData accountSettingsAppVersionData = ((AccountSettingsContractOld.ViewState) LiveDataExtKt.a(mutableLiveData)).d;
        if ((i & 16) != 0) {
            accountHomeFooter = ((AccountSettingsContractOld.ViewState) LiveDataExtKt.a(mutableLiveData)).e;
        }
        AccountHomeFooter accountHomeFooter2 = accountHomeFooter;
        if ((i & 32) != 0) {
            z = ((AccountSettingsContractOld.ViewState) LiveDataExtKt.a(mutableLiveData)).f;
        }
        boolean z3 = z;
        if ((i & 64) != 0) {
            z2 = ((AccountSettingsContractOld.ViewState) LiveDataExtKt.a(mutableLiveData)).g;
        }
        accountSettingsViewModelOld.getClass();
        mutableLiveData.m(new AccountSettingsContractOld.ViewState(rewardsPointsBalance2, list2, list3, accountSettingsAppVersionData, accountHomeFooter2, z3, z2));
    }

    @Override // au.com.woolworths.feature.rewards.account.settings.AccountSettingsClickListenerOld
    public final void P2(RewardsNotificationBannerApiData rewardsNotificationBannerApiData) {
        String url;
        String bannerDataId = rewardsNotificationBannerApiData.getId();
        RewardsBannerInteractor rewardsBannerInteractor = this.l;
        rewardsBannerInteractor.getClass();
        Intrinsics.h(bannerDataId, "bannerDataId");
        rewardsBannerInteractor.b.add(bannerDataId);
        ContentCta primaryCta = rewardsNotificationBannerApiData.getPrimaryCta();
        if (primaryCta == null || (url = primaryCta.getUrl()) == null) {
            return;
        }
        this.o.f(new AccountSettingsContractOld.Actions.OpenUrl(url));
    }

    @Override // au.com.woolworths.feature.rewards.account.settings.AccountSettingsClickListenerOld
    public final void R4(AccountHomeOption item) {
        AccountSettingsViewModelOld accountSettingsViewModelOld;
        AccountHomeOptionMandyItem accountHomeOptionMandyItem;
        boolean z;
        Intrinsics.h(item, "item");
        String f5710a = item.getF5710a();
        boolean zC = Intrinsics.c(f5710a, "instore_wifi");
        AnalyticsManager analyticsManager = this.h;
        if (zC) {
            analyticsManager.c(AccountSettingsActionDataOld.f);
        } else if (Intrinsics.c(f5710a, "my_orders")) {
            analyticsManager.g(AccountAnalytics.Account.Action.d);
        } else {
            analyticsManager.j(AccountSettingsActionDataOld.e, TrackingMetadata.Companion.a(TrackableValue.o0, item.getB()));
        }
        boolean zC2 = Intrinsics.c(item.getD(), Boolean.TRUE);
        MutableLiveData mutableLiveData = this.n;
        if (!zC2) {
            accountSettingsViewModelOld = this;
            break;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : ((AccountSettingsContractOld.ViewState) LiveDataExtKt.a(mutableLiveData)).b) {
            if (!(obj instanceof AccountHomeSection)) {
                arrayList.add(obj);
                accountSettingsViewModelOld = this;
                break;
            }
            AccountHomeSection accountHomeSection = (AccountHomeSection) obj;
            List list = accountHomeSection.b;
            if (list != null && list.contains(item)) {
                accountHomeSection = new AccountHomeSection(accountHomeSection.f5712a, t6(list, item, item.b()));
            }
            arrayList.add(accountHomeSection);
        }
        accountSettingsViewModelOld = this;
        v6(accountSettingsViewModelOld, mutableLiveData, null, arrayList, null, false, false, 125);
        if (Intrinsics.c(item.getD(), Boolean.TRUE)) {
            BuildersKt.c(ViewModelKt.a(this), null, null, new AccountSettingsViewModelOld$handleBadges$1(this, item, null), 3);
        }
        boolean z2 = item instanceof AccountHomeOptionMandyItem;
        if (z2 && (z = (accountHomeOptionMandyItem = (AccountHomeOptionMandyItem) item).f) && z2 && z) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ((AccountSettingsContractOld.ViewState) LiveDataExtKt.a(mutableLiveData)).b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    v6(accountSettingsViewModelOld, mutableLiveData, null, arrayList2, null, false, false, 125);
                    break;
                }
                Object next = it.next();
                if (!(next instanceof AccountHomeSection)) {
                    arrayList2.add(next);
                    break;
                }
                AccountHomeSection accountHomeSection2 = (AccountHomeSection) next;
                List list2 = accountHomeSection2.b;
                if (list2 != null && list2.contains(item)) {
                    accountHomeSection2 = new AccountHomeSection(accountHomeSection2.f5712a, t6(list2, item, AccountHomeOptionMandyItem.d(accountHomeOptionMandyItem, null, false, 63)));
                }
                arrayList2.add(accountHomeSection2);
            }
        }
        u6();
        boolean z3 = item instanceof AccountHomeOptionItem;
        SharedFlowImpl sharedFlowImpl = accountSettingsViewModelOld.o;
        if (z3) {
            AccountHomeOptionAction accountHomeOptionAction = ((AccountHomeOptionItem) item).c;
            HomeOptionAction homeOptionAction = accountHomeOptionAction.f5702a;
            String str = accountHomeOptionAction.b;
            int iOrdinal = homeOptionAction.ordinal();
            if (iOrdinal == 0) {
                sharedFlowImpl.f(new AccountSettingsContractOld.Actions.OpenInAppBrowser(str));
                return;
            } else if (iOrdinal == 1) {
                sharedFlowImpl.f(new AccountSettingsContractOld.Actions.OpenUrl(str));
                return;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        if (item instanceof AccountHomeOptionMagicLinkItem) {
            AccountHomeOptionMagicLinkItem accountHomeOptionMagicLinkItem = (AccountHomeOptionMagicLinkItem) item;
            String str2 = accountHomeOptionMagicLinkItem.f5710a;
            String str3 = accountHomeOptionMagicLinkItem.b;
            String str4 = accountHomeOptionMagicLinkItem.c;
            if (Intrinsics.c(str2, "everyday_extra_option")) {
                sharedFlowImpl.f(new AccountSettingsContractOld.Actions.OpenMagicLinkInChromeTab(str4, str3));
                return;
            } else {
                sharedFlowImpl.f(new AccountSettingsContractOld.Actions.OpenMagicLink(str4, str3));
                return;
            }
        }
        if (z2) {
            AccountHomeOptionMandyItem accountHomeOptionMandyItem2 = (AccountHomeOptionMandyItem) item;
            sharedFlowImpl.f(new AccountSettingsContractOld.Actions.OpenMagicLink(accountHomeOptionMandyItem2.c, accountHomeOptionMandyItem2.b));
            return;
        }
        if (item instanceof AccountHomeAndroidAppReviewLinkItem) {
            sharedFlowImpl.f(new AccountSettingsContractOld.Actions.OpenAndroidReviewLink(((AccountHomeAndroidAppReviewLinkItem) item).c));
            return;
        }
        if (item instanceof AccountHomeAndroidMedalliaItem) {
            AccountHomeAndroidMedalliaItem accountHomeAndroidMedalliaItem = (AccountHomeAndroidMedalliaItem) item;
            w6(accountHomeAndroidMedalliaItem.f5699a, true);
            BuildersKt.c(ViewModelKt.a(this), null, null, new AccountSettingsViewModelOld$onMedalliaItemClick$1(this, accountHomeAndroidMedalliaItem, null), 3);
        } else {
            if (item instanceof AccountHomeOnboardingItem) {
                return;
            }
            if (!(item instanceof AccountHomeOptionCanCloseAccountItem)) {
                if (item instanceof AccountHomeOptionDeleteAccountItem) {
                    throw new IllegalArgumentException("AccountHomeOptionDeleteAccountItem cannot be here");
                }
                if (item instanceof AccountHomeOptionDevOptionsItem) {
                    throw new IllegalArgumentException("AccountHomeOptionDevOptionsItem cannot be here");
                }
                if (item instanceof AccountHomeOptionChangeCountryItem) {
                    throw new IllegalArgumentException("AccountHomeOptionChangeCountryItem cannot be here");
                }
                if (!(item instanceof AccountHomeOptionLogoutItem)) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalArgumentException("AccountHomeOptionLogoutItem cannot be here");
            }
            AccountHomeOptionCanCloseAccountItem accountHomeOptionCanCloseAccountItem = (AccountHomeOptionCanCloseAccountItem) item;
            sharedFlowImpl.f(new AccountSettingsContractOld.Actions.OpenCallbackUrl(new Activities.RewardsCallbackUrlActivity.Extras(accountHomeOptionCanCloseAccountItem.b, accountHomeOptionCanCloseAccountItem.c, Activities.RewardsCallbackUrlActivity.CallbackType.d, accountHomeOptionCanCloseAccountItem.d)));
        }
    }

    @Override // au.com.woolworths.feature.rewards.account.settings.AccountSettingsClickListenerOld
    public final void a1(ActionData actionData) {
        Object next;
        Intrinsics.h(actionData, "actionData");
        String actionString = actionData.getAction();
        AnalyticsData analytics = actionData.getAnalytics();
        if (analytics != null) {
            this.h.g(AnalyticsDataKt.a(analytics));
        }
        LocalAction.e.getClass();
        Intrinsics.h(actionString, "actionString");
        Iterator it = ((AbstractList) LocalAction.g).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((LocalAction) next).d.equals(actionString)) {
                    break;
                }
            }
        }
        LocalAction localAction = (LocalAction) next;
        int i = localAction == null ? -1 : WhenMappings.f5771a[localAction.ordinal()];
        SharedFlowImpl sharedFlowImpl = this.o;
        if (i == 1) {
            sharedFlowImpl.f(AccountSettingsContractOld.Actions.LaunchAppUpdate.f5755a);
        } else {
            if (i != 2) {
                return;
            }
            sharedFlowImpl.f(AccountSettingsContractOld.Actions.LaunchOsUpdate.f5756a);
        }
    }

    @Override // au.com.woolworths.feature.rewards.account.settings.AccountSettingsClickListenerOld
    public final void a2() {
        this.h.c(AccountSettingsActionDataOld.g);
        this.o.f(AccountSettingsContractOld.Actions.ShowLogoutConfirmation.f5766a);
    }

    @Override // au.com.woolworths.feature.rewards.account.settings.AccountSettingsClickListenerOld
    public final void a6(IconListItemAction action) {
        Intrinsics.h(action, "action");
        this.o.f(new AccountSettingsContractOld.Actions.OpenUrl(action.getUrl()));
    }

    @Override // au.com.woolworths.feature.rewards.account.settings.AccountSettingsClickListenerOld
    public final void h3(RewardsNotificationBannerApiData rewardsNotificationBannerApiData) {
        String id = rewardsNotificationBannerApiData.getId();
        CacheType[] cacheTypeArr = CacheType.d;
        this.l.a(id);
        MutableLiveData mutableLiveData = this.n;
        v6(this, mutableLiveData, null, s6(((AccountSettingsContractOld.ViewState) LiveDataExtKt.a(mutableLiveData)).b), null, false, false, 125);
        u6();
    }

    @Override // au.com.woolworths.feature.rewards.account.settings.AccountSettingsClickListenerOld
    public final void m0() {
        this.o.f(AccountSettingsContractOld.Actions.ShowDeveloperOptions.f5764a);
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onPrimaryActionClicked() {
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        p6(true);
    }

    public final void p6(boolean z) {
        MutableLiveData mutableLiveData = this.n;
        if (z) {
            AccountHomeSectionLoading accountHomeSectionLoading = AccountHomeSectionLoading.f5713a;
            AccountHomeOptionLoading accountHomeOptionLoading = AccountHomeOptionLoading.f5708a;
            v6(this, mutableLiveData, null, CollectionsKt.R(accountHomeSectionLoading, accountHomeOptionLoading, accountHomeOptionLoading, accountHomeOptionLoading, accountHomeSectionLoading, accountHomeOptionLoading, accountHomeOptionLoading, accountHomeOptionLoading), null, false, false, 29);
        } else {
            v6(this, mutableLiveData, null, null, null, true, false, 95);
        }
        BuildersKt.c(ViewModelKt.a(this), null, null, new AccountSettingsViewModelOld$fetchAccountHome$1(this, null), 3);
    }

    @Override // au.com.woolworths.feature.rewards.account.settings.AccountSettingsClickListenerOld
    public final void q4() {
        this.o.f(AccountSettingsContractOld.Actions.ShowChangeCountryConfirmation.f5763a);
    }

    public final void q6(Exception exc) {
        if (exc instanceof NoConnectivityException) {
            this.o.f(AccountSettingsContractOld.Actions.ShowLogoutConnectionError.f5767a);
        } else {
            BuildersKt.c(ViewModelKt.a(this), null, null, new AccountSettingsViewModelOld$onLogoutFailed$1(this, null), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.ArrayList] */
    public final void r6(String itemId) {
        Object next;
        Object next2;
        ?? arrayList;
        Intrinsics.h(itemId, "itemId");
        MutableLiveData mutableLiveData = this.p;
        List list = ((AccountSettingsContractOld.ViewState) LiveDataExtKt.a(mutableLiveData)).b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof AccountHomeSection) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            List list2 = ((AccountHomeSection) it.next()).b;
            if (list2 != null) {
                arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (obj2 instanceof AccountHomeOption) {
                        arrayList.add(obj2);
                    }
                }
            } else {
                arrayList = EmptyList.d;
            }
            CollectionsKt.h((Iterable) arrayList, arrayList3);
        }
        if (arrayList3.isEmpty()) {
            this.r = itemId;
            return;
        }
        Iterator it2 = arrayList3.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.c(((AccountHomeOption) next).getF5710a(), itemId)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AccountHomeOption accountHomeOption = (AccountHomeOption) next;
        if (accountHomeOption != null) {
            this.r = null;
            R4(accountHomeOption);
            return;
        }
        List list3 = ((AccountSettingsContractOld.ViewState) LiveDataExtKt.a(mutableLiveData)).c;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : list3) {
            if (obj3 instanceof DefaultAccountSettings) {
                arrayList4.add(obj3);
            }
        }
        Iterator it3 = arrayList4.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
            ((DefaultAccountSettings) next2).getClass();
            if ("logout".equals(itemId)) {
                break;
            }
        }
        DefaultAccountSettings defaultAccountSettings = (DefaultAccountSettings) next2;
        if (defaultAccountSettings != null) {
            this.r = null;
            if (defaultAccountSettings instanceof AccountSettingsLogoutData) {
                a2();
            }
        }
    }

    public final ArrayList s6(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof RewardsNotificationBannerApiData) {
                if (this.l.c(((RewardsNotificationBannerApiData) obj).getId())) {
                }
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public final void u6() {
        boolean z;
        List list = ((AccountSettingsContractOld.ViewState) LiveDataExtKt.a(this.n)).b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof AccountHomeSection) {
                arrayList.add(obj);
            }
        }
        boolean zA = AccountHomeSectionKt.a(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof RewardsNotificationBannerApiData) {
                arrayList2.add(obj2);
            }
        }
        boolean z2 = true;
        if (arrayList2.isEmpty()) {
            z = false;
        } else {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                RewardsNotificationBannerApiData rewardsNotificationBannerApiData = (RewardsNotificationBannerApiData) it.next();
                if (this.i.c(RewardsBaseFeature.g) && rewardsNotificationBannerApiData.getShouldShowNewBadge()) {
                    String id = rewardsNotificationBannerApiData.getId();
                    RewardsBannerInteractor rewardsBannerInteractor = this.l;
                    if (!CollectionsKt.t(rewardsBannerInteractor.b, id) && !rewardsBannerInteractor.c(rewardsNotificationBannerApiData.getId())) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
        }
        if (!zA && !z) {
            z2 = false;
        }
        this.k.b.setValue(Boolean.valueOf(z2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [au.com.woolworths.feature.rewards.account.data.AccountHomeSection] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    public final void w6(String str, boolean z) {
        AccountHomeOption accountHomeOptionD;
        MutableLiveData mutableLiveData = this.n;
        List list = ((AccountSettingsContractOld.ViewState) LiveDataExtKt.a(mutableLiveData)).b;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        for (?? accountHomeSection : list) {
            if (accountHomeSection instanceof AccountHomeSection) {
                accountHomeSection = (AccountHomeSection) accountHomeSection;
                List list2 = accountHomeSection.b;
                AccountHomeOption accountHomeOption = null;
                if (list2 != null) {
                    Iterator it = CollectionsKt.A(list2, AccountHomeOption.class).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ?? next = it.next();
                        if (Intrinsics.c(((AccountHomeOption) next).getF5710a(), str)) {
                            accountHomeOption = next;
                            break;
                        }
                    }
                    accountHomeOption = accountHomeOption;
                }
                if (accountHomeOption != null) {
                    List list3 = list2;
                    if (accountHomeOption instanceof AccountHomeOptionItem) {
                        accountHomeOptionD = AccountHomeOptionItem.d((AccountHomeOptionItem) accountHomeOption, Boolean.valueOf(z), 47);
                    } else if (accountHomeOption instanceof AccountHomeOptionMagicLinkItem) {
                        accountHomeOptionD = AccountHomeOptionMagicLinkItem.d((AccountHomeOptionMagicLinkItem) accountHomeOption, Boolean.valueOf(z), 47);
                    } else if (accountHomeOption instanceof AccountHomeOptionMandyItem) {
                        accountHomeOptionD = AccountHomeOptionMandyItem.d((AccountHomeOptionMandyItem) accountHomeOption, Boolean.valueOf(z), false, 111);
                    } else if (accountHomeOption instanceof AccountHomeAndroidAppReviewLinkItem) {
                        accountHomeOptionD = AccountHomeAndroidAppReviewLinkItem.d((AccountHomeAndroidAppReviewLinkItem) accountHomeOption, Boolean.valueOf(z), 47);
                    } else if (accountHomeOption instanceof AccountHomeAndroidMedalliaItem) {
                        accountHomeOptionD = AccountHomeAndroidMedalliaItem.d((AccountHomeAndroidMedalliaItem) accountHomeOption, Boolean.valueOf(z), 47);
                    } else {
                        if (!(accountHomeOption instanceof AccountHomeOptionCanCloseAccountItem)) {
                            throw new IllegalStateException("Unexpected option type: ".concat(accountHomeOption.getClass().getSimpleName()));
                        }
                        accountHomeOptionD = AccountHomeOptionCanCloseAccountItem.d((AccountHomeOptionCanCloseAccountItem) accountHomeOption, Boolean.valueOf(z), 95);
                    }
                    accountHomeSection = new AccountHomeSection(accountHomeSection.f5712a, t6(list3, accountHomeOption, accountHomeOptionD));
                } else {
                    continue;
                }
            }
            arrayList.add(accountHomeSection);
        }
        v6(this, mutableLiveData, null, arrayList, null, false, false, 125);
    }
}
