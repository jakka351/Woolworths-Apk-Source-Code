package au.com.woolworths.android.onesite.modules.rewards;

import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsCardData;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsLinkCallbackResultData;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsLiteCardData;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsState;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsTokenInfo;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsUnlinkSuccessData;
import au.com.woolworths.android.onesite.network.Component;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.internal.operators.observable.ObservableEmpty;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/rewards/FakeRewardsAccountInteractor;", "Lau/com/woolworths/android/onesite/modules/rewards/RewardsAccountInteractor;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FakeRewardsAccountInteractor implements RewardsAccountInteractor {

    /* renamed from: a, reason: collision with root package name */
    public RewardsState f4391a;
    public RewardsCardData b;
    public String c;
    public RewardsTokenInfo d;

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    public final void clearRewardsData() {
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    public final void clearRewardsDataAndCookies() {
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    public final Object completeLogout(Continuation continuation) {
        return Unit.f24250a;
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    public final Object exchangeToken(String str, boolean z, Continuation continuation) {
        return null;
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    public final Object fetchSignupDetails(String str, Continuation continuation) {
        return null;
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    public final Object fetchVisitorId(Continuation continuation) {
        return "123";
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    /* renamed from: getCardData, reason: from getter */
    public final RewardsCardData getB() {
        return this.b;
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    public final RewardsLiteCardData getLiteCardData() {
        return null;
    }

    @Override // au.com.woolworths.android.onesite.analytics.PersistentMetadataProvider
    public final TrackingMetadata getMetadata() {
        return null;
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsCardSource
    public final Observable getRewardCardSourceObservable() {
        return ObservableEmpty.d;
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    public final Single getRewardsLinkDetails() {
        return Single.e(new Component("RewardsLinkCallbackResult", new RewardsLinkCallbackResultData("url", "token", "callback", null, 8, null)));
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    public final Single getRewardsSignupDetails(boolean z, String str) {
        return Single.c(new Throwable("Error"));
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    /* renamed from: getRewardsState, reason: from getter */
    public final RewardsState getF4391a() {
        return this.f4391a;
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    /* renamed from: getTokenData, reason: from getter */
    public final RewardsTokenInfo getD() {
        return this.d;
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    /* renamed from: getUncachedVisitorId, reason: from getter */
    public final String getC() {
        return this.c;
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    public final String getVisitorId() {
        return null;
    }

    @Override // au.com.woolworths.android.onesite.utils.InStoreWifiSavedMemberProvider
    public final boolean isFullUserCurrentlyLoggedIn() {
        return true;
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    public final boolean isRewardsLinked() {
        return false;
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    public final Single linkRewardsCard(String str, String sessionToken) {
        Intrinsics.h(sessionToken, "sessionToken");
        return Single.c(new Throwable("Error"));
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    public final Single login(String str, String sessionToken) {
        Intrinsics.h(sessionToken, "sessionToken");
        return Single.c(new Throwable("Error"));
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    public final Object logout(Continuation continuation) {
        return Boolean.TRUE;
    }

    @Override // au.com.woolworths.android.onesite.utils.InStoreWifiSavedMemberProvider
    public final String retrieveSavedMember() {
        return "savedMember";
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    public final void setCardData(RewardsCardData rewardsCardData) {
        this.b = rewardsCardData;
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    public final void setRewardsState(RewardsState rewardsState) {
        Intrinsics.h(rewardsState, "<set-?>");
        this.f4391a = rewardsState;
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    public final void setShouldIncludeUncachedVisitorIdInAnalytics(boolean z) {
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    public final void setTokenData(RewardsTokenInfo rewardsTokenInfo) {
        this.d = rewardsTokenInfo;
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    public final void setUncachedVisitorId(String str) {
        this.c = str;
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    public final Object unlinkRewardsCard(Continuation continuation) {
        return new RewardsUnlinkSuccessData("true");
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    public final Single unlinkRewardsCardOld() {
        return Single.e(new Component("RewardsUnlinkSuccess", new RewardsUnlinkSuccessData("true")));
    }
}
