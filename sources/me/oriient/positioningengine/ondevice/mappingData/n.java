package me.oriient.positioningengine.ondevice.mappingData;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.services.dataManager.floorTransitions.FloorTransitionsRepository;

/* loaded from: classes8.dex */
public final class n extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26442a;
    public final /* synthetic */ w b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(w wVar, String str, Continuation continuation) {
        super(2, continuation);
        this.b = wVar;
        this.c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new n(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new n(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26442a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        FloorTransitionsRepository floorTransitionsRepository = (FloorTransitionsRepository) this.b.b.getD();
        String str = this.c;
        this.f26442a = 1;
        Object objFetchFloorTransitions = floorTransitionsRepository.fetchFloorTransitions(str, this);
        return objFetchFloorTransitions == coroutineSingletons ? coroutineSingletons : objFetchFloorTransitions;
    }
}
