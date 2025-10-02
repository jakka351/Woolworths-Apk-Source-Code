package au.com.woolworths.shop.checkout.ui.summary;

import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.shop.checkout.data.source.MutationErrorException;
import au.com.woolworths.shop.checkout.data.source.NoProductsException;
import au.com.woolworths.shop.checkout.domain.model.Checkout;
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
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.summary.CheckoutSummaryViewModel$onRemovePromoCode$1", f = "CheckoutSummaryViewModel.kt", l = {575}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class CheckoutSummaryViewModel$onRemovePromoCode$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public CheckoutSummaryViewModel p;
    public CheckoutSummaryViewModel q;
    public int r;
    public int s;
    public final /* synthetic */ CheckoutSummaryViewModel t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutSummaryViewModel$onRemovePromoCode$1(CheckoutSummaryViewModel checkoutSummaryViewModel, Continuation continuation) {
        super(2, continuation);
        this.t = checkoutSummaryViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckoutSummaryViewModel$onRemovePromoCode$1(this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckoutSummaryViewModel$onRemovePromoCode$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        CheckoutSummaryViewModel checkoutSummaryViewModel;
        CheckoutSummaryViewModel checkoutSummaryViewModel2;
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i2 = this.s;
        if (i2 == 0) {
            ResultKt.b(obj);
            checkoutSummaryViewModel = this.t;
            CheckoutContentViewModel.A6(checkoutSummaryViewModel.j, true);
            try {
                CheckoutSummaryInteractor checkoutSummaryInteractor = checkoutSummaryViewModel.o;
                this.p = checkoutSummaryViewModel;
                this.q = checkoutSummaryViewModel;
                this.r = 1;
                this.s = 1;
                obj = checkoutSummaryInteractor.f10823a.q(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                checkoutSummaryViewModel2 = checkoutSummaryViewModel;
                i = 1;
            } catch (NoConnectivityException unused) {
                checkoutSummaryViewModel2 = checkoutSummaryViewModel;
                checkoutSummaryViewModel2.B6(checkoutSummaryViewModel2.j, new SnackBarErrorType.Network(1, null));
                return Unit.f24250a;
            } catch (ServerErrorException unused2) {
                checkoutSummaryViewModel2 = checkoutSummaryViewModel;
                checkoutSummaryViewModel2.B6(checkoutSummaryViewModel2.j, new SnackBarErrorType.Server(null, null, null, 2));
                return Unit.f24250a;
            } catch (MutationErrorException e) {
                e = e;
                checkoutSummaryViewModel2 = checkoutSummaryViewModel;
                checkoutSummaryViewModel2.B6(checkoutSummaryViewModel2.j, new SnackBarErrorType.Server(e.d.b, null, null, 4));
                return Unit.f24250a;
            } catch (NoProductsException unused3) {
                checkoutSummaryViewModel2 = checkoutSummaryViewModel;
                CheckoutContentViewModel.p6(checkoutSummaryViewModel2, checkoutSummaryViewModel2.j, CheckoutFullPageErrorState.f);
                return Unit.f24250a;
            } catch (IllegalArgumentException e2) {
                e = e2;
                checkoutSummaryViewModel2 = checkoutSummaryViewModel;
                Bark.Companion companion = Bark.f8483a;
                Bark.Barker.c(new ReportOwner(ReportOwner.Squad.h), e, null, 12);
                checkoutSummaryViewModel2.B6(checkoutSummaryViewModel2.j, new SnackBarErrorType.Server(null, null, null, 7));
                return Unit.f24250a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.r;
            checkoutSummaryViewModel = this.q;
            checkoutSummaryViewModel2 = this.p;
            try {
                ResultKt.b(obj);
            } catch (NoConnectivityException unused4) {
                checkoutSummaryViewModel2.B6(checkoutSummaryViewModel2.j, new SnackBarErrorType.Network(1, null));
                return Unit.f24250a;
            } catch (ServerErrorException unused5) {
                checkoutSummaryViewModel2.B6(checkoutSummaryViewModel2.j, new SnackBarErrorType.Server(null, null, null, 2));
                return Unit.f24250a;
            } catch (MutationErrorException e3) {
                e = e3;
                checkoutSummaryViewModel2.B6(checkoutSummaryViewModel2.j, new SnackBarErrorType.Server(e.d.b, null, null, 4));
                return Unit.f24250a;
            } catch (NoProductsException unused6) {
                CheckoutContentViewModel.p6(checkoutSummaryViewModel2, checkoutSummaryViewModel2.j, CheckoutFullPageErrorState.f);
                return Unit.f24250a;
            } catch (IllegalArgumentException e4) {
                e = e4;
                Bark.Companion companion2 = Bark.f8483a;
                Bark.Barker.c(new ReportOwner(ReportOwner.Squad.h), e, null, 12);
                checkoutSummaryViewModel2.B6(checkoutSummaryViewModel2.j, new SnackBarErrorType.Server(null, null, null, 7));
                return Unit.f24250a;
            }
        }
        checkoutSummaryViewModel.y6((Checkout) obj, i != 0);
        return Unit.f24250a;
    }
}
