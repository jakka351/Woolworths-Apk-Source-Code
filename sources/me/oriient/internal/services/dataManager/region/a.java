package me.oriient.internal.services.dataManager.region;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.services.dataManager.building.BuildingId;

/* loaded from: classes7.dex */
public final class a extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25392a;
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
        int i = this.f25392a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        BuildingId buildingId = (BuildingId) this.b;
        RegionRest regionRest = (RegionRest) InternalDiKt.getDi().get(Reflection.f24268a.b(RegionRest.class));
        this.f25392a = 1;
        Object objFetchRegions = regionRest.fetchRegions(buildingId, this);
        return objFetchRegions == coroutineSingletons ? coroutineSingletons : objFetchRegions;
    }
}
