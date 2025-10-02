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
import java.util.ArrayList;
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
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.product.CheckoutProductViewModel$onUpdateSubstitution$1$1", f = "CheckoutProductViewModel.kt", l = {221}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class CheckoutProductViewModel$onUpdateSubstitution$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public CheckoutProductViewModel p;
    public CheckoutProductViewModel q;
    public int r;
    public int s;
    public final /* synthetic */ CheckoutProductViewModel t;
    public final /* synthetic */ ArrayList u;
    public final /* synthetic */ boolean v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutProductViewModel$onUpdateSubstitution$1$1(CheckoutProductViewModel checkoutProductViewModel, ArrayList arrayList, boolean z, Continuation continuation) {
        super(2, continuation);
        this.t = checkoutProductViewModel;
        this.u = arrayList;
        this.v = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckoutProductViewModel$onUpdateSubstitution$1$1(this.t, this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckoutProductViewModel$onUpdateSubstitution$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        CheckoutProductViewModel checkoutProductViewModel;
        int i;
        CheckoutProductViewModel checkoutProductViewModel2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i2 = this.s;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                ArrayList arrayList = this.u;
                boolean z = this.v;
                checkoutProductViewModel = this.t;
                CheckoutContentViewModel.A6(checkoutProductViewModel.j, true);
                CheckoutContentInteractor checkoutContentInteractor = checkoutProductViewModel.o;
                this.p = checkoutProductViewModel;
                this.q = checkoutProductViewModel;
                this.r = 1;
                this.s = 1;
                obj = checkoutContentInteractor.d(arrayList, z, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                i = 1;
                checkoutProductViewModel2 = checkoutProductViewModel;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.r;
                checkoutProductViewModel2 = this.q;
                checkoutProductViewModel = this.p;
                ResultKt.b(obj);
            }
            checkoutProductViewModel2.y6((Checkout) obj, i != 0);
        } catch (NoConnectivityException unused) {
            checkoutProductViewModel.B6(checkoutProductViewModel.j, new SnackBarErrorType.Network(1, null));
        } catch (ServerErrorException unused2) {
            checkoutProductViewModel.B6(checkoutProductViewModel.j, new SnackBarErrorType.Server(null, null, null, 2));
        } catch (MutationErrorException e) {
            checkoutProductViewModel.B6(checkoutProductViewModel.j, new SnackBarErrorType.Server(e.d.b, null, null, 4));
        } catch (NoProductsException unused3) {
            CheckoutContentViewModel.p6(checkoutProductViewModel, checkoutProductViewModel.j, CheckoutFullPageErrorState.f);
        } catch (IllegalArgumentException e2) {
            Bark.Companion companion = Bark.f8483a;
            Bark.Barker.c(new ReportOwner(ReportOwner.Squad.h), e2, null, 12);
            checkoutProductViewModel.B6(checkoutProductViewModel.j, new SnackBarErrorType.Server(null, null, null, 7));
        }
        return Unit.f24250a;
    }
}
