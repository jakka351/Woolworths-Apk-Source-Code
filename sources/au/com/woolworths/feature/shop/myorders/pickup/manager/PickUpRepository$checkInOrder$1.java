package au.com.woolworths.feature.shop.myorders.pickup.manager;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.pickup.manager.PickUpRepository", f = "PickUpRepository.kt", l = {39}, m = "checkInOrder")
/* loaded from: classes3.dex */
final class PickUpRepository$checkInOrder$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ PickUpRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickUpRepository$checkInOrder$1(PickUpRepository pickUpRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = pickUpRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.b(null, null, null, this);
    }
}
