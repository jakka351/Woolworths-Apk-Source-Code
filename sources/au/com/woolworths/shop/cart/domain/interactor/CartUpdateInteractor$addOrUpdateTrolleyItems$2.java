package au.com.woolworths.shop.cart.domain.interactor;

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

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/shop/cart/domain/interactor/CartProductQuantitiesBoostResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor$addOrUpdateTrolleyItems$2", f = "CartUpdateInteractor.kt", l = {105, 118}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class CartUpdateInteractor$addOrUpdateTrolleyItems$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CartProductQuantitiesBoostResult>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ CartUpdateInteractor r;
    public final /* synthetic */ UpdateProductInCartExtras[] s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartUpdateInteractor$addOrUpdateTrolleyItems$2(CartUpdateInteractor cartUpdateInteractor, Continuation continuation, UpdateProductInCartExtras[] updateProductInCartExtrasArr) {
        super(2, continuation);
        this.r = cartUpdateInteractor;
        this.s = updateProductInCartExtrasArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CartUpdateInteractor$addOrUpdateTrolleyItems$2 cartUpdateInteractor$addOrUpdateTrolleyItems$2 = new CartUpdateInteractor$addOrUpdateTrolleyItems$2(this.r, continuation, this.s);
        cartUpdateInteractor$addOrUpdateTrolleyItems$2.q = obj;
        return cartUpdateInteractor$addOrUpdateTrolleyItems$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CartUpdateInteractor$addOrUpdateTrolleyItems$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        UpdateProductInCartExtras[] updateProductInCartExtrasArr = this.s;
        CartUpdateInteractor cartUpdateInteractor = this.r;
        if (i == 0) {
            ResultKt.b(obj);
            coroutineScope = (CoroutineScope) this.q;
            Deferred deferredA = BuildersKt.a(coroutineScope, null, new CartUpdateInteractor$addOrUpdateTrolleyItems$2$quantitiesResponse$1(cartUpdateInteractor, null, updateProductInCartExtrasArr), 3);
            this.q = coroutineScope;
            this.p = 1;
            obj = deferredA.await(this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = this.q;
            ResultKt.b(obj);
            return new CartProductQuantitiesBoostResult(obj2, (Result) obj);
        }
        coroutineScope = (CoroutineScope) this.q;
        ResultKt.b(obj);
        Object obj3 = ((Result) obj).d;
        Deferred deferredA2 = BuildersKt.a(coroutineScope, null, new CartUpdateInteractor$addOrUpdateTrolleyItems$2$boosting$1(cartUpdateInteractor, null, updateProductInCartExtrasArr), 3);
        this.q = obj3;
        this.p = 2;
        Object objAwait = deferredA2.await(this);
        if (objAwait != coroutineSingletons) {
            obj2 = obj3;
            obj = objAwait;
            return new CartProductQuantitiesBoostResult(obj2, (Result) obj);
        }
        return coroutineSingletons;
    }
}
