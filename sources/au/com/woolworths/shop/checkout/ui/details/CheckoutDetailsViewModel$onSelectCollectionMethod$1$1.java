package au.com.woolworths.shop.checkout.ui.details;

import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.shop.checkout.data.source.MutationErrorException;
import au.com.woolworths.shop.checkout.data.source.NoProductsException;
import au.com.woolworths.shop.checkout.domain.model.Checkout;
import au.com.woolworths.shop.checkout.domain.model.CollectionMethodOption;
import au.com.woolworths.shop.checkout.domain.model.CollectionMethodOptionModeId;
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
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsViewModel$onSelectCollectionMethod$1$1", f = "CheckoutDetailsViewModel.kt", l = {122}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class CheckoutDetailsViewModel$onSelectCollectionMethod$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public CheckoutDetailsViewModel p;
    public CheckoutDetailsViewModel q;
    public int r;
    public final /* synthetic */ CheckoutDetailsViewModel s;
    public final /* synthetic */ CollectionMethodOption t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutDetailsViewModel$onSelectCollectionMethod$1$1(CheckoutDetailsViewModel checkoutDetailsViewModel, CollectionMethodOption collectionMethodOption, int i, Continuation continuation) {
        super(2, continuation);
        this.s = checkoutDetailsViewModel;
        this.t = collectionMethodOption;
        this.u = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckoutDetailsViewModel$onSelectCollectionMethod$1$1(this.s, this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckoutDetailsViewModel$onSelectCollectionMethod$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        CheckoutDetailsViewModel checkoutDetailsViewModel;
        CheckoutDetailsViewModel checkoutDetailsViewModel2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.r;
        if (i == 0) {
            ResultKt.b(obj);
            CollectionMethodOption collectionMethodOption = this.t;
            int i2 = this.u;
            CheckoutDetailsViewModel checkoutDetailsViewModel3 = this.s;
            CheckoutContentViewModel.A6(checkoutDetailsViewModel3.j, true);
            try {
                CheckoutContentInteractor checkoutContentInteractor = checkoutDetailsViewModel3.o;
                CollectionMethodOptionModeId collectionMethodOptionModeId = collectionMethodOption.b;
                this.p = checkoutDetailsViewModel3;
                this.q = checkoutDetailsViewModel3;
                this.r = 1;
                obj = checkoutContentInteractor.f10758a.n(collectionMethodOptionModeId, i2, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                checkoutDetailsViewModel2 = checkoutDetailsViewModel3;
                checkoutDetailsViewModel = checkoutDetailsViewModel2;
            } catch (NoConnectivityException unused) {
                checkoutDetailsViewModel = checkoutDetailsViewModel3;
                checkoutDetailsViewModel.B6(checkoutDetailsViewModel.j, new SnackBarErrorType.Network(1, null));
                return Unit.f24250a;
            } catch (ServerErrorException unused2) {
                checkoutDetailsViewModel = checkoutDetailsViewModel3;
                checkoutDetailsViewModel.B6(checkoutDetailsViewModel.j, new SnackBarErrorType.Server(null, null, null, 2));
                return Unit.f24250a;
            } catch (MutationErrorException e) {
                e = e;
                checkoutDetailsViewModel = checkoutDetailsViewModel3;
                checkoutDetailsViewModel.B6(checkoutDetailsViewModel.j, new SnackBarErrorType.Server(e.d.b, null, null, 4));
                return Unit.f24250a;
            } catch (NoProductsException unused3) {
                checkoutDetailsViewModel = checkoutDetailsViewModel3;
                CheckoutContentViewModel.p6(checkoutDetailsViewModel, checkoutDetailsViewModel.j, CheckoutFullPageErrorState.f);
                return Unit.f24250a;
            } catch (IllegalArgumentException e2) {
                e = e2;
                checkoutDetailsViewModel = checkoutDetailsViewModel3;
                Bark.Companion companion = Bark.f8483a;
                Bark.Barker.c(new ReportOwner(ReportOwner.Squad.h), e, null, 12);
                checkoutDetailsViewModel.B6(checkoutDetailsViewModel.j, new SnackBarErrorType.Server(null, null, null, 7));
                return Unit.f24250a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            checkoutDetailsViewModel2 = this.q;
            checkoutDetailsViewModel = this.p;
            try {
                ResultKt.b(obj);
            } catch (NoConnectivityException unused4) {
                checkoutDetailsViewModel.B6(checkoutDetailsViewModel.j, new SnackBarErrorType.Network(1, null));
                return Unit.f24250a;
            } catch (ServerErrorException unused5) {
                checkoutDetailsViewModel.B6(checkoutDetailsViewModel.j, new SnackBarErrorType.Server(null, null, null, 2));
                return Unit.f24250a;
            } catch (MutationErrorException e3) {
                e = e3;
                checkoutDetailsViewModel.B6(checkoutDetailsViewModel.j, new SnackBarErrorType.Server(e.d.b, null, null, 4));
                return Unit.f24250a;
            } catch (NoProductsException unused6) {
                CheckoutContentViewModel.p6(checkoutDetailsViewModel, checkoutDetailsViewModel.j, CheckoutFullPageErrorState.f);
                return Unit.f24250a;
            } catch (IllegalArgumentException e4) {
                e = e4;
                Bark.Companion companion2 = Bark.f8483a;
                Bark.Barker.c(new ReportOwner(ReportOwner.Squad.h), e, null, 12);
                checkoutDetailsViewModel.B6(checkoutDetailsViewModel.j, new SnackBarErrorType.Server(null, null, null, 7));
                return Unit.f24250a;
            }
        }
        checkoutDetailsViewModel2.y6((Checkout) obj, false);
        return Unit.f24250a;
    }
}
