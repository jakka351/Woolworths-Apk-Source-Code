package au.com.woolworths.shop.cart.domain.interactor;

import au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantitiesUpdatedResponse;
import au.com.woolworths.product.productbottomsheet.UpdateProductInCartExtras;
import au.com.woolworths.shop.cart.domain.model.UpdatedProductQuantity;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lau/com/woolworths/foundation/shop/cart/data/model/CartProductQuantitiesUpdatedResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor$addOrUpdateTrolleyItems$2$quantitiesResponse$1", f = "CartUpdateInteractor.kt", l = {94}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class CartUpdateInteractor$addOrUpdateTrolleyItems$2$quantitiesResponse$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends CartProductQuantitiesUpdatedResponse>>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ CartUpdateInteractor r;
    public final /* synthetic */ UpdateProductInCartExtras[] s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartUpdateInteractor$addOrUpdateTrolleyItems$2$quantitiesResponse$1(CartUpdateInteractor cartUpdateInteractor, Continuation continuation, UpdateProductInCartExtras[] updateProductInCartExtrasArr) {
        super(2, continuation);
        this.r = cartUpdateInteractor;
        this.s = updateProductInCartExtrasArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CartUpdateInteractor$addOrUpdateTrolleyItems$2$quantitiesResponse$1 cartUpdateInteractor$addOrUpdateTrolleyItems$2$quantitiesResponse$1 = new CartUpdateInteractor$addOrUpdateTrolleyItems$2$quantitiesResponse$1(this.r, continuation, this.s);
        cartUpdateInteractor$addOrUpdateTrolleyItems$2$quantitiesResponse$1.q = obj;
        return cartUpdateInteractor$addOrUpdateTrolleyItems$2$quantitiesResponse$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CartUpdateInteractor$addOrUpdateTrolleyItems$2$quantitiesResponse$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objA;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                CartUpdateInteractor cartUpdateInteractor = this.r;
                UpdateProductInCartExtras[] updateProductInCartExtrasArr = this.s;
                ArrayList arrayList = new ArrayList(updateProductInCartExtrasArr.length);
                for (UpdateProductInCartExtras updateProductInCartExtras : updateProductInCartExtrasArr) {
                    arrayList.add(new UpdatedProductQuantity(Double.parseDouble(String.valueOf(updateProductInCartExtras.e)), updateProductInCartExtras.d, updateProductInCartExtras.g, updateProductInCartExtras.h));
                }
                this.p = 1;
                obj = CartUpdateInteractor.a(cartUpdateInteractor, arrayList, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            objA = (CartProductQuantitiesUpdatedResponse) obj;
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        return new Result(objA);
    }
}
