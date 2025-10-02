package au.com.woolworths.shop.cart.domain.interactor;

import au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantitiesUpdatedResponse;
import au.com.woolworths.product.models.BoostOfferResponse;
import au.com.woolworths.product.productbottomsheet.UpdateProductInCartExtras;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
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

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0001*\u00020\u0006H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Lau/com/woolworths/foundation/shop/cart/data/model/CartProductQuantitiesUpdatedResponse;", "Lkotlin/Result;", "", "Lau/com/woolworths/product/models/BoostOfferResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor$addOrUpdateTrolleyItemsWithCustomResponse$2", f = "CartUpdateInteractor.kt", l = {72, 85}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class CartUpdateInteractor$addOrUpdateTrolleyItemsWithCustomResponse$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends CartProductQuantitiesUpdatedResponse, ? extends Result<? extends List<? extends BoostOfferResponse>>>>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ CartUpdateInteractor r;
    public final /* synthetic */ UpdateProductInCartExtras[] s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartUpdateInteractor$addOrUpdateTrolleyItemsWithCustomResponse$2(CartUpdateInteractor cartUpdateInteractor, Continuation continuation, UpdateProductInCartExtras[] updateProductInCartExtrasArr) {
        super(2, continuation);
        this.r = cartUpdateInteractor;
        this.s = updateProductInCartExtrasArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CartUpdateInteractor$addOrUpdateTrolleyItemsWithCustomResponse$2 cartUpdateInteractor$addOrUpdateTrolleyItemsWithCustomResponse$2 = new CartUpdateInteractor$addOrUpdateTrolleyItemsWithCustomResponse$2(this.r, continuation, this.s);
        cartUpdateInteractor$addOrUpdateTrolleyItemsWithCustomResponse$2.q = obj;
        return cartUpdateInteractor$addOrUpdateTrolleyItemsWithCustomResponse$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CartUpdateInteractor$addOrUpdateTrolleyItemsWithCustomResponse$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        CartProductQuantitiesUpdatedResponse cartProductQuantitiesUpdatedResponse;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        UpdateProductInCartExtras[] updateProductInCartExtrasArr = this.s;
        CartUpdateInteractor cartUpdateInteractor = this.r;
        if (i == 0) {
            ResultKt.b(obj);
            coroutineScope = (CoroutineScope) this.q;
            Deferred deferredA = BuildersKt.a(coroutineScope, null, new CartUpdateInteractor$addOrUpdateTrolleyItemsWithCustomResponse$2$addToCart$1(cartUpdateInteractor, null, updateProductInCartExtrasArr), 3);
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
            cartProductQuantitiesUpdatedResponse = (CartProductQuantitiesUpdatedResponse) this.q;
            ResultKt.b(obj);
            return new Pair(cartProductQuantitiesUpdatedResponse, (Result) obj);
        }
        coroutineScope = (CoroutineScope) this.q;
        ResultKt.b(obj);
        CartProductQuantitiesUpdatedResponse cartProductQuantitiesUpdatedResponse2 = (CartProductQuantitiesUpdatedResponse) obj;
        Deferred deferredA2 = BuildersKt.a(coroutineScope, null, new CartUpdateInteractor$addOrUpdateTrolleyItemsWithCustomResponse$2$boosting$1(cartUpdateInteractor, null, updateProductInCartExtrasArr), 3);
        this.q = cartProductQuantitiesUpdatedResponse2;
        this.p = 2;
        Object objAwait = deferredA2.await(this);
        if (objAwait != coroutineSingletons) {
            cartProductQuantitiesUpdatedResponse = cartProductQuantitiesUpdatedResponse2;
            obj = objAwait;
            return new Pair(cartProductQuantitiesUpdatedResponse, (Result) obj);
        }
        return coroutineSingletons;
    }
}
