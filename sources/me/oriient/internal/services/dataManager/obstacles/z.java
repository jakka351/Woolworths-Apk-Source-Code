package me.oriient.internal.services.dataManager.obstacles;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

/* loaded from: classes7.dex */
public final class z implements ObstaclesRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ObstaclesPriorityLoader f25267a;
    public final InterfaceC1330a b;

    public z(ObstaclesPriorityLoader obstaclesPriorityLoader, InterfaceC1330a obstaclesCache) {
        Intrinsics.h(obstaclesPriorityLoader, "obstaclesPriorityLoader");
        Intrinsics.h(obstaclesCache, "obstaclesCache");
        this.f25267a = obstaclesPriorityLoader;
        this.b = obstaclesCache;
    }

    @Override // me.oriient.internal.services.dataManager.obstacles.ObstaclesRepository
    public final Object cleanData(String str, Continuation continuation) {
        C1348t c1348t = (C1348t) ((InterfaceC1333d) ((C1332c) this.b).f25247a.getD());
        c1348t.getClass();
        BuildersKt.c(c1348t.f25262a, null, null, new C1343n(new C1340k(c1348t, str), c1348t, null), 3);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return Unit.f24250a;
    }

    @Override // me.oriient.internal.services.dataManager.obstacles.ObstaclesRepository
    public final Object cleanExpiredData(double d, Continuation continuation) {
        C1348t c1348t = (C1348t) ((InterfaceC1333d) ((C1332c) this.b).f25247a.getD());
        c1348t.getClass();
        BuildersKt.c(c1348t.f25262a, null, null, new C1343n(new C1336g(c1348t, d), c1348t, null), 3);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return Unit.f24250a;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // me.oriient.internal.services.dataManager.obstacles.ObstaclesRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getObstacles(java.lang.String r10, java.lang.String r11, double r12, kotlin.coroutines.Continuation r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof me.oriient.internal.services.dataManager.obstacles.x
            if (r0 == 0) goto L14
            r0 = r14
            me.oriient.internal.services.dataManager.obstacles.x r0 = (me.oriient.internal.services.dataManager.obstacles.x) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            me.oriient.internal.services.dataManager.obstacles.x r0 = new me.oriient.internal.services.dataManager.obstacles.x
            r0.<init>(r9, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f25265a
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            kotlin.ResultKt.b(r14)
            goto L49
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            kotlin.ResultKt.b(r14)
            r14 = r2
            me.oriient.internal.services.dataManager.obstacles.u r2 = new me.oriient.internal.services.dataManager.obstacles.u
            r2.<init>(r10, r11)
            me.oriient.internal.services.dataManager.obstacles.ObstaclesPriorityLoader r1 = r9.f25267a
            r6.c = r14
            r7 = 4
            r8 = 0
            r5 = 0
            r3 = r12
            java.lang.Object r14 = me.oriient.internal.services.dataPriorityLoader.DataPriorityLoader.DefaultImpls.loadData$default(r1, r2, r3, r5, r6, r7, r8)
            if (r14 != r0) goto L49
            return r0
        L49:
            me.oriient.internal.infra.utils.core.Outcome r14 = (me.oriient.internal.infra.utils.core.Outcome) r14
            me.oriient.internal.services.dataManager.obstacles.y r10 = me.oriient.internal.services.dataManager.obstacles.y.f25266a
            me.oriient.internal.infra.utils.core.Outcome r10 = r14.map(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.obstacles.z.getObstacles(java.lang.String, java.lang.String, double, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // me.oriient.internal.services.dataManager.obstacles.ObstaclesRepository
    public final Object cleanData(Continuation continuation) {
        Object objClean = ((C1332c) this.b).clean(continuation);
        return objClean == CoroutineSingletons.d ? objClean : Unit.f24250a;
    }
}
