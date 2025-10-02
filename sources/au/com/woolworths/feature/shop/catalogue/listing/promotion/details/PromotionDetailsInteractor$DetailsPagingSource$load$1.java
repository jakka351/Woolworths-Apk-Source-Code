package au.com.woolworths.feature.shop.catalogue.listing.promotion.details;

import au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsInteractor;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsInteractor$DetailsPagingSource", f = "PromotionDetailsInteractor.kt", l = {122}, m = "load")
/* loaded from: classes3.dex */
final class PromotionDetailsInteractor$DetailsPagingSource$load$1 extends ContinuationImpl {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ PromotionDetailsInteractor.DetailsPagingSource r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotionDetailsInteractor$DetailsPagingSource$load$1(PromotionDetailsInteractor.DetailsPagingSource detailsPagingSource, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = detailsPagingSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.d(null, this);
    }
}
