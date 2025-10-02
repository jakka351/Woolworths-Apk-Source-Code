package me.oriient.positioningengine.ondevice.mappingData;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.services.dataManager.obstacles.ObstaclesRepository;

/* loaded from: classes8.dex */
public final class p extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26444a;
    public final /* synthetic */ w b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ double e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(w wVar, String str, String str2, double d, Continuation continuation) {
        super(2, continuation);
        this.b = wVar;
        this.c = str;
        this.d = str2;
        this.e = d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new p(this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26444a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        ObstaclesRepository obstaclesRepository = (ObstaclesRepository) this.b.e.getD();
        String str = this.c;
        String str2 = this.d;
        double d = this.e;
        this.f26444a = 1;
        Object obstacles = obstaclesRepository.getObstacles(str, str2, d, this);
        return obstacles == coroutineSingletons ? coroutineSingletons : obstacles;
    }
}
