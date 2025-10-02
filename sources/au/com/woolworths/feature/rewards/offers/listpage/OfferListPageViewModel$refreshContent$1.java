package au.com.woolworths.feature.rewards.offers.listpage;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.offers.listpage.OfferListPageViewModel", f = "OfferListPageViewModel.kt", l = {137}, m = "refreshContent")
/* loaded from: classes3.dex */
final class OfferListPageViewModel$refreshContent$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ OfferListPageViewModel q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferListPageViewModel$refreshContent$1(OfferListPageViewModel offerListPageViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = offerListPageViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return OfferListPageViewModel.r6(this.q, this);
    }
}
