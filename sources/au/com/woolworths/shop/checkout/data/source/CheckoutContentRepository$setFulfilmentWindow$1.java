package au.com.woolworths.shop.checkout.data.source;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.BERTags;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository", f = "CheckoutContentRepository.kt", l = {BERTags.PRIVATE}, m = "setFulfilmentWindow")
/* loaded from: classes4.dex */
final class CheckoutContentRepository$setFulfilmentWindow$1 extends ContinuationImpl {
    public CheckoutContentRepository p;
    public /* synthetic */ Object q;
    public final /* synthetic */ CheckoutContentRepository r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutContentRepository$setFulfilmentWindow$1(CheckoutContentRepository checkoutContentRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = checkoutContentRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.l(0, null, null, this);
    }
}
