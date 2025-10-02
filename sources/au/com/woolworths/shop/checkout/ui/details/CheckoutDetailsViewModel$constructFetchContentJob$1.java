package au.com.woolworths.shop.checkout.ui.details;

import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.shop.cart.ui.cart.l;
import au.com.woolworths.shop.checkout.data.source.NoProductsException;
import au.com.woolworths.shop.checkout.domain.model.Checkout;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentInteractor;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentViewModel;
import au.com.woolworths.shop.checkout.ui.content.CheckoutFullPageErrorState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsViewModel$constructFetchContentJob$1", f = "CheckoutDetailsViewModel.kt", l = {92}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class CheckoutDetailsViewModel$constructFetchContentJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public CheckoutDetailsViewModel p;
    public l q;
    public int r;
    public final /* synthetic */ CheckoutDetailsViewModel s;
    public final /* synthetic */ Function0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutDetailsViewModel$constructFetchContentJob$1(CheckoutDetailsViewModel checkoutDetailsViewModel, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.s = checkoutDetailsViewModel;
        this.t = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckoutDetailsViewModel$constructFetchContentJob$1(this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckoutDetailsViewModel$constructFetchContentJob$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        CheckoutDetailsViewModel checkoutDetailsViewModel;
        l lVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.r;
        if (i == 0) {
            ResultKt.b(obj);
            CheckoutDetailsViewModel checkoutDetailsViewModel2 = this.s;
            l lVar2 = new l(7, checkoutDetailsViewModel2, this.t);
            CheckoutContentViewModel.A6(checkoutDetailsViewModel2.j, true);
            try {
                CheckoutContentInteractor checkoutContentInteractor = checkoutDetailsViewModel2.o;
                this.p = checkoutDetailsViewModel2;
                this.q = lVar2;
                this.r = 1;
                Object objA = checkoutContentInteractor.a(this);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                lVar = lVar2;
                obj = objA;
                checkoutDetailsViewModel = checkoutDetailsViewModel2;
            } catch (NoConnectivityException unused) {
                checkoutDetailsViewModel = checkoutDetailsViewModel2;
                CheckoutContentViewModel.p6(checkoutDetailsViewModel, checkoutDetailsViewModel.j, CheckoutFullPageErrorState.d);
                return Unit.f24250a;
            } catch (ServerErrorException unused2) {
                checkoutDetailsViewModel = checkoutDetailsViewModel2;
                CheckoutContentViewModel.p6(checkoutDetailsViewModel, checkoutDetailsViewModel.j, CheckoutFullPageErrorState.e);
                return Unit.f24250a;
            } catch (NoProductsException unused3) {
                checkoutDetailsViewModel = checkoutDetailsViewModel2;
                CheckoutContentViewModel.p6(checkoutDetailsViewModel, checkoutDetailsViewModel.j, CheckoutFullPageErrorState.f);
                return Unit.f24250a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar = this.q;
            checkoutDetailsViewModel = this.p;
            try {
                ResultKt.b(obj);
            } catch (NoConnectivityException unused4) {
                CheckoutContentViewModel.p6(checkoutDetailsViewModel, checkoutDetailsViewModel.j, CheckoutFullPageErrorState.d);
                return Unit.f24250a;
            } catch (ServerErrorException unused5) {
                CheckoutContentViewModel.p6(checkoutDetailsViewModel, checkoutDetailsViewModel.j, CheckoutFullPageErrorState.e);
                return Unit.f24250a;
            } catch (NoProductsException unused6) {
                CheckoutContentViewModel.p6(checkoutDetailsViewModel, checkoutDetailsViewModel.j, CheckoutFullPageErrorState.f);
                return Unit.f24250a;
            }
        }
        Checkout checkout = (Checkout) obj;
        checkoutDetailsViewModel.y6(checkout, false);
        if (lVar != null) {
            lVar.invoke(checkout);
        }
        return Unit.f24250a;
    }
}
