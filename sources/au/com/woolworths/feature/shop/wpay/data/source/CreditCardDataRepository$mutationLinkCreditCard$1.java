package au.com.woolworths.feature.shop.wpay.data.source;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.wpay.data.source.CreditCardDataRepository", f = "CreditCardDataRepository.kt", l = {45}, m = "mutationLinkCreditCard")
/* loaded from: classes3.dex */
final class CreditCardDataRepository$mutationLinkCreditCard$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ CreditCardDataRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditCardDataRepository$mutationLinkCreditCard$1(CreditCardDataRepository creditCardDataRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = creditCardDataRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, this);
    }
}
