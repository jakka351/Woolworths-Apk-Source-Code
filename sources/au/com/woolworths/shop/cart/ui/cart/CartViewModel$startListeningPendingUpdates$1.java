package au.com.woolworths.shop.cart.ui.cart;

import au.com.woolworths.analytics.supers.couponbanner.EmCouponBannerAnalytics;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.cart.ui.cart.CartViewModel$startListeningPendingUpdates$1", f = "CartViewModel.kt", l = {}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class CartViewModel$startListeningPendingUpdates$1 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
    public final /* synthetic */ CartViewModel p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartViewModel$startListeningPendingUpdates$1(CartViewModel cartViewModel, Continuation continuation) {
        super(2, continuation);
        this.p = cartViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CartViewModel$startListeningPendingUpdates$1(this.p, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CartViewModel$startListeningPendingUpdates$1 cartViewModel$startListeningPendingUpdates$1 = (CartViewModel$startListeningPendingUpdates$1) create(obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        cartViewModel$startListeningPendingUpdates$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        EmCouponBannerAnalytics.Banner banner = CartViewModel.u;
        CartViewModel cartViewModel = this.p;
        LinkedHashMap linkedHashMapR6 = cartViewModel.r6();
        CartViewModel.y6(cartViewModel, linkedHashMapR6, null, new au.com.woolworths.sdui.common.alert.a(22, cartViewModel, linkedHashMapR6), 2);
        return Unit.f24250a;
    }
}
