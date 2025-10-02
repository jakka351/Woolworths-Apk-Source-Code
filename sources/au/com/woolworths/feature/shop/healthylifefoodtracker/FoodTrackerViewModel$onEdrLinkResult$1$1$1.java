package au.com.woolworths.feature.shop.healthylifefoodtracker;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.bouncycastle.math.Primes;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.healthylifefoodtracker.FoodTrackerViewModel$onEdrLinkResult$1$1$1", f = "FoodTrackerViewModel.kt", l = {Primes.SMALL_FACTOR_LIMIT}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FoodTrackerViewModel$onEdrLinkResult$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ FoodTrackerViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoodTrackerViewModel$onEdrLinkResult$1$1$1(FoodTrackerViewModel foodTrackerViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = foodTrackerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FoodTrackerViewModel$onEdrLinkResult$1$1$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FoodTrackerViewModel$onEdrLinkResult$1$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            this.p = 1;
            if (DelayKt.b(500L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        FoodTrackerViewModel foodTrackerViewModel = this.q;
        FoodTrackerViewModel.q6(foodTrackerViewModel, foodTrackerViewModel.h, false, null, null, null, null, null, true, 63);
        return Unit.f24250a;
    }
}
