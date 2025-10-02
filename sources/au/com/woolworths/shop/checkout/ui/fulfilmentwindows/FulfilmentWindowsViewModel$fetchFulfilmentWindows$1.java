package au.com.woolworths.shop.checkout.ui.fulfilmentwindows;

import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindows;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentInteractor;
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
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsViewModel$fetchFulfilmentWindows$1", f = "FulfilmentWindowsViewModel.kt", l = {86}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class FulfilmentWindowsViewModel$fetchFulfilmentWindows$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public FulfilmentWindowsViewModel p;
    public FulfilmentWindowsViewModel q;
    public int r;
    public final /* synthetic */ FulfilmentWindowsViewModel s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FulfilmentWindowsViewModel$fetchFulfilmentWindows$1(FulfilmentWindowsViewModel fulfilmentWindowsViewModel, Continuation continuation) {
        super(2, continuation);
        this.s = fulfilmentWindowsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FulfilmentWindowsViewModel$fetchFulfilmentWindows$1(this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FulfilmentWindowsViewModel$fetchFulfilmentWindows$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objH;
        FulfilmentWindowsViewModel fulfilmentWindowsViewModel;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ?? r2 = this.r;
        try {
            if (r2 == 0) {
                ResultKt.b(obj);
                FulfilmentWindowsViewModel fulfilmentWindowsViewModel2 = this.s;
                fulfilmentWindowsViewModel2.v6(fulfilmentWindowsViewModel2.k, true);
                CheckoutContentInteractor checkoutContentInteractor = fulfilmentWindowsViewModel2.e;
                this.p = fulfilmentWindowsViewModel2;
                this.q = fulfilmentWindowsViewModel2;
                this.r = 1;
                objH = checkoutContentInteractor.f10758a.h(this);
                if (objH == coroutineSingletons) {
                    return coroutineSingletons;
                }
                fulfilmentWindowsViewModel = fulfilmentWindowsViewModel2;
                r2 = fulfilmentWindowsViewModel2;
            } else {
                if (r2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fulfilmentWindowsViewModel = this.q;
                FulfilmentWindowsViewModel fulfilmentWindowsViewModel3 = this.p;
                ResultKt.b(obj);
                objH = obj;
                r2 = fulfilmentWindowsViewModel3;
            }
            FulfilmentWindowsViewModel.q6(fulfilmentWindowsViewModel, (FulfilmentWindows) objH);
        } catch (NoConnectivityException unused) {
            FulfilmentWindowsViewModel fulfilmentWindowsViewModel4 = r2;
            FulfilmentWindowErrorState fulfilmentWindowErrorState = FulfilmentWindowErrorState.d;
            fulfilmentWindowsViewModel4.x6(fulfilmentWindowErrorState);
            FulfilmentWindowsViewModel.y6(fulfilmentWindowsViewModel4, fulfilmentWindowsViewModel4.k, null, null, null, null, fulfilmentWindowErrorState, 28);
        } catch (ServerErrorException unused2) {
            FulfilmentWindowsViewModel fulfilmentWindowsViewModel5 = r2;
            FulfilmentWindowErrorState fulfilmentWindowErrorState2 = FulfilmentWindowErrorState.f;
            fulfilmentWindowsViewModel5.x6(fulfilmentWindowErrorState2);
            FulfilmentWindowsViewModel.y6(fulfilmentWindowsViewModel5, fulfilmentWindowsViewModel5.k, null, null, null, null, fulfilmentWindowErrorState2, 28);
        }
        return Unit.f24250a;
    }
}
