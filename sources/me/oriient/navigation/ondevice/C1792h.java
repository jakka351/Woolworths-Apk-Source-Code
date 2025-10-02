package me.oriient.navigation.ondevice;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataManager.building.Floor;
import me.oriient.internal.services.dataManager.obstacles.ObstaclesRepository;

/* renamed from: me.oriient.navigation.ondevice.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1792h extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26287a;
    public final /* synthetic */ o b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Floor d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1792h(o oVar, String str, Floor floor, Continuation continuation) {
        super(2, continuation);
        this.b = oVar;
        this.c = str;
        this.d = floor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1792h(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1792h) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C1792h c1792h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26287a;
        if (i == 0) {
            ResultKt.b(obj);
            ObstaclesRepository obstaclesRepository = (ObstaclesRepository) this.b.f.getD();
            String str = this.c;
            String id = this.d.getId();
            this.f26287a = 1;
            c1792h = this;
            obj = ObstaclesRepository.DefaultImpls.getObstacles$default(obstaclesRepository, str, id, 0.0d, c1792h, 4, null);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            c1792h = this;
        }
        return ((Outcome) obj).mapFailure(C1790f.f26285a).map(new C1791g(c1792h.c, c1792h.d));
    }
}
