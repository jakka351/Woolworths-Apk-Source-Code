package me.oriient.internal.services.dataManager.floorMetadata;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.di.InternalDiKt;

/* renamed from: me.oriient.internal.services.dataManager.floorMetadata.l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1282l extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25163a;
    public /* synthetic */ Object b;

    public C1282l(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C1282l c1282l = new C1282l(continuation);
        c1282l.b = obj;
        return c1282l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C1282l c1282l = new C1282l((Continuation) obj2);
        c1282l.b = (FloorFetchData) obj;
        return c1282l.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25163a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        FloorFetchData floorFetchData = (FloorFetchData) this.b;
        InterfaceC1288s interfaceC1288s = (InterfaceC1288s) InternalDiKt.getDi().get(Reflection.f24268a.b(InterfaceC1288s.class));
        String buildingId = floorFetchData.getBuildingId();
        String floorId = floorFetchData.getFloorId();
        this.f25163a = 1;
        Object objA = ((C1292w) interfaceC1288s).a(buildingId, floorId, this);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
