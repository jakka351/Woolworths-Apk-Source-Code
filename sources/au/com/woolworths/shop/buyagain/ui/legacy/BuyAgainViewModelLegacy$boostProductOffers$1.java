package au.com.woolworths.shop.buyagain.ui.legacy;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainViewModelLegacy", f = "BuyAgainViewModelLegacy.kt", l = {250}, m = "boostProductOffers")
/* loaded from: classes4.dex */
final class BuyAgainViewModelLegacy$boostProductOffers$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ BuyAgainViewModelLegacy q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyAgainViewModelLegacy$boostProductOffers$1(BuyAgainViewModelLegacy buyAgainViewModelLegacy, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = buyAgainViewModelLegacy;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return BuyAgainViewModelLegacy.p6(this.q, this);
    }
}
