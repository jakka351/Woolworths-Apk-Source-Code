package au.com.woolworths.feature.shop.delivery.address;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.delivery.address.DeliveryAddressRepository", f = "DeliveryAddressRepository.kt", l = {25}, m = "searchSuburbsByPostcode")
/* loaded from: classes3.dex */
final class DeliveryAddressRepository$searchSuburbsByPostcode$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ DeliveryAddressRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryAddressRepository$searchSuburbsByPostcode$1(DeliveryAddressRepository deliveryAddressRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = deliveryAddressRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.b(null, this);
    }
}
