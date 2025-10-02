package me.oriient.internal.services.dataManager.buildingCoordinateConverter;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.rest.OriientApiProvider;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataManager.building.BuildingId;
import me.oriient.internal.services.dataManager.rest.RestHelper;

/* loaded from: classes7.dex */
public final class c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25123a;
    public /* synthetic */ Object b;

    public c(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        c cVar = new c(continuation);
        cVar.b = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        c cVar = new c((Continuation) obj2);
        cVar.b = (BuildingId) obj;
        return cVar.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25123a;
        if (i == 0) {
            ResultKt.b(obj);
            BuildingId buildingId = (BuildingId) this.b;
            f fVar = (f) InternalDiKt.getDi().get(Reflection.f24268a.b(f.class));
            this.f25123a = 1;
            i iVar = (i) fVar;
            obj = RestHelper.DefaultImpls.getStringData$default((RestHelper) iVar.b.getD(), "CoordinateConverterRest", ((OriientApiProvider) iVar.f25126a.getD()).getOriientApi().getApiUrl() + "/v4/buildings/" + buildingId.getValue() + "/floors/coordinates-conversion", false, new h(buildingId), this, 4, null);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return ((Outcome) obj).map(b.f25122a);
    }
}
