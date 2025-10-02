package au.com.woolworths.feature.rewards.redemptionsettings;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.base.rewards.account.data.RewardsRedemptionIcon;
import au.com.woolworths.base.rewards.account.data.RewardsRedemptionSettingCta;
import au.com.woolworths.base.rewards.account.data.RewardsRedemptionSettingMessage;
import au.com.woolworths.base.rewards.account.data.RewardsRedemptionSettingsItem;
import au.com.woolworths.base.rewards.account.data.RewardsTwoFactorAuth;
import au.com.woolworths.feature.rewards.redemptionsettings.data.RewardsRedemptionAction;
import au.com.woolworths.feature.rewards.redemptionsettings.data.RewardsRedemptionActionsList;
import au.com.woolworths.feature.rewards.redemptionsettings.data.RewardsRedemptionSettingsList;
import com.woolworths.rewards.redemptionsettings.fragment.RedemptionSettingsListFields;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"redemption-settings_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RedemptionSettingsListFieldsExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.ArrayList] */
    public static final RewardsRedemptionSettingsList a(RedemptionSettingsListFields redemptionSettingsListFields) {
        RewardsRedemptionActionsList rewardsRedemptionActionsList;
        RewardsRedemptionIcon rewardsRedemptionIcon;
        ?? arrayList;
        RewardsRedemptionSettingCta rewardsRedemptionSettingCta;
        ArrayList<RedemptionSettingsListFields.Item> arrayList2 = redemptionSettingsListFields.b;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayList2, 10));
        for (RedemptionSettingsListFields.Item item : arrayList2) {
            Intrinsics.h(item, "<this>");
            boolean z = item.f21104a;
            switch (item.b.ordinal()) {
                case 0:
                    rewardsRedemptionIcon = RewardsRedemptionIcon.AIRPLANE;
                    break;
                case 1:
                    rewardsRedemptionIcon = RewardsRedemptionIcon.AUTOMATIC;
                    break;
                case 2:
                    rewardsRedemptionIcon = RewardsRedemptionIcon.CHRISTMAS_STOCKING;
                    break;
                case 3:
                    rewardsRedemptionIcon = RewardsRedemptionIcon.AUTOMATIC_LOCKED;
                    break;
                case 4:
                    rewardsRedemptionIcon = RewardsRedemptionIcon.NZ_AIRLINES;
                    break;
                case 5:
                    rewardsRedemptionIcon = RewardsRedemptionIcon.NZ_SAVE_FOR_ANOTHER_OCCASION;
                    break;
                case 6:
                    rewardsRedemptionIcon = RewardsRedemptionIcon.BFC_LOCKED;
                    break;
                case 7:
                    rewardsRedemptionIcon = RewardsRedemptionIcon.TEN_DOLLARS_OFF;
                    break;
                case 8:
                    rewardsRedemptionIcon = RewardsRedemptionIcon.AUTO_UNLOCKED;
                    break;
                default:
                    rewardsRedemptionIcon = RewardsRedemptionIcon.UNKNOWN;
                    break;
            }
            RewardsRedemptionIcon rewardsRedemptionIcon2 = rewardsRedemptionIcon;
            String str = item.c;
            String str2 = item.d;
            List list = item.e;
            if (list != null) {
                List<RedemptionSettingsListFields.ConfirmationMessage> list2 = list;
                arrayList = new ArrayList(CollectionsKt.s(list2, 10));
                for (RedemptionSettingsListFields.ConfirmationMessage confirmationMessage : list2) {
                    Intrinsics.h(confirmationMessage, "<this>");
                    arrayList.add(new RewardsRedemptionSettingMessage(confirmationMessage.f21101a, confirmationMessage.b, confirmationMessage.c));
                }
            } else {
                arrayList = 0;
            }
            if (arrayList == 0) {
                arrayList = EmptyList.d;
            }
            Boolean bool = item.f;
            RedemptionSettingsListFields.Cta cta = item.g;
            if (cta != null) {
                String str3 = cta.f21102a;
                RedemptionSettingsListFields.Cta1 cta1 = cta.b;
                rewardsRedemptionSettingCta = new RewardsRedemptionSettingCta(str3, new ContentCta(cta1.f21103a, cta1.b, (String) null, (Boolean) null, (AnalyticsData) null, 28, (DefaultConstructorMarker) null));
            } else {
                rewardsRedemptionSettingCta = null;
            }
            arrayList3.add(new RewardsRedemptionSettingsItem(z, rewardsRedemptionIcon2, str, str2, arrayList, bool, rewardsRedemptionSettingCta));
        }
        RedemptionSettingsListFields.TwoFactorAuth twoFactorAuth = redemptionSettingsListFields.f21099a;
        RewardsTwoFactorAuth rewardsTwoFactorAuth = twoFactorAuth != null ? new RewardsTwoFactorAuth(twoFactorAuth.f21106a) : null;
        RedemptionSettingsListFields.Actions actions = redemptionSettingsListFields.c;
        if (actions != null) {
            String str4 = actions.f21100a;
            ArrayList<RedemptionSettingsListFields.Item1> arrayList4 = actions.b;
            ArrayList arrayList5 = new ArrayList(CollectionsKt.s(arrayList4, 10));
            for (RedemptionSettingsListFields.Item1 item1 : arrayList4) {
                Intrinsics.h(item1, "<this>");
                arrayList5.add(new RewardsRedemptionAction(item1.f21105a, item1.b, item1.c, item1.d));
            }
            rewardsRedemptionActionsList = new RewardsRedemptionActionsList(str4, arrayList5);
        } else {
            rewardsRedemptionActionsList = null;
        }
        return new RewardsRedemptionSettingsList(arrayList3, rewardsTwoFactorAuth, rewardsRedemptionActionsList);
    }
}
