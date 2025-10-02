package au.com.woolworths.base.shopapp.modules.subscriptiondata;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.base.shopapp.modules.subscriptiondata.SubscriptionAnalyticsDataInteractor", f = "SubscriptionAnalyticsDataInteractor.kt", l = {32}, m = "syncSubscriptionAnalyticsData")
/* loaded from: classes3.dex */
final class SubscriptionAnalyticsDataInteractor$syncSubscriptionAnalyticsData$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ SubscriptionAnalyticsDataInteractor q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionAnalyticsDataInteractor$syncSubscriptionAnalyticsData$1(SubscriptionAnalyticsDataInteractor subscriptionAnalyticsDataInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = subscriptionAnalyticsDataInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.d(this);
    }
}
