package au.com.woolworths.shop.cart.domain.interactor;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor", f = "CartUpdateInteractor.kt", l = {132}, m = "addOrUpdateTrolleyItemsNoBoost-gIAlu-s")
/* loaded from: classes4.dex */
final class CartUpdateInteractor$addOrUpdateTrolleyItemsNoBoost$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ CartUpdateInteractor q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartUpdateInteractor$addOrUpdateTrolleyItemsNoBoost$1(CartUpdateInteractor cartUpdateInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = cartUpdateInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        Object objD = this.q.d(null, this);
        return objD == CoroutineSingletons.d ? objD : new Result(objD);
    }
}
