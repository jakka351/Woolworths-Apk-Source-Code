package au.com.woolworths.feature.shop.editorder.review.domain;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.editorder.review.domain.ChangeMyOrderRepository", f = "ChangeMyOrderRepository.kt", l = {25}, m = "fetchChangeMyOrderSummary")
/* loaded from: classes3.dex */
final class ChangeMyOrderRepository$fetchChangeMyOrderSummary$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ ChangeMyOrderRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeMyOrderRepository$fetchChangeMyOrderSummary$1(ChangeMyOrderRepository changeMyOrderRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = changeMyOrderRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(this);
    }
}
