package au.com.woolworths.shop.cart.domain.interactor;

import au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantitiesUpdatedResponse;
import au.com.woolworths.product.productbottomsheet.UpdateProductInCartExtras;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lau/com/woolworths/foundation/shop/cart/data/model/CartProductQuantitiesUpdatedResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor$addOrUpdateTrolleyItemsNoBoost$2", f = "CartUpdateInteractor.kt", l = {146}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class CartUpdateInteractor$addOrUpdateTrolleyItemsNoBoost$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends CartProductQuantitiesUpdatedResponse>>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ CartUpdateInteractor r;
    public final /* synthetic */ UpdateProductInCartExtras[] s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartUpdateInteractor$addOrUpdateTrolleyItemsNoBoost$2(CartUpdateInteractor cartUpdateInteractor, Continuation continuation, UpdateProductInCartExtras[] updateProductInCartExtrasArr) {
        super(2, continuation);
        this.r = cartUpdateInteractor;
        this.s = updateProductInCartExtrasArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CartUpdateInteractor$addOrUpdateTrolleyItemsNoBoost$2 cartUpdateInteractor$addOrUpdateTrolleyItemsNoBoost$2 = new CartUpdateInteractor$addOrUpdateTrolleyItemsNoBoost$2(this.r, continuation, this.s);
        cartUpdateInteractor$addOrUpdateTrolleyItemsNoBoost$2.q = obj;
        return cartUpdateInteractor$addOrUpdateTrolleyItemsNoBoost$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CartUpdateInteractor$addOrUpdateTrolleyItemsNoBoost$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            Deferred deferredA = BuildersKt.a((CoroutineScope) this.q, null, new CartUpdateInteractor$addOrUpdateTrolleyItemsNoBoost$2$quantitiesResponse$1(this.r, null, this.s), 3);
            this.p = 1;
            obj = deferredA.await(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return new Result(((Result) obj).d);
    }
}
