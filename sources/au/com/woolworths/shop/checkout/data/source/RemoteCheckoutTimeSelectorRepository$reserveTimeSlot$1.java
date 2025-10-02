package au.com.woolworths.shop.checkout.data.source;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.data.source.RemoteCheckoutTimeSelectorRepository", f = "RemoteCheckoutTimeSelectorRepository.kt", l = {60}, m = "reserveTimeSlot")
/* loaded from: classes4.dex */
final class RemoteCheckoutTimeSelectorRepository$reserveTimeSlot$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ RemoteCheckoutTimeSelectorRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteCheckoutTimeSelectorRepository$reserveTimeSlot$1(RemoteCheckoutTimeSelectorRepository remoteCheckoutTimeSelectorRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = remoteCheckoutTimeSelectorRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.b(0, null, this);
    }
}
