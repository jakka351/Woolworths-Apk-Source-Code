package me.oriient.internal.services.dataManager.obstaclesPolygonsFinder;

import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataManager.CachedDataStatus;
import me.oriient.internal.services.dataManager.DataSource;
import me.oriient.internal.services.dataManager.obstacles.ObstaclesRepository;

/* loaded from: classes7.dex */
public final class c implements DataSource {

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f25270a = InternalDiKt.getDi().inject(Reflection.f24268a.b(ObstaclesRepository.class));

    @Override // me.oriient.internal.services.dataManager.DataSource
    public final Object getCacheStatus(Object obj, Continuation continuation) {
        return new Outcome.Success(CachedDataStatus.VALID);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // me.oriient.internal.services.dataManager.DataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fetchData(me.oriient.internal.services.dataManager.obstaclesPolygonsFinder.ObstaclesPolygonsFinderFetchData r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof me.oriient.internal.services.dataManager.obstaclesPolygonsFinder.a
            if (r0 == 0) goto L14
            r0 = r11
            me.oriient.internal.services.dataManager.obstaclesPolygonsFinder.a r0 = (me.oriient.internal.services.dataManager.obstaclesPolygonsFinder.a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.d = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            me.oriient.internal.services.dataManager.obstaclesPolygonsFinder.a r0 = new me.oriient.internal.services.dataManager.obstaclesPolygonsFinder.a
            r0.<init>(r9, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r6.d
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            me.oriient.internal.services.dataManager.obstaclesPolygonsFinder.ObstaclesPolygonsFinderFetchData r10 = r6.f25268a
            kotlin.ResultKt.b(r11)
            goto L57
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            kotlin.ResultKt.b(r11)
            kotlin.Lazy r11 = r9.f25270a
            java.lang.Object r11 = r11.getD()
            r1 = r11
            me.oriient.internal.services.dataManager.obstacles.ObstaclesRepository r1 = (me.oriient.internal.services.dataManager.obstacles.ObstaclesRepository) r1
            r11 = r2
            java.lang.String r2 = r10.getBuildingId()
            java.lang.String r3 = r10.getFloorId()
            r6.f25268a = r10
            r6.d = r11
            r7 = 4
            r8 = 0
            r4 = 0
            java.lang.Object r11 = me.oriient.internal.services.dataManager.obstacles.ObstaclesRepository.DefaultImpls.getObstacles$default(r1, r2, r3, r4, r6, r7, r8)
            if (r11 != r0) goto L57
            return r0
        L57:
            me.oriient.internal.infra.utils.core.Outcome r11 = (me.oriient.internal.infra.utils.core.Outcome) r11
            me.oriient.internal.services.dataManager.obstaclesPolygonsFinder.b r0 = new me.oriient.internal.services.dataManager.obstaclesPolygonsFinder.b
            r0.<init>(r10)
            me.oriient.internal.infra.utils.core.Outcome r10 = r11.map(r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.obstaclesPolygonsFinder.c.fetchData(me.oriient.internal.services.dataManager.obstaclesPolygonsFinder.ObstaclesPolygonsFinderFetchData, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
