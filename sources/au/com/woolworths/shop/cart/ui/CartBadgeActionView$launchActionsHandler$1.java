package au.com.woolworths.shop.cart.ui;

import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.base.shopapp.cartbadge.CartBadgeActionContract;
import com.salesforce.marketingcloud.UrlHandler;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", UrlHandler.ACTION, "Lau/com/woolworths/base/shopapp/cartbadge/CartBadgeActionContract$Actions;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.cart.ui.CartBadgeActionView$launchActionsHandler$1", f = "CartBadgeActionView.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class CartBadgeActionView$launchActionsHandler$1 extends SuspendLambda implements Function2<CartBadgeActionContract.Actions, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ CartBadgeActionView q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartBadgeActionView$launchActionsHandler$1(CartBadgeActionView cartBadgeActionView, Continuation continuation) {
        super(2, continuation);
        this.q = cartBadgeActionView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CartBadgeActionView$launchActionsHandler$1 cartBadgeActionView$launchActionsHandler$1 = new CartBadgeActionView$launchActionsHandler$1(this.q, continuation);
        cartBadgeActionView$launchActionsHandler$1.p = obj;
        return cartBadgeActionView$launchActionsHandler$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CartBadgeActionView$launchActionsHandler$1 cartBadgeActionView$launchActionsHandler$1 = (CartBadgeActionView$launchActionsHandler$1) create((CartBadgeActionContract.Actions) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        cartBadgeActionView$launchActionsHandler$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        if (!(((CartBadgeActionContract.Actions) this.p) instanceof CartBadgeActionContract.Actions.LaunchCart)) {
            throw new NoWhenBranchMatchedException();
        }
        this.q.getContext().startActivity(ActivityNavigatorKt.a(Activities.Cart.f4454a, ApplicationType.e));
        return Unit.f24250a;
    }
}
