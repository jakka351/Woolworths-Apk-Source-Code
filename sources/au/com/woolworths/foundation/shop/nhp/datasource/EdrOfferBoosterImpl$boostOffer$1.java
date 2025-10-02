package au.com.woolworths.foundation.shop.nhp.datasource;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.shop.nhp.datasource.EdrOfferBoosterImpl", f = "EdrOfferBooster.kt", l = {24}, m = "boostOffer")
/* loaded from: classes4.dex */
final class EdrOfferBoosterImpl$boostOffer$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ EdrOfferBoosterImpl q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EdrOfferBoosterImpl$boostOffer$1(EdrOfferBoosterImpl edrOfferBoosterImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = edrOfferBoosterImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, null, this);
    }
}
