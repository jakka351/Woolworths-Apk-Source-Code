package au.com.woolworths.feature.rewards.offers.data;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.offers.data.OfferDetailsRepository", f = "OfferDetailsRepository.kt", l = {67}, m = "activateOfferInOfferDetails")
/* loaded from: classes3.dex */
final class OfferDetailsRepository$activateOfferInOfferDetails$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ OfferDetailsRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferDetailsRepository$activateOfferInOfferDetails$1(OfferDetailsRepository offerDetailsRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = offerDetailsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, this);
    }
}
