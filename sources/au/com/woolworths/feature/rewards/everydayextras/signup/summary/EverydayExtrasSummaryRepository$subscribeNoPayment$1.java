package au.com.woolworths.feature.rewards.everydayextras.signup.summary;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.everydayextras.signup.summary.EverydayExtrasSummaryRepository", f = "EverydayExtrasSummaryRepository.kt", l = {78}, m = "subscribeNoPayment")
/* loaded from: classes3.dex */
final class EverydayExtrasSummaryRepository$subscribeNoPayment$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ EverydayExtrasSummaryRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EverydayExtrasSummaryRepository$subscribeNoPayment$1(EverydayExtrasSummaryRepository everydayExtrasSummaryRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = everydayExtrasSummaryRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.c(null, null, this);
    }
}
