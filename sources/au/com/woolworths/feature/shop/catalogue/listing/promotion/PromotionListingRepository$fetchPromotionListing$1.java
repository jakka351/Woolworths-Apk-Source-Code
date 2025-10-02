package au.com.woolworths.feature.shop.catalogue.listing.promotion;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.listing.promotion.PromotionListingRepository", f = "PromotionListingRepository.kt", l = {50}, m = "fetchPromotionListing")
/* loaded from: classes3.dex */
final class PromotionListingRepository$fetchPromotionListing$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ PromotionListingRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotionListingRepository$fetchPromotionListing$1(PromotionListingRepository promotionListingRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = promotionListingRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(0, 0, null, null, null, this);
    }
}
