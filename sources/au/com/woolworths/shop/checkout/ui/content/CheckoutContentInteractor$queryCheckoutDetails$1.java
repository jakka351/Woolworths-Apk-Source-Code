package au.com.woolworths.shop.checkout.ui.content;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.content.CheckoutContentInteractor", f = "CheckoutContentInteractor.kt", l = {36, 37}, m = "queryCheckoutDetails")
/* loaded from: classes4.dex */
final class CheckoutContentInteractor$queryCheckoutDetails$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ CheckoutContentInteractor q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutContentInteractor$queryCheckoutDetails$1(CheckoutContentInteractor checkoutContentInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = checkoutContentInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(this);
    }
}
