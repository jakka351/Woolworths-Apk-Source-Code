package au.com.woolworths.shop.cart.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/CartBadgeActionViewModel;", "Landroidx/lifecycle/ViewModel;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CartBadgeActionViewModel extends ViewModel {
    public final CartUpdateInteractor e;
    public final AnalyticsManager f;
    public final SharedFlowImpl g;
    public final Flow h;
    public final SharedFlow i;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.cart.ui.CartBadgeActionViewModel$1", f = "CartBadgeActionViewModel.kt", l = {38}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.cart.ui.CartBadgeActionViewModel$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return CartBadgeActionViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                CartUpdateInteractor cartUpdateInteractor = CartBadgeActionViewModel.this.e;
                this.p = 1;
                if (cartUpdateInteractor.g(false, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f24250a;
        }
    }

    public CartBadgeActionViewModel(CartUpdateInteractor cartUpdateInteractor, AnalyticsManager analyticsManager) {
        Intrinsics.h(cartUpdateInteractor, "cartUpdateInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = cartUpdateInteractor;
        this.f = analyticsManager;
        SharedFlowImpl sharedFlowImplA = SharedFlowKt.a(0, 1, BufferOverflow.e);
        this.g = sharedFlowImplA;
        this.h = cartUpdateInteractor.l;
        this.i = FlowKt.a(sharedFlowImplA);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass1(null), 3);
    }
}
