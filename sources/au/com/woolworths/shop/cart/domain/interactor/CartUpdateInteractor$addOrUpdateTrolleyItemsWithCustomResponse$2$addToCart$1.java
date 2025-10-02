package au.com.woolworths.shop.cart.domain.interactor;

import au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantitiesUpdatedResponse;
import au.com.woolworths.product.productbottomsheet.UpdateProductInCartExtras;
import au.com.woolworths.shop.cart.domain.model.UpdatedProductQuantity;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/foundation/shop/cart/data/model/CartProductQuantitiesUpdatedResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor$addOrUpdateTrolleyItemsWithCustomResponse$2$addToCart$1", f = "CartUpdateInteractor.kt", l = {62}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class CartUpdateInteractor$addOrUpdateTrolleyItemsWithCustomResponse$2$addToCart$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CartProductQuantitiesUpdatedResponse>, Object> {
    public int p;
    public final /* synthetic */ CartUpdateInteractor q;
    public final /* synthetic */ UpdateProductInCartExtras[] r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartUpdateInteractor$addOrUpdateTrolleyItemsWithCustomResponse$2$addToCart$1(CartUpdateInteractor cartUpdateInteractor, Continuation continuation, UpdateProductInCartExtras[] updateProductInCartExtrasArr) {
        super(2, continuation);
        this.q = cartUpdateInteractor;
        this.r = updateProductInCartExtrasArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CartUpdateInteractor$addOrUpdateTrolleyItemsWithCustomResponse$2$addToCart$1(this.q, continuation, this.r);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CartUpdateInteractor$addOrUpdateTrolleyItemsWithCustomResponse$2$addToCart$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        UpdateProductInCartExtras[] updateProductInCartExtrasArr = this.r;
        ArrayList arrayList = new ArrayList(updateProductInCartExtrasArr.length);
        for (UpdateProductInCartExtras updateProductInCartExtras : updateProductInCartExtrasArr) {
            arrayList.add(new UpdatedProductQuantity(Double.parseDouble(String.valueOf(updateProductInCartExtras.e)), updateProductInCartExtras.d, updateProductInCartExtras.g, updateProductInCartExtras.h));
        }
        this.p = 1;
        Object objB = CartUpdateInteractor.b(this.q, arrayList, this);
        return objB == coroutineSingletons ? coroutineSingletons : objB;
    }
}
