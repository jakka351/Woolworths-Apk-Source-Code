package au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences;

import au.com.woolworths.base.rewards.account.data.PreferenceDetailsAnalyticsData;
import au.com.woolworths.base.rewards.account.data.PreferenceToggleData;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.data.BulletedListItem;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.data.RewardsSecurePreference;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.data.RewardsSecurePreferenceLoadingState;
import com.woolworths.rewards.redemptionsettings.fragment.RewardsSecurePreferenceFields;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"redemption-settings_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsSecurePreferenceFieldsExtKt {
    public static final RewardsSecurePreference a(RewardsSecurePreferenceFields rewardsSecurePreferenceFields) {
        String str = rewardsSecurePreferenceFields.f21115a;
        String str2 = rewardsSecurePreferenceFields.b;
        ArrayList<RewardsSecurePreferenceFields.InfoItem> arrayList = rewardsSecurePreferenceFields.c;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        for (RewardsSecurePreferenceFields.InfoItem infoItem : arrayList) {
            Intrinsics.h(infoItem, "<this>");
            arrayList2.add(new BulletedListItem(infoItem.f21117a, infoItem.c, infoItem.d));
        }
        RewardsSecurePreferenceFields.SecurePreference securePreference = rewardsSecurePreferenceFields.d;
        PreferenceToggleData preferenceToggleData = new PreferenceToggleData(securePreference.f21119a, securePreference.b, securePreference.c, securePreference.d, securePreference.e, new PreferenceDetailsAnalyticsData(securePreference.f.f21116a), securePreference.g);
        RewardsSecurePreferenceFields.LoadingState loadingState = rewardsSecurePreferenceFields.e;
        return new RewardsSecurePreference(str, str2, arrayList2, preferenceToggleData, new RewardsSecurePreferenceLoadingState(loadingState.f21118a, loadingState.b));
    }
}
