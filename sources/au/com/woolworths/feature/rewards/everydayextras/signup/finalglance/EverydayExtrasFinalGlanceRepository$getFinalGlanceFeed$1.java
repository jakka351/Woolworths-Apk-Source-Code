package au.com.woolworths.feature.rewards.everydayextras.signup.finalglance;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.everydayextras.signup.finalglance.EverydayExtrasFinalGlanceRepository", f = "EverydayExtrasFinalGlanceRepository.kt", l = {28}, m = "getFinalGlanceFeed")
/* loaded from: classes3.dex */
final class EverydayExtrasFinalGlanceRepository$getFinalGlanceFeed$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ EverydayExtrasFinalGlanceRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EverydayExtrasFinalGlanceRepository$getFinalGlanceFeed$1(EverydayExtrasFinalGlanceRepository everydayExtrasFinalGlanceRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = everydayExtrasFinalGlanceRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, this);
    }
}
