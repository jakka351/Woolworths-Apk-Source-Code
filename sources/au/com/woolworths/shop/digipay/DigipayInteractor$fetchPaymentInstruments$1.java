package au.com.woolworths.shop.digipay;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.digipay.DigipayInteractor", f = "DigipayInteractor.kt", l = {139, 142}, m = "fetchPaymentInstruments")
/* loaded from: classes4.dex */
final class DigipayInteractor$fetchPaymentInstruments$1 extends ContinuationImpl {
    public Object p;
    public /* synthetic */ Object q;
    public final /* synthetic */ DigipayInteractor r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DigipayInteractor$fetchPaymentInstruments$1(DigipayInteractor digipayInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = digipayInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return DigipayInteractor.a(this.r, false, this);
    }
}
