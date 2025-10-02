package me.oriient.internal.services.dataManager.building;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.rest.OriientApiProvider;
import me.oriient.internal.infra.utils.core.AuthError;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.auth.AuthManager;
import me.oriient.internal.services.auth.Credentials;
import me.oriient.internal.services.dataManager.rest.RestHelper;

/* renamed from: me.oriient.internal.services.dataManager.building.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1233a extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25098a;
    public /* synthetic */ Object b;

    public C1233a(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C1233a c1233a = new C1233a(continuation);
        c1233a.b = obj;
        return c1233a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C1233a c1233a = new C1233a((Continuation) obj2);
        c1233a.b = (BuildingId) obj;
        return c1233a.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String spaceId;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25098a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        BuildingId buildingId = (BuildingId) this.b;
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        Credentials credentials = (Credentials) ((AuthManager) di.get(reflectionFactory.b(AuthManager.class))).getCredentials().getValue();
        if (credentials == null || (spaceId = credentials.getSpaceId()) == null) {
            return new Outcome.Failure(new AuthError());
        }
        w wVar = (w) InternalDiKt.getDi().get(reflectionFactory.b(w.class));
        this.f25098a = 1;
        D d = (D) wVar;
        Object stringData$default = RestHelper.DefaultImpls.getStringData$default((RestHelper) d.b.getD(), "BuildingRest", ((OriientApiProvider) d.f25093a.getD()).getOriientApi().getRealtimeUrl() + "/v8/buildings/" + buildingId.getValue() + "?includeEntrances=true&includeExternalRegions=true&includeKiosks=true", false, new y(spaceId), this, 4, null);
        return stringData$default == coroutineSingletons ? coroutineSingletons : stringData$default;
    }
}
