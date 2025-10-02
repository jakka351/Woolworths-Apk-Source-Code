package au.com.woolworths.shop.cart.domain.interactor;

import au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantitiesUpdatedResponse;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor", f = "CartUpdateInteractor.kt", l = {185, 199}, m = "addToCartGraphql")
/* loaded from: classes4.dex */
final class CartUpdateInteractor$addToCartGraphql$1 extends ContinuationImpl {
    public CartProductQuantitiesUpdatedResponse p;
    public /* synthetic */ Object q;
    public final /* synthetic */ CartUpdateInteractor r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartUpdateInteractor$addToCartGraphql$1(CartUpdateInteractor cartUpdateInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = cartUpdateInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return CartUpdateInteractor.a(this.r, null, this);
    }
}
