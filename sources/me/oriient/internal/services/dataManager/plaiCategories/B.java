package me.oriient.internal.services.dataManager.plaiCategories;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScopeKt;
import me.oriient.internal.infra.utils.core.InternalError;
import me.oriient.internal.infra.utils.core.OutcomeKt;
import me.oriient.internal.services.dataManager.building.BuildingId;

/* loaded from: classes7.dex */
public final class B extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25319a;
    public /* synthetic */ Object b;
    public final /* synthetic */ D c;
    public final /* synthetic */ BuildingId d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(D d, BuildingId buildingId, Continuation continuation) {
        super(2, continuation);
        this.c = d;
        this.d = buildingId;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        B b = new B(this.c, this.d, continuation);
        b.b = obj;
        return b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((B) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25319a;
        if (i == 0) {
            ResultKt.b(obj);
            List list = (List) this.b;
            if (list.isEmpty()) {
                return OutcomeKt.toOutcomeFailure(new InternalError("Empty response, no floors"));
            }
            A a2 = new A(list, this.c, this.d, null);
            this.f25319a = 1;
            obj = CoroutineScopeKt.c(a2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return OutcomeKt.combine((List) obj);
    }
}
