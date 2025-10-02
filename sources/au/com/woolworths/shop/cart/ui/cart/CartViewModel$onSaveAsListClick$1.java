package au.com.woolworths.shop.cart.ui.cart;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.cart.CartAnalytics;
import au.com.woolworths.foundation.shop.cart.data.model.Cart;
import au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantity;
import au.com.woolworths.shop.cart.ui.cart.CartContract;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.cart.ui.cart.CartViewModel$onSaveAsListClick$1", f = "CartViewModel.kt", l = {}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class CartViewModel$onSaveAsListClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ CartViewModel p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartViewModel$onSaveAsListClick$1(CartViewModel cartViewModel, Continuation continuation) {
        super(2, continuation);
        this.p = cartViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CartViewModel$onSaveAsListClick$1(this.p, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CartViewModel$onSaveAsListClick$1 cartViewModel$onSaveAsListClick$1 = (CartViewModel$onSaveAsListClick$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        cartViewModel$onSaveAsListClick$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        CartViewModel cartViewModel = this.p;
        Cart cart = ((CartContract.ViewState) cartViewModel.o.getValue()).c;
        Unit unit = Unit.f24250a;
        if (cart != null) {
            ArrayList<CartProductQuantity> arrayList = cart.l;
            int iH = MapsKt.h(CollectionsKt.s(arrayList, 10));
            if (iH < 16) {
                iH = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
            for (CartProductQuantity cartProductQuantity : arrayList) {
                linkedHashMap.put(cartProductQuantity.f8682a, new Double(cartProductQuantity.b));
            }
            cartViewModel.l.k(new CartContract.Actions.LaunchCreateShoppingListActivity(linkedHashMap));
            cartViewModel.g.g((Event) new CartAnalytics.Cart().f.s.getD());
        }
        return unit;
    }
}
