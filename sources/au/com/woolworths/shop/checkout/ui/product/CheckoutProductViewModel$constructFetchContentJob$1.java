package au.com.woolworths.shop.checkout.ui.product;

import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.product.details.d;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.product.CheckoutProductViewModel$constructFetchContentJob$1", f = "CheckoutProductViewModel.kt", l = {74}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class CheckoutProductViewModel$constructFetchContentJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public CheckoutProductViewModel p;
    public d q;
    public int r;
    public int s;
    public final /* synthetic */ CheckoutProductViewModel t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutProductViewModel$constructFetchContentJob$1(CheckoutProductViewModel checkoutProductViewModel, Continuation continuation) {
        super(2, continuation);
        this.t = checkoutProductViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckoutProductViewModel$constructFetchContentJob$1(this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckoutProductViewModel$constructFetchContentJob$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        d dVar;
        CheckoutProductViewModel checkoutProductViewModel;
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i2 = this.s;
        boolean z = true;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                checkoutProductViewModel = this.t;
                dVar = new d(checkoutProductViewModel, 18);
                CheckoutContentViewModel.A6(checkoutProductViewModel.j, true);
                CheckoutContentInteractor checkoutContentInteractor = checkoutProductViewModel.o;
                this.p = checkoutProductViewModel;
                this.q = dVar;
                this.r = 1;
                this.s = 1;
                obj = checkoutContentInteractor.f10758a.g(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                i = 1;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.r;
                dVar = this.q;
                checkoutProductViewModel = this.p;
                ResultKt.b(obj);
            }
            Checkout checkout = (Checkout) obj;
            if (i == 0) {
                z = false;
            }
            checkoutProductViewModel.y6(checkout, z);
            if (dVar != null) {
                dVar.invoke(checkout);
            }
        } catch (NoConnectivityException unused) {
            CheckoutContentViewModel.p6(checkoutProductViewModel, checkoutProductViewModel.j, CheckoutFullPageErrorState.d);
        } catch (ServerErrorException unused2) {
            CheckoutContentViewModel.p6(checkoutProductViewModel, checkoutProductViewModel.j, CheckoutFullPageErrorState.e);
        } catch (NoProductsException unused3) {
            CheckoutContentViewModel.p6(checkoutProductViewModel, checkoutProductViewModel.j, CheckoutFullPageErrorState.f);
        }
        return Unit.f24250a;
    }
}
