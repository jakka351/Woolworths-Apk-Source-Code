package au.com.woolworths.feature.shop.wpay.data.source;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.wpay.data.source.PayPalDataRepository", f = "PayPalDataRepository.kt", l = {28}, m = "queryLinkPayPal")
/* loaded from: classes3.dex */
final class PayPalDataRepository$queryLinkPayPal$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ PayPalDataRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayPalDataRepository$queryLinkPayPal$1(PayPalDataRepository payPalDataRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = payPalDataRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.b(this);
    }
}
