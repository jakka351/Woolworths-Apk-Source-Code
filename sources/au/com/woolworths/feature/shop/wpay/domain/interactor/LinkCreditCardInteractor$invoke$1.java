package au.com.woolworths.feature.shop.wpay.domain.interactor;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.wpay.domain.interactor.LinkCreditCardInteractor", f = "LinkCreditCardInteractor.kt", l = {18}, m = "invoke")
/* loaded from: classes3.dex */
final class LinkCreditCardInteractor$invoke$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ LinkCreditCardInteractor q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkCreditCardInteractor$invoke$1(LinkCreditCardInteractor linkCreditCardInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = linkCreditCardInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, this);
    }
}
