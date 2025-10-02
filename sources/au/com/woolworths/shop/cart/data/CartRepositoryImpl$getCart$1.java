package au.com.woolworths.shop.cart.data;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.cart.data.CartRepositoryImpl", f = "CartRepositoryImpl.kt", l = {69}, m = "getCart")
/* loaded from: classes4.dex */
final class CartRepositoryImpl$getCart$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ CartRepositoryImpl q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartRepositoryImpl$getCart$1(CartRepositoryImpl cartRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = cartRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.b(this);
    }
}
