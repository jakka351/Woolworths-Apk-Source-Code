package au.com.woolworths.shop.cart.domain.interactor;

import au.com.woolworths.android.onesite.rxutils.Result;
import au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantitiesUpdatedResponse;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor", f = "CartUpdateInteractor.kt", l = {219, 233}, m = "addToCartWithCustomResponseGraphql")
/* loaded from: classes4.dex */
final class CartUpdateInteractor$addToCartWithCustomResponseGraphql$1 extends ContinuationImpl {
    public Result p;
    public CartProductQuantitiesUpdatedResponse q;
    public /* synthetic */ Object r;
    public final /* synthetic */ CartUpdateInteractor s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartUpdateInteractor$addToCartWithCustomResponseGraphql$1(CartUpdateInteractor cartUpdateInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = cartUpdateInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return CartUpdateInteractor.b(this.s, null, this);
    }
}
