package me.oriient.internal.services.dataManager.plai;

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
public final class F extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25279a;
    public /* synthetic */ Object b;

    public F(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        F f = new F(continuation);
        f.b = obj;
        return f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        F f = new F((Continuation) obj2);
        f.b = (BuildingId) obj;
        return f.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25279a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        BuildingId buildingId = (BuildingId) this.b;
        T t = (T) InternalDiKt.getDi().get(Reflection.f24268a.b(T.class));
        String value = buildingId.getValue();
        this.f25279a = 1;
        Y y = (Y) t;
        Object stringData$default = RestHelper.DefaultImpls.getStringData$default((RestHelper) y.d.getD(), "PlaiRest", ((OriientApiProvider) y.e.getD()).getOriientApi().getPlaiUrl() + "/api/v1/product-locations/" + value, false, X.f25291a, this, 4, null);
        return stringData$default == coroutineSingletons ? coroutineSingletons : stringData$default;
    }
}
