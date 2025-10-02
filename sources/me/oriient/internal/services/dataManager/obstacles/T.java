package me.oriient.internal.services.dataManager.obstacles;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataManager.CachedDataStatus;
import me.oriient.internal.services.dataManager.floorMetadata.FloorImage;
import me.oriient.internal.services.dataManager.floorMetadata.FloorMetadata;

/* loaded from: classes7.dex */
public final class T extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25244a;
    public final /* synthetic */ w b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(w wVar, Continuation continuation) {
        super(2, continuation);
        this.b = wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        T t = new T(this.b, continuation);
        t.f25244a = obj;
        return t;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        T t = new T(this.b, (Continuation) obj2);
        t.f25244a = (FloorMetadata) obj;
        return t.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CachedDataStatus cachedDataStatus;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        FloorImage obstacleMap = ((FloorMetadata) this.f25244a).getObstacleMap();
        boolean z = (obstacleMap != null ? obstacleMap.getVersion() : Integer.MIN_VALUE) == this.b.d.getMapVersion();
        if (z) {
            cachedDataStatus = CachedDataStatus.VALID;
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            cachedDataStatus = CachedDataStatus.INVALID;
        }
        return new Outcome.Success(cachedDataStatus);
    }
}
