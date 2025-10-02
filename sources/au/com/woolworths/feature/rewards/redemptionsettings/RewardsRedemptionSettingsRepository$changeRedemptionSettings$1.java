package au.com.woolworths.feature.rewards.redemptionsettings;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsRepository", f = "RewardsRedemptionSettingsRepository.kt", l = {79}, m = "changeRedemptionSettings")
/* loaded from: classes3.dex */
final class RewardsRedemptionSettingsRepository$changeRedemptionSettings$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ RewardsRedemptionSettingsRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsRedemptionSettingsRepository$changeRedemptionSettings$1(RewardsRedemptionSettingsRepository rewardsRedemptionSettingsRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = rewardsRedemptionSettingsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, this);
    }
}
