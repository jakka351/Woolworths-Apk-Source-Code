package au.com.woolworths.feature.shop.delivery.address;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.delivery.address.DeliveryAddressRepository", f = "DeliveryAddressRepository.kt", l = {34, 44, 47}, m = "saveNewManualAddress")
/* loaded from: classes3.dex */
final class DeliveryAddressRepository$saveNewManualAddress$1 extends ContinuationImpl {
    public boolean p;
    public /* synthetic */ Object q;
    public final /* synthetic */ DeliveryAddressRepository r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryAddressRepository$saveNewManualAddress$1(DeliveryAddressRepository deliveryAddressRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = deliveryAddressRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.a(false, null, this);
    }
}
