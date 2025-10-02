package au.com.woolworths.feature.rewards.offers;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.modules.rewards.RewardsPointsBalanceRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/RewardsOfferFeedInteractor;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsOfferFeedInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final RewardsOfferRepository f6240a;
    public final RewardsPointsBalanceRepository b;

    public RewardsOfferFeedInteractor(RewardsOfferRepository rewardsOfferRepository, RewardsPointsBalanceRepository rewardsPointsBalanceRepository) {
        Intrinsics.h(rewardsOfferRepository, "rewardsOfferRepository");
        Intrinsics.h(rewardsPointsBalanceRepository, "rewardsPointsBalanceRepository");
        this.f6240a = rewardsOfferRepository;
        this.b = rewardsPointsBalanceRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof au.com.woolworths.feature.rewards.offers.RewardsOfferFeedInteractor$getOfferFeed$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.feature.rewards.offers.RewardsOfferFeedInteractor$getOfferFeed$1 r0 = (au.com.woolworths.feature.rewards.offers.RewardsOfferFeedInteractor$getOfferFeed$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.rewards.offers.RewardsOfferFeedInteractor$getOfferFeed$1 r0 = new au.com.woolworths.feature.rewards.offers.RewardsOfferFeedInteractor$getOfferFeed$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r6)
            goto L4c
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            kotlin.ResultKt.b(r6)
            r0.r = r3
            au.com.woolworths.feature.rewards.offers.RewardsOfferRepository r6 = r5.f6240a
            au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider r2 = r6.b
            r2.getClass()
            kotlinx.coroutines.scheduling.DefaultScheduler r2 = kotlinx.coroutines.Dispatchers.f24691a
            kotlinx.coroutines.scheduling.DefaultIoScheduler r2 = kotlinx.coroutines.scheduling.DefaultIoScheduler.f
            au.com.woolworths.feature.rewards.offers.RewardsOfferRepository$getOfferFeed$2 r3 = new au.com.woolworths.feature.rewards.offers.RewardsOfferRepository$getOfferFeed$2
            r4 = 0
            r3.<init>(r6, r4)
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.f(r2, r3, r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r0 = r6
            au.com.woolworths.feature.rewards.offers.data.RewardsOfferFeedData r0 = (au.com.woolworths.feature.rewards.offers.data.RewardsOfferFeedData) r0
            au.com.woolworths.base.rewards.account.data.RewardsBalanceData r0 = r0.f6287a
            au.com.woolworths.base.rewards.account.data.RewardsPointsData r0 = r0.getPointsBalance()
            if (r0 == 0) goto L6a
            au.com.woolworths.android.onesite.modules.rewards.RewardsPointsBalance r0 = au.com.woolworths.base.rewards.account.data.RewardsPointsDataKt.toRewardsPointsBalance(r0)
            au.com.woolworths.android.onesite.modules.rewards.RewardsPointsBalanceRepository r1 = r5.b
            r1.getClass()
            java.lang.String r2 = "balance"
            kotlin.jvm.internal.Intrinsics.h(r0, r2)
            kotlinx.coroutines.flow.MutableStateFlow r1 = r1.f4394a
            r1.setValue(r0)
        L6a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.offers.RewardsOfferFeedInteractor.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
