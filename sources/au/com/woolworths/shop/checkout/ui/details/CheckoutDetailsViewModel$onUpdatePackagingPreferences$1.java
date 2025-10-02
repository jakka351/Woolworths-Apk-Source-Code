package au.com.woolworths.shop.checkout.ui.details;

import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.shop.checkout.data.source.MutationErrorException;
import au.com.woolworths.shop.checkout.data.source.NoProductsException;
import au.com.woolworths.shop.checkout.domain.model.Checkout;
import au.com.woolworths.shop.checkout.domain.model.PackagingMethodOption;
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
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsViewModel$onUpdatePackagingPreferences$1", f = "CheckoutDetailsViewModel.kt", l = {156}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class CheckoutDetailsViewModel$onUpdatePackagingPreferences$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public CheckoutDetailsViewModel p;
    public CheckoutDetailsViewModel q;
    public int r;
    public int s;
    public final /* synthetic */ CheckoutDetailsViewModel t;
    public final /* synthetic */ PackagingMethodOption u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutDetailsViewModel$onUpdatePackagingPreferences$1(CheckoutDetailsViewModel checkoutDetailsViewModel, PackagingMethodOption packagingMethodOption, Continuation continuation) {
        super(2, continuation);
        this.t = checkoutDetailsViewModel;
        this.u = packagingMethodOption;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckoutDetailsViewModel$onUpdatePackagingPreferences$1(this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckoutDetailsViewModel$onUpdatePackagingPreferences$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        CheckoutDetailsViewModel checkoutDetailsViewModel;
        CheckoutDetailsViewModel checkoutDetailsViewModel2;
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i2 = this.s;
        if (i2 == 0) {
            ResultKt.b(obj);
            PackagingMethodOption packagingMethodOption = this.u;
            checkoutDetailsViewModel = this.t;
            CheckoutContentViewModel.A6(checkoutDetailsViewModel.j, true);
            try {
                CheckoutContentInteractor checkoutContentInteractor = checkoutDetailsViewModel.o;
                int i3 = packagingMethodOption.f10624a;
                this.p = checkoutDetailsViewModel;
                this.q = checkoutDetailsViewModel;
                this.r = 1;
                this.s = 1;
                obj = checkoutContentInteractor.f10758a.q(i3, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                checkoutDetailsViewModel2 = checkoutDetailsViewModel;
                i = 1;
            } catch (NoConnectivityException unused) {
                checkoutDetailsViewModel2 = checkoutDetailsViewModel;
                checkoutDetailsViewModel2.B6(checkoutDetailsViewModel2.j, new SnackBarErrorType.Network(1, null));
                return Unit.f24250a;
            } catch (ServerErrorException unused2) {
                checkoutDetailsViewModel2 = checkoutDetailsViewModel;
                checkoutDetailsViewModel2.B6(checkoutDetailsViewModel2.j, new SnackBarErrorType.Server(null, null, null, 2));
                return Unit.f24250a;
            } catch (MutationErrorException e) {
                e = e;
                checkoutDetailsViewModel2 = checkoutDetailsViewModel;
                checkoutDetailsViewModel2.B6(checkoutDetailsViewModel2.j, new SnackBarErrorType.Server(e.d.b, null, null, 4));
                return Unit.f24250a;
            } catch (NoProductsException unused3) {
                checkoutDetailsViewModel2 = checkoutDetailsViewModel;
                CheckoutContentViewModel.p6(checkoutDetailsViewModel2, checkoutDetailsViewModel2.j, CheckoutFullPageErrorState.f);
                return Unit.f24250a;
            } catch (IllegalArgumentException e2) {
                e = e2;
                checkoutDetailsViewModel2 = checkoutDetailsViewModel;
                Bark.Companion companion = Bark.f8483a;
                Bark.Barker.c(new ReportOwner(ReportOwner.Squad.h), e, null, 12);
                checkoutDetailsViewModel2.B6(checkoutDetailsViewModel2.j, new SnackBarErrorType.Server(null, null, null, 7));
                return Unit.f24250a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.r;
            checkoutDetailsViewModel = this.q;
            checkoutDetailsViewModel2 = this.p;
            try {
                ResultKt.b(obj);
            } catch (NoConnectivityException unused4) {
                checkoutDetailsViewModel2.B6(checkoutDetailsViewModel2.j, new SnackBarErrorType.Network(1, null));
                return Unit.f24250a;
            } catch (ServerErrorException unused5) {
                checkoutDetailsViewModel2.B6(checkoutDetailsViewModel2.j, new SnackBarErrorType.Server(null, null, null, 2));
                return Unit.f24250a;
            } catch (MutationErrorException e3) {
                e = e3;
                checkoutDetailsViewModel2.B6(checkoutDetailsViewModel2.j, new SnackBarErrorType.Server(e.d.b, null, null, 4));
                return Unit.f24250a;
            } catch (NoProductsException unused6) {
                CheckoutContentViewModel.p6(checkoutDetailsViewModel2, checkoutDetailsViewModel2.j, CheckoutFullPageErrorState.f);
                return Unit.f24250a;
            } catch (IllegalArgumentException e4) {
                e = e4;
                Bark.Companion companion2 = Bark.f8483a;
                Bark.Barker.c(new ReportOwner(ReportOwner.Squad.h), e, null, 12);
                checkoutDetailsViewModel2.B6(checkoutDetailsViewModel2.j, new SnackBarErrorType.Server(null, null, null, 7));
                return Unit.f24250a;
            }
        }
        checkoutDetailsViewModel.y6((Checkout) obj, i != 0);
        return Unit.f24250a;
    }
}
