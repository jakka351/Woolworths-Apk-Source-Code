package au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan;

import au.com.woolworths.feature.rewards.everydayextras.signup.data.chooseplan.EverydayExtrasChoosePlanFeed;
import au.com.woolworths.rewards.graphql.type.EverydayExtraPageName;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/chooseplan/EverydayExtrasChoosePlanFeed;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.EverydayExtraChoosePlanViewModel$fetchChoosePlanFeed$1", f = "EverydayExtraChoosePlanViewModel.kt", l = {53}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class EverydayExtraChoosePlanViewModel$fetchChoosePlanFeed$1 extends SuspendLambda implements Function1<Continuation<? super EverydayExtrasChoosePlanFeed>, Object> {
    public int p;
    public final /* synthetic */ EverydayExtraChoosePlanViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EverydayExtraChoosePlanViewModel$fetchChoosePlanFeed$1(EverydayExtraChoosePlanViewModel everydayExtraChoosePlanViewModel, Continuation continuation) {
        super(1, continuation);
        this.q = everydayExtraChoosePlanViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new EverydayExtraChoosePlanViewModel$fetchChoosePlanFeed$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((EverydayExtraChoosePlanViewModel$fetchChoosePlanFeed$1) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        EverydayExtraChoosePlanInteractorImpl everydayExtraChoosePlanInteractorImpl = this.q.f;
        this.p = 1;
        Object objA = everydayExtraChoosePlanInteractorImpl.f6072a.a(EverydayExtraPageName.g, everydayExtraChoosePlanInteractorImpl.b.a(), this);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
