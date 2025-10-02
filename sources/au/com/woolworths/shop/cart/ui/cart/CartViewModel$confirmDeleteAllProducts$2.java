package au.com.woolworths.shop.cart.ui.cart;

import au.com.woolworths.analytics.supers.local.CartAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.foundation.shop.cart.data.model.Cart;
import au.com.woolworths.shop.cart.analytics.CartAnalyticsExtKt;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import au.com.woolworths.shop.cart.ui.cart.CartContract;
import com.woolworths.R;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.cart.ui.cart.CartViewModel$confirmDeleteAllProducts$2", f = "CartViewModel.kt", l = {347}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class CartViewModel$confirmDeleteAllProducts$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ CartViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartViewModel$confirmDeleteAllProducts$2(CartViewModel cartViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = cartViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CartViewModel$confirmDeleteAllProducts$2(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CartViewModel$confirmDeleteAllProducts$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CartViewModel cartViewModel = this.q;
        BufferedChannel bufferedChannel = cartViewModel.l;
        AnalyticsManager analyticsManager = cartViewModel.g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                CartUpdateInteractor cartUpdateInteractor = cartViewModel.i;
                this.p = 1;
                obj = cartUpdateInteractor.f(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            Cart cart = (Cart) obj;
            if (cart.f8671a > 0) {
                analyticsManager.i(CartAnalytics.Cart.Action.d, CartAnalyticsExtKt.a(CartViewModelKt.a(cart)));
                CartViewModel.x6(cartViewModel, cartViewModel.n, false, cart, null, null, 8);
            } else {
                analyticsManager.g(CartAnalytics.Cart.Action.n);
                CartViewModel.x6(cartViewModel, cartViewModel.n, false, null, CartEmptyState.d, null, 8);
            }
            bufferedChannel.k(CartContract.Actions.ShowDeleteAllSuccess.f10476a);
        } catch (NoConnectivityException e) {
            Bark.Companion companion = Bark.f8483a;
            Bark.Barker.h(new ReportOwner(ReportOwner.Squad.h), e, "Error clearing cart", 24);
            analyticsManager.g(CartAnalytics.Cart.Action.u);
            bufferedChannel.k(new CartContract.Actions.ShowFailMessage(R.string.error_no_network));
            MutableStateFlow mutableStateFlow = cartViewModel.n;
            LinkedHashMap linkedHashMapR6 = cartViewModel.r6();
            linkedHashMapR6.clear();
            CartViewModel.x6(cartViewModel, mutableStateFlow, false, null, null, linkedHashMapR6, 6);
        } catch (ServerErrorException e2) {
            Bark.Companion companion2 = Bark.f8483a;
            Bark.Barker.h(new ReportOwner(ReportOwner.Squad.h), e2, "Error clearing cart", 24);
            analyticsManager.g(CartAnalytics.Cart.Action.t);
            bufferedChannel.k(new CartContract.Actions.ShowFailMessage(R.string.network_issue_error_message));
            MutableStateFlow mutableStateFlow2 = cartViewModel.n;
            LinkedHashMap linkedHashMapR62 = cartViewModel.r6();
            linkedHashMapR62.clear();
            CartViewModel.x6(cartViewModel, mutableStateFlow2, false, null, null, linkedHashMapR62, 6);
        }
        return Unit.f24250a;
    }
}
