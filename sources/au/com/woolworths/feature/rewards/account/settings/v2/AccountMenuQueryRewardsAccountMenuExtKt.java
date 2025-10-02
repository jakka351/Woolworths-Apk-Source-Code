package au.com.woolworths.feature.rewards.account.settings.v2;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.base.rewards.account.data.AccountHomeFooter;
import au.com.woolworths.base.rewards.account.data.IconListItemAction;
import au.com.woolworths.feature.rewards.account.data.AccountHomeAndroidAppReviewLinkItem;
import au.com.woolworths.feature.rewards.account.data.AccountHomeAndroidMedalliaItem;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOnboardingItem;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOption;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOptionAction;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOptionCanCloseAccountItem;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOptionDeleteAccountItem;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOptionItem;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOptionMagicLinkItem;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOptionMandyItem;
import au.com.woolworths.feature.rewards.account.data.HomeOptionAction;
import au.com.woolworths.feature.rewards.account.settings.v2.model.AccountMenuSection;
import au.com.woolworths.feature.rewards.account.settings.v2.model.RewardsAccountMenu;
import au.com.woolworths.foundation.rewards.banner.model.RewardsNotificationBannerApiData;
import com.woolworths.rewards.account.AccountMenuQuery;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"account_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AccountMenuQueryRewardsAccountMenuExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    public static final RewardsAccountMenu a(AccountMenuQuery.RewardsAccountMenu rewardsAccountMenu) {
        RewardsNotificationBannerApiData rewardsNotificationBannerApiData;
        ?? arrayList;
        AccountHomeFooter accountHomeFooter;
        AccountHomeOption accountHomeOptionDeleteAccountItem;
        AccountHomeOption accountHomeOptionCanCloseAccountItem;
        AccountMenuQuery.OnAccountBannerNotification onAccountBannerNotification;
        Intrinsics.h(rewardsAccountMenu, "<this>");
        AccountMenuQuery.AccountBanner accountBanner = rewardsAccountMenu.f20532a;
        if (accountBanner == null || (onAccountBannerNotification = accountBanner.b) == null) {
            rewardsNotificationBannerApiData = null;
        } else {
            String str = onAccountBannerNotification.f20522a;
            String str2 = onAccountBannerNotification.c;
            String str3 = onAccountBannerNotification.d;
            int iOrdinal = onAccountBannerNotification.b.ordinal();
            RewardsNotificationBannerApiData.DisplayType displayType = iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? RewardsNotificationBannerApiData.DisplayType.INFO : RewardsNotificationBannerApiData.DisplayType.ERROR : RewardsNotificationBannerApiData.DisplayType.WARNING : RewardsNotificationBannerApiData.DisplayType.INFO;
            AccountMenuQuery.PrimaryCta primaryCta = onAccountBannerNotification.e;
            rewardsNotificationBannerApiData = new RewardsNotificationBannerApiData(str, str2, str3, displayType, primaryCta != null ? new ContentCta(primaryCta.f20531a, primaryCta.b, (String) null, (Boolean) null, (AnalyticsData) null, 28, (DefaultConstructorMarker) null) : null, onAccountBannerNotification.f, onAccountBannerNotification.g, null);
        }
        List list = rewardsAccountMenu.b;
        if (list != null) {
            List<AccountMenuQuery.Section> list2 = list;
            arrayList = new ArrayList(CollectionsKt.s(list2, 10));
            for (AccountMenuQuery.Section section : list2) {
                Intrinsics.h(section, "<this>");
                String str4 = section.f20533a;
                ArrayList<AccountMenuQuery.Item> arrayList2 = section.b;
                ArrayList arrayList3 = new ArrayList();
                for (AccountMenuQuery.Item item : arrayList2) {
                    AccountMenuQuery.OnAccountHomeOptionItem onAccountHomeOptionItem = item.b;
                    if (onAccountHomeOptionItem != null) {
                        String str5 = onAccountHomeOptionItem.f20528a;
                        String str6 = onAccountHomeOptionItem.b;
                        AccountMenuQuery.Action action = onAccountHomeOptionItem.c;
                        int iOrdinal2 = action.f20517a.ordinal();
                        accountHomeOptionDeleteAccountItem = new AccountHomeOptionItem(str5, str6, new AccountHomeOptionAction(iOrdinal2 != 0 ? iOrdinal2 != 1 ? HomeOptionAction.f : HomeOptionAction.e : HomeOptionAction.d, action.b), onAccountHomeOptionItem.d, false, 48);
                    } else {
                        AccountMenuQuery.OnAccountHomeOptionMagicLinkItem onAccountHomeOptionMagicLinkItem = item.c;
                        if (onAccountHomeOptionMagicLinkItem != null) {
                            accountHomeOptionCanCloseAccountItem = new AccountHomeOptionMagicLinkItem(onAccountHomeOptionMagicLinkItem.f20529a, onAccountHomeOptionMagicLinkItem.b, onAccountHomeOptionMagicLinkItem.c, onAccountHomeOptionMagicLinkItem.d, Boolean.FALSE);
                        } else {
                            AccountMenuQuery.OnAccountHomeOptionMandyItem onAccountHomeOptionMandyItem = item.d;
                            if (onAccountHomeOptionMandyItem != null) {
                                accountHomeOptionCanCloseAccountItem = new AccountHomeOptionMandyItem(onAccountHomeOptionMandyItem.f20530a, onAccountHomeOptionMandyItem.b, onAccountHomeOptionMandyItem.c, onAccountHomeOptionMandyItem.d, Boolean.FALSE, false);
                            } else {
                                AccountMenuQuery.OnAccountHomeAndroidAppReviewLinkItem onAccountHomeAndroidAppReviewLinkItem = item.e;
                                if (onAccountHomeAndroidAppReviewLinkItem != null) {
                                    accountHomeOptionCanCloseAccountItem = new AccountHomeAndroidAppReviewLinkItem(onAccountHomeAndroidAppReviewLinkItem.f20523a, onAccountHomeAndroidAppReviewLinkItem.b, onAccountHomeAndroidAppReviewLinkItem.c, onAccountHomeAndroidAppReviewLinkItem.d, Boolean.FALSE, true);
                                } else {
                                    AccountMenuQuery.OnAccountHomeAndroidMedalliaItem onAccountHomeAndroidMedalliaItem = item.f;
                                    if (onAccountHomeAndroidMedalliaItem != null) {
                                        accountHomeOptionCanCloseAccountItem = new AccountHomeAndroidMedalliaItem(onAccountHomeAndroidMedalliaItem.f20524a, onAccountHomeAndroidMedalliaItem.b, onAccountHomeAndroidMedalliaItem.c, onAccountHomeAndroidMedalliaItem.d, Boolean.FALSE, true);
                                    } else {
                                        AccountMenuQuery.OnAccountHomeOnboardingItem onAccountHomeOnboardingItem = item.g;
                                        if (onAccountHomeOnboardingItem != null) {
                                            String str7 = onAccountHomeOnboardingItem.f20525a;
                                            String str8 = onAccountHomeOnboardingItem.b;
                                            AccountMenuQuery.Action1 action1 = onAccountHomeOnboardingItem.c;
                                            int iOrdinal3 = action1.f20518a.ordinal();
                                            accountHomeOptionDeleteAccountItem = new AccountHomeOnboardingItem(str7, str8, new AccountHomeOptionAction(iOrdinal3 != 0 ? iOrdinal3 != 1 ? HomeOptionAction.f : HomeOptionAction.e : HomeOptionAction.d, action1.b), onAccountHomeOnboardingItem.d);
                                        } else {
                                            AccountMenuQuery.OnAccountHomeOptionCanCloseAccountItem onAccountHomeOptionCanCloseAccountItem = item.h;
                                            if (onAccountHomeOptionCanCloseAccountItem != null) {
                                                accountHomeOptionCanCloseAccountItem = new AccountHomeOptionCanCloseAccountItem(onAccountHomeOptionCanCloseAccountItem.f20526a, onAccountHomeOptionCanCloseAccountItem.b, onAccountHomeOptionCanCloseAccountItem.c, onAccountHomeOptionCanCloseAccountItem.d, onAccountHomeOptionCanCloseAccountItem.e, Boolean.FALSE, true);
                                            } else {
                                                AccountMenuQuery.OnAccountHomeOptionDeleteAccountItem onAccountHomeOptionDeleteAccountItem = item.i;
                                                accountHomeOptionDeleteAccountItem = onAccountHomeOptionDeleteAccountItem != null ? new AccountHomeOptionDeleteAccountItem(onAccountHomeOptionDeleteAccountItem.f20527a, onAccountHomeOptionDeleteAccountItem.b, null, null, false) : null;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        accountHomeOptionDeleteAccountItem = accountHomeOptionCanCloseAccountItem;
                    }
                    if (accountHomeOptionDeleteAccountItem != null) {
                        arrayList3.add(accountHomeOptionDeleteAccountItem);
                    }
                }
                arrayList.add(new AccountMenuSection(str4, arrayList3));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = EmptyList.d;
        }
        AccountMenuQuery.AccountHomeFooter accountHomeFooter2 = rewardsAccountMenu.c;
        if (accountHomeFooter2 != null) {
            String str9 = accountHomeFooter2.f20516a;
            String str10 = accountHomeFooter2.b;
            AccountMenuQuery.Action2 action2 = accountHomeFooter2.c;
            accountHomeFooter = new AccountHomeFooter(str9, str10, action2 != null ? new IconListItemAction(action2.f20519a, action2.b) : null);
        } else {
            accountHomeFooter = null;
        }
        return new RewardsAccountMenu(rewardsNotificationBannerApiData, arrayList, accountHomeFooter);
    }
}
