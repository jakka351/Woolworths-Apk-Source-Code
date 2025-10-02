package au.com.woolworths.feature.rewards.offers.points.ui;

import au.com.woolworths.feature.rewards.offers.RewardsHomeBridgeViewModel;
import au.com.woolworths.feature.rewards.offers.points.RewardsPointsContract;
import au.com.woolworths.feature.rewards.offers.points.RewardsPointsViewModel;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.offers.points.ui.PointsScreenKt$PointsScreen$3$1", f = "PointsScreen.kt", l = {98}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PointsScreenKt$PointsScreen$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ RewardsHomeBridgeViewModel q;
    public final /* synthetic */ RewardsPointsViewModel r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointsScreenKt$PointsScreen$3$1(RewardsHomeBridgeViewModel rewardsHomeBridgeViewModel, RewardsPointsViewModel rewardsPointsViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = rewardsHomeBridgeViewModel;
        this.r = rewardsPointsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PointsScreenKt$PointsScreen$3$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((PointsScreenKt$PointsScreen$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        return CoroutineSingletons.d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            SharedFlow sharedFlow = this.q.j;
            final RewardsPointsViewModel rewardsPointsViewModel = this.r;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.rewards.offers.points.ui.PointsScreenKt$PointsScreen$3$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    String sectionId = (String) obj2;
                    RewardsPointsViewModel rewardsPointsViewModel2 = rewardsPointsViewModel;
                    rewardsPointsViewModel2.getClass();
                    Intrinsics.h(sectionId, "sectionId");
                    if (((RewardsPointsContract.ViewState) rewardsPointsViewModel2.A.getValue()).e == null) {
                        rewardsPointsViewModel2.C = sectionId;
                    } else {
                        rewardsPointsViewModel2.s6(sectionId);
                    }
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            if (sharedFlow.collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
