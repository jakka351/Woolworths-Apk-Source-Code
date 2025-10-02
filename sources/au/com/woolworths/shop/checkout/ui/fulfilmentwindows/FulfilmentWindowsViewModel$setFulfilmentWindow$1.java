package au.com.woolworths.shop.checkout.ui.fulfilmentwindows;

import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.shop.checkout.data.source.MutationErrorException;
import au.com.woolworths.shop.checkout.domain.model.Checkout;
import au.com.woolworths.shop.checkout.domain.model.CollectionMethodOptionModeIdKt;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentSlotSelectionOptionId;
import au.com.woolworths.shop.checkout.domain.model.UpfrontFulfilmentWindowResult;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentInteractor;
import au.com.woolworths.shop.checkout.ui.content.SnackBarErrorType;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsContract;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsViewModel$setFulfilmentWindow$1", f = "FulfilmentWindowsViewModel.kt", l = {248, 254}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class FulfilmentWindowsViewModel$setFulfilmentWindow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public FulfilmentWindowsViewModel p;
    public FulfilmentWindowsViewModel q;
    public int r;
    public final /* synthetic */ FulfilmentWindowsViewModel s;
    public final /* synthetic */ int t;
    public final /* synthetic */ String u;
    public final /* synthetic */ FulfilmentSlotSelectionOptionId v;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[FulfilmentWindowSource.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                FulfilmentWindowSource fulfilmentWindowSource = FulfilmentWindowSource.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FulfilmentWindowsViewModel$setFulfilmentWindow$1(FulfilmentWindowsViewModel fulfilmentWindowsViewModel, int i, String str, FulfilmentSlotSelectionOptionId fulfilmentSlotSelectionOptionId, Continuation continuation) {
        super(2, continuation);
        this.s = fulfilmentWindowsViewModel;
        this.t = i;
        this.u = str;
        this.v = fulfilmentSlotSelectionOptionId;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FulfilmentWindowsViewModel$setFulfilmentWindow$1(this.s, this.t, this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FulfilmentWindowsViewModel$setFulfilmentWindow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        FulfilmentWindowsViewModel fulfilmentWindowsViewModel;
        FulfilmentWindowsViewModel fulfilmentWindowsViewModel2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        FulfilmentWindowsViewModel fulfilmentWindowsViewModel3 = this.r;
        FulfilmentWindowsContract.Actions.DismissWindow dismissWindow = FulfilmentWindowsContract.Actions.DismissWindow.f10779a;
        try {
            if (fulfilmentWindowsViewModel3 == 0) {
                ResultKt.b(obj);
                FulfilmentWindowsViewModel fulfilmentWindowsViewModel4 = this.s;
                fulfilmentWindowsViewModel4.v6(fulfilmentWindowsViewModel4.k, true);
                try {
                    FulfilmentWindowSource fulfilmentWindowSource = fulfilmentWindowsViewModel4.j;
                    CheckoutContentInteractor checkoutContentInteractor = fulfilmentWindowsViewModel4.e;
                    int iOrdinal = fulfilmentWindowSource.ordinal();
                    int i = this.t;
                    String str = this.u;
                    FulfilmentSlotSelectionOptionId fulfilmentSlotSelectionOptionId = this.v;
                    if (iOrdinal == 0) {
                        this.p = fulfilmentWindowsViewModel4;
                        this.q = fulfilmentWindowsViewModel4;
                        this.r = 1;
                        Object objO = checkoutContentInteractor.f10758a.o(i, str, fulfilmentSlotSelectionOptionId, this);
                        if (objO != coroutineSingletons) {
                            fulfilmentWindowsViewModel = fulfilmentWindowsViewModel4;
                            obj = objO;
                            fulfilmentWindowsViewModel.m.f(new FulfilmentWindowsContract.Actions.SelectionComplete((Checkout) obj));
                            fulfilmentWindowsViewModel.m.f(dismissWindow);
                        }
                    } else {
                        if (iOrdinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.p = fulfilmentWindowsViewModel4;
                        this.q = fulfilmentWindowsViewModel4;
                        this.r = 2;
                        Object objL = checkoutContentInteractor.f10758a.l(i, str, fulfilmentSlotSelectionOptionId, this);
                        if (objL != coroutineSingletons) {
                            fulfilmentWindowsViewModel2 = fulfilmentWindowsViewModel4;
                            obj = objL;
                            fulfilmentWindowsViewModel2.g.f(CollectionMethodOptionModeIdKt.a(((UpfrontFulfilmentWindowResult) obj).f10640a));
                            fulfilmentWindowsViewModel2.m.f(dismissWindow);
                        }
                    }
                    return coroutineSingletons;
                } catch (NoConnectivityException unused) {
                    fulfilmentWindowsViewModel3 = fulfilmentWindowsViewModel4;
                    FulfilmentWindowsViewModel.p6(fulfilmentWindowsViewModel3, new SnackBarErrorType.Network(3, null));
                    return Unit.f24250a;
                } catch (ServerErrorException unused2) {
                    fulfilmentWindowsViewModel3 = fulfilmentWindowsViewModel4;
                    FulfilmentWindowsViewModel.p6(fulfilmentWindowsViewModel3, new SnackBarErrorType.Server(null, null, null, 7));
                    return Unit.f24250a;
                } catch (MutationErrorException e) {
                    fulfilmentWindowsViewModel3 = fulfilmentWindowsViewModel4;
                    e = e;
                    FulfilmentWindowsViewModel.p6(fulfilmentWindowsViewModel3, new SnackBarErrorType.Server(e.d.b, null, null, 6));
                    return Unit.f24250a;
                }
            }
            if (fulfilmentWindowsViewModel3 == 1) {
                fulfilmentWindowsViewModel = this.q;
                FulfilmentWindowsViewModel fulfilmentWindowsViewModel5 = this.p;
                ResultKt.b(obj);
                fulfilmentWindowsViewModel.m.f(new FulfilmentWindowsContract.Actions.SelectionComplete((Checkout) obj));
                fulfilmentWindowsViewModel.m.f(dismissWindow);
            } else {
                if (fulfilmentWindowsViewModel3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fulfilmentWindowsViewModel2 = this.q;
                FulfilmentWindowsViewModel fulfilmentWindowsViewModel6 = this.p;
                ResultKt.b(obj);
                fulfilmentWindowsViewModel2.g.f(CollectionMethodOptionModeIdKt.a(((UpfrontFulfilmentWindowResult) obj).f10640a));
                fulfilmentWindowsViewModel2.m.f(dismissWindow);
            }
        } catch (NoConnectivityException unused3) {
        } catch (ServerErrorException unused4) {
        } catch (MutationErrorException e2) {
            e = e2;
        }
        return Unit.f24250a;
    }
}
