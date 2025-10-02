package au.com.woolworths.feature.rewards.everydayextras.signup.landing;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.everydayextras.signup.landing.EverydayExtrasLandingRepository", f = "EverydayExtrasLandingRepository.kt", l = {34}, m = "getLandingFeed")
/* loaded from: classes3.dex */
final class EverydayExtrasLandingRepository$getLandingFeed$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ EverydayExtrasLandingRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EverydayExtrasLandingRepository$getLandingFeed$1(EverydayExtrasLandingRepository everydayExtrasLandingRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = everydayExtrasLandingRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, this);
    }
}
