package au.com.woolworths.shop.cart.domain.interactor;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.cart.domain.interactor.QuickAddOfferInteractor", f = "QuickAddOfferInteractor.kt", l = {27}, m = "updateOffers")
/* loaded from: classes4.dex */
final class QuickAddOfferInteractor$updateOffers$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ QuickAddOfferInteractor q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickAddOfferInteractor$updateOffers$1(QuickAddOfferInteractor quickAddOfferInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = quickAddOfferInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.b(null, this);
    }
}
