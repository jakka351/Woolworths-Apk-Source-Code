package au.com.woolworths.shop.checkout.ui.product;

import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.shop.checkout.data.source.MutationErrorException;
import au.com.woolworths.shop.checkout.data.source.NoProductsException;
import au.com.woolworths.shop.checkout.domain.model.Checkout;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentInteractor;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentViewModel;
import au.com.woolworths.shop.checkout.ui.content.CheckoutFullPageErrorState;
import au.com.woolworths.shop.checkout.ui.content.SnackBarErrorType;
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
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.product.CheckoutProductViewModel$onRemovePromoCode$1", f = "CheckoutProductViewModel.kt", l = {106}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class CheckoutProductViewModel$onRemovePromoCode$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public CheckoutProductViewModel p;
    public CheckoutProductViewModel q;
    public int r;
    public int s;
    public final /* synthetic */ CheckoutProductViewModel t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutProductViewModel$onRemovePromoCode$1(CheckoutProductViewModel checkoutProductViewModel, Continuation continuation) {
        super(2, continuation);
        this.t = checkoutProductViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckoutProductViewModel$onRemovePromoCode$1(this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckoutProductViewModel$onRemovePromoCode$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        CheckoutProductViewModel checkoutProductViewModel;
        CheckoutProductViewModel checkoutProductViewModel2;
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i2 = this.s;
        if (i2 == 0) {
            ResultKt.b(obj);
            checkoutProductViewModel = this.t;
            CheckoutContentViewModel.A6(checkoutProductViewModel.j, true);
            try {
                CheckoutContentInteractor checkoutContentInteractor = checkoutProductViewModel.o;
                this.p = checkoutProductViewModel;
                this.q = checkoutProductViewModel;
                this.r = 1;
                this.s = 1;
                obj = checkoutContentInteractor.f10758a.j(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                checkoutProductViewModel2 = checkoutProductViewModel;
                i = 1;
            } catch (NoConnectivityException unused) {
                checkoutProductViewModel2 = checkoutProductViewModel;
                checkoutProductViewModel2.B6(checkoutProductViewModel2.j, new SnackBarErrorType.Network(1, null));
                return Unit.f24250a;
            } catch (ServerErrorException unused2) {
                checkoutProductViewModel2 = checkoutProductViewModel;
                checkoutProductViewModel2.B6(checkoutProductViewModel2.j, new SnackBarErrorType.Server(null, null, null, 2));
                return Unit.f24250a;
            } catch (MutationErrorException e) {
                e = e;
                checkoutProductViewModel2 = checkoutProductViewModel;
                checkoutProductViewModel2.B6(checkoutProductViewModel2.j, new SnackBarErrorType.Server(e.d.b, null, null, 4));
                return Unit.f24250a;
            } catch (NoProductsException unused3) {
                checkoutProductViewModel2 = checkoutProductViewModel;
                CheckoutContentViewModel.p6(checkoutProductViewModel2, checkoutProductViewModel2.j, CheckoutFullPageErrorState.f);
                return Unit.f24250a;
            } catch (IllegalArgumentException e2) {
                e = e2;
                checkoutProductViewModel2 = checkoutProductViewModel;
                Bark.Companion companion = Bark.f8483a;
                Bark.Barker.c(new ReportOwner(ReportOwner.Squad.h), e, null, 12);
                checkoutProductViewModel2.B6(checkoutProductViewModel2.j, new SnackBarErrorType.Server(null, null, null, 7));
                return Unit.f24250a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.r;
            checkoutProductViewModel = this.q;
            checkoutProductViewModel2 = this.p;
            try {
                ResultKt.b(obj);
            } catch (NoConnectivityException unused4) {
                checkoutProductViewModel2.B6(checkoutProductViewModel2.j, new SnackBarErrorType.Network(1, null));
                return Unit.f24250a;
            } catch (ServerErrorException unused5) {
                checkoutProductViewModel2.B6(checkoutProductViewModel2.j, new SnackBarErrorType.Server(null, null, null, 2));
                return Unit.f24250a;
            } catch (MutationErrorException e3) {
                e = e3;
                checkoutProductViewModel2.B6(checkoutProductViewModel2.j, new SnackBarErrorType.Server(e.d.b, null, null, 4));
                return Unit.f24250a;
            } catch (NoProductsException unused6) {
                CheckoutContentViewModel.p6(checkoutProductViewModel2, checkoutProductViewModel2.j, CheckoutFullPageErrorState.f);
                return Unit.f24250a;
            } catch (IllegalArgumentException e4) {
                e = e4;
                Bark.Companion companion2 = Bark.f8483a;
                Bark.Barker.c(new ReportOwner(ReportOwner.Squad.h), e, null, 12);
                checkoutProductViewModel2.B6(checkoutProductViewModel2.j, new SnackBarErrorType.Server(null, null, null, 7));
                return Unit.f24250a;
            }
        }
        checkoutProductViewModel.y6((Checkout) obj, i != 0);
        return Unit.f24250a;
    }
}
