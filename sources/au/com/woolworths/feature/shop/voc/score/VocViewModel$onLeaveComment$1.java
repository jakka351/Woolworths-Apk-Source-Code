package au.com.woolworths.feature.shop.voc.score;

import au.com.woolworths.feature.shop.voc.score.VocContract;
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
@DebugMetadata(c = "au.com.woolworths.feature.shop.voc.score.VocViewModel$onLeaveComment$1", f = "VocViewModel.kt", l = {234}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class VocViewModel$onLeaveComment$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ VocViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocViewModel$onLeaveComment$1(VocViewModel vocViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = vocViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VocViewModel$onLeaveComment$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((VocViewModel$onLeaveComment$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            VocViewModel vocViewModel = this.q;
            VocContract.ViewState viewStateA = VocContract.ViewState.a((VocContract.ViewState) vocViewModel.h.getValue(), false, false, false, false, false, 0, null, null, null, null, null, 4094);
            this.p = 1;
            if (VocViewModel.p6(vocViewModel, viewStateA, 500L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
