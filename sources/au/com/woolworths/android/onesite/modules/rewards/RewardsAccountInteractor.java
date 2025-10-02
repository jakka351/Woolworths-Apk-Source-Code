package au.com.woolworths.android.onesite.modules.rewards;

import au.com.woolworths.android.onesite.analytics.PersistentMetadataProvider;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsCardData;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsLiteCardData;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsState;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsTokenInfo;
import au.com.woolworths.android.onesite.utils.InStoreWifiSavedMemberProvider;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/android/onesite/modules/rewards/RewardsAccountInteractor;", "Lau/com/woolworths/android/onesite/modules/rewards/RewardsCardSource;", "Lau/com/woolworths/android/onesite/analytics/PersistentMetadataProvider;", "Lau/com/woolworths/android/onesite/utils/InStoreWifiSavedMemberProvider;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface RewardsAccountInteractor extends RewardsCardSource, PersistentMetadataProvider, InStoreWifiSavedMemberProvider {
    void clearRewardsData();

    void clearRewardsDataAndCookies();

    Object completeLogout(Continuation continuation);

    Object exchangeToken(String str, boolean z, Continuation continuation);

    Object fetchSignupDetails(String str, Continuation continuation);

    Object fetchVisitorId(Continuation continuation);

    RewardsCardData getCardData();

    RewardsLiteCardData getLiteCardData();

    Single getRewardsLinkDetails();

    Single getRewardsSignupDetails(boolean z, String str);

    RewardsState getRewardsState();

    RewardsTokenInfo getTokenData();

    String getUncachedVisitorId();

    String getVisitorId();

    boolean isRewardsLinked();

    Single linkRewardsCard(String str, String str2);

    Single login(String str, String str2);

    Object logout(Continuation continuation);

    void setCardData(RewardsCardData rewardsCardData);

    void setRewardsState(RewardsState rewardsState);

    void setShouldIncludeUncachedVisitorIdInAnalytics(boolean z);

    void setTokenData(RewardsTokenInfo rewardsTokenInfo);

    void setUncachedVisitorId(String str);

    Object unlinkRewardsCard(Continuation continuation);

    Single unlinkRewardsCardOld();
}
