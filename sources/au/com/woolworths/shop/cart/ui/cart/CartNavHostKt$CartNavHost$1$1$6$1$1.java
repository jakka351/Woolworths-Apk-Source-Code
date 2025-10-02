package au.com.woolworths.shop.cart.ui.cart;

import android.content.Context;
import au.com.woolworths.analytics.supers.couponbanner.EmCouponBannerAnalytics;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState;
import au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferContract;
import au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferViewModel;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.cart.ui.cart.CartNavHostKt$CartNavHost$1$1$6$1$1", f = "CartNavHost.kt", l = {58}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class CartNavHostKt$CartNavHost$1$1$6$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ QuickAddOfferViewModel q;
    public final /* synthetic */ Function0 r;
    public final /* synthetic */ CartViewModel s;
    public final /* synthetic */ SnackbarHostState t;
    public final /* synthetic */ Context u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartNavHostKt$CartNavHost$1$1$6$1$1(QuickAddOfferViewModel quickAddOfferViewModel, Function0 function0, CartViewModel cartViewModel, SnackbarHostState snackbarHostState, Context context, Continuation continuation) {
        super(2, continuation);
        this.q = quickAddOfferViewModel;
        this.r = function0;
        this.s = cartViewModel;
        this.t = snackbarHostState;
        this.u = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CartNavHostKt$CartNavHost$1$1$6$1$1(this.q, this.r, this.s, this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((CartNavHostKt$CartNavHost$1$1$6$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        return CoroutineSingletons.d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            SharedFlow sharedFlow = this.q.l;
            final SnackbarHostState snackbarHostState = this.t;
            final Context context = this.u;
            final Function0 function0 = this.r;
            final CartViewModel cartViewModel = this.s;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.shop.cart.ui.cart.CartNavHostKt$CartNavHost$1$1$6$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    QuickAddOfferContract.Action action = (QuickAddOfferContract.Action) obj2;
                    boolean zC = Intrinsics.c(action, QuickAddOfferContract.Action.NavigateAndRefreshCart.f10529a);
                    Unit unit = Unit.f24250a;
                    if (zC) {
                        function0.invoke();
                        EmCouponBannerAnalytics.Banner banner = CartViewModel.u;
                        cartViewModel.t6(true, new au.com.woolworths.rewards.base.d(10));
                        return unit;
                    }
                    if (!(action instanceof QuickAddOfferContract.Action.ShowSnackBar)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String string = context.getString(((QuickAddOfferContract.Action.ShowSnackBar) action).f10530a);
                    Intrinsics.g(string, "getString(...)");
                    Object objC = SnackbarHostState.c(snackbarHostState, string, null, null, continuation, 14);
                    return objC == CoroutineSingletons.d ? objC : unit;
                }
            };
            this.p = 1;
            if (sharedFlow.collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
