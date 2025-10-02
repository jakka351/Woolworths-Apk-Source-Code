package me.oriient.navigation.ondevice;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.services.dataManager.building.BuildingRepository;

/* renamed from: me.oriient.navigation.ondevice.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1794j extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26289a;
    public final /* synthetic */ o b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1794j(o oVar, String str, Continuation continuation) {
        super(2, continuation);
        this.b = oVar;
        this.c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1794j(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1794j(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26289a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        BuildingRepository buildingRepository = (BuildingRepository) this.b.c.getD();
        String str = this.c;
        this.f26289a = 1;
        Object objFetchBuilding = buildingRepository.fetchBuilding(str, this);
        return objFetchBuilding == coroutineSingletons ? coroutineSingletons : objFetchBuilding;
    }
}
