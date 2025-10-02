package au.com.woolworths.shop.checkout.ui.fulfilmentwindows;

import au.com.woolworths.shop.checkout.domain.model.FulfilmentExtraInfo;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsContract;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsViewModel$showFeesBottomSheet$1$1", f = "FulfilmentWindowsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FulfilmentWindowsViewModel$showFeesBottomSheet$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ FulfilmentWindowsViewModel p;
    public final /* synthetic */ FulfilmentExtraInfo q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FulfilmentWindowsViewModel$showFeesBottomSheet$1$1(FulfilmentWindowsViewModel fulfilmentWindowsViewModel, FulfilmentExtraInfo fulfilmentExtraInfo, Continuation continuation) {
        super(2, continuation);
        this.p = fulfilmentWindowsViewModel;
        this.q = fulfilmentExtraInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FulfilmentWindowsViewModel$showFeesBottomSheet$1$1(this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        FulfilmentWindowsViewModel$showFeesBottomSheet$1$1 fulfilmentWindowsViewModel$showFeesBottomSheet$1$1 = (FulfilmentWindowsViewModel$showFeesBottomSheet$1$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        fulfilmentWindowsViewModel$showFeesBottomSheet$1$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        this.p.m.f(new FulfilmentWindowsContract.Actions.LaunchFulfilmentFeesBottomSheet(this.q));
        return Unit.f24250a;
    }
}
