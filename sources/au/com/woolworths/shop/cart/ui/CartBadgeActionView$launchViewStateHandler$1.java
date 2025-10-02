package au.com.woolworths.shop.cart.ui;

import android.content.res.Resources;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.cart.ui.CartBadgeActionView$launchViewStateHandler$1", f = "CartBadgeActionView.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class CartBadgeActionView$launchViewStateHandler$1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
    public /* synthetic */ int p;
    public final /* synthetic */ CartBadgeActionView q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartBadgeActionView$launchViewStateHandler$1(CartBadgeActionView cartBadgeActionView, Continuation continuation) {
        super(2, continuation);
        this.q = cartBadgeActionView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CartBadgeActionView$launchViewStateHandler$1 cartBadgeActionView$launchViewStateHandler$1 = new CartBadgeActionView$launchViewStateHandler$1(this.q, continuation);
        cartBadgeActionView$launchViewStateHandler$1.p = ((Number) obj).intValue();
        return cartBadgeActionView$launchViewStateHandler$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Resources.NotFoundException {
        CartBadgeActionView$launchViewStateHandler$1 cartBadgeActionView$launchViewStateHandler$1 = (CartBadgeActionView$launchViewStateHandler$1) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
        Unit unit = Unit.f24250a;
        cartBadgeActionView$launchViewStateHandler$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Resources.NotFoundException {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        this.q.setCartBadgeCount(this.p);
        return Unit.f24250a;
    }
}
