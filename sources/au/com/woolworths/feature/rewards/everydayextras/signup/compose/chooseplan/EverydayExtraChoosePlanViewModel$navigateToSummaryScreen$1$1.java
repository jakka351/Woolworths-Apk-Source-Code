package au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan;

import au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasSignUpInteractor;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.chooseplan.EverydayExtrasChoosePlanContentItem;
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
@DebugMetadata(c = "au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.EverydayExtraChoosePlanViewModel$navigateToSummaryScreen$1$1", f = "EverydayExtraChoosePlanViewModel.kt", l = {201}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class EverydayExtraChoosePlanViewModel$navigateToSummaryScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ EverydayExtraChoosePlanViewModel q;
    public final /* synthetic */ EverydayExtrasChoosePlanContentItem.SubscribePlan r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EverydayExtraChoosePlanViewModel$navigateToSummaryScreen$1$1(EverydayExtraChoosePlanViewModel everydayExtraChoosePlanViewModel, EverydayExtrasChoosePlanContentItem.SubscribePlan subscribePlan, Continuation continuation) {
        super(2, continuation);
        this.q = everydayExtraChoosePlanViewModel;
        this.r = subscribePlan;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EverydayExtraChoosePlanViewModel$navigateToSummaryScreen$1$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((EverydayExtraChoosePlanViewModel$navigateToSummaryScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        Unit unit = Unit.f24250a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        EverydayExtrasSignUpInteractor everydayExtrasSignUpInteractor = this.q.e;
        String str = this.r.d;
        this.p = 1;
        Object objZ = everydayExtrasSignUpInteractor.b.z(new EverydayExtrasSignUpInteractor.Event.NavigateToSummary(str), this);
        if (objZ != coroutineSingletons) {
            objZ = unit;
        }
        return objZ == coroutineSingletons ? coroutineSingletons : unit;
    }
}
