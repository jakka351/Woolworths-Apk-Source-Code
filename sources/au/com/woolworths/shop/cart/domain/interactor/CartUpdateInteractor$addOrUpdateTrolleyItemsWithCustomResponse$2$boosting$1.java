package au.com.woolworths.shop.cart.domain.interactor;

import au.com.woolworths.product.models.BoostOfferResponse;
import au.com.woolworths.product.offers.ProductBoostInteractor;
import au.com.woolworths.product.productbottomsheet.ProductBottomSheetActionType;
import au.com.woolworths.product.productbottomsheet.UpdateProductInCartExtras;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lau/com/woolworths/product/models/BoostOfferResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor$addOrUpdateTrolleyItemsWithCustomResponse$2$boosting$1", f = "CartUpdateInteractor.kt", l = {82}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class CartUpdateInteractor$addOrUpdateTrolleyItemsWithCustomResponse$2$boosting$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends BoostOfferResponse>>>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ UpdateProductInCartExtras[] r;
    public final /* synthetic */ CartUpdateInteractor s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartUpdateInteractor$addOrUpdateTrolleyItemsWithCustomResponse$2$boosting$1(CartUpdateInteractor cartUpdateInteractor, Continuation continuation, UpdateProductInCartExtras[] updateProductInCartExtrasArr) {
        super(2, continuation);
        this.r = updateProductInCartExtrasArr;
        this.s = cartUpdateInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CartUpdateInteractor$addOrUpdateTrolleyItemsWithCustomResponse$2$boosting$1 cartUpdateInteractor$addOrUpdateTrolleyItemsWithCustomResponse$2$boosting$1 = new CartUpdateInteractor$addOrUpdateTrolleyItemsWithCustomResponse$2$boosting$1(this.s, continuation, this.r);
        cartUpdateInteractor$addOrUpdateTrolleyItemsWithCustomResponse$2$boosting$1.q = obj;
        return cartUpdateInteractor$addOrUpdateTrolleyItemsWithCustomResponse$2$boosting$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CartUpdateInteractor$addOrUpdateTrolleyItemsWithCustomResponse$2$boosting$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objA;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                ArrayList arrayList = new ArrayList();
                for (UpdateProductInCartExtras updateProductInCartExtras : this.r) {
                    if (updateProductInCartExtras.f == ProductBottomSheetActionType.d && updateProductInCartExtras.j) {
                        arrayList.add(updateProductInCartExtras);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = ((UpdateProductInCartExtras) it.next()).i;
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2 = null;
                }
                if (arrayList2 == null) {
                    return null;
                }
                ProductBoostInteractor productBoostInteractor = this.s.c;
                this.p = 1;
                obj = productBoostInteractor.c(arrayList2, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            objA = (List) obj;
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        return new Result(objA);
    }
}
