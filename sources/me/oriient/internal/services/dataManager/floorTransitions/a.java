package me.oriient.internal.services.dataManager.floorTransitions;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.rest.OriientApiProvider;
import me.oriient.internal.services.dataManager.building.BuildingId;
import me.oriient.internal.services.dataManager.rest.RestHelper;

/* loaded from: classes7.dex */
public final class a extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25174a;
    public /* synthetic */ Object b;

    public a(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        a aVar = new a(continuation);
        aVar.b = obj;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = new a((Continuation) obj2);
        aVar.b = (BuildingId) obj;
        return aVar.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25174a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        BuildingId buildingId = (BuildingId) this.b;
        e eVar = (e) InternalDiKt.getDi().get(Reflection.f24268a.b(e.class));
        this.f25174a = 1;
        h hVar = (h) eVar;
        Object stringData$default = RestHelper.DefaultImpls.getStringData$default((RestHelper) hVar.b.getD(), "FloorTransitionsRest", ((OriientApiProvider) hVar.f25178a.getD()).getOriientApi().getApiUrl() + "/v3/buildings/" + buildingId.getValue() + "/transitions", false, g.f25177a, this, 4, null);
        return stringData$default == coroutineSingletons ? coroutineSingletons : stringData$default;
    }
}
