package au.com.woolworths.feature.shop.product.availability;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.product.availability.ProductAvailabilityRepository", f = "ProductAvailabilityRepository.kt", l = {28}, m = "fetchAvailability")
/* loaded from: classes3.dex */
final class ProductAvailabilityRepository$fetchAvailability$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ ProductAvailabilityRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductAvailabilityRepository$fetchAvailability$1(ProductAvailabilityRepository productAvailabilityRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = productAvailabilityRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, null, this);
    }
}
