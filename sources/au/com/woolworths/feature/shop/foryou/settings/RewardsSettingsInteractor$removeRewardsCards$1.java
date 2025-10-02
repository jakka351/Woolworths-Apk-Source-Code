package au.com.woolworths.feature.shop.foryou.settings;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsInteractor", f = "RewardsSettingsInteractor.kt", l = {30}, m = "removeRewardsCards")
/* loaded from: classes3.dex */
final class RewardsSettingsInteractor$removeRewardsCards$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ RewardsSettingsInteractor q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsSettingsInteractor$removeRewardsCards$1(RewardsSettingsInteractor rewardsSettingsInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = rewardsSettingsInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(this);
    }
}
