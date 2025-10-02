package au.com.woolworths.feature.rewards.offers;

import androidx.activity.result.ActivityResultCaller;
import au.com.woolworths.android.onesite.fragment.HiddenStateEmittable;
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
@DebugMetadata(c = "au.com.woolworths.feature.rewards.offers.RewardsOffersFragmentLegacy$collectParentFragmentHiddenState$1", f = "RewardsOffersFragmentLegacy.kt", l = {158}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RewardsOffersFragmentLegacy$collectParentFragmentHiddenState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ RewardsOffersFragmentLegacy q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsOffersFragmentLegacy$collectParentFragmentHiddenState$1(RewardsOffersFragmentLegacy rewardsOffersFragmentLegacy, Continuation continuation) {
        super(2, continuation);
        this.q = rewardsOffersFragmentLegacy;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RewardsOffersFragmentLegacy$collectParentFragmentHiddenState$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((RewardsOffersFragmentLegacy$collectParentFragmentHiddenState$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        return CoroutineSingletons.d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final RewardsOffersFragmentLegacy rewardsOffersFragmentLegacy = this.q;
            ActivityResultCaller parentFragment = rewardsOffersFragmentLegacy.getParentFragment();
            Intrinsics.f(parentFragment, "null cannot be cast to non-null type au.com.woolworths.android.onesite.fragment.HiddenStateEmittable");
            SharedFlow m = ((HiddenStateEmittable) parentFragment).getM();
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.rewards.offers.RewardsOffersFragmentLegacy$collectParentFragmentHiddenState$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    RewardsOffersFragmentLegacy rewardsOffersFragmentLegacy2 = rewardsOffersFragmentLegacy;
                    rewardsOffersFragmentLegacy2.o = zBooleanValue;
                    if (!zBooleanValue) {
                        RewardsOffersViewModelLegacy rewardsOffersViewModelLegacyQ1 = rewardsOffersFragmentLegacy2.Q1();
                        if (rewardsOffersViewModelLegacyQ1.u) {
                            rewardsOffersViewModelLegacyQ1.t6();
                        }
                    }
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            if (m.collect(flowCollector, this) == coroutineSingletons) {
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
